package X;

/* renamed from: X.GlP  reason: case insensitive filesystem */
public final class C53277GlP extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C53277GlP(Object obj, Object obj2, float f, float f2, int i) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = obj;
        this.A04 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53277GlP)) {
                return false;
            }
            C53277GlP glP = (C53277GlP) obj;
            if (glP.A02 == 1 && 0qQ.A0K(this.A04, glP.A04) && 0qQ.A0K(this.A03, glP.A03) && Float.compare(this.A00, glP.A00) == 0 && Float.compare(this.A01, glP.A01) == 0) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53277GlP)) {
                return false;
            }
            C53277GlP glP2 = (C53277GlP) obj;
            if (glP2.A02 == 0 && Float.compare(this.A00, glP2.A00) == 0 && Float.compare(this.A01, glP2.A01) == 0 && 0qQ.A0K(this.A03, glP2.A03) && 0qQ.A0K(this.A04, glP2.A04)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        if (this.A02 != 0) {
            return C51966G9m.A02(AnonymousClass7TF.A00(((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31, this.A00), this.A01);
        }
        return ((AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }
}
