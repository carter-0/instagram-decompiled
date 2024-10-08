package X;

/* renamed from: X.Qya  reason: case insensitive filesystem */
public final class C8637Qya extends C8642Qyf {
    public final char A00;
    public final char A01;

    public static C8637Qya A00() {
        return new C8637Qya('0', '9');
    }

    public final String toString() {
        return 002.A11("CharMatcher.inRange('", C12614Szy.A02(this.A01), "', '", C12614Szy.A02(this.A00), "')");
    }

    public C8637Qya(char c, char c2) {
        17k.A0E(JTQ.A1P(c2, c));
        this.A01 = c;
        this.A00 = c2;
    }
}
