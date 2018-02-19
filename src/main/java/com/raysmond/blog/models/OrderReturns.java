package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_returns")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "orderReturnsCache")
public class OrderReturns extends BaseModel {
    @Column
    private long order_returns_id;//自动编号
    @Column
    private long returns_no;//退货编号
    @Column
    private long order_id;// 订单编号
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
    private String consignee_zip;// 邮政编码
    @Column
    private int ems;//物流方式
    @Column
    private long logistics_id;//物流商家编号
    @Column
    private double logistics_fee;//物流发货运费
    @Column
    private int orderlogistics_status;//物流状态
    @Column
    private String logistics_result_last;//物流最后状态描述
    @Column
    private String logistics_result;//物流描述
    @Column
    private long logistics_create_time;//发货时间
    @Column
    private long logistics_update_time;// 物流更新时间
    @Column
    private int returns_type;//退货类型
    @Column
    private int handling_way;//退货处理方式(PUPAWAY:退货入库;REDELIVERY:重新发货;RECLAIM-REDELIVERY:不要求归还并重新发货; REFUND:退款; COMPENSATION:不退货并赔偿)
    @Column
    private double returns_amount;//退款金额
    @Column
    private double seller_punish_fee;//退货销售员承担的费用
    @Column
    private long return_submit_time;//退货申请时间
    @Column
    private long handling_time;//退货处理时间
    @Column
    private String return_reason;//退货原因


    public long getOrder_returns_id() {
        return order_returns_id;
    }

    public void setOrder_returns_id(long order_returns_id) {
        this.order_returns_id = order_returns_id;
    }

    public long getReturns_no() {
        return returns_no;
    }

    public void setReturns_no(long returns_no) {
        this.returns_no = returns_no;
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

    public int getOrderlogistics_status() {
        return orderlogistics_status;
    }

    public void setOrderlogistics_status(int orderlogistics_status) {
        this.orderlogistics_status = orderlogistics_status;
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

    public int getReturns_type() {
        return returns_type;
    }

    public void setReturns_type(int returns_type) {
        this.returns_type = returns_type;
    }

    public int getHandling_way() {
        return handling_way;
    }

    public void setHandling_way(int handling_way) {
        this.handling_way = handling_way;
    }

    public double getReturns_amount() {
        return returns_amount;
    }

    public void setReturns_amount(double returns_amount) {
        this.returns_amount = returns_amount;
    }

    public double getSeller_punish_fee() {
        return seller_punish_fee;
    }

    public void setSeller_punish_fee(double seller_punish_fee) {
        this.seller_punish_fee = seller_punish_fee;
    }

    public long getReturn_submit_time() {
        return return_submit_time;
    }

    public void setReturn_submit_time(long return_submit_time) {
        this.return_submit_time = return_submit_time;
    }

    public long getHandling_time() {
        return handling_time;
    }

    public void setHandling_time(long handling_time) {
        this.handling_time = handling_time;
    }

    public String getReturn_reason() {
        return return_reason;
    }

    public void setReturn_reason(String return_reason) {
        this.return_reason = return_reason;
    }
}
