package X;

/* renamed from: X.JZo  reason: case insensitive filesystem */
public final class C59817JZo extends AnonymousClass0T0 implements MU8 {
    public final 0sP A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59817JZo) {
                C59817JZo jZo = (C59817JZo) obj;
                if (!0qQ.A0K(this.A01, jZo.A01) || !0qQ.A0K(this.A00, jZo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 0sP BV7() {
        return this.A00;
    }

    public final Object BWB() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
    }

    public C59817JZo(0sP r1, Object obj) {
        this.A01 = obj;
        this.A00 = r1;
    }
}
