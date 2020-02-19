package Mvc.handlers;

import Mvc.exceptions.ageException;
import Mvc.exceptions.nameException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName:BaseController
 * Package:Mvc.handlers
 *
 * @date:2020/2/10 15:52
 */
public class BaseController {
    @ExceptionHandler(nameException.class)
    public ModelAndView HandlerNameException(Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",e);
        mv.setViewName("/jsp/nameError.jsp");
        return mv;
    }
    @ExceptionHandler(ageException.class)
    public ModelAndView HandlerAgeException(Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",e);
        mv.setViewName("/jsp/ageError.jsp");
        return mv;
    }
    @ExceptionHandler()
    public ModelAndView HandlerOtherException(Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",e);
        mv.setViewName("/jsp/error.jsp");
        return mv;
    }
}
