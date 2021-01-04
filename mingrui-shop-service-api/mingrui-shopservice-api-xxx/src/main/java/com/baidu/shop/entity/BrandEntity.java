package com.baidu.shop.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName BrandEntity
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/12/25
 * @Version V1.0
 **/

@Data
@Table(name = "tb_brand")
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //品牌名称
    private String name;

    private String image;

    private Character letter;
}
