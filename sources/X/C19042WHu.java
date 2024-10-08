package X;

/* renamed from: X.WHu  reason: case insensitive filesystem */
public final class C19042WHu implements AnonymousClass2Kv {
    public final /* synthetic */ String A00;
    public final /* synthetic */ boolean A01;

    public C19042WHu(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0137, code lost:
        if (r13 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013b, code lost:
        if (r13 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x013f, code lost:
        if (r13 != null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        if (r13 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014b, code lost:
        if (r13 != null) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r13) {
        /*
            r12 = this;
            X.SR1 r4 = X.SR1.A04
            android.view.View r1 = X.SR1.A01
            if (r1 == 0) goto L_0x0012
            r0 = 2131443964(0x7f0b40fc, float:1.851001E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setBackgroundColor(r0)
        L_0x0012:
            if (r13 == 0) goto L_0x002a
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x002a
            X.URg r1 = r0.A0E()
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "strong_id__"
            java.lang.String r2 = r1.A09(r0)
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r2 = r12.A00
        L_0x002c:
            X.SR1.A00()
            android.view.View r1 = X.SR1.A01
            if (r1 == 0) goto L_0x003f
            r0 = 2131441168(0x7f0b3610, float:1.850434E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r0 == 0) goto L_0x003f
            r0.setText(r2)
        L_0x003f:
            java.lang.String r9 = "Time-spent"
            r10 = 0
            if (r13 == 0) goto L_0x0145
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x0145
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x0145
            X.UQy r2 = r0.A0E()
            if (r2 == 0) goto L_0x0145
            r1 = 1
            java.lang.String r0 = "legacy"
            java.lang.Integer r5 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x005f:
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x014a
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x014a
            X.UQy r2 = r0.A0E()
            if (r2 == 0) goto L_0x014a
            r1 = 0
            java.lang.String r0 = "snapl"
            java.lang.Integer r6 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x007a:
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x014f
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x014f
            X.UQy r1 = r0.A0E()
            if (r1 == 0) goto L_0x014f
            java.lang.String r0 = "frame_based"
            int r0 = r1.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0098:
            boolean r3 = r12.A01
            if (r3 == 0) goto L_0x0142
            if (r13 == 0) goto L_0x0142
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x0142
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x0142
            X.UQy r2 = r0.A0E()
            if (r2 == 0) goto L_0x0142
            r1 = 3
            java.lang.String r0 = "viper"
            java.lang.Integer r8 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x00b9:
            r4.A02(r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0135
            java.lang.String r11 = "Viewable time-spent"
            if (r13 == 0) goto L_0x0136
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x0136
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x0136
            X.UQz r2 = r0.A0F()
            if (r2 == 0) goto L_0x0136
            r1 = 1
            java.lang.String r0 = "legacy"
            java.lang.Integer r7 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x00dd:
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x013a
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x013a
            X.UQz r2 = r0.A0F()
            if (r2 == 0) goto L_0x013a
            r1 = 0
            java.lang.String r0 = "snapl"
            java.lang.Integer r8 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x00f8:
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x013e
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x013e
            X.UQz r1 = r0.A0F()
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = "frame_based"
            int r0 = r1.A00(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0116:
            java.lang.Object r0 = r13.Bny()
            X.URf r0 = (X.C15142URf) r0
            if (r0 == 0) goto L_0x0131
            X.URg r0 = r0.A0E()
            if (r0 == 0) goto L_0x0131
            X.UQz r2 = r0.A0F()
            if (r2 == 0) goto L_0x0131
            r1 = 3
            java.lang.String r0 = "viper"
            java.lang.Integer r10 = X.C41846B3n.A0g(r2, r0, r1)
        L_0x0131:
            r6 = r4
            r6.A02(r7, r8, r9, r10, r11)
        L_0x0135:
            return
        L_0x0136:
            r7 = r10
            if (r13 == 0) goto L_0x013a
            goto L_0x00dd
        L_0x013a:
            r8 = r10
            if (r13 == 0) goto L_0x013e
            goto L_0x00f8
        L_0x013e:
            r9 = r10
            if (r13 == 0) goto L_0x0131
            goto L_0x0116
        L_0x0142:
            r8 = r10
            goto L_0x00b9
        L_0x0145:
            r5 = r10
            if (r13 == 0) goto L_0x014a
            goto L_0x005f
        L_0x014a:
            r6 = r10
            if (r13 == 0) goto L_0x014f
            goto L_0x007a
        L_0x014f:
            r7 = r10
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19042WHu.invoke(X.3JD):void");
    }
}
