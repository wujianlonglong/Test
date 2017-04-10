package aspct;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by wjll9 on 2017/4/8.
 */
@Aspect
public class Advice {
    @Pointcut("execution(* aspct.PointCut.play(..))")
    public void playmance(){

    }

    @Before("playmance()")
    public void take(){
        System.out.println("执行切点前的方法");
    }

    @AfterReturning("playmance()")
    public void app(){
        System.out.println("执行切点之后的方法");
    }

    @AfterThrowing("playmance()")
    public void deman(){
        System.out.println("执行切点报错之后的方法");
    }
}
