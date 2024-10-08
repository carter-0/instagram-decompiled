package X;

import android.view.View;

/* renamed from: X.LXb  reason: case insensitive filesystem */
public final class C64249LXb implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C64249LXb(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [X.07Z, android.content.Context, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02fa, code lost:
        if (r4.isValid() != true) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r0.isValid() != true) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        if (r1.A02 != true) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r1.isValid() != true) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r0.A02 != true) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0316  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x02cd;
                case 1: goto L_0x02a0;
                case 2: goto L_0x0273;
                case 3: goto L_0x0247;
                case 4: goto L_0x0200;
                case 5: goto L_0x01c9;
                case 6: goto L_0x0193;
                case 7: goto L_0x013a;
                case 8: goto L_0x00c6;
                case 9: goto L_0x009c;
                case 10: goto L_0x0072;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r11 = r14.A01
            X.Jla r11 = (X.C60442Jla) r11
            java.lang.Object r8 = r14.A02
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r8 = (com.instagram.ui.widget.mediapicker.MediaPickerItemView) r8
            java.lang.Object r10 = r14.A03
            com.instagram.common.gallery.model.GalleryItem r10 = (com.instagram.common.gallery.model.GalleryItem) r10
            java.lang.Object r9 = r14.A04
            X.9I9 r9 = (X.AnonymousClass9I9) r9
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r7 = 1
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r8)
            boolean r5 = r8.A0A
            com.instagram.common.gallery.model.GalleryItem r0 = r8.A04
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r1 = r0.A09
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4 = 1
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r3 = r8.A0C
            X.9I9 r0 = r8.A02
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.A02
            r2 = 1
            if (r0 == r7) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            X.5Ef r0 = r8.A03
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isValid()
            r1 = 1
            if (r0 == r7) goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            X.5Ef r0 = r8.A03
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.CeS()
        L_0x004d:
            if (r5 != 0) goto L_0x005a
            if (r12 != 0) goto L_0x0068
            if (r3 != 0) goto L_0x0055
            if (r2 != 0) goto L_0x005a
        L_0x0055:
            if (r1 != 0) goto L_0x0068
            X.C59848JaO.A01(r6, r0)
        L_0x005a:
            X.9I9 r0 = r8.A02
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.A02
            if (r0 != r7) goto L_0x0066
        L_0x0062:
            r8.setChecked(r4)
            return
        L_0x0066:
            r4 = 0
            goto L_0x0062
        L_0x0068:
            X.MUN r0 = r11.A02
            r0.DLv(r9, r10)
            goto L_0x005a
        L_0x006e:
            r0 = 0
            goto L_0x004d
        L_0x0070:
            r1 = 0
            goto L_0x0026
        L_0x0072:
            r0 = 1141266201(0x44065719, float:537.3609)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A04
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            java.lang.Object r4 = r14.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r14.A01
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r6 = r14.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            r5 = 0
            java.lang.String r7 = "post_live_moderation"
            r1 = 2
            X.0qQ.A0B(r4, r1)
            r8 = r5
            r9 = r5
            X.F8Z.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 1946558807(0x74062157, float:4.250757E31)
            goto L_0x0312
        L_0x009c:
            r0 = 1686363175(0x6483dc27, float:1.9459097E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A04
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            java.lang.Object r4 = r14.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r14.A01
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r6 = r14.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            r5 = 0
            java.lang.String r7 = "post_live_moderation"
            r1 = 2
            X.0qQ.A0B(r4, r1)
            r8 = r5
            r9 = r5
            X.F8Z.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -665519881(0xffffffffd854f8f7, float:-9.3666304E14)
            goto L_0x0312
        L_0x00c6:
            r0 = 197237767(0xbc19c07, float:7.457566E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A03
            X.LQQ r1 = (X.LQQ) r1
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r9 = r1.A00
            java.lang.Object r11 = r14.A04
            X.JeM r11 = (X.C60054JeM) r11
            java.lang.Object r10 = r14.A01
            com.instagram.common.gallery.model.GalleryItem r10 = (com.instagram.common.gallery.model.GalleryItem) r10
            java.lang.Object r8 = r14.A02
            X.9I9 r8 = (X.AnonymousClass9I9) r8
            r7 = 1
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r9)
            boolean r5 = r9.A0A
            com.instagram.common.gallery.model.GalleryItem r1 = r9.A04
            if (r1 == 0) goto L_0x0138
            java.lang.Integer r2 = r1.A09
        L_0x00ec:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r4 = 1
            boolean r13 = X.AnonymousClass7TF.A1W(r2, r1)
            boolean r3 = r9.A0C
            X.9I9 r1 = r9.A02
            if (r1 == 0) goto L_0x00fe
            boolean r1 = r1.A02
            r12 = 1
            if (r1 == r7) goto L_0x00ff
        L_0x00fe:
            r12 = 0
        L_0x00ff:
            X.5Ef r1 = r9.A03
            if (r1 == 0) goto L_0x010a
            boolean r1 = r1.isValid()
            r2 = 1
            if (r1 == r7) goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            X.5Ef r1 = r9.A03
            if (r1 == 0) goto L_0x0136
            boolean r1 = r1.CeS()
        L_0x0113:
            if (r5 != 0) goto L_0x0120
            if (r13 != 0) goto L_0x0132
            if (r3 != 0) goto L_0x011b
            if (r12 != 0) goto L_0x0120
        L_0x011b:
            if (r2 != 0) goto L_0x0132
            X.C59848JaO.A01(r6, r1)
        L_0x0120:
            X.9I9 r1 = r9.A02
            if (r1 == 0) goto L_0x0130
            boolean r1 = r1.A02
            if (r1 != r7) goto L_0x0130
        L_0x0128:
            r9.setChecked(r4)
            r1 = 514083752(0x1ea44ba8, float:1.7395466E-20)
            goto L_0x0312
        L_0x0130:
            r4 = 0
            goto L_0x0128
        L_0x0132:
            r11.DLv(r8, r10)
            goto L_0x0120
        L_0x0136:
            r1 = 0
            goto L_0x0113
        L_0x0138:
            r2 = 0
            goto L_0x00ec
        L_0x013a:
            r0 = 463143529(0x1b9b0269, float:2.5644157E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A04
            com.instagram.tagging.activity.TaggingActivity r4 = (com.instagram.tagging.activity.TaggingActivity) r4
            boolean r1 = r4.CKU()
            if (r1 == 0) goto L_0x0153
            r4.EvN()
        L_0x014e:
            r1 = -491482893(0xffffffffe2b490f3, float:-1.6654293E21)
            goto L_0x0312
        L_0x0153:
            java.lang.Object r3 = r14.A03
            com.instagram.tagging.widget.TagsInteractiveLayout r3 = (com.instagram.tagging.widget.TagsInteractiveLayout) r3
            java.lang.Object r1 = r14.A02
            com.instagram.tagging.api.model.MediaSuggestedProductTag r1 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r1
            android.graphics.PointF r1 = r1.A00
            r3.A08(r1)
            java.lang.Object r2 = r14.A01
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            boolean r1 = r2.A03()
            if (r1 == 0) goto L_0x018b
            X.0gy r5 = X.AnonymousClass07i.A00(r4)
            X.0eM r1 = r4.A0o
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r8 = r2.A0H
            com.instagram.user.model.User r1 = r2.A0B
            if (r1 == 0) goto L_0x0180
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
            if (r9 != 0) goto L_0x0182
        L_0x0180:
            java.lang.String r9 = ""
        L_0x0182:
            X.Lxp r7 = new X.Lxp
            r7.<init>(r4, r3, r2)
            X.C18262VoT.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x014e
        L_0x018b:
            r1 = 0
            com.instagram.tagging.widget.TagsInteractiveLayout.A01(r3, r2, r1)
            com.instagram.tagging.activity.TaggingActivity.A0M(r4, r2)
            goto L_0x014e
        L_0x0193:
            r0 = -38512516(0xfffffffffdb4587c, float:-2.996506E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r14.A04
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.8sM r2 = X.C368278sM.ACCEPT
            java.lang.Object r1 = r14.A03
            X.L57 r1 = (X.L57) r1
            X.1Xj r7 = r1.A01
            java.lang.String r1 = r7.getId()
            X.LTD.A02(r2, r8, r1)
            java.lang.Object r6 = r14.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r5 = r14.A02
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            X.818 r3 = X.AnonymousClass818.IG_SELF_REEL_LIKES_SHEET
            r2 = 1
            X.Ldp r1 = new X.Ldp
            r1.<init>(r5, r2)
            X.LAG r1 = X.C246353eS.A00(r3, r1, r8, r7, r4)
            X.C246353eS.A05(r6, r1, r8)
            r1 = -916120056(0xffffffffc9651e08, float:-938464.5)
            goto L_0x0312
        L_0x01c9:
            r0 = -1086461311(0xffffffffbf3dea81, float:-0.7418595)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r14.A04
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.8sM r3 = X.C368278sM.ACCEPT
            java.lang.Object r1 = r14.A03
            X.L56 r1 = (X.L56) r1
            X.1Xj r7 = r1.A01
            java.lang.String r2 = r7.getId()
            r1 = 0
            X.LTD.A04(r3, r8, r2, r1)
            java.lang.Object r6 = r14.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r5 = r14.A02
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            X.818 r3 = X.AnonymousClass818.IG_SELF_REEL_LIKES_SHEET
            r2 = 1
            X.Ldp r1 = new X.Ldp
            r1.<init>(r5, r2)
            X.LAG r1 = X.C246353eS.A00(r3, r1, r8, r7, r4)
            X.C246353eS.A05(r6, r1, r8)
            r1 = 1825677289(0x6cd19fe9, float:2.0273652E27)
            goto L_0x0312
        L_0x0200:
            r0 = 1941786991(0x73bd516f, float:2.999865E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r15)
            java.lang.Object r4 = r14.A04
            X.MWx r4 = (X.C66569MWx) r4
            boolean r1 = X.C64131LPf.A02(r1, r4)
            if (r1 != 0) goto L_0x021a
            r1 = 333788545(0x13e53581, float:5.7860486E-27)
            goto L_0x0312
        L_0x021a:
            java.lang.Object r3 = r14.A01
            X.MVe r3 = (X.C66526MVe) r3
            if (r3 == 0) goto L_0x0245
            java.lang.Integer r2 = r3.C9C(r4)
        L_0x0224:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r1 != r2) goto L_0x023f
            if (r3 == 0) goto L_0x0231
            java.lang.Object r1 = r14.A02
            X.LBD r1 = (X.LBD) r1
            r3.DXQ(r4, r1)
        L_0x0231:
            java.lang.Object r1 = r14.A03
            X.MSm r1 = (X.C66458MSm) r1
            if (r1 == 0) goto L_0x023a
            r1.DZG()
        L_0x023a:
            r1 = -853499484(0xffffffffcd20a1a4, float:-1.6843424E8)
            goto L_0x0312
        L_0x023f:
            if (r3 == 0) goto L_0x023a
            r3.onStopButtonClicked()
            goto L_0x023a
        L_0x0245:
            r2 = 0
            goto L_0x0224
        L_0x0247:
            r0 = -71480199(0xfffffffffbbd4c79, float:-1.9657903E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A04
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r1 = 2
            if (r2 == r1) goto L_0x0269
            r4 = 1
            java.lang.Object r3 = r14.A02
            X.K7c r3 = (X.C61427K7c) r3
            java.lang.Object r2 = r14.A03
            X.Lnw r2 = (X.C65134Lnw) r2
            r1 = 0
            r3.A03(r1, r2, r4)
        L_0x0264:
            r1 = -106318604(0xfffffffff9a9b4f4, float:-1.1014604E35)
            goto L_0x0312
        L_0x0269:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.DbX.A10(r1, r2)
            goto L_0x0264
        L_0x0273:
            r0 = 1239692066(0x49e43322, float:1869412.2)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A04
            X.8cq r5 = (X.C359448cq) r5
            java.lang.Object r4 = r14.A02
            X.JVj r4 = (X.C59725JVj) r4
            java.lang.Object r3 = r14.A03
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            X.27r r2 = r5.A06
            r1 = 232(0xe8, float:3.25E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A1N(r4, r3, r1)
            X.C359448cq.A06(r5)
            java.lang.Object r2 = r14.A01
            X.7Pu r2 = (X.C331157Pu) r2
            r1 = 0
            r2.A0L(r1)
            r1 = 762291367(0x2d6fa4a7, float:1.3622137E-11)
            goto L_0x0312
        L_0x02a0:
            r0 = -1897345204(0xffffffff8ee8cf4c, float:-5.7392035E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r14.A01
            X.8MH r7 = (X.AnonymousClass8MH) r7
            java.lang.Object r6 = r14.A03
            X.6nz r6 = (X.C317876nz) r6
            java.lang.Object r1 = r14.A04
            X.Jtl r1 = (X.C60927Jtl) r1
            long r3 = r1.A01
            java.lang.String r5 = r1.A02
            java.lang.Object r1 = r14.A02
            X.6o8 r1 = (X.C317966o8) r1
            java.lang.String r2 = r1.A0U
            if (r2 != 0) goto L_0x02c1
            java.lang.String r2 = "UNKNOWN"
        L_0x02c1:
            X.9V0 r1 = new X.9V0
            r1.<init>(r5, r2, r3)
            r7.DG0(r1, r6)
            r1 = -308564262(0xffffffffed9baeda, float:-6.022695E27)
            goto L_0x0312
        L_0x02cd:
            r0 = -949438500(0xffffffffc768b7dc, float:-59575.86)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A03
            android.view.View r1 = (android.view.View) r1
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r1)
            java.lang.Object r2 = r14.A04
            X.JpL r2 = (X.C60674JpL) r2
            boolean r7 = r2.A03
            X.JaS r1 = r2.A07
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r1 = r1.A00
            boolean r6 = r1.A09
            java.lang.Object r1 = r14.A02
            X.LiE r1 = (X.C64794LiE) r1
            X.9I9 r1 = r1.A00
            boolean r5 = r1.A02
            com.instagram.common.gallery.RemoteMedia r4 = r2.A02
            r3 = 1
            if (r4 == 0) goto L_0x02fc
            boolean r1 = r4.isValid()
            r2 = 1
            if (r1 == r3) goto L_0x0322
        L_0x02fc:
            r2 = 0
            if (r4 != 0) goto L_0x0322
            r1 = 0
        L_0x0300:
            java.lang.Object r3 = r14.A01
            X.L3j r3 = (X.C63699L3j) r3
            if (r7 != 0) goto L_0x030f
            if (r6 != 0) goto L_0x030a
            if (r5 != 0) goto L_0x030f
        L_0x030a:
            if (r2 != 0) goto L_0x0316
            X.C59848JaO.A01(r8, r1)
        L_0x030f:
            r1 = -716381142(0xffffffffd54ce42a, float:-1.40800206E13)
        L_0x0312:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0316:
            X.JWt r1 = r3.A00
            X.0sP r2 = r1.A03
            X.LiE r1 = r3.A01
            com.instagram.common.gallery.model.GalleryItem r1 = r1.A01
            r2.invoke(r1)
            goto L_0x030f
        L_0x0322:
            boolean r1 = r4.A09
            goto L_0x0300
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64249LXb.onClick(android.view.View):void");
    }
}
