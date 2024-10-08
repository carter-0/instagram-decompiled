package X;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: X.Xtj  reason: case insensitive filesystem */
public abstract class C22029Xtj {
    public static final ECParameterSpec A00 = A05("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final ECParameterSpec A01 = A05("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final ECParameterSpec A02 = A05("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    public static final BigInteger A03 = BigInteger.valueOf(8);
    public static final BigInteger A04 = BigInteger.valueOf(4);
    public static final BigInteger A05 = BigInteger.valueOf(3);
    public static final BigInteger A06 = BigInteger.valueOf(2);

    /* JADX WARNING: type inference failed for: r12v2, types: [X.XaV, java.lang.Object] */
    public static C21420XaV A00(C21420XaV xaV, C21420XaV xaV2, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = xaV.A02;
        BigInteger bigInteger4 = BigInteger.ZERO;
        if (bigInteger3.equals(bigInteger4)) {
            return xaV2;
        }
        if (xaV2.A02.equals(bigInteger4)) {
            return xaV;
        }
        BigInteger bigInteger5 = xaV.A02;
        BigInteger A0U = C21055XCg.A0U(bigInteger5, bigInteger2);
        BigInteger bigInteger6 = xaV2.A02;
        BigInteger A0U2 = C21055XCg.A0U(bigInteger6, bigInteger2);
        BigInteger A032 = A03(xaV.A00, A0U2, bigInteger2);
        BigInteger A033 = A03(xaV2.A00, A0U, bigInteger2);
        BigInteger A034 = A03(A03(xaV.A01, bigInteger6, bigInteger2), A0U2, bigInteger2);
        BigInteger A035 = A03(A03(xaV2.A01, bigInteger5, bigInteger2), A0U, bigInteger2);
        if (!A032.equals(A033)) {
            BigInteger mod = A033.subtract(A032).mod(bigInteger2);
            BigInteger A036 = A03(mod.multiply(A04), mod, bigInteger2);
            BigInteger A037 = A03(mod, A036, bigInteger2);
            BigInteger subtract = A035.subtract(A034);
            BigInteger bigInteger7 = A06;
            BigInteger A038 = A03(subtract, bigInteger7, bigInteger2);
            BigInteger A039 = A03(A032, A036, bigInteger2);
            BigInteger mod2 = C21055XCg.A0U(A038, bigInteger2).subtract(A037).subtract(A039.multiply(bigInteger7)).mod(bigInteger2);
            BigInteger mod3 = A038.multiply(A039.subtract(mod2)).subtract(A034.multiply(bigInteger7).multiply(A037)).mod(bigInteger2);
            BigInteger A0310 = A03(C21055XCg.A0U(bigInteger5.add(bigInteger6), bigInteger2).subtract(A0U).subtract(A0U2), mod, bigInteger2);
            ? obj = new Object();
            obj.A00 = mod2;
            obj.A01 = mod3;
            obj.A02 = A0310;
            return obj;
        } else if (!A034.equals(A035)) {
            return C21420XaV.A03;
        } else {
            return A01(xaV, bigInteger, bigInteger2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.XaV, java.lang.Object] */
    public static C21420XaV A01(C21420XaV xaV, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = xaV.A01;
        if (bigInteger3.equals(BigInteger.ZERO)) {
            return C21420XaV.A03;
        }
        BigInteger bigInteger4 = xaV.A00;
        BigInteger A0U = C21055XCg.A0U(bigInteger4, bigInteger2);
        BigInteger A0U2 = C21055XCg.A0U(bigInteger3, bigInteger2);
        BigInteger A0U3 = C21055XCg.A0U(A0U2, bigInteger2);
        BigInteger bigInteger5 = xaV.A02;
        BigInteger A0U4 = C21055XCg.A0U(bigInteger5, bigInteger2);
        BigInteger subtract = C21055XCg.A0U(bigInteger4.add(A0U2), bigInteger2).subtract(A0U).subtract(A0U3);
        BigInteger bigInteger6 = A06;
        BigInteger multiply = subtract.multiply(bigInteger6);
        BigInteger add = A0U.multiply(A05).add(A03(bigInteger.multiply(A0U4), A0U4, bigInteger2));
        BigInteger mod = C21055XCg.A0U(add, bigInteger2).subtract(multiply.multiply(bigInteger6)).mod(bigInteger2);
        BigInteger mod2 = A03(add, multiply.subtract(mod), bigInteger2).subtract(A0U3.multiply(A03)).mod(bigInteger2);
        BigInteger mod3 = C21055XCg.A0U(bigInteger3.add(bigInteger5), bigInteger2).subtract(A0U2).subtract(A0U4).mod(bigInteger2);
        ? obj = new Object();
        obj.A00 = mod;
        obj.A01 = mod2;
        obj.A02 = mod3;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.XaV, java.lang.Object] */
    public static C21420XaV A02(BigInteger bigInteger, ECPoint eCPoint) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return C21420XaV.A03;
        }
        BigInteger mod = new BigInteger(1, AnonymousClass9B0.A00((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger A0U = C21055XCg.A0U(mod, bigInteger);
        BigInteger A032 = A03(A0U, mod, bigInteger);
        BigInteger A033 = A03(eCPoint.getAffineX(), A0U, bigInteger);
        BigInteger A034 = A03(eCPoint.getAffineY(), A032, bigInteger);
        ? obj = new Object();
        obj.A00 = A033;
        obj.A01 = A034;
        obj.A02 = mod;
        return obj;
    }

    public static ECParameterSpec A05(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ECPoint A06(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        ECPoint eCPoint;
        if (!A08(eCParameterSpec, A00) && !A08(eCParameterSpec, A01) && !A08(eCParameterSpec, A02)) {
            throw AnonymousClass7TG.A0q("spec must be NIST P256, P384 or P521");
        } else if (bigInteger.signum() != 1) {
            throw AnonymousClass7TG.A0q("k must be positive");
        } else if (bigInteger.compareTo(eCParameterSpec.getOrder()) < 0) {
            EllipticCurve curve = eCParameterSpec.getCurve();
            ECPoint generator = eCParameterSpec.getGenerator();
            A07(generator, curve);
            BigInteger a = eCParameterSpec.getCurve().getA();
            BigInteger A042 = A04(curve);
            C21420XaV A022 = A02(A042, ECPoint.POINT_INFINITY);
            C21420XaV A023 = A02(A042, generator);
            for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
                if (bigInteger.testBit(bitLength)) {
                    A022 = A00(A022, A023, a, A042);
                    A023 = A01(A023, a, A042);
                } else {
                    A023 = A00(A022, A023, a, A042);
                    A022 = A01(A022, a, A042);
                }
            }
            if (A022.A02.equals(BigInteger.ZERO)) {
                eCPoint = ECPoint.POINT_INFINITY;
            } else {
                BigInteger modInverse = A022.A02.modInverse(A042);
                BigInteger A0U = C21055XCg.A0U(modInverse, A042);
                eCPoint = new ECPoint(A03(A022.A00, A0U, A042), A03(A03(A022.A01, A0U, A042), modInverse, A042));
            }
            A07(eCPoint, curve);
            return eCPoint;
        } else {
            throw AnonymousClass7TG.A0q("k must be smaller than the order of the generator");
        }
    }

    public static BigInteger A03(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.multiply(bigInteger2).mod(bigInteger3);
    }

    public static BigInteger A04(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw AnonymousClass7TG.A0q("Only curves over prime order fields are supported");
    }

    public static void A07(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger A042 = A04(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw AnonymousClass7TG.A0q(AnonymousClass000.A00(1692));
        } else if (affineX.signum() == -1 || affineX.compareTo(A042) >= 0) {
            throw AnonymousClass7TG.A0q(AnonymousClass000.A00(1934));
        } else if (affineY.signum() == -1 || affineY.compareTo(A042) >= 0) {
            throw AnonymousClass7TG.A0q(AnonymousClass000.A00(1974));
        } else if (!C21055XCg.A0U(affineY, A042).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(A042))) {
            throw AnonymousClass7TG.A0q(AnonymousClass000.A00(997));
        }
    }

    public static boolean A08(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        if (!eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) || !eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) || !eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) || eCParameterSpec.getCofactor() != eCParameterSpec2.getCofactor()) {
            return false;
        }
        return true;
    }
}
