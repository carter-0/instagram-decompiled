package X;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: X.Xt8  reason: case insensitive filesystem */
public abstract class C22024Xt8 {
    public static KeyPair A00(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) AnonymousClass9DU.A04.A00.BHw("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECParameterSpec A01(C21244XQp xQp) {
        int ordinal = xQp.ordinal();
        if (ordinal == 0) {
            return C22029Xtj.A00;
        }
        if (ordinal == 1) {
            return C22029Xtj.A01;
        }
        if (ordinal == 2) {
            return C22029Xtj.A02;
        }
        throw new NoSuchAlgorithmException(AnonymousClass7TG.A0m(xQp, "curve not implemented:", AnonymousClass7TE.A1A()));
    }

    public static ECPoint A02(EllipticCurve ellipticCurve, byte[] bArr) {
        int bitLength = (C22029Xtj.A04(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int length = bArr.length;
        if (length != (bitLength * 2) + 1) {
            throw AnonymousClass7TG.A0q("invalid point size");
        } else if (bArr[0] == 4) {
            int i = bitLength + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
            C22029Xtj.A07(eCPoint, ellipticCurve);
            return eCPoint;
        } else {
            throw AnonymousClass7TG.A0q("invalid point format");
        }
    }

    public static void A03(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (!C22029Xtj.A08(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw AnonymousClass7TG.A0q("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] A04(C21245XQq xQq, ECPoint eCPoint, EllipticCurve ellipticCurve) {
        byte[] bArr;
        byte b;
        C22029Xtj.A07(eCPoint, ellipticCurve);
        int bitLength = (C22029Xtj.A04(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int ordinal = xQq.ordinal();
        if (ordinal != 0) {
            int i = 2;
            if (ordinal == 2) {
                int i2 = bitLength * 2;
                byte[] bArr2 = new byte[i2];
                byte[] A00 = C21514Xdg.A00(eCPoint.getAffineX());
                int length = A00.length;
                if (length > bitLength) {
                    A00 = Arrays.copyOfRange(A00, length - bitLength, length);
                }
                byte[] A002 = C21514Xdg.A00(eCPoint.getAffineY());
                int length2 = A002.length;
                if (length2 > bitLength) {
                    A002 = Arrays.copyOfRange(A002, length2 - bitLength, length2);
                }
                int length3 = A002.length;
                System.arraycopy(A002, 0, bArr2, i2 - length3, length3);
                int length4 = A00.length;
                System.arraycopy(A00, 0, bArr2, bitLength - length4, length4);
                return bArr2;
            } else if (ordinal == 1) {
                int i3 = bitLength + 1;
                bArr = new byte[i3];
                byte[] A003 = C21514Xdg.A00(eCPoint.getAffineX());
                int length5 = A003.length;
                System.arraycopy(A003, 0, bArr, i3 - length5, length5);
                if (eCPoint.getAffineY().testBit(0)) {
                    i = 3;
                }
                b = (byte) i;
            } else {
                throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(xQq, "invalid format:", AnonymousClass7TE.A1A()));
            }
        } else {
            int i4 = (bitLength * 2) + 1;
            bArr = new byte[i4];
            byte[] A004 = C21514Xdg.A00(eCPoint.getAffineX());
            byte[] A005 = C21514Xdg.A00(eCPoint.getAffineY());
            int length6 = A005.length;
            System.arraycopy(A005, 0, bArr, i4 - length6, length6);
            int length7 = A004.length;
            System.arraycopy(A004, 0, bArr, (bitLength + 1) - length7, length7);
            b = 4;
        }
        bArr[0] = b;
        return bArr;
    }

    public static byte[] A05(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        Throwable th;
        A03(eCPrivateKey, eCPublicKey);
        ECPoint w = eCPublicKey.getW();
        C22029Xtj.A07(w, eCPrivateKey.getParams().getCurve());
        PublicKey A0D = C21056XCh.A0D(eCPrivateKey.getParams(), w);
        KeyAgreement keyAgreement = (KeyAgreement) AnonymousClass9DU.A02.A00.BHw("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(A0D, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(C22029Xtj.A04(curve)) >= 0) {
                th = AnonymousClass7TG.A0q("shared secret is out of range");
            } else {
                BigInteger A04 = C22029Xtj.A04(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(A04);
                if (A04.signum() == 1) {
                    BigInteger mod2 = mod.mod(A04);
                    BigInteger bigInteger2 = null;
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        int i = 0;
                        if (!A04.testBit(0) || !A04.testBit(1)) {
                            if (A04.testBit(0) && !A04.testBit(1)) {
                                BigInteger bigInteger4 = BigInteger.ONE;
                                BigInteger bigInteger5 = bigInteger4;
                                BigInteger shiftRight = A04.subtract(bigInteger4).shiftRight(1);
                                while (true) {
                                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(A04);
                                    if (mod3.equals(bigInteger3)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, A04);
                                    if (!modPow.add(bigInteger5).equals(A04)) {
                                        if (!modPow.equals(bigInteger5)) {
                                            th = new InvalidAlgorithmParameterException("p is not prime");
                                            break;
                                        }
                                        bigInteger4 = bigInteger2.add(bigInteger5);
                                        i++;
                                        if (i == 128 && !A04.isProbablePrime(80)) {
                                            th = new InvalidAlgorithmParameterException("p is not prime");
                                            break;
                                        }
                                    } else {
                                        BigInteger shiftRight2 = A04.add(bigInteger5).shiftRight(1);
                                        BigInteger bigInteger6 = bigInteger2;
                                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                            BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                            bigInteger6 = bigInteger6.multiply(bigInteger6).add(C21055XCg.A0U(bigInteger5, A04).multiply(mod3)).mod(A04);
                                            bigInteger5 = multiply.add(multiply).mod(A04);
                                            if (shiftRight2.testBit(bitLength)) {
                                                BigInteger mod4 = bigInteger6.multiply(bigInteger2).add(bigInteger5.multiply(mod3)).mod(A04);
                                                bigInteger5 = bigInteger2.multiply(bigInteger5).add(bigInteger6).mod(A04);
                                                bigInteger6 = mod4;
                                            }
                                        }
                                        bigInteger2 = bigInteger6;
                                    }
                                }
                            }
                            bigInteger3 = bigInteger2;
                        } else {
                            bigInteger2 = mod2.modPow(A04.add(BigInteger.ONE).shiftRight(2), A04);
                        }
                        if (bigInteger2 != null && C21055XCg.A0U(bigInteger2, A04).compareTo(mod2) != 0) {
                            th = AnonymousClass7TG.A0q("Could not find a modular square root");
                        }
                        bigInteger3 = bigInteger2;
                    }
                    if (true != bigInteger3.testBit(0)) {
                        A04.subtract(bigInteger3).mod(A04);
                    }
                    return generateSecret;
                }
                th = new InvalidAlgorithmParameterException("p must be positive");
            }
            throw th;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
