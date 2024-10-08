package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

public final class GF7 implements JQ0, JQV {
    public 0sI A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final SearchContext A03;
    public final GDG A04;
    public final C55684Hlh A05;
    public final /* synthetic */ GFF A06 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0182, code lost:
        if (r3.A02 == null) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIp(X.C267324bN r43, X.C52058GDe r44, X.1Xj r45, boolean r46) {
        /*
            r42 = this;
            r13 = 0
            r3 = r43
            r5 = r44
            boolean r34 = X.AnonymousClass7TF.A1U(r13, r3, r5)
            r16 = 2
            r4 = r45
            r0 = r16
            X.0qQ.A0B(r4, r0)
            X.3W1 r7 = r5.A0E
            r41 = r42
            r37 = r46
            if (r7 == 0) goto L_0x0034
            r0 = r41
            com.instagram.common.session.UserSession r6 = r0.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322297904179255(0x810af000012837, double:3.033705680532569E-306)
            boolean r40 = X.182.A06(r2, r6, r0)
            r36 = 0
            r35 = r7
            r38 = r13
            r39 = r34
            r35.A0J(r36, r37, r38, r39, r40)
        L_0x0034:
            r0 = r41
            X.GDG r6 = r0.A04
            if (r46 == 0) goto L_0x0186
            X.3Yl r0 = X.C243363Yl.LIKED
            r8 = r0
            X.3Yl r7 = X.C243363Yl.NOT_LIKED
        L_0x003f:
            X.GDF r2 = r6.A08
            int r14 = r5.A09()
            X.ISp r20 = new X.ISp
            r21 = r34
            r22 = r3
            r23 = r4
            r24 = r6
            r25 = r37
            r20.<init>(r21, r22, r23, r24, r25)
            com.instagram.common.session.UserSession r1 = r2.A02
            X.C54994HaR.A00(r1, r0, r7, r4)
            X.7kd r12 = r2.A00
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r9 = "button"
            boolean r11 = X.AnonymousClass7TF.A1W(r7, r8)
            X.0iw r0 = r2.A01
            X.A7L r11 = X.C297085r9.A02(r0, r4, r10, r9, r11)
            r12.A01(r11)
            android.content.Context r17 = X.C51966G9m.A0P(r1)
            r29 = 0
            java.lang.Integer r25 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r26 = X.C51967G9n.A0j()
            com.instagram.search.common.analytics.SearchContext r12 = r2.A03
            java.lang.Long r11 = r2.A05
            java.lang.String r2 = r2.A06
            r24 = r10
            r27 = r26
            r28 = r11
            r30 = r2
            r31 = r29
            r32 = r13
            r33 = r13
            r18 = r0
            r19 = r1
            r21 = r7
            r22 = r4
            r23 = r12
            X.C56622I4z.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.4DU r11 = r6.A03
            com.instagram.common.session.UserSession r2 = r6.A02
            X.Hlh r12 = r6.A09
            java.lang.String r12 = r12.A00
            r19 = r12
            java.lang.String r12 = r6.A0B
            r18 = r12
            java.lang.String r12 = r6.A0C
            r17 = r12
            java.lang.String r15 = r6.A0D
            X.GF2 r12 = r6.A0A
            X.1DQ r12 = r12.A01
            X.3aT r12 = r12.A00(r4)
            java.lang.Double r14 = r12.A0B
            boolean r12 = r3.CcK()
            if (r12 == 0) goto L_0x0180
            r3.A06()
        L_0x00c2:
            if (r7 != r8) goto L_0x017c
            java.lang.String r12 = "like"
        L_0x00c6:
            X.3sc r13 = X.C52086GEg.A01(r3, r2, r11, r12)
            if (r13 == 0) goto L_0x00e8
            r12 = r19
            r13.A6L = r12
            r13.A6y = r9
            r9 = r18
            r13.A6W = r9
            r9 = r17
            r13.A6Y = r9
            r13.A6r = r15
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r9 = r3.A00()
            r13.A0D(r9)
            r13.A2Q = r14
            X.C233822wX.A0I(r2, r13, r11, r10)
        L_0x00e8:
            if (r7 != r8) goto L_0x00f1
            X.4h9 r10 = r6.A00
            X.2v9 r9 = X.C233162v9.LIKE_CLICK
            X.C51966G9m.A1O(r10, r9, r3, r5)
        L_0x00f1:
            if (r46 != 0) goto L_0x00fc
            X.JU5 r12 = r6.A04
            X.4Cq r10 = r12.A0N
            r9 = r16
            X.C51971G9r.A1P(r12, r10, r9)
        L_0x00fc:
            if (r7 != r8) goto L_0x0156
            com.instagram.api.schemas.MusicPageTabType r7 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r10 = X.GLB.A00(r7, r1)
            X.1sQ r9 = X.C51966G9m.A0n(r4)
            java.lang.String r8 = r0.getModuleName()
            java.lang.String r7 = "like_reels"
            r10.A01(r9, r1, r7, r8)
            X.G9w.A1J(r0, r1, r4, r7)
            X.GDa r5 = r5.A0F
            boolean r0 = r4.A4Q()
            if (r0 != 0) goto L_0x0160
            boolean r0 = X.GQ3.A00(r2, r5)
            if (r0 == 0) goto L_0x0160
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320236319875190(0x81091000012076, double:3.032401926317345E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x0160
            X.GJU r1 = X.GJU.HIGHLIGHT_CTA
        L_0x0131:
            if (r5 == 0) goto L_0x0156
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.Hq8 r0 = (X.C55944Hq8) r0
            if (r0 == 0) goto L_0x0156
            X.GIx r29 = r0.A00(r1)
            X.93U r0 = r6.A06
            java.lang.String r33 = r0.CFD()
            java.lang.String r32 = "like"
            r26 = r3
            r27 = r2
            r28 = r11
            r30 = r5
            r31 = r1
            X.C55259Heo.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0156:
            X.GNk r2 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r1 = X.C52317GNj.A0M
            r0 = r41
            r0.CIR(r3, r2, r1)
            return
        L_0x0160:
            boolean r0 = r4.A4Q()
            if (r0 != 0) goto L_0x0156
            boolean r0 = X.GQ3.A00(r2, r5)
            if (r0 == 0) goto L_0x0156
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320236320333949(0x8109100008207d, double:3.032401926607466E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0156
            X.GJU r1 = X.GJU.MID_SCENE
            goto L_0x0131
        L_0x017c:
            java.lang.String r12 = "unlike"
            goto L_0x00c6
        L_0x0180:
            X.1Xj r12 = r3.A02
            if (r12 != 0) goto L_0x00c2
            goto L_0x00e8
        L_0x0186:
            X.3Yl r0 = X.C243363Yl.NOT_LIKED
            X.3Yl r7 = X.C243363Yl.LIKED
            r8 = r7
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GF7.CIp(X.4bN, X.GDe, X.1Xj, boolean):void");
    }

    public final void CIq(View view, C267324bN r11, C52058GDe gDe, 1Xj r13, int i) {
        C267324bN r4 = r11;
        C52058GDe gDe2 = gDe;
        1Xj r6 = r13;
        AnonymousClass7TG.A1T(r11, gDe, r13);
        0sI r3 = this.A00;
        if (r3 != null) {
            r3.invoke(r4, gDe2, r6, Integer.valueOf(i), view);
            AnonymousClass4DU r32 = this.A02;
            C52086GEg.A0U(r11, this.A01, r32, this.A03, this.A05.A00);
        }
    }

    public final void ER2(0sK r2) {
        0qQ.A0B(r2, 0);
        this.A06.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.GFF] */
    public GF7(UserSession userSession, AnonymousClass4DU r3, SearchContext searchContext, GDG gdg, C55684Hlh hlh) {
        this.A01 = userSession;
        this.A04 = gdg;
        this.A02 = r3;
        this.A03 = searchContext;
        this.A05 = hlh;
    }

    public final void CIR(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        DbY.A1S(gNk, gNj);
        this.A06.CIR(r2, gNk, gNj);
    }

    public final void EbR(0sI r1) {
        this.A00 = r1;
    }
}
