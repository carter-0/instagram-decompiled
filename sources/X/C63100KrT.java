package X;

/* renamed from: X.KrT  reason: case insensitive filesystem */
public abstract class C63100KrT {
    public static final String A00(String str) {
        int length = str.length() - 1;
        int A07 = 00l.A07(str, ".jpg", length);
        if (A07 == -1) {
            A07 = 00l.A07(str, ".png", length);
        }
        if (A07 == -1) {
            A07 = 30;
        }
        int i = A07 - 30;
        int i2 = new int[]{0, i}[0] ^ AnonymousClass972.MUTABLE_FLAG_MASK;
        int i3 = i ^ AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i3 > i2) {
            i2 = i3;
        }
        return C51967G9n.A0q(str, i2 ^ AnonymousClass972.MUTABLE_FLAG_MASK, A07);
    }
}
