package X;

/* renamed from: X.95S  reason: invalid class name */
public class AnonymousClass95S extends AnonymousClass95T {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass95S)) {
            return false;
        }
        AnonymousClass95T r4 = (AnonymousClass95T) obj;
        if (this.A00 == null && r4.A00 == null) {
            AnonymousClass95T r1 = this.A02;
            AnonymousClass95T r0 = r4.A02;
            if (r1 != null ? r1.equals(r0) : r0 == null) {
                if (this.A03.equals(r4.A03)) {
                    return true;
                }
            }
        }
        if (A01() != null) {
            return A01().equals(r4.A01());
        }
        if (r4.A01() == null) {
            return true;
        }
        return false;
    }
}
