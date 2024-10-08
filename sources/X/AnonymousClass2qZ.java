package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.2qZ  reason: invalid class name */
public final class AnonymousClass2qZ implements C230922qa {
    public final /* synthetic */ C230822qK A00;

    public final void Ds7(C300555xO r6) {
        0qQ.A0B(r6, 0);
        C230822qK r2 = this.A00;
        if (!r2.A08.A00.A0X()) {
            r2.A02 = true;
            r2.A07.A01(r2.A05, r6);
            if (r6.A00 == QPTooltipAnchor.PROMOTE_CTA) {
                1Av A002 = 1Au.A00(r2.A04);
                A002.A4c.Epx(A002, true, 1Av.A8a[110]);
                return;
            }
            return;
        }
        r2.A07.A02(r6, (String) null);
    }

    public AnonymousClass2qZ(C230822qK r1) {
        this.A00 = r1;
    }

    public final void DVk(C300555xO r2) {
        this.A00.A07.A02 = r2;
    }
}
