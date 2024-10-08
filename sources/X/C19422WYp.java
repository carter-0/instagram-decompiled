package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.WYp  reason: case insensitive filesystem */
public final class C19422WYp implements DQw {
    public final /* synthetic */ C15357Ub9 A00;

    public C19422WYp(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void DcB(Reel reel) {
        C15357Ub9 ub9 = this.A00;
        VW5 vw5 = ub9.A0G;
        if (vw5 != null) {
            vw5.A01 = reel;
        }
        Dbb.A0u(ub9);
        if (ub9.A03 == null) {
            ub9.A03 = reel.A07();
            ub9.A0L = false;
        }
        C13990Tnq.A1L(ub9);
    }

    public final void DcD(1Xj r3) {
        C15357Ub9 ub9 = this.A00;
        VW5 vw5 = ub9.A0G;
        if (vw5 != null) {
            vw5.A00 = r3;
            Dbb.A0u(ub9);
        }
        if (ub9.A03 == null) {
            ub9.A03 = r3.A1Q();
            ub9.A0L = false;
            C13990Tnq.A1L(ub9);
        }
    }

    public final void DcS() {
        C15357Ub9 ub9 = this.A00;
        ub9.A0L = false;
        C13990Tnq.A1L(ub9);
        if (ub9.A03 != null) {
            ub9.A03 = null;
            ub9.A0L = false;
            C13990Tnq.A1L(ub9);
        }
    }
}
