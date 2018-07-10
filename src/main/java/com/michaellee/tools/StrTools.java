package com.michaellee.tools;

public class StrTools {
    /**
     * 判断字符串是否为数字，支持整数、小数、正数、负数
     *
     * @param str
     * @return
     */
    public static boolean isStrNumeric(String str) {
        if (str.length() <= 0) {
            return false;
        } else {
            Boolean strResult = str.matches("-?[0-9]+.?[0-9]*");
            return strResult;
        }
    }

    /**
     * 判断字符串是否为整数
     *
     * @param str
     * @return
     */
    public static boolean isStrInt(String str) {
        if (str.length() <= 0) {
            return false;
        } else {
            //如果str的值超过int的最大值，则抛出异常。
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return false;
            }

            Boolean strResult = str.matches("-?[0-9]*");
            return strResult;
        }
    }

    /**
     * 判断字符串是否为英文
     * @param word
     * @return
     */
    private boolean strIsEnglish(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                    && !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }
}
