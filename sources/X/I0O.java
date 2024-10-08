package X;

public final class I0O {
    public static final I0O A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (X.AnonymousClass7TE.A1b(r0) != true) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r24, X.C55890HpB r25, com.instagram.common.session.UserSession r26, X.C272034jz r27, java.lang.String r28, X.0sP r29, X.0sL r30, boolean r31) {
        /*
            r23 = this;
            r4 = 0
            r11 = r26
            X.0qQ.A0B(r11, r4)
            r2 = 1
            r9 = 3
            r13 = 5
            r8 = r28
            X.0qQ.A0B(r8, r13)
            r6 = r27
            int[] r14 = X.C297825sP.A03(r11, r6, r2)
            int r7 = r14.length
            r3 = 0
            r1 = 0
        L_0x0017:
            if (r1 >= r7) goto L_0x0020
            r0 = r14[r1]
            float r0 = (float) r0
            float r3 = r3 + r0
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0020:
            int r12 = (int) r3
            X.3yf r0 = r6.BxM()
            if (r0 == 0) goto L_0x0034
            java.util.List r0 = r0.BxQ()
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r10 = 1
            if (r0 == r2) goto L_0x0035
        L_0x0034:
            r10 = 0
        L_0x0035:
            r3 = 0
            r5 = 0
            r1 = 0
        L_0x0038:
            if (r5 >= r7) goto L_0x0043
            r0 = r14[r5]
            if (r0 <= 0) goto L_0x0040
            int r1 = r1 + 1
        L_0x0040:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0043:
            r14 = r24
            r7 = r25
            r5 = r30
            if (r31 != 0) goto L_0x0050
            if (r1 <= r2) goto L_0x004f
            if (r12 >= r13) goto L_0x0081
        L_0x004f:
            r3 = 1
        L_0x0050:
            if (r12 > 0) goto L_0x0081
            com.instagram.common.ui.base.IgTextView r0 = r7.A0C
            r9 = 8
            r0.setVisibility(r9)
        L_0x0059:
            if (r10 == 0) goto L_0x00ee
            X.3yf r0 = r6.BxM()
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r0.BxQ()
            if (r0 == 0) goto L_0x00fa
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c1
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            X.50R r0 = X.AnonymousClass50Q.A00(r0)
            r9.add(r0)
            goto L_0x006f
        L_0x0081:
            com.instagram.common.ui.base.IgTextView r1 = r7.A0C
            r1.setVisibility(r4)
            X.GL3 r0 = new X.GL3
            r0.<init>(r9, r5, r6, r3)
            r18 = r29
            r15 = r11
            r16 = r6
            r17 = r0
            r19 = r2
            r20 = r4
            java.lang.CharSequence r0 = X.AnonymousClass3YY.A01(r14, r15, r16, r17, r18, r19, r20)
            X.DbX.A1G(r1, r0)
            r1.setLongClickable(r4)
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            if (r10 == 0) goto L_0x00a8
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
        L_0x00a8:
            r1.setTextAppearance(r0)
            X.ICA r0 = new X.ICA
            r15 = r0
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r1
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r0, r1)
            r9 = 8
            goto L_0x0059
        L_0x00c1:
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            int r19 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r15 = 0
            r21 = r2
            r22 = r2
            r17 = r8
            r18 = r9
            r20 = r2
            android.graphics.drawable.Drawable r2 = X.C244283aw.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            android.widget.ImageView r1 = r7.A01
            X.IBk r0 = new X.IBk
            r0.<init>(r4, r5, r6, r3)
            X.AnonymousClass0fU.A00(r0, r1)
            r1.setImageDrawable(r2)
            r1.setVisibility(r4)
            return
        L_0x00ee:
            android.widget.ImageView r1 = r7.A01
            r1.setVisibility(r9)
            r0 = 0
            r1.setImageDrawable(r0)
            r1.setOnClickListener(r0)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0O.A00(android.content.Context, X.HpB, com.instagram.common.session.UserSession, X.4jz, java.lang.String, X.0sP, X.0sL, boolean):void");
    }
}
