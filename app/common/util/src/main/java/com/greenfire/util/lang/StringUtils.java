package com.greenfire.util.lang;

/**
 * 字符串操作工具类
 */
public class StringUtils {

    /**
     * 返回对象的String
     *
     * 如果obj为空，则返回 null
     *
     * @param obj
     * @return
     */
    public static String toString(Object obj) {
        if(obj == null) {
            return null;
        }

        return obj.toString();
    }

    /**
     * 判断字符串是不是数字
     *
     * @param numStr
     * @return
     */
    public static boolean isNumberic(String numStr) {

        return false;
    }
}
