package X;

import android.widget.TextView;

public final class FQe implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public FQe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.setOnEditorActionListener(new FQe(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0194, code lost:
        r2 = (X.E3Q) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01ed, code lost:
        r1 = (X.E4W) r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEditorAction(android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01da;
                case 1: goto L_0x01c5;
                case 2: goto L_0x01b2;
                case 3: goto L_0x0181;
                case 4: goto L_0x0200;
                case 5: goto L_0x016d;
                case 6: goto L_0x0157;
                case 7: goto L_0x0127;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00ca;
                case 11: goto L_0x0098;
                case 12: goto L_0x0088;
                case 13: goto L_0x0026;
                case 14: goto L_0x007c;
                case 15: goto L_0x000e;
                case 16: goto L_0x0060;
                case 17: goto L_0x0044;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            X.G86 r0 = (X.G86) r0
            boolean r2 = r0.DBR(r6)
            return r2
        L_0x000e:
            r0 = 2
            if (r6 == r0) goto L_0x0017
            r0 = 6
            if (r6 == r0) goto L_0x0017
            r0 = 5
            if (r6 != r0) goto L_0x0212
        L_0x0017:
            java.lang.Object r1 = r4.A01
            X.EEK r1 = (X.EEK) r1
            X.G8C r0 = r1.A01
            boolean r0 = r0.Ca3()
            r2 = 1
            if (r0 != 0) goto L_0x003c
            goto L_0x0212
        L_0x0026:
            r0 = 2
            if (r6 == r0) goto L_0x002f
            r0 = 6
            if (r6 == r0) goto L_0x002f
            r0 = 5
            if (r6 != r0) goto L_0x0212
        L_0x002f:
            java.lang.Object r1 = r4.A01
            X.E3V r1 = (X.E3V) r1
            boolean r0 = r1.Ca3()
            r2 = 1
            if (r0 == 0) goto L_0x0040
            X.EEK r1 = r1.A09
        L_0x003c:
            r1.A03(r2)
            return r2
        L_0x0040:
            X.E3V.A02(r1)
            return r2
        L_0x0044:
            r0 = 6
            if (r6 == r0) goto L_0x0057
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x0057:
            java.lang.Object r0 = r4.A01
            X.EQs r0 = (X.C48009EQs) r0
            X.C48009EQs.A01(r0)
            goto L_0x01fe
        L_0x0060:
            r0 = 6
            if (r6 == r0) goto L_0x0073
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x0073:
            java.lang.Object r0 = r4.A01
            X.EQr r0 = (X.C48008EQr) r0
            X.C48008EQr.A00(r0)
            goto L_0x01fe
        L_0x007c:
            r0 = 6
            if (r6 != r0) goto L_0x0212
            java.lang.Object r0 = r4.A01
            X.E38 r0 = (X.E38) r0
            X.E38.A01(r0)
            goto L_0x01fe
        L_0x0088:
            r0 = 5
            if (r0 != r6) goto L_0x0212
            java.lang.Object r0 = r4.A01
            X.E3V r0 = (X.E3V) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A0E
            if (r0 == 0) goto L_0x0212
            r0.requestFocus()
            goto L_0x01fe
        L_0x0098:
            r0 = 6
            if (r6 == r0) goto L_0x00ab
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x00ab:
            java.lang.Object r1 = r4.A01
            X.E54 r1 = (X.E54) r1
            java.lang.String r0 = X.E54.A0X
            android.widget.TextView r0 = r1.A05
            boolean r0 = X.Dba.A1V(r0)
            if (r0 != 0) goto L_0x0212
            android.widget.EditText r0 = r1.A03
            boolean r0 = X.Dba.A1V(r0)
            if (r0 != 0) goto L_0x0212
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0212
            r2 = 1
            X.E54.A02(r1, r2)
            return r2
        L_0x00ca:
            r0 = 6
            if (r6 == r0) goto L_0x00dd
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x00dd:
            java.lang.Object r0 = r4.A01
            X.E4P r0 = (X.E4P) r0
            X.E4P.A00(r0)
            goto L_0x0212
        L_0x00e6:
            r0 = 5
            if (r6 != r0) goto L_0x0212
            java.lang.Object r1 = r4.A01
            X.E4Y r1 = (X.E4Y) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00f6
            X.E4Y.A02(r1)
            goto L_0x01fe
        L_0x00f6:
            X.E4Y.A01(r1)
            goto L_0x01fe
        L_0x00fb:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 6
            if (r6 == r0) goto L_0x0112
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x0112:
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L_0x0212
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r0 = r4.A01
            X.E25 r0 = (X.E25) r0
            X.E25.A00(r0)
            goto L_0x01fe
        L_0x0127:
            java.lang.Object r2 = r4.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A02
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "nextButton"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0139:
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0212
            r0 = 6
            if (r6 == r0) goto L_0x0152
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x0152:
            X.C47445E2r.A00(r2)
            goto L_0x01fe
        L_0x0157:
            r0 = 2
            if (r6 != r0) goto L_0x0212
            java.lang.Object r1 = r4.A01
            X.E2u r1 = (X.C47448E2u) r1
            com.instagram.actionbar.ActionButton r0 = r1.A05
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01fe
            X.C47448E2u.A00(r1)
            goto L_0x01fe
        L_0x016d:
            java.lang.Object r1 = r4.A01
            X.E4d r1 = (X.C47478E4d) r1
            r0 = 6
            if (r6 != r0) goto L_0x01fe
            X.F2l r0 = r1.A07
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0212
            X.C47478E4d.A02(r1)
            goto L_0x0212
        L_0x0181:
            r3 = 6
            if (r6 == r3) goto L_0x0194
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x0194:
            java.lang.Object r2 = r4.A01
            X.E3Q r2 = (X.E3Q) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A03
            if (r0 == 0) goto L_0x0212
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0212
            com.instagram.common.session.UserSession r1 = r2.A02
            android.widget.EditText r0 = r2.A01
            java.lang.String r0 = X.0nA.A0I(r0)
            X.1OC r0 = X.FHA.A0F(r1, r0)
            X.C47699EDi.A00(r2, r0, r3)
            goto L_0x01fe
        L_0x01b2:
            r0 = 2
            if (r6 != r0) goto L_0x0212
            java.lang.Object r1 = r4.A01
            X.E5f r1 = (X.C47500E5f) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01fe
            r1.A01()
            goto L_0x01fe
        L_0x01c5:
            r0 = 4
            if (r6 == r0) goto L_0x01d2
            if (r7 == 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x01d2:
            java.lang.Object r0 = r4.A01
            X.FEo r0 = (X.FEo) r0
            X.FEo.A00(r0)
            goto L_0x0212
        L_0x01da:
            r0 = 6
            if (r6 == r0) goto L_0x01ed
            if (r7 == 0) goto L_0x0212
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0212
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0212
        L_0x01ed:
            java.lang.Object r1 = r4.A01
            X.E4W r1 = (X.E4W) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A01
            if (r0 == 0) goto L_0x0212
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0212
            X.E4W.A00(r1)
        L_0x01fe:
            r2 = 1
            return r2
        L_0x0200:
            r0 = 5
            if (r6 != r0) goto L_0x01fe
            java.lang.Object r1 = r4.A01
            X.E4i r1 = (X.C47483E4i) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A0G
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0212
            r1.A05()
        L_0x0212:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQe.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
