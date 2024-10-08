package X;

/* renamed from: X.Gfw  reason: case insensitive filesystem */
public final class C52945Gfw extends C305016Gc {
    public final C56545I0z A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52945Gfw) {
                C52945Gfw gfw = (C52945Gfw) obj;
                if (!0qQ.A0K(this.A01, gfw.A01) || !0qQ.A0K(this.A00, gfw.A00)) {
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
        return G9w.A0k("LinkAnnotation.Clickable(tag=", this.A01);
    }

    public C52945Gfw(C56545I0z i0z, String str) {
        this.A01 = str;
        this.A00 = i0z;
    }
}
