package X;

/* renamed from: X.9IY  reason: invalid class name */
public final class AnonymousClass9IY extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass9IY(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = obj;
        this.A05 = obj2;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9IY r3;
        int i;
        int i2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9IY)) {
                return false;
            }
            r3 = (AnonymousClass9IY) obj;
            if (r3.A00 != 1 || this.A01 != r3.A01 || this.A03 != r3.A03) {
                return false;
            }
            i = this.A02;
            i2 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9IY)) {
                return false;
            }
            r3 = (AnonymousClass9IY) obj;
            if (r3.A00 != 0 || this.A02 != r3.A02 || this.A01 != r3.A01) {
                return false;
            }
            i = this.A03;
            i2 = r3.A03;
        }
        if (i != i2 || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A05, r3.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode;
        if (this.A00 != 0) {
            i = ((this.A01 * 31) + this.A03) * 31;
            i2 = this.A02;
        } else {
            i = ((this.A02 * 31) + this.A01) * 31;
            i2 = this.A03;
        }
        int i3 = (i + i2) * 31;
        Object obj = this.A04;
        int i4 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FrameWatchResult(frameCount=");
        sb.append(this.A01);
        sb.append(", smallFrameDrops=");
        sb.append(this.A03);
        sb.append(", largeFrameDrops=");
        sb.append(this.A02);
        sb.append(", avgFrameMetrics=");
        sb.append(this.A04);
        sb.append(", largeFrameDropMetrics=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }
}
