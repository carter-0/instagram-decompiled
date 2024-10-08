package X;

public final class GSF extends GRC {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GSF) && this.A00 == ((GSF) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public GSF(int i) {
        super("see_all_suggested_users", "content_type_header");
        this.A00 = i;
    }
}
