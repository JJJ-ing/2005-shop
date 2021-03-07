package com.baidu.shop.service;

import com.alibaba.fastjson.JSONObject;
import com.baidu.shop.base.Result;
import com.baidu.shop.dto.BrandDTO;
import com.baidu.shop.entity.BrandEntity;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "品牌接口")
public interface BrandService {
    @GetMapping(value = "brand/list")
    @ApiOperation(value = "查询品牌列表")
    Result<PageInfo<BrandEntity>> getBrandInfo(BrandDTO brandDTO);

    @PostMapping(value = "brand/save")
    @ApiOperation(value = "新增品牌列表")
    Result<JSONObject> saveBrandInfo(@RequestBody BrandDTO brandDTO);

    @PutMapping(value = "brand/save")
    @ApiOperation(value = "修改品牌列表")
    Result<JSONObject> editBrandInfo(@RequestBody BrandDTO brandDTO);

    @DeleteMapping(value = "brand/delete")
    @ApiOperation(value = "通过id删除品牌信息")
    Result<JSONObject> deleteBrandInfo(Integer id);

    @GetMapping(value = "brand/getBrandInfoByCategoryId")
    @ApiOperation(value = "通过分类id查询品牌")
    Result<List<BrandEntity>> getBrandInfoByCategoryId(Integer cid);

    @GetMapping(value = "brand/getBrandByIdList")
    @ApiOperation(value = "查询通过id集合品牌列表")
    Result<List<BrandEntity>> getBrandByIdList(@RequestParam String ids);
}
