package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EWB {
    LOGIN("Login"),
    REGISTRATION("Registration"),
    ACCOUNT_RECOVERY("AccountRecovery"),
    AYMH("AccountsYouMayHave"),
    EAR("ExtendedAccountRecovery"),
    EPSILONMAGICLINK("EpsilonMagicLink"),
    UNKNOWN("Unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWB[] ewbArr;
        A02 = 0oU.A00(ewbArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EWB ewb : values()) {
            A0x.put(ewb.A00, ewb);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EWB(String str) {
        this.A00 = str;
    }
}
