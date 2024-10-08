package X;

import java.util.List;

/* renamed from: X.Abf  reason: case insensitive filesystem */
public final class C40408Abf implements B1S {
    public final AnonymousClass831 A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public final Object Cor(C293505kq r8, AnonymousClass4D7 r9) {
        List list;
        AnonymousClass831 r0;
        C293505kq r6 = r8;
        if (r8.A0v.isEmpty() && (r0 = this.A00) != null) {
            C59765JXe jXe = new C59765JXe();
            jXe.A06(LIO.A01(r0.A05()));
            r6 = jXe.A01(r8);
        }
        C59765JXe jXe2 = new C59765JXe();
        jXe2.A05(JXu.A03);
        if (this.A02 || this.A03) {
            list = r8.A0r;
        } else {
            list = this.A01;
        }
        jXe2.A0m = new C59764JXc(list);
        0qQ.A0B(r6, 0);
        long j = r6.A01;
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        jXe2.A03(j);
        return jXe2.A01(r6);
    }

    public C40408Abf(AnonymousClass831 r1, List list, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
    }
}
