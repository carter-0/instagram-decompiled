package X;

/* renamed from: X.6Bo  reason: invalid class name and case insensitive filesystem */
public final class C303986Bo extends C268454dQ {
    public final C303976Bn A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C303986Bo) && 0qQ.A0K(this.A00, ((C303986Bo) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadedFontFamily(typeface=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C303986Bo(C303976Bn r1) {
        this.A00 = r1;
    }
}
