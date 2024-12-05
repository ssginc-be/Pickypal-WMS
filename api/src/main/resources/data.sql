-- 지점 테스트 데이터
INSERT INTO branch(branch_id, name, address, tel, last_modified_at)
VALUES
    ('B00001', '논현개나리점', '서울특별시 강남구 학동로26길 25', '02-540-7556', '2024-12-01 12:29:12.000000'),
    ('B00002', '역삼승리점', '서울특별시 강남구 강남대로94길 55', '02-6916-1500', '2024-12-01 12:29:12.000000'),
    ('B00003', '영동대로점', '서울특별시 강남구 영동대로 732', '', '2024-12-01 12:29:12.000000'),
    ('B00004', 'R대치역점', '서울특별시 강남구 남부순환로 2947 대원빌딩 1층', '010-8357-1400', '2024-12-01 12:29:12.000000'),
    ('B00005', 'R선릉아크로텔점', '서울특별시 강남구 선릉로 524', '070-7700-6536', '2024-12-01 12:29:12.000000'),
    ('B00006', '강남리테일점', '서울특별시 강남구 봉은사로74길 15', '02-553-7906', '2024-12-01 12:29:12.000000'),
    ('B00007', '도산대로점', '서울특별시 강남구 도산대로 309 1층', '', '2024-12-01 12:29:12.000000'),
    ('B00008', '스마트코엑스점', '서울특별시 강남구 영동대로 513 H115호', '02-6916-1500', '2024-12-01 12:29:12.000000'),
    ('B00009', 'R논현TJ점', '서울특별시 강남구 논현로121길 27', '02-3452-2577', '2024-12-01 12:29:12.000000'),
    ('B00010', 'R논현스타점', '서울특별시 강남구 봉은사로1길 42', '070-8804-3841', '2024-12-01 12:29:12.000000')
;

-- 납품처 테스트 데이터
INSERT INTO supplier (supplier_id, name, address, tel, last_modified_at)
VALUES
    ('S00001', '도루코', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00002', '하나로', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00003', '롯데', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00004', '던킨', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00005', '할리스', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00006', '삼양', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00007', '츄파춥스', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00008', '동원', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00009', 'CJ', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00010', '오뚜기', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000'),
    ('S00011', '삼립', '서울특별시 강남구', '010-1234-5678', '2024-12-01 12:29:12.000000')
;

INSERT INTO service_user (user_id, user_name, email, role, branch_id, last_modified_at)
VALUES
    ('Queue-ri', '규리', 'qriositylog@gmail.com', 'BRANCH', 'B00006', '2024-12-01 12:29:12.000000'),
    ('root', 'root', 'root@pickypal.com', 'HEAD', NULL, '2024-12-02 00:00:00.000000')
;