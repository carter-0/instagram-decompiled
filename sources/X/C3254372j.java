package X;

/* renamed from: X.72j  reason: invalid class name and case insensitive filesystem */
public final class C3254372j extends C3254272i {
    public String A00;
    public boolean A01;
    public boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("imagecomponent_");
        sb.append(this.A05);
        sb.append("(onScreen: ");
        sb.append(this.A04);
        sb.append(", hasBeenOnScreen: ");
        sb.append(this.A03);
        sb.append(", didLoad: ");
        sb.append(this.A02);
        sb.append(", didFailToLoad: ");
        sb.append(this.A01);
        sb.append(", loadSource: ");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
