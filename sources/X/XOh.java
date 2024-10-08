package X;

import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public final class XOh extends XOW {
    public final C21196XOc A00;
    public final C3740497y A01;
    public final C3740497y A02;
    public final Integer A03;
    public final ECPoint A04;

    public static XOh A00(C21196XOc xOc, C3740497y r7, Integer num) {
        C21196XOc xOc2 = xOc;
        if (xOc.A01.equals(Xnm.A04)) {
            Xnk xnk = xOc.A04;
            Integer num2 = num;
            A03(xnk, num);
            C3740497y r4 = r7;
            if (r7.A00.length == 32) {
                return new XOh(xOc2, r4, A02(xnk, num), num2, (ECPoint) null);
            }
            throw AnonymousClass7TG.A0q("Encoded public point byte length for X25519 curve must be 32");
        }
        throw AnonymousClass7TG.A0q("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public static XOh A01(C21196XOc xOc, Integer num, ECPoint eCPoint) {
        ECParameterSpec eCParameterSpec;
        C21196XOc xOc2 = xOc;
        Xnm xnm = xOc.A01;
        if (!xnm.equals(Xnm.A04)) {
            Xnk xnk = xOc.A04;
            A03(xnk, num);
            if (xnm == Xnm.A01) {
                eCParameterSpec = C22029Xtj.A00;
            } else if (xnm == Xnm.A02) {
                eCParameterSpec = C22029Xtj.A01;
            } else if (xnm == Xnm.A03) {
                eCParameterSpec = C22029Xtj.A02;
            } else {
                throw C51973G9u.A0g(xnm, "Unable to determine NIST curve type for ", AnonymousClass7TE.A1A());
            }
            C22029Xtj.A07(eCPoint, eCParameterSpec.getCurve());
            return new XOh(xOc2, (C3740497y) null, A02(xnk, num), num, eCPoint);
        }
        throw AnonymousClass7TG.A0q("createForNistCurve may only be called with parameters for NIST curve");
    }

    public static C3740497y A02(Xnk xnk, Integer num) {
        if (xnk == Xnk.A02) {
            return C375109Ch.A00;
        }
        if (num == null) {
            throw C66582MXn.A0k(xnk, "idRequirement must be non-null for EciesParameters.Variant: ", AnonymousClass7TE.A1A());
        } else if (xnk == Xnk.A01) {
            return C375109Ch.A00(num.intValue());
        } else {
            if (xnk == Xnk.A03) {
                return C375109Ch.A01(num.intValue());
            }
            throw C66582MXn.A0k(xnk, "Unknown EciesParameters.Variant: ", AnonymousClass7TE.A1A());
        }
    }

    public static void A03(Xnk xnk, Integer num) {
        Xnk xnk2 = Xnk.A02;
        if (!xnk.equals(xnk2) && num == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("'idRequirement' must be non-null for ");
            A1A.append(xnk);
            throw AnonymousClass7TG.A0q(AnonymousClass7TF.A0l(" variant.", A1A));
        } else if (xnk.equals(xnk2) && num != null) {
            throw AnonymousClass7TG.A0q("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public XOh(C21196XOc xOc, C3740497y r2, C3740497y r3, Integer num, ECPoint eCPoint) {
        this.A00 = xOc;
        this.A04 = eCPoint;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = num;
    }

    public final Integer A04() {
        return this.A03;
    }
}
