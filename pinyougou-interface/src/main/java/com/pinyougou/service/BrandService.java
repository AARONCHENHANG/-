package com.pinyougou.service;

import com.pinyougou.pojo.Brand;

import java.util.List;

/**
 * 品牌service层
 */
public interface BrandService {

    /**
     * 查询全部品牌
     * @return
     */
    public List<Brand> findAllBrand();
}
