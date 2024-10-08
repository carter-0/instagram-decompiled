package X;

public final class GS0 extends GRC {
    public final int A00;
    public final C52421GRz A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GS0) {
                GS0 gs0 = (GS0) obj;
                if (!0qQ.A0K(this.A01, gs0.A01) || this.A00 != gs0.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GS0(C52421GRz gRz, int i) {
        super(gRz.A04, "content_type_suggested_user");
        this.A01 = gRz;
        this.A00 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
