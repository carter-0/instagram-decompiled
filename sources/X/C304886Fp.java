package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Fp  reason: invalid class name and case insensitive filesystem */
public final class C304886Fp extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C304806Fh A02;
    public final /* synthetic */ C287095Yz A03;
    public final /* synthetic */ C287605aT A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ AnonymousClass5S2 A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ 0sL A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C304886Fp(C304806Fh r2, C287095Yz r3, C287605aT r4, Modifier modifier, AnonymousClass5S2 r6, C62320sa r7, C62320sa r8, 0sL r9, float f, long j, boolean z) {
        super(2);
        this.A05 = modifier;
        this.A00 = f;
        this.A06 = r6;
        this.A02 = r2;
        this.A01 = j;
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
        this.A0A = z;
        this.A08 = r8;
        this.A09 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        Modifier A002;
        C286575Wy r15 = (C286575Wy) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(273755864, "com.meta.compose.material.surface.Surface.<anonymous> (Surface.kt:118)");
            }
            Modifier modifier2 = this.A05;
            float f = this.A00;
            int compare = Float.compare(f, 0.0f);
            Modifier modifier3 = Modifier.A00;
            Modifier modifier4 = modifier3;
            if (compare > 0) {
                AnonymousClass5S2 r7 = this.A06;
                long j = AnonymousClass5RV.A00;
                modifier3 = C56169Hty.A01(modifier3, r7, f, j, j, false);
            }
            Modifier Ezh = modifier2.Ezh(modifier3);
            C304806Fh r1 = this.A02;
            if (r1 != null) {
                modifier = C304816Fi.A01(r1, modifier4, this.A06);
            } else {
                modifier = modifier4;
            }
            Modifier Ezh2 = Ezh.Ezh(modifier);
            long j2 = this.A01;
            AnonymousClass5S2 r3 = this.A06;
            Modifier A012 = AnonymousClass6FZ.A01(AnonymousClass5R5.A00(C304766Fd.A01(Ezh2, r3, j2), C304896Fq.A00, false), r3);
            C62320sa r11 = this.A07;
            if (r11 != null) {
                Modifier A003 = AnonymousClass5R5.A00(modifier4, C59066J4z.A00, true);
                C287605aT r6 = this.A04;
                A002 = C287635aW.A01(this.A03, r6, A003, new C287625aV(0), this.A08, (C62320sa) null, r11, this.A0A);
            } else {
                A002 = C304916Fs.A00(AnonymousClass5R5.A00(modifier4, C304906Fr.A00, false), C60340gF.A00, new C376829Jm(2, (AnonymousClass4D7) null));
            }
            Modifier Ezh3 = A012.Ezh(A002);
            0sL r5 = this.A09;
            AnonymousClass5RD A004 = C287675aa.A00(C287215Zl.A0E, true);
            int A005 = C287425a7.A00(r15);
            C286565Wx r32 = (C286565Wx) r15;
            AnonymousClass5RM A042 = C286565Wx.A04(r32);
            Modifier A013 = C287435a8.A01(r15, Ezh3);
            C62320sa r12 = C287485aD.A00;
            r15.ExX();
            if (r32.A0K) {
                r15.AMT(r12);
            } else {
                r15.FMk();
            }
            C287595aO.A00(r15, A004, C287485aD.A03);
            C287595aO.A00(r15, A042, C287485aD.A05);
            0sL r2 = C287485aD.A02;
            if (r32.A0K || !0qQ.A0K(r15.ECw(), Integer.valueOf(A005))) {
                Integer valueOf = Integer.valueOf(A005);
                r15.FLL(valueOf);
                r15.ABr(valueOf, r2);
            }
            C287595aO.A00(r15, A013, C287485aD.A04);
            r5.invoke(r15, 0);
            C286565Wx.A0L(r32, true);
            if (0fL.A02()) {
                0fL.A00(1187602791);
            }
        } else {
            r15.Evl();
        }
        return C60340gF.A00;
    }
}
