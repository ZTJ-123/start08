package com.spmy.demo.mapper;
import com.spmy.demo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    public List<Admin> findAll();

}
