package com.helper;

public class EmailBody {
	private static String content1 = "Hello ";
	private static String content2 = "<br><br> Hope You are Doing Greate.!";
	private static String content3 = "<br><br> We <mark> ";
	private static String content4 = " </mark>Have Selected you on the basis of "
			+ "your Skill set  and scheduling <mark> Face To Face Interview on comming sunday on 10:00 AM </mark> "
			+ "<br> so please be on time";
	private static String content5 = "<br><br> Thanks and Regards <br>";
	private static String content6 = "<br> Recruiter ";

	public static String generate(UserModel recruiter, UserModel candidate) {
		// TODO Auto-generated constructor stub
		return content1 + candidate.getFname() + " " + candidate.getLname()
				+ content2 + content3 + " " + recruiter.getCompany() + content4
				+ content5 + recruiter.getFname() + " " + recruiter.getLname()
				+ content6+ recruiter.getCompany();
	}
}
