package X;

import android.view.View;

public final class ID5 implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public ID5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r5 = (X.IOA) r7.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            r6 = r9
            switch(r0) {
                case 0: goto L_0x0051;
                case 1: goto L_0x0031;
                case 2: goto L_0x0020;
                case 3: goto L_0x00ae;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r7.A01
            X.IOu r0 = (X.C57106IOu) r0
            X.Jio r1 = X.C57106IOu.A00(r0)
            r4 = 0
            r0 = 0
            r3 = 27
            r2 = r0
            r5 = r4
            X.C60291Jio.A00(r0, r1, r2, r3, r4, r5, r6)
            if (r9 != 0) goto L_0x001f
            r3 = 23
            r6 = r4
            X.C60291Jio.A00(r0, r1, r2, r3, r4, r5, r6)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r0 = r7.A01
            X.GbF r0 = (X.C52703GbF) r0
            if (r9 == 0) goto L_0x002e
            X.0sa r0 = r0.A0M
        L_0x0028:
            if (r0 == 0) goto L_0x001f
            r0.invoke()
            return
        L_0x002e:
            X.0sa r0 = r0.A0N
            goto L_0x0028
        L_0x0031:
            if (r9 == 0) goto L_0x001f
            java.lang.Object r1 = r7.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r1.getSystemService(r0)
            r0 = 11
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.os.IBinder r1 = r8.getWindowToken()
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
            return
        L_0x0051:
            boolean r0 = r8 instanceof com.facebook.primitive.textinput.TextInputView
            if (r0 == 0) goto L_0x001f
            if (r9 == 0) goto L_0x008e
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r0 = r7.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            r2 = 0
            X.0qQ.A0B(r8, r2)
            android.text.method.KeyListener r1 = r0.A00
            if (r1 != 0) goto L_0x006b
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x00d5
            android.text.method.KeyListener r1 = r0.A0H
        L_0x006b:
            android.text.method.KeyListener r0 = r8.getKeyListener()
            if (r0 != r1) goto L_0x0077
            android.text.TextUtils$TruncateAt r0 = r8.getEllipsize()
            if (r0 == 0) goto L_0x001f
        L_0x0077:
            r8.setKeyListener(r1)
            r0 = 0
            r8.setEllipsize(r0)
            r8.getExtendedPaddingTop()
            android.view.ViewTreeObserver r1 = r8.getViewTreeObserver()
            X.Sbf r0 = new X.Sbf
            r0.<init>(r8, r2)
            r1.addOnPreDrawListener(r0)
            return
        L_0x008e:
            com.facebook.primitive.textinput.TextInputView r8 = (com.facebook.primitive.textinput.TextInputView) r8
            android.text.TextUtils$TruncateAt r0 = r8.getEllipsize()
            if (r0 != 0) goto L_0x001f
            X.GbC r0 = X.C52732Gbj.A00
            boolean r0 = r0.A04(r8)
            if (r0 == 0) goto L_0x001f
            boolean r0 = X.C52700GbC.A03(r8)
            if (r0 == 0) goto L_0x001f
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            java.lang.Object r0 = r7.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.C52700GbC.A00(r1, r0, r8)
            return
        L_0x00ae:
            if (r9 == 0) goto L_0x001f
            java.lang.Object r5 = r7.A01
            X.IOA r5 = (X.IOA) r5
            X.1Xj r4 = r5.A03
            if (r4 == 0) goto L_0x001f
            X.0Rd r1 = r5.A0I
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x001f
            r0 = 0
            boolean r0 = r1.A03(r4, r0)
            if (r0 == 0) goto L_0x001f
            X.HrN r0 = r5.A02
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "viewHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00da:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r0.A0D
            X.Igt r2 = new X.Igt
            r2.<init>(r5, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ID5.onFocusChange(android.view.View, boolean):void");
    }
}
