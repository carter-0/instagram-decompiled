package X;

/* renamed from: X.UqJ  reason: case insensitive filesystem */
public final class C16194UqJ extends C66972Mg5 {
    public final C69155Nfe A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final int A06;

    public final long A00() {
        return 30;
    }

    public final C66967Mg0 A04() {
        C66966Mfz mfz = new C66966Mfz();
        mfz.A09 = "server";
        mfz.A05 = "server_results";
        int i = this.A06;
        mfz.A00 = i;
        mfz.A01 = i;
        return new C66967Mg0(mfz);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16194UqJ(C69155Nfe nfe, Integer num, String str, String str2, String str3, String str4, int i) {
        super(str);
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = i;
        this.A00 = nfe;
        this.A01 = num;
        this.A02 = str4;
    }
}
