package com.alluretest2;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("feature2122...")
public class TestAutoAllure22 {
    String baseStr = "this is a string.";

    @Test(enabled = true, priority = 1)
    public void testFun1(){
        int a = 1;
        int b = 2;
        int sum = a + b;
        Assert.assertEquals(sum, 3, "a + b 不等于 sum，请检查！");
    }

    @Story("story21222........")
    @Step("测试步骤2122...")
    @Test(enabled = true, priority = 4)
    public void testFun2(){
        String str1 = "just a test.";
        String str2 = "just a test.";
        Assert.assertEquals(str1, str2, "str1 不等于 str2，请检查！！！");
    }

    @Test(enabled = true, priority = 3)
    public void testFun3(){
        String subStr = "this is a string.";
        Assert.assertEquals(baseStr, subStr, "baseStr 不等于 subStr，请检查！");
    }
}
