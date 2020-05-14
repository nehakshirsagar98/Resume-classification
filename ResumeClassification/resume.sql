-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.30-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema resumeclassification
--

CREATE DATABASE IF NOT EXISTS resumeclassification;
USE resumeclassification;

--
-- Definition of table `jobdetails`
--

DROP TABLE IF EXISTS `jobdetails`;
CREATE TABLE `jobdetails` (
  `jid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` varchar(45) NOT NULL,
  `jobtitle` varchar(45) NOT NULL,
  `experiencerequired` varchar(45) NOT NULL,
  `packag` varchar(45) NOT NULL,
  `skillsrequired` varchar(45) NOT NULL,
  `noticeperiod` varchar(45) NOT NULL,
  `companeyname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `appliedcandidated` longtext,
  `skillsdomain` varchar(45) NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jobdetails`
--

/*!40000 ALTER TABLE `jobdetails` DISABLE KEYS */;
INSERT INTO `jobdetails` (`jid`,`uid`,`jobtitle`,`experiencerequired`,`packag`,`skillsrequired`,`noticeperiod`,`companeyname`,`location`,`appliedcandidated`,`skillsdomain`,`time`) VALUES 
 (1,'7','Sr. Software Engineer','2 to 5 yrs','6.2 lacs','Data Science, ML,DL','30 Days','Techno IT Solution','Pune','4,3,1,11,','','2020-03-13 16:35:33'),
 (2,'7','Jr. Softwate Tester','1 yr','5 lac','Java, Selinium Testing','15 Days','Veritas','London','5,3,','','2019-12-24 18:57:27'),
 (3,'7','Sr. Software Engineer','2 to 5 yrs','6.2 lacs','Data Science, ML,DL','30 Days','Techno IT Solution','London','3,','','2019-12-24 18:58:40'),
 (4,'7','Web Designer','1 yr','3 lac','HTML, CSS, JAVA','15 Days','Web It Solution','Pune','1,6,3,','','2019-12-24 18:58:52'),
 (5,'7','Data Sciencetist','1 yr','14 lac','HTML, CSS, JAVA','15 days','Symentec','London','8,2,3,','DL, ML, NLP','2019-12-24 12:44:18'),
 (6,'7','Sr. Software Engineer','2 to 5 yrs','14 lac','HTML, CSS, JAVA','15 days','Tech IT','Pune','8,2,3,','DL, ML, NLP','2019-12-24 19:00:01'),
 (9,'7','Data Sciencetist','fresher','6.2 lacs','Data Science, ML,DL','30 Days','Symentec','Pune',NULL,'DL, ML, NLP','2019-12-24 16:41:31'),
 (12,'7','Sr. Software Engineer','Fresher','1.2 LAC','HTML, CSS, JAVA','Immediate','Technowings','Pune',NULL,'Data Science,Machine Learning,','2019-12-24 16:41:31');
/*!40000 ALTER TABLE `jobdetails` ENABLE KEYS */;


--
-- Definition of table `studentdetails`
--

DROP TABLE IF EXISTS `studentdetails`;
CREATE TABLE `studentdetails` (
  `sid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `experience` varchar(45) DEFAULT NULL,
  `projectscount` varchar(45) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `percentage` varchar(45) NOT NULL,
  `currentctc` varchar(45) DEFAULT NULL,
  `expectedctc` varchar(45) DEFAULT NULL,
  `preferedlocations` varchar(200) NOT NULL,
  `resumeName` longtext NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentdetails`
--

/*!40000 ALTER TABLE `studentdetails` DISABLE KEYS */;
INSERT INTO `studentdetails` (`sid`,`uid`,`degree`,`experience`,`projectscount`,`designation`,`percentage`,`currentctc`,`expectedctc`,`preferedlocations`,`resumeName`,`time`) VALUES 
 (1,'1','wrgfds','3','3','gdgd','87','45','545','fdgd','1.pdf','2019-12-24 11:23:24'),
 (2,'2','MCA','2','4','Sr. Software Engineer','76','3.6 lac','12 lac','London','2.pdf','2019-12-24 11:23:24'),
 (4,'5','Btech','3','3','Sr. Software Engineer','98','3.6 lac','5.6 lac','California','5.pdf','2019-12-24 11:23:24'),
 (5,'6','BE comp','2','5','Project Manager','98','6 lac','10 lac','Pune','6.pdf','2019-12-24 11:23:24'),
 (6,'4','BCA','1','3','Web Designer','65','2 lac','4 lac','Pune','4.pdf','2019-12-24 11:23:24'),
 (12,'3','MCA','2','34','dfgdf','76','343','343','ffgfd','3.pdf','2019-12-24 11:23:24'),
 (13,'11','BE / BTech','Fresher to 1 Year','3','Engg','80','1500000','2000000','pune','11.pdf','2020-03-13 16:34:32');
/*!40000 ALTER TABLE `studentdetails` ENABLE KEYS */;


--
-- Definition of table `studentskills`
--

DROP TABLE IF EXISTS `studentskills`;
CREATE TABLE `studentskills` (
  `skillid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` varchar(45) NOT NULL,
  `skills` varchar(45) NOT NULL,
  `score` varchar(45) NOT NULL,
  PRIMARY KEY (`skillid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentskills`
--

/*!40000 ALTER TABLE `studentskills` DISABLE KEYS */;
INSERT INTO `studentskills` (`skillid`,`uid`,`skills`,`score`) VALUES 
 (1,'1','sql ,nlp, s3, yolo ,',' DE:2 ,DL: 1, NLP: 3,'),
 (2,'2','sql ,nlp, s3, yolo ,',' DE:2 ,DL: 1, NLP: 3,'),
 (3,'3','HTML, CSS, JAVA',' DE:2 ,DL: 1, NLP: 3,'),
 (4,'4','sql ,nlp, s3, yolo ,',' DE:2 ,DL: 1, NLP: 3,'),
 (5,'5','sql ,nlp, s3, yolo ,',' DE:2 ,DL: 1, NLP: 3,'),
 (6,'8','sql, nlp,',' DE:2 ,DL: 1, NLP: 5,'),
 (7,'6','sql, nlp,yolo,',' DE:5 ,DL: 1, NLP: 5,');
/*!40000 ALTER TABLE `studentskills` ENABLE KEYS */;


--
-- Definition of table `useraccounts`
--

DROP TABLE IF EXISTS `useraccounts`;
CREATE TABLE `useraccounts` (
  `uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `useraccounts`
--

/*!40000 ALTER TABLE `useraccounts` DISABLE KEYS */;
INSERT INTO `useraccounts` (`uid`,`role`,`fname`,`lname`,`phone`,`email`,`password`,`company`) VALUES 
 (1,'2','Balkrishna','Samare','8866889928','bs@techit.com','111',''),
 (2,'2','Eshwari','Kulkarni','8866889928','recruiter@techit.com','111',''),
 (3,'2','rahul','dravid','9011210000','dravid.rahul@gmail.com','123','L&T'),
 (4,'2','prakash','Fale','7201213210','prakashpal@gmail.com','123',NULL),
 (5,'2','Seema','Paighab','9898562300','simba@yahoo.com','111','Own Company'),
 (6,'2','Kiaan','Kamble','8525231000','bs@gmail.com','999','TechWEb'),
 (7,'1','Balkrishna','samare','7741055935','bs@gmail.com','123','Techno IT Solution'),
 (8,'2','salman','khan','9898775623','salmankhan@gmail.com','123',NULL),
 (9,'2','krishant','kamble','9898562310','krishant@gmail.com','123',NULL),
 (10,'1','REc','reclast','90909090909','rec@gmail.com','111','reccomp'),
 (11,'2','cand','candlast','1111111111','can@gmail.com','111',NULL);
/*!40000 ALTER TABLE `useraccounts` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
