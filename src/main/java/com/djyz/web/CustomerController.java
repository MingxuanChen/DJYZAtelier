package com.djyz.web;

import com.djyz.domain.Customer;
import com.djyz.service.CustomerService;
import com.djyz.util.AjaxRes;
import io.swagger.annotations.Api;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(value = "/Customer", tags = "Customer接口")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /*查询所有客户*/
    @GetMapping("/getAllCustomer")
    @ResponseBody
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    /*注册--添加客户*/
    @GetMapping("/addCustomer")
    @ResponseBody
    public AjaxRes addCustomer(Customer customer){
        return customerService.addCustomer(customer);
    }

    /*登录*/
    @GetMapping("/CustomerLogin")
    @ResponseBody
    public AjaxRes CustomerLogin(Customer customer){
        return customerService.customerLogin(customer);
    }

    /*根据id查询客户*/
    @GetMapping("/getCustomerWithId/{custId}")
    @ResponseBody
    public Customer getCustomerWithId(@PathVariable Long custId){
       return customerService.getCustomerWithId(custId);
    }

    /*上传头像*/
    @PostMapping("/addHeader/{headerPic}")
    @ResponseBody
    public AjaxRes addHeader(@PathVariable String headerPic ){
        return customerService.addHeader(headerPic);
    }

    /*修改信息*/
    @PutMapping("/editCustomer")
    @ResponseBody
    public AjaxRes editCustomer(Customer customer){
        return customerService.editCustomer(customer);
    }




}
