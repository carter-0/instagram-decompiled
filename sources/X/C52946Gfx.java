package X;

/* renamed from: X.Gfx  reason: case insensitive filesystem */
public final class C52946Gfx extends C305016Gc {
    public final C56545I0z A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52946Gfx) {
                C52946Gfx gfx = (C52946Gfx) obj;
                if (!0qQ.A0K(this.A01, gfx.A01) || !0qQ.A0K(this.A00, gfx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C56545I0z A00() {
        return this.A00;
    }

    public final int hashCode() {
        return (AnonymousClass7TE.A0O(this.A01) + C51971G9r.A0E(this.A00)) * 31;
    }

    public final String toString() {
        return G9w.A0k("LinkAnnotation.Url(url=", this.A01);
    }

    public C52946Gfx(C56545I0z i0z, String str) {
        this.A01 = str;
        this.A00 = i0z;
    }
}
