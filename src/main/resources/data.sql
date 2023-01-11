INSERT INTO `Customer` (`customer_phone`, `last`, `first`, `dob`, `address`, `pharmacy`, `rx`) VALUES
('222-444-6688', 'Ysa', 'Jack', '2017-11-15', '11 Orange Ave, Westminster, CA 92684', '22 Apple Ave, Garden Grove, CA 92842', 'Undisclosed');

INSERT INTO `Message` (`status`, `message`) VALUES
('New', 'With Pharmacy'),
('In Progress', 'Being filled by Pharmacy'),
('Ready', 'Requesting ride'),
('Accepted', 'Ride accepted'),
('En-routed', 'Ride starts'),
('Delivered', 'Package delivered'),
('Arrived', 'Arrived at destination');

INSERT INTO `Rx_Order` (`order_number`, `rx`, `customer_phone`, `status`, `order_date`) VALUES
('c3db01', 'Undisclosed', '222-444-6688', 'New', '11/16/2017'),
('547771', 'Undisclosed', '222-444-6688', 'Delivered', '11/12/2017'),
('ed5191', 'Undisclosed', '222-444-6688', 'Arrived', '11/12/2017'),
('f94df1', 'Undisclosed', '222-444-6688', 'In Progress', '11/12/2017'),
('559671', 'Undisclosed', '222-444-6688', 'Delivered', '11/12/2017');