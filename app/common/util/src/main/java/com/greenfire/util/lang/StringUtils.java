package com.greenfire.util.lang;

/**
 * �ַ�������������
 */
public class StringUtils {

    /**
     * ���ض����String
     *
     * ���objΪ�գ��򷵻� null
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
     * �ж��ַ����ǲ�������
     *
     * @param numStr
     * @return
     */
    public static boolean isNumberic(String numStr) {

        return false;
    }
}
