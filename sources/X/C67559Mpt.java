package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mpt  reason: case insensitive filesystem */
public enum C67559Mpt {
    UNDEFINED(DbT.A12(r4, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE")),
    THREAD_LIST(DbT.A12(r4, "THREAD_LIST")),
    THREAD_VIEW(DbT.A12(r4, "THREAD_VIEW")),
    CANONICAL_THREAD_VIEW(DbT.A12(r4, "CANONICAL_THREAD_VIEW"));
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C67559Mpt[] mptArr;
        08f A002 = 0oU.A00(mptArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A002));
        for (Object next : A002) {
            A0x.put(((C67559Mpt) next).A00, next);
        }
        A01 = 0k2.A0J(A0x, C67560Mpu.A00);
    }

    /* access modifiers changed from: public */
    C67559Mpt(String str) {
        this.A00 = str;
    }
}
