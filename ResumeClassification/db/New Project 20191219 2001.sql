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
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jobdetails`
--

/*!40000 ALTER TABLE `jobdetails` DISABLE KEYS */;
INSERT INTO `jobdetails` (`jid`,`uid`,`jobtitle`,`experiencerequired`,`packag`,`skillsrequired`,`noticeperiod`,`companeyname`,`location`,`appliedcandidated`) VALUES 
 (1,'2','Sr. Software Engineer','2 to 5 yrs','6.2 lacs','Data Science, ML,DL','30 Days','Techno IT Solution','Pune',NULL),
 (2,'','Jr. Softwate Tester','1 yr','5 lac','Java, Selinium Testing','15 Days','Veritas','London',NULL);
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
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentdetails`
--

/*!40000 ALTER TABLE `studentdetails` DISABLE KEYS */;
INSERT INTO `studentdetails` (`sid`,`uid`,`degree`,`experience`,`projectscount`,`designation`,`percentage`,`currentctc`,`expectedctc`,`preferedlocations`,`resumeName`) VALUES 
 (1,'','wrgfds','3','3','gdgd','87','45','545','fdgd','.pdf');
/*!40000 ALTER TABLE `studentdetails` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `useraccounts`
--

/*!40000 ALTER TABLE `useraccounts` DISABLE KEYS */;
INSERT INTO `useraccounts` (`uid`,`role`,`fname`,`lname`,`phone`,`email`,`password`,`company`) VALUES 
 (1,'2','','','','','',NULL),
 (2,'2','','','','','',NULL),
 (3,'1','Balkrishna','Samare','8866889928','bs@techit.com','111',''),
 (4,'1','Eshwari','Kulkarni','8866889928','recruiter@techit.com','111',''),
 (5,'1','rahul','dravid','9011210000','dravid.rahul@gmail.com','123','L&T'),
 (6,'2','prakash','Fale','7201213210','prakashpal@gmail.com','123',NULL);
/*!40000 ALTER TABLE `useraccounts` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
