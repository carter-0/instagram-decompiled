package X;

/* renamed from: X.SCo  reason: case insensitive filesystem */
public abstract class C11158SCo {
    public static final byte[] A00 = A00("16aafe");
    public static final byte[] A01 = A00("17ffab01");
    public static final byte[] A02 = A00("ff4c000215");

    public static byte[] A00(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
        throw AnonymousClass7TE.A0w("Unable to convert hexString since length is not even sized");
    }
}
