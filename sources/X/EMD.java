package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EMD extends C47695EDe {
    public final C319616qu A00;
    public final AnonymousClass0aP A01;
    public final String A02;
    public final C307896Rx A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (X.C46629Di9.A01(r13) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.common.session.UserSession r13, com.instagram.user.model.User r14) {
        /*
            r12 = this;
            r1 = 0
            r5 = r13
            boolean r11 = X.AnonymousClass7TF.A1U(r1, r13, r14)
            X.6Rx r0 = r12.A03
            if (r0 == 0) goto L_0x0077
            androidx.fragment.app.Fragment r4 = X.C308206Td.A02(r0)
        L_0x000e:
            java.lang.String r9 = r14.getUsername()
            com.instagram.common.typedurl.ImageUrl r6 = r14.Bh3()
            r8 = 0
            X.Fdv r7 = new X.Fdv
            r7.<init>(r1, r12, r13, r14)
            java.lang.String r0 = X.C46632DiC.A01
            if (r0 == 0) goto L_0x0088
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0088
            boolean r0 = X.C46629Di9.A00(r13)
            if (r0 != 0) goto L_0x0033
            boolean r1 = X.C46629Di9.A01(r13)
            r0 = 1
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0040
            java.lang.String r10 = X.C46632DiC.A01
            if (r10 == 0) goto L_0x0079
            X.C46632DiC.A02(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x003f:
            return
        L_0x0040:
            if (r4 == 0) goto L_0x003f
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x003f
            boolean r0 = X.C46629Di9.A00(r13)
            if (r0 != 0) goto L_0x003f
            boolean r0 = X.C46629Di9.A01(r13)
            if (r0 == 0) goto L_0x003f
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0083
            com.instagram.login.credentialmanager.CredentialManagerSaveHelper r2 = new com.instagram.login.credentialmanager.CredentialManagerSaveHelper
            r2.<init>(r0)
            java.lang.String r5 = X.C46632DiC.A01
            if (r5 == 0) goto L_0x007e
            X.EuZ r3 = new X.EuZ
            r3.<init>(r7)
            X.4Cq r0 = r2.A00
            r7 = 15
            X.MGN r1 = new X.MGN
            r4 = r9
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            return
        L_0x0077:
            r4 = 0
            goto L_0x000e
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0088:
            java.lang.String r0 = "SmartLock account used for successful login; no need to save"
            r7.D5C(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMD.A03(com.instagram.common.session.UserSession, com.instagram.user.model.User):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EMD(X.C319616qu r14, X.C307896Rx r15, X.AnonymousClass0aP r16, java.lang.String r17) {
        /*
            r13 = this;
            r4 = r16
            r9 = r17
            X.AnonymousClass7TG.A1P(r4, r9)
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r15)
            X.DiE r7 = X.C46634DiE.A0z
            X.0iw r3 = X.C308206Td.A08(r15)
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r15)
            android.net.Uri r2 = X.C46413Dea.A00(r0)
            r5 = 0
            r0 = r13
            r6 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r4
            r13.A03 = r15
            r13.A02 = r9
            r13.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMD.<init>(X.6qu, X.6Rx, X.0aP, java.lang.String):void");
    }

    public final void A05(UserSession userSession, User user) {
        super.A03(userSession, user);
    }
}
