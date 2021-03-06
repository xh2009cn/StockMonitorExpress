package com.wly.stock.service.http;

import com.wly.common.Utils;
import org.restexpress.Request;
import org.restexpress.Response;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wuly on 2017/8/12.
 */
public class UserLoginControl
{
    //for post
    public String create(Request req, Response res)
    {
        String ret = null;
        Map<String, List<String>> queryInfo = req.getBodyFromUrlFormEncoded();
        if(!queryInfo.containsKey("account"))
        {
            return Utils.FormatResult(-1, "account is null");
        }

        if(!queryInfo.containsKey("password"))
        {
            return Utils.FormatResult(-1, "password is null");
        }

        return Utils.FormatResult(0, "login succ");
    }

    //for Get
    public String read(Request req, Response res)
    {
        System.out.println("UserLoginControl Get: "+req.getBaseUrl());
        Map<String, String> queryString = req.getQueryStringMap();
        Iterator iter = queryString.entrySet().iterator();
        while (iter.hasNext())
        {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        return "UserLoginControl read";
    }

    public String update(Request req, Response res)
    {
        System.out.println("UserLoginControl update: "+req.getBaseUrl());
        return "UserLoginControl Post update";
    }

    public String readAll(Request request, Response response)
    {
        System.out.println("UserLoginControl readAll: "+request.getBaseUrl());
        return "UserLoginControl readAll";
    }
}
