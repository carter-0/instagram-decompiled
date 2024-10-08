package X;

/* renamed from: X.Scq  reason: case insensitive filesystem */
public final class C11591Scq implements 1MD {
    public static final C11591Scq A00 = new C11591Scq();

    /* JADX WARNING: type inference failed for: r2v2, types: [X.QnQ, X.TQk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.QnQ, X.TQk, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QVG qvg;
        C250663lr A02;
        C250663lr reinterpretRequired;
        BSm bSm;
        C250663lr A04;
        QXJ qxj = (QXJ) obj;
        if (qxj == null) {
            return null;
        }
        C7645QRm A0E = qxj.A0E();
        if (A0E == null || (A04 = A0E.A04(C7642QRj.class, "error", -1726869523)) == null) {
            qvg = null;
        } else {
            qvg = Pxj.A0S(A04);
        }
        C7645QRm A0E2 = qxj.A0E();
        if (A0E2 != null && (A02 = A0E2.A02(C7640QRh.class, "additional_authentication_error", -1706267096)) != null && (reinterpretRequired = A02.reinterpretRequired(0, QR7.class, -2102847039)) != null) {
            Class<QR6> cls = QR6.class;
            C250663lr optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "auth_factor_requirements", cls, 1632846769);
            if (optionalTreeField != null) {
                Class<BSm> cls2 = BSm.class;
                if (optionalTreeField.reinterpretRequired(0, cls2, 1363505257) != null) {
                    C250663lr optionalTreeField2 = reinterpretRequired.getOptionalTreeField(0, "auth_factor_requirements", cls, 1632846769);
                    if (optionalTreeField2 == null || (bSm = (BSm) optionalTreeField2.reinterpretRequired(0, cls2, 1363505257)) == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                    C11009S5g A002 = CUF.A00(bSm);
                    ? tQk = new C13219TQk(0, "", "");
                    tQk.A00 = A002;
                    return tQk;
                }
            }
            C11009S5g s5g = new C11009S5g(0sn.A00, 0);
            ? tQk2 = new C13219TQk(0, "", "");
            tQk2.A00 = s5g;
            return tQk2;
        } else if (qvg != null) {
            return SPz.A03(qvg);
        } else {
            return null;
        }
    }
}
