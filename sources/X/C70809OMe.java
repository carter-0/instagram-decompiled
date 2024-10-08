package X;

/* renamed from: X.OMe  reason: case insensitive filesystem */
public final class C70809OMe {
    public float A00;
    public float A01;
    public int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C70809OMe oMe = (C70809OMe) obj;
            if (!(Float.compare(this.A00, oMe.A00) == 0 && Float.compare(this.A01, oMe.A01) == 0 && this.A02 == oMe.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31 * 31, this.A01) + this.A02;
    }
}
