package Mvc.beans;

import com.sun.istack.internal.NotNull;
import jdk.internal.instrumentation.InstrumentationMethod;

/**
 * ClassName:Student
 * Package:Mvc.beans
 *
 * @date:2020/2/7 18:49
 */
public class Student {
//    @NotNull(message="姓名不能为空")
//    @Size(min=3,max=6,message="姓名长度应在{min}-{max}之间")
    private String name;
//    @Min(value=0,message="成绩不能小于{value}")
//    @Max(value=100,message="成绩不能大于{value}")
    private double score;
//    @NotNull(message="电话不能为空")
//    @Pattern(regexp="^1[34578]\\d{9}$",message="手机号格式不正确")
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
