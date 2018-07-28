
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'curry');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'rice');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'roti');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'salad');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'dessert');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'soup');
INSERT INTO `menu_item_type` ( `menu_item_type_name`) VALUES ( 'extras');

INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'mutton kebab gravy');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'bhindi masala');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'guwar potato curry');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'chola bhaji');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'dal gosht');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'mix veg sabji');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'paav bhaji');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'chicken angara');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 1, 'palak paneer');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 2, 'plain rice');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 2, 'chicken biryani');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 2, 'khichadi');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 2, 'moong pulao');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES ( 2, 'veg pulao');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'kadhi');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'paaya');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'kaari');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'yellow dal');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'dal tadka');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'bhajiya kadhi');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'khurdi');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (6, 'chicken soup');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (3, 'chapaati');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (3, 'butter roti');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (3, 'khaboos');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (4, 'green salad');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (4, 'ceasar salad');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (5, 'fruit falooda');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (5, 'gulab jamun');
INSERT INTO `menu_item` (`menu_item_type_id`, `menu_item_name`) VALUES (5, 'coconut barfi');

INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (1, 1);
INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (1, 10);
INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (1, 22);
INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (2, 2);
INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (2, 11);
INSERT INTO `menu_details` (`menu_id`, `menu_item_id`) VALUES (2, 21);

INSERT INTO `menu_schedule` (`menu_id`, `delivery_date`) VALUES (1, '2018-7-21');
INSERT INTO `menu_schedule` (`menu_id`, `delivery_date`) VALUES (2, '2018-7-22');

