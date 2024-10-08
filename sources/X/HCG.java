package X;

public final class HCG extends GRC {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HCG) && this.A00 == ((HCG) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public HCG(int i) {
        super("su_loading", "content_type_loading");
        this.A00 = i;
    }
}
