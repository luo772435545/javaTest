package com.lu.dao;

import com.lu.entity.Currency;

import java.util.List;

/**
 * @author GAN
 */
public interface CurrencyDao {
    /**
     * 获取地区
     * @return List
     * */
    List<Currency> getCurrency();
}
