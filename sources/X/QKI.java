package X;

public final class QKI extends QKJ {
    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.QKJ, X.QC2, androidx.fragment.app.Fragment, X.0SM, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0098, code lost:
        if (A0G() == false) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A0F(android.os.Bundle r22) {
        /*
            r21 = this;
            r15 = r21
            android.content.Context r0 = r15.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626350(0x7f0e096e, float:1.8879934E38)
            r8 = 0
            android.view.View r7 = r1.inflate(r0, r8)
            android.os.Bundle r3 = r15.requireArguments()
            java.lang.String r0 = "disable_autofill_dismiss_option"
            r1 = 0
            long r5 = r3.getLong(r0, r1)
            r3 = 2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01c8
            r0 = 1
            X.C11507SbU.A00(r7, r0, r15)
        L_0x0028:
            android.content.Context r3 = r15.requireContext()
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setView(r7)
            android.app.AlertDialog r3 = r0.create()
            r0 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0041
            r3.setCanceledOnTouchOutside(r0)
        L_0x0041:
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r1 = "is_consent_accepted"
            boolean r5 = r2.getBoolean(r1, r0)
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r1 = "should_always_show_ads_disclosure"
            boolean r4 = r2.getBoolean(r1, r0)
            X.STY r1 = r15.A01
            r1.getClass()
            X.STY r2 = r15.A01
            java.lang.String r1 = "CLICKED_LEARN_MORE"
            X.RRP r1 = r2.A06(r1)
            X.SHz r10 = r1.A00()
            if (r4 != 0) goto L_0x01a5
            if (r5 == 0) goto L_0x01a5
            r14 = 1
            androidx.fragment.app.FragmentActivity r5 = r15.requireActivity()
            r11 = 2131965846(0x7f133796, float:1.9568513E38)
            r12 = 2131435828(0x7f0b2134, float:1.849351E38)
            r13 = 2131953393(0x7f1306f1, float:1.9543256E38)
            X.STY r1 = r15.A01
            X.QKv r1 = r1.A04
            android.os.Bundle r6 = r1.A02()
            X.4gR r9 = r15.A00
            X.SKI.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0086:
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r1 = "should_show_fbpay_disclosure"
            boolean r1 = r2.getBoolean(r1, r0)
            if (r1 == 0) goto L_0x009a
            boolean r2 = r15.A0G()
            r1 = 1
            if (r2 != 0) goto L_0x009b
        L_0x009a:
            r1 = 0
        L_0x009b:
            X.SKI.A01(r7, r1)
            X.4gR r1 = r15.A00
            if (r1 == 0) goto L_0x00e3
            X.1yd r1 = r1.A04
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x00e3
            r1 = 2131428370(0x7f0b0412, float:1.8478383E38)
            android.view.View r2 = r7.requireViewById(r1)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1 = 2131626769(0x7f0e0b11, float:1.8880784E38)
            r2.setLayoutResource(r1)
            r2.inflate()
            r1 = 2131428362(0x7f0b040a, float:1.8478366E38)
            android.view.View r4 = r7.requireViewById(r1)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            X.4gR r1 = r15.A00
            X.0qQ.A0B(r1, r0)
            X.Ro4 r1 = r1.A03
            com.instagram.common.session.UserSession r1 = r1.A00
            X.0xa r2 = X.AnonymousClass7TE.A0q(r1)
            java.lang.String r1 = "autofill_passkey_opt_in_cache_key"
            boolean r1 = r2.getBoolean(r1, r14)
            r4.setChecked(r1)
            X.Sbs r1 = new X.Sbs
            r1.<init>(r15, r14)
            r4.setOnCheckedChangeListener(r1)
        L_0x00e3:
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r1 = "contact_entries"
            java.util.ArrayList r18 = r2.getParcelableArrayList(r1)
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r1 = "requested_fields"
            java.util.ArrayList r1 = r2.getStringArrayList(r1)
            if (r1 == 0) goto L_0x01a1
            java.util.HashSet r19 = X.C66580MXl.A12(r1)
        L_0x00fe:
            if (r18 == 0) goto L_0x019f
            boolean r1 = r18.isEmpty()
            if (r1 != 0) goto L_0x019f
            if (r19 == 0) goto L_0x019f
            boolean r1 = r19.isEmpty()
            if (r1 != 0) goto L_0x019f
            r1 = 2131428348(0x7f0b03fc, float:1.8478338E38)
            android.view.View r1 = X.DbY.A0F(r7, r1)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r1
            r16 = r8
            r17 = r1
            r20 = r14
            X.SKI.A02(r15, r16, r17, r18, r19, r20)
        L_0x0120:
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r2 = "has_payment_entries"
            boolean r0 = r4.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x0198
            r0 = 2131428364(0x7f0b040c, float:1.847837E38)
            android.view.View r2 = X.DbY.A0F(r7, r0)
            r0 = 2131428367(0x7f0b040f, float:1.8478376E38)
            android.view.View r8 = r2.requireViewById(r0)
            android.os.Bundle r2 = r15.requireArguments()
            java.lang.String r0 = "bypass_w3cclient"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x0173
            X.Sds r2 = new X.Sds
            r2.<init>((int) r14, (java.lang.Object) r7, (java.lang.Object) r15, (java.lang.Object) r8)
            X.S33 r0 = r15.A02
            if (r0 == 0) goto L_0x0156
            X.2Fj r0 = r0.A00()
            r0.A06(r15, r2)
        L_0x0156:
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r4 = r7.requireViewById(r0)
            r2 = 2
            X.SbL r0 = new X.SbL
            r0.<init>((int) r2, (java.lang.Object) r15, (java.lang.Object) r1, (java.lang.Object) r8)
            X.AnonymousClass0fU.A00(r0, r4)
            r0 = 2131437021(0x7f0b25dd, float:1.8495929E38)
            android.view.View r1 = r7.requireViewById(r0)
            r0 = 9
            X.C11497SbK.A01(r1, r0, r15)
            return r3
        L_0x0173:
            r0 = 2
            X.Sds r5 = new X.Sds
            r5.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r15, (java.lang.Object) r8)
            androidx.fragment.app.FragmentActivity r2 = r15.requireActivity()
            X.4gR r0 = r15.A00
            X.2Fg r4 = new X.2Fg
            r4.<init>(r2, r0)
            android.content.Context r2 = r4.A04
            java.lang.String r0 = "org.chromium.intent.action.IS_READY_TO_PAY"
            android.content.Intent r0 = X.2Fg.A01(r2, r4, r0)
            if (r0 == 0) goto L_0x0156
            X.Svs r0 = new X.Svs
            r0.<init>(r5, r15, r4)
            r4.A04(r0)
            goto L_0x0156
        L_0x0198:
            r0 = 2131428371(0x7f0b0413, float:1.8478385E38)
            X.DbX.A1B(r7, r0)
            goto L_0x0156
        L_0x019f:
            r1 = r8
            goto L_0x0120
        L_0x01a1:
            r19 = r8
            goto L_0x00fe
        L_0x01a5:
            r14 = 1
            androidx.fragment.app.FragmentActivity r5 = r15.requireActivity()
            r11 = 2131972509(0x7f13519d, float:1.9582028E38)
            r12 = 2131428341(0x7f0b03f5, float:1.8478324E38)
            r13 = 2131953393(0x7f1306f1, float:1.9543256E38)
            X.STY r1 = r15.A01
            X.QKv r1 = r1.A04
            android.os.Bundle r6 = r1.A02()
            X.4gR r9 = r15.A00
            X.SKI.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 2131435828(0x7f0b2134, float:1.849351E38)
            X.JTR.A1C(r7, r1)
            goto L_0x0086
        L_0x01c8:
            r0 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            android.view.View r0 = r7.findViewById(r0)
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKI.A0F(android.os.Bundle):android.app.Dialog");
    }
}
