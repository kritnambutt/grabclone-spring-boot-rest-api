INSERT INTO users (name, email, tel, profile_img, verify_status, user_level)
VALUES ('kritnambutt', 'toyota026265@gmail.com', '+6659588666', '', 'verified', 'platinum');

INSERT INTO shop_food(name, profile_img, cover_img, category_tags, rating, loc_lat, loc_long, loc_detail, operation_hours, tel, verify_status, promotions)
VALUES ('เกี๊ยวทรงเครื่องบางทราย สาขาดอนเมือง - ถนนสรณคมน์', 'http://localhost:8080/images/illustrations/shop/shop-illustration-1.jpeg', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{}'),
       ('KFC (เคเอฟซี) - สรงประภา (Song Prapha)', 'http://localhost:8080/images/illustrations/shop/shop-kfc.png', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{"ลดพิเศษกับ GrabFood"}'),
       ('Potato Corner (โปเตโต้ คอร์เนอร์) - โรบินสันศรีสมาน', 'http://localhost:8080/images/illustrations/shop/shop-potato-corner.jpeg', '', '{"ติ่มซำ"}', 4.8, 13.9271835, 100.5809215, 'ซอยพหลโยธิน 87 ถนนเอกทักษิณ (รหัสร้านค้า: 3-CZC1E26TEN6EJA)', '{"จันทร์ - อาทิตย์  08:00 - 21:00"}', '0613973112', 'verified', '{"ลดสูงสุด ฿100"}');

INSERT INTO food_menu(shop_id, name, img, is_active)
VALUES (1, 'บะหมี่หยกหมูทอด', 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-1.png', true),
        (1, 'ข้าวสเต็กปลาลุยสวน', 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-2.png', true),
        (1, 'ข้าวผัดคะน้าขาหมูเยอรมัน', 'http://localhost:8080/images/illustrations/menu-match/menu-match-you-3.png', true);