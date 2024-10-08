package X;

/* renamed from: X.OvW  reason: case insensitive filesystem */
public final /* synthetic */ class C72057OvW implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C304566Ea A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ byte[] A0D;

    public /* synthetic */ C72057OvW(C304566Ea r1, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A0D = bArr;
        this.A03 = i;
        this.A05 = l;
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A06 = l2;
        this.A0C = str4;
        this.A00 = i2;
        this.A07 = str5;
        this.A01 = i3;
        this.A02 = i4;
        this.A08 = str6;
    }

    public final Object apply(Object obj) {
        C304566Ea r29 = this.A04;
        byte[] bArr = this.A0D;
        int i = this.A03;
        Long l = this.A05;
        String str = this.A09;
        String str2 = this.A0A;
        String str3 = this.A0B;
        Long l2 = this.A06;
        String str4 = this.A0C;
        int i2 = this.A00;
        String str5 = this.A07;
        int i3 = this.A01;
        int i4 = this.A02;
        String str6 = this.A08;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        byte[] bArr2 = bArr;
        return C71991OuP.A00(r29).A0M(new C72059OvY(prM, r29, l, l2, str, str2, str3, str4, str5, str6, bArr2, i, i2, i3, i4));
    }
}
