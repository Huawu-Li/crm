package com.ly.workbench.service.impl;

import com.ly.workbench.dao.CustomerDao;
import com.ly.workbench.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public List<String> getCustomerName(String name) {

        List<String> sList = customerDao.getCustomerName(name);

        return sList;
    }
}
