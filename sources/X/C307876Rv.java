package X;

/* renamed from: X.6Rv  reason: invalid class name and case insensitive filesystem */
public final class C307876Rv {
    public final AnonymousClass6RN A00;

    public final boolean equals(Object obj) {
        AnonymousClass6RN r2 = this.A00;
        if (!(obj instanceof C307876Rv) || !0qQ.A0K(r2, ((C307876Rv) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        AnonymousClass6RN r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(cacheStoreSnapshot=");
        sb.append(r2);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C307876Rv(AnonymousClass6RN r1) {
        this.A00 = r1;
    }
}
