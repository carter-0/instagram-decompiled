package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.3sb  reason: invalid class name and case insensitive filesystem */
public abstract class C254513sb {
    public static C254523sc A00(Activity activity, UserSession userSession, 1Xl r5, AnonymousClass4DU r6, Integer num, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z) {
        C254523sc A03 = A03(userSession, r5, r6, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A03.A6k = str;
        A03.A6J = str2;
        A03.A00 = (double) j;
        A03.A0T(Integer.valueOf(i));
        A03.A4g = str4;
        A03.A6a = str5;
        A03.A1V = Boolean.valueOf(z);
        A03.A11 = C324636ze.A00(userSession).A00;
        A03.A6L = str3;
        if (!AnonymousClass3WX.A02(r5.BPf(), r6) && activity != null) {
            A03.A0C(activity, userSession);
        }
        if (num != null) {
            A03.A08(num.intValue());
        }
        String str6 = AnonymousClass1QI.A00.A02.A00;
        if (str6 != null) {
            A03.A65 = str6;
        }
        return A03;
    }

    public static C254523sc A03(UserSession userSession, 1Xl r3, AnonymousClass4DU r4, String str) {
        if (r3 instanceof 1Xj) {
            1Xj BPf = r3.BPf();
            C254523sc A04 = A04(BPf, r4, str);
            A04.A0G(userSession, BPf);
            return A04;
        } else if (r3 instanceof AnonymousClass3OA) {
            AnonymousClass3OA r32 = (AnonymousClass3OA) r3;
            C254523sc A042 = A04(r32, r4, str);
            A042.A0K(userSession, r32);
            return A042;
        } else {
            throw new IllegalArgumentException("Unsupported type of ModelWithMedia");
        }
    }

    public static C254523sc A01(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, AnonymousClass3OA r5, C249763kK r6, Integer num, String str) {
        if (!AnonymousClass3WX.A00(r5, r4)) {
            return null;
        }
        C254523sc A04 = A04(r5, r4, str);
        A04.A0I(userSession, r3, r5);
        if (num != null) {
            A04.A09(num.intValue());
        }
        if (r6 == null) {
            return A04;
        }
        A04.A6t = r6.getSessionId();
        return A04;
    }

    public static C254523sc A02(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, C249763kK r5, Integer num, Integer num2, String str) {
        if (!AnonymousClass3WX.A00(r3, r4)) {
            return null;
        }
        C254523sc A04 = A04(r3, r4, str);
        A04.A0G(userSession, r3);
        if (num != null) {
            A04.A09(num.intValue());
        }
        if (num2 != null) {
            A04.A07 = num2.intValue();
        }
        if (r5 == null) {
            return A04;
        }
        A04.A6t = r5.getSessionId();
        return A04;
    }

    public static C254523sc A04(1Nv r1, AnonymousClass4DU r2, String str) {
        String str2;
        if (AnonymousClass3WX.A02(r1, r2)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C254523sc(r2, 002.A0R(str2, str));
    }
}
