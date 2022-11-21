package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        NumberUtils number = new NumberUtils();
        if (!number.isCreatable(str)) {
            return false;
        }
        return number.createNumber(str).doubleValue() > 0;
    }
}
