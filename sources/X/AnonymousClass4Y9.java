package X;

/* renamed from: X.4Y9  reason: invalid class name */
public abstract class AnonymousClass4Y9 {
    public final int A00;

    static {
        int length = "xml ".length();
        boolean z = false;
        if (length <= 4) {
            z = true;
        }
        C256703wD.A03(z);
        for (int i = 0; i < length; i++) {
            "xml ".charAt(i);
        }
    }

    public static String A00(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return A00(this.A00);
    }

    public AnonymousClass4Y9(int i) {
        this.A00 = i;
    }
}
