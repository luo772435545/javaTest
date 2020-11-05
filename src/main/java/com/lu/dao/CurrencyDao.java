package com.lu.dao;

import com.lu.entity.Currency;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GAN
 */
public interface CurrencyDao {
    /**
     * 获取地区
     * @param currencyCode 地区code
     * @return List
     * */
    List<Currency> getCurrency(String currencyCode);
}
