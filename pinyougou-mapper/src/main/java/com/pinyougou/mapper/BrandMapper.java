package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 品牌mapper层
 */
public interface BrandMapper extends Mapper<Brand>{

    /**
     * 查询所有品牌
     * @return
     */
    @Select("select * from tb_brand order by id asc")
    public List<Brand> findAllBrand();
}
