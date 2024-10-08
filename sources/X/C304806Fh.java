package X;

/* renamed from: X.6Fh  reason: invalid class name and case insensitive filesystem */
public final class C304806Fh {
    public final float A00;
    public final C304786Ff A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304806Fh) {
                C304806Fh r5 = (C304806Fh) obj;
                if (!C289095d0.A01(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BorderStroke(width=");
        sb.append(C289095d0.A00(this.A00));
        sb.append(", brush=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C304806Fh(C304786Ff r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
