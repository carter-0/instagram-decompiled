package X;

/* renamed from: X.HVs  reason: case insensitive filesystem */
public abstract class C54861HVs {
    /* JADX WARNING: type inference failed for: r2v17, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A00(X.C307896Rx r26, X.AnonymousClass6Tm r27) {
        /*
            r7 = 0
            r8 = 1
            androidx.fragment.app.Fragment r6 = X.C308206Td.A01(r26)
            X.0lg r5 = X.C308206Td.A0B(r26)
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r16 = 0
            r0 = r27
            java.lang.Object r4 = X.DbW.A0g(r0, r7)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r3 = r0.A00
            java.lang.String r13 = X.DbU.A0t(r3, r8)
            r0 = 2
            java.lang.Object r2 = r3.get(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 3
            java.lang.Object r1 = r3.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 4
            java.lang.String r12 = X.DbU.A0t(r3, r0)
            r0 = 5
            java.lang.String r11 = X.DbU.A0t(r3, r0)
            if (r13 == 0) goto L_0x00e7
            if (r2 == 0) goto L_0x00e2
            if (r1 == 0) goto L_0x00e2
            int r19 = r2.intValue()
            int r18 = r1.intValue()
            X.0qQ.A0B(r5, r7)
            X.AnonymousClass7TF.A1B(r6, r8, r4)
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r5)
            X.0qQ.A07(r0)
            com.instagram.model.reels.Reel r10 = r0.A0M(r13)
            if (r10 == 0) goto L_0x00e2
            r0 = r19
            X.3uh r15 = r10.A0A(r5, r0)
            X.0qQ.A07(r15)
            android.view.View r14 = r6.mView
            if (r14 == 0) goto L_0x00e2
            android.content.Context r17 = r6.requireContext()
            X.1Xj r9 = r15.A0b
            if (r9 == 0) goto L_0x02a5
            X.3Dp r3 = X.C51967G9n.A0X(r5)
            X.3Ds r0 = X.C238863Ds.IG_STORY_SHOWCASE_ADS_CLICK
            r3.A05(r14, r0)
            X.2EG r27 = X.2EG.A1W
            java.lang.String r0 = r27.toString()
            X.2kQ r16 = X.C227942kP.A01(r0, r7, r8)
            X.1Xj r1 = r9.A1g(r4)
            X.6Q1 r2 = new X.6Q1
            r0 = r17
            r2.<init>(r0, r5, r1)
            X.3e7 r1 = new X.3e7
            r0 = r16
            r1.<init>(r2, r5, r9, r0)
            r3.A0A(r14, r1)
            java.lang.String[] r0 = new java.lang.String[r7]
            r3.A0B(r14, r0)
            X.5pf r20 = new X.5pf
            r24 = r11
            r25 = r19
            r26 = r18
            r21 = r5
            r22 = r10
            r23 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26)
            java.lang.String r1 = r15.A0j
            com.instagram.sponsored.analytics.SourceModelInfoParams r2 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r2.<init>()
            r2.A09 = r11
            r2.A05 = r12
            r2.A04 = r13
            r0 = r19
            r2.A01 = r0
            r0 = r18
            r2.A03 = r0
            r2.A06 = r1
            java.lang.String r0 = r27.toString()
            X.2kQ r26 = X.C227942kP.A01(r0, r7, r8)
            X.Q03 r1 = new X.Q03
            r22 = r1
            r23 = r6
            r24 = r5
            r25 = r20
            r22.<init>(r23, r24, r25, r26, r27)
            r1.A0M = r10
            r1.A02(r2)
        L_0x00db:
            r1.A0f = r4
        L_0x00dd:
            X.C51969G9p.A1L(r1)
            r16 = 1
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L_0x00e7:
            if (r12 == 0) goto L_0x01d6
            X.0qQ.A0B(r5, r7)
            X.AnonymousClass7TF.A1B(r6, r8, r4)
            android.view.View r1 = r6.mView
            if (r1 == 0) goto L_0x00e2
            X.6zi r2 = X.C324676zi.A00
            java.lang.Class<X.6zj> r0 = X.C324686zj.class
            java.lang.Object r0 = r5.A01(r0, r2)
            X.6zj r0 = (X.C324686zj) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r10 = r0.get(r12)
            X.3OA r10 = (X.AnonymousClass3OA) r10
            if (r10 == 0) goto L_0x00e2
            X.4jb r3 = new X.4jb
            r3.<init>(r5, r10)
            java.lang.String r0 = r10.A0S
            com.instagram.sponsored.analytics.SourceModelInfoParams r2 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r2.<init>(r0, r7, r7)
            android.content.Context r9 = r6.requireContext()
            X.3Dp r11 = X.C51967G9n.A0X(r5)
            X.3Ds r0 = X.C238863Ds.IG_STORY_SHOWCASE_ADS_CLICK
            r11.A05(r1, r0)
            X.T5W r12 = new X.T5W
            r12.<init>(r9, r5, r10, r4)
            X.2EG r23 = X.2EG.A1W
            java.lang.String r0 = r23.toString()
            X.2kQ r21 = X.C227942kP.A01(r0, r7, r8)
            r9 = 0
            X.GTB r0 = new X.GTB
            r19 = r9
            r20 = r5
            r22 = r10
            r17 = r0
            r18 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            r11.A0A(r1, r0)
            java.lang.String[] r0 = new java.lang.String[r7]
            r11.A0B(r1, r0)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36316216230416485(0x81056800001065, double:3.029859605556059E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r23.toString()
            X.2kQ r22 = X.C227942kP.A01(r0, r7, r8)
            X.Q03 r1 = new X.Q03
            r18 = r1
            r19 = r6
            r21 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            r1.A0O = r10
            r1.A02(r2)
            r2 = 36321761034512074(0x810a73001426ca, double:3.0333661619932434E-306)
            boolean r0 = X.182.A06(r11, r5, r2)
            if (r0 == 0) goto L_0x00db
            java.util.List r0 = r10.A0l
            if (r0 == 0) goto L_0x00db
            com.instagram.api.schemas.AdFormatType r2 = r10.A01
            com.instagram.api.schemas.AdFormatType r0 = com.instagram.api.schemas.AdFormatType.GRID
            if (r2 != r0) goto L_0x00db
            com.google.common.collect.ImmutableList r2 = r10.A01()
            r8 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            if (r2 == 0) goto L_0x01ac
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01ac
            java.util.Iterator r5 = r2.iterator()
        L_0x0196:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r3 = r5.next()
            int r2 = r8 + 1
            if (r8 >= 0) goto L_0x01b1
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01ac:
            X.0eP r2 = X.AnonymousClass7TE.A1L(r9, r6)
            goto L_0x01c3
        L_0x01b1:
            X.1Xj r3 = (X.1Xj) r3
            X.1Xy r0 = r3.A0C
            java.lang.String r0 = r0.Azc()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x01d4
            X.0eP r2 = X.AnonymousClass7TF.A0x(r3, r8)
        L_0x01c3:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x00dd
            X.1Xj r0 = (X.1Xj) r0
            r1.A01(r0)
            int r0 = X.C51969G9p.A0A(r2)
            r1.A09 = r0
            goto L_0x00dd
        L_0x01d4:
            r8 = r2
            goto L_0x0196
        L_0x01d6:
            if (r11 == 0) goto L_0x00e2
            X.0qQ.A0B(r5, r7)
            X.AnonymousClass7TF.A1B(r6, r8, r4)
            android.view.View r10 = r6.mView
            if (r10 == 0) goto L_0x00e2
            X.1Xj r9 = X.DbV.A0U(r5, r11)
            if (r9 == 0) goto L_0x00e2
            X.1Xj r0 = r9.A1c(r7)
            if (r0 == 0) goto L_0x00e2
            X.4jb r3 = new X.4jb
            r3.<init>(r5, r9)
            X.1Xy r1 = r0.A0C
            X.DUW r1 = r1.B5U()
            r11 = 0
            if (r1 == 0) goto L_0x0225
            java.util.List r1 = r1.BgQ()
            if (r1 == 0) goto L_0x0225
            java.util.Iterator r12 = r1.iterator()
        L_0x0206:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x02a2
            java.lang.Object r2 = r12.next()
            r1 = r2
            X.DTM r1 = (X.DTM) r1
            java.lang.String r1 = r1.getProductId()
            boolean r1 = X.0qQ.A0K(r1, r4)
            if (r1 == 0) goto L_0x0206
        L_0x021d:
            X.DTM r2 = (X.DTM) r2
            if (r2 == 0) goto L_0x0225
            java.util.List r11 = r2.Abc()
        L_0x0225:
            android.content.Context r1 = r6.requireContext()
            com.instagram.model.androidlink.AndroidLink r2 = X.AnonymousClass47K.A03(r1, r5, r11, r7)
            android.content.Context r13 = r6.requireContext()
            X.3Dp r11 = X.C51967G9n.A0X(r5)
            X.3Ds r1 = X.C238863Ds.IG_STORY_SHOWCASE_ADS_CLICK
            r11.A05(r10, r1)
            X.2EG r16 = X.2EG.A1W
            java.lang.String r1 = r16.toString()
            r15 = 0
            X.2kQ r12 = X.C227942kP.A01(r1, r7, r8)
            X.3W1 r1 = X.G9t.A18(r9)
            X.1Xy r0 = r0.A0C
            X.DUW r0 = r0.B5U()
            if (r0 == 0) goto L_0x02a0
            java.util.List r0 = r0.BgQ()
            if (r0 == 0) goto L_0x02a0
            java.util.Iterator r14 = r0.iterator()
        L_0x025b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02a0
            java.lang.Object r0 = r14.next()
            X.DTM r0 = (X.DTM) r0
            java.lang.String r0 = r0.getProductId()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x029d
            if (r15 < 0) goto L_0x02a0
            int r0 = r15 + 1
        L_0x0275:
            r1.A0B(r0)
            X.3e7 r0 = X.C51971G9r.A0f(r13, r1, r5, r9, r12)
            r11.A0A(r10, r0)
            java.lang.String[] r0 = new java.lang.String[r7]
            r11.A0B(r10, r0)
            java.lang.String r0 = r16.toString()
            X.2kQ r15 = X.C227942kP.A01(r0, r7, r8)
            X.Q03 r1 = new X.Q03
            r11 = r1
            r12 = r6
            r13 = r5
            r14 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1.A0f = r4
            r1.A0J = r9
            r1.A0L = r2
            goto L_0x00dd
        L_0x029d:
            int r15 = r15 + 1
            goto L_0x025b
        L_0x02a0:
            r0 = 0
            goto L_0x0275
        L_0x02a2:
            r2 = r11
            goto L_0x021d
        L_0x02a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54861HVs.A00(X.6Rx, X.6Tm):java.lang.Boolean");
    }
}
