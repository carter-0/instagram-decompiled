package X;

/* renamed from: X.9is  reason: invalid class name and case insensitive filesystem */
public final class C385399is extends 1P0 {
    public final /* synthetic */ C3509887d A00;

    public C385399is(C3509887d r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015c, code lost:
        if (r0 != null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017a, code lost:
        if (r0 != null) goto L_0x017c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r28
            r0 = 166303925(0x9e998b5, float:5.6236315E-33)
            int r20 = X.AnonymousClass0fD.A03(r0)
            X.371 r1 = (X.AnonymousClass371) r1
            r0 = -1851282931(0xffffffff91a7aa0d, float:-2.6452756E-28)
            int r19 = X.AnonymousClass0fD.A03(r0)
            r0 = r27
            X.87d r3 = r0.A00
            java.lang.Object r5 = r1.FH3()
            X.PwO r5 = (X.C74529PwO) r5
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.87G r0 = X.C3509887d.A00(r3)
            r2.add(r0)
            X.JxQ r5 = (X.C61114JxQ) r5
            java.util.List r0 = r5.A00
            java.util.Iterator r18 = r0.iterator()
            r17 = 0
        L_0x0039:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r9 = r18.next()
            X.MWK r9 = (X.MWK) r9
            X.JxP r9 = (X.C61113JxP) r9
            java.lang.String r6 = r9.A04
            java.lang.String r0 = "quick_snap_dial_users"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x009c
            java.util.List r0 = r9.A05
            java.util.Iterator r7 = r0.iterator()
        L_0x0057:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r6 = r7.next()
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.87G r0 = r3.A00
            if (r0 == 0) goto L_0x0077
            java.lang.String r5 = r6.getId()
            java.lang.String r0 = r0.getId()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0077
            r17 = 1
        L_0x0077:
            X.87I r11 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_MEMBER
            java.lang.String r15 = r6.getUsername()
            com.instagram.common.typedurl.ImageUrl r12 = r6.Bh3()
            r9 = 0
            X.8YE r5 = new X.8YE
            r8 = r5
            r10 = r9
            r13 = r9
            r14 = r9
            r16 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r6.getId()
            r5.A07 = r0
            X.87G r0 = new X.87G
            r0.<init>(r5)
            r1.add(r0)
            goto L_0x0057
        L_0x009c:
            android.content.Context r10 = r3.A04
            android.content.res.Resources r5 = r10.getResources()
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r8 = r5.getDimensionPixelSize(r0)
            int r7 = X.AnonymousClass879.A00(r10)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = (float) r7
            float r0 = r0 * r5
            int r0 = (int) r0
            X.8vV r5 = new X.8vV
            r5.<init>(r10, r8)
            java.lang.String r8 = r9.A03
            if (r8 == 0) goto L_0x00c3
            X.AnonymousClass7TF.A1A(r5, r8)
            float r0 = (float) r0
            r5.A0A(r0)
        L_0x00c3:
            int r0 = r5.A0A
            int r7 = r7 - r0
            int r0 = r7 / 2
            r23 = r0
            X.87I r16 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST
            boolean r7 = r9.A08
            if (r7 != 0) goto L_0x010d
            java.util.List r15 = r9.A05
            int r6 = r9.A00
            r14 = 0
            r13 = 1
            X.0qQ.A0B(r15, r13)
            r12 = 0
            if (r6 == r13) goto L_0x0185
            r0 = 2
            if (r6 == r0) goto L_0x0143
            r11 = 3
            if (r6 == r11) goto L_0x0161
            r11 = 2131971092(0x7f134c14, float:1.9579154E38)
            java.lang.Object r14 = X.00k.A0O(r15, r14)
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            if (r14 == 0) goto L_0x0141
            java.lang.String r14 = r14.getUsername()
        L_0x00f1:
            java.lang.Object r13 = X.00k.A0O(r15, r13)
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            if (r13 == 0) goto L_0x00fd
            java.lang.String r12 = r13.getUsername()
        L_0x00fd:
            int r6 = r6 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r14, r12, r0}
        L_0x0106:
            java.lang.String r6 = r10.getString(r11, r6)
            X.0qQ.A07(r6)
        L_0x010d:
            r22 = 1
            java.util.Map r0 = X.ACW.A00
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r0)
        L_0x0119:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x019a
            java.util.Map$Entry r13 = X.AnonymousClass7TE.A1J(r14)
            java.lang.Object r11 = r13.getKey()
            java.util.Set r11 = (java.util.Set) r11
            android.text.Spannable r0 = r5.A0F
            java.lang.String r0 = r0.toString()
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0119
            java.lang.Object r11 = r13.getKey()
            java.lang.Object r0 = r13.getValue()
            r12.put(r11, r0)
            goto L_0x0119
        L_0x0141:
            r14 = r12
            goto L_0x00f1
        L_0x0143:
            r11 = 2131971091(0x7f134c13, float:1.9579152E38)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Object r0 = X.00k.A0O(r15, r14)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = r0.getUsername()
        L_0x0154:
            r6[r14] = r0
            java.lang.Object r0 = X.00k.A0O(r15, r13)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0180
            goto L_0x017c
        L_0x015f:
            r0 = r12
            goto L_0x0154
        L_0x0161:
            r11 = 2131971094(0x7f134c16, float:1.9579158E38)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Object r0 = X.00k.A0O(r15, r14)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = r0.getUsername()
        L_0x0172:
            r6[r14] = r0
            java.lang.Object r0 = X.00k.A0O(r15, r13)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0180
        L_0x017c:
            java.lang.String r12 = r0.getUsername()
        L_0x0180:
            r6[r13] = r12
            goto L_0x0106
        L_0x0183:
            r0 = r12
            goto L_0x0172
        L_0x0185:
            r11 = 2131971093(0x7f134c15, float:1.9579156E38)
            java.lang.Object r0 = X.00k.A0O(r15, r14)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0194
            java.lang.String r12 = r0.getUsername()
        L_0x0194:
            java.lang.Object[] r6 = new java.lang.Object[]{r12}
            goto L_0x0106
        L_0x019a:
            java.util.Collection r0 = r12.values()
            java.lang.Object r0 = X.00k.A0A(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01e7
            int r0 = r0.intValue()
        L_0x01aa:
            android.graphics.drawable.ShapeDrawable r0 = X.I7E.A03(r0)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r5}
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r5.<init>(r0)
            r21 = r5
            r24 = r23
            r25 = r23
            r26 = r23
            r21.setLayerInset(r22, r23, r24, r25, r26)
            X.8YE r10 = new X.8YE
            r0 = r16
            r10.<init>(r5, r0, r6)
            long r5 = r9.A01
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r10.A06 = r0
            java.util.List r0 = r9.A05
            r10.A08 = r0
            int r0 = r9.A00
            r10.A01 = r0
            r10.A0B = r7
            r10.A05 = r8
            X.87G r0 = new X.87G
            r0.<init>(r10)
            r4.add(r0)
            goto L_0x0039
        L_0x01e7:
            int r0 = X.AnonymousClass7TE.A09(r10)
            goto L_0x01aa
        L_0x01ec:
            r2.addAll(r4)
            X.87G r0 = X.C3509887d.A01(r3)
            r2.add(r0)
            X.87G r0 = r3.A00
            if (r0 == 0) goto L_0x01ff
            if (r17 != 0) goto L_0x01ff
            r2.add(r0)
        L_0x01ff:
            r2.addAll(r1)
            r3.A01 = r2
            X.87c r0 = r3.A07
            r0.D8d(r2)
            r1 = 945011129(0x3853b9b9, float:5.0479288E-5)
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = 1820135981(0x6c7d122d, float:1.22377626E27)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385399is.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(561217249, AnonymousClass0fD.A03(-614250741));
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1949573294);
        this.A00.A02 = true;
        AnonymousClass0fD.A0A(32533112, A03);
    }
}
