package X;

import android.view.View;
import java.util.concurrent.CancellationException;

/* renamed from: X.ONx  reason: case insensitive filesystem */
public final class C70845ONx {
    public PNY A00;
    public C262224Cq A01;
    public final OKY A02;
    public final C74426Pug A03;
    public final C71111Ocu A04;
    public final OLU A05;
    public final 0sP A06 = new C74180PqM(this, 0);
    public final AnonymousClass12V A07 = AnonymousClass12T.A00;
    public final OWA A08;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Ps0, java.lang.Object] */
    public final void A00() {
        this.A02.A00 = this.A08;
        C71111Ocu ocu = this.A04;
        OLU olu = this.A05;
        C74426Pug pug = this.A03;
        0qQ.A0B(olu, 0);
        ocu.A01 = olu;
        ocu.A00 = pug;
        ocu.A05(new Object());
        C262224Cq r3 = this.A01;
        if (r3 == null) {
            r3 = 19E.A02(AnonymousClass199.A02(((AnonymousClass12U) this.A07).A04, new AnonymousClass19G((C262204Co) null)));
        }
        this.A01 = r3;
        AnonymousClass7TE.A1Z(new C66166MGd((AnonymousClass4D7) null, (Object) this, 49), r3);
        PNY pny = this.A00;
        if (pny != null) {
            ocu.A05(pny);
            this.A00 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ps0, java.lang.Object] */
    public final void A01() {
        C71111Ocu ocu = this.A04;
        ocu.A05(new Object());
        ocu.A01 = null;
        ocu.A00 = null;
        ocu.A02.removeCallbacksAndMessages((Object) null);
        ocu.A03.clear();
        this.A02.A00 = null;
        C262224Cq r0 = this.A01;
        if (r0 != null) {
            19E.A05((CancellationException) null, r0);
        }
        this.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Prw, java.lang.Object] */
    public final void A02(boolean z) {
        C74272Ps0 ps0;
        C74267Prv prv;
        C69103Nei nei = this.A05.A00;
        if (nei != null) {
            if (z != nei.A05) {
                OKY oky = nei.A0A;
                if (z) {
                    prv = PLI.A00;
                } else {
                    prv = PLH.A00;
                }
                oky.A00(prv);
            }
            nei.A05 = z;
            if (z) {
                ps0 = C72887PNx.A00;
            } else {
                ps0 = C72886PNw.A00;
            }
            C74272Ps0 ps02 = ps0;
            if (nei.A06) {
                C71111Ocu ocu = nei.A0C;
                ocu.A05(ps02);
                ocu.A03(new Object());
                ocu.A03(new C72905POp(z));
            } else {
                nei.A03 = ps02;
            }
            C71692eh r1 = (C71692eh) nei.A0G.getValue();
            View A0c = AnonymousClass7TE.A0c(nei.A0D);
            if (z) {
                r1.A00(A0c);
                nei.A08.post(new C73136PXV(nei));
            } else {
                r1.A01(A0c);
            }
        }
        if (this.A01 != null) {
            this.A04.A03(new PLS(z));
        } else {
            this.A03.A7I(new PLS(z));
        }
    }

    public final void A03(boolean z) {
        if (this.A01 != null) {
            this.A04.A03(new PLT(z));
        } else {
            this.A03.A7I(new PLT(z));
        }
    }

    public C70845ONx(OKY oky, C74426Pug pug, C71111Ocu ocu, OLU olu, OWA owa) {
        C51974G9v.A1P(olu, ocu, pug, oky);
        0qQ.A0B(owa, 5);
        this.A05 = olu;
        this.A04 = ocu;
        this.A03 = pug;
        this.A02 = oky;
        this.A08 = owa;
    }
}
