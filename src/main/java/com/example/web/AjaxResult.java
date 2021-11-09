package com.example.web;

import java.util.HashMap;

/**
 * @author wanlx
 */
public class AjaxResult extends HashMap<String,Object> {
    public static final String CODE_TAG = "code";
    public static final String DATA_TAG = "data";
    public static final String MSG_TAG = "msg";

    public AjaxResult() {
    }

    public AjaxResult (int code,int msg){
          super.put(CODE_TAG,code);
          super.put(MSG_TAG,msg);
    }


}
