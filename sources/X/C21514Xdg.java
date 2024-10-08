package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.Xdg  reason: case insensitive filesystem */
public abstract class C21514Xdg {
    public static byte[] A00(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw AnonymousClass7TE.A0w("n must not be negative");
    }

    public static byte[] A01(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (length > i2) {
                throw AnonymousClass7TG.A0q("integer too large");
            } else if (length != i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
                return bArr;
            } else if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            } else {
                throw AnonymousClass7TG.A0q("integer too large");
            }
        } else {
            throw AnonymousClass7TE.A0w("integer must be nonnegative");
        }
    }
}
