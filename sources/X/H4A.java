package X;

public final class H4A extends 1P0 {
    public final /* synthetic */ I4M A00;

    public H4A(I4M i4m) {
        this.A00 = i4m;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r10v2, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0215, code lost:
        if (r2.equals("dialog") == false) goto L_0x0217;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r33
            r0 = -1545664265(0xffffffffa3df08f7, float:-2.4181505E-17)
            int r20 = X.AnonymousClass0fD.A03(r0)
            X.CDn r1 = (X.C43795CDn) r1
            r0 = 2038728990(0x7984891e, float:8.602053E34)
            int r19 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            r2 = r32
            X.H4A.super.onSuccess(r1)
            X.JRY r0 = r1.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "response"
        L_0x0021:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            X.BEh r0 = (X.C42032BEh) r0
            X.3Or r0 = r0.A00
            if (r0 == 0) goto L_0x0217
            X.3Op r5 = r0.A06
            if (r5 == 0) goto L_0x0217
            X.I4M r4 = r2.A00
            r4.A00 = r5
            com.instagram.user.model.User r0 = r5.CCd()
            boolean r0 = r0.A29()
            if (r0 != 0) goto L_0x0217
            com.instagram.common.session.UserSession r10 = r4.A0C
            X.0iw r0 = r4.A0B
            r29 = r0
            X.Hld r1 = new X.Hld
            r1.<init>(r0, r10)
            r4.A01 = r1
            X.0Tu r11 = X.0Tu.A06
            r0 = 36885149073408599(0x830ad900020257, double:3.389655026372949E-306)
            java.lang.String r2 = X.182.A04(r11, r10, r0)
            int r1 = r2.hashCode()
            r0 = -1332085432(0xffffffffb099fd48, float:-1.1204202E-9)
            if (r1 == r0) goto L_0x020f
            r0 = 110532135(0x6969627, float:5.664436E-35)
            if (r1 == r0) goto L_0x0203
            r0 = 887518088(0x34e67388, float:4.2924898E-7)
            if (r1 != r0) goto L_0x0217
            java.lang.String r0 = "dialog_and_toast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0217
            r0 = 1
            r4.A09 = r0
        L_0x0077:
            X.0rm r3 = X.C51965G9l.A11()
            java.lang.String r0 = ""
            r3.A00 = r0
            X.0rk r9 = new X.0rk
            r9.<init>()
            android.content.Context r2 = r4.A0A
            com.instagram.user.model.User r15 = r5.CCd()
            boolean r1 = r15.A2A()
            r0 = 2131955469(0x7f130f0d, float:1.9547466E38)
            if (r1 == 0) goto L_0x0096
            r0 = 2131955470(0x7f130f0e, float:1.9547468E38)
        L_0x0096:
            java.lang.String r18 = X.AnonymousClass7TE.A16(r2, r0)
            r13 = 11
            X.I90 r17 = new X.I90
            r21 = r17
            r22 = r13
            r23 = r3
            r24 = r5
            r25 = r4
            r26 = r9
            r21.<init>((int) r22, (java.lang.Object) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26)
            r0 = 6
            X.I8H r8 = new X.I8H
            r8.<init>(r0, r9, r4, r3)
            android.content.Context r0 = X.2Yn.A01(r2)
            X.8ab r1 = X.DbS.A0Y(r0)
            com.instagram.common.typedurl.ImageUrl r27 = r15.Bh3()
            r16 = 9
            X.I90 r12 = new X.I90
            r21 = r12
            r22 = r16
            r21.<init>((int) r22, (java.lang.Object) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26)
            r7 = 2131165320(0x7f070088, float:1.7944854E38)
            r0 = 1
            r1.A08 = r0
            com.instagram.igds.components.headline.IgdsHeadline r14 = r1.A0Z
            java.lang.Integer r30 = java.lang.Integer.valueOf(r7)
            X.AOW r7 = new X.AOW
            r7.<init>(r13, r12, r1)
            r12 = 0
            r26 = r14
            r28 = r12
            r31 = r7
            r26.setCircularImageUrl(r27, r28, r29, r30, r31)
            r14.setVisibility(r6)
            r1.A09 = r0
            r7 = 2131955471(0x7f130f0f, float:1.954747E38)
            java.lang.String r7 = X.DbY.A0b(r2, r15, r7)
            r1.A05 = r7
            r22 = 10
            X.I90 r7 = new X.I90
            r21 = r7
            r26 = r9
            r21.<init>((int) r22, (java.lang.Object) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26)
            r1.A01 = r7
            r13 = r17
            r7 = r18
            r1.A0c(r13, r7)
            r7 = 2131955468(0x7f130f0c, float:1.9547464E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r2, r7)
            r1.A0b(r8, r7)
            X.I9B r8 = new X.I9B
            r7 = r16
            r8.<init>(r4, r7)
            r1.A0f(r8)
            r7 = 36322199119931389(0x810ad9000127fd, double:3.0336432089764465E-306)
            boolean r7 = X.182.A06(r11, r10, r7)
            if (r7 == 0) goto L_0x01b6
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r2)
            r7 = 2131624524(0x7f0e024c, float:1.887623E38)
            android.view.View r7 = r8.inflate(r7, r12, r6)
            r8 = 2131441539(0x7f0b3783, float:1.8505092E38)
            android.view.View r10 = X.AnonymousClass7TF.A0F(r7, r8)
            com.instagram.common.ui.text.TightTextView r10 = (com.instagram.common.ui.text.TightTextView) r10
            java.lang.String r8 = r5.BxN()
            r10.setText(r8)
            r3.A00 = r8
            r8 = 2131100202(0x7f06022a, float:1.7812779E38)
            X.DbT.A17(r2, r10, r8)
            r10.A00 = r0
            r10.A01 = r0
            r8 = 2
            r10.setBreakStrategy(r8)
            java.util.List r26 = r5.BxQ()
            if (r26 == 0) goto L_0x01b2
            boolean r8 = r26.isEmpty()
            if (r8 != 0) goto L_0x01b2
            java.lang.String r25 = r29.getModuleName()
            r8 = 24
            int r27 = X.DbS.A02(r2, r8)
            int r11 = X.DbS.A02(r2, r0)
            int r8 = X.2Yu.A02(r2)
            int r10 = r2.getColor(r8)
            r8 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r22 = java.lang.Float.valueOf(r8)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r10)
            r21 = r2
            X.3b0 r8 = X.C244283aw.A06(r21, r22, r23, r24, r25, r26, r27)
            r2 = 2131441670(0x7f0b3806, float:1.8505358E38)
            android.widget.ImageView r2 = X.DbU.A0F(r7, r2)
            r2.setImageDrawable(r8)
            int r2 = r26.size()
            r9.A00 = r2
        L_0x0198:
            android.widget.FrameLayout r8 = r1.A0X
            r8.setVisibility(r6)
            r8.addView(r7)
            r2 = 21
            X.I8y r7 = new X.I8y
            r7.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r4)
            r5 = 12
            X.AOW r2 = new X.AOW
            r2.<init>(r5, r7, r1)
            X.AnonymousClass0fU.A00(r2, r8)
            goto L_0x01b6
        L_0x01b2:
            r10.setGravity(r0)
            goto L_0x0198
        L_0x01b6:
            X.DbT.A1V(r1)     // Catch:{ BadTokenException -> 0x01b9 }
        L_0x01b9:
            X.Hld r8 = r4.A01
            if (r8 == 0) goto L_0x01e1
            java.lang.Object r7 = r3.A00
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r9.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "dialog"
            X.0wc r2 = r8.A01
            java.lang.String r1 = "follow_prompt_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            X.0iw r1 = r8.A00
            X.DbW.A15(r2, r1)
            X.C51974G9v.A0s(r2, r3, r7)
            java.lang.String r1 = "num_facepiles"
            r2.A8k(r1, r5)
            r2.Cgf()
        L_0x01e1:
            r4.A04 = r0
            r4.A03 = r0
            boolean r1 = r4.A08
            if (r1 == 0) goto L_0x0217
            boolean r1 = r4.A05
            if (r1 != 0) goto L_0x0217
            X.Hjj r1 = r4.A0D
            X.2is r1 = r1.A00
            X.GBE r1 = r1.A09
            if (r1 != 0) goto L_0x01f9
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            goto L_0x0021
        L_0x01f9:
            X.GBn r2 = r1.A1K
            java.lang.String r1 = "fragment_paused"
            r2.A0N(r12, r1, r6, r0)
            r4.A05 = r0
            goto L_0x0217
        L_0x0203:
            java.lang.String r0 = "toast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0217
            X.I4M.A01(r5, r4)
            goto L_0x0217
        L_0x020f:
            java.lang.String r0 = "dialog"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0077
        L_0x0217:
            r1 = -1355237703(0xffffffffaf38b6b9, float:-1.6799619E-10)
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = 1738881398(0x67a53976, float:1.5605009E24)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4A.onSuccess(java.lang.Object):void");
    }
}
