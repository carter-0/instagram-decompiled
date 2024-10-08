package X;

/* renamed from: X.6JX  reason: invalid class name */
public final class AnonymousClass6JX {
    public static final AnonymousClass6JX A03 = new AnonymousClass6JX(new C52395GQu(0.0f, 0.0f), 0.0f, 0);
    public final float A00;
    public final int A01;
    public final C74589Pxc A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JX) {
                AnonymousClass6JX r5 = (AnonymousClass6JX) obj;
                if (!(this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + this.A02.hashCode()) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressBarRangeInfo(current=");
        sb.append(this.A00);
        sb.append(", range=");
        sb.append(this.A02);
        sb.append(", steps=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6JX(C74589Pxc pxc, float f, int i) {
        this.A00 = f;
        this.A02 = pxc;
        this.A01 = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }
}
