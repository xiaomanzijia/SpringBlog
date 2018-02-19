package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_model")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "orderModelCache")
public class Order extends BaseModel {

    @Column(unique = true)
    private long order_id;//自动编号

    @Column
    private long order_no;//订单单号

    @Column
    private long shop_id;//商店编号

    @Column
    private int order_status;//订单状态

    @Column
    private int product_count;//商品数量

    @Column
    private double product_amount_total;//商品总价

    @Column
    private double order_amount_total;//订单金额

    @Column
    private double logistics_fee;//运费金额

    @Column
    private long address_id;//收货地址编号

    @Column
    private long orderlogistics_id;//订单物流编号

    @Column
    private int pay_channel;//订单支付渠道

    @Column
    private long out_trade_no;//第三方支付流水号

    @Column
    private long order_create_time;//订单创建时间

    @Column
    private long order_pay_time;//订单支付时间

    @Column
    private long deliver_goods_time;//发货时间


    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
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

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public double getProduct_amount_total() {
        return product_amount_total;
    }

    public void setProduct_amount_total(double product_amount_total) {
        this.product_amount_total = product_amount_total;
    }

    public double getOrder_amount_total() {
        return order_amount_total;
    }

    public void setOrder_amount_total(double order_amount_total) {
        this.order_amount_total = order_amount_total;
    }

    public double getLogistics_fee() {
        return logistics_fee;
    }

    public void setLogistics_fee(double logistics_fee) {
        this.logistics_fee = logistics_fee;
    }

    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    public long getOrderlogistics_id() {
        return orderlogistics_id;
    }

    public void setOrderlogistics_id(long orderlogistics_id) {
        this.orderlogistics_id = orderlogistics_id;
    }

    public int getPay_channel() {
        return pay_channel;
    }

    public void setPay_channel(int pay_channel) {
        this.pay_channel = pay_channel;
    }

    public long getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(long out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public long getOrder_create_time() {
        return order_create_time;
    }

    public void setOrder_create_time(long order_create_time) {
        this.order_create_time = order_create_time;
    }

    public long getOrder_pay_time() {
        return order_pay_time;
    }

    public void setOrder_pay_time(long order_pay_time) {
        this.order_pay_time = order_pay_time;
    }

    public long getDeliver_goods_time() {
        return deliver_goods_time;
    }

    public void setDeliver_goods_time(long deliver_goods_time) {
        this.deliver_goods_time = deliver_goods_time;
    }
}
