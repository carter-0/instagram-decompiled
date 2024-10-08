package X;

/* renamed from: X.IyE  reason: case insensitive filesystem */
public final class C58829IyE extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C270284gU A04;
    public final /* synthetic */ C267974cY A05;
    public final /* synthetic */ C267974cY A06;
    public final /* synthetic */ C267974cY A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58829IyE(C270284gU r2, C267974cY r3, C267974cY r4, C267974cY r5, Integer num, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(1);
        this.A07 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r2;
        this.A06 = r4;
        this.A03 = i3;
        this.A09 = z;
        this.A08 = num;
        this.A0A = z2;
        this.A05 = r5;
        this.A02 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C267974cY r2;
        C268104cl r8 = (C268104cl) obj;
        0qQ.A0B(r8, 0);
        C267974cY r4 = this.A07;
        int i = this.A01;
        r8.A07(r4, 0, (i - this.A00) - r4.A00);
        float A032 = C51971G9r.A03(this.A04);
        C287245Zp r1 = C287215Zl.A04;
        C267974cY r42 = this.A06;
        int AAy = r1.AAy(r42.A00, i);
        if (A032 == 0.0f) {
            r8.A07(r42, 0, AAy);
        } else {
            int i2 = this.A03;
            r8.A0B(r42, new C58726IwZ(A032, 9), 0, AAy + AnonymousClass1GB.A01(((float) (i2 - AAy)) * A032));
            if (this.A09 && this.A08 != null && this.A0A && (r2 = this.A05) != null) {
                r8.A07(r2, this.A02 - r2.A01, i2);
            }
        }
        return C60340gF.A00;
    }
}
