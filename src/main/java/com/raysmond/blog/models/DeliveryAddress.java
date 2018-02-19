package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_address")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "deliveryAddressCache")
public class DeliveryAddress extends BaseModel {
    @Column
    private long address_id;//自动编号
    @Column
    private long user_id;//用户编号
    @Column
    private String realname;//收件人姓名
    @Column
    private String telphone;//联系电话
    @Column
    private String telphone2;//备用联系电话
    @Column
    private String country;//国家
    @Column
    private String province;//省份
    @Column
    private String city;//城市
    @Column
    private String area;//地区
    @Column
    private String street;//街道/详细收货地址
    @Column
    private String zip;//邮政编码
    @Column
    private boolean is_default_address;//是否默认收货地址
    @Column
    private long created_time;//创建时间

    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getTelphone2() {
        return telphone2;
    }

    public void setTelphone2(String telphone2) {
        this.telphone2 = telphone2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public boolean isIs_default_address() {
        return is_default_address;
    }

    public void setIs_default_address(boolean is_default_address) {
        this.is_default_address = is_default_address;
    }

    public long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(long created_time) {
        this.created_time = created_time;
    }
}
