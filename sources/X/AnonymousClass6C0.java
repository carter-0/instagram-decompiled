package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6C0  reason: invalid class name */
public final class AnonymousClass6C0 extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299635va A02;
    public final /* synthetic */ AnonymousClass5vX A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sP A0A;
    public final /* synthetic */ 0sP A0B;
    public final /* synthetic */ 0sL A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6C0(C299665vd r2, C299635va r3, AnonymousClass5vX r4, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sP r11, 0sP r12, 0sL r13, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A0D = z;
        this.A00 = f;
        this.A03 = r4;
        this.A06 = r5;
        this.A05 = r6;
        this.A0F = z2;
        this.A02 = r3;
        this.A01 = r2;
        this.A0B = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A0C = r13;
        this.A0E = z3;
        this.A04 = r7;
        this.A07 = r8;
        this.A08 = r12;
        this.A0H = z4;
        this.A0G = z5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier A082;
        C286575Wy r1 = (C286575Wy) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(581746354, "com.instagram.feed.tifu.ui.TifuUnit.<anonymous> (TifuUnit.kt:80)");
            }
            boolean z = this.A0D;
            C285245Qk r5 = Modifier.A00;
            if (z) {
                A082 = C287195Zj.A0B(r5, 0.0f, 0.0f, 0.0f, 6.0f);
            } else {
                A082 = C287205Zk.A08(r5, this.A00);
            }
            AnonymousClass5vX r30 = this.A03;
            C62320sa r29 = this.A06;
            C62320sa r27 = this.A05;
            boolean z2 = this.A0F;
            C299635va r26 = this.A02;
            C299665vd r25 = this.A01;
            0sP r23 = this.A0B;
            0sP r22 = this.A09;
            0sP r21 = this.A0A;
            0sL r9 = this.A0C;
            boolean z3 = this.A0E;
            C62320sa r10 = this.A04;
            C62320sa r8 = this.A07;
            0sP r6 = this.A08;
            boolean z4 = this.A0H;
            boolean z5 = this.A0G;
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r1, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r1);
            C286565Wx r2 = (C286565Wx) r1;
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r1, A082);
            C62320sa r15 = C287485aD.A00;
            r1.ExX();
            if (r2.A0K) {
                r1.AMT(r15);
            } else {
                r1.FMk();
            }
            C287595aO.A00(r1, A022, C287485aD.A03);
            C287595aO.A00(r1, A042, C287485aD.A05);
            0sL r13 = C287485aD.A02;
            if (r2.A0K || !0qQ.A0K(r1.ECw(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                r1.FLL(valueOf);
                r1.ABr(valueOf, r13);
            }
            C287595aO.A00(r1, A012, C287485aD.A04);
            AnonymousClass5vX r14 = r30;
            C304036Bx.A01(r1, r14, r29, r27, 0, 0, z2);
            if (z) {
                r1.ExS(648665318);
                C55003Haa.A00(r1, r25, r26, r14, r23, r22, r21, r9, 0);
            } else if (z3) {
                r1.ExS(649126412);
                C55004Hab.A00(r1, r25, r26, r14, r27, r10, r29, r8, r23, r22, r21, r6, r9, 0, 0, 0, z4, z2);
            } else {
                r1.ExS(649984120);
                boolean z6 = z5;
                C304656Er.A00(r1, r25, r26, r30, r27, r10, r29, r8, r23, r22, r21, r6, r9, 0, 0, 8192, z4, false, z2, z6);
            }
            C286565Wx.A0L(r2, false);
            C286565Wx.A0L(r2, true);
            if (0fL.A02()) {
                0fL.A00(-877498288);
            }
        } else {
            r1.Evl();
        }
        return C60340gF.A00;
    }
}
