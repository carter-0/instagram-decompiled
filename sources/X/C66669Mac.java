package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mac  reason: case insensitive filesystem */
public abstract class C66669Mac {
    public static final C66665MaY A02(UserSession userSession, C70621ODs oDs, Class cls) {
        return A04(userSession, oDs, cls, (String) null, (String) null, false);
    }

    public static final C66665MaY A03(UserSession userSession, C70621ODs oDs, Class cls, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        0qQ.A0B(userSession, 0);
        boolean A00 = C66666MaZ.A00(userSession, C66666MaZ.A01, cls);
        if (str4 == null) {
            str4 = DbV.A0s();
        }
        return new C66665MaY(oDs, (Boolean) null, str4, str2, (String) null, str, A00, z, z2, false, false);
    }

    public static final C66665MaY A04(UserSession userSession, C70621ODs oDs, Class cls, String str, String str2, boolean z) {
        String str3 = str2;
        0qQ.A0B(userSession, 0);
        boolean A00 = C66666MaZ.A00(userSession, C66666MaZ.A01, cls);
        if (str2 == null) {
            str3 = DbV.A0s();
        }
        return new C66665MaY(oDs, (Boolean) null, str3, str, (String) null, "", A00, z, false, false, false);
    }

    public static final C66665MaY A05(UserSession userSession, C70621ODs oDs, Class cls, String str, boolean z) {
        0qQ.A0B(userSession, 0);
        return new C66665MaY(oDs, (Boolean) null, DbV.A0s(), str, (String) null, "", C66666MaZ.A00(userSession, C66666MaZ.A01, cls), z, false, false, false);
    }

    public static final C66665MaY A06(UserSession userSession, C70621ODs oDs, Class cls, String str, boolean z, boolean z2) {
        return A03(userSession, oDs, cls, (String) null, str, (String) null, z, z2);
    }

    public static final C66665MaY A07(UserSession userSession, Class cls) {
        0qQ.A0B(userSession, 0);
        return new C66665MaY((C70621ODs) null, (Boolean) null, DbV.A0s(), (String) null, (String) null, "", C66666MaZ.A00(userSession, C66666MaZ.A01, cls), false, false, false, false);
    }

    public static final C66665MaY A00(UserSession userSession, C70621ODs oDs) {
        return new C66665MaY(oDs, (Boolean) null, DbV.A0s(), (String) null, (String) null, "", C66666MaZ.A00(userSession, C66666MaZ.A01, C66261lL.class), false, false, false, false);
    }

    public static final C66665MaY A01(UserSession userSession, C70621ODs oDs, Boolean bool, Class cls, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        0qQ.A0B(userSession, 0);
        boolean A00 = C66666MaZ.A00(userSession, C66666MaZ.A01, cls);
        if (str3 == null) {
            str4 = DbV.A0s();
        }
        return new C66665MaY(oDs, bool, str4, str2, (String) null, str, A00, z, z2, false, false);
    }

    public static final C66665MaY A08(UserSession userSession, Class cls) {
        return A07(userSession, cls);
    }
}
