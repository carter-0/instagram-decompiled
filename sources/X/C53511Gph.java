package X;

/* renamed from: X.Gph  reason: case insensitive filesystem */
public final class C53511Gph extends AnonymousClass0T0 implements C59486JLk {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53511Gph) {
                C53511Gph gph = (C53511Gph) obj;
                if (this.A01 != gph.A01 || !C289095d0.A01(this.A00, gph.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(this.A01 * 31, this.A00);
    }

    public C53511Gph(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }
}
