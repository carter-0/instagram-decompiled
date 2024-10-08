package X;

import com.instagram.common.session.UserSession;

public final class P8N implements AnonymousClass7DS {
    public final UserSession A00;
    public final AnonymousClass7X1 A01;
    public final C71027OZe A02;
    public final AnonymousClass0iw A03;

    public P8N(AnonymousClass0iw r2, UserSession userSession, AnonymousClass7X1 r4, C71027OZe oZe) {
        0qQ.A0B(r4, 1);
        this.A01 = r4;
        this.A00 = userSession;
        this.A03 = r2;
        this.A02 = oZe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0100 A[LOOP:2: B:31:0x00f8->B:33:0x0100, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0148 A[LOOP:3: B:39:0x0142->B:41:0x0148, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016b A[LOOP:4: B:43:0x0165->B:45:0x016b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0187 A[LOOP:5: B:47:0x0181->B:49:0x0187, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.View r37, X.C328687Ft r38, int r39) {
        /*
            r36 = this;
            r5 = r38
            java.lang.String r9 = r5.A03
            java.lang.String r11 = ""
            if (r9 != 0) goto L_0x0009
            r9 = r11
        L_0x0009:
            r6 = r36
            com.instagram.common.session.UserSession r7 = r6.A00
            X.0iw r1 = r6.A03
            java.util.List r4 = r5.A04
            int r0 = r4.size()
            X.C3265677h.A0J(r1, r7, r9, r0)
            r0 = r39
            java.lang.Object r1 = r4.get(r0)
            X.NYf r1 = (X.C68821NYf) r1
            X.77B r2 = r1.A01
            r1 = 0
            r14 = r37
            if (r2 == 0) goto L_0x0075
            X.0Tu r5 = X.0Tu.A06
            r2 = 36316448160354687(0x81059e001a117f, double:3.030006278982885E-306)
            boolean r2 = X.182.A06(r5, r7, r2)
            if (r2 == 0) goto L_0x01be
            X.7X1 r6 = r6.A01
            X.7Wy r6 = (X.C332917Wy) r6
            java.util.List r2 = X.00k.A0Y(r4)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r2.iterator()
        L_0x0044:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r3.next()
            X.NYf r2 = (X.C68821NYf) r2
            X.77B r2 = r2.A01
            if (r2 == 0) goto L_0x0044
            r5.add(r2)
            goto L_0x0044
        L_0x0058:
            int r0 = X.DbT.A02(r4, r0)
            int r11 = r0 + -1
            X.N3i r8 = X.C68168N3i.A00(r14)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            java.lang.Object r0 = r4.get(r1)
            X.7FV r0 = (X.AnonymousClass7FV) r0
            boolean r12 = r0.BCL()
            r7 = r14
            r10 = r5
            r13 = r1
            r6.Cpz(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0075:
            java.util.List r2 = X.00k.A0Y(r4)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x0081:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00a0
            X.7Fr r2 = X.C68821NYf.A00(r10)
            X.9J6 r2 = r2.A08
            java.lang.String r2 = r2.A01
            android.net.Uri r8 = X.0cp.A03(r2)
            java.lang.String r2 = "media_fbid"
            java.lang.String r2 = r8.getQueryParameter(r2)
            if (r2 != 0) goto L_0x009c
            r2 = r11
        L_0x009c:
            r3.add(r2)
            goto L_0x0081
        L_0x00a0:
            X.7Fr r2 = X.C68821NYf.A01(r4, r0)
            X.9J6 r2 = r2.A08
            java.lang.String r2 = r2.A01
            r15 = 0
            android.net.Uri r8 = X.0cp.A03(r2)
            java.lang.String r2 = "blob_sender_id"
            java.lang.String r2 = r8.getQueryParameter(r2)
            if (r2 != 0) goto L_0x00bd
            X.7Fr r2 = X.C68821NYf.A01(r4, r0)
            X.9J6 r2 = r2.A08
            java.lang.String r2 = r2.A00
        L_0x00bd:
            java.lang.Object r8 = X.00k.A0O(r4, r1)
            X.NYf r8 = (X.C68821NYf) r8
            r20 = 0
            if (r8 == 0) goto L_0x0119
            X.7Fr r10 = r8.A02
            com.instagram.model.mediasize.GifUrlImpl r8 = r10.A0N
            if (r8 == 0) goto L_0x0111
            java.lang.Integer r21 = X.C51968G9o.A0t(r4)
        L_0x00d1:
            X.Ob1 r16 = X.C71082Ob1.A00
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            r26 = 8
            r17 = r7
            r18 = r15
            r19 = r15
            r23 = r9
            r24 = r2
            r25 = r15
            r27 = r1
            r28 = r1
            r16.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.util.List r7 = X.00k.A0Y(r4)
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r8 = r7.iterator()
        L_0x00f8:
            boolean r7 = r8.hasNext()
            java.lang.String r10 = "null cannot be cast to non-null type com.instagram.direct.messagethread.genericxma.model.GenericXmaContentViewModel.MediaFields.Default"
            if (r7 == 0) goto L_0x011c
            X.7Fr r7 = X.C68821NYf.A00(r8)
            X.777 r7 = r7.A0F
            X.0qQ.A0C(r7, r10)
            X.776 r7 = (X.AnonymousClass776) r7
            java.lang.String r7 = r7.A06
            r9.add(r7)
            goto L_0x00f8
        L_0x0111:
            X.777 r8 = r10.A0F
            if (r8 == 0) goto L_0x0119
            java.lang.Integer r20 = X.C51968G9o.A0t(r4)
        L_0x0119:
            r21 = r15
            goto L_0x00d1
        L_0x011c:
            X.7X1 r13 = r6.A01
            X.7Fr r6 = X.C68821NYf.A01(r4, r0)
            X.9J6 r6 = r6.A08
            java.lang.String r8 = r6.A01
            X.7Fr r6 = X.C68821NYf.A01(r4, r0)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r7 = r6.A0L
            long r11 = r5.BSP()
            int r0 = X.DbT.A02(r4, r0)
            int r34 = r0 + -1
            java.util.List r0 = X.00k.A0Y(r4)
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0142:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0159
            X.7Fr r0 = X.C68821NYf.A00(r5)
            X.777 r0 = r0.A0F
            X.0qQ.A0C(r0, r10)
            X.776 r0 = (X.AnonymousClass776) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            r6.add(r0)
            goto L_0x0142
        L_0x0159:
            java.util.List r0 = X.00k.A0Y(r4)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0165:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0175
            X.7Fr r0 = X.C68821NYf.A00(r10)
            com.instagram.model.mediasize.GifUrlImpl r0 = r0.A0N
            r5.add(r0)
            goto L_0x0165
        L_0x0175:
            java.util.List r0 = X.00k.A0Y(r4)
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0181:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0193
            X.7Fr r0 = X.C68821NYf.A00(r10)
            X.9J6 r0 = r0.A08
            java.lang.String r0 = r0.A01
            r4.add(r0)
            goto L_0x0181
        L_0x0193:
            X.N3i r16 = X.C68168N3i.A00(r14)
            X.7Wp r13 = (X.C332847Wp) r13
            java.lang.Long r19 = java.lang.Long.valueOf(r11)
            r20 = r15
            r23 = r15
            r24 = r15
            r26 = r15
            r27 = r15
            r28 = r3
            r29 = r6
            r30 = r5
            r31 = r4
            r32 = r9
            r33 = r15
            r35 = r1
            r21 = r8
            r22 = r2
            r17 = r7
            r13.Cqp(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8N.A00(android.view.View, X.7Ft, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (X.0nA.A0y(r13.A04.A00, r11.getRawX(), r11.getRawY()) == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            X.7Ft r12 = (X.C328687Ft) r12
            X.PBe r13 = (X.C72573PBe) r13
            r6 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r6, r12, r13)
            r4 = 2
            X.0qQ.A0B(r11, r4)
            java.util.List r3 = r12.A04
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00a0
        L_0x0019:
            java.lang.Object r0 = r3.get(r6)
            X.7FV r0 = (X.AnonymousClass7FV) r0
            boolean r7 = r0.BCL()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = r12.A02
            X.7X1 r1 = r10.A01
            r0 = r1
            X.7Wz r0 = (X.C332927Wz) r0
            boolean r0 = X.C70020Nvy.A00(r0, r2, r7)
            if (r0 != 0) goto L_0x0082
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x0082
            int r0 = r12.A00
            if (r0 == 0) goto L_0x009a
            if (r0 == r5) goto L_0x0094
            X.OHo r0 = r13.A03
            com.instagram.common.ui.base.IgFrameLayout r7 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r9 = X.0nA.A0y(r7, r1, r0)
            int r0 = r3.size()
            if (r0 < r4) goto L_0x0065
            X.OHo r0 = r13.A04
            com.instagram.common.ui.base.IgFrameLayout r2 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r0 = X.0nA.A0y(r2, r1, r0)
            r8 = 1
            if (r0 != 0) goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            int r1 = r3.size()
            r0 = 3
            if (r1 < r0) goto L_0x0084
            X.OHo r0 = r13.A05
            com.instagram.common.ui.base.IgFrameLayout r2 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r0 = X.0nA.A0y(r2, r1, r0)
            if (r0 == 0) goto L_0x0084
            r10.A00(r2, r12, r4)
        L_0x0082:
            r0 = 1
            return r0
        L_0x0084:
            if (r8 == 0) goto L_0x008e
            X.OHo r0 = r13.A04
            com.instagram.common.ui.base.IgFrameLayout r0 = r0.A00
            r10.A00(r0, r12, r5)
            goto L_0x0082
        L_0x008e:
            if (r9 == 0) goto L_0x0082
            r10.A00(r7, r12, r6)
            goto L_0x0082
        L_0x0094:
            java.lang.String r0 = r2.A01
            r1.AGk(r0, r4)
            goto L_0x0082
        L_0x009a:
            java.lang.String r0 = r2.A01
            r1.AGk(r0, r5)
            goto L_0x0082
        L_0x00a0:
            java.util.Iterator r7 = r3.iterator()
        L_0x00a4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r2 = r7.next()
            X.NYf r2 = (X.C68821NYf) r2
            X.OZe r1 = r10.A02
            com.instagram.common.session.UserSession r0 = r10.A00
            X.3Q2 r0 = X.C70043NwL.A00(r0, r2)
            boolean r0 = X.C71027OZe.A01(r1, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8N.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
