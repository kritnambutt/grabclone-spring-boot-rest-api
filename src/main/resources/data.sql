INSERT INTO users (user_id, name, email, tel, profile_img, verify_status, user_level)
VALUES (1, 'kritnambutt', 'toyota026265@gmail.com', '+6659588666', '', 'verified', 'platinum');

INSERT INTO shop_food(shop_id, name, profile_img, cover_img, category_tags, rating, loc_lat, loc_long, loc_detail, operation_hours, tel, verify_status, promotions)
VALUES (1, 'เกี๊ยวทรงเครื่องบางทราย สาขาดอนเมือง - ถนนสรณคมน์', 'http://localhost:8080/images/illustrations/shop/shop-illustration-1.jpeg', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{}'),
       (2, 'KFC (เคเอฟซี) - สรงประภา (Song Prapha)', 'http://localhost:8080/images/illustrations/shop/shop-kfc.png', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{"ลดพิเศษกับ GrabFood"}'),
       (3, 'Potato Corner (โปเตโต้ คอร์เนอร์) - โรบินสันศรีสมาน', 'http://localhost:8080/images/illustrations/shop/shop-potato-corner.jpeg', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{"ลดสูงสุด ฿100"}');

INSERT INTO food_menu(menu_id, shop_id, name, price, promotion, img, is_active)
VALUES (1, 1, 'บะหมี่หยกหมูทอด', 65, null, 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-1.png', true),
        (2, 2, 'ข้าวสเต็กปลาลุยสวน', 169, null, 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-2.png', true),
        (3, 3, 'ข้าวผัดคะน้าขาหมูเยอรมัน', 110, 'ส่วนลดค่าจัดส่ง ฿10 เมื่อสั่งซื้อขั้นต่ำ ฿190', 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-3.png', true);