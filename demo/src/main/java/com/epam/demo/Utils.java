package com.epam.demo;

import java.util.List;
import org.apache.commons.lang3.math.NumberUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = true;
        NumberUtils numberUtils = new NumberUtils();
        for (String arg : args) {
            if (numberUtils.createDouble(arg) < 0) {
                isAllPositive = false;
                break;
            }
        }
       return isAllPositive;
    }
}