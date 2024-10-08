package X;

import com.instagram.common.session.UserSession;

public final class GEH extends C247303g7 {
    public final UserSession A00;
    public final GGT A01;
    public final GEL A02;
    public final H28 A03;
    public final C55269Hey A04;
    public final GEZ A05;
    public final GEI A06;

    public /* synthetic */ GEH(UserSession userSession, GGT ggt, GEL gel, H28 h28, C55269Hey hey, GEZ gez) {
        GEI gei = new GEI();
        C51974G9v.A1S(ggt, gel, gez, h28, hey);
        this.A00 = userSession;
        this.A01 = ggt;
        this.A02 = gel;
        this.A05 = gez;
        this.A03 = h28;
        this.A04 = hey;
        this.A06 = gei;
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [java.lang.Object, X.Hex] */
    /* JADX WARNING: type inference failed for: r15v4, types: [java.lang.Object, X.Hex] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r20v6, types: [X.GIo] */
    /* JADX WARNING: type inference failed for: r20v7, types: [X.Gas] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        if (X.C52368GPp.A00(r3) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.GKJ A05(X.GEG r32, com.instagram.clips.intf.ClipsViewerConfig r33, X.C267324bN r34, X.C52058GDe r35, com.instagram.music.common.model.MusicAssetModel r36, int r37, boolean r38, boolean r39, boolean r40) {
        /*
            r31 = this;
            r26 = r36
            r15 = 0
            r11 = 1
            r0 = r34
            X.1Xj r5 = r0.A02
            r4 = r31
            if (r5 == 0) goto L_0x028a
            X.GEI r3 = r4.A06
            com.instagram.common.session.UserSession r2 = r4.A00
            X.0wX r1 = r2.A03
            android.content.Context r1 = r1.A06()
            boolean r8 = r3.A00(r1, r2, r5)
        L_0x001a:
            r10 = r32
            X.GJ5 r12 = r10.A00
            X.GJ5 r1 = X.GJ5.AD
            r19 = 0
            if (r12 == r1) goto L_0x002e
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.A6M()
            if (r1 != r11) goto L_0x0030
        L_0x002e:
            r19 = 1
        L_0x0030:
            boolean r17 = r0.CcK()
            X.GGT r7 = r4.A01
            if (r17 != 0) goto L_0x003a
            r26 = 0
        L_0x003a:
            com.instagram.common.session.UserSession r3 = r7.A00
            boolean r2 = X.GEK.A05(r0, r3)
            r5 = 0
            r1 = r35
            if (r2 != 0) goto L_0x0287
            boolean r2 = X.GEK.A06(r0, r3)
            if (r2 != 0) goto L_0x0287
            boolean r2 = r10.A06
            if (r2 != 0) goto L_0x0057
            X.3W1 r2 = r1.A0E
            if (r2 == 0) goto L_0x0283
            boolean r2 = r2.A1q
            if (r2 != r11) goto L_0x0283
        L_0x0057:
            r3 = 1
        L_0x0058:
            X.1Xj r9 = r0.A02
            if (r9 == 0) goto L_0x0061
            X.3W1 r2 = r1.A0E
            if (r2 == 0) goto L_0x0061
            r5 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x027f
            if (r5 == 0) goto L_0x027f
            java.lang.String r2 = "Required value was null."
            if (r9 == 0) goto L_0x02b6
            X.GGM r3 = r7.A05
            X.3W1 r5 = r1.A0E
            if (r5 == 0) goto L_0x02b0
            java.util.List r16 = r3.A05(r0, r9, r5)
            X.GGK r2 = r7.A03
            X.GIl r6 = X.C52194GIl.A00
            r3 = r16
            boolean r3 = r3.contains(r6)
            r3 = r3 ^ 1
            X.1Xj r6 = r0.A02
            if (r6 != 0) goto L_0x023b
            X.GLz r6 = X.C52283GLz.A00
        L_0x0085:
            r23 = r37
            if (r17 == 0) goto L_0x01d3
            X.GGL r3 = r7.A04
            boolean r2 = r10.A0E
            r20 = r3
            r21 = r0
            r22 = r1
            r24 = r2
            r25 = r8
            X.JMj r28 = r20.A05(r21, r22, r23, r24, r25)
            X.GGR r3 = r7.A06
            boolean r2 = r0.CcK()
            if (r2 == 0) goto L_0x01cf
            com.instagram.common.session.UserSession r3 = r3.A00
            boolean r2 = X.GH7.A00(r0, r3)
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r1.A0c
            if (r2 == 0) goto L_0x00b6
            boolean r3 = X.C52368GPp.A00(r3)
            r2 = 1
            if (r3 != 0) goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            X.Gar r8 = new X.Gar
            r8.<init>(r0, r1, r2)
        L_0x00bc:
            X.GGS r3 = r7.A02
            boolean r2 = r0.CcK()
            if (r2 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r7 = r3.A00
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x0157
            X.1Xy r2 = r2.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r2 = r2.AcH()
            if (r2 == 0) goto L_0x0157
            java.lang.String r2 = r2.BXF()
            if (r2 == 0) goto L_0x0157
            X.HKH r3 = X.HKH.A00
        L_0x00da:
            X.JMh r3 = (X.C59509JMh) r3
            X.Gas r2 = new X.Gas
            r20 = r2
            r21 = r10
            r22 = r0
            r23 = r1
            r24 = r9
            r25 = r5
            r26 = r3
            r27 = r6
            r29 = r8
            r30 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x00f5:
            X.JMf r2 = (X.C59507JMf) r2
        L_0x00f7:
            if (r12 == 0) goto L_0x014f
            boolean r3 = r0.CcK()
            if (r3 == 0) goto L_0x0152
            X.3OA r3 = r0.A06()
            java.util.List r3 = r3.A04()
            if (r3 == 0) goto L_0x014f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x014f
            int r3 = r12.ordinal()
            if (r3 == r15) goto L_0x0149
            if (r3 == r11) goto L_0x0146
            X.GKe r5 = X.C52237GKe.A00
        L_0x0119:
            X.JMz r5 = (X.C59527JMz) r5
        L_0x011b:
            X.GEL r3 = r4.A02
            r14 = r33
            if (r17 == 0) goto L_0x028d
            r12 = r3
            r13 = r10
            r15 = r0
            r16 = r1
            r17 = r2
            X.JMm r14 = r12.A05(r13, r14, r15, r16, r17)
            X.GEZ r3 = r4.A05
            X.JN0 r17 = r3.A05(r1)
            X.Hex r15 = new X.Hex
            r15.<init>()
            X.GKJ r9 = new X.GKJ
            r20 = r40
            r18 = r11
            r11 = r0
            r12 = r1
            r13 = r2
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x0146:
            X.IeI r5 = X.C57653IeI.A00
            goto L_0x0119
        L_0x0149:
            X.Gqx r5 = new X.Gqx
            r5.<init>()
            goto L_0x0119
        L_0x014f:
            X.GKe r5 = X.C52237GKe.A00
            goto L_0x0154
        L_0x0152:
            X.IeI r5 = X.C57653IeI.A00
        L_0x0154:
            X.JMz r5 = (X.C59527JMz) r5
            goto L_0x011b
        L_0x0157:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x016d
            X.1Xy r2 = r2.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r2 = r2.AcH()
            if (r2 == 0) goto L_0x016d
            java.lang.String r2 = r2.BHr()
            if (r2 == 0) goto L_0x016d
            X.HKG r3 = X.HKG.A00
            goto L_0x00da
        L_0x016d:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x0196
            X.1Xy r2 = r2.A0C
            X.41Z r2 = r2.BUC()
            if (r2 == 0) goto L_0x0196
            X.4hQ r2 = r2.B7C()
            if (r2 == 0) goto L_0x0196
            java.lang.String r2 = r2.AyB()
            if (r2 == 0) goto L_0x0196
            X.0Tu r13 = X.0Tu.A06
            r2 = 36326171964618308(0x810e7600003644, double:3.0361556519538156E-306)
            boolean r2 = X.182.A06(r13, r7, r2)
            if (r2 == 0) goto L_0x0196
            X.Ie0 r3 = X.C57635Ie0.A00
            goto L_0x00da
        L_0x0196:
            boolean r2 = r0.CcK()
            if (r2 == 0) goto L_0x01cb
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x01cb
            X.1Xy r2 = r2.A0C
            X.41Z r2 = r2.BUC()
            if (r2 == 0) goto L_0x01cb
            X.4hQ r2 = r2.B7C()
            if (r2 == 0) goto L_0x01cb
            com.instagram.sponsored.signals.model.AdsRatingInfoIntf r2 = r2.Aa4()
            if (r2 == 0) goto L_0x01cb
            java.lang.String r2 = r2.AyC()
            if (r2 == 0) goto L_0x01cb
            X.0Tu r13 = X.0Tu.A06
            r2 = 36326171964683845(0x810e7600013645, double:3.0361556519952615E-306)
            boolean r2 = X.182.A06(r13, r7, r2)
            if (r2 == 0) goto L_0x01cb
            X.Ie1 r3 = X.C57636Ie1.A00
            goto L_0x00da
        L_0x01cb:
            X.Ie2 r3 = X.C57637Ie2.A00
            goto L_0x00da
        L_0x01cf:
            X.Ie6 r8 = X.C57641Ie6.A00
            goto L_0x00bc
        L_0x01d3:
            X.GGJ r3 = r7.A01
            boolean r2 = r0.CcK()
            if (r2 == 0) goto L_0x0220
            X.3OA r2 = r0.A06()
            X.1Xj r2 = r2.A0K
            boolean r2 = r2.A5n()
            if (r2 != 0) goto L_0x0238
            com.instagram.common.session.UserSession r2 = r3.A00
            boolean r13 = X.AnonymousClass3ZJ.A09(r0, r2)
            r2 = 1
        L_0x01ee:
            X.Gqs r3 = new X.Gqs
            r3.<init>(r0, r5, r2, r13)
        L_0x01f3:
            X.GGL r7 = r7.A04
            boolean r2 = r10.A0E
            r20 = r7
            r21 = r0
            r22 = r1
            r24 = r2
            r25 = r8
            X.JMj r28 = r20.A05(r21, r22, r23, r24, r25)
            X.GIo r2 = new X.GIo
            r20 = r2
            r21 = r10
            r22 = r0
            r23 = r1
            r24 = r9
            r25 = r5
            r26 = r3
            r27 = r6
            r29 = r16
            r30 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x00f5
        L_0x0220:
            com.instagram.common.session.UserSession r14 = r3.A00
            X.0qQ.A0B(r14, r15)
            X.0Tu r13 = X.0Tu.A05
            r2 = 36321254227256522(0x8109fd000324ca, double:3.033045655044083E-306)
            boolean r2 = X.182.A06(r13, r14, r2)
            if (r2 == 0) goto L_0x0238
            boolean r13 = X.AnonymousClass3ZJ.A09(r0, r14)
            r2 = 0
            goto L_0x01ee
        L_0x0238:
            X.GK3 r3 = X.GK3.A00
            goto L_0x01f3
        L_0x023b:
            com.instagram.common.session.UserSession r2 = r2.A00
            boolean r13 = X.AnonymousClass3ZJ.A0D(r2, r6)
            if (r13 == 0) goto L_0x024c
            X.Gqt r6 = new X.Gqt
            r6.<init>(r0, r1)
        L_0x0248:
            X.JMi r6 = (X.C59510JMi) r6
            goto L_0x0085
        L_0x024c:
            if (r39 == 0) goto L_0x027c
            boolean r13 = r10.A0E
            if (r13 == 0) goto L_0x027c
            boolean r13 = r0.CcK()
            if (r13 == 0) goto L_0x025e
            X.Gqu r6 = new X.Gqu
            r6.<init>(r0, r1, r8, r3)
            goto L_0x0248
        L_0x025e:
            X.GIT r20 = X.GIT.A00
            X.0wX r13 = r2.A03
            android.content.Context r21 = r13.A06()
            X.1Xy r13 = r6.A0C
            X.1sQ r23 = r13.getClipsMetadata()
            r22 = r0
            r24 = r2
            r25 = r6
            X.4Ke r2 = r20.A02(r21, r22, r23, r24, r25, r26)
            X.GIs r6 = new X.GIs
            r6.<init>(r0, r1, r2, r3)
            goto L_0x0248
        L_0x027c:
            X.GLz r6 = X.C52283GLz.A00
            goto L_0x0248
        L_0x027f:
            X.GMl r2 = X.C52295GMl.A00
            goto L_0x00f7
        L_0x0283:
            if (r38 == 0) goto L_0x0287
            goto L_0x0057
        L_0x0287:
            r3 = 0
            goto L_0x0058
        L_0x028a:
            r8 = 0
            goto L_0x001a
        L_0x028d:
            r12 = r3
            r13 = r10
            r15 = r0
            r16 = r1
            r17 = r2
            X.JMm r14 = r12.A05(r13, r14, r15, r16, r17)
            X.GEZ r3 = r4.A05
            X.JN0 r17 = r3.A05(r1)
            X.Hex r15 = new X.Hex
            r15.<init>()
            X.GKJ r9 = new X.GKJ
            r18 = r19
            r11 = r0
            r12 = r1
            r13 = r2
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
        L_0x02b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x02b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEH.A05(X.GEG, com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe, com.instagram.music.common.model.MusicAssetModel, int, boolean, boolean, boolean):X.GKJ");
    }
}
