package X;

/* renamed from: X.HxS  reason: case insensitive filesystem */
public final class C56374HxS {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        if (r1.equals("long_press") != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        if (r34 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r8.A02.invoke(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
        if (r1.equals("long_press") != false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.MotionEvent r20, android.view.View r21, X.C238863Ds r22, X.2Wa r23, X.C59543JNp r24, X.C267324bN r25, X.C52058GDe r26, com.instagram.common.session.UserSession r27, X.AnonymousClass4DU r28, X.AnonymousClass3OA r29, X.C55753Hmo r30, X.C52046GCs r31, java.lang.String r32, java.lang.String r33, boolean r34) {
        /*
            java.lang.String r1 = "card"
            r0 = r33
            boolean r2 = r0.equals(r1)
            r15 = r21
            r5 = r25
            r3 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r8 = r30
            r14 = r31
            r1 = r32
            if (r2 == 0) goto L_0x00a8
            X.0sa r6 = r8.A00
            X.0sL r4 = r8.A01
            int r7 = r1.hashCode()
            r2 = -326696768(0xffffffffec8700c0, float:-1.3056682E27)
            if (r7 == r2) goto L_0x018d
            r2 = 779098677(0x2e701a35, float:5.459296E-11)
            if (r7 == r2) goto L_0x00a5
            r2 = 913968940(0x367a0f2c, float:3.7261734E-6)
            if (r7 != r2) goto L_0x0058
            java.lang.String r2 = "single_tap"
        L_0x0035:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0058
            r19 = 0
            r16 = r22
            r17 = r24
            r18 = r13
            r14.A04(r15, r16, r17, r18, r19)
        L_0x0046:
            X.4gF r2 = r13.A0F
            if (r2 == 0) goto L_0x009f
            com.instagram.api.schemas.OverlayAdTapDestinationEnum r2 = r2.A00
            if (r2 == 0) goto L_0x009f
            int r3 = r2.ordinal()
            r2 = 2
            if (r3 != r2) goto L_0x009f
            r4.invoke(r5, r13)
        L_0x0058:
            android.view.View r4 = r15.getRootView()
            java.lang.String r3 = "clips_overlay_ad_cta_component"
            android.view.View r2 = r4.findViewWithTag(r3)
            if (r2 == 0) goto L_0x009e
            android.graphics.Rect r9 = X.AnonymousClass7TE.A0W()
            r15.getGlobalVisibleRect(r9)
            android.view.View r2 = r4.findViewWithTag(r3)
            X.0qQ.A07(r2)
            android.graphics.Rect r10 = X.AnonymousClass7TE.A0W()
            r2.getGlobalVisibleRect(r10)
            float r21 = r20.getX()
            int r2 = r9.left
            float r2 = (float) r2
            float r21 = r21 + r2
            float r22 = r20.getY()
            int r2 = r9.top
            float r2 = (float) r2
            float r22 = r22 + r2
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r15)
            r14 = 0
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r1
            r20 = r0
            X.C55238HeT.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x009e:
            return
        L_0x009f:
            if (r6 == 0) goto L_0x0058
            r6.invoke()
            goto L_0x0058
        L_0x00a5:
            java.lang.String r2 = "double_tap"
            goto L_0x0035
        L_0x00a8:
            java.lang.String r2 = "three-dot menu"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00c0
            java.lang.String r2 = "long_press"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00ba
        L_0x00b8:
            if (r34 == 0) goto L_0x0058
        L_0x00ba:
            X.0sL r2 = r8.A02
            r2.invoke(r5, r3)
            goto L_0x0058
        L_0x00c0:
            java.lang.String r2 = "dismiss button"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = "long_press"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d2
            if (r34 == 0) goto L_0x0058
        L_0x00d2:
            r23.A00()
            X.1Xj r2 = r13.A0K
            r9 = 0
            r4 = r5
            r5 = r3
            r6 = r11
            r7 = r2
            r8 = r12
            X.C55239HeU.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0058
        L_0x00e2:
            java.lang.String r2 = "safe zone"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0165
            X.1Xj r8 = r13.A0K
            r2 = 0
            X.0wc r3 = X.C51967G9n.A0Z(r12, r11, r8, r2)
            java.lang.String r2 = "instagram_ad_overlay_safe_zone_tap"
            X.3sc r4 = X.C254513sb.A03(r11, r8, r12, r2)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            r2 = 281(0x119, float:3.94E-43)
            X.1Ln r6 = X.C51965G9l.A0U(r3, r2)
            X.0jB r7 = r4.A01()
            android.content.Context r2 = X.C51966G9m.A0P(r11)
            java.lang.String r4 = X.C61120lW.A04(r2)
            boolean r2 = X.DbT.A1Y(r6)
            if (r2 == 0) goto L_0x0058
            r3 = 0
            X.C51976G9y.A0c(r6, r12, r7, r4)
            com.instagram.user.model.User r2 = r8.A2A(r11)
            java.lang.String r4 = X.C51968G9o.A15(r2)
            java.lang.String r2 = "a_pk"
            r6.A0R(r2, r4)
            java.lang.String r2 = X.C231122qu.A07(r11, r8)
            if (r2 == 0) goto L_0x0162
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r2)
            if (r2 == 0) goto L_0x0162
            long r9 = r2.longValue()
        L_0x0134:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            java.lang.String r2 = "ad_id"
            r6.A0Q(r2, r4)
            java.lang.String r2 = X.C294185m0.A09(r8)
            r6.A0m(r2)
            java.lang.Long r4 = X.C51972G9s.A0g(r8)
            java.lang.String r2 = "m_t"
            r6.A0Q(r2, r4)
            X.C51976G9y.A0a(r6, r7, r11, r8, r12)
            X.3OA r2 = r5.A07()
            if (r2 == 0) goto L_0x0158
            java.lang.String r3 = r2.A0f
        L_0x0158:
            java.lang.String r2 = "host_media_pk"
            r6.A0R(r2, r3)
            r6.Cgf()
            goto L_0x0058
        L_0x0162:
            r9 = 0
            goto L_0x0134
        L_0x0165:
            X.0sa r6 = r8.A00
            X.0sL r4 = r8.A01
            int r7 = r1.hashCode()
            r2 = -326696768(0xffffffffec8700c0, float:-1.3056682E27)
            if (r7 == r2) goto L_0x018d
            r2 = 779098677(0x2e701a35, float:5.459296E-11)
            r3 = 0
            if (r7 == r2) goto L_0x018a
            r2 = 913968940(0x367a0f2c, float:3.7261734E-6)
            if (r7 != r2) goto L_0x0058
            java.lang.String r2 = "single_tap"
        L_0x017f:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0058
            r14.A05(r15, r3, r3)
            goto L_0x0046
        L_0x018a:
            java.lang.String r2 = "double_tap"
            goto L_0x017f
        L_0x018d:
            java.lang.String r2 = "long_press"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00b8
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56374HxS.A00(android.view.MotionEvent, android.view.View, X.3Ds, X.2Wa, X.JNp, X.4bN, X.GDe, com.instagram.common.session.UserSession, X.4DU, X.3OA, X.Hmo, X.GCs, java.lang.String, java.lang.String, boolean):void");
    }
}
