package com.epam.demo;

import java.util.List;
import org.apache.commons.lang3.math.NumberUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = false;
        for (String arg : args) {
            if (!NumberUtils.isCreatable(arg) || NumberUtils.createNumber(arg).doubleValue() <= 0) {
                isAllPositive = false;
                break;
            }
        }
       return isAllPositive;
    }
}