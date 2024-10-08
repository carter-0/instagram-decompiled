package X;

/* renamed from: X.GeH  reason: case insensitive filesystem */
public final class C52881GeH extends GRP {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C52881GeH)) {
            return false;
        }
        GRP grp = (GRP) obj;
        return 0qQ.A0K(grp.A01, this.A01) && 0qQ.A0K(grp.A00, this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51971G9r.A0E(this.A01) * 31 * 31);
    }
}
