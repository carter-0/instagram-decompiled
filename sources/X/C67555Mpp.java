package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mpp  reason: case insensitive filesystem */
public enum C67555Mpp {
    UNDEFINED(DbT.A12(r4, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE")),
    TRIGGER_CAMERA(DbT.A12(r4, "TRIGGER_CAMERA")),
    TRIGGER_OPEN_THREAD_LIST(DbT.A12(r4, "TRIGGER_OPEN_THREAD_LIST")),
    TRIGGER_OPEN_THREAD_VIEW(DbT.A12(r4, "TRIGGER_OPEN_THREAD_VIEW")),
    TRIGGER_MEDIA_GALLERY(DbT.A12(r4, "TRIGGER_MEDIA_GALLERY"));
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C67555Mpp[] mppArr;
        08f A002 = 0oU.A00(mppArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A002));
        for (Object next : A002) {
            A0x.put(((C67555Mpp) next).A00, next);
        }
        A01 = 0k2.A0J(A0x, C67556Mpq.A00);
    }

    /* access modifiers changed from: public */
    C67555Mpp(String str) {
        this.A00 = str;
    }
}
