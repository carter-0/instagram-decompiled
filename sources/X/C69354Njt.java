package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Njt  reason: case insensitive filesystem */
public enum C69354Njt {
    UNDEFINED(DbT.A12(r5, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE")),
    IG_DIRECT_IN_THREAD_SUGGESTION_SR_UPSELL(DbT.A12(r5, "IG_DIRECT_IN_THREAD_SUGGESTION_SR_UPSELL")),
    IG_EXAMPLE(DbT.A12(r5, "IG_EXAMPLE")),
    IG_IIC(DbT.A12(r5, "IG_IIC")),
    IG_SCAM_ABOUT_THIS_ACCOUNT_THREAD_VIEW(DbT.A12(r5, "IG_SCAM_ABOUT_THIS_ACCOUNT_THREAD_VIEW")),
    IG_SCAM_VICTIM_INITIATED_THREAD_VIEW(DbT.A12(r5, "IG_SCAM_VICTIM_INITIATED_THREAD_VIEW")),
    IG_COMPROMISED_THREAD_VIEW(DbT.A12(r5, "IG_COMPROMISED_THREAD_VIEW")),
    IG_UNVETTED_DEVICE(DbT.A12(r5, "IG_UNVETTED_DEVICE")),
    IG_SEXUAL_HARASSMENT(DbT.A12(r5, "IG_SEXUAL_HARASSMENT")),
    IG_LOCATION_WARNING_THREAD_VIEW(DbT.A12(r5, "IG_LOCATION_WARNING_THREAD_VIEW"));
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69354Njt[] njtArr;
        A02 = 0oU.A00(njtArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (C69354Njt njt : values()) {
            A0x.put(njt.A00, njt);
        }
        A01 = 0k2.A0J(A0x, C74100Pp3.A00);
    }

    /* access modifiers changed from: public */
    C69354Njt(String str) {
        this.A00 = str;
    }
}
