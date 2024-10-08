package X;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* renamed from: X.XzY  reason: case insensitive filesystem */
public final class C22323XzY implements AnonymousClass97E {
    public final int A00;

    public C22323XzY(int i) {
        this.A00 = i;
    }

    public final Object AJN(AnonymousClass97G r16) {
        C21244XQp xQp;
        C22533Y8e xzR;
        AnonymousClass97G r1 = r16;
        switch (this.A00) {
            case 0:
                XOh xOh = (XOh) r1;
                C3742398r r2 = C22312XzN.A06;
                C21196XOc xOc = xOh.A00;
                ECPoint eCPoint = xOh.A04;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec A01 = C22024Xt8.A01((C21244XQp) r2.A00(xOc.A01));
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                C22029Xtj.A07(eCPoint2, A01.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) C21056XCh.A0D(A01, eCPoint2);
                byte[] bArr = new byte[0];
                C3740497y r0 = xOc.A05;
                if (r0 != null) {
                    bArr = r0.A01();
                }
                String A012 = C22312XzN.A01(xOc.A02);
                return new C22312XzN(C22312XzN.A00(xOc.A00), (C21245XQq) C22312XzN.A07.A00(xOc.A03), A012, eCPublicKey, bArr, xOh.A01.A01());
            case 1:
                C21198XOe xOe = (C21198XOe) r1;
                C3742398r r22 = C22312XzN.A06;
                XOh xOh2 = xOe.A00;
                C21196XOc xOc2 = xOh2.A00;
                byte[] A002 = C21514Xdg.A00(xOe.A01.A00);
                ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) AnonymousClass9DU.A03.A00.BHw("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, A002), C22024Xt8.A01((C21244XQp) r22.A00(xOc2.A01))));
                byte[] bArr2 = new byte[0];
                C3740497y r02 = xOc2.A05;
                if (r02 != null) {
                    bArr2 = r02.A01();
                }
                C22312XzN.A01(xOc2.A02);
                C22312XzN.A07.A00(xOc2.A03);
                YAD A003 = C22312XzN.A00(xOc2.A00);
                if (!(xOh2 instanceof C21200XOg)) {
                    return new C22311XzM(A003, eCPrivateKey, bArr2, xOh2.A01.A01());
                }
                throw new NullPointerException("outputPrefix");
            case 2:
                C21200XOg xOg = (C21200XOg) r1;
                C21195XOb xOb = xOg.A00;
                C3740497y r8 = xOg.A02;
                return new C22313XzO(C22313XzO.A00(xOb.A01), C22313XzO.A01(xOb.A00), C22313XzO.A02(xOb.A02), r8, xOg.A01);
            default:
                C21197XOd xOd = (C21197XOd) r1;
                C21200XOg xOg2 = xOd.A00;
                C21195XOb xOb2 = xOg2.A00;
                XOa xOa = xOb2.A02;
                YAC A02 = C22313XzO.A02(xOa);
                C21980XoY A004 = C22313XzO.A00(xOb2.A01);
                YAV A013 = C22313XzO.A01(xOb2.A00);
                XOa xOa2 = XOa.A03;
                if (xOa.equals(xOa2) || xOa.equals(XOa.A00) || xOa.equals(XOa.A01) || xOa.equals(XOa.A02)) {
                    if (xOa.equals(xOa2)) {
                        byte[] A022 = xOd.A01.A02(C375049Ca.A00);
                        xzR = new C22317XzS(A022, C18109Vld.A00(A022));
                    } else {
                        XOa xOa3 = XOa.A00;
                        if (xOa.equals(xOa3) || xOa.equals(XOa.A01) || xOa.equals(XOa.A02)) {
                            byte[] A023 = xOd.A01.A02(C375049Ca.A00);
                            byte[] A014 = xOg2.A02.A01();
                            if (xOa.equals(xOa3)) {
                                xQp = C21244XQp.NIST_P256;
                            } else if (xOa.equals(XOa.A01)) {
                                xQp = C21244XQp.NIST_P384;
                            } else if (xOa.equals(XOa.A02)) {
                                xQp = C21244XQp.NIST_P521;
                            } else {
                                throw AnonymousClass7TG.A0q("Unrecognized NIST HPKE KEM identifier");
                            }
                            ECParameterSpec A015 = C22024Xt8.A01(xQp);
                            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(C22024Xt8.A02(A015.getCurve(), A014), A015);
                            AnonymousClass9DY r7 = AnonymousClass9DU.A03.A00;
                            ECPublicKey eCPublicKey2 = (ECPublicKey) ((KeyFactory) r7.BHw("EC")).generatePublic(eCPublicKeySpec);
                            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) ((KeyFactory) r7.BHw("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, A023), C22024Xt8.A01(xQp)));
                            C22024Xt8.A03(eCPrivateKey2, eCPublicKey2);
                            C22029Xtj.A07(eCPublicKey2.getW(), eCPrivateKey2.getParams().getCurve());
                            xzR = new C22316XzR(A023, A014);
                        } else {
                            throw AnonymousClass7TG.A0q("Unrecognized HPKE KEM identifier");
                        }
                    }
                    if (xOg2 instanceof C21200XOg) {
                        return new C22310XzL(A004, A013, A02, xzR, xOg2.A01);
                    }
                    throw new NullPointerException("outputPrefix");
                }
                throw AnonymousClass7TG.A0q("Unrecognized HPKE KEM identifier");
        }
    }
}
