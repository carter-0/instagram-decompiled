package X;

import java.math.BigInteger;

/* renamed from: X.RdA  reason: case insensitive filesystem */
public abstract class C9570RdA {
    public static byte[] A00(Integer num, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            if (bigInteger3 == null) {
                throw new C7899QcR("RSA modulus must be set.");
            } else if (bigInteger4 != null) {
                BigInteger bigInteger5 = BigInteger.ZERO;
                if (bigInteger3.equals(bigInteger5) || bigInteger4.equals(bigInteger5)) {
                    throw new C7899QcR("RSA modulus and public exponent must be nonzero.");
                } else if (bigInteger3.signum() == 1) {
                    byte[] A1Y = Pxg.A1Y(bigInteger3, 1);
                    int length = A1Y.length;
                    if (1 > length || length >= 65536) {
                        throw new C7899QcR("Modulus must be between 1 and 65535 bytes");
                    } else if (bigInteger4.signum() == 1) {
                        byte[] A1Y2 = Pxg.A1Y(bigInteger4, 1);
                        int length2 = A1Y2.length;
                        if (1 > length2 || length2 >= 256) {
                            throw new C7899QcR("Public exponent must be between 1 and 255 bytes");
                        }
                        short s = (short) length;
                        byte[] bArr = new byte[2];
                        Pxg.A1B(s & 65535, bArr, 0, 1);
                        return 0Yw.A0X(0Yw.A0X(0Yw.A0X(bArr, A1Y), new byte[]{(byte) length2}), A1Y2);
                    } else {
                        throw AnonymousClass7TE.A0w("The BigInteger value must be positive");
                    }
                } else {
                    throw AnonymousClass7TE.A0w("The BigInteger value must be positive");
                }
            } else {
                throw new C7899QcR("RSA public exponent must be set.");
            }
        } else if (intValue != 2) {
            throw new C7899QcR(002.A0R("Unsupporetd key parameters: ", S9N.A01(num)));
        } else if (bigInteger == null) {
            throw new C7899QcR("ECDSAP256 X must be set");
        } else if (bigInteger2 == null) {
            throw new C7899QcR("ECDSAP256 Y must be set");
        } else if (bigInteger.signum() == 1) {
            byte[] A1Y3 = Pxg.A1Y(bigInteger, 1);
            int length3 = A1Y3.length;
            if (1 > length3 || length3 >= 33) {
                throw new C7899QcR("x must be an unsigned 32-byte integer");
            } else if (bigInteger2.signum() == 1) {
                byte[] A1Y4 = Pxg.A1Y(bigInteger2, 1);
                int length4 = A1Y4.length;
                if (1 > length4 || length4 >= 33) {
                    throw new C7899QcR("y must be an unsigned 32-byte integer");
                }
                byte[] bArr2 = {64};
                if (JTQ.A1P(32, length3)) {
                    byte[] bArr3 = new byte[32];
                    System.arraycopy(A1Y3, 0, bArr3, 32 - length3, length3);
                    byte[] A0X = 0Yw.A0X(bArr2, bArr3);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(A1Y4, 0, bArr4, 32 - length4, length4);
                    return 0Yw.A0X(A0X, bArr4);
                }
                throw AnonymousClass7TE.A0w("Length must be greater than or equal to the size of the array");
            } else {
                throw AnonymousClass7TE.A0w("The BigInteger value must be positive");
            }
        } else {
            throw AnonymousClass7TE.A0w("The BigInteger value must be positive");
        }
    }
}
