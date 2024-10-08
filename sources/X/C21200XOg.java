package X;

import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

/* renamed from: X.XOg  reason: case insensitive filesystem */
public final class C21200XOg extends XOW {
    public final C21195XOb A00;
    public final C3740497y A01;
    public final C3740497y A02;
    public final Integer A03;

    public static C21200XOg A00(C21195XOb xOb, C3740497y r8, Integer num) {
        C3740497y A012;
        ECParameterSpec eCParameterSpec;
        Xnl xnl = xOb.A03;
        Xnl xnl2 = Xnl.A02;
        if (!xnl.equals(xnl2) && num == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("'idRequirement' must be non-null for ");
            A1A.append(xnl);
            throw AnonymousClass7TG.A0q(AnonymousClass7TF.A0l(" variant.", A1A));
        } else if (!xnl.equals(xnl2) || num == null) {
            XOa xOa = xOb.A02;
            int length = r8.A00.length;
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("Encoded public key byte length for ");
            A1A2.append(xOa);
            String A0t = Pxg.A0t(" must be %d, not ", A1A2, length);
            XOa xOa2 = XOa.A00;
            if (xOa == xOa2) {
                if (length != 65) {
                    throw C21055XCg.A0W(A0t, AnonymousClass7TF.A1b(65));
                }
            } else if (xOa == XOa.A01) {
                if (length != 97) {
                    throw C21055XCg.A0W(A0t, AnonymousClass7TF.A1b(97));
                }
            } else if (xOa == XOa.A02) {
                if (length != 133) {
                    throw C21055XCg.A0W(A0t, AnonymousClass7TF.A1b(133));
                }
            } else if (xOa != XOa.A03) {
                throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(xOa, "Unable to validate public key length for ", AnonymousClass7TE.A1A()));
            } else if (length != 32) {
                throw C21055XCg.A0W(A0t, AnonymousClass7TF.A1b(32));
            }
            if (xOa == xOa2 || xOa == XOa.A01 || xOa == XOa.A02) {
                if (xOa == xOa2) {
                    eCParameterSpec = C22029Xtj.A00;
                } else if (xOa == XOa.A01) {
                    eCParameterSpec = C22029Xtj.A01;
                } else if (xOa == XOa.A02) {
                    eCParameterSpec = C22029Xtj.A02;
                } else {
                    throw C51973G9u.A0g(xOa, "Unable to determine NIST curve type for ", AnonymousClass7TE.A1A());
                }
                EllipticCurve curve = eCParameterSpec.getCurve();
                C22029Xtj.A07(C22024Xt8.A02(curve, r8.A01()), curve);
            }
            if (xnl == xnl2) {
                A012 = C375109Ch.A00;
            } else if (num == null) {
                throw C66582MXn.A0k(xnl, "idRequirement must be non-null for HpkeParameters.Variant ", AnonymousClass7TE.A1A());
            } else if (xnl == Xnl.A01) {
                A012 = C375109Ch.A00(num.intValue());
            } else if (xnl == Xnl.A03) {
                A012 = C375109Ch.A01(num.intValue());
            } else {
                throw C66582MXn.A0k(xnl, "Unknown HpkeParameters.Variant: ", AnonymousClass7TE.A1A());
            }
            return new C21200XOg(xOb, r8, A012, num);
        } else {
            throw AnonymousClass7TG.A0q("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public C21200XOg(C21195XOb xOb, C3740497y r2, C3740497y r3, Integer num) {
        this.A00 = xOb;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = num;
    }

    public final Integer A04() {
        return this.A03;
    }
}
