package X;

/* renamed from: X.Rg2  reason: case insensitive filesystem */
public abstract class C9744Rg2 {
    public static Long A00(String str) {
        byte b;
        String str2 = str;
        str2.getClass();
        if (str2.isEmpty()) {
            return null;
        }
        int i = 0;
        if (str2.charAt(0) == '-') {
            i = 1;
        }
        int length = str2.length();
        if (i == length) {
            return null;
        }
        int i2 = i + 1;
        char charAt = str2.charAt(i);
        byte[] bArr = C10012Rl7.A00;
        if (charAt >= 128) {
            return null;
        }
        byte[] bArr2 = C10012Rl7.A00;
        byte b2 = bArr[charAt];
        if (b2 < 0 || b2 >= 10) {
            return null;
        }
        long j = (long) (-b2);
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt2 = str2.charAt(i2);
            if (charAt2 >= 128 || (b = bArr2[charAt2]) < 0 || b >= 10 || j < -922337203685477580L) {
                return null;
            }
            long j2 = j * 10;
            long j3 = (long) b;
            if (j2 < j3 - Long.MIN_VALUE) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (i != 0) {
            return Long.valueOf(j);
        }
        if (j != Long.MIN_VALUE) {
            return Long.valueOf(-j);
        }
        return null;
    }
}
