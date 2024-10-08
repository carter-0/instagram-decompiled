package X;

import android.graphics.Rect;

public final class GWX implements C250603lj {
    public final Rect A00 = AnonymousClass7TE.A0W();
    public final C59630JQy A01;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        Object obj = r8.A03;
        C296935qt r4 = (C296935qt) obj;
        float CFe = r9.CFe(r8);
        Rect rect = this.A00;
        r9.B9a(rect, r8);
        int intValue = r9.CEk(r8).intValue();
        if (intValue == 0) {
            C59630JQy jQy = this.A01;
            0qQ.A06(obj);
            jQy.Dye(rect, r4, CFe, rect.top);
        } else if (intValue != 1) {
            C59630JQy jQy2 = this.A01;
            0qQ.A0A(r4);
            jQy2.Dyf(r4);
        } else {
            C59630JQy jQy3 = this.A01;
            0qQ.A06(obj);
            jQy3.Dyh(rect, r4, CFe, rect.top);
        }
    }

    public GWX(C59630JQy jQy) {
        this.A01 = jQy;
    }
}
