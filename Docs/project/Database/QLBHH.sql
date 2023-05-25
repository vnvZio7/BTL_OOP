insert into hoadon values(1015,'2022-09-22','KH06','NV01',910000);
insert into hoadon values(1016,'2022-10-20','KH07','NV02',12500);
insert into hoadon values(1017,'2023-04-12','KH08','NV03',35000);
insert into hoadon values(1018,'2023-04-15','KH08','NV03',330000);
insert into hoadon values(1019,'2023-04-16','KH01','NV03',30000);
insert into hoadon values(1020,'2023-04-20','KH09','NV04',70000);
insert into hoadon values(1021,'2023-05-22','KH10','NV03',67500);
insert into hoadon values(1022,'2023-07-24',Null,'NV03',7000);
insert into hoadon values(1023,'2023-08-26',Null,'NV01',330000);


-- CTHD
insert into cthd values(1001,'TV02',10);
insert into cthd values(1001,'ST01',5);
insert into cthd values(1001,'BC01',5);
insert into cthd values(1001,'BC02',10);
insert into cthd values(1001,'ST08',10);
insert into cthd values(1002,'BC04',20);
insert into cthd values(1002,'BB01',20);
insert into cthd values(1002,'BB02',20);
insert into cthd values(1003,'BB03',10);
insert into cthd values(1004,'TV01',20);
insert into cthd values(1004,'TV02',10);
insert into cthd values(1004,'TV03',10);
insert into cthd values(1004,'TV04',10);
insert into cthd values(1005,'TV05',50);
insert into cthd values(1005,'TV06',50);
insert into cthd values(1006,'TV07',20);
insert into cthd values(1006,'ST01',30);
insert into cthd values(1006,'ST02',10);
insert into cthd values(1007,'ST03',10);
insert into cthd values(1008,'ST04',8);
insert into cthd values(1009,'ST05',10);
insert into cthd values(1010,'TV07',50);
insert into cthd values(1010,'ST07',50);
insert into cthd values(1010,'ST08',100);
insert into cthd values(1010,'ST04',50);
insert into cthd values(1010,'TV03',100);
insert into cthd values(1011,'ST06',50);
insert into cthd values(1012,'ST07',3);
insert into cthd values(1013,'ST08',5);
insert into cthd values(1014,'BC02',80);
insert into cthd values(1014,'BB02',100);
insert into cthd values(1014,'BC04',60);
insert into cthd values(1014,'BB01',50);
insert into cthd values(1015,'BB02',30);
insert into cthd values(1015,'BB03',7);
insert into cthd values(1016,'TV01',5);
insert into cthd values(1017,'TV02',1);
insert into cthd values(1017,'TV03',1);
insert into cthd values(1017,'TV04',5);
insert into cthd values(1018,'ST04',6);
insert into cthd values(1019,'ST05',1);
insert into cthd values(1019,'ST06',2);
insert into cthd values(1020,'ST07',10);
insert into cthd values(1021,'ST08',5);
insert into cthd values(1021,'TV01',7);
insert into cthd values(1021,'TV02',10);
insert into cthd values(1022,'ST07',1);
insert into cthd values(1023,'ST04',6);
 -- doanh thu ngay
SELECT SUM(TRIGIA) AS DoanhThuNgay
FROM HOADON
WHERE NGHD = '2022-01-23';

-- doanh thu thang
SELECT SUM(TRIGIA) AS DoanhThuThang
FROM HOADON
WHERE YEAR(NGHD) = 2022 && MONTH(NGHD) = 1;

-- doanh thu nam 
SELECT SUM(TRIGIA) AS DoanhThuNam
FROM HOADON
WHERE YEAR(NGHD) = 2022;