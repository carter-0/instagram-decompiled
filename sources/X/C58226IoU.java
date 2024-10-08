package X;

/* renamed from: X.IoU  reason: case insensitive filesystem */
public final class C58226IoU extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58226IoU(C299665vd r2, String str, String str2, String str3, String str4, int i) {
        super(0);
        this.A00 = i;
        this.A01 = r2;
        if (i != 0) {
            this.A02 = str;
            this.A04 = str2;
            this.A06 = null;
            this.A05 = str3;
            this.A03 = str4;
        } else {
            this.A06 = str;
            this.A03 = str2;
            this.A05 = null;
            this.A04 = str3;
            this.A02 = str4;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.A00;
        C299665vd r1 = (C299665vd) this.A01;
        if (i != 0) {
            str = this.A02;
            str2 = this.A04;
            str3 = this.A06;
            str4 = this.A05;
            str5 = this.A03;
        } else {
            str = this.A06;
            str2 = this.A03;
            str3 = this.A05;
            str4 = this.A04;
            str5 = this.A02;
        }
        r1.Da2(str, str2, str3, str4, str5);
        return C60340gF.A00;
    }
}
