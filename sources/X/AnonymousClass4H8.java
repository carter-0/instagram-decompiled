package X;

/* renamed from: X.4H8  reason: invalid class name */
public abstract class AnonymousClass4H8 {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.C262794Ga r20, X.C262994Gu r21, X.AnonymousClass3W1 r22, com.instagram.feed.widget.IgProgressImageView r23, java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            r8 = 0
            r4 = r20
            X.0qQ.A0B(r4, r8)
            r0 = 2
            r3 = r21
            X.0qQ.A0B(r3, r0)
            r0 = 5
            r2 = r24
            X.0qQ.A0B(r2, r0)
            r0 = 6
            r1 = r25
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "open_carousel_prompt"
            boolean r0 = X.00p.A0i(r1, r0, r8)
            r5 = r23
            if (r0 != 0) goto L_0x003d
            X.3oV r0 = r4.A00
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x0037
            X.0eM r0 = r4.A0F
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
        L_0x0037:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            return
        L_0x003d:
            r9 = r19
            X.1E8 r0 = X.1E7.A00(r9)
            X.1Xj r2 = r0.A02(r2)
            X.0eM r7 = r4.A0F
            if (r2 == 0) goto L_0x03e1
            java.lang.Object r0 = r7.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r8)
            r0 = 0
            r5.setAlpha(r0)
            X.0Tu r12 = X.0Tu.A05
            r0 = 2342163288486518972(0x2081091a003320bc, double:4.06582267990295E-152)
            boolean r0 = X.182.A06(r12, r9, r0)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r6 = r7.getValue()
            android.view.View r6 = (android.view.View) r6
            X.GIa r5 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r0 = 102(0x66, float:1.43E-43)
            android.graphics.drawable.GradientDrawable r0 = r5.A01(r1, r0)
            r6.setBackground(r0)
        L_0x0078:
            java.lang.String r1 = r9.A06
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            r13 = 0
            if (r0 == 0) goto L_0x03de
            java.lang.String r0 = r0.getId()
        L_0x0087:
            boolean r1 = X.0qQ.A0K(r1, r0)
            r10 = r26
            X.C262794Ga.A02(r9, r4, r10)
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r11 = r0.CCd()
            r5 = 36320279271121067(0x81091a001920ab, double:3.032429088858188E-306)
            boolean r0 = X.182.A06(r12, r9, r5)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r13 = r2.A2o()
        L_0x00a5:
            r4.A03(r11, r13, r10)
            X.4Gw r6 = X.C263014Gw.A00
            boolean r17 = r6.A03(r9, r2)
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r16 = r0.CCd()
            if (r16 == 0) goto L_0x0122
            X.1Xy r0 = r2.A0C
            java.util.List r5 = r0.Aay()
            if (r5 == 0) goto L_0x03da
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
        L_0x00c3:
            if (r17 == 0) goto L_0x00c7
            if (r26 != 0) goto L_0x03c8
        L_0x00c7:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03c8
            int r15 = r0.size()
            r14 = 1
            X.0eM r11 = r4.A0D
            java.lang.Object r12 = r11.getValue()
            X.0qQ.A07(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.Object r5 = r7.getValue()
            android.view.View r5 = (android.view.View) r5
            android.content.res.Resources r13 = r5.getResources()
            if (r15 != r14) goto L_0x0392
            r5 = 2131968932(0x7f1343a4, float:1.9574773E38)
            java.lang.String r14 = r16.getUsername()
            java.lang.Object r0 = r0.get(r8)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getUsername()
            java.lang.String[] r0 = new java.lang.String[]{r14, r0}
            android.text.Spanned r0 = X.0bC.A01(r13, r0, r5)
            r12.setText(r0)
            java.lang.Object r0 = r11.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r8)
            java.lang.Object r5 = r11.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            X.DEE r0 = new X.DEE
            r0.<init>(r3, r2)
        L_0x011f:
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x0122:
            r11 = 8
            r0 = r22
            if (r17 == 0) goto L_0x0324
            X.0eM r5 = r4.A04
            java.lang.Object r5 = r5.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r11)
            X.1Xy r5 = r2.A0C
            com.instagram.user.model.User r12 = r5.CCd()
            if (r12 == 0) goto L_0x0190
            X.0eM r14 = r4.A06
            java.lang.Object r13 = r14.getValue()
            X.0qQ.A07(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            java.lang.Object r5 = r14.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            android.content.res.Resources r15 = r5.getResources()
            r6 = 2131968930(0x7f1343a2, float:1.9574769E38)
            java.lang.String r5 = r12.getUsername()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r15.getString(r6, r5)
            r13.setText(r5)
            java.lang.Object r5 = r14.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r8)
            X.0eM r5 = r4.A05
            java.lang.Object r5 = r5.getValue()
            X.0qQ.A07(r5)
            com.instagram.user.follow.FollowButtonBase r5 = (com.instagram.user.follow.FollowButtonBase) r5
            X.4at r6 = r5.A0J
            X.HGK r5 = new X.HGK
            r5.<init>(r9, r4, r2)
            r6.A07(r5)
            r6.A0Q = r8
            r5 = r18
            r6.A03(r5, r9, r12)
        L_0x0190:
            X.0eM r8 = r4.A03
        L_0x0192:
            java.lang.Object r5 = r8.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r11)
        L_0x019e:
            if (r26 == 0) goto L_0x01c4
            X.0eM r5 = r4.A0B
            java.lang.Object r6 = r5.getValue()
            X.0qQ.A07(r6)
            android.view.View r6 = (android.view.View) r6
            r5 = 8
        L_0x01ad:
            r6.setVisibility(r5)
        L_0x01b0:
            X.0eM r4 = r4.A07
            java.lang.Object r5 = r4.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            X.IBn r4 = new X.IBn
            r4.<init>(r3, r2, r0, r1)
            X.AnonymousClass0fU.A00(r4, r5)
            return
        L_0x01c4:
            X.1Xy r5 = r2.A0C
            com.instagram.user.model.User r10 = r5.CCd()
            if (r10 == 0) goto L_0x01b0
            X.1Xy r5 = r2.A0C
            java.util.List r5 = r5.Aay()
            if (r5 == 0) goto L_0x0320
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
        L_0x01d9:
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L_0x0219
            X.0eM r5 = r4.A0A
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            X.3b0 r8 = X.C262794Ga.A01(r4, r10, r5)
        L_0x01ef:
            X.0eM r7 = r4.A0B
            java.lang.Object r5 = r7.getValue()
            X.0qQ.A07(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5.setImageDrawable(r8)
            java.lang.Object r6 = r7.getValue()
            X.0qQ.A07(r6)
            android.view.View r6 = (android.view.View) r6
            X.DED r5 = new X.DED
            r5.<init>(r3, r2)
            X.AnonymousClass0fU.A00(r5, r6)
            java.lang.Object r6 = r7.getValue()
            X.0qQ.A07(r6)
            android.view.View r6 = (android.view.View) r6
            r5 = 0
            goto L_0x01ad
        L_0x0219:
            int r5 = r9.size()
            r6 = 1
            if (r5 != r6) goto L_0x0292
            r11 = 0
            com.instagram.user.model.User[] r5 = new com.instagram.user.model.User[]{r10}
            java.util.ArrayList r8 = X.0sr.A1M(r5)
            r8.addAll(r9)
            r5 = 10
            int r5 = X.0Yv.A1E(r8, r5)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x023b:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x024f
            java.lang.Object r5 = r8.next()
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            com.instagram.common.typedurl.ImageUrl r5 = r5.Bh3()
            r10.add(r5)
            goto L_0x023b
        L_0x024f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r8 = 2
            int r5 = r10.size()
            int r9 = java.lang.Math.min(r8, r5)
        L_0x025d:
            if (r11 >= r9) goto L_0x027b
            X.0eM r5 = r4.A0A
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r8 = r5.intValue()
            java.lang.Object r5 = r10.get(r11)
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            X.3ay r5 = X.C262794Ga.A00(r5, r4, r8)
            r12.add(r5)
            int r11 = r11 + 1
            goto L_0x025d
        L_0x027b:
            java.lang.Object r5 = r7.getValue()
            android.view.View r5 = (android.view.View) r5
            android.content.Context r9 = r5.getContext()
            X.0eM r7 = r4.A0A
            java.lang.Object r5 = r7.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r14 = r5.intValue()
            goto L_0x0307
        L_0x0292:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
            r8.add(r6, r10)
            r5 = 10
            int r5 = X.0Yv.A1E(r8, r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x02a9:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x02bd
            java.lang.Object r5 = r8.next()
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            com.instagram.common.typedurl.ImageUrl r5 = r5.Bh3()
            r11.add(r5)
            goto L_0x02a9
        L_0x02bd:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r10 = 0
            r8 = 3
            int r5 = r11.size()
            int r9 = java.lang.Math.min(r8, r5)
        L_0x02cc:
            if (r10 >= r9) goto L_0x02ef
            if (r10 != r6) goto L_0x02ec
            X.0eM r5 = r4.A0A
        L_0x02d2:
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r8 = r5.intValue()
            java.lang.Object r5 = r11.get(r10)
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            X.3ay r5 = X.C262794Ga.A00(r5, r4, r8)
            r12.add(r5)
            int r10 = r10 + 1
            goto L_0x02cc
        L_0x02ec:
            X.0eM r5 = r4.A0C
            goto L_0x02d2
        L_0x02ef:
            java.lang.Object r5 = r7.getValue()
            android.view.View r5 = (android.view.View) r5
            android.content.Context r9 = r5.getContext()
            X.0eM r5 = r4.A0A
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r14 = r5.intValue()
            X.0eM r7 = r4.A0C
        L_0x0307:
            java.lang.Object r5 = r7.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r15 = r5.intValue()
            r10 = 0
            r13 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.3b0 r8 = new X.3b0
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01ef
        L_0x0320:
            X.0sn r9 = X.0sn.A00
            goto L_0x01d9
        L_0x0324:
            X.0eM r5 = r4.A05
            java.lang.Object r5 = r5.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r11)
            X.0eM r5 = r4.A06
            java.lang.Object r5 = r5.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r11)
            boolean r5 = r6.A02(r9, r2)
            if (r5 == 0) goto L_0x036e
            X.0eM r8 = r4.A04
            java.lang.Object r6 = r8.getValue()
            X.0qQ.A07(r6)
            android.view.View r6 = (android.view.View) r6
            r5 = 1
            r6.setEnabled(r5)
            java.lang.Object r5 = r8.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            X.ICD r11 = new X.ICD
            r14 = r2
            r15 = r0
            r16 = r1
            r12 = r4
            r13 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.AnonymousClass0fU.A00(r11, r5)
            goto L_0x019e
        L_0x036e:
            X.0eM r5 = r4.A04
            java.lang.Object r5 = r5.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r11 = 0
            r5.setEnabled(r8)
            X.0eM r8 = r4.A03
            java.lang.Object r6 = r8.getValue()
            X.0qQ.A07(r6)
            android.view.View r6 = (android.view.View) r6
            X.IB5 r5 = new X.IB5
            r5.<init>(r9, r4, r2)
            X.AnonymousClass0fU.A00(r5, r6)
            goto L_0x0192
        L_0x0392:
            r5 = 2131968931(0x7f1343a3, float:1.957477E38)
            java.lang.String r14 = r16.getUsername()
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r14, r0}
            android.text.Spanned r0 = X.0bC.A01(r13, r0, r5)
            r12.setText(r0)
            java.lang.Object r0 = r11.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r8)
            java.lang.Object r5 = r11.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            X.DEF r0 = new X.DEF
            r0.<init>(r3, r2)
            goto L_0x011f
        L_0x03c8:
            X.0eM r0 = r4.A0D
            java.lang.Object r5 = r0.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x0122
        L_0x03da:
            X.0sn r0 = X.0sn.A00
            goto L_0x00c3
        L_0x03de:
            r0 = r13
            goto L_0x0087
        L_0x03e1:
            java.lang.Object r1 = r7.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4H8.A00(X.0iw, com.instagram.common.session.UserSession, X.4Ga, X.4Gu, X.3W1, com.instagram.feed.widget.IgProgressImageView, java.lang.String, java.lang.String, boolean):void");
    }
}
