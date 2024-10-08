package X;

import android.view.View;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

public abstract class WW4 implements XBv, AnonymousClass31R, X8R {
    public void A0B() {
    }

    public void A0C(View view) {
    }

    public void A0D(View view, C296995qz r2, C296935qt r3, 1Xj r4) {
    }

    public void A0E(View view, C296995qz r2, C297035r4 r3) {
    }

    public void A0F(View view, C296995qz r2, HAR har) {
    }

    public void A0I(C296995qz r4, C296955qv r5) {
        C14074TpO tpO;
        C15942UlC ulC = (C15942UlC) this;
        switch (ulC.A00) {
            case 1:
                tpO = ((C15381Ube) ulC.A01).A07;
                break;
            case 3:
                tpO = ((C15286UZq) ulC.A01).A06;
                break;
            case 4:
                tpO = ((C15358UbA) ulC.A01).A03;
                break;
            default:
                return;
        }
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj BPf = r5.BPf();
        0qQ.A0B(BPf, 0);
        if (BPf.CeS()) {
            tpO.A0D.EHL();
        }
    }

    public void A0J(ExploreTopicCluster exploreTopicCluster) {
    }

    public void A0K(ExploreTopicCluster exploreTopicCluster) {
    }

    public void A0L(ExploreTopicCluster exploreTopicCluster, boolean z) {
    }

    public void A0M(ExploreTopicCluster exploreTopicCluster, boolean z) {
    }

    public void A0N(Integer num, String str, String str2, int i, boolean z) {
    }

    public void DJ3(1Xj r6) {
        C15942UlC ulC = (C15942UlC) this;
        if (1 - ulC.A00 == 0) {
            0qQ.A0B(r6, 0);
            C15381Ube ube = (C15381Ube) ulC.A01;
            C46498Dg1 dg1 = new C46498Dg1(ube.requireContext(), AnonymousClass7TE.A0l(ube.A0i));
            dg1.A04(new WBG(38, ube, r6), 2131975876);
            new C49945FFy(dg1).A05(ube.requireContext());
        }
    }

    public /* synthetic */ void DK3(1Xj r1) {
    }

    public /* synthetic */ void DK6(1Xj r1) {
    }

    public /* synthetic */ void DQR(1Xj r1, Integer num, int i, int i2) {
    }

    public /* synthetic */ void DQT(1Xj r1, Integer num, int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r0 = "peekMediaController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r1 = r6.A01;
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r1 = r1 * 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r2.Dsa(r4, r5, r7, r1 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean DQs(android.view.MotionEvent r4, android.view.View r5, X.C296995qz r6, X.1Xj r7) {
        /*
            r3 = this;
            r1 = r3
            X.UlC r1 = (X.C15942UlC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x002f;
                case 2: goto L_0x0048;
                case 3: goto L_0x0016;
                case 4: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            X.C51974G9v.A1O(r7, r6, r5, r4)
            java.lang.Object r0 = r1.A01
            X.UbA r0 = (X.C15358UbA) r0
            X.2uE r2 = r0.A07
            if (r2 != 0) goto L_0x004e
            goto L_0x003e
        L_0x0016:
            X.C51974G9v.A1O(r7, r6, r5, r4)
            java.lang.Object r0 = r1.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.2uG r2 = r0.A09
            if (r2 != 0) goto L_0x0024
            java.lang.String r0 = "previewMediaController"
            goto L_0x0040
        L_0x0024:
            int r0 = r6.A01
            int r1 = r6.A00
            int r0 = r0 * 3
            int r0 = r0 + r1
            r2.Dsa(r4, r5, r7, r0)
            goto L_0x0008
        L_0x002f:
            X.C51974G9v.A1O(r7, r6, r5, r4)
            java.lang.Object r2 = r1.A01
            X.Ube r2 = (X.C15381Ube) r2
            int r1 = r6.A01
            int r0 = r6.A00
            X.2uE r2 = r2.A0C
            if (r2 != 0) goto L_0x0052
        L_0x003e:
            java.lang.String r0 = "peekMediaController"
        L_0x0040:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0048:
            java.lang.Object r0 = r1.A01
            X.Ub9 r0 = (X.C15357Ub9) r0
            X.2uE r2 = r0.A0A
        L_0x004e:
            int r1 = r6.A01
            int r0 = r6.A00
        L_0x0052:
            int r1 = r1 * 3
            goto L_0x0061
        L_0x0055:
            java.lang.Object r0 = r1.A01
            X.Ugy r0 = (X.C15693Ugy) r0
            X.2uE r2 = r0.A07
            int r0 = r6.A01
            int r1 = r0 * 3
            int r0 = r6.A00
        L_0x0061:
            int r1 = r1 + r0
            r2.Dsa(r4, r5, r7, r1)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW4.DQs(android.view.MotionEvent, android.view.View, X.5qz, X.1Xj):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015f, code lost:
        r8 = "clipsUnitController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b2, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0220, code lost:
        r5.A1c = false;
        r6.A00(r5, r0, false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0227, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C296995qz r26, X.C67362Mme r27, X.C296925qs r28) {
        /*
            r25 = this;
            r3 = r25
            X.UlC r3 = (X.C15942UlC) r3
            int r2 = r3.A00
            r1 = r26
            r0 = r28
            switch(r2) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x0162;
                case 2: goto L_0x000e;
                case 3: goto L_0x008c;
                case 4: goto L_0x0031;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r7 = r3.A01
            X.Ub9 r7 = (X.C15357Ub9) r7
            X.VhB r4 = r7.A0C
            X.1Xj r3 = r0.BPf()
            int r2 = r1.A01
            int r1 = r1.A00
            r4.A00(r3, r2, r1)
            X.GXC r6 = r7.A05
            com.instagram.common.session.UserSession r2 = r7.A02
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.LOCATION
            X.4h3 r5 = new X.4h3
            r5.<init>(r1, r2)
            java.lang.String r1 = r7.A0J
            X.C13991Tnr.A1D(r5, r0, r1)
            goto L_0x0220
        L_0x0031:
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r0, r1)
            java.lang.Object r7 = r3.A01
            X.UbA r7 = (X.C15358UbA) r7
            X.0hq r2 = r7.getParentFragmentManager()
            boolean r2 = X.AnonymousClass06S.A01(r2)
            if (r2 == 0) goto L_0x000d
            X.1Xj r2 = r0.BPf()
            X.C15358UbA.A01(r1, r0, r2, r7)
            java.lang.String r10 = r7.A0F
            if (r10 != 0) goto L_0x0053
            java.lang.String r8 = "searchSessionId"
            goto L_0x01b2
        L_0x0053:
            java.lang.String r11 = r7.A0E
            com.instagram.model.keyword.Keyword r1 = r7.A08
            java.lang.String r8 = "surfaceKeyword"
            if (r1 == 0) goto L_0x01b2
            java.lang.String r12 = r1.A04
            r13 = 0
            com.instagram.search.common.analytics.SearchContext r9 = new com.instagram.search.common.analytics.SearchContext
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.GXC r6 = r7.A01
            if (r6 == 0) goto L_0x015f
            X.0eM r1 = r7.A0N
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.KEYWORD
            X.4h3 r2 = new X.4h3
            r2.<init>(r1, r3)
            r2.A1c = r5
            com.instagram.model.keyword.Keyword r1 = r7.A08
            if (r1 == 0) goto L_0x01b2
            java.lang.String r1 = r1.A04
            X.C13991Tnr.A1D(r2, r0, r1)
            r2.A03(r9)
            r6.A00(r2, r0, r4, r5)
            return
        L_0x008c:
            X.AnonymousClass7TG.A1N(r0, r1)
            java.lang.Object r7 = r3.A01
            X.UZq r7 = (X.C15286UZq) r7
            boolean r2 = r7 instanceof X.C16209UqY
            if (r2 == 0) goto L_0x0101
            r13 = 0
            r15 = 1
            X.0hq r2 = r7.getParentFragmentManager()
            boolean r2 = X.AnonymousClass06S.A01(r2)
            if (r2 == 0) goto L_0x000d
            X.1Xj r6 = r0.BPf()
            r7.A0A(r1, r0, r6)
            int r2 = r1.A01
            int r0 = r1.A00
            int r12 = r2 * 3
            int r12 = r12 + r0
            X.0eM r2 = r7.A0m
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.SERP_REELS_SUBTAB
            X.4h3 r4 = new X.4h3
            r4.<init>(r0, r1)
            r4.A1O = r15
            java.lang.String r17 = X.C13988Tno.A0a(r7)
            java.lang.String r18 = X.C13988Tno.A0Y(r7)
            java.lang.String r19 = X.C13988Tno.A0X(r7)
            r8 = 0
            java.lang.String r21 = X.C13988Tno.A0Z(r7)
            X.N4N r0 = X.C13989Tnp.A0b(r7)
            java.lang.String r1 = r0.A0G
            com.instagram.search.common.analytics.SearchContext r0 = new com.instagram.search.common.analytics.SearchContext
            r20 = r8
            r22 = r8
            r23 = r1
            r24 = r8
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A03(r0)
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r9 = X.C13988Tno.A0X(r7)
            java.lang.String r10 = X.C13988Tno.A0a(r7)
            r11 = r8
            r14 = r13
            r16 = r13
            X.I6Y.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0101:
            r4 = 0
            r3 = 1
            X.0hq r2 = r7.getParentFragmentManager()
            boolean r2 = X.AnonymousClass06S.A01(r2)
            if (r2 == 0) goto L_0x000d
            X.1Xj r2 = r0.BPf()
            r7.A0A(r1, r0, r2)
            java.lang.String r9 = X.C13988Tno.A0a(r7)
            java.lang.String r10 = X.C13988Tno.A0Y(r7)
            java.lang.String r11 = X.C13988Tno.A0X(r7)
            X.N4N r1 = X.C13989Tnp.A0b(r7)
            java.lang.String r15 = r1.A0G
            java.lang.String r13 = X.C13988Tno.A0Z(r7)
            r12 = 0
            com.instagram.search.common.analytics.SearchContext r8 = new com.instagram.search.common.analytics.SearchContext
            r14 = r12
            r16 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.N4N r1 = X.C13989Tnp.A0b(r7)
            boolean r1 = r1.A0M
            if (r1 == 0) goto L_0x015c
            com.instagram.clips.intf.ClipsViewerSource r6 = com.instagram.clips.intf.ClipsViewerSource.SERP_TOP_MIXED_CONTENT_MINOR_UNIT
        L_0x013d:
            X.GXC r5 = r7.A04
            if (r5 == 0) goto L_0x015f
            X.0eM r1 = r7.A0m
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.4h3 r2 = new X.4h3
            r2.<init>(r6, r1)
            r2.A1c = r4
            java.lang.String r1 = X.C13988Tno.A0X(r7)
            X.C13991Tnr.A1D(r2, r0, r1)
            r2.A03(r8)
            r5.A00(r2, r0, r3, r4)
            return
        L_0x015c:
            com.instagram.clips.intf.ClipsViewerSource r6 = com.instagram.clips.intf.ClipsViewerSource.SERP_TOP_MINOR_UNIT
            goto L_0x013d
        L_0x015f:
            java.lang.String r8 = "clipsUnitController"
            goto L_0x01b2
        L_0x0162:
            X.AnonymousClass7TG.A1N(r0, r1)
            java.lang.Object r7 = r3.A01
            X.Ube r7 = (X.C15381Ube) r7
            r5 = 0
            boolean r2 = r7.isResumed()
            if (r2 == 0) goto L_0x000d
            X.GXC r2 = r7.A05
            if (r2 != 0) goto L_0x018b
            java.lang.String r11 = r7.A0g
            X.0eM r2 = r7.A0i
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r8 = r7.requireActivity()
            r10 = 0
            X.GXC r6 = new X.GXC
            r6.<init>(r7, r8, r9, r10, r11)
            r7.A05 = r6
            r7.registerLifecycleListener(r6)
        L_0x018b:
            X.GXC r6 = r7.A05
            if (r6 == 0) goto L_0x01ac
            X.0eM r2 = r7.A0i
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.HASHTAG
            X.4h3 r3 = new X.4h3
            r3.<init>(r2, r4)
            X.Vt4 r2 = X.C15381Ube.A01(r7)
            com.instagram.model.hashtag.Hashtag r2 = r2.A01
            java.lang.String r2 = r2.getName()
            X.C13991Tnr.A1D(r3, r0, r2)
            r6.A00(r3, r0, r5, r5)
        L_0x01ac:
            X.VZZ r4 = r7.A0D
            if (r4 != 0) goto L_0x0228
            java.lang.String r8 = "gridAnalyticsDelegate"
        L_0x01b2:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01ba:
            java.lang.Object r4 = r3.A01
            X.Ugy r4 = (X.C15693Ugy) r4
            X.4DH r8 = r4.A0H
            boolean r1 = r8.isResumed()
            if (r1 == 0) goto L_0x000d
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r5 = r4.A0J
            X.5oy r3 = r0.A01
            X.4bN r1 = r3.A00()
            java.lang.String r7 = r1.getId()
            X.W3Q r2 = X.Dba.A0F(r5)
            com.instagram.discovery.mediamap.model.MediaMapPin r6 = r5.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r5 = r5.A02
            java.lang.String r1 = "instagram_map_location_detail_tap_feed_media"
            X.1Ln r2 = X.W3Q.A01(r2, r1)
            X.C13990Tnq.A12(r2, r5)
            X.W3Q.A05(r2, r6)
            java.lang.String r1 = "media_id"
            r2.A0R(r1, r7)
            r2.Cgf()
            X.GXC r1 = r4.A01
            if (r1 != 0) goto L_0x0203
            java.lang.String r12 = r4.A0K
            com.instagram.common.session.UserSession r10 = r4.A0I
            androidx.fragment.app.FragmentActivity r9 = r4.A0G
            r11 = 0
            X.GXC r7 = new X.GXC
            r7.<init>(r8, r9, r10, r11, r12)
            r4.A01 = r7
            r8.registerLifecycleListener(r7)
        L_0x0203:
            X.GXC r6 = r4.A01
            com.instagram.common.session.UserSession r2 = r4.A0I
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.LOCATION
            X.4h3 r5 = new X.4h3
            r5.<init>(r1, r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r4.A02
            java.lang.String r1 = X.C18231Vnv.A01(r1)
            r5.A1B = r1
            X.4bN r1 = r3.A00()
            java.lang.String r1 = r1.getId()
            r5.A1C = r1
        L_0x0220:
            r2 = 0
            r5.A1c = r2
            r1 = 1
            r6.A00(r5, r0, r2, r1)
            return
        L_0x0228:
            X.5oy r9 = r0.A01
            int r8 = r1.A01
            int r7 = r1.A00
            X.0iw r2 = r4.A01
            X.0xF r5 = r4.A00
            java.lang.String r3 = r4.A04
            r0 = 80
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.4bN r0 = r9.A00()
            X.1Xj r6 = r0.A02
            X.0xI r2 = X.0xI.A00(r2, r1)
            if (r6 == 0) goto L_0x0296
            java.lang.String r1 = r9.A0A
            java.lang.String r0 = "id"
            r2.A0C(r0, r1)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "m_pk"
            r2.A0C(r0, r1)
            java.lang.String r1 = X.C320166rs.A01(r8, r7)
            java.lang.String r0 = "position"
            r2.A0C(r0, r1)
            X.1iA r0 = r6.BR7()
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_type"
            r2.A08(r1, r0)
            r0 = 24
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "type"
            r2.A0B(r0, r1)
            X.1Xy r0 = r6.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            if (r1 == 0) goto L_0x0286
            r2.A0C(r0, r1)
        L_0x0286:
            if (r3 == 0) goto L_0x0293
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0293
            X.0j9 r0 = X.C271774jZ.A7x
            r2.A07(r0, r3)
        L_0x0293:
            r2.A04(r5)
        L_0x0296:
            X.X6c r0 = r4.A03
            X.Uz8 r1 = r0.C3h()
            int r0 = r0.C3k()
            X.C18766W0k.A02(r2, r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.DbU.A1R(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW4.A0H(X.5qz, X.Mme, X.5qs):void");
    }

    public /* synthetic */ boolean BVc() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.339] */
    public AnonymousClass339 CGA() {
        return new Object();
    }

    public void A0G(View view, C296995qz r2, HAS has) {
    }
}
