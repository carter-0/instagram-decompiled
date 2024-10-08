package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khi  reason: case insensitive filesystem */
public enum C62552Khi {
    ARCHIVE("archive"),
    DO_NOT_ARCHIVE("do_not_archive"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62552Khi[] khiArr;
        A02 = 0oU.A00(khiArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62552Khi khi : values()) {
            A0x.put(khi.A00, khi);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62552Khi(String str) {
        this.A00 = str;
    }
}
