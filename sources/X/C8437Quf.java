package X;

/* renamed from: X.Quf  reason: case insensitive filesystem */
public final class C8437Quf extends C8439Quh {
    public final char A00;

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.A00;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return 002.A0g("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    public C8437Quf(char c) {
        this.A00 = c;
    }
}
