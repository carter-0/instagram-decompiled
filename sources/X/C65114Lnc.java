package X;

import java.util.List;

/* renamed from: X.Lnc  reason: case insensitive filesystem */
public final class C65114Lnc implements B1S {
    public final AnonymousClass9P8 A00;
    public final boolean A01;

    public final Object Cor(C293505kq r5, AnonymousClass4D7 r6) {
        C59765JXe jXe;
        List list = r5.A0v;
        boolean z = this.A01;
        AnonymousClass9P8 r3 = this.A00;
        if (z) {
            List A0c = 00k.A0c(LIO.A01(list), 1);
            jXe = new C59765JXe();
            jXe.A0j = C59764JXc.A00(r3);
            jXe.A06(A0c);
        } else {
            jXe = new C59765JXe();
            jXe.A0j = C59764JXc.A00(r3);
        }
        return jXe.A01(r5);
    }

    public C65114Lnc(AnonymousClass9P8 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
