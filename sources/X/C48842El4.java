package X;

/* renamed from: X.El4  reason: case insensitive filesystem */
public abstract class C48842El4 {
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c2, code lost:
        if (r35 != null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (r0.isEmpty() != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0iw r28, com.instagram.common.session.UserSession r29, X.C47032DpO r30, X.C67058MhZ r31, X.C294875nB r32, com.instagram.model.direct.DirectShareTarget r33, java.lang.String r34, java.util.List r35, int r36, int r37, int r38, int r39, int r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        /*
            r6 = 0
            r0 = 7
            r10 = r29
            X.0qQ.A0B(r10, r0)
            r5 = 8
            r14 = r32
            r16 = r28
            r0 = r16
            X.AnonymousClass7TF.A1G(r0, r5, r14)
            r1 = 10
            r29 = r34
            r0 = r29
            X.0qQ.A0B(r0, r1)
            r8 = r30
            android.view.ViewGroup r11 = r8.A00
            android.content.Context r4 = r11.getContext()
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r10)
            r7 = r33
            java.lang.String r9 = X.AnonymousClass50n.A03(r7, r0)
            X.0qQ.A07(r9)
            int r0 = r7.A01
            boolean r0 = X.AnonymousClass7LY.A00(r0)
            r3 = 0
            if (r0 == 0) goto L_0x01ef
            boolean r0 = X.C66651MaK.A00(r10, r7)
            if (r0 != 0) goto L_0x01ef
            com.instagram.common.ui.base.IgTextView r0 = r8.A07
            r0.setText(r9)
        L_0x0044:
            X.0qQ.A0A(r4)
            android.widget.TextView r2 = r8.A04
            X.0qQ.A0B(r4, r6)
            r15 = 1
            r1 = 2
            X.0qQ.A0B(r2, r1)
            r0 = r35
            if (r35 == 0) goto L_0x005c
            boolean r12 = r0.isEmpty()
            r13 = 0
            if (r12 == 0) goto L_0x005d
        L_0x005c:
            r13 = 1
        L_0x005d:
            java.lang.String r12 = "Required value was null."
            r34 = r36
            if (r13 != 0) goto L_0x01c2
            if (r35 == 0) goto L_0x0209
            int r12 = r0.size()
            if (r12 <= r15) goto L_0x01c4
            r9 = 4
            r2.setVisibility(r9)
            X.Fso r9 = new X.Fso
            r9.<init>(r2, r0)
            r2.post(r9)
        L_0x0077:
            android.widget.TextView r2 = r8.A03
            X.0qQ.A0B(r2, r1)
            r0 = r34
            android.text.SpannableStringBuilder r0 = X.C49751F5c.A01(r4, r7, r0)
            if (r0 == 0) goto L_0x01bd
            int r9 = r0.length()
            if (r9 == 0) goto L_0x01bd
            if (r44 == 0) goto L_0x01bd
            r2.setVisibility(r6)
            X.0Tu r9 = X.0Tu.A05
            r12 = 36314811777092405(0x810421000f0b35, double:3.028971423618631E-306)
            boolean r9 = X.182.A06(r9, r10, r12)
            if (r9 == 0) goto L_0x00ab
            java.lang.String r12 = X.DbT.A10(r0)
            java.lang.String r9 = "You both"
            boolean r9 = X.00p.A0k(r12, r9, r6)
            if (r9 != 0) goto L_0x00ab
            r2.setMaxLines(r1)
        L_0x00ab:
            r2.setText(r0)
            r2.setCompoundDrawables(r3, r3, r3, r3)
        L_0x00b1:
            android.widget.TextView r0 = r8.A02
            X.0qQ.A0B(r0, r15)
            r0.setVisibility(r5)
            X.Mha r0 = r8.A08
            r22 = r45
            r21 = r41
            r15 = r4
            r17 = r10
            r18 = r14
            r19 = r0
            r20 = r7
            com.instagram.model.reels.Reel r20 = X.C69994NvY.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            r24 = r40
            r23 = r39
            r17 = r31
            r21 = r37
            r22 = r38
            if (r20 == 0) goto L_0x00e8
            X.FOb r15 = new X.FOb
            r25 = r34
            r16 = r8
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A04
            X.AnonymousClass0fU.A00(r15, r0)
        L_0x00e8:
            X.FOa r0 = new X.FOa
            r25 = r0
            r26 = r17
            r27 = r14
            r28 = r7
            r30 = r21
            r31 = r22
            r32 = r23
            r33 = r24
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.AnonymousClass0fU.A00(r0, r11)
            java.lang.String r2 = ""
            if (r42 == 0) goto L_0x0193
            r0 = 2131239023(0x7f08206f, float:1.8094341E38)
            android.graphics.drawable.Drawable r10 = r4.getDrawable(r0)
            r0 = 2131959559(0x7f131f07, float:1.9555762E38)
            java.lang.String r2 = r4.getString(r0)
            r0 = 57
            X.FPE r9 = new X.FPE
            r9.<init>((int) r0, (java.lang.Object) r14, (java.lang.Object) r7)
        L_0x0119:
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            if (r10 == 0) goto L_0x01b7
            android.widget.FrameLayout r1 = r8.A01
            r1.setVisibility(r6)
            int r12 = X.DbV.A01(r4)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 2131437363(0x7f0b2733, float:1.8496623E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r1, r0)
            android.graphics.drawable.Drawable r0 = r10.mutate()
            X.AnonymousClass7TE.A1R(r0, r12)
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r3, r3, r3)
            r4.setContentDescription(r2)
            if (r9 == 0) goto L_0x0143
            X.AnonymousClass0fU.A00(r9, r1)
        L_0x0143:
            com.instagram.igds.components.button.IgdsButton r0 = r8.A0A
            if (r47 == 0) goto L_0x018f
            r0.setVisibility(r6)
            X.0qQ.A0B(r1, r6)
            r0 = 2131437363(0x7f0b2733, float:1.8496623E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r1)
            r0 = 6
            int r0 = X.DbS.A02(r1, r0)
            X.0nA.A0Z(r2, r0)
            r0 = 4
            int r0 = X.DbS.A02(r1, r0)
            X.0nA.A0b(r2, r0)
        L_0x0168:
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setAlpha(r0)
            r0 = 2131231121(0x7f080191, float:1.8078314E38)
            r11.setBackgroundResource(r0)
            android.view.View r0 = r8.itemView
            X.0qQ.A06(r0)
            boolean r10 = X.AnonymousClass7TF.A1V(r20)
            r1 = r14
            r2 = r0
            r3 = r17
            r4 = r7
            r5 = r29
            r6 = r34
            r7 = r21
            r8 = r22
            r9 = r24
            r1.DpB(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x018f:
            r0.setVisibility(r5)
            goto L_0x0168
        L_0x0193:
            if (r46 == 0) goto L_0x01a5
            r0 = 2131239021(0x7f08206d, float:1.8094337E38)
            android.graphics.drawable.Drawable r10 = r4.getDrawable(r0)
            r0 = 58
            X.FPE r9 = new X.FPE
            r9.<init>((int) r0, (java.lang.Object) r14, (java.lang.Object) r7)
            goto L_0x0119
        L_0x01a5:
            if (r43 != 0) goto L_0x01b7
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            android.graphics.drawable.Drawable r10 = r4.getDrawable(r0)
            X.FNn r9 = new X.FNn
            r0 = r29
            r9.<init>(r14, r7, r0, r1)
            goto L_0x0119
        L_0x01b7:
            android.widget.FrameLayout r1 = r8.A01
            r1.setVisibility(r5)
            goto L_0x0143
        L_0x01bd:
            r2.setVisibility(r5)
            goto L_0x00b1
        L_0x01c2:
            if (r35 == 0) goto L_0x01e3
        L_0x01c4:
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x01e3
            java.lang.Object r0 = r0.get(r6)
        L_0x01ce:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x01ea
            int r9 = r0.length()
            if (r9 == 0) goto L_0x01ea
            r2.setVisibility(r6)
            r2.setText(r0)
            r2.setCompoundDrawables(r3, r3, r3, r3)
            goto L_0x0077
        L_0x01e3:
            r0 = r34
            android.text.SpannableStringBuilder r0 = X.C49751F5c.A00(r4, r10, r7, r9, r0)
            goto L_0x01ce
        L_0x01ea:
            r2.setVisibility(r5)
            goto L_0x0077
        L_0x01ef:
            com.instagram.common.ui.base.IgTextView r12 = r8.A07
            boolean r2 = r7.A0V()
            boolean r0 = X.C66651MaK.A00(r10, r7)
            if (r0 == 0) goto L_0x0207
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Integer) r1)
        L_0x0202:
            X.C46334Dcc.A00(r12, r0, r9, r2)
            goto L_0x0044
        L_0x0207:
            r0 = r3
            goto L_0x0202
        L_0x0209:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48842El4.A00(X.0iw, com.instagram.common.session.UserSession, X.DpO, X.MhZ, X.5nB, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.util.List, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
