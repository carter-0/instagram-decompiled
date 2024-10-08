package X;

public final class GST extends GRC {
    public final C52414GRr A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GST) {
                GST gst = (GST) obj;
                if (!0qQ.A0K(this.A00, gst.A00) || this.A01 != gst.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GST(C52414GRr gRr, int i) {
        super("ads_manager_item", "content_type_ads_manager_info");
        this.A00 = gRr;
        this.A01 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01;
    }
}
