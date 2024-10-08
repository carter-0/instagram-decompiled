package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.format.DateUtils;

/* renamed from: X.Iy7  reason: case insensitive filesystem */
public final class C58822Iy7 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C284945Oz A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C270284gU A05;
    public final /* synthetic */ C56535I0i A06;
    public final /* synthetic */ AnonymousClass5Z4 A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58822Iy7(C284945Oz r2, C284945Oz r3, C270284gU r4, C56535I0i i0i, AnonymousClass5Z4 r6, int i, long j, long j2, boolean z, boolean z2) {
        super(1);
        this.A05 = r4;
        this.A01 = j;
        this.A02 = j2;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = i0i;
        this.A00 = i;
        this.A07 = r6;
        this.A03 = r2;
        this.A04 = r3;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        AnonymousClass5Q4 r12 = (AnonymousClass5Q4) obj;
        0qQ.A0B(r12, 0);
        r12.AQW();
        float F06 = r12.F06(2.0f);
        long Bwg = r12.Bwg();
        float A002 = C288025bF.A00(Bwg) - (0.5f * F06);
        long j = this.A01;
        long A003 = C289325dP.A00(0.0f, A002);
        AnonymousClass5Q4 r19 = r12;
        r19.AQj((C288195bW) null, (C13866Tin) null, F06, 1.0f, 0, 3, j, A003, C289325dP.A00(C51969G9p.A00(r12), A002));
        long j2 = this.A02;
        long A004 = C289325dP.A00(C288025bF.A02(Bwg) * C51971G9r.A03(this.A05), A002);
        r12.AQj((C288195bW) null, (C13866Tin) null, F06, 1.0f, 0, 3, j2, A003, A004);
        if (this.A08) {
            long j3 = AnonymousClass5RW.A09;
            AnonymousClass5Q4 r31 = r12;
            r31.AQV((C288195bW) null, C289635dw.A00, r12.F06(C51975G9x.A00((AnonymousClass5b4) this.A03.getValue())), 1.0f, 3, j3, A004);
        }
        if (this.A09 && C51971G9r.A1W(this.A04)) {
            C56535I0i i0i = this.A06;
            int i = this.A00;
            AnonymousClass5Z4 r9 = this.A07;
            AnonymousClass7TF.A1E(i0i, 5, r9);
            long A062 = C289295dM.A06(A004, C289325dP.A00(0.0f, 60.0f + 60.0f));
            float A012 = C289295dM.A01(A062);
            float f2 = 110.0f / 2.0f;
            float A022 = C289295dM.A02(A062);
            RectF rectF = new RectF(A012 - f2, A022, A012 + f2, A022 + 60.0f);
            long j4 = AnonymousClass5RW.A03;
            long A005 = C289325dP.A00(rectF.left, rectF.top);
            long A006 = C288015bE.A00(110.0f, 60.0f);
            long A007 = AnonymousClass6GR.A00(16.0f, 16.0f);
            C289635dw r34 = C289635dw.A00;
            r12.AQv((C288195bW) null, r34, 1.0f, 3, j4, A005, A006, A007);
            String formatElapsedTime = DateUtils.formatElapsedTime(AnonymousClass7TE.A0P((long) i));
            0qQ.A0A(formatElapsedTime);
            C3022462f A008 = C56535I0i.A00(i0i, AnonymousClass5Z4.A01((AnonymousClass5Z2) null, r9, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, 0, 0, 16777213, 0, AnonymousClass5Z7.A01(10), 0), formatElapsedTime);
            long A009 = C289325dP.A00(rectF.left + 24.0f, rectF.top + 16.0f);
            long j5 = AnonymousClass5RW.A09;
            AnonymousClass5ZB r92 = A008.A04.A04.A02;
            C291805hu r15 = r92.A03;
            C291795ht r14 = r92.A0B;
            C289645dx r13 = r92.A04;
            AnonymousClass5QD Ayw = r12.Ayw();
            AnonymousClass5QC r8 = (AnonymousClass5QC) Ayw;
            AnonymousClass5QB r5 = r8.A02.A02;
            long A052 = C51967G9n.A05(r5);
            try {
                AnonymousClass5QF r82 = r8.A01;
                r82.FHv(C289295dM.A01(A009), C289295dM.A02(A009));
                C54751HRj.A00(r82, A008);
                AnonymousClass5ZA r10 = r92.A0C;
                C304786Ff AiJ = r10.AiJ();
                if (AiJ == null || j5 != 16) {
                    C3022262d r93 = A008.A03;
                    AnonymousClass5QA r83 = r5.A01;
                    if (j5 == 16) {
                        j5 = r10.Aoz();
                    }
                    if (!Float.isNaN(Float.NaN)) {
                        j5 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j5 & 63)], AnonymousClass5RW.A03(j5), AnonymousClass5RW.A02(j5), AnonymousClass5RW.A01(j5), AnonymousClass5RW.A00(j5) * Float.NaN);
                    }
                    r93.A0A(r83, r15, r13, r14, j5);
                } else {
                    C3022262d r1 = A008.A03;
                    AnonymousClass5QA r0 = r5.A01;
                    if (!Float.isNaN(Float.NaN)) {
                        f = Float.NaN;
                    } else {
                        f = r10.AbF();
                    }
                    C54757HRp.A00(AiJ, r0, r15, r13, r1, r14, f);
                }
                C51968G9o.A1G(r5, Ayw, A052);
                float f3 = 40.0f / 2.0f;
                long A0010 = C289325dP.A00(rectF.centerX() - f3, rectF.bottom - 1.0f);
                C3018160e A0011 = C3026864w.A00();
                float A013 = C289295dM.A01(A0010);
                float A023 = C289295dM.A02(A0010);
                Path path = A0011.A03;
                path.moveTo(A013, A023);
                path.lineTo(A013 + 40.0f, A023);
                path.lineTo(A013 + f3, A023 + 20.0f);
                path.lineTo(A013, A023);
                path.close();
                r12.AQn((C288195bW) null, A0011, r34, 1.0f, 3, j4);
            } catch (Throwable th) {
                C51968G9o.A1G(r5, Ayw, A052);
                throw th;
            }
        }
        return C60340gF.A00;
    }
}
