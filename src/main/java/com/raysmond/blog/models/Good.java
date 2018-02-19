package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "good")
@Getter
@Setter
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "goodCache")
public class Good extends BaseModel {

    @Column(unique = true)
    private long good_id;//自动编号

    @Column
    private String good_name;

    public long getGood_id() {
        return good_id;
    }

    public void setGood_id(long good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }
}

