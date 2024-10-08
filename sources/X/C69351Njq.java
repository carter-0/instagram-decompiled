package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Njq  reason: case insensitive filesystem */
public enum C69351Njq {
    HEARTBEAT("HEARTBEAT"),
    STARTED("STARTED"),
    ENDED("ENDED"),
    JOINED("JOINED"),
    LEFT("LEFT"),
    QUESTION_ACTIVATED("QUESTION_ACTIVATED");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69351Njq[] njqArr;
        A02 = 0oU.A00(njqArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69351Njq njq : values()) {
            A0x.put(njq.A00, njq);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C69351Njq(String str) {
        this.A00 = str;
    }
}
