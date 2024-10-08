package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public final class EEG extends C252233om {
    public EXD A00;
    public Integer A01;
    public Integer A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final 0lg A06;
    public final E3Y A07;
    public final F0L A08;
    public final C49709F2u A09;
    public final C49701F2m A0A;
    public final C49701F2m A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0283, code lost:
        if (r3 == null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
        if (r3 == null) goto L_0x0218;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Integer r27) {
        /*
            r26 = this;
            X.FFr r5 = X.C49938FFr.A00
            r2 = r26
            X.0lg r4 = r2.A06
            X.E3Y r0 = r2.A07
            X.DiE r1 = r0.BzS()
            java.lang.String r3 = r1.A01
            X.EXD r1 = r2.A00
            r5.A02(r4, r1, r3)
            android.view.ViewGroup r3 = r2.A05
            r18 = 0
            r1 = r18
            r3.setLayoutTransition(r1)
            android.view.ViewTreeObserver r4 = r3.getViewTreeObserver()
            r17 = 1
            X.FPk r3 = new X.FPk
            r1 = r17
            r3.<init>(r2, r1)
            r4.addOnPreDrawListener(r3)
            X.F2m r4 = r2.A0A
            java.lang.Integer r3 = r2.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r5 = 1
            boolean r1 = X.AnonymousClass7TF.A1W(r3, r1)
            r4.A00(r1)
            X.F2m r4 = r2.A0B
            java.lang.Integer r3 = r2.A01
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r1 = r16
            if (r3 == r1) goto L_0x0045
            r5 = 0
        L_0x0045:
            r4.A00(r5)
            java.lang.Integer r1 = r2.A01
            int r4 = r1.intValue()
            r7 = 0
            r1 = r27
            if (r4 == r7) goto L_0x015e
            r3 = r17
            if (r4 != r3) goto L_0x0128
            X.F0L r4 = r2.A08
            android.widget.AutoCompleteTextView r5 = r4.A04
            boolean r3 = X.0nA.A0z(r5)
            if (r3 == 0) goto L_0x0128
            X.FAO r8 = r4.A00
            X.0qQ.A0B(r1, r7)
            android.widget.AutoCompleteTextView r10 = r8.A01
            boolean r3 = X.0nA.A0z(r10)
            if (r3 == 0) goto L_0x009e
            X.0lg r12 = r8.A02
            java.lang.String r11 = "email"
            java.lang.String r9 = "android_account_manager"
            X.C49205ErA.A00(r12, r9)
            android.app.Activity r3 = r8.A00
            java.util.ArrayList r6 = X.C49196Er1.A00(r3)
            java.lang.Object r3 = X.00k.A0J(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x009e
            X.C49212ErH.A00(r12, r11, r9)
            int r24 = r6.size()
            java.lang.String r21 = ""
            r22 = r9
            r23 = r3
            r25 = r17
            r19 = r8
            r20 = r1
            X.FAO.A00(r19, r20, r21, r22, r23, r24, r25)
            r10.setText(r3)
        L_0x009e:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            if (r1 == r3) goto L_0x0108
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r1 == r3) goto L_0x0108
            boolean r3 = X.0nA.A0z(r10)
            if (r3 == 0) goto L_0x00d8
            X.0lg r12 = r8.A02
            java.lang.String r11 = "email"
            java.lang.String r9 = "fb_first_party"
            X.C49205ErA.A00(r12, r9)
            java.lang.String r6 = X.C49898FCb.A00(r12)
            if (r6 == 0) goto L_0x00d8
            int r3 = r6.length()
            if (r3 == 0) goto L_0x00d8
            X.C49212ErH.A00(r12, r11, r9)
            java.lang.String r21 = ""
            r19 = r8
            r20 = r1
            r22 = r9
            r23 = r6
            r24 = r17
            r25 = r17
            X.FAO.A00(r19, r20, r21, r22, r23, r24, r25)
            r10.setText(r6)
        L_0x00d8:
            boolean r3 = X.0nA.A0z(r10)
            if (r3 == 0) goto L_0x0108
            X.0lg r12 = r8.A02
            java.lang.String r11 = "email"
            java.lang.String r9 = "uig_via_phone_id"
            X.C49205ErA.A00(r12, r9)
            java.lang.String r6 = X.C49315Esy.A00
            if (r6 == 0) goto L_0x0108
            int r3 = r6.length()
            if (r3 == 0) goto L_0x0108
            X.C49212ErH.A00(r12, r11, r9)
            java.lang.String r21 = ""
            r19 = r8
            r20 = r1
            r22 = r9
            r23 = r6
            r24 = r17
            r25 = r17
            X.FAO.A00(r19, r20, r21, r22, r23, r24, r25)
            r10.setText(r6)
        L_0x0108:
            boolean r3 = X.0nA.A0z(r10)
            if (r3 == 0) goto L_0x015a
            java.lang.String r10 = "no_email"
            java.lang.String r11 = ""
            r9 = r1
            r12 = r18
            r13 = r7
            r14 = r7
            X.FAO.A00(r8, r9, r10, r11, r12, r13, r14)
        L_0x011a:
            boolean r1 = X.0nA.A0z(r5)
            r1 = r1 ^ 1
            r4.A02 = r1
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r5)
            r4.A01 = r1
        L_0x0128:
            boolean r1 = X.E3Y.A07(r0)
            if (r1 == 0) goto L_0x0157
            X.F2b r3 = r0.A0G
        L_0x0130:
            if (r3 == 0) goto L_0x0136
            r1 = r17
            r3.A04 = r1
        L_0x0136:
            java.lang.Integer r2 = r2.A01
            r1 = r16
            boolean r3 = X.AnonymousClass7TF.A1W(r2, r1)
            X.Ezr r1 = r0.A0D
            if (r1 == 0) goto L_0x0144
            r1.A01 = r3
        L_0x0144:
            X.Ezr r2 = r0.A0C
            if (r2 == 0) goto L_0x014c
            r1 = r3 ^ 1
            r2.A01 = r1
        L_0x014c:
            if (r3 == 0) goto L_0x0156
            X.F2u r1 = r0.A0E
            boolean r1 = r1.A03
            r1 = r1 ^ 1
            r0.A0V = r1
        L_0x0156:
            return
        L_0x0157:
            X.F2b r3 = r0.A0F
            goto L_0x0130
        L_0x015a:
            r10.dismissDropDown()
            goto L_0x011a
        L_0x015e:
            X.0qQ.A0B(r1, r7)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r1 == r6) goto L_0x023f
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r1 == r3) goto L_0x023f
            X.EW4 r5 = X.EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE
            java.util.EnumSet r3 = java.util.EnumSet.of(r5)
        L_0x016f:
            X.0qQ.A0A(r3)
            java.util.EnumSet r11 = java.util.EnumSet.complementOf(r3)
            X.0qQ.A07(r11)
            X.F2u r9 = r2.A09
            android.widget.AutoCompleteTextView r3 = r9.A05
            r20 = r3
            boolean r3 = X.0nA.A0z(r20)
            if (r3 == 0) goto L_0x0128
            X.F2n r8 = r9.A00
            r8.getClass()
            android.app.Activity r10 = r8.A00
            X.0lg r4 = r8.A03
            X.DiE r3 = r8.A05
            java.util.ArrayList r4 = X.FH2.A04(r10, r4, r3, r11)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x023c
            java.util.Iterator r10 = r4.iterator()
        L_0x019e:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x023c
            java.lang.Object r12 = r10.next()
            X.EbZ r12 = (X.C48254EbZ) r12
            java.lang.String r3 = r12.A01
            X.EW4 r4 = X.C49198Er3.A00(r3)
            if (r1 == r6) goto L_0x0232
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r1 == r3) goto L_0x0232
            r3 = r5
        L_0x01b7:
            if (r4 == r3) goto L_0x019e
        L_0x01b9:
            android.widget.TextView r13 = r8.A02
            if (r13 == 0) goto L_0x021b
            double r5 = X.DbS.A01()
            double r3 = X.DbS.A00()
            X.0lg r10 = r8.A03
            r19 = r10
            X.0wc r11 = X.AnonymousClass0kN.A02(r19)
            java.lang.String r10 = "guessed_country_code"
            X.0Aj r14 = X.AnonymousClass7TE.A0e(r11, r10)
            X.DbY.A1D(r14, r5, r3)
            X.DiE r10 = r8.A05
            java.lang.String r10 = r10.A01
            X.DbZ.A1J(r14, r10)
            X.DbT.A1O(r14)
            com.instagram.phonenumber.model.CountryCodeData r10 = r8.A04
            r11 = 0
            if (r10 != 0) goto L_0x022b
            r15 = r11
        L_0x01e6:
            java.lang.String r10 = "code"
            r14.A9F(r10, r15)
            com.instagram.phonenumber.model.CountryCodeData r10 = r8.A04
            if (r10 == 0) goto L_0x01f1
            java.lang.String r11 = r10.A00
        L_0x01f1:
            java.lang.String r10 = "country"
            r14.AAJ(r10, r11)
            java.lang.String r11 = "phone"
            java.lang.String r10 = "flow"
            X.DbY.A1I(r14, r10, r11, r3)
            X.DbW.A13(r14, r5)
            r3 = r19
            X.FH8.A08(r14, r3)
            com.instagram.phonenumber.model.CountryCodeData r3 = r8.A04
            java.lang.String r3 = r3.A02()
            r13.setText(r3)
            com.instagram.phonenumber.model.CountryCodeData r3 = r8.A04
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0228
            java.lang.String r3 = r3.A02
            if (r3 != 0) goto L_0x0229
        L_0x0218:
            r13.setContentDescription(r4)
        L_0x021b:
            if (r12 == 0) goto L_0x02da
            java.lang.String r6 = r12.A02
            java.lang.String r5 = r12.A01
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x02ce
            goto L_0x024b
        L_0x0228:
            r3 = r4
        L_0x0229:
            r4 = r3
            goto L_0x0218
        L_0x022b:
            java.lang.String r10 = r10.A01
            java.lang.Long r15 = X.DbV.A0q(r10)
            goto L_0x01e6
        L_0x0232:
            if (r4 == r5) goto L_0x019e
            X.EW4 r3 = X.EW4.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY
            if (r4 == r3) goto L_0x019e
            X.EW4 r3 = X.EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID
            goto L_0x01b7
        L_0x023c:
            r12 = 0
            goto L_0x01b9
        L_0x023f:
            X.EW4 r5 = X.EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE
            X.EW4 r4 = X.EW4.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY
            X.EW4 r3 = X.EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID
            java.util.EnumSet r3 = java.util.EnumSet.of(r5, r4, r3)
            goto L_0x016f
        L_0x024b:
            android.app.Activity r3 = r8.A00     // Catch:{ Exception -> 0x02e7 }
            com.facebook.phonenumbers.PhoneNumberUtil r4 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r3)     // Catch:{ Exception -> 0x02e7 }
            com.instagram.phonenumber.model.CountryCodeData r3 = r8.A04     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r3 = r3.A00     // Catch:{ Exception -> 0x02e7 }
            X.74u r6 = r4.A0F(r6, r3)     // Catch:{ Exception -> 0x02e7 }
            int r10 = r6.A00     // Catch:{ Exception -> 0x02e7 }
            android.app.Activity r3 = r8.A00     // Catch:{ Exception -> 0x02e7 }
            com.facebook.phonenumbers.PhoneNumberUtil r3 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r3)     // Catch:{ Exception -> 0x02e7 }
            int r4 = r6.A00     // Catch:{ Exception -> 0x02e7 }
            X.79y r3 = r3.A00     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = r3.A01(r4)     // Catch:{ Exception -> 0x02e7 }
            com.instagram.phonenumber.model.CountryCodeData r3 = new com.instagram.phonenumber.model.CountryCodeData     // Catch:{ Exception -> 0x02e7 }
            r3.<init>(r10, r4)     // Catch:{ Exception -> 0x02e7 }
            r8.A04 = r3     // Catch:{ Exception -> 0x02e7 }
            android.widget.TextView r11 = r8.A02     // Catch:{ Exception -> 0x02e7 }
            if (r11 == 0) goto L_0x0288
            java.lang.String r3 = r3.A02()     // Catch:{ Exception -> 0x02e7 }
            r11.setText(r3)     // Catch:{ Exception -> 0x02e7 }
            com.instagram.phonenumber.model.CountryCodeData r3 = r8.A04     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x02a1
            java.lang.String r3 = r3.A02     // Catch:{ Exception -> 0x02e7 }
            if (r3 != 0) goto L_0x02a2
        L_0x0285:
            r11.setContentDescription(r4)     // Catch:{ Exception -> 0x02e7 }
        L_0x0288:
            r8.A01()     // Catch:{ Exception -> 0x02e7 }
            android.widget.EditText r10 = r8.A01     // Catch:{ Exception -> 0x02e7 }
            long r3 = r6.A02     // Catch:{ Exception -> 0x02e7 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x02e7 }
            java.lang.Object[] r4 = new java.lang.Object[]{r3}     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r3 = "%d"
            java.lang.String r3 = X.0mp.A06(r3, r4)     // Catch:{ Exception -> 0x02e7 }
            r10.setText(r3)     // Catch:{ Exception -> 0x02e7 }
            goto L_0x02a4
        L_0x02a1:
            r3 = r4
        L_0x02a2:
            r4 = r3
            goto L_0x0285
        L_0x02a4:
            if (r11 != 0) goto L_0x02bd
            com.instagram.phonenumber.model.CountryCodeData r3 = r8.A04     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = r3.A00()     // Catch:{ Exception -> 0x02e7 }
            android.text.Editable r3 = r10.getText()     // Catch:{ Exception -> 0x02e7 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r3}     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r3 = "%s %s"
            java.lang.String r3 = X.0mp.A06(r3, r4)     // Catch:{ Exception -> 0x02e7 }
            r10.setText(r3)     // Catch:{ Exception -> 0x02e7 }
        L_0x02bd:
            java.lang.String r12 = ""
            long r3 = r6.A02     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r14 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x02e7 }
            r10 = r8
            r11 = r1
            r13 = r5
            r15 = r17
            X.C49702F2n.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02e7 }
            goto L_0x02f2
        L_0x02ce:
            java.lang.String r12 = "no_number"
            r10 = r8
            r11 = r1
            r13 = r5
            r14 = r18
            r15 = r7
            X.C49702F2n.A00(r10, r11, r12, r13, r14, r15)
            goto L_0x02f2
        L_0x02da:
            java.lang.String r12 = "no_number"
            java.lang.String r13 = ""
            r10 = r8
            r11 = r1
            r14 = r18
            r15 = r7
            X.C49702F2n.A00(r10, r11, r12, r13, r14, r15)
            goto L_0x02f2
        L_0x02e7:
            java.lang.String r12 = "parse_failed"
            r10 = r8
            r11 = r1
            r13 = r5
            r14 = r18
            r15 = r7
            X.C49702F2n.A00(r10, r11, r12, r13, r14, r15)
        L_0x02f2:
            android.widget.EditText r3 = r8.A01
            boolean r1 = X.0nA.A0z(r3)
            if (r1 != 0) goto L_0x0303
            boolean r1 = r3 instanceof android.widget.AutoCompleteTextView
            if (r1 == 0) goto L_0x0303
            android.widget.AutoCompleteTextView r3 = (android.widget.AutoCompleteTextView) r3
            r3.dismissDropDown()
        L_0x0303:
            boolean r1 = X.0nA.A0z(r20)
            r1 = r1 ^ 1
            r9.A03 = r1
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r20)
            r9.A02 = r1
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEG.A01(java.lang.Integer):void");
    }

    public final void D6z(View view) {
        FPD.A00(this.A03, 28, this);
        FPD.A00(this.A04, 29, this);
        Integer num = this.A02;
        F0L f0l = this.A08;
        ImageView imageView = f0l.A05;
        AutoCompleteTextView autoCompleteTextView = f0l.A04;
        int i = 8;
        if (autoCompleteTextView.getText().length() > 0) {
            i = 0;
        }
        imageView.setVisibility(i);
        FPD.A00(imageView, 24, f0l);
        autoCompleteTextView.addTextChangedListener(f0l.A03);
        C49709F2u f2u = this.A09;
        C49702F2n f2n = f2u.A00;
        f2n.getClass();
        f2n.A01();
        ImageView imageView2 = f2u.A06;
        AutoCompleteTextView autoCompleteTextView2 = f2u.A05;
        int i2 = 0;
        if (0nA.A0z(autoCompleteTextView2)) {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        FPD.A00(imageView2, 26, f2u);
        FPD.A00(f2u.A07, 27, f2u);
        autoCompleteTextView2.addTextChangedListener(f2u.A04);
        A01(num);
    }

    public final void onDestroyView() {
        this.A09.A00 = null;
    }

    public final void onPause() {
        C49709F2u f2u = this.A09;
        E0N e0n = f2u.A01;
        if (e0n != null) {
            e0n.A07();
        }
        0nA.A0N(f2u.A05);
        F0L f0l = this.A08;
        AutoCompleteTextView autoCompleteTextView = f0l.A04;
        autoCompleteTextView.removeTextChangedListener(f0l.A03);
        0nA.A0N(autoCompleteTextView);
    }

    public final void onResume() {
        AutoCompleteTextView autoCompleteTextView;
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            autoCompleteTextView = this.A09.A05;
        } else if (intValue == 1) {
            autoCompleteTextView = this.A08.A04;
        } else {
            return;
        }
        C49958FGq.A06(autoCompleteTextView);
    }

    public EEG(View view, View view2, ViewGroup viewGroup, 0lg r4, E3Y e3y, C49701F2m f2m, C49701F2m f2m2, F0L f0l, C49709F2u f2u, Integer num, Integer num2) {
        this.A05 = viewGroup;
        this.A03 = view;
        this.A04 = view2;
        this.A01 = num;
        this.A07 = e3y;
        this.A08 = f0l;
        this.A09 = f2u;
        this.A06 = r4;
        this.A0A = f2m;
        this.A0B = f2m2;
        this.A02 = num2;
    }

    public final void A00(0lg r9, Integer num, Integer num2) {
        EXD exd;
        0wc A022;
        double A012;
        double A002;
        String str;
        if (num2.intValue() != 0) {
            exd = EXD.A03;
            this.A00 = exd;
            A022 = AnonymousClass0kN.A02(r9);
            A002 = DbS.A00();
            A012 = DbS.A01();
            str = "switch_to_email";
        } else {
            exd = EXD.PHONE;
            this.A00 = exd;
            A022 = AnonymousClass0kN.A02(r9);
            A012 = DbS.A01();
            A002 = DbS.A00();
            str = "switch_to_phone";
        }
        0Aj A0e = AnonymousClass7TE.A0e(A022, str);
        Dbc.A0Y(A0e, A012, A002);
        Dbc.A0c(A0e, "step", this.A07.BzS().A01, A002);
        DbS.A1G(A0e, exd.A00);
        FH8.A07(A0e, A012);
        A0e.Cgf();
        this.A01 = num2;
        A01(num);
    }
}
