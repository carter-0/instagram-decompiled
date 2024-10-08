package X;

/* renamed from: X.4f4  reason: invalid class name and case insensitive filesystem */
public final class C269404f4 extends C269384f2 {
    public static final C269404f4 A03;
    public static final String A04;
    public final int A00;
    public final String A01;
    public final char[] A02;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        A04 = str;
        A03 = new C269404f4(str);
    }

    public C269404f4(String str) {
        int length = "  ".length();
        this.A00 = length;
        this.A02 = new char[(length * 16)];
        int i = 0;
        int i2 = 0;
        do {
            "  ".getChars(0, length, this.A02, i2);
            i2 += length;
            i++;
        } while (i < 16);
        this.A01 = str;
    }

    public C269404f4() {
        this(A04);
    }
}
