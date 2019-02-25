package xlh.mall.project4.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xlh.mall.project4.AjaxResult;
import xlh.mall.project4.domain.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //限定只允许post请求
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //模拟service层数据
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
}
