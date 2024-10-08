package X;

import com.instagram.common.session.UserSession;

public final class HB9 extends AnonymousClass369 {
    public final C311486cl A00;
    public final UserSession A01;
    public final C270414gh A02;

    public final Class C9I() {
        return C255773uh.class;
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        this.A00.DMD((C255773uh) obj);
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        this.A00.DMU((C255773uh) obj, i);
    }

    public final void FN9(AnonymousClass345 r3, int i) {
        C250973mM r1 = (C250973mM) this.A02.getItem(i);
        if (r1 != null) {
            C255773uh A08 = r1.A08(this.A01);
            if (!A08.A1N()) {
                r3.FNB(A08.CFY(), A08, i);
            }
        }
    }

    public HB9(UserSession userSession, C311486cl r2, C270414gh r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r2;
    }
}
