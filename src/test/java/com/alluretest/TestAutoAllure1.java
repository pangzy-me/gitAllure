package com.alluretest;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("功能模块feature1")
public class TestAutoAllure1 {
    String baseStr = "this is a string.";

    @Story("功能模块feature1下的子功能story1")
    @Severity(SeverityLevel.BLOCKER)
    @Test(enabled = true, priority = 1)
    public void testFun1(){
        int a = 1;
        int b = 2;
        int sum = a + b;
        Assert.assertEquals(sum, 3, "a + b 不等于 sum，请检查！");
    }

    @Story("功能模块feature1下的子功能story2")
    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, priority = 4)
    public void testFun2(){
        String str1 = "just a test.";
        String str2 = "just a test.";
        Assert.assertEquals(str1, str2, "str1 不等于 str2，请检查！！！");
    }

    @Story("功能模块feature1下的子功能story2")
    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, priority = 4)
    public void testFun2_1(){
        String str1 = "just a test.";
        String str2 = "just a test.";
        Assert.assertEquals(str1, str2, "str1 不等于 str2，请检查！！！");
    }

    @Story("功能模块feature1下的子功能story2")
    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, priority = 4)
    public void testFun2_2(){
        String str1 = "just a test.";
        String str2 = "just a test.";
        Assert.assertEquals(str1, str2, "str1 不等于 str2，请检查！！！");
    }

    @Story("功能模块feature1下的子功能story3")
    @Severity(SeverityLevel.MINOR)
    @Test(enabled = true, priority = 3)
    public void testFun3(){
        String subStr = "this is a string.";
        Assert.assertEquals(baseStr, subStr, "baseStr 不等于 subStr，请检查！");
    }
}
