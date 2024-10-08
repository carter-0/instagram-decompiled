package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kht  reason: case insensitive filesystem */
public enum C62563Kht {
    GONE("gone"),
    FIRST("first"),
    LAST("last");
    
    public static final Map A01 = null;
    public static final C62563Kht[] A02 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62563Kht[] khtArr;
        A03 = 0oU.A00(khtArr);
        C62563Kht[] values = values();
        A02 = values;
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62563Kht kht : values) {
            A0x.put(kht.A00, kht);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62563Kht(String str) {
        this.A00 = str;
    }
}
