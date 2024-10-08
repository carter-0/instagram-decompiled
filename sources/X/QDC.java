package X;

import com.fbpay.hub.form.params.FormParams;

public final class QDC extends 2YL {
    public QD8 A00;
    public FormParams A01;
    public C11351SOk A02;
    public final AnonymousClass2gB A03;
    public final AnonymousClass2gB A04;
    public final AnonymousClass2gB A05;
    public final AnonymousClass2Fj A06;
    public final AnonymousClass2Fj A07 = JTO.A0K();
    public final AnonymousClass2Fj A08;
    public final 2FO A09;
    public final C10444RsL A0A;
    public final AnonymousClass2gO A0B;
    public final 0sP A0C;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A00(X.QDC r2, java.lang.Object r3, java.lang.Throwable r4) {
        /*
            r0 = 0
            X.0yf r1 = X.Pxe.A0N(r0)
            com.fbpay.hub.form.params.FormParams r0 = r2.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r0.A00
            if (r0 == 0) goto L_0x000f
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
        L_0x000f:
            com.fbpay.hub.form.params.FormParams r0 = r2.A01
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0027
            java.lang.Long r3 = X.DbV.A0q(r0)
            java.lang.String r0 = "id"
        L_0x001b:
            r1.put(r0, r3)
        L_0x001e:
            if (r4 == 0) goto L_0x0026
            java.lang.String r0 = "throwable"
            r1.put(r0, r4)
        L_0x0026:
            return r1
        L_0x0027:
            if (r3 == 0) goto L_0x001e
            java.lang.String r0 = "data"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDC.A00(X.QDC, java.lang.Object, java.lang.Throwable):java.util.Map");
    }

    public QDC(2FO r8, C10444RsL rsL) {
        C11652Sdu A002 = C11652Sdu.A00(this, 50);
        this.A0B = A002;
        TPM tpm = new TPM(this, 14);
        this.A0C = tpm;
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A03 = A0M;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A08 = A0K;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A06 = A0K2;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A04 = A0M2;
        this.A05 = Pxh.A0M();
        this.A0A = rsL;
        this.A09 = r8;
        AnonymousClass2gB A022 = AnonymousClass72Y.A02(A0K, tpm);
        AnonymousClass2gB A023 = AnonymousClass72Y.A02(A0K2, tpm);
        C11652Sdu.A03(A022, A0M, this, 51);
        C11652Sdu.A03(A023, A0M, this, 52);
        A0M2.A0E(A022, A002);
        A0M2.A0E(A023, A002);
    }
}
