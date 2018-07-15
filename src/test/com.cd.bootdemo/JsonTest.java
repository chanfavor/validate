package com.cd.bootdemo;

import com.alibaba.fastjson.JSON;
import com.cd.bootdemo.bean.ArgumentInvalidResult;
import com.cd.bootdemo.bean.ResultMsg;
import com.cd.bootdemo.bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    @Test
    public void jsonTest () {

        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(567);
        resultMsg.setMessage("参数错误");

        List<ArgumentInvalidResult> invalidResults = new ArrayList<>();
        ArgumentInvalidResult argumentInvalidResult = new ArgumentInvalidResult();
        argumentInvalidResult.setDefaultMessage("eew");
        argumentInvalidResult.setField("age");
        argumentInvalidResult.setRejectedValue(null);

        invalidResults.add(argumentInvalidResult);
        resultMsg.setInvalidResults(invalidResults);
        System.out.println(JSON.toJSONString(resultMsg));

        User user = new User();
        user.setAge(23);
        user.setId(2);
        System.out.println(JSON.toJSONString(user));


    }
}
