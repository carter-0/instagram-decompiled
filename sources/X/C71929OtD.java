package X;

/* renamed from: X.OtD  reason: case insensitive filesystem */
public final class C71929OtD implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71929OtD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r29) {
        /*
            r28 = this;
            r9 = r28
            r3 = r29
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x028a;
                case 1: goto L_0x005d;
                case 2: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            r0 = 1076038085(0x402309c5, float:2.5474713)
            int r8 = X.AnonymousClass0fD.A03(r0)
            X.INl r3 = (X.C57071INl) r3
            r0 = -538548646(0xffffffffdfe6665a, float:-3.3204112E19)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Integer r0 = r3.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x002e;
                case 2: goto L_0x003a;
                case 3: goto L_0x0055;
                case 4: goto L_0x0042;
                case 5: goto L_0x0023;
                case 6: goto L_0x002e;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = 52401853(0x31f96bd, float:4.689894E-37)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1861763590(0x6ef84206, float:3.841605E28)
            goto L_0x039b
        L_0x002e:
            java.lang.Object r0 = r9.A02
            X.OFS r0 = (X.OFS) r0
            X.343 r0 = r0.A03
            if (r0 == 0) goto L_0x0023
            r0.A01()
            goto L_0x0023
        L_0x003a:
            java.lang.Object r0 = r9.A01
            X.3om r0 = (X.C252233om) r0
            r0.onPause()
            goto L_0x0023
        L_0x0042:
            java.lang.Object r3 = r9.A02
            X.OFS r3 = (X.OFS) r3
            X.1Ng r2 = r3.A01
            java.lang.Class<X.INl> r1 = X.C57071INl.class
            X.OtD r0 = r3.A00
            r2.A02(r0, r1)
            X.NMW r0 = r3.A02
            r0.onDestroy()
            goto L_0x0023
        L_0x0055:
            java.lang.Object r0 = r9.A01
            X.3om r0 = (X.C252233om) r0
            r0.onResume()
            goto L_0x0023
        L_0x005d:
            r0 = 634139494(0x25cc3366, float:3.5423188E-16)
            int r8 = X.AnonymousClass0fD.A03(r0)
            X.Osx r3 = (X.C71915Osx) r3
            r0 = -169329517(0xfffffffff5e83c93, float:-5.8878978E32)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            java.util.List r1 = r3.A04
            if (r1 == 0) goto L_0x0258
            java.lang.Object r6 = r9.A02
            X.Mz9 r6 = (X.C68042Mz9) r6
            java.lang.String r10 = r3.A02
            java.lang.String r4 = r3.A01
            X.Jw0 r5 = r3.A00
            java.lang.String r2 = r3.A03
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            if (r5 == 0) goto L_0x0189
            X.PID r3 = new X.PID
            r11 = r3
            r12 = r5
            r13 = r6
            r14 = r10
            r15 = r4
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            android.content.Context r0 = X.DbS.A07(r6)
            X.2tC r2 = X.AnonymousClass2t9.A00(r0)
            X.EGw r0 = new X.EGw
            r0.<init>(r3)
            X.2t9 r14 = X.DbU.A0U(r2, r0)
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            r3 = 0
            android.content.Context r2 = X.DbS.A07(r6)
            r0 = 2131966402(0x7f1339c2, float:1.9569641E38)
            java.lang.String r23 = X.AnonymousClass7TE.A16(r2, r0)
            r20 = 0
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            java.lang.String r24 = ""
            X.UO1 r0 = new X.UO1
            r21 = r20
            r25 = r24
            r26 = r20
            r27 = r7
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r4.A00(r0)
            java.util.Iterator r17 = r1.iterator()
        L_0x00d3:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r11 = r17.next()
            java.lang.String r11 = (java.lang.String) r11
            X.O7P r0 = r6.A09
            long r12 = (long) r3
            X.OsH r1 = r0.A00
            X.PPc r0 = r1.A02
            X.NPE r10 = r0.A01
            if (r10 == 0) goto L_0x0168
            X.OyY r2 = r1.A0F
            long r0 = r10.A00
            r21 = r0
            java.lang.Long r16 = java.lang.Long.valueOf(r12)
            java.lang.String r15 = r10.A01
            X.OO3 r13 = r2.A01
            if (r13 == 0) goto L_0x0168
            java.lang.String r12 = r13.A07
            if (r12 == 0) goto L_0x0168
            X.0wc r1 = r13.A0E
            java.lang.String r0 = "universal_search_impression"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x0168
            X.N1E r2 = new X.N1E
            r2.<init>()
            java.lang.String r1 = r13.A06
            java.lang.String r0 = "query_string"
            r2.A06(r0, r1)
            X.Nmn r1 = X.C69505Nmn.A0D
            java.lang.String r0 = "result_type"
            r2.A01(r1, r0)
            r0 = r21
            X.C66583MXo.A1A(r2, r0)
            java.lang.String r0 = "search_result"
            r10.AAK(r2, r0)
            r2 = 1
            X.Nmm r1 = X.C69504Nmm.A08
            java.lang.String r0 = "ui_section"
            r10.A8M(r1, r0)
            X.C66580MXl.A1H(r10, r12)
            X.NmD r0 = X.C69469NmD.SERVER_ENTITIES_NAMED_DSQ1
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C66584MXp.A0y(r10, r0, r7)
            java.lang.String r1 = "ui_section_index"
            r0 = r16
            r10.A9F(r1, r0)
            java.lang.String r0 = "bot_response_id"
            r10.AAJ(r0, r15)
            com.instagram.common.session.UserSession r0 = r13.A0F
            java.lang.String r0 = X.C3262475z.A00(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.util.List r1 = X.C66582MXn.A10(r0)
            java.lang.String r0 = "recipient_ids"
            r10.AAe(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "is_clickable"
            r10.A7p(r0, r1)
            r10.Cgf()
        L_0x0168:
            int r3 = r3 + 1
            X.UO1 r0 = new X.UO1
            r19 = r0
            r21 = r20
            r22 = r20
            r23 = r11
            r27 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r4.A00(r0)
            goto L_0x00d3
        L_0x017e:
            r14.A05(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r6.A04
            r0.setAdapter(r14)
            r0.setVisibility(r7)
        L_0x0189:
            java.lang.Object r9 = r9.A01
            r10 = 0
            if (r5 == 0) goto L_0x0258
            java.lang.String r13 = r5.A03
            if (r13 == 0) goto L_0x0258
            com.instagram.common.session.UserSession r4 = r6.A07
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328091815132089(0x81103500023bb9, double:3.037369773149348E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0258
            android.view.View r1 = r6.itemView
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0279
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgLinearLayout
            if (r0 == 0) goto L_0x0276
            com.instagram.common.ui.base.IgLinearLayout r1 = (com.instagram.common.ui.base.IgLinearLayout) r1
        L_0x01bd:
            r6.A02 = r1
        L_0x01bf:
            com.instagram.common.ui.base.IgLinearLayout r11 = r6.A02
            if (r11 == 0) goto L_0x0258
            r0 = 2131440797(0x7f0b349d, float:1.8503588E38)
            android.widget.ImageView r12 = X.DbX.A0J(r11, r0)
            android.widget.TextView r1 = X.C66582MXn.A0F(r11)
            r0 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r11, r0)
            X.Nkb r0 = X.C69397Nkb.GOOGLE
            boolean r0 = X.Dba.A1X(r0, r13)
            if (r0 == 0) goto L_0x0265
            r0 = 2131238543(0x7f081e8f, float:1.8093368E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01e4:
            android.content.Context r13 = X.DbS.A07(r6)
            int r0 = r0.intValue()
            X.DbU.A13(r13, r12, r0)
        L_0x01ef:
            java.lang.String r0 = r5.A04
            r1.setText(r0)
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x0200
            android.net.Uri r0 = X.0cp.A03(r1)
            java.lang.String r10 = r0.getHost()
        L_0x0200:
            r2.setText(r10)
            if (r1 == 0) goto L_0x0218
            X.3NG r2 = X.AnonymousClass7TE.A0m(r11)
            r1 = 4
            X.NQw r0 = new X.NQw
            r0.<init>(r1, r5, r6)
            r2.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A05 = r0
            r2.A00()
        L_0x0218:
            java.lang.Object r0 = r5.A00
            java.util.List r0 = (java.util.List) r0
            r2 = 1
            if (r0 == 0) goto L_0x0258
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0258
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0258
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0258
            r0 = 36328091815197626(0x81103500033bba, double:3.037369773190794E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0258
            android.view.View r1 = r6.itemView
            r0 = 2131436288(0x7f0b2300, float:1.8494442E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            r4.setVisibility(r7)
            X.30J r0 = X.AnonymousClass30J.SECONDS
            long r1 = X.AnonymousClass30K.A03(r0, r2)
            r3 = 11
            X.PqU r0 = new X.PqU
            r0.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r9, (java.lang.Object) r6)
            X.AnonymousClass0mH.A00(r4, r0, r1)
        L_0x0258:
            r1 = -1829790912(0xffffffff92ef9b40, float:-1.5121293E-27)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            r0 = -561362578(0xffffffffde8a496e, float:-4.9823083E18)
            goto L_0x039b
        L_0x0265:
            X.Nkb r0 = X.C69397Nkb.BING
            boolean r0 = X.Dba.A1X(r0, r13)
            if (r0 == 0) goto L_0x01ef
            r0 = 2131238542(0x7f081e8e, float:1.8093366E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e4
        L_0x0276:
            r1 = r10
            goto L_0x01bd
        L_0x0279:
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgLinearLayout
            if (r0 == 0) goto L_0x0288
            com.instagram.common.ui.base.IgLinearLayout r1 = (com.instagram.common.ui.base.IgLinearLayout) r1
        L_0x027f:
            r6.A02 = r1
            if (r1 == 0) goto L_0x01bf
            r1.setVisibility(r7)
            goto L_0x01bf
        L_0x0288:
            r1 = r10
            goto L_0x027f
        L_0x028a:
            r0 = -257586192(0xfffffffff0a58bf0, float:-4.098736E29)
            int r8 = X.AnonymousClass0fD.A03(r0)
            X.Ost r3 = (X.C71911Ost) r3
            r0 = 1251609765(0x4a9a0ca5, float:5047890.5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r7 = r9.A02
            X.Mz9 r7 = (X.C68042Mz9) r7
            com.facebook.shimmer.ShimmerFrameLayout r0 = r7.A05
            r0.A03()
            r5 = 8
            r0.setVisibility(r5)
            java.lang.String r11 = r3.A01
            if (r11 == 0) goto L_0x0300
            com.instagram.common.ui.text.ExpandableTextView r4 = r7.A08
            r4.setVisibility(r6)
            java.lang.Object r10 = r9.A01
            X.NPE r10 = (X.NPE) r10
            r10.A02 = r11
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x039f
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r1 = r0.length()
            java.lang.CharSequence r0 = r4.getText()
            int r0 = r0.length()
            if (r1 <= r0) goto L_0x039f
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x039f
            android.view.View r0 = r7.itemView
            int r11 = r0.getWidth()
            java.lang.String r10 = r10.A02
            if (r10 != 0) goto L_0x02e1
            java.lang.String r10 = ""
        L_0x02e1:
            android.content.Context r1 = X.DbS.A07(r7)
            r0 = 2131966401(0x7f1339c1, float:1.956964E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            android.text.SpannableStringBuilder r0 = r4.A00(r10, r0, r11)
            r4.setText(r0)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0300
            X.O7P r0 = r7.A09
            X.OsH r0 = r0.A00
            X.OyY r0 = r0.A0F
            r0.A05(r5)
        L_0x0300:
            java.lang.Object r5 = r9.A01
            X.NPE r5 = (X.NPE) r5
            r4 = 1
            r5.A03 = r4
            java.lang.String r0 = r3.A00
            r5.A01 = r0
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0392
            X.O7P r0 = r7.A09
            X.OsH r1 = r0.A00
            X.PPc r0 = r1.A02
            X.NPE r7 = r0.A01
            if (r7 == 0) goto L_0x0390
            X.OyY r3 = r1.A0F
            long r0 = r7.A00
            java.lang.String r9 = r7.A01
            X.OO3 r7 = r3.A01
            if (r7 == 0) goto L_0x0390
            java.lang.String r12 = r7.A07
            if (r12 == 0) goto L_0x0390
            X.0wc r10 = r7.A0E
            java.lang.String r3 = "universal_search_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r10, r3)
            boolean r10 = r3.isSampled()
            if (r10 == 0) goto L_0x0390
            X.N1E r13 = new X.N1E
            r13.<init>()
            java.lang.String r11 = r7.A06
            java.lang.String r10 = "query_string"
            r13.A06(r10, r11)
            X.Nmn r11 = X.C69505Nmn.A0C
            java.lang.String r10 = "result_type"
            r13.A01(r11, r10)
            X.C66583MXo.A1A(r13, r0)
            java.lang.String r0 = "search_result"
            r3.AAK(r13, r0)
            X.Nmm r1 = X.C69504Nmm.A08
            java.lang.String r0 = "ui_section"
            r3.A8M(r1, r0)
            X.C66580MXl.A1H(r3, r12)
            X.NmD r0 = X.C69469NmD.SERVER_ENTITIES_NAMED_DSQ1
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C66584MXp.A0y(r3, r0, r6)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "ui_section_index"
            r3.A9F(r0, r1)
            java.lang.String r0 = "bot_response_id"
            r3.AAJ(r0, r9)
            com.instagram.common.session.UserSession r0 = r7.A0F
            java.lang.String r0 = X.C3262475z.A00(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.util.List r1 = X.C66582MXn.A10(r0)
            java.lang.String r0 = "recipient_ids"
            r3.AAe(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_clickable"
            r3.A7p(r0, r1)
            r3.Cgf()
        L_0x0390:
            r5.A04 = r4
        L_0x0392:
            r0 = 1536667816(0x5b97b0a8, float:8.5393914E16)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -504511852(0xffffffffe1edc294, float:-5.482374E20)
        L_0x039b:
            X.AnonymousClass0fD.A0A(r0, r8)
            return
        L_0x039f:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r1 = r0.length()
            java.lang.CharSequence r0 = r4.getText()
            int r0 = r0.length()
            if (r1 <= r0) goto L_0x0300
            r4.A03 = r6
            java.lang.String r0 = r10.A02
            r4.setText(r0)
            goto L_0x0300
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71929OtD.onEvent(java.lang.Object):void");
    }
}
