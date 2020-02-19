package Mvc.converter;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * ClassName:MyDateConverter
 * Package:Mvc.converter
 *
 * @date:2020/2/10 20:20
 */
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf=getDateFormat(s);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SimpleDateFormat getDateFormat(String s) {
        SimpleDateFormat sdf=new SimpleDateFormat();
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
