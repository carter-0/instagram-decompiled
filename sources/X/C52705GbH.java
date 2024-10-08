package X;

/* renamed from: X.GbH  reason: case insensitive filesystem */
public final class C52705GbH extends AnonymousClass0T0 {
    public final float A00;
    public final int A01 = 2;

    public C52705GbH(float f) {
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52705GbH) {
                C52705GbH gbH = (C52705GbH) obj;
                if (!(Float.compare(this.A00, gbH.A00) == 0 && this.A01 == gbH.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return G9w.A00(this.A00) + this.A01;
    }
}
