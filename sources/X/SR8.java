package X;

public final class SR8 {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public static void A02(SR8 sr8) {
        if (sr8.A00 == Integer.MIN_VALUE) {
            throw AnonymousClass7TE.A0z("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void A03() {
        int i;
        int i2 = this.A00;
        if (i2 == Integer.MIN_VALUE) {
            i = this.A02;
        } else {
            i = i2 + this.A03;
        }
        this.A00 = i;
        this.A01 = 002.A0O(this.A04, i);
    }

    public SR8(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = 002.A03(i, "/");
        } else {
            str = "";
        }
        this.A04 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = "";
    }

    public static C13900TjN A00(YBZ ybz, SR8 sr8) {
        A02(sr8);
        return ybz.FHV(sr8.A00, 1);
    }

    public static String A01(SR8 sr8) {
        sr8.A03();
        A02(sr8);
        return sr8.A01;
    }
}
