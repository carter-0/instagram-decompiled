package X;

public final class GR0 extends GRC {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GR0) {
                GR0 gr0 = (GR0) obj;
                if (!(this.A00 == gr0.A00 && this.A01 == gr0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public GR0(int i, int i2) {
        super(String.valueOf(i), "content_type_header");
        this.A00 = i;
        this.A01 = i2;
    }
}
