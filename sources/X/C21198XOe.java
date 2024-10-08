package X;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* renamed from: X.XOe  reason: case insensitive filesystem */
public final class C21198XOe extends C21199XOf {
    public final XOh A00;
    public final XZF A01;
    public final C375079Cd A02;

    public static C21198XOe A00(XOh xOh, XZF xzf) {
        ECParameterSpec eCParameterSpec;
        ECParameterSpec eCParameterSpec2;
        ECPoint eCPoint = xOh.A04;
        if (eCPoint != null) {
            BigInteger bigInteger = xzf.A00;
            Xnm xnm = xOh.A00.A01;
            Xnm xnm2 = Xnm.A01;
            if (xnm == xnm2) {
                eCParameterSpec = C22029Xtj.A00;
            } else if (xnm == Xnm.A02) {
                eCParameterSpec = C22029Xtj.A01;
            } else if (xnm == Xnm.A03) {
                eCParameterSpec = C22029Xtj.A02;
            } else {
                throw C51973G9u.A0g(xnm, "Unable to determine NIST curve type for ", AnonymousClass7TE.A1A());
            }
            BigInteger order = eCParameterSpec.getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw AnonymousClass7TG.A0q("Invalid private value");
            }
            if (xnm == xnm2) {
                eCParameterSpec2 = C22029Xtj.A00;
            } else if (xnm == Xnm.A02) {
                eCParameterSpec2 = C22029Xtj.A01;
            } else if (xnm == Xnm.A03) {
                eCParameterSpec2 = C22029Xtj.A02;
            } else {
                throw C51973G9u.A0g(xnm, "Unable to determine NIST curve type for ", AnonymousClass7TE.A1A());
            }
            if (C22029Xtj.A06(bigInteger, eCParameterSpec2).equals(eCPoint)) {
                return new C21198XOe(xOh, xzf, (C375079Cd) null);
            }
            throw AnonymousClass7TG.A0q("Invalid private value");
        }
        throw AnonymousClass7TG.A0q("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
    }

    public C21198XOe(XOh xOh, XZF xzf, C375079Cd r3) {
        this.A00 = xOh;
        this.A01 = xzf;
        this.A02 = r3;
    }
}
