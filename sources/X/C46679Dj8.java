package X;

import android.text.style.ClickableSpan;

/* renamed from: X.Dj8  reason: case insensitive filesystem */
public final class C46679Dj8 extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C46679Dj8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0124, code lost:
        r6 = X.Dba.A0N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b2, code lost:
        r4.A02(r3, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0201, code lost:
        r3.A0S = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x022c, code lost:
        r3 = X.Dba.A0J(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0230, code lost:
        r3.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0233, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A00
            r1 = r24
            switch(r0) {
                case 0: goto L_0x0216;
                case 1: goto L_0x0204;
                case 2: goto L_0x01e5;
                case 3: goto L_0x00c4;
                case 4: goto L_0x01c8;
                case 5: goto L_0x01c2;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01b6;
                case 8: goto L_0x0179;
                case 9: goto L_0x000c;
                case 10: goto L_0x016b;
                case 11: goto L_0x004c;
                case 12: goto L_0x0155;
                case 13: goto L_0x012a;
                case 14: goto L_0x0114;
                case 15: goto L_0x0107;
                case 16: goto L_0x00fb;
                case 17: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onClick(r1)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r3.A01
            X.E1M r0 = (X.E1M) r0
            X.Eyj r1 = r0.A00
            if (r1 == 0) goto L_0x000c
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r5 = r1.A02
            X.3uh r0 = r1.A01
            X.7Pu r4 = r1.A00
            X.1Xj r3 = r0.A0b
            if (r3 == 0) goto L_0x0044
            java.lang.String r0 = r3.A30()
            if (r0 == 0) goto L_0x0044
            X.0wc r1 = r5.A05
            java.lang.String r0 = "reel_viewer_dashboard_fb_viewers_bottom_sheet_story_settings_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r5.getModuleName()
            X.DbS.A1K(r2, r0)
            java.lang.String r0 = r3.A30()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "media_id"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x0044:
            r0 = 1
            r5.A0E = r0
            r0 = 0
            r4.A0L(r0)
            return
        L_0x004c:
            java.lang.Object r1 = r3.A01
            X.Lao r1 = (X.C64372Lao) r1
            android.app.Dialog r0 = r1.A00
            if (r0 == 0) goto L_0x0057
            r0.dismiss()
        L_0x0057:
            X.EtG r7 = r1.A05
            com.instagram.common.session.UserSession r6 = r1.A06
            X.4DH r5 = r1.A04
            r0 = 3315(0xcf3, float:4.645E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r8 = 1
            X.4fB r4 = X.C269474fB.A00
            X.4cw r3 = new X.4cw
            r3.<init>(r4)
            java.lang.String r9 = "entrypoint"
            r3.A0E(r9, r10)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "account_id"
            r3.A0E(r0, r1)
            java.lang.String r1 = "newly_linked"
            java.lang.String r0 = "false"
            r3.A0E(r1, r0)
            java.lang.String r1 = "platform"
            java.lang.String r0 = "1"
            r3.A0E(r1, r0)
            X.4cw r2 = new X.4cw
            r2.<init>(r4)
            r2.A0E(r9, r10)
            java.lang.String r1 = "deeplink_destination"
            java.lang.String r0 = "cross_posting_skip_profiles_screen"
            r2.A0E(r1, r0)
            java.lang.String r0 = "deeplink_params"
            r2.A0B(r3, r0)
            java.util.HashMap r4 = X.DbZ.A0r(r2, r4)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            java.lang.String r2 = "com.bloks.www.fxcal.settings.async"
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x000c
            r7.A00 = r8
            X.1ZF r1 = X.C48916EmG.A00()
            android.view.Window r0 = r3.getWindow()
            r1.A00(r3, r0, r8, r8)
            X.8ey r1 = X.C359988do.A05(r6, r2, r4)
            X.E7s r0 = new X.E7s
            r0.<init>(r5, r7, r6)
            r1.A00(r0)
            r5.scheduleAndGetLoaderId(r1)
            return
        L_0x00c4:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r3.A01
            X.E2R r1 = (X.E2R) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.37D r0 = r2.A01(r0)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r4 == 0) goto L_0x000c
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            r8 = 1
            r7 = 0
            r9 = 0
            java.lang.String r6 = "caption_settings"
            r10 = r9
            r11 = r9
            X.ES2 r3 = X.C48765Ejo.A00(r5, r6, r7, r8, r9, r10, r11)
            X.7Pr r2 = X.DbX.A0f(r0)
            android.content.Context r1 = r1.requireContext()
            r0 = 2131975512(0x7f135d58, float:1.9588118E38)
            X.DbZ.A0z(r1, r2, r0)
            r4.A0F(r3, r2)
            return
        L_0x00fb:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r1)
            return
        L_0x0107:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r3.A01
            X.Hms r0 = (X.C55757Hms) r0
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r0 = "https://help.instagram.com/1145520429907666"
            goto L_0x0124
        L_0x0114:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r3.A01
            X.Hms r0 = (X.C55757Hms) r0
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r5 = r0.A01
            r0 = 15
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x0124:
            com.instagram.simplewebview.SimpleWebViewConfig r6 = X.Dba.A0N(r0)
            goto L_0x01b2
        L_0x012a:
            java.lang.Object r0 = r3.A01
            X.E27 r0 = (X.E27) r0
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.0lg r3 = X.DbT.A0X(r0)
            r8 = 0
            X.0Tu r2 = X.DbS.A0J(r3, r8)
            r0 = 36878058082271379(0x83046600000093, double:3.3851706550246415E-306)
            java.lang.String r7 = X.182.A04(r2, r3, r0)
            X.2EG r6 = X.2EG.A3A
            X.SUL r3 = new X.SUL
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = "reels_share_to_fb_upsell_fragment"
            goto L_0x0201
        L_0x0155:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r1)
            r0 = 79
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0kR.A0F(r1, r0)
            return
        L_0x016b:
            java.lang.Object r0 = r3.A01
            X.OLc r0 = (X.C70782OLc) r0
            android.app.Activity r3 = r0.A01
            com.instagram.common.session.UserSession r2 = r0.A04
            X.2EG r1 = X.2EG.A2Q
            java.lang.String r0 = "https://help.instagram.com/3256192917954293"
            goto L_0x022c
        L_0x0179:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r3.A01
            X.E2z r2 = (X.C47453E2z) r2
            android.content.Context r3 = r2.requireContext()
            X.0eM r0 = r2.A0B
            X.0lg r5 = X.DbT.A0X(r0)
            android.content.Context r1 = r2.requireContext()
            java.lang.String r0 = "https://help.instagram.com/227486307449481"
            java.lang.String r22 = X.SQU.A01(r1, r0)
            r7 = 0
            r0 = 2131956570(0x7f13135a, float:1.95497E38)
            java.lang.String r21 = r2.getString(r0)
            r9 = 1
            r10 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r6 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r9
            r15 = r10
            r16 = r10
            r17 = r9
            r18 = r10
            r19 = r10
            r20 = r10
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (java.lang.String) r22)
        L_0x01b2:
            r4.A02(r3, r5, r6)
            return
        L_0x01b6:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            return
        L_0x01c2:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            return
        L_0x01c8:
            java.lang.Object r0 = r3.A01
            X.E1t r0 = (X.C47425E1t) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A39
            r0 = 79
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SUL r3 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "recommend_to_facebook_optimization_upsell"
            goto L_0x0201
        L_0x01e5:
            java.lang.Object r4 = r3.A01
            X.ES1 r4 = (X.ES1) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A46
            r0 = 1417(0x589, float:1.986E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SUL r3 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = r4.A02
        L_0x0201:
            r3.A0S = r0
            goto L_0x0230
        L_0x0204:
            r0 = 14
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0F(r0, r1)
            return
        L_0x0216:
            java.lang.Object r0 = r3.A01
            X.K4U r0 = (X.K4U) r0
            android.content.Context r3 = r0.requireContext()
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A2Q
            r0 = 3251(0xcb3, float:4.556E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x022c:
            X.SUL r3 = X.Dba.A0J(r3, r2, r1, r0)
        L_0x0230:
            r3.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46679Dj8.onClick(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        r4.setColor(r4.linkColor);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        r4.setUnderlineText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        r0 = r1.getColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r4.setColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateDrawState(android.text.TextPaint r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0088;
                case 2: goto L_0x0076;
                case 3: goto L_0x0005;
                case 4: goto L_0x0066;
                case 5: goto L_0x0061;
                case 6: goto L_0x0061;
                case 7: goto L_0x005c;
                case 8: goto L_0x0054;
                case 9: goto L_0x0032;
                case 10: goto L_0x0024;
                case 11: goto L_0x000d;
                case 12: goto L_0x0066;
                case 13: goto L_0x0066;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x005c;
                case 17: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.updateDrawState(r4)
            return
        L_0x0009:
            int r0 = r4.linkColor
            goto L_0x00ac
        L_0x000d:
            X.DbW.A0u(r4)
            java.lang.Object r0 = r3.A01
            X.Lao r0 = (X.C64372Lao) r0
            X.4DH r0 = r0.A04
            android.content.Context r1 = r0.requireContext()
            android.content.Context r0 = r0.requireContext()
            int r0 = X.2Yu.A06(r0)
            goto L_0x00a8
        L_0x0024:
            X.DbW.A0u(r4)
            java.lang.Object r0 = r3.A01
            X.OLc r0 = (X.C70782OLc) r0
            android.content.Context r1 = r0.A02
            int r0 = X.2Yu.A06(r1)
            goto L_0x00a8
        L_0x0032:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            super.updateDrawState(r4)
            r4.setUnderlineText(r0)
            r0 = 1
            r4.setFakeBoldText(r0)
            java.lang.Object r0 = r3.A01
            android.content.Context r1 = X.DbT.A07(r0)
            if (r1 == 0) goto L_0x004d
            int r0 = X.2Yu.A08(r1)
            goto L_0x00a8
        L_0x004d:
            java.lang.String r0 = "Context is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0054:
            r1 = 0
            X.0qQ.A0B(r4, r1)
            super.updateDrawState(r4)
            goto L_0x0072
        L_0x005c:
            r1 = 0
            X.0qQ.A0B(r4, r1)
            goto L_0x0072
        L_0x0061:
            r1 = 0
            X.0qQ.A0B(r4, r1)
            goto L_0x006d
        L_0x0066:
            r1 = 0
            X.0qQ.A0B(r4, r1)
            super.updateDrawState(r4)
        L_0x006d:
            int r0 = r4.linkColor
            r4.setColor(r0)
        L_0x0072:
            r4.setUnderlineText(r1)
            return
        L_0x0076:
            r2 = 0
            X.0qQ.A0B(r4, r2)
            java.lang.Object r0 = r3.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r4.setUnderlineText(r2)
            int r0 = X.2Yu.A06(r1)
            goto L_0x00a8
        L_0x0088:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            int r0 = X.2Yu.A06(r1)
            goto L_0x00a8
        L_0x0095:
            X.DbW.A0u(r4)
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            android.content.Context r0 = r0.getContext()
            int r0 = X.2Yu.A06(r0)
        L_0x00a8:
            int r0 = r1.getColor(r0)
        L_0x00ac:
            r4.setColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46679Dj8.updateDrawState(android.text.TextPaint):void");
    }
}
