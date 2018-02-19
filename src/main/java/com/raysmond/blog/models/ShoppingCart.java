package com.raysmond.blog.models;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shopping_cart")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "shoppingCartCache")
public class ShoppingCart extends BaseModel {
    @Column
    private long user_id;//用户编号
    @Column
    private long shop_id;//商店编号
    @Column
    private long product_id;//商品编号
    @Column
    private boolean is_product_exists;//是否有效
    @Column
    private int number;//购买数量
    @Column
    private long created_time;//创建时间


    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getShop_id() {
        return shop_id;
    }

    public void setShop_id(long shop_id) {
        this.shop_id = shop_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public boolean isIs_product_exists() {
        return is_product_exists;
    }

    public void setIs_product_exists(boolean is_product_exists) {
        this.is_product_exists = is_product_exists;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(long created_time) {
        this.created_time = created_time;
    }
}
