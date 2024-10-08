package X;

/* renamed from: X.5ZQ  reason: invalid class name */
public final class AnonymousClass5ZQ extends AnonymousClass5ZR {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5ZQ) {
                AnonymousClass5ZR r5 = (AnonymousClass5ZR) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundedCornerShape(topStart = ");
        sb.append(this.A03);
        sb.append(", topEnd = ");
        sb.append(this.A02);
        sb.append(", bottomEnd = ");
        sb.append(this.A00);
        sb.append(", bottomStart = ");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
