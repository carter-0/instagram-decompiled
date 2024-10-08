package X;

public final class HCI extends GRC {
    public final BBV A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HCI) {
                HCI hci = (HCI) obj;
                if (!0qQ.A0K(this.A00, hci.A00) || this.A01 != hci.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public HCI(BBV bbv, int i) {
        super("business_conversion_reminder", "content_type_business_conversion_reminder");
        this.A00 = bbv;
        this.A01 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01;
    }
}
