package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EVr  reason: case insensitive filesystem */
public enum C48099EVr {
    ACCOUNTS("accounts"),
    HASHTAGS("hashtags");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48099EVr[] eVrArr;
        A02 = 0oU.A00(eVrArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C48099EVr eVr : values()) {
            A0x.put(eVr.A00, eVr);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C48099EVr(String str) {
        this.A00 = str;
    }
}
