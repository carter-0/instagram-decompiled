package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EVu  reason: case insensitive filesystem */
public enum C48102EVu {
    DISMISS("dismiss"),
    VIEW_REQUESTS("view_requests");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48102EVu[] eVuArr;
        A02 = 0oU.A00(eVuArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C48102EVu eVu : values()) {
            A0x.put(eVu.A00, eVu);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C48102EVu(String str) {
        this.A00 = str;
    }
}
