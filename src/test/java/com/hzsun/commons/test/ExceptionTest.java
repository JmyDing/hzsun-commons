package com.hzsun.commons.test;

import com.hzsun.commons.exception.HZSunServiceException;
import com.hzsun.commons.util.ExceptionUtil;
import org.junit.Test;

/**
 * @Author: DingJl
 * @Date: 2020/12/18 11:28
 * @Version 1.0
 */
public class ExceptionTest {


    @Test
    public  void printException(){
        HZSunServiceException  hzSunServiceException=new HZSunServiceException("200","error",new NullPointerException());
        String trace=ExceptionUtil.getTrace(hzSunServiceException);
        System.out.println(trace);
    }

}
