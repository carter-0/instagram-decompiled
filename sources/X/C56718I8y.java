package X;

import android.content.DialogInterface;

/* renamed from: X.I8y  reason: case insensitive filesystem */
public final class C56718I8y implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56718I8y(C56911IHg iHg, C55777HnC hnC, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A02 = iHg;
            this.A01 = hnC;
        } else {
            this.A01 = hnC;
            this.A02 = iHg;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f8, code lost:
        X.C59689JTv.A0F(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03a3, code lost:
        X.FH7.A08(r4, r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            r2 = r20
            switch(r1) {
                case 0: goto L_0x03a7;
                case 1: goto L_0x013e;
                case 2: goto L_0x0391;
                case 3: goto L_0x037e;
                case 4: goto L_0x02ff;
                case 5: goto L_0x010d;
                case 6: goto L_0x02ae;
                case 7: goto L_0x028a;
                case 8: goto L_0x0270;
                case 9: goto L_0x00ef;
                case 10: goto L_0x0239;
                case 11: goto L_0x021c;
                case 12: goto L_0x020e;
                case 13: goto L_0x0085;
                case 14: goto L_0x005c;
                case 15: goto L_0x001f;
                case 16: goto L_0x01fc;
                case 17: goto L_0x0009;
                case 18: goto L_0x01b0;
                case 19: goto L_0x0009;
                case 20: goto L_0x016b;
                case 21: goto L_0x015d;
                case 22: goto L_0x034f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r0.A02
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r4 = (com.facebook.quicklog.reliability.UserFlowLoggerImpl) r4
            r2 = 658062002(0x27393ab2, double:3.25125828E-315)
            java.lang.String r1 = "user_cancelled"
            r4.flowEndCancel(r2, r1)
            java.lang.Object r0 = r0.A01
            X.GCh r0 = (X.C52035GCh) r0
            X.HqC r0 = r0.A05
            r0.A00()
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r5 = r0.A02
            X.2is r5 = (X.C227232is) r5
            X.4bN r1 = X.GD9.A00(r5)
            if (r1 == 0) goto L_0x005a
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r1.getId()
        L_0x0031:
            java.lang.Object r3 = r0.A01
            X.1i4 r3 = (X.AnonymousClass1i4) r3
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x001e
            java.lang.String r0 = "instagram://bloks/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0052
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r5)
            android.content.Context r0 = r5.requireContext()
            X.FFC.A03(r1, r0, r2)
        L_0x004c:
            java.lang.String r0 = "actionable_insights_tip_tap"
            X.C227232is.A0F(r3, r5, r4, r0)
            return
        L_0x0052:
            android.content.Context r0 = r5.requireContext()
            X.FH7.A03(r0, r2)
            goto L_0x004c
        L_0x005a:
            r4 = 0
            goto L_0x0031
        L_0x005c:
            X.DbW.A0r(r2)
            java.lang.Object r4 = r0.A02
            X.Gzg r4 = (X.C54111Gzg) r4
            X.0eM r1 = r4.A02
            java.lang.Object r3 = r1.getValue()
            X.JiA r3 = (X.C60253JiA) r3
            java.lang.Object r2 = r0.A01
            java.util.List r0 = r3.A00()
            java.util.ArrayList r1 = X.00k.A0U(r0)
            r1.remove(r2)
            X.2Fj r0 = r3.A02
            r0.A0B(r1)
            X.H0c r0 = r4.A00
            if (r0 == 0) goto L_0x001e
            X.C54133H0c.A00(r0)
            return
        L_0x0085:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "https://help.instagram.com/1052265019655889"
            X.FH7.A03(r2, r1)
            java.lang.Object r0 = r0.A02
            X.Hqf r0 = (X.C55974Hqf) r0
            X.Hzn r0 = r0.A02
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.27r r0 = (X.27r) r0
            X.29V r3 = r0.A0C
            X.0wc r1 = r3.A01
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x001e
            r0 = 1025(0x401, float:1.436E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "entity"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "TAP"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            X.283 r0 = r3.A04
            java.lang.String r1 = r0.A0L
            if (r1 != 0) goto L_0x00c6
            java.lang.String r1 = ""
        L_0x00c6:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.4yP r1 = X.C279294yP.CLIPS
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r2)
            java.lang.String r1 = "learn more"
            java.lang.String r0 = "ui_text"
            r2.AAJ(r0, r1)
            X.HOA r1 = X.HOA.SPINNABLE_REEL
            java.lang.String r0 = "spin_type"
            r2.A8M(r1, r0)
            r2.Cgf()
            return
        L_0x00ef:
            java.lang.Object r1 = r0.A01
            X.H15 r1 = (X.H15) r1
            java.lang.Object r5 = r0.A02
            java.util.List r5 = (java.util.List) r5
            X.H15.A02(r1)
            com.instagram.save.model.SavedCollection r3 = r1.A0C
            if (r3 == 0) goto L_0x001e
            android.content.Context r0 = r1.requireContext()
            com.instagram.common.session.UserSession r2 = r1.A05
            X.Ihf r4 = new X.Ihf
            r4.<init>(r1, r5)
            X.C56669I6y.A03(r0, r1, r2, r3, r4, r5)
            return
        L_0x010d:
            java.lang.Object r2 = r0.A02
            X.IHg r2 = (X.C56911IHg) r2
            X.1Xj r1 = r2.A0E
            com.instagram.common.session.UserSession r4 = r2.A0A
            com.instagram.user.model.User r6 = r1.A2A(r4)
            if (r6 == 0) goto L_0x001e
            java.lang.Object r0 = r0.A01
            X.HnC r0 = (X.C55777HnC) r0
            int r0 = r0.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            androidx.fragment.app.FragmentActivity r3 = r2.A05
            androidx.fragment.app.Fragment r5 = r2.A04
            X.4D6 r5 = (X.AnonymousClass4D6) r5
            X.Lh9 r2 = new X.Lh9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 10
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.1DL.A04(r3, r2, r0)
            return
        L_0x013e:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 36888653766918957(0x830e090005032d, double:3.3918714086611673E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            X.2EG r1 = X.2EG.A14
            int r0 = r2.length()
            if (r0 == 0) goto L_0x001e
            X.Dbb.A0k(r4, r3, r1, r2)
            return
        L_0x015d:
            java.lang.Object r2 = r0.A02
            X.I4M r2 = (X.I4M) r2
            com.instagram.common.session.UserSession r1 = r2.A0C
            java.lang.Object r0 = r0.A01
            X.3Oq r0 = (X.C241293Oq) r0
            X.I4M.A00(r0, r1, r2)
            return
        L_0x016b:
            java.lang.Object r7 = r0.A01
            X.4bN r7 = (X.C267324bN) r7
            X.1Xj r6 = r7.A02
            java.lang.Object r5 = r0.A02
            X.GCh r5 = (X.C52035GCh) r5
            if (r6 == 0) goto L_0x01a8
            X.4DH r4 = r5.A02
            com.instagram.common.session.UserSession r8 = r5.A03
            r3 = 1
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.Object[] r1 = X.C51969G9p.A1b(r6)
            java.lang.String r0 = "media/%s/cancel_delete/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "media_id"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r0 = X.DbT.A0U(r2, r3)
            androidx.fragment.app.FragmentActivity r6 = r5.A01
            X.GBE r9 = r5.A04
            r10 = 2131976093(0x7f135f9d, float:1.9589297E38)
            X.HKE r5 = new X.HKE
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r5
            r4.schedule(r0)
            return
        L_0x01a8:
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            r1 = 2131955696(0x7f130ff0, float:1.9547927E38)
            java.lang.String r0 = "clips_recover_failed"
            goto L_0x01f8
        L_0x01b0:
            java.lang.Object r7 = r0.A01
            X.4bN r7 = (X.C267324bN) r7
            X.1Xj r6 = r7.A02
            java.lang.Object r5 = r0.A02
            X.GCh r5 = (X.C52035GCh) r5
            if (r6 == 0) goto L_0x01ed
            X.4DH r4 = r5.A02
            com.instagram.common.session.UserSession r8 = r5.A03
            r3 = 1
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.Object[] r1 = X.C51969G9p.A1b(r6)
            java.lang.String r0 = "media/%s/hard_delete/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "media_id"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r0 = X.DbT.A0U(r2, r3)
            androidx.fragment.app.FragmentActivity r6 = r5.A01
            X.GBE r9 = r5.A04
            r10 = 2131957622(0x7f131776, float:1.9551833E38)
            X.HKD r5 = new X.HKD
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r5
            r4.schedule(r0)
            return
        L_0x01ed:
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            r1 = 2131955358(0x7f130e9e, float:1.9547241E38)
            r0 = 1178(0x49a, float:1.651E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x01f8:
            X.C59689JTv.A0F(r2, r0, r1)
            return
        L_0x01fc:
            java.lang.Object r3 = r0.A02
            X.2is r3 = (X.C227232is) r3
            java.lang.Object r2 = r0.A01
            X.1i4 r2 = (X.AnonymousClass1i4) r2
            java.lang.String r1 = r3.getMediaId()
            java.lang.String r0 = "actionable_insights_tip_dismiss"
            X.C227232is.A0F(r2, r3, r1, r0)
            return
        L_0x020e:
            java.lang.Object r1 = r0.A02
            X.GiF r1 = (X.C53081GiF) r1
            X.K57 r1 = r1.A09
            java.lang.Object r0 = r0.A01
            X.8vc r0 = (X.C369968vc) r0
            r1.A06(r0)
            return
        L_0x021c:
            java.lang.Object r4 = r0.A02
            X.GiF r4 = (X.C53081GiF) r4
            com.instagram.common.session.UserSession r1 = r4.A07
            X.27r r3 = X.27p.A01(r1)
            java.lang.Object r2 = r0.A01
            X.8vc r2 = (X.C369968vc) r2
            java.lang.String r1 = r2.A09
            r0 = 0
            r3.A1E(r0, r1)
            X.Ihm r0 = new X.Ihm
            r0.<init>(r2, r4)
            X.11Z.A02(r0)
            return
        L_0x0239:
            if (r21 != 0) goto L_0x0250
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "Throttle Disabled"
            X.C59689JTv.A09(r1, r0)
            r3 = -1
        L_0x0249:
            X.1yV r0 = X.1yV.A00()
            r0.A00 = r3
            return
        L_0x0250:
            java.lang.Object r1 = r0.A01
            java.lang.String[] r1 = (java.lang.String[]) r1
            r1 = r1[r21]
            int r3 = java.lang.Integer.parseInt(r1)
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "Bandwidth Set To %d Kbps"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            X.C59689JTv.A09(r2, r0)
            goto L_0x0249
        L_0x0270:
            java.lang.Object r4 = r0.A01
            X.H15 r4 = (X.H15) r4
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            X.H15.A02(r4)
            android.content.Context r2 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A05
            X.Ihd r0 = new X.Ihd
            r0.<init>(r4, r3)
            X.C56669I6y.A07(r2, r4, r1, r0, r3)
            return
        L_0x028a:
            java.lang.Object r3 = r0.A01
            X.IXN r3 = (X.IXN) r3
            java.lang.Object r2 = r3.A01
            X.H5L r2 = (X.H5L) r2
            X.0iw r5 = r2.A04
            X.4DH r1 = r2.A03
            android.content.Context r4 = r1.requireContext()
            com.instagram.common.session.UserSession r6 = r2.A05
            com.instagram.save.model.SavedCollection r7 = r2.A0E
            java.lang.Object r8 = r0.A02
            com.instagram.save.model.SavedCollection r8 = (com.instagram.save.model.SavedCollection) r8
            java.lang.Object r10 = r3.A02
            java.util.List r10 = (java.util.List) r10
            r9 = 0
            X.C56669I6y.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A02()
            return
        L_0x02ae:
            java.lang.Object r5 = r0.A02
            X.GhV r5 = (X.C53039GhV) r5
            X.05G r1 = r5.A04
            java.lang.Object r1 = r1.getValue()
            X.GMQ r1 = (X.GMQ) r1
            java.lang.Object r4 = r1.A06
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r0.A01
            X.LRh r1 = (X.LRh) r1
            java.util.LinkedHashMap r0 = X.C53039GhV.A02(r5)
            r3 = 0
            X.C53039GhV.A01(r1, r4, r0, r3)
            X.IOh r2 = r5.A02
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r4.iterator()
        L_0x02d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = X.C51975G9x.A0k(r1)
            if (r0 == 0) goto L_0x02d4
            r9.add(r0)
            goto L_0x02d4
        L_0x02e4:
            r0 = 4
            X.NMG r6 = new X.NMG
            r6.<init>(r0, r4, r5, r3)
            r1 = 1
            X.I0v r4 = r2.A03
            java.lang.String r7 = r2.A04
            int r0 = r9.size()
            if (r0 <= r1) goto L_0x02fc
            com.instagram.api.schemas.SubmittedSubPostManageType r5 = com.instagram.api.schemas.SubmittedSubPostManageType.BULK_DELETE_FROM_AUTHOR
        L_0x02f7:
            r8 = 0
            r4.A01(r5, r6, r7, r8, r9)
            return
        L_0x02fc:
            com.instagram.api.schemas.SubmittedSubPostManageType r5 = com.instagram.api.schemas.SubmittedSubPostManageType.DELETE
            goto L_0x02f7
        L_0x02ff:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Object r2 = r0.A01
            X.HnC r2 = (X.C55777HnC) r2
            java.lang.String r9 = r2.A03
            r1 = 504(0x1f8, float:7.06E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putString(r1, r9)
            android.net.Uri r2 = r2.A02
            java.lang.Object r0 = r0.A02
            X.IHg r0 = (X.C56911IHg) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.1Xj r6 = r0.A0E
            X.4DU r4 = r0.A0F
            com.instagram.common.session.UserSession r5 = r0.A0A
            r7 = 0
            r0 = 73
            java.lang.String r8 = X.C66579MXk.A00(r0)
            r11 = 1
            r12 = 0
            r10 = r7
            X.C46395DeI.A0O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r12 = r6.getId()
            if (r12 == 0) goto L_0x034a
            r0 = 708(0x2c4, float:9.92E-43)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            java.lang.String r16 = X.DbT.A0x(r6)
            java.lang.String r13 = "feed_action_sheet"
            r10 = r4
            r11 = r5
            r15 = r9
            r17 = r7
            r18 = r7
            X.C22031Xty.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x034a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x034f:
            java.lang.Object r1 = r0.A02
            X.GCg r1 = (X.C52034GCg) r1
            X.1Xj r5 = r1.A02
            if (r5 != 0) goto L_0x0361
            java.lang.String r0 = "media"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0361:
            com.instagram.common.session.UserSession r4 = r1.A0B
            androidx.fragment.app.FragmentActivity r3 = r1.A04
            X.4DH r1 = r1.A05
            java.lang.String r8 = r1.getModuleName()
            java.lang.Class r7 = r1.getClass()
            com.instagram.user.model.User r6 = X.DbT.A0j(r4)
            X.C347037wA.A03(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.A01
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            r0.onDismiss(r2)
            return
        L_0x037e:
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.2EG r2 = X.2EG.A1e
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "EncryptedBackupsOneTimeCodeNotificationUtils"
            goto L_0x03a3
        L_0x0391:
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.2EG r2 = X.2EG.A1e
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "EncryptedBackupsOneTimeCodeExpirationUtils"
        L_0x03a3:
            X.FH7.A08(r4, r3, r2, r1, r0)
            return
        L_0x03a7:
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A01
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56718I8y.onClick(android.content.DialogInterface, int):void");
    }

    public C56718I8y(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
