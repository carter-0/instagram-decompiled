package X;

/* renamed from: X.3pp  reason: invalid class name and case insensitive filesystem */
public final class C252863pp extends 1Jp implements C240623Lp {
    public final String A00() {
        return "image failed to load";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image View ");
        sb.append(this.A01.hashCode());
        sb.append(" failed to load on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(this.A00);
        return sb.toString();
    }
}
