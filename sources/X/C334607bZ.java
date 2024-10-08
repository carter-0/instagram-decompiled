package X;

/* renamed from: X.7bZ  reason: invalid class name and case insensitive filesystem */
public final class C334607bZ implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334607bZ(C334537bS r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r25) {
        /*
            r24 = this;
            r5 = r25
            r0 = 1845113236(0x6dfa3194, float:9.6788986E27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.3Ke r5 = (X.C240253Ke) r5
            r0 = -98827256(0xfffffffffa1c0408, float:-2.0252002E35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.1Xj r10 = r5.A00
            r2 = r24
            X.7bS r6 = r2.A00
            com.instagram.common.session.UserSession r15 = r6.A0E
            X.1Xj r9 = r10.A1e(r15)
            com.instagram.user.model.User r8 = r10.A2A(r15)
            X.IT7 r2 = new X.IT7
            r2.<init>(r9, r10, r6, r5)
            int r7 = r10.A15(r15)
            r4 = -1
            if (r7 != r4) goto L_0x0033
            r7 = 0
        L_0x0033:
            X.4DU r12 = r6.A0G
            com.instagram.user.model.User r3 = r5.A01
            boolean r23 = r3.A2Q()
            boolean r11 = r3.equals(r8)
            if (r11 == 0) goto L_0x0153
            X.HLF r17 = X.HLF.BRAND
        L_0x0043:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
            r22 = 0
            X.3kK r11 = r6.A00
            r18 = r9
            r19 = r12
            r20 = r11
            r16 = r2
            X.C233822wX.A0K(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.fragment.app.Fragment r2 = r6.A01
            X.I6Q.A00(r2, r15, r10)
            r11 = 3583(0xdff, float:5.021E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r11)
            if (r8 == 0) goto L_0x00ca
            boolean r13 = r9.CcK()
            if (r13 == 0) goto L_0x00ca
            boolean r13 = X.1sx.A0Q(r10, r7)
            if (r13 == 0) goto L_0x00ca
            java.lang.String r14 = r3.getId()
            java.lang.String r13 = r8.getId()
            boolean r13 = X.0qQ.A0K(r14, r13)
            if (r13 == 0) goto L_0x00ca
            java.lang.Class<com.instagram.modal.ModalActivity> r13 = com.instagram.modal.ModalActivity.class
            X.1a0 r8 = X.C46447Df9.A03()
            X.1a1 r8 = r8.A01
            java.lang.String r10 = r3.getId()
            java.lang.String r3 = r12.getModuleName()
            X.Dfc r10 = X.C46548Dgp.A01(r15, r10, r11, r3)
            java.lang.String r9 = r9.BpP()
            com.instagram.sponsored.analytics.SourceModelInfoParams r3 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r3.<init>(r9, r4, r7)
            r10.A04 = r3
            java.lang.String r3 = r5.A03
            r10.A0N = r3
            com.instagram.profile.intf.UserDetailLaunchConfig r3 = r10.A04()
            android.os.Bundle r11 = r8.A01(r15, r3)
            androidx.fragment.app.FragmentActivity r10 = r6.A02
            java.lang.String r14 = "profile"
            X.6W8 r9 = new X.6W8
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r3 = r5.A02
            r9.A05 = r3
        L_0x00b6:
            android.content.Context r2 = r2.requireContext()
            r9.A0C(r2)
            r2 = 992139881(0x3b22da69, float:0.002484942)
            X.AnonymousClass0fD.A0A(r2, r0)
            r0 = 82073039(0x4e455cf, float:5.3681345E-36)
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x00ca:
            java.lang.String r13 = r3.getId()
            java.lang.String r9 = r12.getModuleName()
            X.Dfc r11 = X.C46548Dgp.A01(r15, r13, r11, r9)
            boolean r9 = r2 instanceof X.C266514Zg
            if (r9 == 0) goto L_0x0144
            r9 = 719(0x2cf, float:1.008E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r9)
            X.0qQ.A0C(r2, r13)
            r12 = r2
            X.4Zg r12 = (X.C266514Zg) r12
            com.instagram.model.hashtag.Hashtag r9 = r12.BCW()
            if (r9 == 0) goto L_0x0144
            X.0qQ.A0C(r2, r13)
            com.instagram.model.hashtag.Hashtag r9 = r12.BCW()
        L_0x00f3:
            if (r9 == 0) goto L_0x00fb
            com.instagram.profile.intf.UserDetailEntryInfo r9 = X.C49077Eov.A00(r9)
            r11.A03 = r9
        L_0x00fb:
            if (r8 == 0) goto L_0x0128
            java.lang.String r9 = r3.getId()
            java.lang.String r3 = r8.getId()
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x0116
            java.lang.String r9 = r10.BpP()
            com.instagram.sponsored.analytics.SourceModelInfoParams r3 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r3.<init>(r9, r4, r7)
            r11.A04 = r3
        L_0x0116:
            boolean r3 = r5.A04
            if (r3 == 0) goto L_0x0128
            X.4Cl r3 = r8.A03
            com.instagram.api.schemas.FanClubInfoDict r3 = r3.B3v()
            if (r3 == 0) goto L_0x0128
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r3 = X.FGM.A00(r15, r8)
            r11.A00 = r3
        L_0x0128:
            java.lang.Class<com.instagram.modal.ModalActivity> r13 = com.instagram.modal.ModalActivity.class
            X.1a0 r3 = X.C46447Df9.A03()
            X.1a1 r4 = r3.A01
            com.instagram.profile.intf.UserDetailLaunchConfig r3 = r11.A04()
            android.os.Bundle r11 = r4.A01(r15, r3)
            androidx.fragment.app.FragmentActivity r10 = r6.A02
            java.lang.String r14 = "profile"
            X.6W8 r9 = new X.6W8
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x00b6
        L_0x0144:
            X.1Xy r9 = r10.A0C
            com.instagram.model.hashtag.Hashtag r9 = r9.B6n()
            if (r9 == 0) goto L_0x00fb
            X.1Xy r9 = r10.A0C
            com.instagram.model.hashtag.Hashtag r9 = r9.B6n()
            goto L_0x00f3
        L_0x0153:
            X.HLF r17 = X.HLF.USER
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334607bZ.onEvent(java.lang.Object):void");
    }
}
