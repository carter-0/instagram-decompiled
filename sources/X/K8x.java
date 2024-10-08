package X;

public final class K8x extends C333827aD {
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K8x(String str) {
        super(002.A0R("empty_space_model", str));
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K8x) && 0qQ.A0K(this.A00, ((K8x) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
