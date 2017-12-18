package com.wushuang.entity;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
//	 id number primary key,
//	 code varchar2(20),--��Ʒ���
//	 name varchar2(200),--��Ʒ����
//	 product_imgPath varchar2(500),--��ƷͼƬ·��
//	 price number(7,2),--��Ʒ�۸�
//	 count number,--��Ʒ����
//	 product_desc varchar2(500), --��Ʒ����
//	 product_status number,--��Ʒ״̬:0���ϼ�  1���¼�
//	 category_id number references t_categroy(id),--��Ʒ���id
//	 brand_id number references t_brand(id)--��ƷƷ��id
	
	private Integer id;
	private String code;
	private String name = "jwj";
	private String product_imgPath;
	private Double price;
	private Integer count;
	private String product_desc;
	private Integer product_status;
	private Integer category_id;
	private Integer brand_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_imgPath() {
		return product_imgPath;
	}
	public void setProduct_imgPath(String productImgPath) {
		product_imgPath = productImgPath;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String productDesc) {
		product_desc = productDesc;
	}
	public Integer getProduct_status() {
		return product_status;
	}
	public void setProduct_status(Integer productStatus) {
		product_status = productStatus;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer categoryId) {
		category_id = categoryId;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brandId) {
		brand_id = brandId;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", product_imgPath=" + product_imgPath
				+ ", price=" + price + ", count=" + count + ", product_desc=" + product_desc + ", product_status="
				+ product_status + ", category_id=" + category_id + ", brand_id=" + brand_id + "]";
	}
	
}