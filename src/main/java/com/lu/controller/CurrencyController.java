package com.lu.controller;

import com.lu.dao.CurrencyDao;
import com.lu.entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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
    public List<Currency> getCurrency (@RequestParam(value = "currencyCode", defaultValue = "") String currencyCode) {

        /*Currency data = new Currency();
        data.setCurrency_cn_name("热部署测试");
        data.setCurrency_code("nameCode");
        data.setRemark("备注信息");
        List list = new ArrayList();
        list.add(data);
        return list;*/
        return currencyDao.getCurrency(currencyCode);
    }
}
