package X;

import java.util.Arrays;

public final class SRQ {
    public static final SRQ A07 = new SRQ((byte[]) null, 1, 2, 3, -1, -1);
    public static final SRQ A08 = new SRQ((byte[]) null, 1, 1, 2, -1, -1);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final byte[] A06;

    public static int A00(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int A01(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i != 18) {
                return (i == 6 || i == 7) ? 3 : -1;
            }
            return 7;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SRQ srq = (SRQ) obj;
            if (!(this.A03 == srq.A03 && this.A02 == srq.A02 && this.A04 == srq.A04 && Arrays.equals(this.A06, srq.A06) && this.A05 == srq.A05 && this.A01 == srq.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A0D = (((Pxh.A0D(this.A06, (((((527 + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) * 31) + this.A05) * 31) + this.A01;
        this.A00 = A0D;
        return A0D;
    }

    public SRQ(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A06 = bArr;
        this.A05 = i4;
        this.A01 = i5;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ColorInfo(");
        int i = this.A03;
        if (i == -1) {
            str = "Unset color space";
        } else if (i == 6) {
            str = "BT2020";
        } else if (i == 1) {
            str = "BT709";
        } else if (i != 2) {
            str = 002.A0O("Undefined color space ", i);
        } else {
            str = "BT601";
        }
        A1A.append(str);
        A1A.append(", ");
        int i2 = this.A02;
        if (i2 == -1) {
            str2 = "Unset color range";
        } else if (i2 == 1) {
            str2 = "Full range";
        } else if (i2 != 2) {
            str2 = 002.A0O("Undefined color range ", i2);
        } else {
            str2 = "Limited range";
        }
        A1A.append(str2);
        A1A.append(", ");
        int i3 = this.A04;
        if (i3 == -1) {
            str3 = "Unset color transfer";
        } else if (i3 == 10) {
            str3 = "Gamma 2.2";
        } else if (i3 == 1) {
            str3 = "Linear";
        } else if (i3 == 2) {
            str3 = "sRGB";
        } else if (i3 == 3) {
            str3 = "SDR SMPTE 170M";
        } else if (i3 == 6) {
            str3 = "ST2084 PQ";
        } else if (i3 != 7) {
            str3 = 002.A0O("Undefined color transfer ", i3);
        } else {
            str3 = "HLG";
        }
        A1A.append(str3);
        A1A.append(", ");
        A1A.append(AnonymousClass7TF.A1V(this.A06));
        A1A.append(", ");
        int i4 = this.A05;
        if (i4 != -1) {
            str4 = 002.A03(i4, "bit Luma");
        } else {
            str4 = "NA";
        }
        A1A.append(str4);
        A1A.append(", ");
        int i5 = this.A01;
        if (i5 != -1) {
            str5 = 002.A03(i5, "bit Chroma");
        } else {
            str5 = "NA";
        }
        A1A.append(str5);
        return AnonymousClass7TF.A0l(")", A1A);
    }
}
