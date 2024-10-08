package com.instagram.fx.access.constants;

import X.0oU;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public enum FxcalAccountType {
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        FxcalAccountType[] fxcalAccountTypeArr;
        A02 = 0oU.A00(fxcalAccountTypeArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (FxcalAccountType fxcalAccountType : values()) {
            builder.put(fxcalAccountType.A00, fxcalAccountType);
        }
        A01 = builder.build();
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FxcalAccountType(String str) {
        this.A00 = str;
    }
}
