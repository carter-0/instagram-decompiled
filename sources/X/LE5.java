package X;

public final class LE5 {
    public int A00 = 3;
    public CharSequence A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public boolean A07 = true;

    public final C64814LiZ A00() {
        CharSequence charSequence;
        if (this.A03 == null && (((charSequence = this.A01) == null || charSequence.length() == 0) && this.A02 == null)) {
            throw AnonymousClass7TE.A0w("Banners must have at least body text or action set.");
        }
        String str = this.A06;
        Integer num = this.A05;
        Integer num2 = this.A03;
        CharSequence charSequence2 = this.A01;
        Integer num3 = this.A02;
        boolean z = this.A07;
        return new C64814LiZ(charSequence2, num, num2, num3, this.A04, str, this.A00, z);
    }
}
