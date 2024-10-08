package X;

public final class LiQ implements C232262tL {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LiQ liQ = (LiQ) obj;
        0qQ.A0B(liQ, 0);
        if (!0qQ.A0K(this.A05, liQ.A05) || !0qQ.A0K(this.A02, liQ.A02) || this.A06 != liQ.A06 || !0qQ.A0K(this.A01, liQ.A01)) {
            return false;
        }
        return true;
    }

    public LiQ(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C51974G9v.A1P(str, str2, str3, str4);
        0qQ.A0B(str5, 6);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A06 = z;
        this.A01 = str5;
        this.A00 = num;
    }
}
