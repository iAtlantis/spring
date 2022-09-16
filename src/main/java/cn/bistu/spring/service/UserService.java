package cn.bistu.spring.service;

import cn.bistu.spring.entity.SysUser;
import cn.bistu.spring.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Alex
 * @Description :
 */
@Service
public class UserService extends ServiceImpl<UserMapper,SysUser> {
    public boolean saveUser(SysUser user) {
        return saveOrUpdate(user);
    }
//    @Autowired
//    private UserMapper userMapper;
//
//    public int save(SysUser user){
//        if(user.getId()==null)
//            return userMapper.insert(user);
//        else
//            return userMapper.update(user);
//    }
//
//    public Map<String, Object> findPage(Integer pageNum, Integer pageSize) {
//        pageNum = pageNum>0?(pageNum-1)*pageSize:0;
//        Integer total= userMapper.selectTotal();
//        List<SysUser> data = userMapper.findPage(pageNum, pageSize);
//        Map<String,Object> res = new HashMap<>();
//        res.put("data",data);
//        res.put("total",total);
//
//
//        return res;
//    }

    
}
