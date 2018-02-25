package com.icexxx.iceformat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class IceNumRoundUtil {
    public static BigDecimal round(BigDecimal num, int newScale) {
        if (num == null) {
            return null;
        }
        return num.setScale(newScale, RoundingMode.HALF_UP);
    }

    public static BigDecimal round(Double num, int newScale) {
        if (num == null) {
            return null;
        }
        return new BigDecimal(String.valueOf(num)).setScale(newScale, RoundingMode.HALF_UP);
    }
}
