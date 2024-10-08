package X;

/* renamed from: X.9FR  reason: invalid class name */
public final class AnonymousClass9FR {
    public C2379139t A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9FR) {
                AnonymousClass9FR r5 = (AnonymousClass9FR) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdAndState(id=");
        sb.append(this.A01);
        sb.append(Pxd.A00(119));
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
