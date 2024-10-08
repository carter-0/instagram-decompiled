package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEt  reason: case insensitive filesystem */
public final class C52099GEt implements JTJ, JQ0 {
    public GKI A00;
    public 0sK A01;
    public final UserSession A02;
    public final C242833We A03;
    public final GGK A04;
    public final JQ0 A05;
    public final C51979GAc A06;

    public final View.OnTouchListener AdX(Context context, C267324bN r10) {
        1Xj r5;
        0qQ.A0B(r10, 0);
        if (r10.A01 == C295365o2.AD_PREVIEW || (r5 = r10.A02) == null) {
            return null;
        }
        CIR(r10, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A04);
        return new AnonymousClass532(context, this.A02, r5, AnonymousClass05K.A00, this.A06.getModuleName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r0 = r30;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIB(X.AnonymousClass8ZN r31, com.instagram.clips.intf.ClipsViewerConfig r32, X.C267324bN r33, X.C52058GDe r34) {
        /*
            r30 = this;
            r2 = 0
            r1 = r33
            X.0qQ.A0B(r1, r2)
            r4 = 1
            r6 = r31
            r5 = r32
            r8 = r34
            X.DbZ.A0t(r4, r8, r5, r6)
            X.5o2 r3 = r1.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r3 == r0) goto L_0x00e6
            r0 = r30
            X.0sK r3 = r0.A01
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r3 = r3.invoke(r1, r5, r6)
            boolean r3 = X.AnonymousClass7TE.A1a(r3)
            if (r3 != r4) goto L_0x00e6
            X.1Xj r14 = r1.A02
            if (r14 == 0) goto L_0x00e6
            X.1sQ r4 = X.C51966G9m.A0n(r14)
            if (r4 == 0) goto L_0x0086
            java.lang.Long r3 = X.C291335gz.A04(r4)
            if (r3 == 0) goto L_0x0086
            java.lang.String r20 = X.AnonymousClass7TG.A0j()
            java.lang.String r23 = X.AnonymousClass7TG.A0j()
            X.1rt r9 = r4.Adl()
            X.GAc r12 = r0.A06
            com.instagram.common.session.UserSession r13 = r0.A02
            X.HOu r10 = X.C54689HOu.A0G
            long r26 = r3.longValue()
            int r3 = r8.A09()
            long r3 = (long) r3
            X.93T r6 = r12.A03
            java.lang.String r7 = r6.A01
            java.lang.String r6 = r12.A04
            X.8ZN r11 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE
            if (r9 == 0) goto L_0x0102
            java.lang.String r24 = r9.getBestAudioClusterId()
        L_0x005f:
            com.instagram.search.common.analytics.SearchContext r15 = r5.A0S
            boolean r5 = X.AnonymousClass3ZJ.A0D(r13, r14)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            boolean r5 = X.AnonymousClass3ZJ.A0G(r14)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r5)
            boolean r5 = X.C51971G9r.A1Y(r14)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r5)
            r19 = 0
            r25 = r19
            r28 = r3
            r21 = r7
            r22 = r6
            X.C52086GEg.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
        L_0x0086:
            X.GAc r11 = r0.A06
            com.instagram.common.session.UserSession r12 = r0.A02
            X.93T r13 = r11.A03
            java.lang.String r3 = r14.A2n()
            if (r3 == 0) goto L_0x00ff
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r3)
            if (r3 == 0) goto L_0x00ff
            long r19 = r3.longValue()
        L_0x009c:
            X.DUF r3 = X.C51965G9l.A0j(r14)
            if (r3 == 0) goto L_0x00fd
            java.lang.String r3 = r3.getAttributionAppId()
            if (r3 == 0) goto L_0x00fd
            java.lang.Long r15 = X.AnonymousClass7TE.A10(r3)
        L_0x00ac:
            com.instagram.user.model.User r3 = r14.A2A(r12)
            if (r3 == 0) goto L_0x00fa
            java.lang.Long r16 = X.C51972G9s.A0h(r3)
        L_0x00b6:
            java.lang.String r17 = X.DbT.A0x(r14)
            int r18 = r8.A09()
            boolean r4 = X.AnonymousClass3ZJ.A0G(r14)
            boolean r3 = X.C51971G9r.A1Y(r14)
            if (r4 == 0) goto L_0x00f2
            if (r3 == 0) goto L_0x00ef
            X.GKd r10 = X.C52236GKd.A0D
        L_0x00cc:
            boolean r4 = X.AnonymousClass3ZJ.A0G(r14)
            boolean r3 = X.C51971G9r.A1Y(r14)
            if (r3 == 0) goto L_0x00e7
            X.5OC r9 = X.AnonymousClass5OC.AUDIO_FILTER_BUTTON
        L_0x00d8:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            X.C52086GEg.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.GNk r3 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            X.GNj r2 = X.C52317GNj.A04
            r0.CIR(r1, r3, r2)
        L_0x00e6:
            return
        L_0x00e7:
            if (r4 == 0) goto L_0x00ec
            X.5OC r9 = X.AnonymousClass5OC.AUDIO_MULTITRACK_BUTTON
            goto L_0x00d8
        L_0x00ec:
            X.5OC r9 = X.AnonymousClass5OC.ATTRIBUTE_PILLS
            goto L_0x00d8
        L_0x00ef:
            X.GKd r10 = X.C52236GKd.A0C
            goto L_0x00cc
        L_0x00f2:
            if (r3 == 0) goto L_0x00f7
            X.GKd r10 = X.C52236GKd.A09
            goto L_0x00cc
        L_0x00f7:
            X.GKd r10 = X.C52236GKd.A0B
            goto L_0x00cc
        L_0x00fa:
            r16 = 0
            goto L_0x00b6
        L_0x00fd:
            r15 = 0
            goto L_0x00ac
        L_0x00ff:
            r19 = 0
            goto L_0x009c
        L_0x0102:
            r24 = 0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52099GEt.CIB(X.8ZN, com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe):void");
    }

    public final void CIC(C267324bN r13, C52058GDe gDe, boolean z) {
        1Xj r8;
        C52236GKd gKd;
        AnonymousClass5OC r3;
        C267324bN r5 = r13;
        AnonymousClass7TG.A1O(r13, gDe);
        C242833We r1 = this.A03;
        r1.A01 = false;
        r1.A02 = null;
        if (r13.A01 != C295365o2.AD_PREVIEW && (r8 = r13.A02) != null) {
            boolean A0G = AnonymousClass3ZJ.A0G(r8);
            boolean A1Y = C51971G9r.A1Y(r8);
            if (A0G) {
                if (A1Y) {
                    gKd = C52236GKd.A0D;
                } else {
                    gKd = C52236GKd.A0C;
                }
            } else if (A1Y) {
                gKd = C52236GKd.A09;
            } else if (z) {
                gKd = C52236GKd.A0h;
            } else {
                gKd = C52236GKd.A0B;
            }
            if (gKd != C52236GKd.A0B) {
                C51979GAc gAc = this.A06;
                UserSession userSession = this.A02;
                AnonymousClass93T r9 = gAc.A03;
                int A09 = gDe.A09();
                boolean A0G2 = AnonymousClass3ZJ.A0G(r8);
                if (C51971G9r.A1Y(r8)) {
                    r3 = AnonymousClass5OC.AUDIO_FILTER_BUTTON;
                } else if (A0G2) {
                    r3 = AnonymousClass5OC.AUDIO_MULTITRACK_BUTTON;
                } else {
                    r3 = AnonymousClass5OC.ATTRIBUTE_PILLS;
                }
                C52086GEg.A06(r3, gKd, r5, gAc, userSession, r8, r9, 0, A09);
            }
        }
    }

    public final void CJH(C267324bN r13, C52058GDe gDe, int i, boolean z) {
        GKI gki;
        C267324bN r7 = r13;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TG.A1N(r13, gDe);
        1Xj r3 = r13.A02;
        if (r3 != null) {
            C51979GAc gAc = this.A06;
            UserSession userSession = this.A02;
            AnonymousClass93T r5 = gAc.A03;
            int A09 = gDe.A09();
            C52086GEg.A09(AnonymousClass5OC.ATTRIBUTE_PILLS, C52236GKd.A0B, userSession, r3, gAc, r5, A09);
            if (z && (gki = this.A00) != null) {
                gki.A00.A01(r7, gDe2, r3, gDe.A09(), !r13.CcK());
            }
        }
    }

    public final void ER2(0sK r2) {
        0qQ.A0B(r2, 0);
        this.A05.ER2(r2);
    }

    public C52099GEt(UserSession userSession, GGK ggk, JQ0 jq0, C51979GAc gAc) {
        this.A04 = ggk;
        this.A02 = userSession;
        this.A06 = gAc;
        this.A05 = jq0;
        this.A03 = (C242833We) userSession.A01(C242833We.class, new MMS(userSession, 6));
    }

    public final void CIR(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        DbY.A1S(gNk, gNj);
        this.A05.CIR(r2, gNk, gNj);
    }

    public final void Eb3(0sK r1) {
        this.A01 = r1;
    }

    public final void Eb6(GKI gki) {
        this.A00 = gki;
    }
}
