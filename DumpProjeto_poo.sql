CREATE DATABASE  IF NOT EXISTS `projeto_nap2_poo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `projeto_nap2_poo`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projeto_nap2_poo
-- ------------------------------------------------------
-- Server version	5.7.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ovos`
--

DROP TABLE IF EXISTS `ovos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ovos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantidadeovos` int(11) NOT NULL,
  `pesototal` double NOT NULL,
  `quantidadeovospequenos` int(11) NOT NULL,
  `quantidadeovosjumbo` int(11) NOT NULL,
  `quantidadeovossujo` int(11) NOT NULL,
  `quantidadeovostrincados` int(11) NOT NULL,
  `quantidadeovoscomsangue` int(11) NOT NULL,
  `quantidadeovosestranhos` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ovos`
--

LOCK TABLES `ovos` WRITE;
/*!40000 ALTER TABLE `ovos` DISABLE KEYS */;
INSERT INTO `ovos` VALUES (1,221,222.22,1,1,2,3,2,2),(2,20,111.11,2,2,3,1,1,1),(3,233,244.44,222,3,33,1,3,0),(4,76,100,12,1,2,3,0,4),(5,123,65,2,1,1,0,1,0),(6,40,12.32,2,1,0,1,0,0);
/*!40000 ALTER TABLE `ovos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-17  1:07:48
