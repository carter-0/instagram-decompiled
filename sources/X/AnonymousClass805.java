package X;

/* renamed from: X.805  reason: invalid class name */
public final class AnonymousClass805 {
    public String A00 = "";
    public String A01 = "unknown";
    public boolean A02 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass805) {
                AnonymousClass805 r5 = (AnonymousClass805) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02 || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxSurfaceToXpostEligibility(surface=");
        sb.append(this.A01);
        sb.append(", isEligible=");
        sb.append(this.A02);
        sb.append(", ineligibleReason=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A00.hashCode();
    }
}
