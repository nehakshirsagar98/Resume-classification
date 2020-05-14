package com.constant;

import java.io.File;
import java.util.HashMap;

public class ServerConstants {
	public static final String db_driver = "com.mysql.jdbc.Driver";
	public static final String db_user = "root";
	public static final String db_pwd = "";
	public static final String db_url = "jdbc:mysql://localhost/resumeclassification";
	public static final String ADMIN_EMAIL_ID = "erecruitmentsystem2020@gmail.com";
	public static final String ADMIN_EMAIL_PASS = "NLP@20192020";
	public static final String  url = "http://localhost:5000/";
	public static final int port=5000;
	

	public static final String project_path = "D:\\work\\project\\ResumeClassification";
	public static String TEMP_HOME = "D:/work/project/ResumeClassification/rc/resume/";
	public static final String RESUME_PY = "D:\\work\\project\\ResumeClassification\\rc\\ResumeClassify.py";

	public static final String EMAIL_FROM_NAME = "E Recruitment Team";
	public static final String EMAIL_SUBJECT = "Greeting From E-Recruitment Team";
	public static final String LOCAL_UPLOAD = TEMP_HOME;
	public static final String FILE_UPLOAD_PATH = TEMP_HOME;
	public static final String EMAIL_BODY = "E Recruitment Team";
	static {

		File file = new File(LOCAL_UPLOAD);

	}
	public static String EMAIL_PASS() {
		// TODO Auto-generated method stub
		return ADMIN_EMAIL_PASS;
	}
}
