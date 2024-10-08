package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KhV  reason: case insensitive filesystem */
public enum C62539KhV {
    CAMERA("camera");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62539KhV[] khVArr;
        A02 = 0oU.A00(khVArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62539KhV khV : values()) {
            A0x.put(khV.A00, khV);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62539KhV(String str) {
        this.A00 = str;
    }
}
