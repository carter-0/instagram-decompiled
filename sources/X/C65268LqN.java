package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqN  reason: case insensitive filesystem */
public final class C65268LqN implements C66485MTo {
    public final /* synthetic */ NJR A00;

    public C65268LqN(NJR njr) {
        this.A00 = njr;
    }

    public final void Drq() {
        NJR njr = this.A00;
        UserSession A05 = njr.A05();
        String str = njr.A08;
        AnonymousClass7TG.A1N(A05, str);
        OZ3.A00(A05, "customer_details_tos_accept", str, 0Yt.A0E());
        C67730Mtj mtj = njr.A05;
        if (mtj == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7TE.A1Z(new C73565Pfm(mtj, (AnonymousClass4D7) null, 20), C318116oQ.A00(mtj));
        if (njr.isAdded()) {
            njr.A06 = AnonymousClass05K.A01;
            DbU.A0L(njr, 2dZ.A0t).A0T();
        }
    }

    public final void Drr() {
        NJR njr = this.A00;
        UserSession A05 = njr.A05();
        String str = njr.A08;
        AnonymousClass7TG.A1N(A05, str);
        OZ3.A00(A05, "customer_details_tos_decline", str, 0Yt.A0E());
    }
}
