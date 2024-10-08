package X;

/* renamed from: X.8qE  reason: invalid class name and case insensitive filesystem */
public final class C367128qE extends C353538Ia {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C367128qE) && 0qQ.A0K(this.A00, ((C367128qE) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public C367128qE(String str) {
        super("draft");
        this.A00 = str;
    }

    public C367128qE() {
        this((String) null);
    }
}
