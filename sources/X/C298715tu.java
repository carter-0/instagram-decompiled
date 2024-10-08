package X;

/* renamed from: X.5tu  reason: invalid class name and case insensitive filesystem */
public final class C298715tu {
    public 1Xj A00;
    public String A01;
    public String A02;
    public String A03 = "unknown";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C298715tu) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
