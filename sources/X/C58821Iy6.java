package X;

/* renamed from: X.Iy6  reason: case insensitive filesystem */
public final class C58821Iy6 extends 0Yg implements 0sP {
    public final /* synthetic */ MRL A00;
    public final /* synthetic */ C52754Gc7 A01;
    public final /* synthetic */ C52693Gb5 A02;
    public final /* synthetic */ C286145Uc A03;
    public final /* synthetic */ JS3 A04;
    public final /* synthetic */ C285975Tl A05;
    public final /* synthetic */ C286205Ui A06;
    public final /* synthetic */ C262224Cq A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58821Iy6(MRL mrl, C52754Gc7 gc7, C52693Gb5 gb5, C286145Uc r5, JS3 js3, C285975Tl r7, C286205Ui r8, C262224Cq r9, boolean z, boolean z2) {
        super(1);
        this.A01 = gc7;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = js3;
        this.A02 = gb5;
        this.A07 = r9;
        this.A00 = mrl;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object value;
        C288915ch r11 = (C288915ch) obj;
        C52754Gc7 gc7 = this.A01;
        C284945Oz r2 = gc7.A0A;
        if (C51971G9r.A1W(r2) != r11.CTr()) {
            C51967G9n.A16(r2, r11.CTr());
            if (!C51971G9r.A1W(r2) || !this.A08 || this.A09) {
                C52694Gb6.A01(gc7);
            } else {
                C286205Ui r4 = this.A06;
                C285975Tl r3 = this.A05;
                C286145Uc r22 = this.A03;
                JS3 js3 = this.A04;
                C52754Gc7.A01(gc7, r22, r3, r4, gc7.A0M);
                C52694Gb6.A02(gc7, js3, r3);
            }
            if (r11.CTr() && (value = gc7.A0C.getValue()) != null) {
                AnonymousClass7TE.A1Z(new C59703JUk((Object) this.A00, (Object) this.A05, (Object) gc7, value, (Object) this.A04, (AnonymousClass4D7) null, 3), this.A07);
            }
            if (!r11.CTr()) {
                this.A02.A0C((C289295dM) null);
            }
        }
        return C60340gF.A00;
    }
}
