package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class OVQ {
    public final C62320sa A00;
    public final C62320sa A01;
    public final 0sP A02;
    public final UserSession A03;
    public final 1ZL A04;
    public final 0sP A05;
    public final 0sP A06;

    public OVQ(UserSession userSession, 1ZL r3, C62320sa r4, C62320sa r5, 0sP r6, 0sP r7, 0sP r8) {
        DbW.A1N(r6, 3, r4);
        this.A03 = userSession;
        this.A04 = r3;
        this.A02 = r6;
        this.A05 = r7;
        this.A00 = r4;
        this.A01 = r5;
        this.A06 = r8;
    }

    public static final OVQ A00(UserSession userSession) {
        if (userSession == null) {
            return C70123Nxd.A00(userSession);
        }
        return (OVQ) userSession.A01(OVQ.class, C73911Plm.A00(userSession, 27));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0Js] */
    public final void A01(AnonymousClass5HJ r7) {
        C74473PvT pvT = (C74473PvT) this.A06.invoke(r7);
        if (pvT.Etg()) {
            UserSession userSession = this.A03;
            if (userSession != null && 0qQ.A0K(userSession.A06, r7.A0j) && pvT.Etf()) {
                this.A05.invoke(Integer.valueOf(r7.A08.A01));
                this.A04.A02();
            }
            String str = r7.A0j;
            if (userSession == null || !C66580MXl.A1X(userSession, str)) {
                if (!pvT.Eth()) {
                    return;
                }
            } else if (!C51971G9r.A1b(this.A00) || C51971G9r.A1b(this.A01)) {
                return;
            }
            if (this.A04.A04()) {
                09i.A0A.A0A(new Object(), (0Jv) null, C72938PPw.A00, str);
            }
            AnonymousClass3H3 CsR = pvT.CsR();
            11Z.A02(new C73366PbP(CsR, new AnonymousClass3H4(CsR, (List) null, (Map) null), this, str));
        }
    }
}
