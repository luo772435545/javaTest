package com.lu.controller;

import com.lu.dao.CurrencyDao;
import com.lu.entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author GAN
 */
@Controller
public class CurrencyController {
    @Autowired
    private CurrencyDao currencyDao;

    @RequestMapping("getCurrency")
    @ResponseBody
    public List<Currency> getCurrency () {
        return currencyDao.getCurrency();
    }
}
