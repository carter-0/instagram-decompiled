package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMo  reason: case insensitive filesystem */
public enum C54657HMo {
    FACEBOOK("facebook"),
    HORIZON("horizon"),
    LIKE("like"),
    META("meta"),
    THREADS("threads");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C54657HMo[] hMoArr;
        08f A002 = 0oU.A00(hMoArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A002, 10)));
        for (Object next : A002) {
            A0x.put(((C54657HMo) next).A00, next);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54657HMo(String str) {
        this.A00 = str;
    }
}
