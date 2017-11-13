package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("company", "Hongmeng");
        System.out.println(new Gson().toJson(map) );
    }
}
