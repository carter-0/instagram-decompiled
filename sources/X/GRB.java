package X;

public final class GRB extends GRC {
    public final boolean A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GRB) {
                GRB grb = (GRB) obj;
                if (!(this.A00 == grb.A00 && this.A01 == grb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GRB(boolean z, int i) {
        super("loading", "content_type_loading");
        this.A00 = z;
        this.A01 = i;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A00) + this.A01;
    }
}
