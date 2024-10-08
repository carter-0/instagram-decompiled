package X;

public final class HCH extends GRC {
    public final String A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HCH) {
                HCH hch = (HCH) obj;
                if (!0qQ.A0K(this.A00, hch.A00) || this.A01 != hch.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public HCH(String str, int i) {
        super("banner", "content_banner");
        this.A00 = str;
        this.A01 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + this.A01;
    }
}
