-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: skndatabase
-- ------------------------------------------------------
-- Server version	9.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stafftable`
--

DROP TABLE IF EXISTS `stafftable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stafftable` (
  `srNumber` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  `joindate` varchar(45) NOT NULL,
  `salary` varchar(45) NOT NULL,
  PRIMARY KEY (`srNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stafftable`
--

LOCK TABLES `stafftable` WRITE;
/*!40000 ALTER TABLE `stafftable` DISABLE KEYS */;
INSERT INTO `stafftable` VALUES (1,'Shruti','Naik','7845652816','Pune','Female','FY','2015-12-13','523000'),(2,'Kajal','Kokate','8755655251','Mumbai','Female','COMP','2012-10-01','555900'),(3,'Rohit','Pawar','8785151515','Nashik','Male','ENTC','2010-08-17','854000'),(4,'Sejal','Deshmukh','8798155526','Pune','Female','ENTC','2018-03-18','781000'),(5,'Amruta','Deshpande','7898254664','Nagpur','Female','IT','2019-11-13','755600'),(6,'Soham','Gaikwad','9876555654','Mumba','Male','COMP','2021-09-17','845000'),(7,'Ravi','Kale','7845536525','Pune','Male','FY','2012-03-09','855450'),(8,'Shravan','Kumar','7815525455','Pune','Male','IT','2017-06-13','554560'),(9,'Rutuja','Deshpande','7875558215','Satara','Female','COMP','2015-02-11','875000'),(10,'Rahul','Shinde','8779562153','Mumbai','Male','COMP','2010-02-17','700000'),(12,'Sarthak','Jangam','9865746235','Pune','Male','COMP','2025-02-10','780000');
/*!40000 ALTER TABLE `stafftable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studenttable`
--

DROP TABLE IF EXISTS `studenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studenttable` (
  `srNumber` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `mobile` longtext,
  `address` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `degree` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `subject1` varchar(45) DEFAULT NULL,
  `subject2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`srNumber`),
  UNIQUE KEY `srNumber_UNIQUE` (`srNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenttable`
--

LOCK TABLES `studenttable` WRITE;
/*!40000 ALTER TABLE `studenttable` DISABLE KEYS */;
INSERT INTO `studenttable` VALUES (4,'Kabir','Thorat','54845545489','Pune ','Male','BE','2005-04-23','JAVA','PYTHON'),(5,'Soham','Deshpande','59589624595','Karad','Male','MCA','2004-11-12','JAVA',NULL),(6,'Sejal','Bhosale','87565526562','Pune ','Female','MCA','2003-10-17',NULL,'PYTHON'),(7,'Kunal','Jadhav','98358848552','Mumbai','Male','ME','2002-01-09','JAVA','PYTHON'),(8,'Kriti','Gujar','78261655455','Jaipur','Female','BE','2006-08-19','JAVA',NULL),(9,'Ravi','Gaikwad','98265552652','Nagpur','Male','BE','2004-09-02',NULL,'PYTHON'),(10,'Anvi','Jadhav','78252665265','Pune ','Female','ME','2001-07-24','JAVA','PYTHON'),(11,'Ram','Patil','848548548','Mumbai','Male','MCA','1999-02-12',NULL,'PYTHON'),(12,'Arjun','Patil','545646848','Pune','Male','BE','2004-04-15','JAVA\r\n','PYTHON'),(25,'Rahul','Kulkarni','8466567945','Nagpur','Male','BCA','2005-02-19',NULL,'PYTHON'),(27,'Yash','Vaidya','8745632569','Pune','Male','MCA','2004-02-11','JAVA\r\n',NULL),(29,'Dhruv','Kholhe','458796238','Mumbai','Male','ME','2004-02-26','JAVA\r\n','PYTHON');
/*!40000 ALTER TABLE `studenttable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-06 23:48:00
