package X;

import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.common.session.UserSession;

/* renamed from: X.32e  reason: invalid class name */
public final class AnonymousClass32e {
    public final AnonymousClass32Z A00;

    public AnonymousClass32e(UserSession userSession, String str) {
        0qQ.A0B(str, 2);
        this.A00 = new AnonymousClass32Z(userSession, str);
    }

    public static final void A00(AnonymousClass32e r5, 1Xj r6, String str) {
        OrganicCTAType AtT;
        String str2;
        long j;
        String A002 = LLF.A00(r6.BR7().A00);
        AnonymousClass5HT BYk = r6.A0C.BYk();
        if (BYk != null && (AtT = BYk.AtT()) != null && (str2 = AtT.A00) != null) {
            C2360032a r1 = r5.A00.A00;
            1Ln r2 = (1Ln) r1.A01.getValue();
            if (r2 != null) {
                Long A0n = 00y.A0n(10, r1.A00.A06);
                if (A0n != null) {
                    j = A0n.longValue();
                } else {
                    j = 0;
                }
                r2.A0Q("author_igid", Long.valueOf(j));
                r2.A0R("cta_type", str2);
                r2.A0R("media_type", A002);
                r2.A0q(str);
                r2.Cgf();
            }
        }
    }
}
