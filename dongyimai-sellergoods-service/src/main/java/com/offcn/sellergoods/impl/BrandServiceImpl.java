package com.offcn.sellergoods.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.mapper.TbBrandMapper;
import com.offcn.pojo.TbBrand;
import com.offcn.sellergoods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author Today
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    public TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll(){
        List<TbBrand> brandList = brandMapper.selectByExample(null);
        System.out.println("商品列表:"+brandList);
        return brandList;
    }

}
