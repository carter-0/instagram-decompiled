package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hep  reason: case insensitive filesystem */
public abstract class C55260Hep {
    public static final void A00(UserSession userSession, AnonymousClass4DU r4, String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        DbW.A1L(((GJ1) userSession.A01(GJ1.class, new C45999DId(userSession, 5))).A00.AR4(), str);
        if (str3 != null) {
            C254523sc A0n = C51965G9l.A0n(r4, 002.A0R("instagram_ad_", "report_button"));
            A0n.A7J = str2;
            A0n.A6o = str3;
            A0n.A6z = "report_button";
            C233822wX.A0H(userSession, A0n, r4);
        }
    }
}
