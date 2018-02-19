package com.raysmond.blog.models;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "orderDetailCache")
public class OrderDetail extends BaseModel {
    @Column(unique = true)
    private long order_detail_id;//自动编号

    @Column
    private long order_no;//订单单号

    @Column
    private long shop_id;//商店编号
    @Column
    private String product_name;//商品名称
    @Column
    private double product_price;//商品价格
    @Column
    private String product_marque;//商品型号
    @Column
    private String product_store_barcode;//商品条码
    @Column
    private String product_mode_desc;//商品型号信息(记录详细商品型号，如颜色、规格、包装等)
    @Column
    private String product_mode_params;//商品型号参数(JSON格式，记录单位编号、颜色编号、规格编号等)
    @Column
    private double discount_rate;//折扣比例
    @Column
    private double discount_amount;//折扣金额
    @Column
    private int number;//购买数量
    @Column
    private double subtotal;//小计金额
    @Column
    private boolean is_product_exists;//商品是否有效
    @Column
    private String remark;//客户商品备注

    public long getOrder_detail_id() {
        return order_detail_id;
    }

    public void setOrder_detail_id(long order_detail_id) {
        this.order_detail_id = order_detail_id;
    }

    public long getOrder_no() {
        return order_no;
    }

    public void setOrder_no(long order_no) {
        this.order_no = order_no;
    }

    public long getShop_id() {
        return shop_id;
    }

    public void setShop_id(long shop_id) {
        this.shop_id = shop_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_marque() {
        return product_marque;
    }

    public void setProduct_marque(String product_marque) {
        this.product_marque = product_marque;
    }

    public String getProduct_store_barcode() {
        return product_store_barcode;
    }

    public void setProduct_store_barcode(String product_store_barcode) {
        this.product_store_barcode = product_store_barcode;
    }

    public String getProduct_mode_desc() {
        return product_mode_desc;
    }

    public void setProduct_mode_desc(String product_mode_desc) {
        this.product_mode_desc = product_mode_desc;
    }

    public String getProduct_mode_params() {
        return product_mode_params;
    }

    public void setProduct_mode_params(String product_mode_params) {
        this.product_mode_params = product_mode_params;
    }

    public double getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(double discount_rate) {
        this.discount_rate = discount_rate;
    }

    public double getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(double discount_amount) {
        this.discount_amount = discount_amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isIs_product_exists() {
        return is_product_exists;
    }

    public void setIs_product_exists(boolean is_product_exists) {
        this.is_product_exists = is_product_exists;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
