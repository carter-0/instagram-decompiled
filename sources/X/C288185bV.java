package X;

/* renamed from: X.5bV  reason: invalid class name and case insensitive filesystem */
public final class C288185bV extends C288195bW {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C288185bV) {
                long j = this.A01;
                C288185bV r9 = (C288185bV) obj;
                long j2 = r9.A01;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A00 == r9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BlendModeColorFilter(color=");
        sb.append(AnonymousClass5RW.A06(this.A01));
        sb.append(", blendMode=");
        int i = this.A00;
        if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else if (i == 14) {
            str = "Screen";
        } else if (i == 15) {
            str = "Overlay";
        } else if (i == 16) {
            str = "Darken";
        } else if (i == 17) {
            str = "Lighten";
        } else if (i == 18) {
            str = "ColorDodge";
        } else if (i == 19) {
            str = "ColorBurn";
        } else if (i == 20) {
            str = "HardLight";
        } else if (i == 21) {
            str = "Softlight";
        } else if (i == 22) {
            str = "Difference";
        } else if (i == 23) {
            str = "Exclusion";
        } else {
            str = "Multiply";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public C288185bV(long j, int i) {
        super(C288205bX.A00(i, j));
        this.A01 = j;
        this.A00 = i;
    }
}
