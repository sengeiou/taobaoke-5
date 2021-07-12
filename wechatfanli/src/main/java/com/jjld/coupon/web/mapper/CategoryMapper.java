package com.jjld.coupon.web.mapper;

import com.jjld.coupon.web.entity.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface CategoryMapper extends Mapper<Category>, MySqlMapper<Category> {
}