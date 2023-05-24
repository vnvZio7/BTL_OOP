CREATE DATABASE qlbh;
use qlbh;


CREATE TABLE users(
	TENND char(200),
    MK varchar(40),
    QUYEN varchar(10) 
);



-- KHACHANG
CREATE TABLE KHACHHANG(
	MAKH	char(4) not null,	
	HOTEN	varchar(40),
	DCHI	varchar(50),
	SODT	varchar(20),
	NGSINH	date,
	NGDK	date,
	DOANHSO double,
	constraint pk_kh primary key(MAKH)
);

-- NHANVIEN
CREATE TABLE NHANVIEN(
	MANV	char(4) not null,	
	HOTEN	varchar(40),
	SODT	varchar(20),
	NGVL	date,	
	constraint pk_nv primary key(MANV)
);

-- SANPHAM
CREATE TABLE SANPHAM(
	MASP	char(4) not null,
	TENSP	varchar(40),
	DVT	varchar(20),
	NUOCSX	varchar(40),
	GIA	double,
	constraint pk_sp primary key(MASP)	
);

-- HOADON
CREATE TABLE HOADON(
	SOHD	int not null,
	NGHD 	date,
	MAKH 	char(4),
	MANV 	char(4),
	TRIGIA	double,
	constraint pk_hd primary key(SOHD)	
);

-- CTHD
   CREATE TABLE CTHD(
	SOHD	int,
	MASP	char(4),
	SL		int,
	constraint pk_cthd primary key(SOHD,MASP)
);

-- Khoa ngoai cho bang HOADON
ALTER TABLE HOADON ADD CONSTRAINT fk01_HD FOREIGN KEY(MAKH) REFERENCES KHACHHANG(MAKH);
ALTER TABLE HOADON ADD CONSTRAINT fk02_HD FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV);
-- Khoa ngoai cho bang CTHD
ALTER TABLE CTHD ADD CONSTRAINT fk01_CTHD FOREIGN KEY(SOHD) REFERENCES HOADON(SOHD);
ALTER TABLE CTHD ADD CONSTRAINT fk02_CTHD FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP);

-- USERS
insert into users value('admin','12345','admin');
insert into users value('nhanvien1','12345','user');


-- KHACHHANG
insert into khachhang values('KH01','Nguyen Van A','731 Tran Hung Dao, Q5, TpHCM','8823451','1960-10-20','2022-01-11',13060000);
insert into khachhang values('KH02','Tran Ngoc Han','23/5 Nguyen Trai, Q5, TpHCM','908256478','1974-05-22','2022-02-22',280000);
insert into khachhang values('KH03','Tran Ngoc Linh','45 Nguyen Canh Chan, Q1, TpHCM','938776266','1975-07-22','2022-03-22',3860000);
insert into khachhang values('KH04','Tran Minh Long','50/34 Le Dai Hanh, Q10, TpHCM','917325476','1980-06-22','2022-04-03',250000);
insert into khachhang values('KH05','Le Nhat Minh','34 Truong Dinh, Q3, TpHCM','8246108','1994-07-22','2022-05-25',21000);
insert into khachhang values('KH06','Le Hoai Thuong','227 Nguyen Van Cu, Q5, TpHCM','8631738','2000-09-22','2022-06-26',915000);
insert into khachhang values('KH07','Nguyen Van Tam','32/3 Tran Binh Trong, Q5, TpHCM','916783565','2002-10-22','2022-07-29',12500);
insert into khachhang values('KH08','Phan Thi Thanh','45/2 An Duong Vuong, Q5, TpHCM','938435756','1994-02-22','2023-02-01',365000);
insert into khachhang values('KH09','Le Ha Vinh','873 Le Hong Phong, Q5, TpHCM','8654763','1984-07-22','2023-02-22',70000);
insert into khachhang values('KH10','Ha Duy Lap','34/34B Nguyen Trai, Q1, TpHCM','8768904','1982-03-22','2023-03-10',67500);


-- NHANVIEN
insert into nhanvien values('NV01','Nguyen Nhu Nhut','927345678','2000-02-02');
insert into nhanvien values('NV02','Le Thi Phi Yen','987567390','2000-06-29');
insert into nhanvien values('NV03','Nguyen Van B','997047382','2001-05-12');
insert into nhanvien values('NV04','Ngo Thanh Tuan','913758498','2002-07-17');
insert into nhanvien values('NV05','Nguyen Thi Truc Thanh','918590387','2003-09-22');


-- SANPHAM
insert into sanpham values('BC01','But chi','cay','Singapore',3000);
insert into sanpham values('BC02','But chi','cay','Singapore',5000);
insert into sanpham values('BC03','But chi','cay','Viet Nam',3500);
insert into sanpham values('BC04','But chi','hop','Viet Nam',30000);
insert into sanpham values('BB01','But bi','cay','Viet Nam',5000);
insert into sanpham values('BB02','But bi','cay','Trung Quoc',7000);
insert into sanpham values('BB03','But bi','hop','Thai Lan',100000);
insert into sanpham values('TV01','Tap 100 giay mong','quyen','Trung Quoc',2500);
insert into sanpham values('TV02','Tap 200 giay mong','quyen','Trung Quoc',4500);
insert into sanpham values('TV03','Tap 100 giay tot','quyen','Viet Nam',3000);
insert into sanpham values('TV04','Tap 200 giay tot','quyen','Viet Nam',5500);
insert into sanpham values('TV05','Tap 100 trang','chuc','Viet Nam',23000);
insert into sanpham values('TV06','Tap 200 trang','chuc','Viet Nam',53000);
insert into sanpham values('TV07','Tap 100 trang','chuc','Trung Quoc',34000);
insert into sanpham values('ST01','So tay 500 trang','quyen','Trung Quoc',40000);
insert into sanpham values('ST02','So tay loai 1','quyen','Viet Nam',55000);
insert into sanpham values('ST03','So tay loai 2','quyen','Viet Nam',51000);
insert into sanpham values('ST04','So tay','quyen','Thai Lan',55000);
insert into sanpham values('ST05','So tay mong','quyen','Thai Lan',20000);
insert into sanpham values('ST06','Phan viet bang','hop','Viet Nam',5000);
insert into sanpham values('ST07','Phan khong bui','hop','Viet Nam',7000);
insert into sanpham values('ST08','Bong bang','cai','Viet Nam',1000);
insert into sanpham values('ST09','But long','cay','Viet Nam',5000);
insert into sanpham values('ST10','But long','cay','Trung Quoc',7000);


-- HOADON
insert into hoadon values(1001,'2022-01-23','KH01','NV01',320000);
insert into hoadon values(1002,'2022-01-29','KH01','NV02',840000);
insert into hoadon values(1003,'2022-03-12','KH02','NV01',100000);
insert into hoadon values(1004,'2022-03-25','KH02','NV01',180000);
insert into hoadon values(1005,'2022-04-01','KH01','NV02',3800000);
insert into hoadon values(1006,'2022-04-16','KH01','NV03',2430000);
insert into hoadon values(1007,'2022-05-01','KH03','NV03',510000);
insert into hoadon values(1008,'2022-05-11','KH01','NV03',440000);
insert into hoadon values(1009,'2022-05-22','KH03','NV04',200000);
insert into hoadon values(1010,'2022-06-10','KH01','NV01',5200000);
insert into hoadon values(1011,'2022-07-04','KH04','NV03',250000);
insert into hoadon values(1012,'2022-07-18','KH05','NV03',21000);
insert into hoadon values(1013,'2022-08-13','KH06','NV01',5000);
insert into hoadon values(1014,'2022-08-28','KH03','NV02',3150000);
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