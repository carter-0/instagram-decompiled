package X;

import android.graphics.DashPathEffect;

/* renamed from: X.Ix7  reason: case insensitive filesystem */
public final class C58760Ix7 extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58760Ix7(Object obj, float f, float f2, int i, long j) {
        super(1);
        this.A02 = i;
        this.A04 = obj;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q4 r10 = (AnonymousClass5Q4) obj;
        if (this.A02 != 0) {
            0qQ.A0B(r10, 0);
            r10.AQW();
            C381879cj r1 = (C381879cj) this.A04;
            if (r1 != null) {
                float f = this.A01;
                float f2 = this.A00;
                long j = this.A03;
                long A002 = C288015bE.A00(r1.CGW() * r1.BpU() * f, r1.BCs() * r1.BpU() * f2);
                long A003 = C289325dP.A00(r1.BXs() * f, r1.BXu() * f2);
                float F06 = r10.F06(2.0f);
                float F062 = r10.F06(4.0f);
                float F063 = r10.F06(4.0f);
                float Bog = r1.Bog();
                AnonymousClass5QD Ayw = r10.Ayw();
                AnonymousClass5QC r2 = (AnonymousClass5QC) Ayw;
                AnonymousClass5QB r11 = r2.A02.A02;
                long A05 = C51967G9n.A05(r11);
                try {
                    r2.A01.EJR(A003, Bog);
                    AnonymousClass5Q4 r15 = r10;
                    r15.AQv((C288195bW) null, new C298575tg(new C56878IFz(new DashPathEffect(new float[]{F063, F063}, 0.0f)), F06, 4.0f, 0, 0), 1.0f, 3, j, C289295dM.A06(A003, C289295dM.A04(2.0f, C289325dP.A00(C288025bF.A02(A002), C288025bF.A00(A002)))), A002, AnonymousClass6GR.A00(F062, F062));
                } finally {
                    C51968G9o.A1G(r11, Ayw, A05);
                }
            }
        } else {
            C51970G9q.A15(r10);
            C54605HKo hKo = (C54605HKo) this.A04;
            long j2 = this.A03;
            float f3 = this.A00;
            float f4 = this.A01;
            if (hKo instanceof H90) {
                long A004 = C288015bE.A00(f3, f4);
                C289635dw r12 = C289635dw.A00;
                r10.AQs((C288195bW) null, r12, 1.0f, 3, j2, 0, A004);
                r10.AQs((C288195bW) null, r12, 1.0f, 3, j2, C289325dP.A00(f3 - f4, 0.0f), C288015bE.A00(f4, f3));
            } else if (hKo instanceof C54353H8z) {
                long A005 = C288015bE.A00(f3, f4);
                C289635dw r122 = C289635dw.A00;
                r10.AQs((C288195bW) null, r122, 1.0f, 3, j2, 0, A005);
                r10.AQs((C288195bW) null, r122, 1.0f, 3, j2, 0, C288015bE.A00(f4, f3));
            } else {
                boolean z = hKo instanceof C54352H8y;
                float f5 = f3 - f4;
                long A006 = C289325dP.A00(0.0f, f5);
                long A007 = C288015bE.A00(f3, f4);
                C289635dw r123 = C289635dw.A00;
                long j3 = j2;
                if (z) {
                    r10.AQs((C288195bW) null, r123, 1.0f, 3, j3, A006, A007);
                    r10.AQs((C288195bW) null, r123, 1.0f, 3, j2, C289325dP.A00(f5, 0.0f), C288015bE.A00(f4, f3));
                } else {
                    r10.AQs((C288195bW) null, r123, 1.0f, 3, j3, A006, A007);
                    r10.AQs((C288195bW) null, r123, 1.0f, 3, j2, 0, C288015bE.A00(f4, f3));
                }
            }
        }
        return C60340gF.A00;
    }
}
