-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: financas
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Viagem'),(2,'Negócios');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `profissao` varchar(255) DEFAULT NULL,
  `conta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_a8p0pxvka1kuwy5y09omepofx` (`conta_id`),
  CONSTRAINT `FKajhxkga86ursgptf0lm09qpj0` FOREIGN KEY (`conta_id`) REFERENCES `conta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Rua Fulano 123','Maria dos Santos','Dev',2);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conta`
--

DROP TABLE IF EXISTS `conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(255) DEFAULT NULL,
  `banco` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `titular` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conta`
--

LOCK TABLES `conta` WRITE;
/*!40000 ALTER TABLE `conta` DISABLE KEYS */;
INSERT INTO `conta` VALUES (1,'1507','001 - BANCO DO BRASIL','70140-8','Samuel Rocha'),(2,'6543','001 - BANCO DO BRASIL','16987-8','Maria dos Santos'),(3,'1745','237 - BANCO BRADESCO','86759-1','Paulo Roberto Souza'),(4,'4606','341 - BANCO ITAU UNIBANCO','46346-3','Antonio Duraes'),(5,'9876','033 - BANCO SANTANDER','12345-6','Leandra Marques'),(6,'1234','104 - CAIXA ECONOMICA FEDERAL','98654-3','Alexandre Duarte');
/*!40000 ALTER TABLE `conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conta_movimentacao`
--

DROP TABLE IF EXISTS `conta_movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conta_movimentacao` (
  `Conta_id` int(11) NOT NULL,
  `movimentacoes_id` int(11) NOT NULL,
  UNIQUE KEY `UK_leffgcyr526csjv4iloathpk` (`movimentacoes_id`),
  KEY `FKp4a9vjc3g3djv8bnv1l4iu1x7` (`Conta_id`),
  CONSTRAINT `FKajkfxahotd0eks6q099b88k9j` FOREIGN KEY (`movimentacoes_id`) REFERENCES `movimentacao` (`id`),
  CONSTRAINT `FKp4a9vjc3g3djv8bnv1l4iu1x7` FOREIGN KEY (`Conta_id`) REFERENCES `conta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conta_movimentacao`
--

LOCK TABLES `conta_movimentacao` WRITE;
/*!40000 ALTER TABLE `conta_movimentacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `conta_movimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimentacao`
--

DROP TABLE IF EXISTS `movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimentacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `valor` decimal(19,2) DEFAULT NULL,
  `conta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKthcy44mjtg87orpl9a3nfso7b` (`conta_id`),
  CONSTRAINT `FKthcy44mjtg87orpl9a3nfso7b` FOREIGN KEY (`conta_id`) REFERENCES `conta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimentacao`
--

LOCK TABLES `movimentacao` WRITE;
/*!40000 ALTER TABLE `movimentacao` DISABLE KEYS */;
INSERT INTO `movimentacao` VALUES (1,'2020-02-26 17:15:21','Churrascaria','SAIDA',200.00,1),(2,'2020-02-26 17:15:46','Viagem a Sao Paulo','SAIDA',100.00,1),(3,'2020-02-26 17:15:46','Viagem ao Rio','SAIDA',300.00,1),(4,'2020-02-26 17:15:52','Conta de luz - ABRIL/2012','SAIDA',135.00,1),(5,'2020-02-26 17:15:52','Almoco no Restaurante - AGOSTO/2012','SAIDA',175.80,1),(6,'2020-02-26 17:15:52','Aluguel - MAIO/2012','ENTRADA',680.00,1),(7,'2020-02-26 17:15:52','Salario - FEVEREIRO/2012','ENTRADA',3830.68,1),(8,'2020-02-26 17:15:52','Conta de telefone - SETEMBRO/2011','SAIDA',168.27,2),(9,'2020-02-26 17:15:52','Aniversario - MAIO/2011','ENTRADA',200.00,2),(10,'2020-02-26 17:15:52','Lanche - JULHO/2011','SAIDA',28.50,3),(11,'2020-02-26 17:15:52','Presente - DEZEMBRO/2011','SAIDA',49.99,3),(12,'2020-02-26 17:15:52','Bonus - JANEIRO/2012','ENTRADA',2000.00,3),(13,'2020-02-26 17:15:52','Carnaval - MARCO/2012','SAIDA',765.20,4),(14,'2020-02-26 17:15:52','Salario - ABRIL/2012','ENTRADA',2651.90,5),(15,'2020-02-26 17:15:52','Bonus - JANEIRO/2012','ENTRADA',1000.00,5);
/*!40000 ALTER TABLE `movimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimentacao_categoria`
--

DROP TABLE IF EXISTS `movimentacao_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimentacao_categoria` (
  `Movimentacao_id` int(11) NOT NULL,
  `categoria_id` int(11) NOT NULL,
  KEY `FK9qjlgh7a96gx1ks359va1na9a` (`categoria_id`),
  KEY `FK8c4hm7qt4jdk4xcglplf5dyy7` (`Movimentacao_id`),
  CONSTRAINT `FK8c4hm7qt4jdk4xcglplf5dyy7` FOREIGN KEY (`Movimentacao_id`) REFERENCES `movimentacao` (`id`),
  CONSTRAINT `FK9qjlgh7a96gx1ks359va1na9a` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimentacao_categoria`
--

LOCK TABLES `movimentacao_categoria` WRITE;
/*!40000 ALTER TABLE `movimentacao_categoria` DISABLE KEYS */;
INSERT INTO `movimentacao_categoria` VALUES (2,1),(2,2),(3,1),(3,2);
/*!40000 ALTER TABLE `movimentacao_categoria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-02 14:11:10
