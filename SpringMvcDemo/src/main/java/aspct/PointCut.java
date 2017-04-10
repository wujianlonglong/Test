package aspct;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by wjll9 on 2017/4/8.
 */

public class PointCut {
    public void play(){
        System.out.println("执行切点方法");
    }
}
