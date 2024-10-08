package X;

/* renamed from: X.3u6  reason: invalid class name and case insensitive filesystem */
public final class C255423u6 {
    public final Long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255423u6) {
                C255423u6 r5 = (C255423u6) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Long l = this.A00;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Preference(key=");
        sb.append(this.A01);
        sb.append(", value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C255423u6(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }
}
