package cn.bistu.spring.controller;

import cn.bistu.spring.entity.SysUser;
import cn.bistu.spring.mapper.UserMapper;
import cn.bistu.spring.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author : Alex
 * @Description :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public boolean saveUser(@RequestBody SysUser user){
        return userService.saveUser(user);
    }


    @GetMapping("/page")
    public IPage<SysUser> findPage(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @RequestParam(defaultValue = "") String username){
        // 模糊查询
        IPage<SysUser> page = new Page<>(pageNum,pageSize);
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username",username);
        return userService.page(page,queryWrapper);
    }

    @GetMapping("")
    public List<SysUser> findall(){
        return userService.list();
    }


    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }



}
