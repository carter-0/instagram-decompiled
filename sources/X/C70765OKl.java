package X;

/* renamed from: X.OKl  reason: case insensitive filesystem */
public final class C70765OKl {
    public String A00;
    public String A01;
    public String A02;

    public final int hashCode() {
        int i = 0;
        int A0G = ((JTR.A0G(this.A00) * 31) + JTR.A0G(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0G + i;
    }
}
