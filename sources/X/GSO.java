package X;

public final class GSO extends GRC {
    public final GSP A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GSO) {
                GSO gso = (GSO) obj;
                if (!0qQ.A0K(this.A00, gso.A00) || this.A01 != gso.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GSO(GSP gsp, int i) {
        super("branded_content_info", "content_type_branded_content_info");
        this.A00 = gsp;
        this.A01 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01;
    }
}
