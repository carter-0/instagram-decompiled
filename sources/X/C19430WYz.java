package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.WYz  reason: case insensitive filesystem */
public final class C19430WYz implements C20957X6k {
    public final /* synthetic */ C15357Ub9 A00;

    public C19430WYz(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void Dx5(Venue venue) {
        C15357Ub9 ub9 = this.A00;
        ub9.A0H = venue;
        C13990Tnq.A1L(ub9);
        C15357Ub9.A02(ub9);
    }

    public final void onFinish() {
        C14074TpO tpO = this.A00.A07;
        if (tpO != null) {
            C14074TpO.A00(tpO, false, true);
        }
    }
}
