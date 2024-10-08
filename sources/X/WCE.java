package X;

import android.view.ViewTreeObserver;

public final class WCE implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public WCE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        X.0qQ.A0B(r3, r4);
        r2 = r1.A00;
        r1 = "lead_gen_one_tap_setup";
        r0 = "custom_form_row_not_on_screen_upon_entry";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        X.XB6.A02(r2, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a3, code lost:
        X.0qQ.A0B(r3, 0);
        r2 = r1.A00;
        r1 = "lead_gen_one_tap_setup";
        r0 = "custom_form_row_seen";
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x01ec;
                case 2: goto L_0x0089;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00f3;
                case 5: goto L_0x011f;
                case 6: goto L_0x013d;
                case 7: goto L_0x0164;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.Vbf r0 = (X.C17649Vbf) r0
            android.widget.TextView r4 = r0.A02
            X.C13988Tno.A12(r4, r9)
            int r0 = r4.getLineCount()
            r7 = 1
            if (r0 <= r7) goto L_0x01d8
            android.text.Layout r0 = r4.getLayout()
            if (r0 == 0) goto L_0x0057
            r8 = 0
            int r2 = r0.getLineVisibleEnd(r8)
            java.lang.CharSequence r0 = r4.getText()
            java.lang.String r6 = X.C13988Tno.A0c(r0, r8, r2)
            java.lang.CharSequence r1 = r4.getText()
            java.lang.CharSequence r0 = r4.getText()
            int r0 = r0.length()
            java.lang.String r5 = X.C13988Tno.A0c(r1, r2, r0)
            int r3 = r5.length()
            int r3 = r3 - r7
            r2 = 0
            r1 = 0
        L_0x003f:
            if (r2 > r3) goto L_0x01b1
            r0 = r3
            if (r1 != 0) goto L_0x0045
            r0 = r2
        L_0x0045:
            boolean r0 = X.Dbc.A13(r5, r0)
            if (r1 != 0) goto L_0x0052
            if (r0 != 0) goto L_0x004f
            r1 = 1
            goto L_0x003f
        L_0x004f:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x0052:
            if (r0 == 0) goto L_0x01b1
            int r3 = r3 + -1
            goto L_0x003f
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x005c:
            java.lang.Object r3 = r9.A01
            com.google.android.material.timepicker.ClockFaceView r3 = (com.google.android.material.timepicker.ClockFaceView) r3
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x01d8
            X.C13988Tno.A12(r3, r9)
            int r0 = r3.getHeight()
            int r2 = r0 / 2
            com.google.android.material.timepicker.ClockHandView r1 = r3.A09
            int r0 = r1.A05
            int r2 = r2 - r0
            int r0 = r3.A04
            int r2 = r2 - r0
            int r0 = r3.A01
            if (r2 == r0) goto L_0x01d8
            r3.A01 = r2
            r3.A0D()
            int r0 = r3.A01
            r1.A02 = r0
            r1.invalidate()
            goto L_0x01d8
        L_0x0089:
            java.lang.Object r4 = r9.A01
            X.UaK r4 = (X.C15313UaK) r4
            X.U8j r0 = r4.A04()
            boolean r0 = r0.A01
            r3 = 1
            if (r0 != 0) goto L_0x01d8
            X.U8j r0 = r4.A04()
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x01d8
            com.instagram.common.ui.base.IgTextView r2 = r4.A03
            if (r2 == 0) goto L_0x01d8
            android.graphics.Rect r0 = r4.A0D
            r2.getLocalVisibleRect(r0)
            int r1 = r0.bottom
            int r0 = r2.getHeight()
            if (r1 != r0) goto L_0x01d8
            X.U8j r0 = r4.A04()
            r0.A01 = r3
            goto L_0x01d8
        L_0x00b9:
            java.lang.Object r2 = r9.A01
            X.UaG r2 = (X.C15309UaG) r2
            boolean r0 = r2.A03
            r1 = 1
            if (r0 == 0) goto L_0x00db
            r4 = 0
            r2.A03 = r4
            boolean r0 = X.C15309UaG.A00(r2)
            if (r0 != 0) goto L_0x00d7
            X.U8d r0 = r2.A02()
            X.Vfp r1 = r0.A02
            java.lang.String r3 = r0.A00()
            goto L_0x0180
        L_0x00d7:
            r2.A02 = r1
            goto L_0x01d8
        L_0x00db:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C15309UaG.A00(r2)
            if (r0 == 0) goto L_0x01d8
            r2.A02 = r1
            X.U8d r0 = r2.A02()
            X.Vfp r1 = r0.A02
            java.lang.String r3 = r0.A00()
            goto L_0x01a3
        L_0x00f3:
            java.lang.Object r1 = r9.A01
            X.UZ0 r1 = (X.UZ0) r1
            X.0eM r4 = r1.A06
            java.lang.Object r0 = r4.getValue()
            X.U8m r0 = (X.C14776U8m) r0
            boolean r0 = r0.A00
            r3 = 1
            if (r0 != 0) goto L_0x01d8
            com.instagram.common.ui.base.IgTextView r2 = r1.A03
            if (r2 == 0) goto L_0x01d8
            android.graphics.Rect r0 = r1.A04
            r2.getLocalVisibleRect(r0)
            int r1 = r0.bottom
            int r0 = r2.getHeight()
            if (r1 != r0) goto L_0x01d8
            java.lang.Object r0 = r4.getValue()
            X.U8m r0 = (X.C14776U8m) r0
            r0.A00 = r3
            goto L_0x01d8
        L_0x011f:
            java.lang.Object r4 = r9.A01
            X.UEa r4 = (X.C14898UEa) r4
            boolean r0 = r4.A01
            r3 = 1
            if (r0 != 0) goto L_0x01d8
            com.instagram.common.ui.base.IgTextView r2 = r4.A07
            if (r2 == 0) goto L_0x01d8
            android.graphics.Rect r0 = r4.A02
            r2.getLocalVisibleRect(r0)
            int r1 = r0.bottom
            int r0 = r2.getHeight()
            if (r1 != r0) goto L_0x01d8
            r4.A01 = r3
            goto L_0x01d8
        L_0x013d:
            java.lang.Object r1 = r9.A01
            X.UaL r1 = (X.C15314UaL) r1
            X.0eM r4 = r1.A0G
            X.U8b r0 = X.C13990Tnq.A0S(r4)
            boolean r0 = r0.A01
            r3 = 1
            if (r0 != 0) goto L_0x01d8
            com.instagram.common.ui.base.IgTextView r2 = r1.A04
            if (r2 == 0) goto L_0x01d8
            android.graphics.Rect r0 = r1.A0B
            r2.getLocalVisibleRect(r0)
            int r1 = r0.bottom
            int r0 = r2.getHeight()
            if (r1 != r0) goto L_0x01d8
            X.U8b r0 = X.C13990Tnq.A0S(r4)
            r0.A01 = r3
            goto L_0x01d8
        L_0x0164:
            java.lang.Object r2 = r9.A01
            X.UaD r2 = (X.C15306UaD) r2
            boolean r0 = r2.A03
            r1 = 1
            if (r0 == 0) goto L_0x018d
            r4 = 0
            r2.A03 = r4
            boolean r0 = X.C15306UaD.A00(r2)
            if (r0 != 0) goto L_0x01ae
            X.0eM r0 = r2.A08
            X.U8Z r0 = X.C13990Tnq.A0U(r0)
            X.Vfp r1 = r0.A03
            java.lang.String r3 = r0.A06
        L_0x0180:
            X.0qQ.A0B(r3, r4)
            X.XB6 r2 = r1.A00
            java.lang.String r1 = "lead_gen_one_tap_setup"
            java.lang.String r0 = "custom_form_row_not_on_screen_upon_entry"
        L_0x0189:
            X.XB6.A02(r2, r3, r1, r0)
            goto L_0x01d8
        L_0x018d:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C15306UaD.A00(r2)
            if (r0 == 0) goto L_0x01d8
            r2.A02 = r1
            X.0eM r0 = r2.A08
            X.U8Z r0 = X.C13990Tnq.A0U(r0)
            X.Vfp r1 = r0.A03
            java.lang.String r3 = r0.A06
        L_0x01a3:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.XB6 r2 = r1.A00
            java.lang.String r1 = "lead_gen_one_tap_setup"
            java.lang.String r0 = "custom_form_row_seen"
            goto L_0x0189
        L_0x01ae:
            r2.A02 = r1
            goto L_0x01d8
        L_0x01b1:
            java.lang.String r2 = X.Dba.A0c(r5, r3, r2)
            java.lang.String r1 = "·"
            boolean r0 = X.00p.A0i(r6, r1, r8)
            if (r0 == 0) goto L_0x01da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r6.length()
            int r0 = r0 - r7
            java.lang.String r0 = X.C51967G9n.A0q(r6, r8, r0)
            r1.append(r0)
            r1.append(r2)
        L_0x01d1:
            java.lang.String r0 = r1.toString()
            r4.setText(r0)
        L_0x01d8:
            r0 = 1
            return r0
        L_0x01da:
            boolean r0 = X.00p.A0k(r2, r1, r8)
            if (r0 == 0) goto L_0x01d8
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r6)
            java.lang.String r0 = X.C66580MXl.A0z(r2, r7)
            r1.append(r0)
            goto L_0x01d1
        L_0x01ec:
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            X.C13988Tno.A12(r0, r9)
            r0.requestLayout()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WCE.onPreDraw():boolean");
    }
}
