package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.3fF  reason: invalid class name and case insensitive filesystem */
public final class C246793fF {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass2xS A02;
    public final SearchContext A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02cb, code lost:
        if (r33 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r27, X.AnonymousClass5OC r28, X.C270644h4 r29, X.AnonymousClass0iw r30, X.1Xj r31, X.AnonymousClass3W1 r32, java.util.List r33, boolean r34) {
        /*
            r26 = this;
            r9 = r33
            r3 = 0
            r8 = 1
            r6 = r26
            androidx.fragment.app.Fragment r0 = r6.A00
            r16 = r0
            android.content.Context r14 = r16.getContext()
            com.instagram.common.session.UserSession r2 = r6.A01
            X.1Av r4 = X.1Au.A00(r2)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r4 = r4.A01
            X.0xY r5 = r4.AR4()
            java.lang.String r4 = "fullscreen_video_hint_last_opened_time"
            r5.E5c(r4, r0)
            r5.apply()
            com.instagram.clips.intf.ClipsViewerSource r11 = X.AnonymousClass5M0.A00(r30)
            java.lang.String r1 = r30.getModuleName()
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r4 = r31
            X.4Jz r5 = X.C263264Jy.A00(r2, r4, r1, r3)
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x02f4
            X.3tc r0 = r0.BF5()
            if (r0 == 0) goto L_0x02f4
            java.lang.Boolean r1 = r0.Cd2()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02f4
            X.337 r21 = X.AnonymousClass337.CLIPS_FEED_TALL_VIDEO_WATCH_AND_BROWSE_WITH_CHAINING
        L_0x0056:
            int r1 = r5.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x02f0
            r0 = 6
            if (r1 == r0) goto L_0x0065
            r0 = 7
            if (r1 != r0) goto L_0x02f0
            X.337 r21 = X.AnonymousClass337.CLIPS_FEED_WATCH_AND_BROWSE_LEADGEN
        L_0x0065:
            X.2xS r0 = r6.A02
            r25 = r0
            X.4DU r0 = r0.A0C
            r24 = r0
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r1 = 0
            r17 = r14
            r18 = r2
            r19 = r4
            r20 = r0
            r22 = r10
            X.HdQ r12 = X.C263264Jy.A02(r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = r30.getModuleName()
            boolean r0 = X.C263264Jy.A07(r2, r4, r0, r3)
            if (r0 == 0) goto L_0x0093
            X.337 r5 = X.AnonymousClass337.EXPLORE_FEED_SEED_AD
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.HGz r12 = new X.HGz
            r12.<init>(r5, r0)
            com.instagram.clips.intf.ClipsViewerSource r11 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_CHAIN_SEED_AD
        L_0x0093:
            r18 = r32
            if (r12 == 0) goto L_0x02d2
            boolean r0 = r12 instanceof X.C54513HGz
            if (r0 == 0) goto L_0x02d2
            java.lang.String r7 = r30.getModuleName()
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            java.lang.String r5 = "feed_timeline"
            boolean r5 = X.0qQ.A0K(r7, r5)
            if (r5 != 0) goto L_0x00b5
            java.lang.String r7 = r30.getModuleName()
            java.lang.String r5 = "feed_contextual_chain"
            boolean r5 = X.0qQ.A0K(r7, r5)
            if (r5 == 0) goto L_0x02d2
        L_0x00b5:
            r5 = r12
            X.HGz r5 = (X.C54513HGz) r5
            com.instagram.clips.intf.ClipsViewerSource r11 = r5.A00
        L_0x00ba:
            X.4h3 r5 = new X.4h3
            r5.<init>(r11, r2)
            java.lang.String r7 = r4.getId()
            r5.A1C = r7
            r7 = r29
            r5.A0F = r7
            r7 = r28
            r5.A07 = r7
            r5.A1g = r3
            boolean r7 = r6.A04
            r5.A1Z = r7
            if (r34 == 0) goto L_0x00e3
            r7 = r25
            X.2uK r7 = r7.A0G
            X.4M3 r7 = r7.A05
            if (r7 == 0) goto L_0x02cf
            int r7 = r7.getCurrentPositionMs()
        L_0x00e1:
            r5.A05 = r7
        L_0x00e3:
            r7 = r27
            if (r12 == 0) goto L_0x0185
            boolean r13 = r12 instanceof X.C54513HGz
            if (r13 == 0) goto L_0x0185
            r13 = r12
            X.HGz r13 = (X.C54513HGz) r13
            r17 = r13
            java.lang.Integer r13 = r17.A00()
            r15 = 0
            if (r13 != r10) goto L_0x00f8
            r15 = 1
        L_0x00f8:
            r5.A1g = r15
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            r10 = 0
            if (r13 != r15) goto L_0x0100
            r10 = 1
        L_0x0100:
            r5.A1c = r10
            X.0qQ.A0B(r13, r3)
            r5.A0S = r13
            java.lang.String r10 = X.C231122qu.A07(r2, r4)
            r5.A17 = r10
            java.lang.String r10 = X.C231122qu.A0F(r2, r4)
            r5.A1A = r10
            java.util.List r10 = r4.A3e()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5.A18 = r10
            X.Gku r15 = r4.A0B
            if (r15 == 0) goto L_0x0139
            X.GAi r10 = com.instagram.api.schemas.IntentAwareAdsInfoIntf.A00
            X.GAj r13 = r10.A00()
            int r10 = r15.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.A02 = r10
            java.lang.String r10 = r15.A01
            r13.A06 = r10
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r10 = r13.A00()
            r5.A0D = r10
        L_0x0139:
            boolean r10 = r12 instanceof X.XQ7
            if (r10 == 0) goto L_0x0185
            r5.A1c = r3
            X.XQ7 r12 = (X.XQ7) r12
            int r10 = r12.A0A
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5.A0Y = r10
            java.lang.Integer r10 = r12.A00
            X.0qQ.A0B(r10, r3)
            r5.A0Q = r10
            com.instagram.clips.intf.ClipsWatchAndBrowseData r10 = X.XXu.A00(r17)
            r5.A01(r10)
            if (r27 == 0) goto L_0x0185
            if (r14 == 0) goto L_0x0185
            X.3Dp r13 = X.C238833Dp.A00(r2)
            X.4HH r12 = new X.4HH
            r10 = r18
            r12.<init>(r14, r10, r2, r4)
            java.lang.String r22 = "in_app_browser_v2"
            X.0sl r23 = X.0sl.A00
            X.3e7 r10 = new X.3e7
            r17 = r10
            r18 = r12
            r19 = r2
            r20 = r4
            r21 = r24
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r13.A0A(r7, r10)
            X.3Dp r12 = X.C238833Dp.A00(r2)
            java.lang.String[] r10 = new java.lang.String[r3]
            r12.A0B(r7, r10)
        L_0x0185:
            com.instagram.search.common.analytics.SearchContext r10 = r6.A03
            if (r10 == 0) goto L_0x018c
            r5.A03(r10)
        L_0x018c:
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_PROFILE
            if (r11 == r10) goto L_0x02c5
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_GROUP_PROFILE
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_SELF_PROFILE
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_FAN_CLUB
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_SELF_FAN_CLUB
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.FEED_CONTEXTUAL_ACCOUNT_HCM
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.OPAL_USER_PROFILE
            if (r11 == r10) goto L_0x01ac
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.OPAL_USER_SELF_PROFILE
            if (r11 != r10) goto L_0x02cb
        L_0x01ac:
            if (r33 != 0) goto L_0x01b3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x01b3:
            X.4bN r10 = X.C295375o3.A02(r4)
            r9.add(r10)
        L_0x01ba:
            boolean r10 = r9.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x020b
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            X.0qQ.A07(r10)
            X.2nF r11 = X.C229342nE.A00(r2)
            X.0qQ.A07(r11)
            X.5u8 r12 = X.C276114sa.A00
            X.5u9 r12 = r12.A00(r8)
            r12.A00 = r1
            X.4sZ r18 = r12.A00()
            X.5nD r19 = X.C294895nD.DEFAULT
            r20 = r10
            r21 = r9
            r22 = r8
            r23 = r3
            r17 = r11
            r17.A03(r18, r19, r20, r21, r22, r23)
            r12 = r16
            X.4DJ r12 = (X.AnonymousClass4DJ) r12
            X.H5G r9 = new X.H5G
            r9.<init>(r11, r6, r10)
            r12.registerLifecycleListener(r9)
            com.instagram.user.model.User r9 = r4.A2A(r2)
            if (r9 == 0) goto L_0x0205
            java.lang.String r1 = r9.getId()
        L_0x0205:
            r5.A1B = r1
            r5.A1F = r10
            r5.A1c = r3
        L_0x020b:
            com.instagram.clips.intf.ClipsViewerSource r1 = X.AnonymousClass5M0.A00(r30)
            com.instagram.clips.intf.ClipsViewerSource r18 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY
            com.instagram.clips.intf.ClipsViewerSource r19 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED
            com.instagram.clips.intf.ClipsViewerSource r20 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_FOLLOWING
            com.instagram.clips.intf.ClipsViewerSource r21 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_FAVORITES
            com.instagram.clips.intf.ClipsViewerSource r22 = com.instagram.clips.intf.ClipsViewerSource.REEL_CLIPS_NETEGO
            r17 = r0
            com.instagram.clips.intf.ClipsViewerSource[] r0 = new com.instagram.clips.intf.ClipsViewerSource[]{r17, r18, r19, r20, r21, r22}
            java.util.Set r0 = X.0sc.A07(r0)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x029b
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x029b
            X.0Tu r9 = X.0Tu.A05
            r0 = 36330496996688538(0x8112650000429a, double:3.0388908196505354E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0240
            r5.A1c = r3
            r5.A1u = r8
        L_0x0240:
            r0 = 36330496996819612(0x8112650002429c, double:3.038890819733427E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x027e
            r5.A1c = r3
            r5.A1u = r3
            r5.A1P = r8
            r1 = 48
            X.J6H r0 = new X.J6H
            r0.<init>(r6, r1)
            r5.A1L = r0
            if (r27 == 0) goto L_0x027e
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            X.0nA.A0L(r6, r7)
            if (r14 == 0) goto L_0x02c3
            int r0 = X.0nA.A0A(r14)
        L_0x026c:
            float r1 = r6.top
            float r0 = (float) r0
            float r1 = r1 - r0
            r5.A02 = r1
            float r0 = r6.height()
            r5.A00 = r0
            float r0 = r6.width()
            r5.A03 = r0
        L_0x027e:
            r0 = 36330496996754075(0x8112650001429b, double:3.038890819691981E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x028b
            r5.A1v = r8
        L_0x028b:
            r0 = 36330496996885149(0x8112650003429d, double:3.038890819774873E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x029b
            r5.A1Y = r8
            r25.onPause()
        L_0x029b:
            java.lang.String r0 = r30.getModuleName()
            r5.A1D = r0
            boolean r0 = r4.A5I()
            if (r0 != 0) goto L_0x0307
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x0307
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x02f8
            boolean r0 = r4.A58()
            if (r0 == 0) goto L_0x02f8
            com.instagram.clips.intf.ClipsViewerConfig r1 = r5.A00()
            r0 = r16
            X.C243473Yx.A05(r0, r1, r2)
            return
        L_0x02c3:
            r0 = 0
            goto L_0x026c
        L_0x02c5:
            boolean r10 = r4.CcK()
            if (r10 == 0) goto L_0x01ac
        L_0x02cb:
            if (r33 == 0) goto L_0x020b
            goto L_0x01ba
        L_0x02cf:
            r7 = 0
            goto L_0x00e1
        L_0x02d2:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            if (r11 != r0) goto L_0x00ba
            r5 = r18
            boolean r5 = r5.A2a
            if (r5 == 0) goto L_0x00ba
            boolean r5 = X.AnonymousClass3VO.A08(r4)
            if (r5 == 0) goto L_0x02e6
            com.instagram.clips.intf.ClipsViewerSource r11 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY
            goto L_0x00ba
        L_0x02e6:
            boolean r5 = X.AnonymousClass3VO.A09(r4)
            if (r5 == 0) goto L_0x00ba
            com.instagram.clips.intf.ClipsViewerSource r11 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED
            goto L_0x00ba
        L_0x02f0:
            X.337 r21 = X.AnonymousClass337.CLIPS_FEED_WATCH_AND_BROWSE
            goto L_0x0065
        L_0x02f4:
            X.337 r21 = X.AnonymousClass337.CLIPS_FEED_WATCH_AND_BROWSE_WITH_CHAINING
            goto L_0x0056
        L_0x02f8:
            androidx.fragment.app.FragmentActivity r1 = r16.requireActivity()
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A00()
            X.0qQ.A0B(r2, r3)
            X.C243473Yx.A07(r1, r0, r2, r3, r3)
            return
        L_0x0307:
            androidx.fragment.app.FragmentActivity r0 = r16.requireActivity()
            X.I6Y.A01(r0, r5, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246793fF.A00(android.view.View, X.5OC, X.4h4, X.0iw, X.1Xj, X.3W1, java.util.List, boolean):void");
    }

    public C246793fF(Fragment fragment, UserSession userSession, AnonymousClass2xS r3, SearchContext searchContext, boolean z) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = z;
        this.A02 = r3;
        this.A03 = searchContext;
    }
}
