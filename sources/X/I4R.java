package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.util.HashMap;

public final class I4R {
    public static final I4R A00 = new Object();

    public static final void A00(0wc r3, String str, String str2, boolean z) {
        Integer num;
        String str3;
        0qQ.A0B(str, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        C51975G9x.A1K(A1E);
        if (z) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (1 - num.intValue() != 0) {
            str3 = "v2_customizable";
        } else {
            str3 = "v2_not_customizable";
        }
        A1E.put("version", str3);
        0Aj A0e = AnonymousClass7TE.A0e(r3, "instagram_wellbeing_limited_interactions_impression");
        G9w.A1C(A0e, str);
        C51969G9p.A1F(A0e, "surface", str2, A1E);
        A0e.Cgf();
    }

    public final void A01(LimitedInteractionsVersions limitedInteractionsVersions, 0wc r5, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        C51975G9x.A1K(A1E);
        C51975G9x.A1B(limitedInteractionsVersions, A1E);
        0Aj A0e = AnonymousClass7TE.A0e(r5, "instagram_wellbeing_limited_interactions_action");
        G9w.A1C(A0e, str);
        C51969G9p.A1F(A0e, "step", str2, A1E);
        A0e.Cgf();
    }

    public final void A02(LimitedInteractionsVersions limitedInteractionsVersions, 0wc r6, String str, boolean z) {
        Integer num;
        String str2;
        HashMap A1E = AnonymousClass7TE.A1E();
        C51975G9x.A1K(A1E);
        C51975G9x.A1B(limitedInteractionsVersions, A1E);
        if (z) {
            num = AnonymousClass05K.A04;
        } else {
            num = AnonymousClass05K.A05;
        }
        if (12 - num.intValue() != 0) {
            str2 = "turn_off";
        } else {
            str2 = "turn_on";
        }
        0Aj A0e = AnonymousClass7TE.A0e(r6, "instagram_wellbeing_limited_interactions_action");
        G9w.A1C(A0e, str);
        C51969G9p.A1F(A0e, "step", str2, A1E);
        A0e.Cgf();
    }
}
