package X;

/* renamed from: X.62c  reason: invalid class name and case insensitive filesystem */
public final class C3022162c {
    public final int A00;
    public final int A01;
    public final C291845hy A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3022162c) {
                C3022162c r5 = (C3022162c) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.A02);
        sb.append(", startIndex=");
        sb.append(this.A01);
        sb.append(", endIndex=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C3022162c(C291845hy r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }
}
