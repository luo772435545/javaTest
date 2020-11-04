package com.lu.entity;

/**
 * @author GAN
 */
public class Currency {
    private String currency_name;
    private String currency_code;
    private String currency_cn_name;
    private String remark;

    @Override
    public String toString() {
        return "Currency{" +
                "currency_name='" + currency_name + '\'' +
                ", currency_code='" + currency_code + '\'' +
                ", currency_cn_name='" + currency_cn_name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getCurrency_cn_name() {
        return currency_cn_name;
    }

    public void setCurrency_cn_name(String currency_cn_name) {
        this.currency_cn_name = currency_cn_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

