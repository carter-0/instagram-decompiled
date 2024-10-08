package X;

public final class JHO extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C287605aT A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ C59485JLj A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHO(C287605aT r2, C270284gU r3, C59485JLj jLj, Integer num, Integer num2, String str, C62320sa r8, int i, boolean z) {
        super(3);
        this.A06 = str;
        this.A03 = jLj;
        this.A01 = r2;
        this.A08 = z;
        this.A00 = i;
        this.A05 = num;
        this.A04 = num2;
        this.A07 = r8;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        0sL r10 = (0sL) obj;
        C286575Wy r4 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(r10, 0);
        if ((A0M & 6) == 0) {
            A0M |= C41848B3p.A01(r4, r10);
        }
        if ((A0M & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(112964583, "com.instagram.compose.igds.components.formfield.IgdsFormFieldTextField.<anonymous> (IgdsFormField.kt:177)");
            }
            boolean A1X = C51971G9r.A1X(this.A02);
            String str = this.A06;
            C59485JLj jLj = this.A03;
            C287605aT r3 = this.A01;
            boolean z = this.A08;
            I7P.A03(r3, r4, jLj, this.A05, this.A04, str, this.A07, r10, this.A00, 29360128 & (A0M << 21), 0, A1X, z);
            if (0fL.A02()) {
                0fL.A00(1582464877);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
