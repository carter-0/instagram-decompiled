package X;

/* renamed from: X.IkO  reason: case insensitive filesystem */
public final class C58031IkO implements 02o {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C58031IkO(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r15.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00b4;
                case 3: goto L_0x0098;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r15 = (java.util.List) r15
            r3 = 0
            if (r15 == 0) goto L_0x0011
            boolean r1 = r15.isEmpty()     // Catch:{ Exception -> 0x007e }
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 != 0) goto L_0x0151
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x007e }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ Exception -> 0x007e }
        L_0x001c:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ Exception -> 0x007e }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ Exception -> 0x007e }
            X.4sL r0 = X.C275974sH.parseFromJson(r0)     // Catch:{ Exception -> 0x007e }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x007e }
            r4.add(r0)     // Catch:{ Exception -> 0x007e }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r5 = r14.A01     // Catch:{ Exception -> 0x007e }
            X.GBE r5 = (X.GBE) r5     // Catch:{ Exception -> 0x007e }
            X.0sa r2 = r5.A20     // Catch:{ Exception -> 0x007e }
            java.lang.Object r1 = r2.invoke()     // Catch:{ Exception -> 0x007e }
            X.GD6 r1 = (X.GD6) r1     // Catch:{ Exception -> 0x007e }
            com.instagram.common.session.UserSession r0 = r5.A0a     // Catch:{ Exception -> 0x007e }
            java.util.List r0 = X.C295325ny.A05(r0, r4)     // Catch:{ Exception -> 0x007e }
            r1.A0B(r0, r3)     // Catch:{ Exception -> 0x007e }
            X.GBg r0 = X.GD6.A01(r2)     // Catch:{ Exception -> 0x007e }
            java.util.List r0 = r0.A0I()     // Catch:{ Exception -> 0x007e }
            java.lang.String r4 = r14.A02     // Catch:{ Exception -> 0x007e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x007e }
            r1 = 0
        L_0x0059:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = X.C51971G9r.A0u(r2)     // Catch:{ Exception -> 0x007e }
            boolean r0 = X.0qQ.A0K(r0, r4)     // Catch:{ Exception -> 0x007e }
            if (r0 != 0) goto L_0x006d
            int r1 = r1 + 1
            goto L_0x0059
        L_0x006c:
            r1 = -1
        L_0x006d:
            if (r1 < 0) goto L_0x0076
            X.GBj r0 = X.C52050GCw.A07(r5)     // Catch:{ Exception -> 0x007e }
            r0.A0H(r1)     // Catch:{ Exception -> 0x007e }
        L_0x0076:
            X.GIn r0 = r5.A0E     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x0151
            r0.A03 = r3     // Catch:{ Exception -> 0x007e }
            goto L_0x0151
        L_0x007e:
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            r0 = 2169(0x879, float:3.04E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbT.A1Q(r2, r0, r1)
            java.lang.Object r0 = r14.A01
            X.GBE r0 = (X.GBE) r0
            X.GIn r0 = r0.A0E
            if (r0 == 0) goto L_0x0151
            r0.A03 = r3
            goto L_0x0151
        L_0x0098:
            boolean r3 = X.AnonymousClass7TE.A1a(r15)
            java.lang.Object r0 = r14.A01
            X.GgG r0 = (X.C52963GgG) r0
            X.3ju r2 = r0.A0A
            java.lang.String r1 = r14.A02
            X.H32 r0 = new X.H32
            r0.<init>(r1, r3)
            r1 = r16
            java.lang.Object r1 = r2.ELH(r0, r1)
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x0151
            return r1
        L_0x00b4:
            X.HtN r15 = (X.C56135HtN) r15
            java.util.List r1 = r15.A05
            X.I1f r3 = r15.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r5 = r14.A01
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r5 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r5
            java.lang.String r6 = r14.A02
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x00ce:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r4.next()
            X.Hsj r0 = (X.C56096Hsj) r0
            int r2 = r0.A00
            X.Hsk r1 = r0.A01
            X.IdH r0 = new X.IdH
            r0.<init>(r1, r2)
            r11.add(r0)
            goto L_0x00ce
        L_0x00e7:
            java.lang.String r7 = r15.A02
            java.lang.String r8 = r15.A03
            java.lang.String r9 = r15.A04
            java.lang.String r10 = r15.A01
            r12 = 1
            r13 = r12
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A07(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x00f4:
            java.lang.Object r0 = r14.A01
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A04(r0, r3)
            goto L_0x0151
        L_0x00fc:
            X.9IA r15 = (X.AnonymousClass9IA) r15
            boolean r1 = r15.A03
            java.lang.Object r0 = r14.A01
            X.A7D r0 = (X.A7D) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A00
            if (r1 == 0) goto L_0x011d
            if (r3 == 0) goto L_0x0151
            android.view.View r0 = r0.A04
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131971309(0x7f134ced, float:1.9579594E38)
            java.lang.String r0 = r14.A02
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
        L_0x0119:
            r3.setText(r0)
            goto L_0x0151
        L_0x011d:
            if (r3 == 0) goto L_0x0151
            android.view.View r0 = r0.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971308(0x7f134cec, float:1.9579592E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            goto L_0x0119
        L_0x012d:
            X.I1E r0 = X.I1E.A00
            boolean r0 = X.0qQ.A0K(r15, r0)
            if (r0 == 0) goto L_0x0154
            X.6ap r1 = X.DbV.A0X()
            java.lang.String r0 = "creatorai_fact_list_error"
            r1.A0H = r0
            java.lang.String r0 = r14.A02
            r1.A0D = r0
            X.DbY.A1N(r1)
        L_0x0144:
            java.lang.Object r0 = r14.A01
            X.H2d r0 = (X.C54183H2d) r0
            X.H2T r0 = r0.A01
            X.05G r1 = r0.A02
            X.I1F r0 = X.I1F.A00
            r1.Epw(r0)
        L_0x0151:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0154:
            X.I1F r0 = X.I1F.A00
            boolean r0 = X.0qQ.A0K(r15, r0)
            if (r0 != 0) goto L_0x0144
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58031IkO.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
