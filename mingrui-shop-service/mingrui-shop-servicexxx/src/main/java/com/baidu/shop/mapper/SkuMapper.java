package com.baidu.shop.mapper;

import com.baidu.shop.entity.SkuEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface SkuMapper extends Mapper<SkuEntity>, InsertListMapper<SkuEntity> {
}
