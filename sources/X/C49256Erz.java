package X;

/* renamed from: X.Erz  reason: case insensitive filesystem */
public abstract class C49256Erz {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011e, code lost:
        if (r12 != null) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r9, android.view.View.OnClickListener r10, X.1R7 r11, X.AnonymousClass0iw r12, com.instagram.common.typedurl.ImageUrl r13, java.lang.Boolean r14, java.lang.Integer r15) {
        /*
            X.8ab r0 = X.DbS.A0Y(r9)
            r8 = 1
            r0.A0r(r8)
            android.app.Dialog r2 = r0.A02()
            r0 = 2131629900(0x7f0e174c, float:1.8887134E38)
            r2.setContentView(r0)
            r0 = 2131443576(0x7f0b3f78, float:1.8509224E38)
            android.view.View r5 = r2.findViewById(r0)
            r5.getClass()
            com.instagram.common.ui.widget.imageview.IgImageView r5 = (com.instagram.common.ui.widget.imageview.IgImageView) r5
            r0 = 2131440973(0x7f0b354d, float:1.8503944E38)
            android.view.View r1 = r2.findViewById(r0)
            r1.getClass()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r1
            r0 = 2131444103(0x7f0b4187, float:1.8510293E38)
            android.view.View r6 = r2.findViewById(r0)
            r6.getClass()
            r3 = 2131444102(0x7f0b4186, float:1.851029E38)
            android.view.View r4 = r2.findViewById(r3)
            r4.getClass()
            X.FJm r0 = new X.FJm
            r0.<init>(r8)
            r2.setOnDismissListener(r0)
            r0 = 24
            X.C50109FOz.A00(r6, r0, r2)
            r2.setCancelable(r8)
            r2.setCanceledOnTouchOutside(r8)
            r0 = 42
            X.FP7.A00(r4, r0, r2, r10)
            r0 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.view.View r6 = r2.findViewById(r0)
            r6.getClass()
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131442063(0x7f0b398f, float:1.8506155E38)
            android.view.View r4 = r2.findViewById(r0)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r3 = r2.findViewById(r3)
            r3.getClass()
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r7 = r15.intValue()
            r0 = 2
            if (r7 == r0) goto L_0x0110
            r0 = 0
            if (r7 == r0) goto L_0x00ed
            if (r7 == r8) goto L_0x008d
            r0 = 4
            if (r7 == r0) goto L_0x008d
            r0 = 3
            if (r7 == r0) goto L_0x008d
        L_0x0089:
            X.AnonymousClass0fN.A00(r2)
            return
        L_0x008d:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 333(0x14d, float:4.67E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.util.Set r0 = r11.A0C
            boolean r0 = r0.contains(r1)
            android.content.Context r1 = r5.getContext()
            if (r0 == 0) goto L_0x00d7
            r0 = 2131237835(0x7f081bcb, float:1.8091932E38)
            X.DbU.A13(r1, r5, r0)
            java.lang.String r5 = r11.A06
            if (r5 == 0) goto L_0x00cb
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00cb
        L_0x00b4:
            r0 = 2131976997(0x7f136325, float:1.959113E38)
            r6.setText(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131976996(0x7f136324, float:1.9591128E38)
            X.DbY.A0y(r1, r4, r5, r0)
            r0 = 2131976995(0x7f136323, float:1.9591126E38)
        L_0x00c7:
            r3.setText(r0)
            goto L_0x0089
        L_0x00cb:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131976988(0x7f13631c, float:1.9591112E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x00b4
        L_0x00d7:
            r0 = 2131239963(0x7f08241b, float:1.8096248E38)
            X.DbU.A13(r1, r5, r0)
            r0 = 2131977003(0x7f13632b, float:1.9591142E38)
            r6.setText(r0)
            r0 = 2131976987(0x7f13631b, float:1.959111E38)
            r4.setText(r0)
            r0 = 2131977002(0x7f13632a, float:1.959114E38)
            goto L_0x00c7
        L_0x00ed:
            if (r14 == 0) goto L_0x0089
            boolean r0 = r14.booleanValue()
            if (r0 == 0) goto L_0x00fd
            r1.A04()
        L_0x00f8:
            if (r13 == 0) goto L_0x0104
            if (r12 == 0) goto L_0x0104
            goto L_0x0120
        L_0x00fd:
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            r1.setGradientColors((int) r0)
            goto L_0x00f8
        L_0x0104:
            android.content.Context r1 = r5.getContext()
            r0 = 2131239963(0x7f08241b, float:1.8096248E38)
            X.DbU.A13(r1, r5, r0)
            goto L_0x0089
        L_0x0110:
            r0 = 2131976994(0x7f136322, float:1.9591124E38)
            r6.setText(r0)
            r0 = 2131976993(0x7f136321, float:1.9591122E38)
            r3.setText(r0)
            if (r13 == 0) goto L_0x0089
            if (r12 == 0) goto L_0x0089
        L_0x0120:
            r5.setUrl(r13, r12)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49256Erz.A00(android.content.Context, android.view.View$OnClickListener, X.1R7, X.0iw, com.instagram.common.typedurl.ImageUrl, java.lang.Boolean, java.lang.Integer):void");
    }
}
