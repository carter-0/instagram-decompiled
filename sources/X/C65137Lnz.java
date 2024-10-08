package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;

/* renamed from: X.Lnz  reason: case insensitive filesystem */
public final class C65137Lnz implements C66510MUo {
    public final /* synthetic */ C63644L1g A00;

    public C65137Lnz(C63644L1g l1g) {
        this.A00 = l1g;
    }

    public final void DOi() {
        K8A k8a = this.A00.A00;
        if (k8a instanceof C61942KSr) {
            C61942KSr kSr = (C61942KSr) k8a;
            1Wr r2 = 1Wr.A00;
            if (r2 != null) {
                r2.removeLocationUpdates(AnonymousClass7TE.A0l(kSr.A0W), kSr.A0U);
            }
            LJ9.A01(kSr).A1H = null;
            C61942KSr.A0A(kSr);
            return;
        }
        C61941KSq kSq = (C61941KSq) k8a;
        1Wr r22 = 1Wr.A00;
        if (r22 != null) {
            r22.removeLocationUpdates(AnonymousClass7TE.A0l(kSq.A0Y), kSq.A05);
        }
        kSq.A0E = null;
        C61941KSq.A03(kSq);
    }

    public final void DOl() {
        K8A k8a = this.A00.A00;
        if (k8a instanceof C61942KSr) {
            C61942KSr kSr = (C61942KSr) k8a;
            JTO.A0k(kSr.A0Y).A04(kSr, new KTI(kSr.A00));
            return;
        }
        C61941KSq kSq = (C61941KSq) k8a;
        UserSession A0l = AnonymousClass7TE.A0l(kSq.A0Y);
        AnonymousClass36R.A01();
        LJB.A01(kSq, K5H.A00(kSq.A00, "POST", (String) null, -1, true, false), A0l, C64092LMk.A04);
    }

    public final void DOm(Venue venue) {
        1Ng r2;
        K8A k8a = this.A00.A00;
        if (k8a instanceof C61942KSr) {
            C61942KSr kSr = (C61942KSr) k8a;
            LJ9.A01(kSr).A0W(venue);
            C61942KSr.A0A(kSr);
            r2 = JTT.A0I(kSr);
        } else {
            C61941KSq kSq = (C61941KSq) k8a;
            kSq.A0E = venue;
            C61941KSq.A03(kSq);
            r2 = kSq.A08;
            if (r2 == null) {
                0qQ.A0F("eventBus");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        r2.A00(new C242133St(venue, AnonymousClass05K.A01));
    }
}
