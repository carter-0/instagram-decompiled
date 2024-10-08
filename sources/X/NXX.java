package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class NXX extends C331017Pd implements C328277Ee {
    public final UserSession A00;
    public final P7Y A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7Y p7y = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7y.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public final /* synthetic */ void AHu() {
        C66677Mak.A04(this);
    }

    public final /* synthetic */ C242553Us BKr() {
        return C66677Mak.A00(this);
    }

    public final /* synthetic */ C242553Us BzG() {
        return C66677Mak.A01(this);
    }

    public final /* synthetic */ void CsL(float f) {
        C66677Mak.A06(this, f);
    }

    public final /* synthetic */ void EI5() {
        C66677Mak.A05(this);
    }

    public final /* synthetic */ void Ehf(C242553Us r1) {
        C66677Mak.A02(r1, this);
    }

    public final /* synthetic */ void FM4(C242553Us r1, float f) {
        C66677Mak.A03(r1, this, f);
    }

    public final C331277Qg BLj() {
        return C66581MXm.A0F(((AnonymousClass74L) ((AnonymousClass7EZ) this.A00).A0M).A03.getBackground());
    }

    public NXX(UserSession userSession, AnonymousClass9HO r3, AnonymousClass7EZ r4, C332807Wl r5, AnonymousClass9HC r6, NY5 ny5, AnonymousClass7L2 r8) {
        super(r4, ny5, r5);
        this.A03 = r8;
        this.A00 = userSession;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
        this.A01 = new P7Y(r3);
    }
}
