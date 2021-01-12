-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2021 at 05:43 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `grocery_shop_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `general_bill`
--

CREATE TABLE `general_bill` (
  `SR_NUM` int(11) NOT NULL,
  `BILL_NUMBER` varchar(100) NOT NULL,
  `BILL_DATE` varchar(100) NOT NULL,
  `CUSTOMER_NAME` varchar(1000) NOT NULL,
  `CUSTOMER_MOBILE` varchar(10) NOT NULL,
  `CUSTOMER_ADDR` varchar(100) NOT NULL,
  `TOTAL` mediumtext NOT NULL,
  `DISCOUNT` mediumtext NOT NULL,
  `GRAND_TOTAL` mediumtext NOT NULL,
  `PAYMENT_MODE` varchar(100) NOT NULL,
  `AMOUNT_PAID` mediumtext NOT NULL,
  `BALANCE` mediumtext NOT NULL,
  `P_T_N` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `general_bill`
--

INSERT INTO `general_bill` (`SR_NUM`, `BILL_NUMBER`, `BILL_DATE`, `CUSTOMER_NAME`, `CUSTOMER_MOBILE`, `CUSTOMER_ADDR`, `TOTAL`, `DISCOUNT`, `GRAND_TOTAL`, `PAYMENT_MODE`, `AMOUNT_PAID`, `BALANCE`, `P_T_N`) VALUES
(1, 'G03112010001', '03-11-2020', 'KUNAL SINGRUPKAR', '9860435463', '9860435463', '158.0', '2.0', '156.0', 'Cash', '156', '0.0', 'G03112010001'),
(2, 'G03112010002', '03-11-2020', 'KUNAL', '9860435463', '9860435463', '490.0', '4.0', '486.0', 'Cash', '486', '0.0', 'G03112010002'),
(3, 'G03112010003', '03-11-2020', 'SHREYASH SINGRUPKAR', '', 'YAVATMAL', '1065.0', '14.0', '1051.0', 'Cash', '1051', '0.0', 'G03112010003'),
(4, 'G03112010004', '03-11-2020', 'SHREYASH SINGRUPKAR', '9860435463', 'YAVATMAL', '1715.0', '24.0', '1691.0', 'Cash', '2281', '0.0', 'G03112010004');

-- --------------------------------------------------------

--
-- Table structure for table `general_bill_item`
--

CREATE TABLE `general_bill_item` (
  `BILL_NUMBER` varchar(100) NOT NULL,
  `ITEM_ID` mediumtext NOT NULL,
  `ITEM_NAME` mediumtext NOT NULL,
  `ITEM_PRICE` mediumtext NOT NULL,
  `DISCOUNT` mediumtext NOT NULL,
  `QUANTITY` mediumtext NOT NULL,
  `SUB_TOTAL` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `general_bill_item`
--

INSERT INTO `general_bill_item` (`BILL_NUMBER`, `ITEM_ID`, `ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `QUANTITY`, `SUB_TOTAL`) VALUES
('G03112010001', '2,3', 'Sugar*******  ,Dal 1kg*****  ', '38   ,120  ', '0.0,2.0', '1,1', '38.0,118.0'),
('G03112010002', '2,3', 'DAL(KG),SOYA OIL', '120,125', '2.0,0.0', '2,2', '236.0,250.0'),
('G03112010003', '2,3,1', 'DAL(KG),SOYA OIL,SUGAR 1KG', '120,125,40', '2.0,0.0,2.0', '2,5,5', '236.0,625.0,190.0'),
('G03112010004', '2,3,2,2,4,2,2', 'DAL(KG),SOYA OIL,DAL(KG),DAL(KG),PARLE-G 5RS,DAL(KG),DAL(KG)', '120,125,120,120,5,120', '2.0,0.0,2.0,2.0,0.0,2.0', '5,2,1,4,5,2', '590.0,250.0,118.0,472.0,25.0,236.0');

-- --------------------------------------------------------

--
-- Table structure for table `item_table`
--

CREATE TABLE `item_table` (
  `SR_NO` int(11) NOT NULL,
  `ITEM_ID` varchar(10) NOT NULL,
  `ITEM_NAME` varchar(100) NOT NULL,
  `ITEM_PRICE` varchar(10) NOT NULL,
  `DISCOUNT` varchar(10) NOT NULL,
  `ITEM_COMPANY` varchar(100) NOT NULL,
  `ITEM_SECTION` varchar(100) NOT NULL,
  `ITEM_ROW` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_table`
--

INSERT INTO `item_table` (`SR_NO`, `ITEM_ID`, `ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `ITEM_COMPANY`, `ITEM_SECTION`, `ITEM_ROW`) VALUES
(1, '2', 'DAL(KG)', '120', '2', 'KUNAL COMPANY', 'A', '2'),
(2, '4', 'PARLE-G 5RS', '5', '0', 'PARLE G', 'C', '1'),
(3, '3', 'SOYA OIL', '125', '0', 'FORTUNE COMPANY', 'B', '1'),
(4, '1', 'SUGAR(KG)', '40', '2', 'KUNAL', 'A', '2');

-- --------------------------------------------------------

--
-- Table structure for table `prime_bill`
--

CREATE TABLE `prime_bill` (
  `SR_NUM` int(11) NOT NULL,
  `BILL_NUMBER` varchar(100) NOT NULL,
  `BILL_DATE` varchar(100) NOT NULL,
  `CUSTOMER_ID` varchar(10) NOT NULL,
  `TOTAL` varchar(10) NOT NULL,
  `DISCOUNT` varchar(10) NOT NULL,
  `GRAND_TOTAL` varchar(10) NOT NULL,
  `PAYMENT_MODE` varchar(20) NOT NULL,
  `AMOUNT_PAID` varchar(10) NOT NULL,
  `BALANCE` varchar(10) DEFAULT NULL,
  `P_T_N` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prime_bill`
--

INSERT INTO `prime_bill` (`SR_NUM`, `BILL_NUMBER`, `BILL_DATE`, `CUSTOMER_ID`, `TOTAL`, `DISCOUNT`, `GRAND_TOTAL`, `PAYMENT_MODE`, `AMOUNT_PAID`, `BALANCE`, `P_T_N`) VALUES
(1, 'P0311201001', '03-11-2020', '100002', '886.0', '4.0', '882.0', 'Cash', '882', '0.0', 'P0311201001'),
(2, 'P0311201002', '03-11-2020', '100002', '1370.0', '16.0', '1354.0', 'Cash', '1354', '0.0', 'P0311201002'),
(3, 'P0311201003', '03-11-2020', '100002', '455.0', '4.0', '451.0', 'Cash', '451', '0.0', 'P0311201003'),
(4, 'P0311201004', '03-11-2020', '100002', '1090.0', '14.0', '1076.0', 'Cash', '1076', '0.0', 'P0311201004');

-- --------------------------------------------------------

--
-- Table structure for table `prime_bill_items`
--

CREATE TABLE `prime_bill_items` (
  `BILL_NUMBER` varchar(100) NOT NULL,
  `ITEM_ID` mediumtext NOT NULL,
  `ITEM_NAME` mediumtext NOT NULL,
  `ITEM_PRICE` mediumtext NOT NULL,
  `DISCOUNT` mediumtext NOT NULL,
  `QUANTITY` mediumtext NOT NULL,
  `SUB_TOTAL` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prime_bill_items`
--

INSERT INTO `prime_bill_items` (`BILL_NUMBER`, `ITEM_ID`, `ITEM_NAME`, `ITEM_PRICE`, `DISCOUNT`, `QUANTITY`, `SUB_TOTAL`) VALUES
('P0311201001', '2,3,2', 'Sugar*******  ,Dal 1kg*****  ,Sugar*******  ', '38   ,120  ,38   ', '0.0,2.0,0.0', '2,2,15', '76.0,236.0,570.0'),
('P0311201002', '4,2,1,3', 'PARLE-G 5RS,DAL(KG),SUGAR 1KG,SOYA OIL', '5,120,40,125', '0.0,2.0,2.0,0.0', '5,5,3,5', '25.0,590.0,114.0,625.0'),
('P0311201003', '1,3,3', 'SUGAR 1KG,SOYA OIL,SOYA OIL', '40,125,125', '2.0,0.0,0.0', '2,2,1', '76.0,250.0,125.0'),
('P0311201004', '2,3,2', 'DAL(KG),SOYA OIL,DAL(KG)', '120,125,120', '2.0,0.0,2.0', '2,2,5', '236.0,250.0,590.0');

-- --------------------------------------------------------

--
-- Table structure for table `prime_customer`
--

CREATE TABLE `prime_customer` (
  `SR_NO` int(11) NOT NULL,
  `CUSTOMER_ID` varchar(100) NOT NULL,
  `CUSTOMER_NAME` varchar(100) NOT NULL,
  `CUSTOMER_ADDRESS` varchar(100) NOT NULL,
  `CUSTOMER_MOBILE` varchar(10) NOT NULL,
  `CUSTOMER_EMAIL` varchar(100) NOT NULL,
  `BALANCE` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prime_customer`
--

INSERT INTO `prime_customer` (`SR_NO`, `CUSTOMER_ID`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_MOBILE`, `CUSTOMER_EMAIL`, `BALANCE`) VALUES
(1, '100001', 'SHREYASH SINGRUPKAR', 'YAVATMAL', '9860435463', 'shreyash@gmail.com', NULL),
(2, '100002', 'shubham', 'yavatmal', '9822245660', 'shubham@gmail.com', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `general_bill`
--
ALTER TABLE `general_bill`
  ADD PRIMARY KEY (`SR_NUM`),
  ADD UNIQUE KEY `BILL_NO` (`BILL_NUMBER`);

--
-- Indexes for table `item_table`
--
ALTER TABLE `item_table`
  ADD PRIMARY KEY (`SR_NO`),
  ADD UNIQUE KEY `ITEM_NAME` (`ITEM_NAME`),
  ADD UNIQUE KEY `ITEM_ID` (`ITEM_ID`);

--
-- Indexes for table `prime_bill`
--
ALTER TABLE `prime_bill`
  ADD PRIMARY KEY (`SR_NUM`),
  ADD UNIQUE KEY `BILL_NUMBER` (`BILL_NUMBER`);

--
-- Indexes for table `prime_customer`
--
ALTER TABLE `prime_customer`
  ADD PRIMARY KEY (`SR_NO`),
  ADD UNIQUE KEY `CUSTOMER_NAME` (`CUSTOMER_NAME`),
  ADD UNIQUE KEY `CUSTOMER_MOBILE` (`CUSTOMER_MOBILE`),
  ADD UNIQUE KEY `CUSTOMER_ID` (`CUSTOMER_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `general_bill`
--
ALTER TABLE `general_bill`
  MODIFY `SR_NUM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `item_table`
--
ALTER TABLE `item_table`
  MODIFY `SR_NO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `prime_bill`
--
ALTER TABLE `prime_bill`
  MODIFY `SR_NUM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `prime_customer`
--
ALTER TABLE `prime_customer`
  MODIFY `SR_NO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
