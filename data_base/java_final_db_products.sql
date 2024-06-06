-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: java_final_db
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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL,
  `product_description` text NOT NULL,
  `product_image_1` varchar(255) DEFAULT NULL,
  `product_image_2` varchar(255) DEFAULT NULL,
  `product_image_3` varchar(255) DEFAULT NULL,
  `product_image_4` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` double NOT NULL,
  `product_category` enum('PILLS','SYRUP','INJECTIONS','OTHERS') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (2,'This drug is used to treat mild to moderate pain (from headaches, menstrual periods, toothaches, backaches, osteoarthritis, or cold/flu aches and pains) and to reduce fever.','https://i5.walmartimages.com/seo/Tylenol-Extra-Strength-Acetaminophen-Rapid-Release-Gels-100-ct_0ddc52c5-eae6-46b2-ba81-6f46fa4648a4.4c83dcb6559503f46daa474c26581cc5.jpeg','https://i5.walmartimages.com/seo/Tylenol-Extra-Strength-Caplets-with-500-mg-Acetaminophen-50-Ct_30dda1ae-2123-4c87-a1f4-c5261707a9b2.eed9763c2912f94c09c9eaffdd42808d.jpeg','https://i5.walmartimages.ca/images/Large/199/155/6000200199155.jpg','https://m.media-amazon.com/images/I/71zOqkn3RpL._AC_UF1000,1000_QL80_.jpg','Tylenol 500mg',50,'PILLS'),(3,'Ibuprofen injection is a nonsteroidal antiinflammatory drug (NSAID) that is used alone or together with other medicines (eg, opioid analgesics) to relieve mild to severe pain. It is also used to treat fever. This medicine is to be given only by or under the supervision of your doctor.Apr 1, 2024','https://caspiantamin.com/sites/default/files/images/ibuprofen_800s.jpg','https://sgpharma.com/home/product_images/Product-14298699210.jpg','https://eimg.pharmasources.com/image/20200527/V3cqFIfqU7uAGYCV085ipUmOuoVXjquEJoKx2q9U.jpeg','https://5.imimg.com/data5/GU/TA/MY-1121516/ibuprofen-injection.png','Ibuprofen Injectable 800',100,'INJECTIONS'),(4,'A medicated, syruplike fluid, usually flavored and nonnarcotic or mildly narcotic, for relieving coughs or soothing irritated throats.','https://www.pharmalink.es/wp-content/uploads/2023/09/PL0146_COUGH-SYRUP-KIDS_WITH-SUGARPRESERVATIVES_2000x2000-1.png','https://i5.walmartimages.com/seo/Gaia-Herbs-Cough-Syrup-Original-Soothes-Occasional-Dry-Coughs-with-Honey-Ivy-Leaf-Black-Elderberry-4-Fl-Oz_4dbfe3e3-2ced-4a9e-b5b8-d49ddb6bb913.b5c5d6b6ff1ef8933de121e838be2c05.jpeg','https://www.medisei.gr/801-thickbox_default/cough-relief-syrup.jpg','https://images.apollo247.in/pub/media/catalog/product/a/p/apc0013-01_1.jpg','',75,'SYRUP'),(5,'A walking stick (also known as a walking cane, cane, walking staff, or staff) is a device used primarily to aid walking, provide postural stability or support, or assist in maintaining a good posture. Some designs also serve as a fashion accessory, or are used for self-defense.','https://m.media-amazon.com/images/I/61GzjmHFoaL.jpg','https://www.walkingsticks.co.uk/user/products/cherry-wood-crook-walking-stick-hm-1.jpg','https://images.thdstatic.com/productImages/26d86292-9f3e-459b-a33a-8a8c24bb8f0a/svn/brazos-walking-sticks-independent-living-502-3000-0281-64_600.jpg','https://www.eden-mobility.co.uk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/d/r/drive-canes-rtl10370bc-64_1000.jpg','Walking Cane',200,'OTHERS'),(7,'Aspirin (acetylsalicylic acid) is a pharmaceutical drug used to reduce pain1,2 or inflammation. 3 It is classified as a non-steroidal anti-inflammatory drug (NSAID). Aspirin can be used to treat: mild to moderate pain. fever.','https://medicinaonline.ae/cdn/shop/products/Aspirin-Protect-30_s.jpg?v=1612788945','https://news.harvard.edu/wp-content/uploads/2024/03/Aspirin-1488x992.jpg','https://5.imimg.com/data5/SELLER/Default/2023/7/330506870/UM/GZ/QO/135658020/aspirin-dispersible-tablets.jpg','https://www.medischevakhandel.nl/public/data/image/article/6660/17206/large/aspirine-500-mg-20-tabletten.jpg','Aspirin',25,'PILLS');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-06 20:20:20
