package X;

public final class SDQ {
    public final String A00;

    public static SDQ A00(C11389SRd sRd) {
        String str;
        int A07 = Pxf.A07(sRd, 2);
        int i = A07 >> 1;
        int A05 = ((sRd.A05() >> 3) & 31) | ((A07 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = ".0";
        String str3 = str2;
        if (A05 >= 10) {
            str2 = ".";
        }
        return new SDQ(002.A0o(str, str3, str2, i, A05));
    }

    public SDQ(String str) {
        this.A00 = str;
    }
}
