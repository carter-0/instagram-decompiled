package X;

/* renamed from: X.6BZ  reason: invalid class name */
public final class AnonymousClass6BZ extends AnonymousClass0T0 implements C303846Ba {
    public final AnonymousClass6BY A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BZ) {
                AnonymousClass6BZ r5 = (AnonymousClass6BZ) obj;
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
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public AnonymousClass6BZ(AnonymousClass6BY r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
