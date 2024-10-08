package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;

public final class W7Z implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public W7Z(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r2 = (X.U8R) r4.getValue();
        r0 = r2.A00;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        if (r0.length() == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r0.length() == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        r3.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0146, code lost:
        if (r0 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0148, code lost:
        r0 = "checkIcon";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014d, code lost:
        if (r0 == null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014f, code lost:
        r0 = "errorIcon";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0176, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0006;
                case 2: goto L_0x0152;
                case 3: goto L_0x0005;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00af;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x002b
            r2 = 0
            java.lang.Object r1 = r5.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r3 = r5.A02
            X.UaQ r3 = (X.C15318UaQ) r3
            android.graphics.drawable.Drawable r0 = r3.A01
            if (r0 == 0) goto L_0x014f
            r1.setImageDrawable(r0)
            X.0eM r4 = r3.A06
            java.lang.Object r0 = r4.getValue()
            X.U8R r0 = (X.U8R) r0
            r0.A01 = r2
            goto L_0x006d
        L_0x002b:
            java.lang.Object r1 = r5.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r3 = r5.A02
            X.UaQ r3 = (X.C15318UaQ) r3
            android.graphics.drawable.Drawable r0 = r3.A00
            if (r0 == 0) goto L_0x0148
            r1.setImageDrawable(r0)
            X.0eM r4 = r3.A06
            java.lang.Object r1 = r4.getValue()
            X.U8R r1 = (X.U8R) r1
            java.lang.String r0 = r6.toString()
            r1.A01 = r0
            goto L_0x006d
        L_0x0049:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0091
            r2 = 0
            java.lang.Object r1 = r5.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r3 = r5.A02
            X.UaQ r3 = (X.C15318UaQ) r3
            android.graphics.drawable.Drawable r0 = r3.A01
            if (r0 == 0) goto L_0x014f
            r1.setImageDrawable(r0)
            X.0eM r4 = r3.A06
            java.lang.Object r0 = r4.getValue()
            X.U8R r0 = (X.U8R) r0
            r0.A00 = r2
        L_0x006d:
            X.Vw9 r3 = r3.A02
            if (r3 == 0) goto L_0x0005
            java.lang.Object r2 = r4.getValue()
            X.U8R r2 = (X.U8R) r2
            java.lang.String r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x008d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x008d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008d
            r1 = 1
        L_0x008d:
            r3.A04(r1)
            return
        L_0x0091:
            java.lang.Object r1 = r5.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r3 = r5.A02
            X.UaQ r3 = (X.C15318UaQ) r3
            android.graphics.drawable.Drawable r0 = r3.A00
            if (r0 == 0) goto L_0x0148
            r1.setImageDrawable(r0)
            X.0eM r4 = r3.A06
            java.lang.Object r1 = r4.getValue()
            X.U8R r1 = (X.U8R) r1
            java.lang.String r0 = r6.toString()
            r1.A00 = r0
            goto L_0x006d
        L_0x00af:
            java.lang.Object r2 = r5.A02
            X.U6n r2 = (X.C14746U6n) r2
            java.lang.Object r1 = r5.A01
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r1
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r2.A0F(r1, r0)
            return
        L_0x00bf:
            java.lang.Object r3 = r5.A02
            X.Umx r3 = (X.C16015Umx) r3
            java.lang.String r0 = X.DbX.A0t(r6)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x00cc
            r0 = r2
        L_0x00cc:
            java.lang.String r1 = r3.A0D(r0)
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x00ec
            X.N4R r0 = r3.A00
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r0.A00
            com.instagram.phonenumber.model.CountryCodeData r0 = (com.instagram.phonenumber.model.CountryCodeData) r0
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r0.A00()
            if (r0 != 0) goto L_0x00e7
        L_0x00e6:
            r0 = r2
        L_0x00e7:
            r2 = r0
        L_0x00e8:
            java.lang.String r2 = X.002.A0R(r2, r1)
        L_0x00ec:
            java.lang.Object r0 = r5.A01
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            r3.A0F(r0, r2)
            return
        L_0x00f4:
            X.Szy r1 = X.C8640Qyd.A01
            java.lang.String r0 = "()-."
            X.Szy r0 = X.C12614Szy.A01(r0)
            X.Szy r1 = r1.A07(r0)
            java.lang.String r2 = ""
            if (r6 == 0) goto L_0x010a
            java.lang.String r0 = r6.toString()
            if (r0 != 0) goto L_0x010b
        L_0x010a:
            r0 = r2
        L_0x010b:
            java.lang.String r1 = r1.A08(r0)
            X.0qQ.A0A(r1)
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0132
            java.lang.Object r0 = r5.A02
            X.Un5 r0 = (X.C16017Un5) r0
            X.N4R r0 = r0.A00
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r0.A00
            com.instagram.phonenumber.model.CountryCodeData r0 = (com.instagram.phonenumber.model.CountryCodeData) r0
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r0.A00()
            if (r0 != 0) goto L_0x012d
        L_0x012c:
            r0 = r2
        L_0x012d:
            r2 = r0
        L_0x012e:
            java.lang.String r2 = X.002.A0R(r2, r1)
        L_0x0132:
            java.lang.Object r1 = r5.A02
            X.U6n r1 = (X.C14746U6n) r1
            java.lang.Object r0 = r5.A01
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            r1.A0F(r0, r2)
            return
        L_0x013e:
            boolean r0 = X.C51966G9m.A1X(r6)
            if (r0 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r0 = r2.A00
            if (r0 != 0) goto L_0x0177
        L_0x0148:
            java.lang.String r0 = "checkIcon"
            goto L_0x016f
        L_0x014b:
            android.graphics.drawable.Drawable r0 = r2.A01
            if (r0 != 0) goto L_0x0177
        L_0x014f:
            java.lang.String r0 = "errorIcon"
            goto L_0x016f
        L_0x0152:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = X.C51966G9m.A1X(r6)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            java.lang.Object r2 = r5.A02
            X.UZi r2 = (X.C15280UZi) r2
            android.widget.ImageView r1 = r2.A0C
            if (r1 != 0) goto L_0x013e
            java.lang.String r0 = "audienceNameInputStatusIcon"
        L_0x016f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0177:
            r1.setImageDrawable(r0)
            X.0eM r0 = r2.A0Z
            r0.getValue()
            com.instagram.business.promote.model.PromoteData r2 = X.C15280UZi.A01(r2)
            java.lang.String r1 = r6.toString()
            X.AnonymousClass7TF.A1H(r2, r1)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r2.A0q
            if (r0 == 0) goto L_0x019b
            X.VuU r0 = X.C18167Vmh.A00(r0)
            r0.A05 = r1
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A01()
            r2.A0q = r0
            return
        L_0x019b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W7Z.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (X.H15) r9.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 3: goto L_0x003e;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r3 = r9.A02
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0005
            java.lang.Object r2 = r9.A01
            X.H15 r2 = (X.H15) r2
            com.instagram.save.model.SavedCollection r0 = r2.A0C
            if (r0 == 0) goto L_0x0005
            com.instagram.user.model.User r0 = r0.A08
            if (r0 == 0) goto L_0x0005
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            r1 = 2131970946(0x7f134b82, float:1.9578857E38)
            com.instagram.save.model.SavedCollection r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.A08
            java.lang.String r0 = r0.getUsername()
            X.DbX.A1F(r3, r2, r0, r1)
            android.view.View r0 = r2.A02
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0033:
            r3.setText(r10)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0005
            r0.setVisibility(r1)
            return
        L_0x003e:
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r7 = java.text.NumberFormat.getCurrencyInstance(r0)
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "\\D"
            java.lang.String r8 = ""
            java.lang.String r1 = r1.replaceAll(r0, r8)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Currency r0 = r7.getCurrency()
            if (r0 == 0) goto L_0x0005
            double r2 = java.lang.Double.parseDouble(r1)
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            java.util.Currency r0 = r7.getCurrency()
            int r0 = r0.getDefaultFractionDigits()
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r4, r0)
            double r2 = r2 / r0
            java.lang.Object r6 = r9.A02
            com.instagram.igds.components.form.IgFormField r6 = (com.instagram.igds.components.form.IgFormField) r6
            X.DbU.A1E(r9, r6)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            java.lang.String r0 = r7.format(r2)
            r6.setText(r0)
            java.lang.Object r5 = r9.A01
            X.UbH r5 = (X.C15364UbH) r5
            X.VN4 r0 = r5.A01
            if (r0 == 0) goto L_0x009f
            r1 = 1
        L_0x008f:
            X.VaW r0 = r0.A00
            X.7Pu r4 = r0.A04
            X.7Ps r0 = r0.A05
            r0.A0A = r1
            X.7Pt r1 = r0.A00()
            r0 = 1
            r4.A0K(r1, r0)
        L_0x009f:
            java.lang.String r0 = java.lang.Double.toString(r2)
            r5.A03 = r0
            r6.A0G(r9)
            return
        L_0x00a9:
            r6.setText(r8)
            java.lang.Object r5 = r9.A01
            X.UbH r5 = (X.C15364UbH) r5
            X.VN4 r0 = r5.A01
            if (r0 == 0) goto L_0x009f
            r1 = 0
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W7Z.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
