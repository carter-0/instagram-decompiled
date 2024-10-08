package X;

import java.util.HashMap;

/* renamed from: X.K8j  reason: case insensitive filesystem */
public final class C61455K8j extends L3Q {
    public C61455K8j() {
        int i;
        String str;
        this.A00 = 2131975402;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (Integer num : AnonymousClass05K.A00(7)) {
            switch (num.intValue()) {
                case 1:
                    i = 2131975397;
                    break;
                case 2:
                    i = 2131975398;
                    break;
                case 3:
                    i = 2131975399;
                    break;
                case 4:
                    i = 2131975394;
                    break;
                case 5:
                    i = 2131975396;
                    break;
                case 6:
                    i = 2131975402;
                    break;
                default:
                    i = 2131975401;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            switch (num.intValue()) {
                case 1:
                    str = "ONE_MONTH";
                    break;
                case 2:
                    str = "THREE_MONTHS";
                    break;
                case 3:
                    str = "SIX_MONTHS";
                    break;
                case 4:
                    str = "ONE_YEAR";
                    break;
                case 5:
                    str = "TWO_YEARS";
                    break;
                case 6:
                    str = "LIFETIME";
                    break;
                default:
                    str = "ONE_WEEK";
                    break;
            }
            A1E.put(valueOf, str);
        }
        this.A01 = A1E;
    }
}
