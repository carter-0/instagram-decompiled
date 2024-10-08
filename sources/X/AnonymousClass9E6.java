package X;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: X.9E6  reason: invalid class name */
public abstract class AnonymousClass9E6 {
    public static final ECParameterSpec A00;
    public static final BigInteger A01;
    public static final BigInteger A02;
    public static final BigInteger A03;
    public static final BigInteger A04;
    public static final BigInteger A05;
    public static final BigInteger A06;

    static {
        BigInteger bigInteger = new BigInteger("ffffffff00000001000000000000000000000000ffffffffffffffffffffffff", 16);
        A06 = bigInteger;
        BigInteger bigInteger2 = new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16);
        A01 = bigInteger2;
        BigInteger bigInteger3 = new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16);
        A02 = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16);
        A05 = bigInteger4;
        BigInteger bigInteger5 = new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16);
        A03 = bigInteger5;
        BigInteger bigInteger6 = new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16);
        A04 = bigInteger6;
        A00 = new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger2, bigInteger3), new ECPoint(bigInteger5, bigInteger6), bigInteger4, 1);
    }

    public static void A00(ECPoint eCPoint) {
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new InvalidAlgorithmParameterException(AnonymousClass000.A00(1692));
        }
        if (affineX.signum() != -1) {
            BigInteger bigInteger = A06;
            if (affineX.compareTo(bigInteger) < 0) {
                if (affineY.signum() == -1 || affineY.compareTo(bigInteger) >= 0) {
                    throw new InvalidAlgorithmParameterException(AnonymousClass000.A00(1974));
                } else if (!affineY.multiply(affineY).mod(bigInteger).equals(affineX.multiply(affineX).add(A01).multiply(affineX).add(A02).mod(bigInteger))) {
                    throw new InvalidAlgorithmParameterException(AnonymousClass000.A00(997));
                } else {
                    return;
                }
            }
        }
        throw new InvalidAlgorithmParameterException(AnonymousClass000.A00(1934));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(java.security.spec.ECPoint r9) {
        /*
            A00(r9)
            r8 = 65
            byte[] r7 = new byte[r8]
            java.math.BigInteger r1 = r9.getAffineX()
            java.math.BigInteger r3 = r9.getAffineY()
            int r0 = r1.signum()
            if (r0 != 0) goto L_0x001c
            int r0 = r3.signum()
            if (r0 != 0) goto L_0x001c
            return r7
        L_0x001c:
            byte[] r6 = r1.toByteArray()
            r2 = 0
        L_0x0021:
            int r1 = r6.length
            int r0 = r1 + -1
            if (r2 >= r0) goto L_0x002d
            byte r0 = r6[r2]
            if (r0 != 0) goto L_0x002d
            int r2 = r2 + 1
            goto L_0x0021
        L_0x002d:
            if (r2 == 0) goto L_0x0033
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r2, r1)
        L_0x0033:
            byte[] r5 = r3.toByteArray()
            r2 = 0
        L_0x0038:
            int r1 = r5.length
            int r0 = r1 + -1
            if (r2 >= r0) goto L_0x0044
            byte r0 = r5[r2]
            if (r0 != 0) goto L_0x0044
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0044:
            if (r2 == 0) goto L_0x004a
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r2, r1)
        L_0x004a:
            int r4 = r6.length
            r0 = 32
            if (r4 > r0) goto L_0x0061
            int r3 = r5.length
            if (r3 > r0) goto L_0x0061
            int r0 = r0 - r4
            int r2 = r0 + 1
            int r8 = r8 - r3
            r1 = 4
            r0 = 0
            r7[r0] = r1
            java.lang.System.arraycopy(r6, r0, r7, r2, r4)
            java.lang.System.arraycopy(r5, r0, r7, r8, r3)
            return r7
        L_0x0061:
            r0 = 594(0x252, float:8.32E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9E6.A01(java.security.spec.ECPoint):byte[]");
    }
}
