package X;

/* renamed from: X.FQo  reason: case insensitive filesystem */
public final class C50131FQo implements AnonymousClass0hF, AnonymousClass07Y {
    public final int A00;
    public final Object A01;

    public C50131FQo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Eba, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dms(X.07T r8, X.AnonymousClass07Z r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0146;
                case 1: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r7.A01
            X.FBn r0 = (X.C49887FBn) r0
            X.02m r4 = r0.A01
            int r3 = r0.A00
            X.07U r0 = r8.A00()
            java.lang.String r2 = r0.toString()
            r1 = 383649364(0x16de0654, float:3.5870028E-25)
            java.lang.String r0 = "view_lifecycle"
            r4.markerAnnotate(r1, r3, r0, r2)
        L_0x0021:
            return
        L_0x0022:
            X.07T r0 = X.07T.ON_RESUME
            if (r8 != r0) goto L_0x0021
            java.lang.Object r2 = r7.A01
            X.FtA r2 = (X.C51378FtA) r2
            X.EI5 r1 = r2.A00
            com.instagram.nux.activity.SignedOutFragmentActivity r5 = r1.A01
            X.07V r0 = r5.getLifecycle()
            r0.A0A(r7)
            android.os.Bundle r4 = r1.A00
            boolean r6 = r2.A01
            X.0hq r0 = r5.getSupportFragmentManager()
            r3 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r0 = r0.A0P(r3)
            if (r0 != 0) goto L_0x0021
            X.0s1 r2 = X.DbW.A0D(r5)
            android.os.Bundle r1 = X.DbU.A06(r5)
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x009f
            X.0aP r0 = r5.A01
            boolean r0 = X.FCQ.A02(r0)
            if (r0 != 0) goto L_0x011e
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r0 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r5 = "reg_gdpr_entrance"
            if (r0 == r1) goto L_0x0093
            X.FEw r0 = X.C49921FEw.A00()
            java.lang.Integer r0 = r0.A01()
            if (r0 == r1) goto L_0x0093
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.DbS.A1A(r4, r0)
            X.DbW.A0X()
            X.DbS.A1A(r4, r0)
            X.E3Y r0 = new X.E3Y
            r0.<init>()
        L_0x0086:
            r0.setArguments(r4)
            r2.A0A(r0, r3)
        L_0x008c:
            r2.A0I(r5)
        L_0x008f:
            r2.A00()
            return
        L_0x0093:
            X.DbT.A15()
            X.DbU.A1C(r4)
            X.E3n r0 = new X.E3n
            r0.<init>()
            goto L_0x0086
        L_0x009f:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x011e
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00ba
            X.DbT.A15()
            X.E5W r1 = new X.E5W
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.AymhLoginLandingFragment"
        L_0x00b6:
            r2.A0D(r1, r0, r3)
            goto L_0x008f
        L_0x00ba:
            X.0aP r0 = r5.A01
            X.6qt r1 = X.C319606qt.A01(r0)
            X.0aP r0 = r5.A01
            java.util.ArrayList r0 = r1.A06(r0)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 != 0) goto L_0x010e
            if (r6 == 0) goto L_0x010e
            X.FBZ r1 = r5.A02
            android.os.Bundle r0 = X.DbU.A06(r5)
            java.util.ArrayList r0 = r1.A01(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010e
            boolean r0 = X.FGv.A05()
            if (r0 != 0) goto L_0x00fe
            r1 = 2130970750(0x7f04087e, float:1.7550219E38)
            r0 = 1
            boolean r0 = X.2Yu.A0L(r5, r1, r0)
            if (r0 == 0) goto L_0x00fe
            X.DbT.A15()
            X.E3s r1 = new X.E3s
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.FacebookLandingFragment"
            goto L_0x00b6
        L_0x00fe:
            X.DbT.A15()
            X.E54 r1 = new X.E54
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.LoginLandingFragment"
            goto L_0x00b6
        L_0x010e:
            X.DbT.A15()
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = new com.instagram.nux.fragment.OneTapLoginLandingFragment
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.OneTapLoginLandingFragment"
            goto L_0x00b6
        L_0x011e:
            boolean r0 = X.Fl7.A01()
            if (r0 == 0) goto L_0x0139
            X.DbT.A15()
            X.DbU.A1C(r4)
            X.E3n r0 = new X.E3n
            r0.<init>()
            r0.setArguments(r4)
            r2.A0A(r0, r3)
            java.lang.String r5 = "reg_gdpr_entrance"
            goto L_0x008c
        L_0x0139:
            X.E59 r1 = X.C49793F7b.A01(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.secondaryaccount.CreateUsernameFragment"
            r2.A0D(r1, r0, r3)
            goto L_0x008f
        L_0x0146:
            X.07T r0 = X.07T.ON_RESUME
            if (r8 != r0) goto L_0x0021
            java.lang.Object r1 = r7.A01
            X.EwY r1 = (X.C49493EwY) r1
            com.instagram.nux.activity.SignedOutFragmentActivity r4 = r1.A01
            X.07V r0 = r4.getLifecycle()
            r0.A0A(r7)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x015e
            com.instagram.nux.activity.SignedOutFragmentActivity.A00(r4)
        L_0x015e:
            android.os.Bundle r2 = r1.A00
            androidx.fragment.app.Fragment r0 = X.DbY.A0H(r4)
            if (r0 != 0) goto L_0x0172
            X.0nO r1 = X.0nY.A00()
            X.EI5 r0 = new X.EI5
            r0.<init>(r2, r4)
            r1.ATE(r0)
        L_0x0172:
            java.lang.String r0 = "allow_confirm_email"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "confirm_email_nonce"
            java.lang.String r3 = X.DbU.A0l(r2, r0)
            java.lang.String r0 = "confirm_email_encoded_email"
            java.lang.String r0 = X.DbU.A0l(r2, r0)
            X.0aP r2 = r4.A01
            X.Eba r1 = new X.Eba
            r1.<init>()
            r1.A01 = r4
            r1.A04 = r3
            r1.A03 = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r1.A00 = r0
            r1.A02 = r2
            r1.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50131FQo.Dms(X.07T, X.07Z):void");
    }
}
