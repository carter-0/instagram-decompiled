package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kha  reason: case insensitive filesystem */
public enum C62544Kha {
    FEED_POST(1),
    CLIPS(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62544Kha[] khaArr;
        A02 = 0oU.A00(khaArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62544Kha kha : values()) {
            C51967G9n.A1O(kha, A0x, kha.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62544Kha(int i) {
        this.A00 = i;
    }
}
