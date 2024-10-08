package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class P3W implements C74480Pva {
    public final C67195Mjr A00;
    public final 1a8 A01 = new 1a8((C269794fh) null);
    public final 1a8 A02 = C66580MXl.A0O();
    public final UserSession A03;

    public final 1aU ANV() {
        return C66789Mca.A00(this.A00.A01, C74054PoJ.A00, 5).A0L(C72093Ow6.A00);
    }

    public final 1aU ANW() {
        return C66789Mca.A00(this.A00.A01, C74055PoK.A00, 5).A0L(C72094Ow7.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.PrZ] */
    public final void CgG() {
        this.A00.A01(new Object());
    }

    public final void start() {
        this.A00.A00();
        UserSession userSession = this.A03;
        PU8.A00(C66789Mca.A00(MYb.A00(MYc.A01(userSession, "CutoverThreadListLoaderImpl").A01), C74056PoL.A00, 5), this.A02, this, 45);
        if (182.A06(0Tu.A05, userSession, 36313055140447923L)) {
            Object A012 = userSession.A01(O7T.class, C73760PjL.A00);
            PU8.A00(ANV(), this.A01, A012, 46);
        }
    }

    public final void stop() {
        this.A00.A03.A01();
        this.A02.A01();
        this.A01.A01();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.OIu] */
    public P3W(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = new C67195Mjr(1aU.A09(new N8S((Map) null, (Set) null, false)), C318146oT.A00, 0sr.A1P(new C70737OIu[]{new Object(), new Object()}), AnonymousClass7TE.A1I(new C68923Nb2(AnonymousClass6EY.A00(userSession, "CutoverThreadListLoaderImpl"))));
    }
}
