package X;

import android.content.DialogInterface;

/* renamed from: X.I8z  reason: case insensitive filesystem */
public final class C56719I8z implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C56719I8z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C56719I8z A00(Object obj, int i) {
        return new C56719I8z(obj, i);
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0I(new C56719I8z(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03cc, code lost:
        X.AnonymousClass7TE.A1Z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03e7, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03ee, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x041e, code lost:
        r6.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0421, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0252, code lost:
        r5.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0255, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x026f, code lost:
        ((android.content.DialogInterface.OnDismissListener) r15.A01).onDismiss(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0276, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0356, code lost:
        r1.A00 = r7;
        X.1ES.A00(r8, r6.A07, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x035d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A00
            r6 = r16
            switch(r0) {
                case 2: goto L_0x040e;
                case 3: goto L_0x000c;
                case 4: goto L_0x0406;
                case 5: goto L_0x0406;
                case 6: goto L_0x03fc;
                case 7: goto L_0x039d;
                case 8: goto L_0x0376;
                case 9: goto L_0x036e;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0417;
                case 13: goto L_0x0007;
                case 14: goto L_0x0366;
                case 15: goto L_0x035e;
                case 16: goto L_0x0331;
                case 17: goto L_0x0329;
                case 18: goto L_0x030c;
                case 19: goto L_0x02e6;
                case 20: goto L_0x02ce;
                case 21: goto L_0x02b4;
                case 22: goto L_0x0116;
                case 23: goto L_0x0116;
                case 24: goto L_0x027f;
                case 25: goto L_0x0277;
                case 26: goto L_0x026b;
                case 27: goto L_0x026b;
                case 28: goto L_0x026f;
                case 29: goto L_0x000c;
                case 30: goto L_0x026b;
                case 31: goto L_0x041e;
                case 32: goto L_0x041e;
                case 33: goto L_0x041e;
                case 34: goto L_0x0256;
                case 35: goto L_0x03d3;
                case 36: goto L_0x023a;
                case 37: goto L_0x021f;
                case 38: goto L_0x00f0;
                case 39: goto L_0x0214;
                case 40: goto L_0x01fa;
                case 41: goto L_0x01ee;
                case 42: goto L_0x01ee;
                case 43: goto L_0x01d1;
                case 44: goto L_0x0196;
                case 45: goto L_0x016a;
                case 46: goto L_0x008f;
                case 47: goto L_0x0161;
                case 48: goto L_0x0007;
                case 49: goto L_0x003c;
                case 50: goto L_0x026f;
                case 51: goto L_0x0158;
                case 52: goto L_0x000d;
                case 53: goto L_0x0148;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r15.A01
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.6Z5 r4 = r0.A3G
            X.3uh r3 = r0.Au5()
            java.lang.ref.WeakReference r0 = r4.A1A
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x000c
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x000c
            if (r3 == 0) goto L_0x000c
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x000c
            X.1i4 r0 = r0.A0c
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x000c
            java.lang.String r0 = "stories_golden_window_tip_boost_tap"
            r4.A0G(r3, r0)
            X.FH7.A03(r2, r1)
            return
        L_0x003c:
            java.lang.Object r2 = r15.A01
            X.GPN r2 = (X.GPN) r2
            X.2is r0 = r2.A04
            if (r0 == 0) goto L_0x000c
            android.app.Activity r0 = r0.getRootActivity()
            r1 = 1
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isFinishing()
            if (r0 != r1) goto L_0x0052
            return
        L_0x0052:
            X.4bN r0 = X.GPN.A00(r2)
            if (r0 == 0) goto L_0x000c
            X.1Xj r5 = r0.A02
            if (r5 == 0) goto L_0x000c
            com.instagram.common.session.UserSession r7 = r2.A07
            X.0iw r6 = r2.A06
            java.lang.String r8 = r5.getId()
            java.lang.String r11 = X.DbT.A0x(r5)
            r0 = 5296(0x14b0, float:7.421E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r0 = 1077(0x435, float:1.509E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r4 = 0
            X.C22031Xty.A0G(r6, r7, r8, r9, r10, r11)
            X.2is r1 = r2.A04
            if (r1 == 0) goto L_0x000c
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r1)
            android.app.Activity r0 = r1.getRootActivity()
            X.0qQ.A0A(r0)
            X.28D r2 = X.28D.A4p
            r7 = 0
            r6 = r4
            X.C243473Yx.A02(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x008f:
            java.lang.Object r0 = r15.A01
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
            if (r0 == 0) goto L_0x000c
            r0 = 1025(0x401, float:1.436E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "entity"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "CONTINUE"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            X.283 r0 = r3.A04
            java.lang.String r1 = r0.A0L
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = ""
        L_0x00c7:
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
            java.lang.String r1 = "get started"
            java.lang.String r0 = "ui_text"
            r2.AAJ(r0, r1)
            X.HOA r1 = X.HOA.SPINNABLE_REEL
            java.lang.String r0 = "spin_type"
            r2.A8M(r1, r0)
            r2.Cgf()
            return
        L_0x00f0:
            java.lang.Object r5 = r15.A01
            X.H15 r5 = (X.H15) r5
            com.instagram.save.model.SavedCollection r0 = r5.A0C
            if (r0 == 0) goto L_0x0112
            X.HMw r1 = r5.A0E
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 == r0) goto L_0x0112
            com.instagram.common.session.UserSession r0 = r5.A05
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            com.instagram.common.session.UserSession r3 = r5.A05
            java.lang.String r2 = r5.A0L
            r1 = 17
            X.H51 r0 = new X.H51
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            X.C56641I5w.A04(r0, r3, r2)
        L_0x0112:
            if (r16 == 0) goto L_0x000c
            goto L_0x041e
        L_0x0116:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            androidx.fragment.app.FragmentActivity r5 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.07i r3 = r0.A07
            X.1Xj r1 = r0.A0E
            r0 = 2
            X.0qQ.A0B(r3, r0)
            java.lang.String r1 = r1.A2n()
            if (r1 == 0) goto L_0x000c
            X.1NY r2 = X.AnonymousClass7TG.A0a(r4)
            java.lang.String r0 = "feed/profile_grid/remove/"
            X.C51968G9o.A1K(r2, r0, r1)
            java.lang.Class<X.Gyh> r1 = X.C54058Gyh.class
            java.lang.Class<X.HvJ> r0 = X.C56252HvJ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            X.H4l r0 = new X.H4l
            r0.<init>(r4, r5)
            r1.A00 = r0
            X.1ES.A00(r5, r3, r1)
            return
        L_0x0148:
            java.lang.Object r0 = r15.A01
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.6Z5 r2 = r0.A3G
            X.3uh r1 = r0.Au5()
            java.lang.String r0 = "stories_golden_window_tip_dismiss_tap"
            r2.A0G(r1, r0)
            return
        L_0x0158:
            java.lang.Object r1 = r15.A01
            X.HAr r1 = (X.C54376HAr) r1
            r0 = 0
            X.C54376HAr.A03(r1, r0)
            return
        L_0x0161:
            java.lang.Object r1 = r15.A01
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x016a:
            java.lang.Object r0 = r15.A01
            X.H00 r0 = (X.H00) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.GhD r1 = (X.C53022GhD) r1
            X.KWh r3 = r1.A00
            java.lang.String r4 = r1.A02
            java.lang.String r5 = r1.A01
            r0 = 3498(0xdaa, float:4.902E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r8 = 0
            X.4Cq r0 = r3.A01
            r7 = 0
            X.MEe r2 = new X.MEe
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r0)
            X.3ju r1 = r1.A05
            X.IdV r0 = X.C57604IdV.A00
            r1.FIG(r0)
            return
        L_0x0196:
            java.lang.Object r5 = r15.A01
            X.GgR r5 = (X.C52974GgR) r5
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r5.A0E
            java.util.List r2 = r5.A0I
            X.8fx r1 = r5.A0B
            r0 = 0
            r3.A0a(r1, r2, r0)
            X.8ZP r4 = r5.A0C
            X.1QP r3 = r4.A02
            long r1 = r4.A01
            java.lang.String r0 = "SOUND_SYNC_QUITTED"
            r3.flowMarkPoint(r1, r0)
            long r1 = r4.A01
            java.lang.String r0 = "user_cancelled"
            r3.flowEndCancel(r1, r0)
            r0 = 0
            r4.A01 = r0
            boolean r0 = r5.A0W
            X.8Vz r1 = r5.A0A
            if (r0 == 0) goto L_0x01cb
            X.8Vt r0 = X.C356928Vt.FINISH_ACTIVITY
            r1.A00(r0)
            X.27r r0 = r5.A09
            r0.A0W()
            return
        L_0x01cb:
            X.8Vt r0 = X.C356928Vt.NONE
            r1.A00(r0)
            return
        L_0x01d1:
            java.lang.Object r0 = r15.A01
            X.Gta r0 = (X.C53745Gta) r0
            X.GgN r1 = r0.A00
            X.HIX r0 = X.HIX.A00
            r1.A0F(r0)
            X.I49 r5 = r1.A09
            X.HOB r1 = X.HOB.CANCEL
            X.HOs r0 = X.C54687HOs.A09
            r2 = 0
            r10 = 0
            r3 = r2
            r4 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            X.I49.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01ee:
            java.lang.Object r0 = r15.A01
            X.Gta r0 = (X.C53745Gta) r0
            X.GgN r1 = r0.A00
            X.HIX r0 = X.HIX.A00
            r1.A0F(r0)
            return
        L_0x01fa:
            java.lang.Object r0 = r15.A01
            X.LBL r0 = (X.LBL) r0
            X.0eM r0 = r0.A0D
            X.2YL r3 = X.DbS.A0H(r0)
            X.KhZ r2 = X.C62543KhZ.GUEST_REQUEST
            X.6oS r6 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 45
            X.MHL r5 = new X.MHL
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
            goto L_0x03cc
        L_0x0214:
            java.lang.Object r0 = r15.A01
            X.H0x r0 = (X.C54153H0x) r0
            r0.A08()
            X.DbX.A1I(r0)
            return
        L_0x021f:
            java.lang.Object r5 = r15.A01
            X.H5L r5 = (X.H5L) r5
            X.0iw r7 = r5.A04
            X.4DH r0 = r5.A03
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r8 = r5.A05
            com.instagram.save.model.SavedCollection r9 = r5.A0E
            X.HG5 r0 = r5.A06
            java.util.List r11 = r0.A04()
            r10 = 0
            X.C56669I6y.A03(r6, r7, r8, r9, r10, r11)
            goto L_0x0252
        L_0x023a:
            java.lang.Object r5 = r15.A01
            X.H5L r5 = (X.H5L) r5
            X.0iw r4 = r5.A04
            X.4DH r0 = r5.A03
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r5.A05
            X.HG5 r0 = r5.A06
            java.util.List r1 = r0.A04()
            r0 = 0
            X.C56669I6y.A07(r3, r4, r2, r0, r1)
        L_0x0252:
            r5.A02()
            return
        L_0x0256:
            r6.dismiss()
            java.lang.Object r0 = r15.A01
            X.HnJ r0 = (X.C55784HnJ) r0
            X.6aQ r2 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.user.model.User r1 = X.DbT.A0j(r0)
            java.lang.String r0 = "reel_viewer_see_highlights_button"
            r2.A03(r1, r0)
            return
        L_0x026b:
            r0 = 0
            X.0qQ.A0B(r6, r0)
        L_0x026f:
            java.lang.Object r0 = r15.A01
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            r0.onDismiss(r6)
            return
        L_0x0277:
            java.lang.Object r0 = r15.A01
            X.2uE r0 = (X.AnonymousClass2uE) r0
            X.AnonymousClass2uE.A01(r0)
            return
        L_0x027f:
            java.lang.Object r3 = r15.A01
            X.IHg r3 = (X.C56911IHg) r3
            X.1Xj r7 = r3.A0E
            X.1Xy r0 = r7.A0C
            com.instagram.model.hashtag.Hashtag r6 = r0.B6n()
            if (r6 == 0) goto L_0x02af
            androidx.fragment.app.Fragment r2 = r3.A04
            X.4DU r1 = r3.A0F
            com.instagram.common.session.UserSession r5 = r3.A0A
            X.JOb r4 = r3.A0K
            androidx.fragment.app.FragmentActivity r3 = r3.A05
            r0 = 4
            X.0qQ.A0B(r4, r0)
            X.0gy r0 = X.AnonymousClass07i.A00(r2)
            X.2oy r2 = new X.2oy
            r2.<init>(r3, r0, r1, r5)
            X.WXc r1 = new X.WXc
            r1.<init>(r3, r7, r4)
            java.lang.String r0 = "main_feed_overflow_menu"
            r2.A06(r5, r1, r6, r0)
            return
        L_0x02af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02b4:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            X.1Xj r3 = r0.A0E
            com.instagram.common.session.UserSession r2 = r0.A0A
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.4DU r0 = r0.A0F
            java.lang.String r6 = r0.getModuleName()
            java.lang.Class<X.IHg> r5 = X.C56911IHg.class
            com.instagram.user.model.User r4 = X.DbT.A0j(r2)
            X.C347037wA.A03(r1, r2, r3, r4, r5, r6)
            return
        L_0x02ce:
            java.lang.Object r6 = r15.A01
            X.IHg r6 = (X.C56911IHg) r6
            com.instagram.common.session.UserSession r9 = r6.A0A
            X.1OC r1 = X.C49736F4b.A00(r9)
            X.1Xj r10 = r6.A0E
            androidx.fragment.app.FragmentActivity r8 = r6.A05
            r12 = 0
            r11 = 0
            X.ELE r7 = new X.ELE
            r13 = r12
            r14 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0356
        L_0x02e6:
            java.lang.Object r6 = r15.A01
            X.IHg r6 = (X.C56911IHg) r6
            com.instagram.common.session.UserSession r5 = r6.A0A
            X.1NY r4 = X.AnonymousClass7TG.A0a(r5)
            r3 = 1
            X.1Xj r2 = r6.A0E
            java.lang.Object[] r1 = X.C51969G9p.A1b(r2)
            java.lang.String r0 = "media/%s/cancel_delete/"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            X.Dba.A1H(r4, r0)
            X.1OC r1 = X.DbT.A0U(r4, r3)
            androidx.fragment.app.FragmentActivity r8 = r6.A05
            X.ELD r7 = new X.ELD
            r7.<init>(r8, r5, r2)
            goto L_0x0356
        L_0x030c:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            androidx.fragment.app.Fragment r2 = r0.A04
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.1Xj r0 = r0.A0E
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0324
            X.1OC r0 = X.C56334Hwl.A00(r2, r1, r0)
            X.1ES.A03(r0)
            return
        L_0x0324:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0329:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            X.C56911IHg.A06(r0)
            return
        L_0x0331:
            java.lang.Object r6 = r15.A01
            X.IHg r6 = (X.C56911IHg) r6
            com.instagram.common.session.UserSession r5 = r6.A0A
            X.1NY r4 = X.AnonymousClass7TG.A0a(r5)
            r3 = 1
            X.1Xj r2 = r6.A0E
            java.lang.Object[] r1 = X.C51969G9p.A1b(r2)
            java.lang.String r0 = "media/%s/hard_delete/"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            X.Dba.A1H(r4, r0)
            X.1OC r1 = X.DbT.A0U(r4, r3)
            androidx.fragment.app.FragmentActivity r8 = r6.A05
            X.ELC r7 = new X.ELC
            r7.<init>(r8, r5, r2)
        L_0x0356:
            r1.A00 = r7
            X.07i r0 = r6.A07
            X.1ES.A00(r8, r0, r1)
            return
        L_0x035e:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            X.C56911IHg.A05(r0)
            return
        L_0x0366:
            java.lang.Object r0 = r15.A01
            X.IHg r0 = (X.C56911IHg) r0
            X.C56911IHg.A02(r0)
            return
        L_0x036e:
            java.lang.Object r0 = r15.A01
            X.H0w r0 = (X.C54152H0w) r0
            X.C54152H0w.A01(r0)
            return
        L_0x0376:
            java.lang.Object r0 = r15.A01
            X.H0e r0 = (X.C54135H0e) r0
            X.0eM r0 = r0.A09
            X.GhH r3 = X.C51966G9m.A0p(r0)
            X.0eM r0 = r3.A04
            java.lang.Object r2 = r0.getValue()
            X.Hpa r2 = (X.C55913Hpa) r2
            X.HOI r1 = X.HOI.EXPLICIT_TOGGLED
            java.lang.Long r0 = r3.A01
            r2.A00(r1, r0)
            r2 = 0
            X.6oS r6 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 18
            X.JV6 r5 = new X.JV6
            r5.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r1, (int) r0, (boolean) r2)
            goto L_0x03cc
        L_0x039d:
            java.lang.Object r0 = r15.A01
            X.H0e r0 = (X.C54135H0e) r0
            X.0eM r0 = r0.A09
            X.GhH r4 = X.C51966G9m.A0p(r0)
            X.Hzj r1 = r4.A00
            if (r1 == 0) goto L_0x03d0
            java.lang.String r3 = r4.A03
            X.HOs r0 = X.C54687HOs.A06
            X.C56512Hzj.A00(r0, r1, r3)
            X.0eM r0 = r4.A04
            java.lang.Object r2 = r0.getValue()
            X.Hpa r2 = (X.C55913Hpa) r2
            X.HOI r1 = X.HOI.MEMU_DISABLED
            java.lang.Long r0 = r4.A01
            r2.A00(r1, r0)
            X.6oS r6 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 4
            X.MFW r5 = new X.MFW
            r5.<init>(r4, r3, r1, r0)
        L_0x03cc:
            X.AnonymousClass7TE.A1Z(r5, r6)
            return
        L_0x03d0:
            java.lang.String r0 = "memuLogger"
            goto L_0x03e7
        L_0x03d3:
            java.lang.Object r5 = r15.A01
            X.H10 r5 = (X.H10) r5
            X.0eM r0 = r5.A0H
            X.1Ng r4 = X.DbX.A0R(r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.save.model.SavedCollection r0 = r5.A02
            if (r0 != 0) goto L_0x03ef
            java.lang.String r0 = "collection"
        L_0x03e7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03ef:
            java.lang.String r2 = r0.A0F
            r1 = 15
            X.H51 r0 = new X.H51
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            X.C56641I5w.A04(r0, r3, r2)
            return
        L_0x03fc:
            java.lang.Object r1 = r15.A01
            X.H0e r1 = (X.C54135H0e) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C54135H0e.A01(r1, r0)
            return
        L_0x0406:
            java.lang.Object r0 = r15.A01
            X.JO0 r0 = (X.JO0) r0
            r0.D8F()
            return
        L_0x040e:
            java.lang.Object r1 = r15.A01
            X.JNt r1 = (X.C59547JNt) r1
            r0 = 0
            r1.Djf(r0)
            return
        L_0x0417:
            java.lang.Object r0 = r15.A01
            X.JPL r0 = (X.JPL) r0
            r0.AHB()
        L_0x041e:
            r6.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56719I8z.onClick(android.content.DialogInterface, int):void");
    }
}
