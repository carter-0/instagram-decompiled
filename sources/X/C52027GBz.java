package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBz  reason: case insensitive filesystem */
public final class C52027GBz implements C250603lj {
    public boolean A00;
    public final long A01;
    public final UserSession A02;
    public final C52257GKy A03;

    public C52027GBz(UserSession userSession, C52257GKy gKy) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = gKy;
        this.A01 = 182.A01(0Tu.A06, userSession, 36600714867773406L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (((X.C52079GDz) r1).A02 != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r42, X.C252093oY r43) {
        /*
            r41 = this;
            r5 = 0
            r1 = r42
            r0 = r43
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            float r26 = r0.CFe(r1)
            java.lang.Integer r25 = r0.CEk(r1)
            X.0qQ.A07(r25)
            java.lang.Object r7 = r1.A03
            X.4bN r7 = (X.C267324bN) r7
            java.lang.Object r3 = r1.A04
            X.0qQ.A06(r3)
            X.GDe r3 = (X.C52058GDe) r3
            boolean r24 = r7.A0F()
            r6 = r41
            if (r24 == 0) goto L_0x0137
            com.instagram.common.session.UserSession r2 = r6.A02
            X.0Tu r9 = X.0Tu.A06
            r0 = 36319239888051235(0x810828000a1c23, double:3.031771778819567E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0137
            X.GKy r2 = r6.A03
            r23 = 3
            r22 = 2
            r0 = r23
            X.0qQ.A0B(r3, r0)
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0109
            r0 = r26
            double r0 = (double) r0
            r10 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x0109
            X.GBn r1 = r2.A03
            r0 = 0
            r1.A0O(r0)
            r2.A00 = r4
            X.GBj r11 = r2.A04
            int r12 = r11.A07()
            android.view.View r10 = r11.A0A(r12)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r1 = 0
            if (r10 == 0) goto L_0x00da
            java.lang.Object r0 = r10.getTag()
        L_0x006e:
            boolean r0 = r0 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x00cf
            if (r10 == 0) goto L_0x0078
            java.lang.Object r1 = r10.getTag()
        L_0x0078:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r1, r0)
            X.GDz r1 = (X.C52079GDz) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00cf
        L_0x0083:
            int r21 = r8.intValue()
            if (r10 == 0) goto L_0x00cd
            java.lang.Object r10 = r10.getTag()
        L_0x008d:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r10, r0)
            X.GDz r10 = (X.C52079GDz) r10
            java.lang.Integer r0 = X.C57031ILx.A01(r7)
            if (r0 == 0) goto L_0x00a6
            int r1 = r0.intValue()
            r0 = 15
            if (r1 == r0) goto L_0x00e5
            r0 = 14
            if (r1 == r0) goto L_0x00e5
        L_0x00a6:
            X.How r13 = r2.A02
            java.lang.String r15 = "message"
            java.lang.String r11 = "ClipsMultiAdsMediaPlayerController"
            r8 = 817902720(0x30c03480, float:1.398476E-9)
            if (r10 == 0) goto L_0x00dc
            X.5o2 r1 = r7.A01
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 != r0) goto L_0x00dc
            java.util.List r20 = X.C57031ILx.A02(r7)
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r20)
            java.util.Iterator r1 = r20.iterator()
        L_0x00c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ef
            X.C51972G9s.A1G(r12, r1)
            goto L_0x00c3
        L_0x00cd:
            r10 = 0
            goto L_0x008d
        L_0x00cf:
            int r0 = r12 + 1
            android.view.View r10 = r11.A0A(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0083
        L_0x00da:
            r0 = r1
            goto L_0x006e
        L_0x00dc:
            X.0wj r0 = X.0wj.A01
            X.0f9 r1 = r0.AEf(r11, r8)
            java.lang.String r0 = "failed to resume multiple players"
            goto L_0x0103
        L_0x00e5:
            X.JT5 r1 = r2.A01
            if (r1 == 0) goto L_0x0109
            r0 = r21
            r1.CNH(r7, r10, r0)
            goto L_0x0109
        L_0x00ef:
            java.util.List r1 = r10.A0B
            int r10 = r1.size()
            int r0 = r12.size()
            if (r10 == r0) goto L_0x01c6
            X.0wj r0 = X.0wj.A01
            X.0f9 r1 = r0.AEf(r11, r8)
            java.lang.String r0 = "insufficient media to bind to players"
        L_0x0103:
            r1.ABQ(r15, r0)
            r1.report()
        L_0x0109:
            int r0 = r25.intValue()
            if (r0 == r5) goto L_0x0137
            if (r0 == r4) goto L_0x01ba
            r2.A00 = r5
            java.lang.Integer r0 = X.C57031ILx.A01(r7)
            if (r0 == 0) goto L_0x0125
            int r1 = r0.intValue()
            r0 = 15
            if (r1 == r0) goto L_0x01b1
            r0 = 14
            if (r1 == r0) goto L_0x01b1
        L_0x0125:
            X.How r1 = r2.A02
            X.I5d r0 = r1.A05
            r0.A03()
            com.instagram.common.session.UserSession r0 = r1.A03
            X.1wS r1 = X.1wS.A01(r0)
            r0 = r23
            r1.A0C(r0)
        L_0x0137:
            if (r24 == 0) goto L_0x0158
            int r0 = r25.intValue()
            if (r0 == r5) goto L_0x0158
            if (r0 == r4) goto L_0x0159
            X.0eM r0 = X.C52204GIv.A02
            java.lang.Object r2 = r0.getValue()
            X.GIv r2 = (X.C52204GIv) r2
            r0 = 0
            r2.A00 = r0
            X.Gms r1 = r3.A09
            if (r1 == 0) goto L_0x0156
            r0 = -1
            r1.A00 = r0
            r1.A01 = r0
        L_0x0156:
            r6.A00 = r5
        L_0x0158:
            return
        L_0x0159:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x018e
            X.0eM r0 = X.C52204GIv.A02
            java.lang.Object r1 = r0.getValue()
            X.GIv r1 = (X.C52204GIv) r1
            java.lang.Long r0 = X.C51968G9o.A0u()
            r1.A01 = r0
            r6.A00 = r4
            com.instagram.common.session.UserSession r8 = r6.A02
            X.I2T.A00(r8)
            X.3W1 r7 = r3.A0E
            if (r7 == 0) goto L_0x018e
            X.5kj r5 = X.C293415kh.A00(r8)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36600714867576797(0x82082800350fdd, double:3.209777689280301E-306)
            long r0 = X.182.A01(r2, r8, r0)
            r5.A01(r7, r0)
        L_0x018e:
            long r5 = r6.A01
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0158
            X.3W1 r3 = r3.A0E
            if (r3 == 0) goto L_0x0158
            boolean r0 = r3.A33
            if (r0 != 0) goto L_0x0158
            X.0eM r0 = X.C52204GIv.A02
            java.lang.Object r0 = r0.getValue()
            X.GIv r0 = (X.C52204GIv) r0
            long r1 = r0.A00()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0158
            r3.A33 = r4
            return
        L_0x01b1:
            X.JT5 r0 = r2.A01
            if (r0 == 0) goto L_0x0137
            r0.ECW()
            goto L_0x0137
        L_0x01ba:
            X.GBn r1 = r2.A03
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0137
            r0 = 0
            r1.A0O(r0)
            goto L_0x0137
        L_0x01c6:
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r18 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r17 = r1.iterator()
            r11 = 0
        L_0x01d3:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x028d
            java.lang.Object r10 = r17.next()
            int r16 = r11 + 1
            if (r11 >= 0) goto L_0x01e9
            X.0sr.A1T()
        L_0x01e4:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01e9:
            X.JQR r10 = (X.JQR) r10
            com.instagram.common.session.UserSession r0 = r13.A03
            r33 = r0
            X.1se r1 = X.1sd.A00(r33)
            java.lang.Object r0 = r12.get(r11)
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r1.A05(r0)
            if (r0 != 0) goto L_0x0282
            r0 = 2342162249104825410(0x2081082800391c42, double:4.064941372395084E-152)
            r14 = r33
            boolean r0 = X.182.A06(r9, r14, r0)
            if (r0 == 0) goto L_0x0210
            boolean r0 = r10 instanceof X.C57610Idb
            if (r0 != 0) goto L_0x0282
        L_0x0210:
            android.content.Context r0 = r13.A00
            r40 = r0
            X.0iw r1 = r13.A02
            X.I5d r0 = r13.A05
            r39 = r0
            X.ILx r0 = r7.A03()
            X.9Iz r14 = r0.A01
            r0 = r20
            java.lang.Object r0 = r0.get(r11)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.4bN r30 = X.C295375o3.A01(r14, r0)
            r0 = 2
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            r0 = r1
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r34 = r0
            X.93U r0 = r13.A04
            r35 = r0
            java.lang.String r0 = r13.A07
            r37 = r0
            X.0sa r0 = r13.A08
            r38 = r0
            X.HqD r0 = r13.A06
            r28 = r0
            com.instagram.clips.intf.ClipsViewerConfig r0 = r13.A01
            r27 = r0
            r14 = r34
            r0 = r22
            X.0qQ.A0B(r14, r0)
            r14 = r38
            r0 = r28
            X.AnonymousClass7TG.A1S(r14, r0)
            X.H2j r29 = new X.H2j
            r31 = r29
            r32 = r27
            r36 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            X.Ib9 r0 = new X.Ib9
            r27 = r0
            r28 = r40
            r31 = r3
            r32 = r1
            r34 = r39
            r35 = r39
            r36 = r10
            r37 = r11
            r38 = r21
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = r19
            r1.add(r0)
        L_0x0282:
            X.0gF r1 = X.C60340gF.A00
            r0 = r18
            r0.add(r1)
            r11 = r16
            goto L_0x01d3
        L_0x028d:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0109
            com.instagram.common.session.UserSession r0 = r13.A03
            X.1wS r1 = X.1wS.A01(r0)
            r0 = 4
            r1.A0C(r0)
            X.I5d r10 = r13.A05
            r10.A03()
            java.util.Iterator r9 = r19.iterator()
        L_0x02a6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r1 = r9.next()
            java.util.List r0 = r10.A08
            r0.add(r1)
            goto L_0x02a6
        L_0x02b6:
            java.util.List r0 = r10.A08
            java.util.Iterator r14 = r0.iterator()
        L_0x02bc:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r9 = r14.next()
            X.Ib9 r9 = (X.C57465Ib9) r9
            X.JQR r12 = r9.A08
            boolean r0 = r12 instanceof X.C57611Idc
            if (r0 == 0) goto L_0x02bc
            X.Idc r12 = (X.C57611Idc) r12
            if (r12 == 0) goto L_0x02bc
            X.IbA r10 = r9.A00
            if (r10 == 0) goto L_0x0362
            X.4bN r11 = r9.A04
            int r1 = r9.A02
            X.H2j r0 = r9.A03
            X.HGu r9 = new X.HGu
            r9.<init>(r0, r11, r12, r1)
            r10.A01 = r9
            X.4bN r0 = r9.A02
            X.1Xj r13 = r0.A02
            if (r13 == 0) goto L_0x02bc
            X.Tol r1 = r10.A00
            if (r1 != 0) goto L_0x030a
            android.content.Context r12 = r10.A02
            com.instagram.common.session.UserSession r11 = r10.A06
            X.H2j r0 = r9.A01
            X.0iw r1 = r10.A05
            java.lang.String r21 = r1.getModuleName()
            X.Tol r1 = new X.Tol
            r16 = r1
            r17 = r12
            r18 = r11
            r19 = r0
            r20 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            r10.A00 = r1
        L_0x030a:
            X.Idc r12 = r9.A03     // Catch:{ 0fC -> 0x0350 }
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r12.A01     // Catch:{ 0fC -> 0x0350 }
            if (r0 == 0) goto L_0x0346
            if (r1 == 0) goto L_0x02bc
            java.lang.String r11 = r13.A0M
            X.3WR r29 = r13.A2D()
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r12.A01
            if (r0 == 0) goto L_0x0377
            r34 = -1
            r33 = 1065353216(0x3f800000, float:1.0)
            X.0iw r10 = r10.A05
            java.lang.String r32 = r10.getModuleName()
            r27 = r1
            r28 = r0
            r30 = r9
            r31 = r11
            r35 = r5
            r36 = r5
            r37 = r5
            r27.A09(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            float r9 = r9.A00
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02bc
            X.4M7 r0 = X.AnonymousClass4M7.FIT
            r1.A06(r0)
            goto L_0x02bc
        L_0x0346:
            java.lang.String r0 = "videoContainer"
            X.0qQ.A0F(r0)     // Catch:{ 0fC -> 0x0350 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ 0fC -> 0x0350 }
            throw r0     // Catch:{ 0fC -> 0x0350 }
        L_0x0350:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "ClipsMultiAdsVideoPlayer"
            X.0f9 r1 = r1.AEf(r0, r8)
            java.lang.String r0 = "failed to resume multiple players"
            r1.ABQ(r15, r0)
            r1.report()
            goto L_0x02bc
        L_0x0362:
            X.I5d r9 = r9.A06
            int r0 = r9.A01
            int r1 = r0 + 1
            r9.A01 = r1
            java.util.List r0 = r9.A08
            int r0 = r0.size()
            if (r1 != r0) goto L_0x02bc
            X.C56625I5d.A02(r9)
            goto L_0x02bc
        L_0x0377:
            java.lang.String r0 = "videoContainer"
            X.0qQ.A0F(r0)
            goto L_0x01e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52027GBz.ATF(X.30Y, X.3oY):void");
    }
}
