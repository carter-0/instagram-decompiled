package X;

/* renamed from: X.ESy  reason: case insensitive filesystem */
public final class C48054ESy extends W7f {
    public final int A00;
    public final Object A01;

    public C48054ESy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a8, code lost:
        if (r2 == r1) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010c, code lost:
        r2.setCompoundDrawablesWithIntrinsicBounds(r4.A03, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0114, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0116, code lost:
        r0 = r0.A00;
        r3 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011a, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011c, code lost:
        r0 = r0.A07.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0122, code lost:
        r3.setEnabled(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        if (r6.length() <= 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b7, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e7, code lost:
        r0.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0126;
                case 1: goto L_0x01d4;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00d6;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x01a9;
                case 7: goto L_0x008d;
                case 8: goto L_0x019c;
                case 9: goto L_0x0195;
                case 10: goto L_0x00ac;
                case 11: goto L_0x0180;
                case 12: goto L_0x0049;
                case 13: goto L_0x0016;
                case 14: goto L_0x016d;
                case 15: goto L_0x0166;
                case 16: goto L_0x015e;
                case 17: goto L_0x0156;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.F2a r0 = (X.C49690F2a) r0
            X.EuA r0 = r0.A00
            if (r0 == 0) goto L_0x0015
            X.E75 r1 = r0.A00
            r0 = 0
            r1.A06 = r0
            X.E75.A01(r1)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r4 = r5.A01
            X.E3a r4 = (X.C47454E3a) r4
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x002e
            android.os.Handler r3 = r4.A0F
            java.lang.Runnable r2 = r4.A0G
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
        L_0x002e:
            X.F37 r0 = r4.A02
            r0.A00()
            com.instagram.registration.ui.NotificationBar r0 = r4.A05
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A06
            r0.A03()
            X.F2r r0 = r4.A01
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A07
            goto L_0x00aa
        L_0x0049:
            java.lang.Object r4 = r5.A01
            X.E3Z r4 = (X.E3Z) r4
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            r0.getClass()
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x0066
            android.os.Handler r3 = r4.A0F
            java.lang.Runnable r2 = r4.A0G
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
        L_0x0066:
            X.F37 r0 = r4.A02
            r0.A00()
            com.instagram.registration.ui.NotificationBar r0 = r4.A05
            r0.getClass()
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A06
            r0.getClass()
            r0.A03()
            X.F2r r0 = r4.A01
            r0.getClass()
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A07
            r3.getClass()
            goto L_0x00aa
        L_0x008d:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.E25 r0 = (X.E25) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r0.A0B
            if (r3 != 0) goto L_0x009d
            java.lang.String r0 = "confirmButton"
            goto L_0x01b7
        L_0x009d:
            int r2 = r6.length()
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r0.A0A
            if (r0 == 0) goto L_0x01d1
            int r1 = r0.A03
            r0 = 0
            if (r2 != r1) goto L_0x0122
        L_0x00aa:
            r0 = 1
            goto L_0x0122
        L_0x00ac:
            java.lang.Object r3 = r5.A01
            X.ENn r3 = (X.C47936ENn) r3
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x00cb
            r0 = 2131952526(0x7f13038e, float:1.9541497E38)
            r1.setText(r0)
            android.widget.TextView r2 = r3.A01
            android.app.Activity r1 = r3.getRootActivity()
            android.content.Context r0 = r3.requireContext()
            int r0 = X.2Yu.A08(r0)
            X.DbT.A17(r1, r2, r0)
        L_0x00cb:
            int r1 = r6.length()
            r0 = 2
            if (r1 < r0) goto L_0x0015
            X.DbS.A1D(r3)
            return
        L_0x00d6:
            java.lang.Object r4 = r5.A01
            X.F2l r4 = (X.C49700F2l) r4
            android.widget.EditText r0 = r4.A06
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r0)
            android.widget.EditText r2 = r4.A05
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r2)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0112
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0112
            r0 = 0
            r4.A01 = r0
            goto L_0x010c
        L_0x00f4:
            java.lang.Object r4 = r5.A01
            X.F2l r4 = (X.C49700F2l) r4
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0112
            android.widget.EditText r2 = r4.A06
            android.text.Editable r0 = r2.getText()
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            r0 = 6
            if (r1 < r0) goto L_0x0112
            r0 = 0
            r4.A02 = r0
        L_0x010c:
            android.graphics.drawable.Drawable r1 = r4.A03
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
        L_0x0112:
            X.EuB r0 = r4.A00
            if (r0 == 0) goto L_0x0015
            X.E4d r0 = r0.A00
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0015
            X.F2l r0 = r0.A07
            boolean r0 = r0.A00()
        L_0x0122:
            r3.setEnabled(r0)
            return
        L_0x0126:
            java.lang.Object r2 = r5.A01
            X.E58 r2 = (X.E58) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A03
            boolean r0 = X.Dba.A1V(r0)
            if (r0 != 0) goto L_0x0015
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A03
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x0015
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A03
            java.lang.String r0 = X.0nA.A0I(r0)
            boolean r0 = X.SCM.A00(r0)
            if (r0 == 0) goto L_0x01eb
            r0 = 0
            r2.A05 = r0
            r0 = 2131969202(0x7f1344b2, float:1.957532E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.EuV(r1, r0)
            return
        L_0x0156:
            java.lang.Object r0 = r5.A01
            X.E59 r0 = (X.E59) r0
            X.E59.A01(r0)
            return
        L_0x015e:
            java.lang.Object r0 = r5.A01
            X.EEK r0 = (X.EEK) r0
            r0.A02()
            return
        L_0x0166:
            java.lang.Object r0 = r5.A01
            X.F2u r0 = (X.C49709F2u) r0
            android.widget.ImageView r2 = r0.A06
            goto L_0x0173
        L_0x016d:
            java.lang.Object r0 = r5.A01
            X.F0L r0 = (X.F0L) r0
            android.widget.ImageView r2 = r0.A05
        L_0x0173:
            int r1 = r6.length()
            r0 = 8
            if (r1 <= 0) goto L_0x017c
            r0 = 0
        L_0x017c:
            r2.setVisibility(r0)
            return
        L_0x0180:
            java.lang.Object r0 = r5.A01
            X.E3V r0 = (X.E3V) r0
            android.os.Handler r3 = r0.A0L
            r1 = 1
            r3.removeMessages(r1)
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r0, r1)
            r0 = 250(0xfa, double:1.235E-321)
            r3.sendMessageDelayed(r2, r0)
            return
        L_0x0195:
            java.lang.Object r0 = r5.A01
            X.E3Y r0 = (X.E3Y) r0
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r0.A0N
            goto L_0x01e7
        L_0x019c:
            java.lang.Object r1 = r5.A01
            X.E3Y r1 = (X.E3Y) r1
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r1.A0O
            r0.A03()
            r0 = 1
            r1.A0V = r0
            return
        L_0x01a9:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.E2r r0 = (X.C47445E2r) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r0.A02
            if (r2 != 0) goto L_0x01bf
            java.lang.String r0 = "nextButton"
        L_0x01b7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01bf:
            int r1 = r6.length()
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r0.A01
            if (r0 == 0) goto L_0x01d1
            int r0 = r0.A03
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r2.setEnabled(r0)
            return
        L_0x01d1:
            java.lang.String r0 = "confirmationCodeEditText"
            goto L_0x01b7
        L_0x01d4:
            java.lang.Object r2 = r5.A01
            X.E4i r2 = (X.C47483E4i) r2
            com.instagram.ui.text.FreeAutoCompleteTextView r0 = r2.A0E
            boolean r0 = X.Dba.A1V(r0)
            r1 = r0 ^ 1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A0G
            r0.setEnabled(r1)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r2.A0F
        L_0x01e7:
            r0.A03()
            return
        L_0x01eb:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r2.A01
            r0.getClass()
            r0.A03()
            r0 = 1
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48054ESy.afterTextChanged(android.text.Editable):void");
    }
}
