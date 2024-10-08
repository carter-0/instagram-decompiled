package X;

/* renamed from: X.GlH  reason: case insensitive filesystem */
public final class C53269GlH extends AnonymousClass0T0 {
    public Boolean A00 = null;
    public boolean A01 = false;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53269GlH) {
                C53269GlH glH = (C53269GlH) obj;
                if (!(this.A02 == glH.A02 && this.A01 == glH.A01 && 0qQ.A0K(this.A00, glH.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A02, G9w.A01(((int) (0 >>> 32)) * 31))) + AnonymousClass7TG.A0C(this.A00);
    }
}
