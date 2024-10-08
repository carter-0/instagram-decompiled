package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public abstract class OX2 {
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Object, X.OGa] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f5 A[Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010c A[Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C70679OGa A00(X.C39736A7c r14, byte[] r15, byte[] r16) {
        /*
            X.9sU r11 = r14.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r4 = r11.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.9sU r0 = X.C391189sU.DHKEM_P256_SHA256     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r0.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r4 != r0) goto L_0x01d9
            X.9sS r12 = r14.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r1 = r12.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.9sS r0 = X.C391169sS.SHA256     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r0.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r1 != r0) goto L_0x01d1
            java.security.interfaces.ECPrivateKey r6 = r14.A05     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.interfaces.ECPublicKey r3 = r14.A06     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r11)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r5 = 0
            X.0qQ.A0B(r15, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.spec.ECParameterSpec r0 = X.C39865ACl.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r15.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r13 = 65
            if (r0 != r13) goto L_0x01c9
            byte r0 = r15[r5]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r10 = 4
            if (r0 != r10) goto L_0x01c1
            r2 = 33
            r7 = 1
            byte[] r0 = java.util.Arrays.copyOfRange(r15, r7, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r8 = java.util.Arrays.copyOfRange(r15, r2, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r2.<init>(r7, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.<init>(r7, r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.spec.ECPoint r8 = new java.security.spec.ECPoint     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r8.<init>(r2, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.C39865ACl.A00(r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.C39865ACl.A00(r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.spec.ECParameterSpec r0 = X.C39865ACl.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.spec.ECPublicKeySpec r2 = new java.security.spec.ECPublicKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r2.<init>(r8, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.PublicKey r2 = r0.generatePublic(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.lang.String r0 = "ECDH"
            javax.crypto.KeyAgreement r0 = javax.crypto.KeyAgreement.getInstance(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r0 == 0) goto L_0x01b9
            r0.init(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.doPhase(r2, r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r9 = r0.generateSecret()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r9)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.security.spec.ECPoint r0 = r3.getW()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.C39865ACl.A00(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r8 = new byte[r13]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.math.BigInteger r2 = r0.getAffineX()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.math.BigInteger r6 = r0.getAffineY()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r2.signum()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r0 != 0) goto L_0x00e2
            int r0 = r6.signum()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r0 != 0) goto L_0x00e2
        L_0x0097:
            byte[][] r0 = new byte[][]{r15, r8}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r6 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r2 = X.C71059Oad.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A00(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[][] r0 = new byte[][]{r2, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r3 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r10 = r11.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r8 = X.C71059Oad.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[][] r0 = new byte[][]{r8, r3, r0, r9}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r2 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0 = 32
            byte[] r0 = new byte[r0]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.lang.String r7 = "HmacSHA256"
            byte[] r0 = X.C66582MXn.A1b(r0, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r2.<init>(r0, r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r2 = X.C71059Oad.A01(r2, r0, r6, r3, r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.0qQ.A07(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C70679OGa.A05     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.9sE r0 = r14.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte r10 = r0.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.OGa r3 = new X.OGa     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x0126
        L_0x00e2:
            byte[] r7 = r2.toByteArray()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3 = 0
        L_0x00e7:
            int r2 = r7.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r2 + -1
            if (r3 >= r0) goto L_0x00f3
            byte r0 = r7[r3]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r0 != 0) goto L_0x00f3
            int r3 = r3 + 1
            goto L_0x00e7
        L_0x00f3:
            if (r3 == 0) goto L_0x00f9
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r3, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
        L_0x00f9:
            byte[] r6 = r6.toByteArray()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3 = 0
        L_0x00fe:
            int r2 = r6.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r2 + -1
            if (r3 >= r0) goto L_0x010a
            byte r0 = r6[r3]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r0 != 0) goto L_0x010a
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x010a:
            if (r3 == 0) goto L_0x0110
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r3, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
        L_0x0110:
            int r3 = r7.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0 = 32
            if (r3 > r0) goto L_0x01b1
            int r2 = r6.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            if (r2 > r0) goto L_0x01b1
            int r0 = r0 - r3
            int r0 = r0 + 1
            int r13 = r13 - r2
            r8[r5] = r10     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.lang.System.arraycopy(r7, r5, r8, r0, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.lang.System.arraycopy(r6, r5, r8, r13, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x0097
        L_0x0126:
            if (r10 != 0) goto L_0x01e1
            byte[] r9 = new byte[r5]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r11 = new byte[r5]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            X.NkB r5 = r14.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r5.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r6 = r5.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r5 = r5.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r12 = r12.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r13 = X.C71059Oad.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r4 = X.C71059Oad.A00(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = X.C71059Oad.A00(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A00(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[][] r0 = new byte[][]{r13, r4, r1, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r4 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = new byte[r12]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C70679OGa.A08     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[][] r0 = new byte[][]{r8, r4, r0, r11}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r11 = X.C66582MXn.A1b(r1, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = new byte[r12]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C70679OGa.A06     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r12 = r16
            byte[][] r0 = new byte[][]{r8, r4, r0, r12}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = X.C66582MXn.A1b(r1, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.write(r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.write(r11)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r0.write(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.A02 = r0     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C70679OGa.A09     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[][] r0 = new byte[][]{r8, r4, r0, r9}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C66582MXn.A1b(r2, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.A03 = r0     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r2.<init>(r0, r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = X.C70679OGa.A07     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = r3.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A01(r2, r1, r0, r4, r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.A01 = r0     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r1 = X.C70679OGa.A05     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = r3.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = X.C71059Oad.A01(r2, r1, r0, r4, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.A00 = r0     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            int r0 = r0.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            byte[] r0 = new byte[r0]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r3.A04 = r0     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            return r3
        L_0x01b1:
            java.lang.String r0 = "Point provided does not conform to P256 coordinate size"
            java.security.InvalidParameterException r1 = new java.security.InvalidParameterException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01b9:
            java.lang.String r0 = "Could not get instance of KeyAgreement for algorithm ECDH."
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01c1:
            java.lang.String r0 = "Only uncompressed point format accepted"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01c9:
            java.lang.String r0 = "Point does not match P256 EC field size"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01d1:
            java.lang.String r0 = "Only HKDF-SHA256 is supported."
            X.Nn6 r1 = new X.Nn6     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01d9:
            java.lang.String r0 = "Only DHKEM_P256_SHA256 is supported."
            X.Nn6 r1 = new X.Nn6     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
            goto L_0x01e7
        L_0x01e1:
            java.lang.String r0 = "Only mode_base is supported"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
        L_0x01e7:
            throw r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x01e8 }
        L_0x01e8:
            r1 = move-exception
            X.Nn6 r0 = new X.Nn6
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OX2.A00(X.A7c, byte[], byte[]):X.OGa");
    }

    public static byte[] A01(C70679OGa oGa, C39736A7c a7c, byte[] bArr, byte[] bArr2) {
        OV7 nc5;
        try {
            int i = a7c.A00.A03;
            if (i == C69371NkB.AES128GCM.A03) {
                nc5 = new NC4();
            } else if (i == C69371NkB.AES256GCM.A03) {
                nc5 = new NC5();
            } else {
                throw new Exception("Only AES256GCM or AES128GCM are supported.");
            }
            byte[] bArr3 = oGa.A00;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            for (int i2 = 0; i2 < length; i2++) {
                bArr4[i2] = (byte) (bArr4[i2] ^ oGa.A04[i2]);
            }
            byte[] A00 = nc5.A00(oGa.A01, bArr4, bArr, bArr2);
            byte[] bArr5 = oGa.A04;
            boolean z = false;
            for (int length2 = bArr5.length - 1; length2 >= 0 && !z; length2--) {
                byte b = bArr5[length2];
                if (b != -1) {
                    bArr5[length2] = (byte) (b + 1);
                    z = true;
                } else {
                    bArr5[length2] = 0;
                }
            }
            return A00;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
    }

    public static byte[] A02(C70679OGa oGa, String str, byte[] bArr, byte[] bArr2) {
        OV7 nc5;
        try {
            long parseLong = (Long.parseLong(str, 16) >> 16) & 65535;
            if (parseLong == ((long) C69371NkB.AES128GCM.A03)) {
                nc5 = new NC4();
            } else if (parseLong == ((long) C69371NkB.AES256GCM.A03)) {
                nc5 = new NC5();
            } else {
                throw new Exception("Only AES256GCM or AES128GCM are supported.");
            }
            byte[] bArr3 = oGa.A00;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            for (int i = 0; i < length; i++) {
                bArr4[i] = (byte) (bArr4[i] ^ oGa.A04[i]);
            }
            byte[] A00 = nc5.A00(oGa.A01, bArr4, bArr, bArr2);
            byte[] bArr5 = oGa.A04;
            boolean z = false;
            for (int length2 = bArr5.length - 1; length2 >= 0 && !z; length2--) {
                byte b = bArr5[length2];
                if (b != -1) {
                    bArr5[length2] = (byte) (b + 1);
                    z = true;
                } else {
                    bArr5[length2] = 0;
                }
            }
            return A00;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
    }
}
