
/*商户 sql表*/
-- BOOLEAN类型 相当于 tinyint 类型
-- AUTO_INCREMENT=17 表示 id从17开始自增 而不是0
CREATE TABLE 'merchants'(
  'id' int(10) unsigned NOT NULL AUTO_INCREMENT,
  'merchants_name' varchar(64) COLLATE utf8_bin  NOT NULL COMMENT '商户名称',
  'logo_url' varchar (256) COLLATE utf8_bin NOT NULL COMMENT '商户logo地址',
  'business_license_url' varchar (256) COLLATE utf8_bin NOT NULL COMMENT '商户 营业执照说明',
  'phone' varchar (64) COLLATE utf8_bin NOT NULL COMMENT '商户 联系电话',
  'address' varchar (64) COLLATE utf8_bin NOT NULL COMMENT '商户地址',
  'is_audit' BOOLEAN   NOT NULL COMMENT '能否通过审核',
  PRIMARY KEY('id')
)ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARACTER_SET_CATALOG = UTF8;