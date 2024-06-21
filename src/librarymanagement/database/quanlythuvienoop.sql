-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlythuvienoop
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `idBook` varchar(100) NOT NULL,
  `titleBook` varchar(100) NOT NULL,
  `author` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `yearPublicationBook` varchar(4) NOT NULL,
  `soluongBook` varchar(4) NOT NULL,
  PRIMARY KEY (`idBook`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('b1','Vỡ lòng về tiền tệ - Money for Beginners',' Matthew Oldham, Lara Bryan, Eddie Reynolds',' Nhà Xuất Bản Thế Giới','2022','3'),('b10','Tiếng Nhật Cho Mọi Người - Trình Độ Sơ Cấp 1 và 2','Đồng Tác Giả',' NXB Trẻ','2020','5'),('b2','Hướng Đối Tượng','oop','pka','2024','3'),('b3','Định luật Murphy – Mọi bí mật tâm lý thao túng cuộc đời bạn','Từ Thính Phong','Nhà Xuất Bản Thế Giới','2022','1'),('b4','Tuổi già rực rỡ','Daniel J. Levitin',' Nhà Xuất Bản Dân Trí','2023','5'),('b5','Thiên Tài Bên Trái, Kẻ Điên Bên Phải','Cao Minh','Nhà Xuất Bản Thế Giới','2021','1'),('b6','Khảo Cứu Về Tiền Cổ Ở An Nam','Desiré Lacroix',' Nhà Xuất Bản Thế Giới','2021','6'),('b7','Lý Thuyết Trò Chơi','Trần Phách Hàm',' Nhà Xuất Bản Dân Trí','2023','1'),('b8','Nói Chuyện Là Bản Năng, Giữ Miệng Là Tu Dưỡng, Im Lặng Là Trí Tuệ','Trương Tiếu Hằng',' Nhà Xuất Bản Thanh Niên','2022','1'),('b9','Mina No Nihongo 1','Đồng tác giả',' NXB Văn Hóa Thông Tin','2022','1');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docgia`
--

DROP TABLE IF EXISTS `docgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docgia` (
  `idDocGia` varchar(100) NOT NULL,
  `nameDocGia` varchar(100) NOT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `gender` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`idDocGia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docgia`
--

LOCK TABLES `docgia` WRITE;
/*!40000 ALTER TABLE `docgia` DISABLE KEYS */;
INSERT INTO `docgia` VALUES ('1','Nguyễn Văn A','0995353453','Nam');
/*!40000 ALTER TABLE `docgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventmuontra`
--

DROP TABLE IF EXISTS `eventmuontra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventmuontra` (
  `idEvent` int NOT NULL AUTO_INCREMENT,
  `idDocGia` varchar(100) DEFAULT NULL,
  `idBook` varchar(100) DEFAULT NULL,
  `ngayMuon` varchar(10) DEFAULT NULL,
  `ngayHenTra` varchar(10) DEFAULT NULL,
  `ngayTra` varchar(10) DEFAULT NULL,
  `statusEvent` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idEvent`),
  KEY `idDocGia` (`idDocGia`),
  KEY `idBook` (`idBook`),
  CONSTRAINT `eventmuontra_ibfk_1` FOREIGN KEY (`idDocGia`) REFERENCES `docgia` (`idDocGia`),
  CONSTRAINT `eventmuontra_ibfk_2` FOREIGN KEY (`idBook`) REFERENCES `book` (`idBook`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventmuontra`
--

LOCK TABLES `eventmuontra` WRITE;
/*!40000 ALTER TABLE `eventmuontra` DISABLE KEYS */;
INSERT INTO `eventmuontra` VALUES (1,'1','b1','22/01/2023','05/02/2023','21/06/2024','đã trả'),(2,'1','b1','21/12/2023','04/01/2024','21/06/2024','đã trả'),(3,'1','b1','21/06/2024','05/07/2024','21/06/2024','đã trả'),(4,'1','b1','21/12/2022','04/01/2023','21/06/2024','đã trả');
/*!40000 ALTER TABLE `eventmuontra` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-21 18:09:10
