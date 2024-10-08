package X;

/* renamed from: X.JzO  reason: case insensitive filesystem */
public final class C61230JzO extends AnonymousClass0T0 implements MU8 {
    public final Throwable A00;
    public final Object A01;
    public final Object A02;
    public final 0sP A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61230JzO) {
                C61230JzO jzO = (C61230JzO) obj;
                if (!0qQ.A0K(this.A00, jzO.A00) || !0qQ.A0K(this.A02, jzO.A02) || !0qQ.A0K(this.A03, jzO.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 0sP BV7() {
        return this.A03;
    }

    public final Object BWB() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C61230JzO(Object obj, Throwable th, 0sP r3) {
        this.A00 = th;
        this.A02 = obj;
        this.A03 = r3;
        this.A01 = obj;
    }
}
