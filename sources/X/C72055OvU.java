package X;

/* renamed from: X.OvU  reason: case insensitive filesystem */
public final /* synthetic */ class C72055OvU implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C304566Ea A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;

    public /* synthetic */ C72055OvU(C304566Ea r1, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A02 = r1;
        this.A0B = bArr;
        this.A0C = bArr2;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str5;
        this.A03 = num;
        this.A04 = num2;
        this.A06 = str6;
    }

    public final Object apply(Object obj) {
        C304566Ea r3 = this.A02;
        byte[] bArr = this.A0B;
        byte[] bArr2 = this.A0C;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A09;
        String str4 = this.A0A;
        int i = this.A01;
        int i2 = this.A00;
        String str5 = this.A05;
        Integer num = this.A03;
        Integer num2 = this.A04;
        String str6 = this.A06;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        return C71991OuP.A00(r3).A0M(new C72058OvX(prM, r3, num, num2, str, str2, str3, str4, str5, str6, bArr, bArr2, i, i2));
    }
}
