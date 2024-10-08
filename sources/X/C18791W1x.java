package X;

/* renamed from: X.W1x  reason: case insensitive filesystem */
public final class C18791W1x {
    public static final C18791W1x A00 = new Object();

    public static final void A00(C59721JVf jVf, VZG vzg, X3K x3k) {
        C17322VRb vRb;
        C13997Tnz tnz = (C13997Tnz) jVf.A00;
        if (tnz.A03) {
            C17321VRa vRa = new C17321VRa(vzg, x3k);
            VVM vvm = vzg.A01;
            VAC.A00(vvm, vvm.A00, "promote_client_token_requested");
            C18794W2b.A00(vzg.A00, (AnonymousClass07i) AnonymousClass7TE.A14(vzg.A04), new C19179WOl(0, vRa, vzg), vzg.A02);
            return;
        }
        if (tnz.A00) {
            0qQ.A0B(x3k, 0);
            vRb = new C17322VRb(AnonymousClass05K.A00, "");
        } else {
            vRb = C15417UcT.A00;
        }
        x3k.DfU(vRb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C59721JVf r7, X.VZG r8, X.X3K r9) {
        /*
            X.0eM r3 = r8.A03
            java.lang.Object r0 = r3.getValue()
            X.VMZ r0 = (X.VMZ) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r6 = r8.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318024411649798(0x81070d00001706, double:3.0310031066489674E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0034
            r0 = 36318024411780871(0x81070d00021707, double:3.0310031067318585E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0034
            java.lang.Object r0 = r3.getValue()
            X.VMZ r0 = (X.VMZ) r0
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0036
        L_0x0030:
            A00(r7, r8, r9)
            return
        L_0x0034:
            java.lang.String r0 = ""
        L_0x0036:
            java.lang.Object r1 = r7.A00
            X.Tnz r1 = (X.C13997Tnz) r1
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0075
            X.WOL r2 = new X.WOL
            r2.<init>(r7, r8, r9, r0)
            androidx.fragment.app.FragmentActivity r5 = r8.A00
            X.0eM r1 = r8.A04
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r1)
            X.07i r4 = (X.AnonymousClass07i) r4
            X.WOr r3 = new X.WOr
            r3.<init>(r2)
            r1 = 1
            X.0qQ.A0B(r4, r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r1 = "ads/promote/validate_business_user_access_token/"
            r2.A0A(r1)
            java.lang.String r1 = "business_user_access_token"
            r2.A9m(r1, r0)
            java.lang.Class<X.UX2> r1 = X.UX2.class
            java.lang.Class<X.VmH> r0 = X.C18141VmH.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 25
            X.C15621Ufn.A00(r1, r3, r0)
            X.1ES.A00(r5, r4, r1)
            return
        L_0x0075:
            A02(r7, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18791W1x.A01(X.JVf, X.VZG, X.X3K):void");
    }

    public static final void A02(C59721JVf jVf, X3K x3k, String str) {
        C17322VRb vRb;
        Number number = (Number) jVf.A01;
        boolean A1U = AnonymousClass7TF.A1U(0, number, str);
        int intValue = number.intValue();
        if (intValue == 0) {
            vRb = new C17322VRb(AnonymousClass05K.A00, str);
        } else if (intValue == A1U) {
            vRb = C15417UcT.A00;
        } else {
            throw new RuntimeException();
        }
        x3k.DfU(vRb);
    }
}
