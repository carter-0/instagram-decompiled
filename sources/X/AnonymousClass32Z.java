package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32Z  reason: invalid class name */
public final class AnonymousClass32Z {
    public final C2360032a A00;

    public final void A00(String str, String str2, String str3) {
        long j;
        C2360032a r1 = this.A00;
        1Ln r2 = (1Ln) r1.A02.getValue();
        if (r2 != null) {
            Long A0n = 00y.A0n(10, r1.A00.A06);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = 0;
            }
            r2.A0Q("author_igid", Long.valueOf(j));
            r2.A0R("cta_type", str2);
            r2.A0R("media_type", str);
            r2.A0q(str3);
            r2.Cgf();
        }
    }

    public AnonymousClass32Z(UserSession userSession, String str) {
        this.A00 = new C2360032a(userSession, str);
    }
}
