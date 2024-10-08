package X;

/* renamed from: X.Pho  reason: case insensitive filesystem */
public final class C73675Pho extends 0Yg implements C62320sa {
    public final /* synthetic */ XSV A00;
    public final /* synthetic */ C71872OsF A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ 1iA A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73675Pho(XSV xsv, C71872OsF osF, 1Xj r4, 1iA r5, String str, boolean z) {
        super(0);
        this.A01 = osF;
        this.A02 = r4;
        this.A05 = z;
        this.A03 = r5;
        this.A04 = str;
        this.A00 = xsv;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C71872OsF osF = this.A01;
        C290815g0 A002 = C71872OsF.A00(osF, this.A02, this.A05);
        A002.A00 = new NQQ(this.A00, osF, this.A03, (String) null, this.A04, false);
        1ES.A03(A002);
        return C60340gF.A00;
    }
}
