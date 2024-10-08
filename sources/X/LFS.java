package X;

public final class LFS {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && DbY.A1b(this, obj)) {
                LFS lfs = (LFS) obj;
                if (!(this.A05 == lfs.A05 && this.A06 == lfs.A06 && 0qQ.A0K(this.A01, lfs.A01) && 0qQ.A0K(this.A03, lfs.A03) && 0qQ.A0K(this.A02, lfs.A02) && this.A08 == lfs.A08 && 0qQ.A0K(this.A04, lfs.A04) && this.A00 == lfs.A00 && this.A07 == lfs.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A05));
        int i = 0;
        int A092 = (AnonymousClass7TF.A09(this.A08, (((((A09 + JTR.A0G(this.A01)) * 31) + JTR.A0G(this.A03)) * 31) + JTR.A0G(this.A02)) * 31) + JTR.A0G(this.A04)) * 31;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "RECOMMEND";
            } else {
                str = "CROSSPOST";
            }
            i = C51966G9m.A04(str, intValue);
        }
        return DbS.A06(this.A07, (A092 + i) * 31);
    }
}
