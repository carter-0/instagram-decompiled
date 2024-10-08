package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NXW extends C331017Pd implements C328287Ef {
    public final UserSession A00;
    public final P7E A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7E p7e = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7e.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public final void Ehf(C242553Us r2) {
        0qQ.A0B(r2, 0);
        ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).Ehf(r2);
    }

    public final void FM4(C242553Us r2, float f) {
        0qQ.A0B(r2, 0);
        ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).FM4(r2, f);
    }

    public final void AHu() {
        ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).AHu();
    }

    public final C242553Us BKr() {
        C242553Us BKr = ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).BKr();
        0qQ.A07(BKr);
        return BKr;
    }

    public final C242553Us BzG() {
        C242553Us BzG = ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).BzG();
        0qQ.A07(BzG);
        return BzG;
    }

    public final void CsL(float f) {
        ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).CsL(f);
    }

    public final void EI5() {
        ((C3257073v) ((AnonymousClass7EZ) this.A00).A0M).EI5();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.P7E, java.lang.Object] */
    public NXW(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, NYA nya, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, nya), nya, r5);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }
}
