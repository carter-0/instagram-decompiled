package X;

/* renamed from: X.Qxt  reason: case insensitive filesystem */
public final class C8611Qxt extends RPX {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RPX) {
            return this.A00.equals(((C8611Qxt) ((RPX) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return 002.A0g("IntegrityTokenResponse{token=", this.A00, "}");
    }

    public /* synthetic */ C8611Qxt(String str) {
        this.A00 = str;
    }
}
