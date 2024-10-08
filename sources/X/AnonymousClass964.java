package X;

/* renamed from: X.964  reason: invalid class name */
public final class AnonymousClass964 extends AnonymousClass965 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass965)) {
                return false;
            }
            AnonymousClass964 r4 = (AnonymousClass964) ((AnonymousClass965) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return 002.A11("LibraryVersion{libraryName=", this.A00, ", version=", this.A01, "}");
    }

    public AnonymousClass964(String str, String str2) {
        this.A00 = str;
        if (str2 != null) {
            this.A01 = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }
}
