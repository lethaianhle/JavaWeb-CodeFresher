use quanlycanbo;

CREATE TABLE `quanlycanbo`.`nhanvien` (
  `idNhanVien` INT NOT NULL AUTO_INCREMENT,
  `hoTen` VARCHAR(235) NOT NULL,
  `tuoi` INT(200) NOT NULL,
  `gioiTinh` VARCHAR(125) NOT NULL,
  `address` VARCHAR(245) NULL,
  `congViec` VARCHAR(215) NULL,
  PRIMARY KEY (`idNhanVien`));
