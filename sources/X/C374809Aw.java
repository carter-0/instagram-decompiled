package X;

/* renamed from: X.9Aw  reason: invalid class name and case insensitive filesystem */
public abstract class C374809Aw {
    public static String A00(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r6 * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            String A00 = AnonymousClass000.A00(4295);
            sb.append(A00.charAt(b2 / 16));
            sb.append(A00.charAt(b2 % 16));
        }
        return sb.toString();
    }

    public static byte[] A01(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            int i = length / 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                int digit = Character.digit(str.charAt(i3), 16);
                int digit2 = Character.digit(str.charAt(i3 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i2] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
