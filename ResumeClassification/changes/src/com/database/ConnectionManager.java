/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.constant.ServerConstants;
import com.helper.DBUtils;
import com.helper.EmailBody;
import com.helper.JobModel;
import com.helper.MailUtility;
import com.helper.StringHelper;
import com.helper.TestFileDemo;
import com.helper.UserModel;
import com.helper.StudentModel;
import com.helper.CallServer;

import org.apache.catalina.Session;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.lang3.StringUtils;

public class ConnectionManager extends DBUtils {

	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			Class.forName(ServerConstants.db_driver);
			conn = DriverManager.getConnection(ServerConstants.db_url,
					ServerConstants.db_user, ServerConstants.db_pwd);
			System.out.println("Got Connection");
		} catch (SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(
					null,
					"Please start the mysql Service from XAMPP Console.\n"
							+ ex.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static UserModel checkLogin(HashMap parameters) {
		String emailId = StringHelper.n2s(parameters.get("email"));
		String pass = StringHelper.n2s(parameters.get("password"));
		System.out.println("EmailId :" + emailId + " and password :" + pass);
		String query = "select * from useraccounts where email like ? and password like ?";
		UserModel um = null;
		List list = DBUtils.getBeanList(UserModel.class, query, emailId, pass);
		System.out.println("size:" + list.size());

		if (list.size() > 0) {
			um = (UserModel) list.get(0);
			System.out.println("Here in" + (UserModel) list.get(0));
		}
		System.out.println("Here out:" + list.size());
		System.out.println("um::" + um);
		return um;
	}

	public static String registerNewRecruiter(HashMap parameters) {
		// id, name, email, contact, username, password
		System.out.println("Parameters :" + parameters);
		String success = "";

		System.out.println(parameters);
		String role = "1";
		String fname = StringHelper.n2s(parameters.get("fname"));
		String lname = StringHelper.n2s(parameters.get("lname"));
		String phone = StringHelper.n2s(parameters.get("phone"));
		String emailid = StringHelper.n2s(parameters.get("email"));
		String pwd = StringHelper.n2s(parameters.get("password"));
		String cname = StringHelper.n2s(parameters.get("cname"));

		String sql = "insert into useraccounts (role,fname,lname,phone,email,password,company) values(?,?,?,?,?,?,?)";
		int list = DBUtils.executeUpdate(sql, role, fname, lname, phone,
				emailid, pwd, cname);
		if (list > 0) {
			success = "1";

		} else {
			success = "Error adding user to database";
		}
		return success;

	}

	public static String sendEmail(HashMap parameters,UserModel recruiter ) {
		String uid = StringHelper.n2s(parameters.get("uid"));
		UserModel candidate = getUserDetails(uid);
		String emailBody = EmailBody.generate(recruiter, candidate);
		return MailUtility.sendEmail(ServerConstants.EMAIL_FROM_NAME, candidate.getEmail(), emailBody);
		
	}

	public static String sendEmailOnRegistration(String ufname, String ulname, String uemail) {
		String emailBody = "Hello " + ufname+ " " + ulname + ", " + 
							"Welcome to Resume Classification Portal! \n" +
							"You have been registered successfully!";
		return MailUtility.sendEmail(ServerConstants.EMAIL_FROM_NAME, uemail, emailBody);
		
	}
	
	
	public static String registerCandidate(HashMap parameters) {
		// id, name, email, contact, username, password
		System.out.println("Parameters :" + parameters);
		String success = "";

		System.out.println(parameters);
		String role = "2";
		String fname = StringHelper.n2s(parameters.get("fname"));
		String lname = StringHelper.n2s(parameters.get("lname"));
		String phone = StringHelper.n2s(parameters.get("phone"));
		String emailid = StringHelper.n2s(parameters.get("email"));
		String pwd = StringHelper.n2s(parameters.get("password"));

		String sql = "insert into useraccounts (role,fname,lname,phone,email,password) values(?,?,?,?,?,?)";
		int list = DBUtils.executeUpdate(sql, role, fname, lname, phone,
				emailid, pwd);
		if (list > 0) {
			success = "1";
			sendEmailOnRegistration(fname, lname, emailid);

		} else {
			success = "Error adding user to database";
		}
		return success;

	}

	public static String insertskills(HashMap parameters) {
		System.out.println("Parameters :" + parameters);
		String success = "";

		String uid = StringHelper.n2s(parameters.get("uid"));
		String skills = StringHelper.n2s(parameters.get("skills"));

		String sql = "insert into studentskills (uid,skills) values(?,?)";
		int list = DBUtils.executeUpdate(sql, uid, skills);
		if (list > 0) {
			success = "1";

		} else {
			success = "Error adding user to database";
		}

		return success;
	}

	public static String insertJob(HashMap parameters) {
		// id, name, email, contact, username, password
		System.out.println("Parameters :" + parameters);
		String success = "";

		System.out.println(parameters);
		String uid = "";
		String jobtitle = StringHelper.n2s(parameters.get("jobtitle"));
		String exp = StringHelper.n2s(parameters.get("reuireexp"));
		String packag = StringHelper.n2s(parameters.get("package"));
		String skills = StringHelper.n2s(parameters.get("skills"));
		String notice = StringHelper.n2s(parameters.get("notice"));
		String company = StringHelper.n2s(parameters.get("cname"));
		String location = StringHelper.n2s(parameters.get("jlocation"));
		String skillsdomain = StringHelper.n2s(parameters.get("skillsdomain"));

		String sql = "insert into jobdetails (uid,jobtitle,experiencerequired,packag,skillsrequired,noticeperiod,companeyname,location,skillsdomain) values(?,?,?,?,?,?,?,?,?)";
		int list = DBUtils.executeUpdate(sql, uid, jobtitle, exp, packag,
				skills, notice, company, location, skillsdomain);
		if (list > 0) {
			success = "1";

		} else {
			success = "Error adding user to database";
		}
		return success;

	}

	public static String applyJob(HashMap parameters) {
		String status = "";
		String uid = StringHelper.n2s(parameters.get("uid"));
		String jid = StringHelper.n2s(parameters.get("jid"));

		// String sql
		// ="update jobdetails set appliedcandidated =? where jid= ?";
		String sql = "update jobdetails set appliedcandidated = concat(appliedcandidated,"
				+ uid + ",',') where jid= ?";
		int list = DBUtils.executeUpdate(sql, jid);
		if (list > 0) {
			status = "Applied Successfully";

		} else {
			status = "Error to apply job";
		}
		return status;
	}

	public static int getJobAppliedCount(String jobId) {
		String query = "select * from jobdetails where jid = ?";
		int count = 0;
		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query, jobId);
		if (list != null) {
			JobModel um = (JobModel) list.get(0);
			String applied = StringHelper.n2s(um.getAppliedcandidated());
			count = applied.length() > 0 ? applied.contains(",") ? applied
					.split(",").length - 1 : 1 : 0;

		}
		return count;
	}

	public static List getAppliedCandidates(String jobId) {
		List dataList = new ArrayList();
		System.out.println(jobId + "  **************************");
		String Success = "";
		Map<String, Integer> mapListForScore = new HashMap<String, Integer>();
		String uIds = "";
		String jobSkill[] = null;
		String query = "select * from jobdetails where jid = ?";

		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query, jobId);

		int i = 0;
		if (list == null || list.size() <= 0) {
			return Collections.EMPTY_LIST; // Returns unmodifiable list
		}

		JobModel jm = (JobModel) list.get(i);
		uIds = jm.getAppliedcandidated();

		jobSkill = jm.getSkillsdomain().split(",");
		System.out.println(jm.getSkillsdomain() + "**************************");
		System.out.println("total uids>>  " + uIds + "   >>>> jobSkill "
				+ jobSkill.length + "" + (StringHelper.n2s(jobSkill[0]) == "")
				+ ">>>> jm.getSkillsdomain() " + jm.getSkillsdomain());

		uIds = StringUtils.chop(uIds);
		System.out.println("chop>>" + uIds);

		String sql = "select * from useraccounts where uid in (" + uIds + " )";

		List list1 = DBUtils.getBeanList(UserModel.class, sql);
		dataList.add(list1);
		if (list1 == null) {
			return Collections.EMPTY_LIST; // Returns unmodifiable list
		}
		if (StringHelper.n2s(jobSkill[0]) != "") {
			for (int j = 0; j < list1.size(); j++) {
				UserModel um = (UserModel) list1.get(j);
				String s = "select * from studentskills where uid = ?";
				List sl = DBUtils.getMapList(s, um.getUid());
				if (sl.size() > 0) {

					HashMap map = (HashMap) sl.get(0);
					String score = StringHelper.n2s(map.get("score"));
					for (int k = 0; k < jobSkill.length; k++) {
						if (score.contains(jobSkill[k])) {
							int addition = getAdditionOfDomainWorked(score);
							mapListForScore
									.put(um.getUid(),
											(mapListForScore.get(um.getUid()) == null ? 1
													: (mapListForScore.get(um
															.getUid()) + addition)));
						}
					}

				}

			}
		}
		
		Stream<Map.Entry<String, Integer>> mapListForScore2 = mapListForScore
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
		LinkedHashMap map = new LinkedHashMap();
			  mapListForScore2.forEach((entry) -> map.put(entry.getKey(), entry.getValue()));
//		mapListForScore = mapListForScore
//				.entrySet()
//				.stream()
//				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//				.collect(
//						Collectors.toMap(Map.Entry::getKey,
//								Map.Entry::getValue, (e1, e2) -> e2,
//								LinkedHashMap<String, Integer>::new));

		dataList.add(map);
		System.out.println("map of score " + map);
		return dataList;

	}

	public static void writeBytes(String fileName, byte[] data,
			HttpServletResponse response, boolean isInline) {
		OutputStream output;
		try {
			System.out.println("here 1");
			output = response.getOutputStream();
			System.out.println("Output:" + output);
			System.out.println("Downloading File " + fileName);
			response.setContentType("application/pdf");
			if (fileName != null && fileName.indexOf(".") == -1) {
				System.out.println("here 2");
				fileName = fileName + ".pdf";
				System.out.println("here 3");
			}
			if (isInline) {
				System.out.println("here 4");
				response.setHeader("Content-Disposition", "inline;filename="
						+ fileName);
				System.out.println("here 5");
			} else {
				System.out.println("here 6");
				response.setHeader("Content-Disposition",
						"attachment;filename=" + fileName);
				System.out.println("here 7");
			}

			output.write(data);
			output.close();
			response.getOutputStream().flush();
			response.getOutputStream().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void downloadFile(HashMap parameters, UserModel um,
			HttpServletResponse response, boolean isSHared) {
		String uid = StringHelper.n2s(parameters.get("uid"));
		System.out.println("parameters: " + parameters + ", um: " + um
				+ ", uid: " + uid);

		String inline = StringHelper.n2s(parameters.get("inline"));
		try {
			String filename = "";
			String keystr = "";
			String userId = "";
			if (!isSHared) {

				List<StudentModel> list = ConnectionManager
						.getResumeDetails(uid);
				StudentModel dm = (StudentModel) list.get(0);
				filename = dm.getResumeName();
				// keystr = dm.getAeskey();
				userId = dm.getUid();

			}

			// else {
			// List<StudentModel> list = ConnectionManager
			// .getResumeDetails(uid);
			//
			// StudentModel dm = (StudentModel) list.get(0);
			// filename = dm.getResumeName();
			// // keystr = dm.getAeskey();
			// userId = dm.getUid();
			// }

			// byte[] encdata=dm.getDocData();
			// String filename = dm.getDocName();
			// UserModel signedBy_um =
			// ConnectionManager.getUserNameFromUid(userId);
			// HadoopReaderWriter.readFile(filename);
			byte[] encdata = TestFileDemo
					.readFileDataInByte(ServerConstants.FILE_UPLOAD_PATH + "/"
							+ filename);

			// AES a = new AES();
			// byte[] privateKeyBytes = TestFileDemo.readFileDataInByte(um
			// .getEmail() + "private.bin");
			// String privateKey = new String(privateKeyBytes);
			// RSA rsa = new RSA();

			// String rsaDecNewAESKey = rsa
			// .decryptUsingPrivate(keystr, privateKey);

			// System.out.println(keystr + "   keystr  " + rsaDecNewAESKey);
			// Key key;

			// key = a.generateKey(rsaDecNewAESKey);

			// byte[] dec1 = a.decryptUsingKey(encdata, key);

			writeBytes(uid, encdata, response, true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static StudentModel getSkiils(String Uid) {
		String query = "select * from studentskills where uid = " + Uid + "";

		List<StudentModel> list = DBUtils
				.getBeanList(StudentModel.class, query);
		int i = 0;
		StudentModel sm = null;
		if (list.size() > 0)

		{
			sm = (StudentModel) list.get(i);
		}

		return sm;

	}

	public static List getJobs() {

		String query = "select * from jobdetails";
		// String
		// query="select * from jobdetails j, studentdetails s where s.experience like '% j.experiencerequired %' having s.uid =3;";

		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query);

		return list;
	}

	public static List getJobsOfRec(String uid) {

		String query = "select * from jobdetails where uid='" + uid + "'";
		// String
		// query="select * from jobdetails j, studentdetails s where s.experience like '% j.experiencerequired %' having s.uid =3;";

		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query);

		return list;
	}

	public static List getCandidateAppliedJob(String Uid) {

		String query = "SELECT * FROM jobdetails where appliedcandidated like '%"
				+ Uid + "%'";

		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query);

		if (list == null) {
			return Collections.EMPTY_LIST; // Returns unmodifiable list

		}

		return list;

	}

	public static List getskills() {
		String query = "select s.*, stud.* from studentskills  s, studentdetails stud where s.uid = stud.uid";

		List<StudentModel> list = DBUtils
				.getBeanList(StudentModel.class, query);

		return list;
	}

	public static List getResumeDetails(String uid) {

		String query = "select * from studentdetails where uid like " + uid
				+ " order by sid desc limit 1";

		List<StudentModel> list = DBUtils
				.getBeanList(StudentModel.class, query);

		return list;
	}

	public static List getRecommendation(String uId) {
		String query = "select DISTINCT  skillsrequired from jobdetails where  skillsrequired not in (SELECT skills FROM studentskills where uid="
				+ uId + ")";

		List<JobModel> list = DBUtils.getBeanList(JobModel.class, query);

		return list;
	}

	public static UserModel getUser(String uid) {
		String query = "select * from studentskills where uid like " + uid + "";
		UserModel um = null;
		List<UserModel> list = DBUtils.getBeanList(UserModel.class, query);
		if (list.size() > 0) {
			um = (UserModel) list.get(0);
		}
		return um;
	}

	public static UserModel getUserDetails(String uid) {
		String query = "select * from useraccounts where uid like " + uid + "";
		UserModel um = null;
		List<UserModel> list = DBUtils.getBeanList(UserModel.class, query);
		if (list.size() > 0) {
			um = (UserModel) list.get(0);
		}
		return um;

	}
public static String checkResume(FileItem fi) {
	String returnResult = null;
	try {
		File f = new File(ServerConstants.LOCAL_UPLOAD);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		String fileName = fi.getName();
		System.out.println("Filename: " + fileName);
		System.out.println("Filename splitted " + fileName.split("\\.").toString());
		
		String ext = fileName.split("\\.")[1];
		System.out.println("File extension is : " + ext);
		
		String filename = "";
		
		if(ext.equalsIgnoreCase("pdf")){

			 filename = "temp.pdf";
		
		}else if(ext.equalsIgnoreCase("docx")){

			 filename = "temp.docx";
		
		}else{
			System.err.println("File Type is not as Expected!");
			return "Error Occured in File Type";
		}

		byte[] data = fi.get();
		fi.write(new File(ServerConstants.LOCAL_UPLOAD + "/" + filename));
		
		
		
		
		
		//old original
//		String fileName = fi.getName();
//
//		String filename = "temp.pdf";
//
//		byte[] data = fi.get();
//		fi.write(new File(ServerConstants.LOCAL_UPLOAD + "/" + filename));
		
		
		String result = CallServer.call(filename); 
		System.out.print(result
				+ "-------------------------------------------------");

		String[] op = result.split(";");
		for (int i = 0; i < op.length; i++) {
			op[i] = op[i].replace("]", "");
			op[i] = op[i].replace("[", "");
			op[i] = op[i].replace("'", "");
			System.out.println(op[i]);

		}
		returnResult = op[1];
		return returnResult;
	}catch(Exception e){
		e.printStackTrace();
	}
	return returnResult;
}
	public static String uploadResumeNew(FileItem fi, String uid, String name,
			String role, String degree, String exp, String projectcount,
			String percentege, String location, String designation,
			String cctc, String ectc) {
		String status = "";
		System.out.println("inupload");
		System.out.println(role + ":" + name + ":" + fi.getName());
		try {
			File f = new File(ServerConstants.LOCAL_UPLOAD);
			if (!f.exists()) {
				f.mkdirs();
			}
			String fileName = fi.getName();
			System.out.println("Filename: " + fileName);
			System.out.println("Filename splitted " + fileName.split("\\.").toString());
			
			String ext = fileName.split("\\.")[1];
			System.out.println("File extension is : " + ext);
			
			String filename = "";
			
			if(ext.equalsIgnoreCase("pdf")){

				 filename = uid + ".pdf";
			
			}else if(ext.equalsIgnoreCase("docx")){

				 filename = uid + ".docx";
			
			}else{
				System.err.println("File Type is not as Expected!");
				return "Error Occured in File Type";
			}

			byte[] data = fi.get();
			fi.write(new File(ServerConstants.LOCAL_UPLOAD + "/" + filename));

			String existuIdQuery = "select 1 from studentdetails where uid = "
					+ uid + " ";
			boolean existUserid = DBUtils.dataExists(existuIdQuery);
			if (existUserid) {

				String q = "delete from studentdetails  where uid like '" + uid
						+ "'";
				executeUpdate(q);
			}

			String query = "insert into studentdetails (uid,degree,experience, projectscount, designation, percentage, currentctc, expectedctc, preferedlocations,resumeName) values (?,?,?,?,?,?,?,?,?,?)";
			executeUpdate(query, uid, degree, exp, projectcount, designation,
					percentege, cctc, ectc, location, filename);

			String result = CallServer.call(uid+"."+ext);
			System.out.print(result
					+ "-------------------------------------------------");

			String[] op = result.split(";");
			for (int i = 0; i < op.length; i++) {
				op[i] = op[i].replace("]", "");
				op[i] = op[i].replace("[", "");
				op[i] = op[i].replace("'", "");
				System.out.println(op[i]);

			}
			String score = op[0];
			String skills = op[1];
			/* update resume skills is exist */
			String existQuery = "select 1 from studentskills where uid = "
					+ uid + " ";
			boolean existUid = DBUtils.dataExists(existQuery);
			if (existUid) {

				String q = "update studentskills set skills = " + skills
						+ " and score =" + score + " where uid =" + uid + "";
			}
			/* end */
			else {
				String querySkill = "insert into studentskills(uid, skills, score)values(?,?,?)";
				int list = DBUtils
						.executeUpdate(querySkill, uid, skills, score);
				if (list > 0) {
					status = "Skills Added Successfully";

				} else {
					status = "Error";
				}

				return "Resume Uploaded Successfully!";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String getCsvString(String query) {
		String success = "";
		Connection conn = null;
		ResultSet rs = null;
		StringBuffer sv = new StringBuffer();
		try {
			conn = ConnectionManager.getDBConnection();
			rs = conn.createStatement().executeQuery(query);
			System.out.println("Executing " + query);
			while (rs.next()) {
				success = rs.getString(1);
				sv.append(success + ",");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return sv.toString();
	}

	public static boolean getCount(String uid) {
		int i = DBUtils
				.getMaxValue("SELECT count(sid) as count  FROM `studentdetails` where uid like '"
						+ uid + "';");
		return i > 0;
	}

	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String s = " DE:2 ,DL: 1, NLP: 5,";
		// getAppliedCandidates("12");
		getAdditionOfDomainWorked(s);
	}

	public static int getAdditionOfDomainWorked(String s) {
		// getDBConnection();
		int addition = 0;

		String[] onlyInt = s.replaceAll("[^-?0-9]+", ",").split(",");
		for (String string : onlyInt) {
			addition += StringHelper.n2d(string);
		}
		System.out.println(addition);

		if (addition > 10) {
			return 10;
		} 

		return addition;
		//
	}
}
