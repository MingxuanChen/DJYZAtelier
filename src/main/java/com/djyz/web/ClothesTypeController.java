package com.djyz.web;

import com.djyz.util.AjaxRes;
import com.djyz.domain.ClothesType;
import com.djyz.service.ClothesTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(value = "/ClothesType", tags = "ClothesType接口")
public class ClothesTypeController {
    @Autowired
    private ClothesTypeService clothesTypeService;

    /*获取全部租赁衣服种类*/
    @GetMapping("/getAllClothesTypes")
    @ResponseBody
    @ApiOperation(value = "根据id获取用户信息", notes = "获取信息", httpMethod = "GET")
    public List<ClothesType> getAllClothesType(){
        List<ClothesType> allClothesType = clothesTypeService.getAllClothesType();
        return allClothesType;
    }

    /*获取全部租赁衣服种类-包括租赁服装*/
    @GetMapping("/getTypeAndClothes")
    @ResponseBody
    public List<ClothesType> getTypeAndClothes(){
        List<ClothesType> allClothesType = clothesTypeService.getTypeAndClothes();
        return allClothesType;
    }



    /*增加衣服种类*/
    @PostMapping("/addClothesType")
    @ResponseBody
    public AjaxRes addClothesType(ClothesType clothesType){
        return clothesTypeService.addClothesType(clothesType);
    }

    /*删除衣服分类*/
    @DeleteMapping("/deleteClothesType/{id}")
    @ResponseBody
    public AjaxRes deleteClothesType(@PathVariable("id") Long id){
        return clothesTypeService.deleteClothesType(id);
    }

    /*根据id获取---修改衣服种类信息*/
    @GetMapping("/getClothesTypeWith/{id}")
    @ResponseBody
    public ClothesType editClothesType(@PathVariable("id") Long id){
        return clothesTypeService.getClothesTypeWithId(id);
    }

    /*更新*/
    @PutMapping("/editClothesType")
    @ResponseBody
    public AjaxRes editClothesType(ClothesType clothesType){
        return clothesTypeService.updateClothesType(clothesType);
    }



}
