﻿go
use QuanLyRapChieuPhim
go
------1. Thể loại phim ----- TLP001
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Hài');
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Cổ trang');
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Tình cảm');
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Kinh dị');
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Phiêu lưu mạo hiểm');
insert into THE_LOAI_PHIM (TenTheLoaiPhim) values (N'Khoa học viễn tưởng');
--- Đã xong
-----8. Phim------ P00001
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values (N'Gia đình đức hạnh',null,'90',N'Thái Lan','2020-12-22',18,'TLP001',N'Yuthlert Sippapak');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Mắt Biếc',null,'97',N'Việt Nam','2020-12-22',18,'TLP003',N'Victor Vũ');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Nhà có khách',null,'90',N'Việt Nam','2021-12-22',18,'TLP001',N'Trấn Thành');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Em chưa 18',null,'90',N'Việt Nam','2019-12-20',18,'TLP003',N'Lê Thanh Sơn');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Bố già',null,'90',N'Việt Nam','2020-12-22',18,'TLP001',N'Trấn Thành');

insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Bẫy ngọt ngào',null,'90',N'Thái Lan','2020-09-22',18,'TLP003',N'Đinh Hà Uyên Thư');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Em và Trịnh',null,'90',N'Việt Nam','2020-09-22',18,'TLP003',N'Phan Gia Nhật Linh');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Chung Cực Bút Ký',null,'95',N'Trung Quốc','2020-09-22',13,'TLP005',N'Châu Duy');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Sa Hải',null,'90',N'Trung Quốc','2020-09-22',18,'TLP005',N'Từ Lỗi');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Nộ Hải Tiềm Sa',null,'90',N'Việt Nam','2020-09-22',18,'TLP003',N'Đức Thắng');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Vân Đỉnh Thiên Cung',null,'90',N'Trung Quốc','2020-09-22',18,'TLP003',N'Lưu Quốc Huy');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Lão Cữu Môn',null,'90',N'Trung Quốc','2020-09-22',18,'TLP003',N'Hoàng Tuấn Văn');

--
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'30 Chưa Phải Là Tết',null,'137',N'Việt Nam','2022-01-22',13,'TLP004',N'Quang Huy');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Tàng Hải Hoa',null,'120',N'Trung Quốc','2021-12-22',16,'TLP005',N'Trịnh Hiểu Long');
insert into PHIM (TenPhim,AnhPhim,ThoiLuong,QuocGia,NamSanXuat,DoTuoiXem,MaTheLoai ,DaoDien)
values(N'Đại Hồng Thủy',null,'125',N'Anh','2020-09-22',16,'TLP004',N'Darren Aronofsky');
-- tinh trang phong chieu
insert into TINH_TRANG_PHONG_CHIEU(TenTinhTrang) values (N'Tốt');
insert into TINH_TRANG_PHONG_CHIEU(TenTinhTrang) values (N'Hỏng');
insert into TINH_TRANG_PHONG_CHIEU(TenTinhTrang) values (N'Bảo trì');
-----11. Phòng chiếu PC0001
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 1','3');
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 2','1');
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 3','1');
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 4','2');
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 5','1');
insert into PHONG_CHIEU(TenPhong,MaTinhTrang) values (N'Phòng số 6','1');
---- Đã xong
------12. Khung giờ chiếu -----------KGC00001  
insert into KHUNG_GIO_CHIEU(TenKhungGio,TGBatDau,TGKetThuc) values(N'Khung giờ số 1','08:00:00.0000000','11:00:00.0000000');
insert into KHUNG_GIO_CHIEU(TenKhungGio,TGBatDau,TGKetThuc) values(N'Khung giờ số 2','11:00:00.0000000','14:00:00.0000000');
insert into KHUNG_GIO_CHIEU(TenKhungGio,TGBatDau,TGKetThuc) values(N'Khung giờ số 3','14:00:00.0000000','17:00:00.0000000');
insert into KHUNG_GIO_CHIEU(TenKhungGio,TGBatDau,TGKetThuc) values(N'Khung giờ số 4','17:00:00.0000000','20:00:00.0000000');
insert into KHUNG_GIO_CHIEU(TenKhungGio,TGBatDau,TGKetThuc) values(N'Khung giờ số 5','20:00:00.0000000','23:00:00.0000000');
----Đã xong
------13.Lịch chiếu
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00001','2022-07-02','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00002','2022-07-01','0');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00004','2022-07-02','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00003','2022-07-01','0');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00001','2022-07-02','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00002','2022-07-03','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00004','2022-07-03','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00002','PC0003','KGC00003','2022-07-03','0');

insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00002','PC0002','KGC00001','2022-07-02','0');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00003','PC0002','KGC00002','2022-07-03','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00004','2022-07-04','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0002','KGC00003','2022-07-04','0');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00001','2022-07-05','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00002','2022-07-02','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0003','KGC00004','2022-07-12','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00002','PC0003','KGC00003','2022-06-01','0');

insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00004','PC0005','KGC00001','2022-07-12','0');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00005','PC0005','KGC00002','2022-07-05','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00005','PC0005','KGC00004','2022-07-03','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00005','PC0005','KGC00003','2022-07-06','2');

insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0006','KGC00001','2022-07-07','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0006','KGC00002','2022-07-04','2');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00001','PC0006','KGC00004','2022-07-02','1');
insert into LICH_CHIEU(MaPhim,MaPhongChieu,MaKhungGioChieu,NgayChieu,TrangThai) VALUES('P00002','PC0006','KGC00003','2022-07-03','0');
----- Đã xong
----- Đã xong
------14.Ca làm việc ----- CLV001
insert into CA_LAM_VIEC(TenCa,GioBatDau,GioKetThuc) values(N'Ca 1','08:00:00.0000000','12:00:00.0000000');
insert into CA_LAM_VIEC(TenCa,GioBatDau,GioKetThuc) values(N'Ca 2','12:00:00.0000000','16:00:00.0000000');
insert into CA_LAM_VIEC(TenCa,GioBatDau,GioKetThuc) values(N'Ca 3','16:00:00.0000000','20:00:00.0000000');
insert into CA_LAM_VIEC(TenCa,GioBatDau,GioKetThuc) values(N'Ca 4','20:00:00.0000000','23:59:59.0000000');
----Đã xong

---- Đã xong
------16. Chính sách ------- CS0001
insert into CHINH_SACH(TenChinhSach,HeSoLuong,BHXH,TienThuong) values ('Chính sách 1','2.4','2 năm','700000');
insert into CHINH_SACH(TenChinhSach,HeSoLuong,BHXH,TienThuong) values ('Chính sách 2','2.2','1 năm','500000');
insert into CHINH_SACH(TenChinhSach,HeSoLuong,BHXH,TienThuong) values ('Chính sách 3','2','6 tháng','300000');
----- Đã xong
-----17.Chức vụ ------ CV0001
insert into CHUC_VU(TenChucVu) values (N'Quản lý phim');
insert into CHUC_VU(TenChucVu) values (N'Quản trị viên');
----- Đã xong
------18.Nhân viên ----- NV0001 (10 NV), 4P, 4VT, 2admin
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456789
Values (N'Phạm Khắc Luận','2002-04-20','0',N'Huế','0982756449','046205010716','luanqlp','123456','CS0002','CV0001','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456789
Values (N'Phạm Chính Hải','2002-08-20','0',N'Huế','0982758887','046202010716','haiqlp','123456','CS0002','CV0001','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456789
Values (N'Lê Duy Quý','2001-04-20','0',N'Quảng Nam','0988752737','046202019128','quyqlp','123456','CS0002','CV0001','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Trương Khởi Linh','2002-09-12','1',N'Hà Nội','0356285861','046201910842','linhqlp','123456','CS0002','CV0001','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--987654321
Values (N'Trần Trung Hiếu','2002-03-01','0',N'Quảng Trị','0982782647','046202011112','hieuqlvt','123456','CS0002','CV0002','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Trần Hải Phong','2002-03-12','1',N'Đà Nẵng','0359235856','046202510866','phongqlvt','123456','CS0002','CV0002','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Trương Hải Khách','2002-03-12','1',N'Đà Nẵng','0359237152','04619253039','khachqlvt','123456','CS0002','CV0002','0');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Huỳnh Thế Anh','2002-12-12','1',N'Đà Nẵng','0359235856','046202510856','anhqlvt','123456','CS0002','CV0002','0');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Lê Văn Hào','2002-02-22','1',N'Huế','0827582932','046202010711','haoadmin','123456','CS0003','CV0002','1');
insert into NHAN_VIEN(TenNhanVien,NgaySinh,GioiTinh,DiaChi,SoDienThoai,CCCD,TenTaiKhoan,MatKhau,MaChinhSach,MaChucVu,TrangThai)--123456
Values (N'Trần Văn Hữu','2002-02-12','1',N'Huế','0359235204','046202010816','huuadmin','123456','CS0003','CV0002','0');

-----Đã xong
------19. lịch làm việc
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV001','2022-07-26');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV001','2022-07-26');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV001','2022-07-26');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV001','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV002','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV002','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV002','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV002','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV003','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV003','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV003','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV003','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV001','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV004','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV004','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV004','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV004','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV004','2022-07-02');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV004','2022-07-02');

insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV001','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0005','CLV001','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV001','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV001','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV002','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV002','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV002','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV002','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV003','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV004','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV004','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV004','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV004','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV004','2022-07-01');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV004','2022-07-01');

insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV001','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0005','CLV001','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV001','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV001','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV002','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV002','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV002','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV002','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV003','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV003','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV003','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV003','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV001','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV004','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV004','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV004','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV004','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV004','2022-07-03');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV004','2022-07-03');

insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV001','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0005','CLV001','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV001','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV001','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV002','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV002','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV002','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV002','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0001','CLV003','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV003','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV003','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0008','CLV003','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0009','CLV001','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0002','CLV004','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0006','CLV004','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0003','CLV004','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0004','CLV004','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0007','CLV004','2022-07-04');
insert into LICH_LAM_VIEC(MaNhanVien,MaCa,NgayLamViec) values ('NV0010','CLV004','2022-07-04');
----- Đã xong
-----30. Loại phiếu--------LP0001
insert into LOAI_PHIEU(TenLoaiPhieu) values (N'Phiếu nhập');
insert into LOAI_PHIEU(TenLoaiPhieu) values (N'Phiếu xuất');
----- Đã xong
-----31. Phiếu--------PH0001	12phieu

insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)	
values ('LP002','2022-05-26','NV0005');
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)	
values ('LP001','2022-05-27','NV0006');

insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP001','2022-05-27','NV0001');					
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP001','2022-05-28','NV0002');
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP002','2022-05-26','NV0002');		

insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP001','2022-05-29','NV0006');
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP001','2022-05-29','NV0007');
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP002','2022-05-30','NV0008');
insert into PHIEU(MaLoaiPhieu,NgayLapPhieu,MaNhanVien)
values ('LP002','2022-05-31','NV0006');

---- Đã xong
-----32. Chi tiết phiếu phim
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0005','P00001',N'Đĩa','3');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0005','P00002',N'Đĩa','3');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0005','P00003',N'Đĩa','10');

insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0006','P00001',N'Đĩa','3');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0006','P00002',N'Đĩa','3');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0006','P00004',N'Đĩa','5');

insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0007','P00001',N'Đĩa','2');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0007','P00002',N'Đĩa','2');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0007','P00004',N'Đĩa','5');

insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0008','P00001',N'Đĩa','2');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0008','P00002',N'Đĩa','2');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0008','P00005',N'Đĩa','10');

insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0009','P00005',N'Đĩa','2');
insert into CHI_TIET_PHIEU_PHIM(MaPhieu,MaPhim,DonViTinh,SoLuong) values('PH0009','P00003',N'Đĩa','1');