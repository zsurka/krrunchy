 CREATE TABLE menu_item_type(
	menu_item_type_id INT SERIAL PRIMARY KEY,
	menu_item_type_name character(35) NOT NULL
 );
 
 CREATE TABLE menu_item (
	menu_item_id INT SERIAL PRIMARY KEY,
	menu_item_type_id INT NOT NULL REFERENCES menu_item_type(menu_item_type_id),
	menu_item_name character(35) NOT NULL
 );
 
 CREATE TABLE menu_details (
  menu_id INT NOT NULL,
  menu_item_id INT NOT NULL 
 );
 CREATE TABLE menu_schedule (
  delivery_date DATE NOT NULL,
  menu_id INT NOT NULL 
 );