package com.djyz.web;

import com.alibaba.fastjson.JSONObject;
import com.djyz.domain.Customer;
import com.djyz.service.CustomerService;
import com.djyz.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Api(value = "/Customer", tags = "Customer接口")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /*查询所有客户---分页*/
    @GetMapping("/getAllCustomer")
    @ResponseBody
    public PageList getAllCustomer(QueryVo vo){
        return customerService.getAllCustomer(vo);
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

    /*修改个人信息 -- 头像，用户名，密码*/
    @ApiOperation("客户修改个人信息--")
    @PostMapping(value = "/editCustomerInfo")
    @ResponseBody
    public AjaxRes editCustomer(Customer customer){
        return customerService.editCustomer(customer);
    }


    /*根据id删除客户*/
    @DeleteMapping("/deleteCustomer/{custId}")
    @ResponseBody
    public AjaxRes deleteCustomer(@PathVariable Long custId){
        return customerService.deleteCustomer(custId);
    }

    /*根据用户 id 退出登录*/
    @GetMapping("/logout/{custId}")
    @ResponseBody
    public AjaxRes custLogout(@PathVariable Long custId){
        return customerService.custLogout(custId);
    }


}
