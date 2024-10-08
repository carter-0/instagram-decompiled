package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EVp  reason: case insensitive filesystem */
public enum C48097EVp {
    IFY("ify"),
    MEMU("memu");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C48097EVp[] eVpArr;
        08f A002 = 0oU.A00(eVpArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A002, 10)));
        for (Object next : A002) {
            A0x.put(((C48097EVp) next).A00, next);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C48097EVp(String str) {
        this.A00 = str;
    }
}
