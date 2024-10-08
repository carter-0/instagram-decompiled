package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dgu  reason: case insensitive filesystem */
public enum C46552Dgu {
    NOT_INVALIDATE("not_invalidate"),
    SEEN_STATE("seen"),
    APP_INSTALL("app_install"),
    X_OUT("x-out"),
    ADS_INSERTED("ads_inserted"),
    ADS_POOL("ads_pool"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C46552Dgu[] dguArr;
        A02 = 0oU.A00(dguArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C46552Dgu dgu : values()) {
            A0x.put(dgu.A00, dgu);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C46552Dgu(String str) {
        this.A00 = str;
    }
}
