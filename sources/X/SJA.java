package X;

import java.util.HashMap;

public final class SJA {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final C8907RFa A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                SJA sja = (SJA) obj;
                if (!(this.A04 == sja.A04 && this.A03 == sja.A03 && this.A02 == sja.A02 && this.A05 == sja.A05 && this.A01 == sja.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static SJA A00(String str) {
        int i;
        if ("high".equalsIgnoreCase(str)) {
            i = 8;
        } else if ("main".equalsIgnoreCase(str)) {
            i = 2;
        } else if (!"baseline".equalsIgnoreCase(str)) {
            return null;
        } else {
            i = 1;
        }
        return new SJA(C8907RFa.CODEC_VIDEO_H264, i, 256, false, false);
    }

    public final int hashCode() {
        return Pxf.A0C(this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Boolean.valueOf(this.A05), Boolean.valueOf(this.A01));
    }

    public SJA(C8907RFa rFa, int i, int i2, boolean z, boolean z2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = rFa;
        this.A05 = z;
        this.A01 = z2;
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("codec", this.A04);
        A1E.put("profile", Integer.valueOf(this.A03));
        A1E.put("level", Integer.valueOf(this.A02));
        A1E.put("useBframe", Boolean.valueOf(this.A05));
        return C266784aL.A03(SJA.class, A1E);
    }
}
