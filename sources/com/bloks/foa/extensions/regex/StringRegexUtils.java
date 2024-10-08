package com.bloks.foa.extensions.regex;

import X.0dV;

public final class StringRegexUtils {
    public static final StringRegexUtils INSTANCE = new Object();

    public static final native boolean matchesRegex(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.bloks.foa.extensions.regex.StringRegexUtils] */
    static {
        0dV.A0C("stringregex-jni");
    }
}
