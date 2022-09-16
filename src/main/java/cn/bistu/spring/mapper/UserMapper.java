package cn.bistu.spring.mapper;

import cn.bistu.spring.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : Alex
 * @Description :
 */
//@Mapper
public interface UserMapper extends BaseMapper<SysUser> {



}
