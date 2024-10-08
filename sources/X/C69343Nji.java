package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nji  reason: case insensitive filesystem */
public enum C69343Nji {
    DEFAULT(0),
    MEDIA(1),
    THREAD(2),
    INSTAMADILLO_STAGING(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69343Nji[] njiArr;
        A02 = 0oU.A00(njiArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69343Nji nji : values()) {
            C51967G9n.A1O(nji, A0x, nji.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C69343Nji(int i) {
        this.A00 = i;
    }
}
