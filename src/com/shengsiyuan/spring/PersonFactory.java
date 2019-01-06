package com.shengsiyuan.spring;

/**
 * @author huaishi
 */
public class PersonFactory {
    public static Person getPerson(String str){
        if(str.equalsIgnoreCase("chinese")){
            return new Chinese();
        }
        return new American();
    }
}
