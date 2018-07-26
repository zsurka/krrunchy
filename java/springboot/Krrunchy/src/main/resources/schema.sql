CREATE TABLE `menu_schedule` (
  `menu_id` INT NOT NULL,
  `delivery_date` DATE NOT NULL,
 );
 
 CREATE TABLE `menu_details` (
  `menu_id` INT NOT NULL,
  `items` VARCHAR2 NOT NULL,
 );
