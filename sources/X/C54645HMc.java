package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMc  reason: case insensitive filesystem */
public enum C54645HMc {
    VIEWER("viewer"),
    CHANNEL("channel");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C54645HMc[] hMcArr;
        A02 = 0oU.A00(hMcArr);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (C54645HMc hMc : values()) {
            A1H.put(hMc.A00, hMc);
        }
        A01 = A1H;
    }

    /* access modifiers changed from: public */
    C54645HMc(String str) {
        this.A00 = str;
    }
}
