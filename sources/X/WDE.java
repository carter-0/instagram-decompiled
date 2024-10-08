package X;

import android.widget.TextView;

public final class WDE implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WDE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r2 = (X.C16002Umj) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEditorAction(android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0064;
                case 2: goto L_0x0037;
                case 3: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            X.UZu r0 = (X.C15289UZu) r0
            java.lang.Object r3 = r4.A02
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2 = 1
            switch(r6) {
                case 2: goto L_0x0089;
                case 3: goto L_0x0089;
                case 4: goto L_0x0089;
                case 5: goto L_0x0089;
                case 6: goto L_0x0089;
                case 7: goto L_0x007d;
                default: goto L_0x0011;
            }
        L_0x0011:
            r2 = 0
            return r2
        L_0x0013:
            r0 = 5
            if (r6 == r0) goto L_0x0025
            r0 = 6
            if (r6 != r0) goto L_0x0011
            java.lang.Object r0 = r4.A02
            X.UaJ r0 = (X.C15312UaJ) r0
            X.U8s r0 = r0.A01()
            r0.A01()
            goto L_0x0011
        L_0x0025:
            java.lang.Object r2 = r4.A02
            X.UaJ r2 = (X.C15312UaJ) r2
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            android.widget.ScrollView r3 = r2.A02
            if (r3 == 0) goto L_0x0011
            X.WnV r0 = new X.WnV
            r0.<init>(r1, r2)
            goto L_0x0060
        L_0x0037:
            r0 = 5
            if (r6 == r0) goto L_0x0049
            r0 = 6
            if (r6 != r0) goto L_0x0011
            java.lang.Object r0 = r4.A02
            X.UaF r0 = (X.C15308UaF) r0
            X.U8i r0 = r0.A01()
            r0.A02()
            goto L_0x0011
        L_0x0049:
            java.lang.Object r2 = r4.A02
            X.UaF r2 = (X.C15308UaF) r2
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r2 instanceof X.C16002Umj
            if (r0 == 0) goto L_0x0011
            X.Umj r2 = (X.C16002Umj) r2
            android.widget.ScrollView r3 = r2.A01
            if (r3 == 0) goto L_0x0011
            X.WnW r0 = new X.WnW
            r0.<init>(r1, r2)
        L_0x0060:
            r3.post(r0)
            goto L_0x0011
        L_0x0064:
            r0 = 6
            if (r6 == r0) goto L_0x0071
            if (r7 == 0) goto L_0x0011
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0011
        L_0x0071:
            java.lang.Object r1 = r4.A02
            X.K6a r1 = (X.C61404K6a) r1
            java.lang.Object r0 = r4.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C61404K6a.A00(r0, r1)
            goto L_0x0011
        L_0x007d:
            X.Vih r1 = r0.A03
            android.widget.EditText r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A00(r3, r0)
            return r2
        L_0x0089:
            X.Vih r1 = r0.A03
            android.widget.EditText r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A01(r3, r0)
            return r2
        L_0x0095:
            java.lang.Object r1 = r4.A01
            X.U66 r1 = (X.U66) r1
            java.lang.Object r0 = r4.A02
            X.QZL r0 = (X.QZL) r0
            boolean r2 = com.facebook.react.views.textinput.ReactTextInputManager.lambda$addEventEmitters$1(r1, r0, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDE.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
