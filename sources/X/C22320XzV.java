package X;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* renamed from: X.XzV  reason: case insensitive filesystem */
public final class C22320XzV implements C3739097k {
    public final int A00;

    public C22320XzV(int i) {
        this.A00 = i;
    }

    public final AnonymousClass97G AMH(AnonymousClass983 r7, Integer num) {
        ECParameterSpec eCParameterSpec;
        C21244XQp xQp;
        C3740497y A002;
        C375079Cd A01;
        if (this.A00 != 0) {
            C21195XOb xOb = (C21195XOb) r7;
            AnonymousClass97I r0 = C21353XYg.A03;
            XOa xOa = xOb.A02;
            if (xOa.equals(XOa.A03)) {
                byte[] A003 = AnonymousClass9B0.A00(32);
                A003[0] = (byte) (A003[0] | 7);
                byte b = (byte) (A003[31] & 63);
                A003[31] = b;
                A003[31] = (byte) (b | 128);
                A01 = C375079Cd.A01(C375049Ca.A00, A003);
                A002 = C3740497y.A00(C18109Vld.A00(A003));
            } else {
                XOa xOa2 = XOa.A00;
                if (xOa.equals(xOa2) || xOa.equals(XOa.A01) || xOa.equals(XOa.A02)) {
                    byte[] bArr = C21996Xq3.A00;
                    if (xOa == xOa2) {
                        xQp = C21244XQp.NIST_P256;
                    } else if (xOa == XOa.A01) {
                        xQp = C21244XQp.NIST_P384;
                    } else if (xOa == XOa.A02) {
                        xQp = C21244XQp.NIST_P521;
                    } else {
                        throw AnonymousClass7TG.A0q("Unrecognized NIST HPKE KEM identifier");
                    }
                    KeyPair A004 = C22024Xt8.A00(C22024Xt8.A01(xQp));
                    A002 = C3740497y.A00(C22024Xt8.A04(C21245XQq.UNCOMPRESSED, ((ECPublicKey) A004.getPublic()).getW(), C22024Xt8.A01(xQp).getCurve()));
                    A01 = C375079Cd.A01(C375049Ca.A00, C21514Xdg.A01(((ECPrivateKey) A004.getPrivate()).getS(), C21996Xq3.A00(xOa)));
                } else {
                    throw AnonymousClass7TG.A0q("Unknown KEM ID");
                }
            }
            return C21197XOd.A00(C21200XOg.A00(xOb, A002, num), A01);
        }
        C21196XOc xOc = (C21196XOc) r7;
        AnonymousClass97I r02 = C21352XYf.A03;
        Xnm xnm = xOc.A01;
        if (xnm == Xnm.A01) {
            eCParameterSpec = C22029Xtj.A00;
        } else if (xnm == Xnm.A02) {
            eCParameterSpec = C22029Xtj.A01;
        } else if (xnm == Xnm.A03) {
            eCParameterSpec = C22029Xtj.A02;
        } else {
            throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(xnm, "Unsupported curve type: ", AnonymousClass7TE.A1A()));
        }
        KeyPair A005 = C22024Xt8.A00(eCParameterSpec);
        return C21198XOe.A00(XOh.A01(xOc, num, ((ECPublicKey) A005.getPublic()).getW()), new XZF(((ECPrivateKey) A005.getPrivate()).getS()));
    }
}
