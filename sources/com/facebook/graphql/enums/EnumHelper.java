package com.facebook.graphql.enums;

import java.util.Locale;

public abstract class EnumHelper {
    public static Enum A00(String str, Enum enumR) {
        if (!(str == null || str.length() == 0)) {
            try {
                return Enum.valueOf(enumR.getClass(), str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return enumR;
    }
}
