--DROP TABLE Customer;

CREATE TABLE `Customer` (
  `customer_phone` varchar(15) NOT NULL,
  `last` varchar(50) NOT NULL,
  `first` varchar(50) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `address` text NOT NULL,
  `pharmacy` text NOT NULL,
  `rx` text DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
);

CREATE TABLE Message (
  status varchar(20) DEFAULT NULL,
  message varchar(200) DEFAULT NULL
);

CREATE TABLE `Rx_Order` (
--  `id` INT NOT NULL,
  `order_number` varchar(20)  NOT NULL,
  `rx` text DEFAULT NULL,
  `customer_phone` varchar(20) NOT NULL,
  `status` text NOT NULL,
  `order_date` varchar(15) NOT NULL
);