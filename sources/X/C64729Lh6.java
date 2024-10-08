package X;

/* renamed from: X.Lh6  reason: case insensitive filesystem */
public final class C64729Lh6 implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64729Lh6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.share.handleractivity.CustomStoryShareHandlerActivity, android.content.Context, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ce, code lost:
        X.JTO.A1Z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d1, code lost:
        X.W38.A01((android.app.Activity) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e6, code lost:
        X.C59689JTv.A0F(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0213, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0215, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0218, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0222, code lost:
        X.C59689JTv.A01(r0, r1, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0225, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01af, code lost:
        r0 = r10.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWm(java.util.Map r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x01b2;
                case 1: goto L_0x0180;
                case 2: goto L_0x0165;
                case 3: goto L_0x0151;
                case 4: goto L_0x0199;
                case 5: goto L_0x0138;
                case 6: goto L_0x0126;
                case 7: goto L_0x00f6;
                case 8: goto L_0x01ea;
                case 9: goto L_0x0089;
                case 10: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r10.A01
            X.SFS r6 = (X.SFS) r6
            java.lang.Object r5 = r10.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r3 = "android.permission.CAMERA"
            java.lang.Object r1 = r11.get(r3)
            X.7vz r2 = X.C346927vz.GRANTED
            if (r1 != r2) goto L_0x001a
            X.SFS.A00(r6)
        L_0x001a:
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 != r0) goto L_0x0028
            android.content.Context r1 = r6.A03
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131954557(0x7f130b7d, float:1.9545617E38)
            X.W38.A02(r1, r0)
        L_0x0028:
            java.lang.Object r0 = r11.get(r3)
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = "app_permission_grant"
        L_0x0036:
            X.LeN r0 = new X.LeN
            r0.<init>(r6)
            X.4O6 r3 = new X.4O6
            r3.<init>(r0, r5)
            java.lang.Long r2 = X.AnonymousClass4O7.A00(r5)
            X.4O8 r0 = X.AnonymousClass4O8.UNKNOWN
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "VERIFICATION_REQUEST_TAKE_PHOTO_HELPER"
            X.JTU.A1F(r3, r2, r4, r0, r1)
        L_0x004f:
            return
        L_0x0050:
            java.lang.String r4 = "app_permission_deny"
            goto L_0x0036
        L_0x0053:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r11.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x0066
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x004f }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x004f }
            r0.call()     // Catch:{ Exception -> 0x004f }
            goto L_0x0205
        L_0x0066:
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 != r0) goto L_0x0076
            java.lang.Object r0 = r10.A02
            X.LT3 r0 = (X.LT3) r0
            android.content.Context r1 = r0.A04
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x004f
            goto L_0x01d1
        L_0x0076:
            X.7vz r0 = X.C346927vz.DENIED
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r10.A02
            X.LT3 r0 = (X.LT3) r0
            android.content.Context r2 = r0.A04
            r1 = 2131967996(0x7f133ffc, float:1.9572874E38)
            java.lang.String r0 = "qr_code_save_permission_denied"
            X.C59689JTv.A0F(r2, r0, r1)
            return
        L_0x0089:
            java.lang.Object r9 = r10.A01
            java.lang.String[] r9 = (java.lang.String[]) r9
            int r8 = r9.length
            r7 = 0
            r2 = 0
        L_0x0090:
            if (r2 >= r8) goto L_0x00e7
            r0 = r9[r2]
            java.lang.Object r1 = r11.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x009f
            int r2 = r2 + 1
            goto L_0x0090
        L_0x009f:
            r4 = 0
            X.8j2 r6 = X.C363058j1.A02
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "User has denied permission: "
            r5.append(r0)
            java.lang.Object r3 = r10.A02
            X.Vzv r3 = (X.C18760Vzv) r3
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x00b3:
            if (r7 >= r8) goto L_0x00c5
            r1 = r9[r7]
            android.content.Context r0 = r3.A09
            boolean r0 = X.1DL.A07(r0, r1)
            if (r0 != 0) goto L_0x00c2
            r2.add(r1)
        L_0x00c2:
            int r7 = r7 + 1
            goto L_0x00b3
        L_0x00c5:
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r2, r5)
            r0 = 5304(0x14b8, float:7.432E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A04(r0, r1, r4)
            X.Vl7 r2 = r3.A01
            if (r2 == 0) goto L_0x004f
            r0 = 2107(0x83b, float:2.953E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.K0O r1 = new X.K0O
            r1.<init>(r0)
            X.XBm r0 = r2.A0B
            r0.Cks(r4, r1)
            return
        L_0x00e7:
            java.lang.Object r0 = r10.A02
            X.Vzv r0 = (X.C18760Vzv) r0
            X.W0T r1 = X.C18760Vzv.A00(r0)
            if (r1 == 0) goto L_0x004f
            r0 = 1
            r1.A0C(r0)
            return
        L_0x00f6:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r11.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x0109
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x004f }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x004f }
            r0.call()     // Catch:{ Exception -> 0x004f }
            goto L_0x0206
        L_0x0109:
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 != r0) goto L_0x0115
            java.lang.Object r0 = r10.A02
            X.LDv r0 = (X.C63935LDv) r0
            android.content.Context r1 = r0.A01
            goto L_0x01ce
        L_0x0115:
            X.7vz r0 = X.C346927vz.DENIED
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r10.A02
            X.LDv r0 = (X.C63935LDv) r0
            android.content.Context r2 = r0.A01
            java.lang.String r1 = "profile_card_save_permission_denied"
            r0 = 2131969917(0x7f13477d, float:1.957677E38)
            goto L_0x01e6
        L_0x0126:
            java.lang.Object r1 = r10.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r10.A02
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = (com.instagram.profilecard.domain.ProfileCardViewModel) r0
            com.instagram.profilecard.domain.ProfileCardViewModel.A02(r1, r0)
            return
        L_0x0138:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r0 = r11.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x004f
            int r1 = r0.ordinal()
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0207
            if (r1 == r2) goto L_0x0213
            return
        L_0x0151:
            java.lang.Object r1 = r10.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x004f
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.37D r0 = X.DbT.A0i(r0)
            if (r0 == 0) goto L_0x004f
            r0.A0J(r1)
            return
        L_0x0165:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r0 = r11.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x004f
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x01af
            r0 = 1
            if (r1 == r0) goto L_0x0213
            r0 = 2
            if (r1 == r0) goto L_0x0213
            return
        L_0x0180:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r0 = r11.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x004f
            int r1 = r0.ordinal()
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0219
            if (r1 == r2) goto L_0x01af
            return
        L_0x0199:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.7vz r1 = X.C2604245p.A00(r11)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 == r0) goto L_0x01af
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x004f
        L_0x01af:
            java.lang.Object r0 = r10.A02
            goto L_0x0215
        L_0x01b2:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r11.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x01c4
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x004f }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x004f }
            r0.call()     // Catch:{ Exception -> 0x004f }
            goto L_0x0226
        L_0x01c4:
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 != r0) goto L_0x01d7
            java.lang.Object r0 = r10.A02
            X.LEL r0 = (X.LEL) r0
            android.content.Context r1 = r0.A03
        L_0x01ce:
            X.JTO.A1Z(r1)
        L_0x01d1:
            android.app.Activity r1 = (android.app.Activity) r1
            X.W38.A01(r1)
            return
        L_0x01d7:
            X.7vz r0 = X.C346927vz.DENIED
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r10.A02
            X.LEL r0 = (X.LEL) r0
            android.content.Context r2 = r0.A03
            java.lang.String r1 = "qr_code_save_permission_denied"
            r0 = 2131967996(0x7f133ffc, float:1.9572874E38)
        L_0x01e6:
            X.C59689JTv.A0F(r2, r1, r0)
            return
        L_0x01ea:
            java.lang.Object r1 = r10.A02
            com.instagram.share.handleractivity.CustomStoryShareHandlerActivity r1 = (com.instagram.share.handleractivity.CustomStoryShareHandlerActivity) r1
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r0 = r10.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x01fc:
            java.lang.String r0 = "permission_failure"
            com.instagram.share.handleractivity.CustomStoryShareHandlerActivity.A01(r1, r0)
            r1.finish()
            return
        L_0x0205:
            return
        L_0x0206:
            return
        L_0x0207:
            java.lang.Object r0 = r10.A02
            X.OsF r0 = (X.C71872OsF) r0
            android.app.Activity r0 = r0.A00
            r2 = 2131960258(0x7f1321c2, float:1.955718E38)
            java.lang.String r1 = "direct_save_fail_external_storage_permission_toast"
            goto L_0x0222
        L_0x0213:
            java.lang.Object r0 = r10.A01
        L_0x0215:
            X.DbS.A1U(r0)
            return
        L_0x0219:
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            r2 = 2131972563(0x7f1351d3, float:1.9582137E38)
            java.lang.String r1 = "ify_save_media_permission_failure_toast"
        L_0x0222:
            X.C59689JTv.A01(r0, r1, r2, r3)
            return
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64729Lh6.DWm(java.util.Map):void");
    }
}
