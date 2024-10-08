package X;

/* renamed from: X.On7  reason: case insensitive filesystem */
public final class C71570On7 implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public C71570On7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r1.hasFieldValue(r0) != r2) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        ((X.C74408PuO) r6.A01).onSuccess();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0089;
                case 2: goto L_0x0047;
                case 3: goto L_0x0039;
                case 4: goto L_0x0066;
                case 5: goto L_0x0058;
                case 6: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r5 = r6.A01
            X.O7L r5 = (X.O7L) r5
            X.3lr r4 = X.C41845B3m.A0U(r7)
            if (r4 == 0) goto L_0x000a
            java.lang.Class<X.BjX> r2 = X.BjX.class
            r3 = 0
            java.lang.String r1 = "xfb_ig_p2m_get_orders(buyer_id:$buyerID,merchant_id:$merchantID)"
            r0 = -1342703181(0xffffffffaff7f9b3, float:-4.510646E-10)
            com.google.common.collect.ImmutableList r2 = r4.getRequiredCompactedTreeListField(r3, r1, r2, r0)
            X.0qQ.A0B(r2, r3)
            X.OF3 r0 = r5.A00
            r0.A00 = r2
            X.O77 r1 = r0.A03
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x000a
            X.NJY r1 = r1.A00
            r0 = 1
            r1.A0h = r0
            X.NJY.A0F(r1)
            return
        L_0x0039:
            java.lang.Object r1 = r7.Bny()
            if (r1 == 0) goto L_0x000a
            java.lang.Object r0 = r6.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)     // Catch:{ Exception -> 0x000a }
            goto L_0x0091
        L_0x0047:
            java.lang.Object r2 = r6.A01
            X.NJe r2 = (X.C68466NJe) r2
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x000a
            X.PYI r0 = new X.PYI
            r0.<init>(r7, r2)
            r1.post(r0)
            return
        L_0x0058:
            r2 = 1
            if (r7 == 0) goto L_0x0081
            java.lang.Object r1 = r7.Bny()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "update_scf_string_settings(new_value:$new_value,setting_key:$setting_key)"
            goto L_0x0073
        L_0x0066:
            r2 = 1
            if (r7 == 0) goto L_0x0081
            java.lang.Object r1 = r7.Bny()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "update_scf_bool_settings(new_value:$new_value,setting_key:$setting_key)"
        L_0x0073:
            boolean r0 = r1.hasFieldValue(r0)
            if (r0 != r2) goto L_0x0081
            java.lang.Object r0 = r6.A01
            X.PuO r0 = (X.C74408PuO) r0
            r0.onSuccess()
            return
        L_0x0081:
            java.lang.Object r0 = r6.A01
            X.PuO r0 = (X.C74408PuO) r0
            r0.onFailure()
            return
        L_0x0089:
            java.lang.Object r0 = r6.A01
            X.2IR r0 = (X.2IR) r0
            r0.onSuccess(r7)
            return
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71570On7.invoke(X.3JD):void");
    }
}
