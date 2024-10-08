package X;

/* renamed from: X.62e  reason: invalid class name and case insensitive filesystem */
public final class C3022362e {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final C292055iK A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3022362e) {
                C3022362e r5 = (C3022362e) obj;
                if (!(0qQ.A0K(this.A06, r5.A06) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.A06.hashCode() * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphInfo(paragraph=");
        sb.append(this.A06);
        sb.append(", startIndex=");
        sb.append(this.A05);
        sb.append(", endIndex=");
        sb.append(this.A04);
        sb.append(", startLineIndex=");
        sb.append(this.A03);
        sb.append(", endLineIndex=");
        sb.append(this.A02);
        sb.append(", top=");
        sb.append(this.A01);
        sb.append(", bottom=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final long A00(long j, boolean z) {
        if (z) {
            long j2 = C285965Tk.A01;
            if (j == j2) {
                return j2;
            }
        }
        int i = this.A05;
        return C3026964x.A00(((int) (j >> 32)) + i, ((int) (j & 4294967295L)) + i);
    }

    public C3022362e(C292055iK r1, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = r1;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }
}
