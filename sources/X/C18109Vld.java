package X;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.Vld  reason: case insensitive filesystem */
public abstract class C18109Vld {
    public static byte[] A00(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return A01(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        byte[] bArr3 = bArr;
        if (bArr3.length == 32) {
            long[] jArr4 = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
            copyOf[31] = b;
            copyOf[31] = (byte) (b | 64);
            int length = bArr2.length;
            if (length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, length);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i = 0;
                while (true) {
                    byte[][] bArr4 = C18296VpK.A00;
                    if (i >= 7) {
                        long[] jArr5 = new long[10];
                        int i2 = 0;
                        do {
                            int i3 = W3J.A01[i2];
                            jArr5[i2] = ((((((long) (copyOf2[i3] & 255)) | (((long) (copyOf2[i3 + 1] & 255)) << 8)) | (((long) (copyOf2[i3 + 2] & 255)) << 16)) | (((long) (copyOf2[i3 + 3] & 255)) << 24)) >> W3J.A00[i2]) & ((long) W3J.A02[i2 & 1]);
                            i2++;
                        } while (i2 < 10);
                        long[] jArr6 = new long[19];
                        long[] jArr7 = new long[19];
                        jArr7[0] = 1;
                        long[] jArr8 = new long[19];
                        jArr8[0] = 1;
                        long[] jArr9 = new long[19];
                        long[] jArr10 = new long[19];
                        long[] jArr11 = new long[19];
                        long[] jArr12 = jArr11;
                        jArr11[0] = 1;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr14;
                        jArr14[0] = 1;
                        System.arraycopy(jArr5, 0, jArr6, 0, 10);
                        int i4 = 0;
                        do {
                            byte b2 = copyOf[(32 - i4) - 1] & 255;
                            int i5 = 0;
                            do {
                                int i6 = (b2 >> (7 - i5)) & 1;
                                C18296VpK.A00(jArr8, jArr6, i6);
                                C18296VpK.A00(jArr9, jArr7, i6);
                                jArr = jArr12;
                                long[] jArr16 = jArr8;
                                long[] jArr17 = jArr9;
                                long[] jArr18 = jArr7;
                                long[] jArr19 = jArr6;
                                jArr2 = jArr13;
                                jArr3 = jArr15;
                                long[] copyOf3 = Arrays.copyOf(jArr8, 10);
                                long[] jArr20 = new long[19];
                                long[] jArr21 = new long[19];
                                long[] jArr22 = new long[19];
                                long[] jArr23 = new long[19];
                                long[] jArr24 = new long[19];
                                long[] jArr25 = new long[19];
                                W3J.A06(jArr8, jArr8, jArr9);
                                W3J.A05(jArr9, copyOf3, jArr9);
                                long[] copyOf4 = Arrays.copyOf(jArr6, 10);
                                W3J.A06(jArr6, jArr6, jArr7);
                                W3J.A05(jArr7, copyOf4, jArr7);
                                W3J.A04(jArr23, jArr6, jArr9);
                                W3J.A04(jArr24, jArr8, jArr7);
                                W3J.A01(jArr23);
                                W3J.A00(jArr23);
                                W3J.A01(jArr24);
                                W3J.A00(jArr24);
                                System.arraycopy(jArr23, 0, copyOf4, 0, 10);
                                W3J.A06(jArr23, jArr23, jArr24);
                                W3J.A05(jArr24, copyOf4, jArr24);
                                W3J.A02(jArr25, jArr23);
                                long[] jArr26 = new long[19];
                                W3J.A02(jArr26, jArr24);
                                W3J.A04(jArr24, jArr26, jArr5);
                                W3J.A01(jArr24);
                                W3J.A00(jArr24);
                                System.arraycopy(jArr25, 0, jArr10, 0, 10);
                                System.arraycopy(jArr24, 0, jArr12, 0, 10);
                                W3J.A02(jArr21, jArr8);
                                W3J.A02(jArr22, jArr9);
                                W3J.A04(jArr13, jArr21, jArr22);
                                W3J.A01(jArr13);
                                W3J.A00(jArr13);
                                W3J.A05(jArr22, jArr21, jArr22);
                                Arrays.fill(jArr20, 10, 18, 0);
                                int i7 = 0;
                                do {
                                    jArr20[i7] = jArr22[i7] * 121665;
                                    i7++;
                                } while (i7 < 10);
                                W3J.A00(jArr20);
                                W3J.A06(jArr20, jArr20, jArr21);
                                W3J.A04(jArr15, jArr22, jArr20);
                                W3J.A01(jArr15);
                                W3J.A00(jArr15);
                                C18296VpK.A00(jArr13, jArr10, i6);
                                long[] jArr27 = jArr15;
                                long[] jArr28 = jArr12;
                                C18296VpK.A00(jArr27, jArr28, i6);
                                i5++;
                                jArr7 = jArr28;
                                jArr9 = jArr27;
                                jArr8 = jArr13;
                                jArr6 = jArr10;
                                jArr15 = jArr17;
                                jArr13 = jArr16;
                                jArr12 = jArr18;
                                jArr10 = jArr19;
                            } while (i5 < 8);
                            i4++;
                        } while (i4 < 32);
                        long[] jArr29 = new long[10];
                        long[] jArr30 = new long[10];
                        long[] jArr31 = new long[10];
                        long[] jArr32 = new long[10];
                        long[] jArr33 = new long[10];
                        long[] jArr34 = new long[10];
                        long[] jArr35 = new long[10];
                        long[] jArr36 = new long[10];
                        long[] jArr37 = new long[10];
                        long[] jArr38 = new long[10];
                        long[] jArr39 = new long[10];
                        long[] jArr40 = jArr3;
                        W3J.A02(jArr30, jArr40);
                        W3J.A02(jArr39, jArr30);
                        W3J.A02(jArr38, jArr39);
                        W3J.A03(jArr31, jArr38, jArr40);
                        W3J.A03(jArr32, jArr31, jArr30);
                        W3J.A02(jArr38, jArr32);
                        W3J.A03(jArr33, jArr38, jArr31);
                        W3J.A02(jArr38, jArr33);
                        W3J.A02(jArr39, jArr38);
                        W3J.A02(jArr38, jArr39);
                        W3J.A02(jArr39, jArr38);
                        W3J.A02(jArr38, jArr39);
                        W3J.A03(jArr34, jArr38, jArr33);
                        W3J.A02(jArr38, jArr34);
                        W3J.A02(jArr39, jArr38);
                        int i8 = 2;
                        int i9 = 2;
                        do {
                            W3J.A02(jArr38, jArr39);
                            W3J.A02(jArr39, jArr38);
                            i9 += 2;
                        } while (i9 < 10);
                        W3J.A03(jArr35, jArr39, jArr34);
                        W3J.A02(jArr38, jArr35);
                        W3J.A02(jArr39, jArr38);
                        int i10 = 2;
                        do {
                            W3J.A02(jArr38, jArr39);
                            W3J.A02(jArr39, jArr38);
                            i10 += 2;
                        } while (i10 < 20);
                        W3J.A03(jArr38, jArr39, jArr35);
                        W3J.A02(jArr39, jArr38);
                        W3J.A02(jArr38, jArr39);
                        int i11 = 2;
                        do {
                            W3J.A02(jArr39, jArr38);
                            W3J.A02(jArr38, jArr39);
                            i11 += 2;
                        } while (i11 < 10);
                        W3J.A03(jArr36, jArr38, jArr34);
                        W3J.A02(jArr38, jArr36);
                        W3J.A02(jArr39, jArr38);
                        int i12 = 2;
                        do {
                            W3J.A02(jArr38, jArr39);
                            W3J.A02(jArr39, jArr38);
                            i12 += 2;
                        } while (i12 < 50);
                        W3J.A03(jArr37, jArr39, jArr36);
                        W3J.A02(jArr39, jArr37);
                        W3J.A02(jArr38, jArr39);
                        int i13 = 2;
                        do {
                            W3J.A02(jArr39, jArr38);
                            W3J.A02(jArr38, jArr39);
                            i13 += 2;
                        } while (i13 < 100);
                        W3J.A03(jArr39, jArr38, jArr37);
                        W3J.A02(jArr38, jArr39);
                        W3J.A02(jArr39, jArr38);
                        do {
                            W3J.A02(jArr38, jArr39);
                            W3J.A02(jArr39, jArr38);
                            i8 += 2;
                        } while (i8 < 50);
                        W3J.A03(jArr38, jArr39, jArr36);
                        W3J.A02(jArr39, jArr38);
                        W3J.A02(jArr38, jArr39);
                        W3J.A02(jArr39, jArr38);
                        W3J.A02(jArr38, jArr39);
                        W3J.A02(jArr39, jArr38);
                        W3J.A03(jArr29, jArr39, jArr32);
                        W3J.A03(jArr4, jArr2, jArr29);
                        long[] jArr41 = new long[10];
                        long[] jArr42 = new long[10];
                        long[] jArr43 = new long[11];
                        long[] jArr44 = new long[11];
                        long[] jArr45 = new long[11];
                        long[] jArr46 = jArr4;
                        W3J.A03(jArr41, jArr5, jArr46);
                        W3J.A06(jArr42, jArr5, jArr46);
                        long[] jArr47 = new long[10];
                        jArr47[0] = 486662;
                        W3J.A06(jArr44, jArr42, jArr47);
                        W3J.A03(jArr44, jArr44, jArr);
                        W3J.A06(jArr44, jArr44, jArr6);
                        W3J.A03(jArr44, jArr44, jArr41);
                        W3J.A03(jArr44, jArr44, jArr6);
                        int i14 = 0;
                        do {
                            jArr43[i14] = jArr44[i14] * 4;
                            i14++;
                        } while (i14 < 10);
                        W3J.A00(jArr43);
                        long[] jArr48 = jArr;
                        W3J.A03(jArr44, jArr41, jArr48);
                        W3J.A05(jArr44, jArr44, jArr48);
                        W3J.A03(jArr45, jArr42, jArr6);
                        W3J.A06(jArr44, jArr44, jArr45);
                        W3J.A02(jArr44, jArr44);
                        if (MessageDigest.isEqual(W3J.A07(jArr43), W3J.A07(jArr44))) {
                            return W3J.A07(jArr4);
                        }
                        throw DbW.A0c("Arithmetic error in curve multiplication with the public key: ", C374809Aw.A00(bArr2));
                    } else if (!MessageDigest.isEqual(bArr4[i], copyOf2)) {
                        i++;
                    } else {
                        throw new InvalidKeyException(002.A0R("Banned public key: ", C374809Aw.A00(bArr4[i])));
                    }
                }
            } else {
                throw new InvalidKeyException("Public key length is not 32-byte");
            }
        } else {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
    }
}
