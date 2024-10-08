package X;

/* renamed from: X.6RN  reason: invalid class name */
public final class AnonymousClass6RN {
    public final AnonymousClass6RL A00;
    public final AnonymousClass6RL A01;

    public AnonymousClass6RN(AnonymousClass6RL r2, AnonymousClass6RL r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6RN) {
                AnonymousClass6RN r5 = (AnonymousClass6RN) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        AnonymousClass6RL r0 = this.A01;
        return hashCode + (r0 == null ? 0 : r0.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(sessionCacheSnapshot=");
        sb.append(this.A00);
        sb.append(", sessionlessCacheSnapshot=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
