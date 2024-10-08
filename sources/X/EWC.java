package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EWC {
    PASSWORD("Password"),
    NONCE("Nonce"),
    LOCALAUTH("LocalAuth"),
    IG_SSO("IG_SSO"),
    FB_SSO("FB_SSO"),
    OPENID("OpenID"),
    UNKNOWN("Unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWC[] ewcArr;
        A02 = 0oU.A00(ewcArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EWC ewc : values()) {
            A0x.put(ewc.A00, ewc);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EWC(String str) {
        this.A00 = str;
    }
}
