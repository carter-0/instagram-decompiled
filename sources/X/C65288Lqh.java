package X;

/* renamed from: X.Lqh  reason: case insensitive filesystem */
public final class C65288Lqh implements MSN {
    public final int A00;
    public final Object A01;

    public C65288Lqh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x008a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DjI(X.MSO r57) {
        /*
            r56 = this;
            r1 = r56
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x002c;
                case 2: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.OLq r0 = (X.C70795OLq) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.2Rw r0 = (X.2Rw) r0
        L_0x0013:
            r0.notifyDataSetChanged()
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            X.EIn r0 = com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A02(r0)
            goto L_0x0013
        L_0x0020:
            java.lang.Object r0 = r1.A01
            X.LOS r0 = (X.LOS) r0
            X.0sa r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            r0.invoke()
            return
        L_0x002c:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r0
            X.4yO r1 = r0.A0C
            boolean r2 = r1 instanceof X.AnonymousClass80M
            java.util.List r1 = r0.A0Y
            if (r2 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x0198
            java.util.Iterator r3 = r1.iterator()
        L_0x003e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0198
            java.lang.Object r7 = r3.next()
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r7 = (com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo) r7
            com.instagram.common.session.UserSession r5 = r0.A0B
            r8 = 0
            int r1 = r57.BtD()
            X.KkU r4 = X.C59895JbK.A07(r1)
            int r2 = r7.A02
            r1 = -1
            if (r2 == r1) goto L_0x00b8
            r1 = 21
            if (r2 == r1) goto L_0x00b5
            r1 = 23
            if (r2 == r1) goto L_0x00b2
            r1 = 1
            if (r2 == r1) goto L_0x00af
            r1 = 2
            if (r2 == r1) goto L_0x00ac
            r1 = 3
            if (r2 == r1) goto L_0x00a9
            r1 = 4
            if (r2 == r1) goto L_0x00a6
            r1 = 9
            if (r2 == r1) goto L_0x00a3
            r1 = 10
            if (r2 == r1) goto L_0x00a0
            r1 = 17
            if (r2 == r1) goto L_0x009d
            r1 = 18
            if (r2 != r1) goto L_0x00b8
            java.lang.Integer r10 = X.AnonymousClass05K.A1I
        L_0x0080:
            java.util.ArrayList r16 = r7.A01()
            X.4yO r6 = r0.A0C
            if (r6 != 0) goto L_0x008a
            X.9QA r6 = X.AnonymousClass9QA.A00
        L_0x008a:
            X.4DH r1 = r0.A0w
            java.lang.String r12 = r1.getModuleName()
            r9 = r8
            r11 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r17 = r8
            r18 = r8
            X.C59895JbK.A0E(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x003e
        L_0x009d:
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            goto L_0x0080
        L_0x00a0:
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            goto L_0x0080
        L_0x00a3:
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            goto L_0x0080
        L_0x00a6:
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x0080
        L_0x00a9:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x0080
        L_0x00ac:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x0080
        L_0x00af:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x0080
        L_0x00b2:
            java.lang.Integer r10 = X.AnonymousClass05K.A0j
            goto L_0x0080
        L_0x00b5:
            java.lang.Integer r10 = X.AnonymousClass05K.A15
            goto L_0x0080
        L_0x00b8:
            java.lang.Integer r10 = X.AnonymousClass05K.A05
            goto L_0x0080
        L_0x00bb:
            if (r1 == 0) goto L_0x0198
            java.util.Iterator r16 = r1.iterator()
        L_0x00c1:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0198
            java.lang.Object r1 = r16.next()
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r1 = (com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo) r1
            com.instagram.common.session.UserSession r2 = r0.A0B
            X.29f r17 = X.JTO.A0c(r2)
            int r2 = r1.A04
            X.JYm r19 = X.2AL.A03(r2)
            int r2 = r1.A05
            X.28t r20 = X.C59895JbK.A05(r2)
            int r2 = r1.A01
            r47 = r2
            int r2 = r1.A02
            r48 = r2
            java.util.ArrayList r38 = r1.A01()
            X.4yO r6 = r0.A0C
            if (r6 != 0) goto L_0x00f1
            X.9QA r6 = X.AnonymousClass9QA.A00
        L_0x00f1:
            int r2 = r57.BtD()
            X.KkU r22 = X.C59895JbK.A07(r2)
            int r2 = r1.A03
            r49 = r2
            java.util.List r2 = r1.A0g
            r39 = r2
            java.util.List r2 = r1.A0h
            r40 = r2
            java.util.List r2 = r1.A0f
            r41 = r2
            java.util.HashMap r2 = r1.A0a
            r46 = r2
            java.util.List r2 = r1.A0j
            r42 = r2
            boolean r2 = r1.A0v
            r52 = r2
            int r2 = r1.A06
            r50 = r2
            java.util.List r2 = r1.A0l
            r26 = r2
            java.util.List r2 = r1.A0m
            r25 = r2
            android.util.Pair r18 = r1.A00()
            java.lang.String r2 = r1.A0L
            r24 = r2
            java.lang.String r15 = r1.A0M
            java.lang.Integer r3 = r1.A0H
            if (r3 == 0) goto L_0x0139
            java.lang.Integer r2 = r1.A0I
            if (r2 == 0) goto L_0x0139
            r3.intValue()
            r2.intValue()
        L_0x0139:
            r21 = 0
            r27 = r21
            java.lang.String r14 = r1.A0N
            X.JVj r23 = X.C59725JVj.AUDIENCE_PICKER
            boolean r13 = r1.A0x
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r12 = r1.A0C
            java.lang.Integer r11 = r1.A0F
            boolean r10 = r1.A0y
            java.lang.String r2 = r1.A0O
            if (r2 == 0) goto L_0x0157
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0157
            X.8aU r21 = X.C358178aU.valueOf(r2)
        L_0x0157:
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r9 = r1.A0D
            X.4DH r2 = r0.A0w
            java.lang.String r32 = r2.getModuleName()
            java.lang.String r8 = r1.A0X
            int r7 = r1.A07
            boolean r5 = r1.A10
            java.util.List r4 = r1.A0i
            java.lang.String r3 = r1.A0U
            java.lang.String r2 = r1.A0T
            java.lang.String r1 = r1.A0Q
            r28 = r11
            r29 = r24
            r30 = r15
            r31 = r14
            r33 = r8
            r34 = r3
            r35 = r2
            r36 = r1
            r37 = r27
            r43 = r26
            r44 = r25
            r45 = r4
            r51 = r7
            r53 = r13
            r54 = r10
            r55 = r5
            r24 = r6
            r25 = r12
            r26 = r9
            r17.A0U(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            goto L_0x00c1
        L_0x0198:
            X.K9I r1 = r0.A0H
            r1.A06()
            X.4DH r1 = r0.A0w
            android.content.Context r2 = r1.getContext()
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r2 = r1.A02(r2)
            if (r2 == 0) goto L_0x01af
            r1 = 1
            r2.A0V(r1)
        L_0x01af:
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65288Lqh.DjI(X.MSO):void");
    }
}
