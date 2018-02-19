package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_logistics")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "orderLogisticsCache")
public class OrderLogistics extends BaseModel {
    @Column
    private long orderlogistics_id;//自动编号
    @Column
    private long order_id;//订单编号
    @Column
    private long express_no;//物流单号
    @Column
    private String consignee_realname;//收货人姓名
    @Column
    private String consignee_telphone;//联系电话
    @Column
    private String consignee_telphone2;//备用联系电话
    @Column
    private String consignee_address;//收货地址
    @Column
    private String consignee_zip;//邮政编码
    @Column
    private int ems;//物流方式
    @Column
    private long logistics_id;//物流商家编号
    @Column
    private double logistics_fee;//物流发货运费
    @Column
    private double agency_fee;//快递代收货款费率
    @Column
    private double delivery_amount;//物流成本金额
    @Column
    private int orderlogistics_status;//物流状态
    @Column
    private int logistics_settlement_status;//物流结算状态(未结算,已结算,部分结算)
    @Column
    private String logistics_result_last;//物流最后状态描述
    @Column
    private String logistics_result;//物流描述
    @Column
    private long logistics_create_time;//发货时间
    @Column
    private long logistics_update_time;// 物流更新时间
    @Column
    private long logistics_settlement_time;//物流结算时间
    @Column
    private int reconciliation_status;//物流公司已对账状态
    @Column
    private long reconciliation_time;//物流公司对账日期
    @Column
    private long logistics_pay_order_no; //物流支付单号

    public long getOrderlogistics_id() {
        return orderlogistics_id;
    }

    public void setOrderlogistics_id(long orderlogistics_id) {
        this.orderlogistics_id = orderlogistics_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getExpress_no() {
        return express_no;
    }

    public void setExpress_no(long express_no) {
        this.express_no = express_no;
    }

    public String getConsignee_realname() {
        return consignee_realname;
    }

    public void setConsignee_realname(String consignee_realname) {
        this.consignee_realname = consignee_realname;
    }

    public String getConsignee_telphone() {
        return consignee_telphone;
    }

    public void setConsignee_telphone(String consignee_telphone) {
        this.consignee_telphone = consignee_telphone;
    }

    public String getConsignee_telphone2() {
        return consignee_telphone2;
    }

    public void setConsignee_telphone2(String consignee_telphone2) {
        this.consignee_telphone2 = consignee_telphone2;
    }

    public String getConsignee_address() {
        return consignee_address;
    }

    public void setConsignee_address(String consignee_address) {
        this.consignee_address = consignee_address;
    }

    public String getConsignee_zip() {
        return consignee_zip;
    }

    public void setConsignee_zip(String consignee_zip) {
        this.consignee_zip = consignee_zip;
    }

    public int getEms() {
        return ems;
    }

    public void setEms(int ems) {
        this.ems = ems;
    }

    public long getLogistics_id() {
        return logistics_id;
    }

    public void setLogistics_id(long logistics_id) {
        this.logistics_id = logistics_id;
    }

    public double getLogistics_fee() {
        return logistics_fee;
    }

    public void setLogistics_fee(double logistics_fee) {
        this.logistics_fee = logistics_fee;
    }

    public double getAgency_fee() {
        return agency_fee;
    }

    public void setAgency_fee(double agency_fee) {
        this.agency_fee = agency_fee;
    }

    public double getDelivery_amount() {
        return delivery_amount;
    }

    public void setDelivery_amount(double delivery_amount) {
        this.delivery_amount = delivery_amount;
    }

    public int getOrderlogistics_status() {
        return orderlogistics_status;
    }

    public void setOrderlogistics_status(int orderlogistics_status) {
        this.orderlogistics_status = orderlogistics_status;
    }

    public int getLogistics_settlement_status() {
        return logistics_settlement_status;
    }

    public void setLogistics_settlement_status(int logistics_settlement_status) {
        this.logistics_settlement_status = logistics_settlement_status;
    }

    public String getLogistics_result_last() {
        return logistics_result_last;
    }

    public void setLogistics_result_last(String logistics_result_last) {
        this.logistics_result_last = logistics_result_last;
    }

    public String getLogistics_result() {
        return logistics_result;
    }

    public void setLogistics_result(String logistics_result) {
        this.logistics_result = logistics_result;
    }

    public long getLogistics_create_time() {
        return logistics_create_time;
    }

    public void setLogistics_create_time(long logistics_create_time) {
        this.logistics_create_time = logistics_create_time;
    }

    public long getLogistics_update_time() {
        return logistics_update_time;
    }

    public void setLogistics_update_time(long logistics_update_time) {
        this.logistics_update_time = logistics_update_time;
    }

    public long getLogistics_settlement_time() {
        return logistics_settlement_time;
    }

    public void setLogistics_settlement_time(long logistics_settlement_time) {
        this.logistics_settlement_time = logistics_settlement_time;
    }

    public int getReconciliation_status() {
        return reconciliation_status;
    }

    public void setReconciliation_status(int reconciliation_status) {
        this.reconciliation_status = reconciliation_status;
    }

    public long getReconciliation_time() {
        return reconciliation_time;
    }

    public void setReconciliation_time(long reconciliation_time) {
        this.reconciliation_time = reconciliation_time;
    }

    public long getLogistics_pay_order_no() {
        return logistics_pay_order_no;
    }

    public void setLogistics_pay_order_no(long logistics_pay_order_no) {
        this.logistics_pay_order_no = logistics_pay_order_no;
    }
}
