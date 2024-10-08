package X;

public abstract class O31 {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.FAT r8, X.Mz1 r9, X.C74279Ps7 r10, X.PR9 r11) {
        /*
            r1 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r1, r9, r11)
            android.view.View r5 = X.JTO.A0F(r9)
            if (r10 == 0) goto L_0x0026
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r10 = (com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment) r10
            X.OBI r4 = r10.A00
            if (r4 == 0) goto L_0x013a
            java.lang.String r3 = "toggle"
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            X.30a r3 = X.AnonymousClass30Y.A00(r11, r0, r3)
            X.OzT r0 = r4.A01
            r3.A00(r0)
            X.2el r0 = r4.A00
            X.C51967G9n.A0z(r5, r3, r0)
        L_0x0026:
            r3 = 5
            X.JfK r0 = new X.JfK
            r0.<init>(r11, r3)
            X.03v.A0B(r5, r0)
            if (r8 == 0) goto L_0x003c
            android.content.Context r0 = r5.getContext()
            int r0 = X.C49161EqS.A00(r0, r8)
            r5.setBackgroundResource(r0)
        L_0x003c:
            java.lang.CharSequence r0 = r11.A0B
            android.widget.TextView r7 = r9.A05
            if (r0 == 0) goto L_0x0133
            r7.setText(r0)
        L_0x0045:
            int r0 = r11.A03
            r3 = 8
            if (r0 == 0) goto L_0x0062
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r5)
            int r0 = r11.A03
            android.graphics.drawable.Drawable r4 = X.AnonymousClass4Ed.A00(r6, r0)
            android.graphics.RectF r0 = X.0nA.A01
            r0 = 0
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r4, r0, r0, r0)
            int r0 = X.DbS.A02(r6, r3)
            r7.setCompoundDrawablePadding(r0)
        L_0x0062:
            int r4 = r11.A01
            android.widget.TextView r0 = r9.A03
            if (r4 == 0) goto L_0x012e
            r0.setText(r4)
            r0.setVisibility(r1)
        L_0x006e:
            int r0 = r11.A02
            if (r0 == 0) goto L_0x011e
            android.widget.TextView r4 = r9.A04
            r4.setText(r0)
        L_0x0077:
            r4.setVisibility(r1)
        L_0x007a:
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0081
            X.DbT.A1H(r4)
        L_0x0081:
            android.view.View$OnClickListener r4 = r11.A06
            if (r4 == 0) goto L_0x008a
            android.view.View r0 = r9.A01
            X.AnonymousClass0fU.A00(r4, r0)
        L_0x008a:
            com.instagram.igds.components.switchbutton.IgdsSwitch r4 = r9.A06
            java.lang.CharSequence r0 = r7.getText()
            r4.setTag(r0)
            r6 = 0
            r4.setOnCheckedChangeListener(r6)
            boolean r0 = r11.A0D
            r4.setChecked(r0)
            r8 = 33
            X.OlD r0 = new X.OlD
            r0.<init>(r11, r8)
            r4.setOnCheckedChangeListener(r0)
            X.8bC r0 = r11.A09
            r4.A07 = r0
            boolean r0 = r11.A0E
            if (r0 != 0) goto L_0x010d
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x010d
            r4.setEnabled(r2)
            r2 = 7
            X.Ol0 r0 = new X.Ol0
            r0.<init>(r2, r11, r9)
            r4.setOnCheckedChangeListener(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.setAlpha(r0)
            X.8bC r0 = r11.A09
            r4.A07 = r0
        L_0x00c7:
            android.view.View r0 = r9.A00
            r0.setVisibility(r3)
            android.widget.CheckBox r0 = r9.A02
            r0.setVisibility(r3)
            r0.setOnCheckedChangeListener(r6)
            r0.setChecked(r1)
            r0.setOnCheckedChangeListener(r6)
            android.view.View$OnLongClickListener r0 = r11.A07
            r5.setOnLongClickListener(r0)
            int r0 = r11.A05
            if (r0 != 0) goto L_0x00e7
            int r0 = r11.A00
            if (r0 == 0) goto L_0x00f6
        L_0x00e7:
            int r3 = r5.getPaddingLeft()
            int r2 = r11.A05
            int r1 = r5.getPaddingRight()
            int r0 = r11.A00
            r5.setPadding(r3, r2, r1, r0)
        L_0x00f6:
            boolean r0 = r11 instanceof X.C69188Ngm
            if (r0 == 0) goto L_0x010c
            r0 = r11
            X.Ngm r0 = (X.C69188Ngm) r0
            X.5Gt r0 = r0.A01
            r0.A03(r4)
            X.PXi r2 = new X.PXi
            r2.<init>(r11)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
        L_0x010c:
            return
        L_0x010d:
            r5.setOnClickListener(r6)
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x011a
            r0 = 1050253722(0x3e99999a, float:0.3)
            r7.setAlpha(r0)
        L_0x011a:
            r4.setEnabled(r1)
            goto L_0x00c7
        L_0x011e:
            java.lang.CharSequence r0 = r11.A0A
            android.widget.TextView r4 = r9.A04
            if (r0 == 0) goto L_0x0129
            r4.setText(r0)
            goto L_0x0077
        L_0x0129:
            r4.setVisibility(r3)
            goto L_0x007a
        L_0x012e:
            r0.setVisibility(r3)
            goto L_0x006e
        L_0x0133:
            int r0 = r11.A04
            r7.setText(r0)
            goto L_0x0045
        L_0x013a:
            java.lang.String r0 = "messageAccessToggleViewPointHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O31.A00(X.FAT, X.Mz1, X.Ps7, X.PR9):void");
    }
}
