package X;

/* renamed from: X.Jum  reason: case insensitive filesystem */
public final class C60990Jum extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final boolean A02;

    public C60990Jum(int i, float f, boolean z) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this.A01 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60990Jum)) {
                return false;
            }
            C60990Jum jum = (C60990Jum) obj;
            if (jum.A01 == 1 && this.A02 == jum.A02 && Float.compare(this.A00, jum.A00) == 0) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C60990Jum)) {
                return false;
            }
            C60990Jum jum2 = (C60990Jum) obj;
            if (jum2.A01 == 0 && Float.compare(this.A00, jum2.A00) == 0 && this.A02 == jum2.A02) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int floatToIntBits;
        int i;
        if (this.A01 != 0) {
            floatToIntBits = C51965G9l.A05(this.A02);
            i = Float.floatToIntBits(this.A00);
        } else {
            floatToIntBits = Float.floatToIntBits(this.A00) * 31;
            i = 1237;
            if (this.A02) {
                i = 1231;
            }
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        if (this.A01 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoPreview(postCropAspectRatio=");
        A1A.append(this.A00);
        A1A.append(", isLandscape=");
        return G9t.A1C(A1A, this.A02);
    }
}
