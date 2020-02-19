package Mvc.handlers;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName:myController
 * Package:Mvc
 *
 * @date:2020/2/2 16:55
 */
@org.springframework.stereotype.Controller
@RequestMapping("/test")
public class myController{
    @RequestMapping(value = "/my.do",produces="text/html;charset=utf-8")
    @ResponseBody
    public Object doSome() {
        System.out.println("执行了处理器");
        return "高泽gaoze";
    }
}
