package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mpr  reason: case insensitive filesystem */
public enum C67557Mpr {
    UNDEFINED(DbT.A12(r4, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE")),
    MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION("MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION"),
    IG_PREVENT_SEXTORTION_ENGAGEMENT(DbT.A12(r4, "IG_PREVENT_SEXTORTION_ENGAGEMENT")),
    IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK(DbT.A12(r4, "IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK")),
    IG_SAFETY_EDUCATION_NOTICE_PROMPT(DbT.A12(r4, "IG_SAFETY_EDUCATION_NOTICE_PROMPT"));
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C67557Mpr[] mprArr;
        08f A002 = 0oU.A00(mprArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A002));
        for (Object next : A002) {
            A0x.put(((C67557Mpr) next).A00, next);
        }
        A01 = 0k2.A0J(A0x, C67558Mps.A00);
    }

    /* access modifiers changed from: public */
    C67557Mpr(String str) {
        this.A00 = str;
    }
}
