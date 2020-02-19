package Mvc.converter;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * ClassName:MyDateEditor
 * Package:Mvc.converter
 *
 * @date:2020/2/11 15:04
 */

//自定义属性编辑器
public class MyDateEditor extends PropertiesEditor {
    @Override
    public void setAsText(String s) throws IllegalArgumentException {
        SimpleDateFormat sdf=getDateFormat(s);
        try {
            Date date=sdf.parse(s);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public SimpleDateFormat getDateFormat(String s) {
        SimpleDateFormat sdf;
        if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }else{
            //若都没有匹配上则抛出此异常
            throw new TypeMismatchException("",Date.class);
        }
        return sdf;
    }
}
