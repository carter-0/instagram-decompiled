package X;

/* renamed from: X.Iy9  reason: case insensitive filesystem */
public final class C58824Iy9 extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C284945Oz A06;
    public final /* synthetic */ C56535I0i A07;
    public final /* synthetic */ AnonymousClass5Z4 A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58824Iy9(C284945Oz r2, C56535I0i i0i, AnonymousClass5Z4 r4, String str, float f, float f2, float f3, long j, long j2, long j3) {
        super(1);
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A07 = i0i;
        this.A09 = str;
        this.A08 = r4;
        this.A06 = r2;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q3 r15 = (AnonymousClass5Q3) obj;
        0qQ.A0B(r15, 0);
        float F06 = r15.F06(28.0f);
        float F062 = r15.F06(26.0f);
        float F063 = r15.F06(4.0f);
        C51967G9n.A15(this.A06, AnonymousClass1GB.A01(C51969G9p.A00(r15) - F06));
        float f = this.A02;
        float f2 = this.A01;
        float f3 = (f - f2) / (this.A00 - f2);
        long Bwg = r15.Bwg();
        float A022 = C288025bF.A02(Bwg);
        float f4 = F06 / 2.0f;
        float f5 = ((1.0f - f3) * (f4 + 0.0f)) + (f3 * (A022 - f4));
        float A002 = C288025bF.A00(Bwg) / 2.0f;
        long j = this.A05;
        r15.AQj((C288195bW) null, (C13866Tin) null, r15.F06(4.0f), 1.0f, 1, 3, j, C289325dP.A00(f5, A002), C289325dP.A00(A022, A002));
        long j2 = this.A04;
        long A003 = C289325dP.A00(0.0f, A002);
        long A004 = C289325dP.A00(f5, A002);
        r15.AQj((C288195bW) null, (C13866Tin) null, r15.F06(4.0f), 1.0f, 1, 3, j2, A003, A004);
        C289635dw r37 = C289635dw.A00;
        r15.AQV((C288195bW) null, r37, f4, 1.0f, 3, j, A004);
        r15.AQV((C288195bW) null, r37, F062 / 2.0f, 1.0f, 3, this.A03, A004);
        long A005 = C289325dP.A00(f5 - f4, (A002 - F06) - F063);
        C56535I0i i0i = this.A07;
        String str = this.A09;
        AnonymousClass5Z4 r7 = this.A08;
        0sn r4 = 0sn.A00;
        C286025Tq r3 = new C286025Tq(r4, r4, str);
        long Bwg2 = r15.Bwg();
        float A023 = C288025bF.A02(Bwg2);
        float A012 = C289295dM.A01(A005);
        int round = Math.round((float) Math.ceil((double) (A023 - A012)));
        float A006 = C288025bF.A00(Bwg2);
        float A024 = C289295dM.A02(A005);
        long A042 = AnonymousClass5SF.A04(0, round, 0, Math.round((float) Math.ceil((double) (A006 - A024))));
        C3022462f A013 = i0i.A01(r3, r7, i0i.A00, r15, r15.getLayoutDirection(), r4, A042);
        AnonymousClass5QD Ayw = r15.Ayw();
        AnonymousClass5QC r32 = (AnonymousClass5QC) Ayw;
        AnonymousClass5QB r42 = r32.A02.A02;
        long A052 = C51967G9n.A05(r42);
        try {
            AnonymousClass5QF r33 = r32.A01;
            r33.FHv(A012, A024);
            C54751HRj.A00(r33, A013);
            C3022262d r34 = A013.A03;
            r34.A0A(r42.A01, (C291805hu) null, (C289645dx) null, (C291795ht) null, AnonymousClass5RW.A08);
            C51968G9o.A1G(r42, Ayw, A052);
            return C60340gF.A00;
        } catch (Throwable th) {
            C51968G9o.A1G(r42, Ayw, A052);
            throw th;
        }
    }
}
