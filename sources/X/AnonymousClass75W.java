package X;

/* renamed from: X.75W  reason: invalid class name */
public final class AnonymousClass75W implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7XR A00;

    public AnonymousClass75W(AnonymousClass7XR r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r1 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        if (r4.length() == 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        if (r5 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013c, code lost:
        if (r3 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013e, code lost:
        r3 = "xma_open_native";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0140, code lost:
        if (r0 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        r17 = r8;
        r17.CJS(X.0nA.A0F(r10.A07), X.2FW.A0y, r7, (com.instagram.ui.widget.gradientspinner.GradientSpinner) null, 0, r2, r3, r0, r15, r14, r28, (java.lang.String) null, r30, (java.lang.String) null, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0168, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            r38 = this;
            r10 = r41
            r4 = r40
            X.7Fr r4 = (X.C328667Fr) r4
            X.PBi r10 = (X.C72577PBi) r10
            r12 = 0
            X.0qQ.A0B(r4, r12)
            r9 = 1
            X.0qQ.A0B(r10, r9)
            r0 = 2
            r3 = r39
            X.0qQ.A0B(r3, r0)
            r0 = r38
            X.7XR r8 = r0.A00
            X.779 r0 = r4.A0K
            if (r0 == 0) goto L_0x00b1
            java.lang.String r2 = r0.name()
        L_0x0022:
            java.util.List r1 = r4.A0b
            X.9J6 r0 = r4.A08
            java.lang.String r13 = r0.A01
            X.777 r11 = r4.A0F
            java.lang.String r0 = r0.A00
            r28 = r0
            com.instagram.model.direct.messageid.DirectMessageIdentifier r7 = r4.A0L
            java.lang.String r0 = r7.A00
            r30 = r0
            X.7FU r0 = r4.A00
            boolean r5 = r0.BCL()
            r4 = 4
            r0 = r28
            X.0qQ.A0B(r0, r4)
            r0 = r8
            X.7Wz r0 = (X.C332927Wz) r0
            boolean r0 = X.C70020Nvy.A00(r0, r7, r5)
            if (r0 != 0) goto L_0x00a7
            X.3oV r0 = r10.A06
            android.view.View r14 = r0.getView()
            float r0 = r3.getRawX()
            int r5 = (int) r0
            float r0 = r3.getRawY()
            int r4 = (int) r0
            r0 = 2
            int[] r3 = new int[r0]
            r14.getLocationOnScreen(r3)
            r6 = 0
            r0 = r3[r12]
            r3 = r3[r9]
            if (r5 < r0) goto L_0x0077
            int r15 = r14.getWidth()
            int r0 = r0 + r15
            if (r5 > r0) goto L_0x0077
            if (r4 < r3) goto L_0x0077
            int r0 = r14.getHeight()
            int r3 = r3 + r0
            if (r4 > r3) goto L_0x0077
            r6 = 1
        L_0x0077:
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r5 = X.00k.A0J(r1)
            X.9JN r5 = (X.AnonymousClass9JN) r5
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = r5.A06
            java.lang.String r15 = r5.A02
            java.lang.String r14 = r5.A03
        L_0x0087:
            java.lang.Object r1 = X.00k.A0O(r1, r9)
            X.9JN r1 = (X.AnonymousClass9JN) r1
            if (r1 == 0) goto L_0x00af
            java.lang.String r1 = r1.A06
        L_0x0091:
            if (r13 == 0) goto L_0x0099
            int r3 = r13.length()
            if (r3 != 0) goto L_0x00b4
        L_0x0099:
            r13 = r1
            if (r1 != 0) goto L_0x00b4
            java.lang.String r0 = "previewTargetUrl is null, xmaContentType is "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.String r0 = "LayeredXmaClickDelegate"
            X.0wb.A03(r0, r1)
        L_0x00a7:
            return r9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            r0 = 0
            r15 = 0
            r14 = 0
            if (r1 == 0) goto L_0x00af
            goto L_0x0087
        L_0x00af:
            r1 = 0
            goto L_0x0091
        L_0x00b1:
            r2 = 0
            goto L_0x0022
        L_0x00b4:
            if (r0 == 0) goto L_0x016b
            android.net.Uri r2 = X.0cp.A03(r0)
            if (r2 == 0) goto L_0x016b
            java.lang.String r4 = r2.getHost()
        L_0x00c0:
            r16 = 0
            android.net.Uri r2 = X.0cp.A03(r13)
            X.0qQ.A07(r2)
            java.util.List r2 = r2.getPathSegments()
            X.0qQ.A07(r2)
            java.lang.Object r2 = X.00k.A0O(r2, r12)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00de
            java.lang.String r3 = X.C70022Nw0.A00(r2)
            if (r3 != 0) goto L_0x00fa
        L_0x00de:
            if (r1 == 0) goto L_0x0169
            android.net.Uri r1 = X.0cp.A03(r1)
            X.0qQ.A07(r1)
            java.util.List r1 = r1.getPathSegments()
            X.0qQ.A07(r1)
            java.lang.Object r1 = X.00k.A0O(r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0169
            java.lang.String r3 = X.C70022Nw0.A00(r1)
        L_0x00fa:
            if (r4 == 0) goto L_0x0103
            int r2 = r4.length()
            r1 = 0
            if (r2 != 0) goto L_0x0104
        L_0x0103:
            r1 = 1
        L_0x0104:
            java.lang.String r2 = "comments"
            if (r1 != 0) goto L_0x012c
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L_0x012c
            if (r3 == 0) goto L_0x012c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "&media_type="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "&navigate_to_comment="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x012c:
            if (r6 == 0) goto L_0x016e
            X.7Ws r8 = (X.AnonymousClass7Ws) r8
            if (r5 == 0) goto L_0x0136
            java.lang.String r2 = r5.A04
            if (r2 != 0) goto L_0x013a
        L_0x0136:
            java.lang.String r2 = ""
            if (r5 == 0) goto L_0x013e
        L_0x013a:
            java.lang.String r3 = r5.A05
            if (r3 != 0) goto L_0x0140
        L_0x013e:
            java.lang.String r3 = "xma_open_native"
        L_0x0140:
            if (r0 != 0) goto L_0x0143
            r0 = r13
        L_0x0143:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r12)
            X.2FW r19 = X.2FW.A0y
            com.instagram.feed.widget.IgProgressImageView r1 = r10.A07
            android.graphics.RectF r18 = X.0nA.A0F(r1)
            r17 = r8
            r20 = r7
            r21 = r16
            r23 = r2
            r24 = r3
            r25 = r0
            r26 = r15
            r27 = r14
            r29 = r16
            r31 = r16
            r32 = r16
            r17.CJS(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r9
        L_0x0169:
            r3 = 0
            goto L_0x00fa
        L_0x016b:
            r4 = 0
            goto L_0x00c0
        L_0x016e:
            if (r4 == 0) goto L_0x018c
            int r1 = r4.length()
            if (r1 == 0) goto L_0x018c
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = "media"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 == 0) goto L_0x018c
            if (r0 == 0) goto L_0x018c
            int r1 = r0.length()
            if (r1 != 0) goto L_0x018d
        L_0x018c:
            r0 = r13
        L_0x018d:
            X.3oV r1 = r10.A04
            android.view.View r4 = r1.getView()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r4
            X.7Wp r8 = (X.C332847Wp) r8
            if (r11 == 0) goto L_0x01e1
            boolean r1 = r11 instanceof X.AnonymousClass776
            if (r1 == 0) goto L_0x01e1
            X.776 r11 = (X.AnonymousClass776) r11
            com.instagram.common.typedurl.ImageUrl r1 = r11.A00
            java.util.List r31 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r31)
        L_0x01a8:
            com.instagram.feed.widget.IgProgressImageView r1 = r10.A07
            android.graphics.RectF r3 = X.0nA.A0F(r1)
            r2 = 0
            X.N3i r1 = new X.N3i
            r1.<init>(r3, r2)
            r17 = r16
            r18 = r1
            r19 = r7
            r20 = r4
            r21 = r16
            r22 = r16
            r23 = r0
            r24 = r28
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r12
            r37 = r12
            r15 = r8
            r15.Cqp(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r9
        L_0x01e1:
            r31 = 0
            goto L_0x01a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75W.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
