package X;

import android.view.View;

/* renamed from: X.SbM  reason: case insensitive filesystem */
public final class C11499SbM implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11499SbM(Q5I q5i, C7411QBv qBv, int i) {
        this.A00 = i;
        if (11 - i != 0) {
            this.A01 = q5i;
            this.A02 = qBv;
        } else {
            this.A02 = qBv;
            this.A01 = q5i;
        }
    }

    public static C11499SbM A00(Object obj, Object obj2, int i) {
        return new C11499SbM(i, obj, obj2);
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new C11499SbM(i, obj, obj2), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.SHz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v44 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0c1a, code lost:
        r0 = "loggingData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0d3b, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0d42, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x1150, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x1153, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x1369, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x136c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x14e7, code lost:
        r1.setOverScrollMode(2);
        r1.setVerticalScrollBarEnabled(r2);
        r1.setDivider(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x14f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x1529, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x152c, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x07f6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0812  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r28) {
        /*
            r27 = this;
            r2 = r27
            int r0 = r2.A00
            r5 = r28
            switch(r0) {
                case 0: goto L_0x14f8;
                case 1: goto L_0x144f;
                case 2: goto L_0x13c8;
                case 3: goto L_0x136d;
                case 4: goto L_0x1256;
                case 5: goto L_0x1154;
                case 6: goto L_0x1111;
                case 7: goto L_0x1078;
                case 8: goto L_0x1055;
                case 9: goto L_0x102c;
                case 10: goto L_0x0fd6;
                case 11: goto L_0x0f86;
                case 12: goto L_0x0f6c;
                case 13: goto L_0x0f23;
                case 14: goto L_0x0ed7;
                case 15: goto L_0x0ebd;
                case 16: goto L_0x0e9f;
                case 17: goto L_0x0e88;
                case 18: goto L_0x0e71;
                case 19: goto L_0x0e5a;
                case 20: goto L_0x0e43;
                case 21: goto L_0x0e28;
                case 22: goto L_0x0e09;
                case 23: goto L_0x0df2;
                case 24: goto L_0x0ddb;
                case 25: goto L_0x0dc4;
                case 26: goto L_0x0dad;
                case 27: goto L_0x0d92;
                case 28: goto L_0x0d7b;
                case 29: goto L_0x0d1e;
                case 30: goto L_0x0ce9;
                case 31: goto L_0x0ca4;
                case 32: goto L_0x0c8f;
                case 33: goto L_0x0b3e;
                case 34: goto L_0x0a66;
                case 35: goto L_0x0b92;
                case 36: goto L_0x09cc;
                case 37: goto L_0x0894;
                case 38: goto L_0x087d;
                case 39: goto L_0x0c22;
                case 40: goto L_0x0850;
                case 41: goto L_0x06e7;
                case 42: goto L_0x06d4;
                case 43: goto L_0x05dc;
                case 44: goto L_0x0526;
                case 45: goto L_0x04a1;
                case 46: goto L_0x042f;
                case 47: goto L_0x03bd;
                case 48: goto L_0x0375;
                case 49: goto L_0x0281;
                case 50: goto L_0x018c;
                case 51: goto L_0x015b;
                case 52: goto L_0x0132;
                case 53: goto L_0x0112;
                case 54: goto L_0x00b3;
                case 55: goto L_0x0028;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A01
            X.Qcx r0 = (X.C7926Qcx) r0
            java.lang.Object r3 = r2.A02
            android.view.View r3 = (android.view.View) r3
            java.util.List r0 = r0.A07
            java.util.Iterator r2 = r0.iterator()
        L_0x0017:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x14f2
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0017
        L_0x0028:
            java.lang.Object r3 = r2.A01
            X.Q5H r3 = (X.Q5H) r3
            java.lang.Object r2 = r2.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.common.session.UserSession r0 = r3.A00
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "instagram_android_13_notifications_priming_event"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "no_in_test"
            java.lang.String r0 = "experiment_group"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "mock_system_dialog_deny_clicked"
            java.lang.String r0 = "event_name"
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x0055:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r0 = 11
            r1 = 0
            r4.set(r0, r1)
            r0 = 12
            r4.set(r0, r1)
            r0 = 13
            r4.set(r0, r1)
            r0 = 14
            r4.set(r0, r1)
            r0 = 5
            r4.add(r0, r1)
            r1 = 6
            r0 = 100
            r4.add(r1, r0)
            long r0 = r4.getTimeInMillis()
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mute_all"
            X.1OC r0 = X.F7X.A01(r2, r0, r1)
            X.1ES.A03(r0)
            r3.dismiss()
            X.0wX r0 = X.C61170le.A00
            X.0xm r3 = X.AnonymousClass0xl.A00(r0)
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r2 = "eligible_to_mock_notification_dialog_showing_quota"
            r0 = 2
            int r0 = r1.getInt(r2, r0)
            int r1 = r0 + -1
            X.0xa r0 = r3.A00
            X.0xY r0 = r0.AR4()
            r0.E5Z(r2, r1)
            r0.apply()
            return
        L_0x00b3:
            r0 = -759209338(0xffffffffd2bf6286, float:-4.10995851E11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.R8X r4 = (X.R8X) r4
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "multiple_contact_add_contact_info_fragment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r2.A01
            X.2da r0 = (X.2da) r0
            r2 = 0
            r0.ARb(r2, r2)
            android.widget.ScrollView r1 = r4.A01
            if (r1 != 0) goto L_0x00e2
            java.lang.String r0 = "scrollView"
            goto L_0x0d3b
        L_0x00e2:
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A03
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "loadingSpinner"
            goto L_0x0d3b
        L_0x00ef:
            X.R8X.A01(r4)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r1 = -1
            android.content.Intent r0 = r4.A00
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "resultIntent"
            goto L_0x0d3b
        L_0x0100:
            r2.setResult(r1, r0)
            X.DbT.A1J(r4)
            goto L_0x010d
        L_0x0107:
            r0.setVisibility(r2)
            X.R8X.A01(r4)
        L_0x010d:
            r0 = 1901266836(0x71530794, float:1.044968E30)
            goto L_0x1369
        L_0x0112:
            r0 = -2135100006(0xffffffff80bcf59a, float:-1.7353179E-38)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Dg1 r0 = (X.C46498Dg1) r0
            X.FFy r3 = new X.FFy
            r3.<init>(r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r3.A03(r0)
            r0 = -829741952(0xffffffffce8b2480, float:-1.16721254E9)
            goto L_0x1150
        L_0x0132:
            r0 = 222419157(0xd41d8d5, float:5.973372E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.QCH r4 = (X.QCH) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            X.3pI r0 = r0.A0D
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1b()
            int r3 = r0 + -1
            if (r3 < 0) goto L_0x0156
            java.lang.Object r0 = r2.A02
            X.QEc r0 = (X.QEc) r0
            com.google.android.material.datepicker.Month r0 = r0.A01(r3)
            r4.A00(r0)
        L_0x0156:
            r0 = -2026373734(0xffffffff8737fd9a, float:-1.3841917E-34)
            goto L_0x1150
        L_0x015b:
            r0 = 2099624974(0x7d25bc0e, float:1.3768691E37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.QCH r4 = (X.QCH) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            X.3pI r0 = r0.A0D
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1a()
            int r3 = r0 + 1
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            X.2Rw r0 = r0.A0A
            int r0 = r0.getItemCount()
            if (r3 >= r0) goto L_0x0187
            java.lang.Object r0 = r2.A02
            X.QEc r0 = (X.QEc) r0
            com.google.android.material.datepicker.Month r0 = r0.A01(r3)
            r4.A00(r0)
        L_0x0187:
            r0 = -1415187758(0xffffffffaba5f2d2, float:-1.1791351E-12)
            goto L_0x1150
        L_0x018c:
            r0 = -1285233985(0xffffffffb364e2bf, float:-5.329161E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.QnD r3 = (X.C8271QnD) r3
            java.lang.Object r7 = r2.A02
            X.3lr r7 = (X.C250663lr) r7
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            r8 = 6
            java.lang.String r6 = "transaction_id"
            java.lang.String r0 = r7.getOptionalStringField(r8, r6)
            r0.getClass()
            java.lang.Long r0 = X.DbV.A0q(r0)
            r2.put(r6, r0)
            X.2FO r1 = r3.A08
            java.lang.String r0 = "fbpay_transactions_details_click"
            r1.Cgl(r0, r2)
            java.lang.Class<X.QTU> r12 = X.QTU.class
            r5 = 12
            java.lang.String r11 = "open_receipt_action"
            r1 = -441181603(0xffffffffe5b41a5d, float:-1.06314035E23)
            X.3lr r0 = r7.getOptionalTreeField(r5, r11, r12, r1)
            java.lang.String r2 = "logger_data"
            if (r0 == 0) goto L_0x021d
            X.3lr r1 = r7.getOptionalTreeField(r5, r11, r12, r1)
            java.lang.Class<X.QTT> r10 = X.QTT.class
            r9 = 0
            java.lang.String r5 = "action_data"
            r0 = 571648010(0x2212a80a, float:1.9875649E-18)
            X.3lr r0 = r1.getOptionalTreeField(r9, r5, r10, r0)
            if (r0 == 0) goto L_0x021d
            r1 = 12
            r0 = -441181603(0xffffffffe5b41a5d, float:-1.06314035E23)
            X.3lr r1 = r7.getOptionalTreeField(r1, r11, r12, r0)
            r0 = 571648010(0x2212a80a, float:1.9875649E-18)
            X.3lr r5 = r1.getOptionalTreeField(r9, r5, r10, r0)
            X.Nl0 r1 = X.C69418Nl0.A03
            java.lang.String r0 = "action_type"
            java.lang.Enum r1 = r5.getOptionalEnumField(r9, r0, r1)
            X.Nl0 r0 = X.C69418Nl0.A02
            if (r1 != r0) goto L_0x021d
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            r5.putParcelable(r2, r0)
            java.lang.String r0 = r7.getOptionalStringField(r8, r6)
            r5.putString(r6, r0)
            r1 = 2
            java.lang.String r0 = "transaction_details_bloks"
            X.SFA r2 = new X.SFA
            r2.<init>(r1, r0, r5)
        L_0x0213:
            X.2Fj r1 = r3.A06
        L_0x0215:
            X.SR4.A01(r1, r2)
        L_0x0218:
            r0 = 1102886619(0x41bcb6db, float:23.589285)
            goto L_0x1529
        L_0x021d:
            r1 = 7
            java.lang.String r0 = "show_legacy_receipt_view"
            boolean r0 = r7.getCoercedBooleanField(r1, r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r1 = "legacy_receipt_view_uri"
            java.lang.String r0 = r7.A0D(r1)
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r7.A0D(r1)
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = r7.A0D(r1)
            android.net.Uri r0 = X.0cp.A03(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            r2.getClass()
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.lang.String r1 = r0.A00()
            r1.getClass()
            java.lang.String r0 = X.Py7.A00()
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.AnonymousClass2E0.A0E()
            java.lang.String r1 = "Instagram"
            java.lang.String r0 = "transaction_source"
            android.net.Uri r0 = X.DbV.A08(r2, r0, r1)
            X.2Fj r1 = r3.A0A
            java.lang.String r2 = r0.toString()
            goto L_0x0215
        L_0x0268:
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            r1.putParcelable(r2, r0)
            java.lang.String r0 = r7.getOptionalStringField(r8, r6)
            r1.putString(r6, r0)
            java.lang.String r0 = "transaction_details"
            X.SFA r2 = new X.SFA
            r2.<init>(r0, r1)
            goto L_0x0213
        L_0x0281:
            r0 = 1659789908(0x62ee6254, float:2.1987052E21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A02
            X.Qn5 r5 = (X.C8263Qn5) r5
            java.lang.Object r0 = r2.A01
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r0 = (com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod) r0
            X.0qQ.A0A(r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            com.facebookpay.logging.FBPayLoggerData r7 = r5.A00
            r3 = 0
            java.lang.String r10 = r0.A06
            java.lang.String r9 = r0.A07
            java.lang.String r0 = "%s • %s"
            java.lang.String r6 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r10, r9)
            r12 = 0
            com.google.common.collect.ImmutableList$Builder r8 = X.Pxe.A0Y()
            java.lang.String r15 = "mcom_payout_method_display"
            com.fbpay.hub.form.params.FormLogEvents r11 = new com.fbpay.hub.form.params.FormLogEvents
            r13 = r12
            r14 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = 17
            X.QfI r2 = new X.QfI
            r2.<init>(r0)
            r0 = 2131954875(0x7f130cbb, float:1.9546262E38)
            r2.A03 = r0
            com.facebookpay.form.cell.label.LabelCellParams r0 = r2.A00()
            r8.add(r0)
            r0 = 2
            X.QfJ r2 = new X.QfJ
            r2.<init>(r0)
            r2.A0B = r10
            r0 = 2131954876(0x7f130cbc, float:1.9546264E38)
            r2.A03 = r0
            r2.A03 = r3
            X.C8029QfJ.A00(r2, r8)
            r0 = 18
            X.QfJ r2 = new X.QfJ
            r2.<init>(r0)
            java.lang.String r0 = "•••• %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9)
            r2.A0B = r0
            r0 = 2131954873(0x7f130cb9, float:1.9546258E38)
            r2.A03 = r0
            r2.A03 = r3
            X.C8029QfJ.A00(r2, r8)
            r0 = 19
            X.QfI r9 = new X.QfI
            r9.<init>(r0)
            r0 = 2131954874(0x7f130cba, float:1.954626E38)
            r9.A03 = r0
            X.SR9 r2 = new X.SR9
            r2.<init>()
            java.lang.String r0 = "https://www.facebook.com/policy.php"
            r2.A03(r0)
            r0 = 2131961907(0x7f132833, float:1.9560524E38)
            r2.A01 = r0
            java.lang.String r0 = "[[facebook_privacy_policy_token]]"
            r2.A03 = r0
            com.fbpay.hub.common.link.LinkParams r0 = new com.fbpay.hub.common.link.LinkParams
            r0.<init>((X.SR9) r2)
            com.google.common.collect.ImmutableList$Builder r3 = r9.A08
            r3.add(r0)
            X.SR9 r2 = new X.SR9
            r2.<init>()
            java.lang.String r0 = "https://www.kasikornglobalpayment.com/th/privacy-policy"
            r2.A03(r0)
            r0 = 2131964549(0x7f133285, float:1.9565883E38)
            r2.A01 = r0
            java.lang.String r0 = "[[kasikorn_global_payment_privacy_policy_token]]"
            r2.A03 = r0
            com.fbpay.hub.common.link.LinkParams r0 = new com.fbpay.hub.common.link.LinkParams
            r0.<init>((X.SR9) r2)
            r3.add(r0)
            com.facebookpay.form.cell.label.LabelCellParams r0 = r9.A00()
            r8.add(r0)
            com.google.common.collect.ImmutableList r3 = r8.build()
            boolean r2 = X.DbT.A1b(r3)
            java.lang.String r0 = "Provide at least one cell params"
            X.17k.A0G(r2, r0)
            com.fbpay.hub.form.params.FormParams r2 = new com.fbpay.hub.form.params.FormParams
            r2.<init>(r7, r11, r3, r6)
            java.lang.String r0 = "form_params"
            r4.putParcelable(r0, r2)
            X.2Fj r3 = r5.A06
            java.lang.String r2 = "form"
            X.SFA r0 = new X.SFA
            r0.<init>(r2, r4)
            X.SR4.A01(r3, r0)
            r0 = -530379898(0xffffffffe0630b86, float:-6.544127E19)
            goto L_0x1150
        L_0x0375:
            r0 = -1848067717(0xffffffff91d8b97b, float:-3.4193102E-28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A02
            com.fbpay.hub.orders.api.FBPayOrder r6 = (com.fbpay.hub.orders.api.FBPayOrder) r6
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "CHEXOrderItem"
            boolean r5 = r1.equals(r0)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            if (r5 == 0) goto L_0x03b9
            java.lang.String r1 = "order_id"
        L_0x0391:
            java.lang.String r0 = r6.A03
            r3.putString(r1, r0)
            java.lang.Object r2 = r2.A01
            X.Qn6 r2 = (X.C8264Qn6) r2
            com.facebookpay.logging.FBPayLoggerData r1 = r2.A00
            java.lang.String r0 = "logger_data"
            r3.putParcelable(r0, r1)
            if (r5 == 0) goto L_0x03b5
            java.lang.String r0 = "order_detail"
        L_0x03a6:
            X.SFA r1 = new X.SFA
            r1.<init>(r0, r3)
            X.2Fj r0 = r2.A06
            X.SR4.A01(r0, r1)
            r0 = 927265768(0x3744f3e8, float:1.1739299E-5)
            goto L_0x1529
        L_0x03b5:
            java.lang.String r0 = "transaction_details"
            goto L_0x03a6
        L_0x03b9:
            java.lang.String r1 = "transaction_id"
            goto L_0x0391
        L_0x03bd:
            r0 = -786682584(0xffffffffd11c2d28, float:-4.1923281E10)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.QnE r0 = (X.C8272QnE) r0
            java.lang.Object r7 = r2.A02
            X.3lr r7 = (X.C250663lr) r7
            com.facebookpay.logging.FBPayLoggerData r2 = r0.A00
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            java.lang.String r6 = "id"
            java.lang.String r2 = r7.A07(r6)
            r2.getClass()
            java.lang.Long r2 = X.DbV.A0q(r2)
            r4.put(r6, r2)
            java.lang.String r3 = "target_name"
            java.lang.String r2 = "edit_phone"
            r4.put(r3, r2)
            X.2FO r3 = r0.A03
            java.lang.String r2 = "user_edit_contact_enter"
            r3.Cgl(r2, r4)
            com.facebookpay.logging.FBPayLoggerData r5 = r0.A00
            java.lang.String r2 = "normalized_phone_number"
            java.lang.String r4 = r7.A09(r2)
            r3 = 1
            java.lang.String r2 = "is_default"
            boolean r3 = r7.getCoercedBooleanField(r3, r2)
            java.lang.String r2 = r7.A07(r6)
            java.lang.String r10 = "fbpay_edit_phone_display"
            java.lang.String r16 = "fbpay_edit_phone_click"
            java.lang.String r7 = "fbpay_edit_phone_cancel"
            java.lang.String r15 = "fbpay_edit_phone_api_init"
            java.lang.String r18 = "fbpay_edit_phone_success"
            java.lang.String r17 = "fbpay_edit_phone_failure"
            java.lang.String r12 = "fbpay_delete_phone_display"
            java.lang.String r9 = "fbpay_delete_phone_click"
            java.lang.String r8 = "fbpay_delete_phone_cancel"
            java.lang.String r11 = "fbpay_delete_phone_api_init"
            java.lang.String r14 = "fbpay_delete_phone_success"
            java.lang.String r13 = "fbpay_delete_phone_failure"
            com.fbpay.hub.form.params.FormLogEvents r6 = new com.fbpay.hub.form.params.FormLogEvents
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.fbpay.hub.form.params.FormParams r2 = X.C9675Ret.A00(r5, r6, r4, r2, r3)
            X.C8272QnE.A00(r0, r2)
            r0 = 85901543(0x51ec0e7, float:7.464555E-36)
            goto L_0x1150
        L_0x042f:
            r0 = -672648997(0xffffffffd7e830db, float:-5.10593061E14)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.QnE r0 = (X.C8272QnE) r0
            java.lang.Object r7 = r2.A02
            X.3lr r7 = (X.C250663lr) r7
            com.facebookpay.logging.FBPayLoggerData r2 = r0.A00
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            java.lang.String r6 = "id"
            java.lang.String r2 = r7.A07(r6)
            r2.getClass()
            java.lang.Long r2 = X.DbV.A0q(r2)
            r4.put(r6, r2)
            java.lang.String r3 = "target_name"
            java.lang.String r2 = "edit_email"
            r4.put(r3, r2)
            X.2FO r3 = r0.A03
            java.lang.String r2 = "user_edit_contact_enter"
            r3.Cgl(r2, r4)
            com.facebookpay.logging.FBPayLoggerData r5 = r0.A00
            java.lang.String r2 = "normalized_email_address"
            java.lang.String r4 = r7.A09(r2)
            r3 = 1
            java.lang.String r2 = "is_default"
            boolean r3 = r7.getCoercedBooleanField(r3, r2)
            java.lang.String r2 = r7.A07(r6)
            java.lang.String r10 = "fbpay_edit_email_display"
            java.lang.String r16 = "fbpay_edit_email_click"
            java.lang.String r7 = "fbpay_edit_email_cancel"
            java.lang.String r15 = "fbpay_edit_email_api_init"
            java.lang.String r18 = "fbpay_edit_email_success"
            java.lang.String r17 = "fbpay_edit_email_failure"
            java.lang.String r12 = "fbpay_delete_email_display"
            java.lang.String r9 = "fbpay_delete_email_click"
            java.lang.String r8 = "fbpay_delete_email_cancel"
            java.lang.String r11 = "fbpay_delete_email_api_init"
            java.lang.String r14 = "fbpay_delete_email_success"
            java.lang.String r13 = "fbpay_delete_email_failure"
            com.fbpay.hub.form.params.FormLogEvents r6 = new com.fbpay.hub.form.params.FormLogEvents
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.fbpay.hub.form.params.FormParams r2 = X.C9674Res.A00(r5, r6, r4, r2, r3)
            X.C8272QnE.A00(r0, r2)
            r0 = -870837652(0xffffffffcc18126c, float:-3.9864752E7)
            goto L_0x1150
        L_0x04a1:
            r0 = -629043796(0xffffffffda818dac, float:-1.82330209E16)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.Qn8 r0 = (X.C8266Qn8) r0
            java.lang.Object r2 = r2.A02
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            boolean r24 = r2.isEmpty()
            com.facebookpay.logging.FBPayLoggerData r2 = r0.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            X.2FO r3 = r0.A03
            java.lang.String r2 = "user_add_shippingaddress_enter"
            r3.Cgl(r2, r4)
            com.facebookpay.logging.FBPayLoggerData r3 = r0.A01
            com.facebookpay.form.model.AddressFormFieldsConfig r2 = r0.A00
            r2.getClass()
            X.SRV r4 = X.AnonymousClass2E0.A0E()
            com.instagram.common.session.UserSession r5 = r4.A09
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r4.A01(r5)
            java.lang.String r17 = r4.getFullName()
            java.lang.String r8 = "fbpay_add_shipping_address_display"
            java.lang.String r14 = "fbpay_add_shipping_address_click"
            java.lang.String r5 = "fbpay_add_shipping_address_cancel"
            java.lang.String r13 = "fbpay_add_shipping_address_api_init"
            java.lang.String r16 = "fbpay_add_shipping_address_success"
            java.lang.String r15 = "fbpay_add_shipping_address_failure"
            java.lang.String r10 = "fbpay_delete_shipping_address_display"
            java.lang.String r7 = "fbpay_delete_shipping_address_click"
            java.lang.String r6 = "fbpay_delete_shipping_address_cancel"
            java.lang.String r9 = "fbpay_delete_shipping_address_api_init"
            java.lang.String r12 = "fbpay_delete_shipping_address_success"
            java.lang.String r11 = "fbpay_delete_shipping_address_failure"
            com.fbpay.hub.form.params.FormLogEvents r4 = new com.fbpay.hub.form.params.FormLogEvents
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = 0
            r13 = r3
            r14 = r4
            r16 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r12 = r2
            com.fbpay.hub.form.params.FormParams r3 = X.C9672Req.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "form_params"
            r4.putParcelable(r2, r3)
            X.2Fj r3 = r0.A06
            java.lang.String r2 = "form"
            X.SFA r0 = new X.SFA
            r0.<init>(r2, r4)
            X.SR4.A01(r3, r0)
            r0 = -556023607(0xffffffffdedbc0c9, float:-7.9174386E18)
            goto L_0x1150
        L_0x0526:
            r0 = -588562543(0xffffffffdceb3f91, float:-5.29732092E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.Qn8 r0 = (X.C8266Qn8) r0
            java.lang.Object r6 = r2.A02
            X.3lr r6 = (X.C250663lr) r6
            com.facebookpay.logging.FBPayLoggerData r2 = r0.A01
            java.util.LinkedHashMap r5 = X.C2818159r.A06(r2)
            java.lang.String r4 = "id"
            java.lang.String r2 = r6.A07(r4)
            r2.getClass()
            java.lang.Long r2 = X.DbV.A0q(r2)
            r5.put(r4, r2)
            X.2FO r3 = r0.A03
            java.lang.String r2 = "user_edit_shippingaddress_enter"
            r3.Cgl(r2, r5)
            com.facebookpay.logging.FBPayLoggerData r3 = r0.A01
            java.lang.String r17 = r6.A07(r4)
            r4 = 9
            java.lang.String r2 = "label"
            java.lang.String r18 = r6.getOptionalStringField(r4, r2)
            java.lang.String r2 = "care_of"
            java.lang.String r19 = r6.A09(r2)
            r4 = 7
            java.lang.String r2 = "street1"
            java.lang.String r20 = r6.getOptionalStringField(r4, r2)
            java.lang.String r2 = "street2"
            java.lang.String r21 = r6.A0D(r2)
            java.lang.String r2 = "city_name"
            java.lang.String r22 = r6.A0A(r2)
            java.lang.String r2 = "postal_code"
            java.lang.String r23 = r6.A0B(r2)
            java.lang.String r2 = "state_name"
            java.lang.String r24 = r6.A0C(r2)
            r4 = 6
            java.lang.String r2 = "country_name"
            java.lang.String r25 = r6.getOptionalStringField(r4, r2)
            com.facebookpay.form.model.AddressFormFieldsConfig r2 = r0.A00
            r2.getClass()
            r5 = 1
            java.lang.String r4 = "is_default"
            boolean r26 = r6.getCoercedBooleanField(r5, r4)
            java.lang.String r8 = "fbpay_edit_shipping_address_display"
            java.lang.String r14 = "fbpay_edit_shipping_address_click"
            java.lang.String r5 = "fbpay_edit_shipping_address_cancel"
            java.lang.String r13 = "fbpay_edit_shipping_address_api_init"
            java.lang.String r16 = "fbpay_edit_shipping_address_success"
            java.lang.String r15 = "fbpay_edit_shipping_address_failure"
            java.lang.String r10 = "fbpay_delete_shipping_address_display"
            java.lang.String r7 = "fbpay_delete_shipping_address_click"
            java.lang.String r6 = "fbpay_delete_shipping_address_cancel"
            java.lang.String r9 = "fbpay_delete_shipping_address_api_init"
            java.lang.String r12 = "fbpay_delete_shipping_address_success"
            java.lang.String r11 = "fbpay_delete_shipping_address_failure"
            com.fbpay.hub.form.params.FormLogEvents r4 = new com.fbpay.hub.form.params.FormLogEvents
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r3
            r16 = r4
            r14 = r2
            com.fbpay.hub.form.params.FormParams r3 = X.C9672Req.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "form_params"
            r4.putParcelable(r2, r3)
            X.2Fj r3 = r0.A06
            java.lang.String r2 = "form"
            X.SFA r0 = new X.SFA
            r0.<init>(r2, r4)
            X.SR4.A01(r3, r0)
            r0 = -167640481(0xfffffffff602025f, float:-6.592253E32)
            goto L_0x1150
        L_0x05dc:
            r0 = -825916332(0xffffffffcec58454, float:-1.6568919E9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.QCG r5 = (X.QCG) r5
            X.QDA r4 = r5.A01
            android.os.Bundle r3 = r5.requireArguments()
            java.lang.Object r0 = r2.A02
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r6 = r0.isChecked()
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r3)
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r0)
            X.RIj r2 = X.RIj.PIN
            java.lang.String r0 = "auth_factor_type"
            r3.put(r0, r2)
            if (r6 == 0) goto L_0x06d0
            X.RIw r2 = X.C8957RIw.TURN_OFF_ALWAYS_ASK_FOR_PIN
        L_0x0608:
            java.lang.String r0 = "target_name"
            X.2FO r2 = X.SRV.A02(r0, r2, r3)
            java.lang.String r0 = "user_click_auth_atomic"
            r2.Cgl(r0, r3)
            X.2Fk r2 = r4.A01
            boolean r0 = X.SUj.A0Q(r2)
            if (r0 == 0) goto L_0x0665
            java.lang.Object r0 = r2.A02()
            r0.getClass()
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r3 = r0.A01
            X.RpH r3 = (X.C10257RpH) r3
            if (r3 == 0) goto L_0x0665
            X.2Fj r6 = r4.A04
            java.lang.String r2 = X.QDA.A00(r4)
            android.os.Bundle r0 = r4.A00
            r0.getClass()
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r0)
            X.RsH r4 = X.C11301SKl.A01(r0, r2)
            java.lang.String r2 = r3.A00
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x067d
            android.os.Bundle r3 = r4.A01
            java.lang.String r0 = "VERIFY_PIN_TO_DISABLE_PIN_HUB"
            X.SQ8.A02(r0, r3)
            java.lang.String r2 = "DISABLE_PIN"
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x065d
            java.lang.String r0 = "AUTH_EXTENSION_ID"
            r3.putString(r0, r2)
        L_0x065d:
            java.lang.String r0 = "DISABLE_FBPAY_PIN"
            X.Pxi.A0w(r3, r0)
        L_0x0662:
            X.SR4.A02(r6, r4)
        L_0x0665:
            android.os.Bundle r4 = r5.requireArguments()
            java.lang.String r3 = "fbpay_always_ask_for_pin_click"
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r0.A01
            java.util.Map r0 = X.S9s.A01(r4)
            r2.Cgl(r3, r0)
            r0 = 1638021574(0x61a239c6, float:3.7406694E20)
            goto L_0x1150
        L_0x067d:
            java.lang.String r0 = "DELETED"
            boolean r0 = r0.equalsIgnoreCase(r2)
            java.lang.String r7 = "ENABLE_FBPAY_PIN"
            if (r0 == 0) goto L_0x0692
            android.os.Bundle r2 = r4.A01
            X.Pxi.A0w(r2, r7)
            java.lang.String r0 = "CREATE_PIN_FROM_HUB"
        L_0x068e:
            X.SQ8.A02(r0, r2)
            goto L_0x0662
        L_0x0692:
            java.lang.String r0 = "DISABLED"
            boolean r0 = r0.equalsIgnoreCase(r2)
            java.lang.String r3 = "ENABLE_PIN"
            if (r0 == 0) goto L_0x06b1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x06a9
            android.os.Bundle r2 = r4.A01
            java.lang.String r0 = "AUTH_EXTENSION_ID"
            r2.putString(r0, r3)
        L_0x06a9:
            android.os.Bundle r2 = r4.A01
            X.Pxi.A0w(r2, r7)
            java.lang.String r0 = "VERIFY_PIN_TO_ENABLE_PIN_HUB"
            goto L_0x068e
        L_0x06b1:
            java.lang.String r0 = "LOCKED"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0662
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x06c6
            android.os.Bundle r2 = r4.A01
            java.lang.String r0 = "AUTH_EXTENSION_ID"
            r2.putString(r0, r3)
        L_0x06c6:
            android.os.Bundle r2 = r4.A01
            java.lang.String r0 = "RESET_FBPAY_PIN"
            X.Pxi.A0w(r2, r0)
            java.lang.String r0 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB"
            goto L_0x068e
        L_0x06d0:
            X.RIw r2 = X.C8957RIw.TURN_ON_ALWAYS_ASK_FOR_PIN
            goto L_0x0608
        L_0x06d4:
            r0 = 2054666974(0x7a77bade, float:3.2157186E35)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            r0 = -895907890(0xffffffffca9987ce, float:-5030887.0)
            goto L_0x1150
        L_0x06e7:
            r0 = 593363351(0x235e0197, float:1.2034981E-17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.QCG r3 = (X.QCG) r3
            X.QDA r4 = r3.A01
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            android.os.Bundle r7 = r3.requireArguments()
            java.lang.Object r0 = r2.A02
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r8 = r0.isChecked()
            java.lang.String r6 = "logger_data"
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r7)
            java.util.LinkedHashMap r7 = X.C2818159r.A06(r0)
            X.RIj r2 = X.RIj.BIO
            java.lang.String r0 = "auth_factor_type"
            r7.put(r0, r2)
            if (r8 == 0) goto L_0x084c
            X.RIw r2 = X.C8957RIw.TURN_OFF_USE_BIO_ID
        L_0x0719:
            java.lang.String r0 = "target_name"
            X.2FO r2 = X.SRV.A02(r0, r2, r7)
            java.lang.String r0 = "user_click_auth_atomic"
            r2.Cgl(r0, r7)
            X.QDE r12 = r4.A06
            X.2Fk r8 = r12.A02
            X.SUj r7 = X.Pxe.A0W(r8)
            if (r7 == 0) goto L_0x074d
            boolean r0 = X.SUj.A0V(r7)
            if (r0 == 0) goto L_0x0765
            java.lang.String r5 = X.QDA.A00(r4)
            android.os.Bundle r4 = r4.A00
            X.2gB r0 = r12.A03
            boolean r0 = X.SUj.A0R(r0)
            if (r0 != 0) goto L_0x074d
            r2 = 1
            X.Sdd r0 = new X.Sdd
            r0.<init>(r4, r12, r5, r2)
            X.SUj.A0H(r8, r0)
        L_0x074d:
            android.os.Bundle r4 = r3.requireArguments()
            java.lang.String r3 = "fbpay_use_faceid_click"
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r0.A01
            java.util.Map r0 = X.S9s.A01(r4)
            r2.Cgl(r3, r0)
            r0 = -2063885562(0xffffffff84fb9b06, float:-5.9152183E-36)
            goto L_0x1150
        L_0x0765:
            boolean r0 = X.SUj.A0S(r7)
            if (r0 == 0) goto L_0x074d
            java.lang.Throwable r2 = r7.A02
            boolean r0 = r2 instanceof X.C13223TQo
            if (r0 == 0) goto L_0x074d
            r2.getClass()
            X.TQo r2 = (X.C13223TQo) r2
            int r2 = r2.A00
            r0 = 102(0x66, float:1.43E-43)
            if (r2 != r0) goto L_0x078e
            java.lang.Object r0 = r7.A01
            if (r0 == 0) goto L_0x07c3
            java.lang.String r5 = X.QDA.A00(r4)
            X.SNj r0 = (X.C11330SNj) r0
            java.lang.String r2 = r0.A06
            android.os.Bundle r0 = r4.A00
            r12.A02(r0, r5, r2)
            goto L_0x074d
        L_0x078e:
            r0 = 11
            if (r2 != r0) goto L_0x07c3
            X.2Fj r2 = r4.A05
            r7 = 0
            r0 = 3
            X.SV1 r9 = new X.SV1
            r9.<init>(r0, r5, r4)
            r15 = 2131953306(0x7f13069a, float:1.954308E38)
            r19 = 1
            r17 = 0
            r16 = 2131953308(0x7f13069c, float:1.9543083E38)
            r20 = 2131953309(0x7f13069d, float:1.9543085E38)
            r21 = 2131953307(0x7f13069b, float:1.9543081E38)
            X.SOk r6 = new X.SOk
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r18 = r17
            r22 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x07ba:
            X.SR4 r0 = new X.SR4
            r0.<init>(r6)
        L_0x07bf:
            r2.A0A(r0)
            goto L_0x074d
        L_0x07c3:
            r9 = 1
            r0 = 12
            if (r2 == r0) goto L_0x074d
            if (r2 == r9) goto L_0x074d
            X.2Fk r0 = r4.A01
            X.SUj r2 = X.Pxe.A0W(r0)
            boolean r0 = X.SUj.A0V(r2)
            if (r0 == 0) goto L_0x0812
            java.lang.Object r0 = X.SUj.A0D(r2)
            X.RpH r0 = (X.C10257RpH) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "DELETED"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0812
            java.lang.String r7 = "SETUP_PIN_TO_CREATE_BIO_HUB"
        L_0x07e8:
            java.lang.String r8 = X.QDA.A00(r4)
            android.os.Bundle r11 = r4.A00
            X.2gB r2 = r12.A04
            boolean r0 = X.SUj.A0R(r2)
            if (r0 != 0) goto L_0x074d
            r5 = 0
            X.SUj r0 = X.SUj.A08(r5)
            r2.A0A(r0)
            X.Q2D r4 = r12.A01
            r0 = 15
            int r4 = r4.A03(r0)
            if (r4 == 0) goto L_0x0815
            X.TQo r0 = new X.TQo
            r0.<init>(r4)
            X.SUj r0 = X.SUj.A0A(r5, r0)
            goto L_0x07bf
        L_0x0812:
            java.lang.String r7 = "VERIFY_PIN_TO_ENABLE_BIO_HUB"
            goto L_0x07e8
        L_0x0815:
            X.Suq r10 = new X.Suq
            r13 = r7
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r11)
            X.RsH r4 = X.C11301SKl.A01(r0, r8)
            android.os.Bundle r2 = r4.A01
            X.SQ8.A02(r7, r2)
            if (r11 == 0) goto L_0x0833
            android.os.Parcelable r0 = r11.getParcelable(r6)
            r2.putParcelable(r6, r0)
        L_0x0833:
            java.lang.String r0 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            X.Pxi.A0w(r2, r0)
            X.2Fj r2 = r12.A05
            X.5A3 r0 = r12.A09
            X.2E5 r0 = r0.A00
            java.util.concurrent.Executor r0 = r0.A03
            X.S4v r6 = new X.S4v
            r8 = r5
            r9 = r5
            r7 = r5
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x07ba
        L_0x084c:
            X.RIw r2 = X.C8957RIw.TURN_ON_USE_BIO_ID
            goto L_0x0719
        L_0x0850:
            r0 = -1361785223(0xffffffffaed4ce79, float:-9.677321E-11)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            com.facebookpay.widget.listcell.ListCell r3 = (com.facebookpay.widget.listcell.ListCell) r3
            com.facebookpay.logging.LoggingContext r0 = r3.A0N
            if (r0 == 0) goto L_0x0871
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = r3.A0M
            if (r0 == 0) goto L_0x0871
            X.Sto r4 = X.C11353SOm.A00()
            java.util.LinkedHashMap r3 = X.Re4.A00(r3)
            java.lang.String r0 = "user_click_fbpayui_atomic"
            r4.Cgl(r0, r3)
        L_0x0871:
            java.lang.Object r0 = r2.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            r0 = 1111294350(0x423d018e, float:47.25152)
            goto L_0x1150
        L_0x087d:
            r0 = -1263621728(0xffffffffb4aea9a0, float:-3.2533444E-7)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qf0 r0 = (X.C8013Qf0) r0
            X.0sP r3 = r0.A05
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = -1137730127(0xffffffffbc2f9db1, float:-0.010718749)
            goto L_0x1150
        L_0x0894:
            r0 = -963581595(0xffffffffc690e965, float:-18548.697)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r2.A02
            X.QgR r8 = (X.C8073QgR) r8
            java.lang.Object r0 = r2.A01
            X.QXe r0 = (X.C7793QXe) r0
            X.QVm r5 = r0.A0E()
            if (r5 == 0) goto L_0x09bf
            X.RGU r4 = X.RGU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 1
            java.lang.String r2 = "transaction_type"
            java.lang.Enum r2 = r5.getOptionalEnumField(r3, r2, r4)
            X.RGU r2 = (X.RGU) r2
            if (r2 == 0) goto L_0x09bf
            int r2 = r2.ordinal()
        L_0x08bb:
            r3 = 2
            java.lang.String r5 = "Required value was null."
            if (r2 == r3) goto L_0x096e
            r3 = 1
            if (r2 != r3) goto L_0x090e
            r9 = 0
            X.QVm r2 = r0.A0E()
            java.lang.String r4 = "transaction_id"
            java.lang.String r13 = r2.A07(r4)
            if (r13 == 0) goto L_0x09c2
            java.lang.String r10 = "user_click_payouthub_atomic"
            java.lang.String r11 = "earnings_details_view_click"
            r12 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            X.C8073QgR.A05(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.QVm r2 = r0.A0E()
            java.lang.String r3 = r2.A07(r4)
            if (r3 == 0) goto L_0x096b
            r2 = 10
            java.lang.Integer r2 = X.00y.A0m(r3, r2)
            if (r2 == 0) goto L_0x096b
            int r18 = r2.intValue()
        L_0x08fc:
            X.QVm r2 = r0.A0E()
            java.lang.String r11 = r2.A07(r4)
            java.lang.String r13 = "transactions"
            r17 = 667750821(0x27cd11a5, float:5.691806E-15)
            r10 = r8
            X.C8073QgR.A07(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x090e:
            r3 = 0
            X.QVm r6 = r0.A0E()
            if (r6 == 0) goto L_0x095f
            X.RGU r4 = X.RGU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 1
            java.lang.String r2 = "transaction_type"
            java.lang.Enum r2 = r6.getOptionalEnumField(r5, r2, r4)
            X.RGU r2 = (X.RGU) r2
            if (r2 == 0) goto L_0x095f
            int r4 = r2.ordinal()
            r2 = 2
            if (r4 == r2) goto L_0x0964
            if (r4 != r5) goto L_0x095f
            java.lang.String r7 = "earnings_details_v2_fragment"
            java.lang.String r6 = "payout_record_id"
        L_0x0931:
            X.2gB r5 = r8.A03
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.3lr r2 = X.C8115Qh7.A09(r8)
            if (r2 == 0) goto L_0x0941
            java.lang.String r3 = X.Pxh.A0j(r2)
        L_0x0941:
            java.lang.String r2 = "financial_entity_id"
            r4.putString(r2, r3)
            X.C8115Qh7.A0A(r4, r8)
            X.QVm r2 = r0.A0E()
            java.lang.String r0 = "transaction_id"
            java.lang.String r0 = r2.A07(r0)
            r4.putString(r6, r0)
            X.Su0 r0 = new X.Su0
            r0.<init>(r7, r4)
            X.SR4.A01(r5, r0)
        L_0x095f:
            r0 = 1871799743(0x6f9165bf, float:8.999666E28)
            goto L_0x1150
        L_0x0964:
            java.lang.String r7 = "payout_details_v2_fragment"
            java.lang.String r6 = "payout_release_id"
            goto L_0x0931
        L_0x096b:
            r18 = 0
            goto L_0x08fc
        L_0x096e:
            X.QVm r2 = r0.A0E()
            java.lang.String r4 = "transaction_id"
            java.lang.String r12 = r2.A07(r4)
            if (r12 == 0) goto L_0x09c7
            r9 = 0
            java.lang.String r10 = "user_click_payouthub_atomic"
            java.lang.String r11 = "payouts_details_view_click"
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            X.C8073QgR.A05(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.QVm r2 = r0.A0E()
            java.lang.String r3 = r2.A07(r4)
            if (r3 == 0) goto L_0x09bc
            r2 = 10
            java.lang.Integer r2 = X.00y.A0m(r3, r2)
            if (r2 == 0) goto L_0x09bc
            int r16 = r2.intValue()
        L_0x09a8:
            X.QVm r2 = r0.A0E()
            java.lang.String r10 = r2.A07(r4)
            java.lang.String r11 = "transactions"
            r15 = 667750653(0x27cd10fd, float:5.691735E-15)
            r12 = r9
            X.C8073QgR.A07(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x090e
        L_0x09bc:
            r16 = 0
            goto L_0x09a8
        L_0x09bf:
            r2 = -1
            goto L_0x08bb
        L_0x09c2:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r5)
            throw r2
        L_0x09c7:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r5)
            throw r2
        L_0x09cc:
            r0 = 757175434(0x2d21948a, float:9.184773E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A02
            X.QgN r6 = (X.C8069QgN) r6
            java.lang.Object r7 = r2.A01
            X.TlZ r7 = (X.C13931TlZ) r7
            X.C11426STk.A04()
            r11 = 0
            java.lang.String r3 = r7.Bb3()
            if (r3 == 0) goto L_0x0a61
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r0 = "payouthub_payouts_view_click"
            X.C8069QgN.A02(r6, r2, r3, r0)
            java.lang.String r12 = r7.getId()
            if (r12 == 0) goto L_0x0a59
            r0 = 10
            java.lang.Integer r0 = X.00y.A0m(r12, r0)
            if (r0 == 0) goto L_0x0a59
            int r19 = r0.intValue()
        L_0x0a00:
            X.AnonymousClass2E0.A02()
            X.2gB r8 = r6.A03
            java.lang.Object r0 = r8.A02()
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0a5c
            java.lang.String r2 = "financial_id"
            java.lang.String r9 = r0.A07(r2)
            if (r9 == 0) goto L_0x0a5c
            java.lang.String r10 = "payouthub_payouts"
            r18 = 667750653(0x27cd10fd, float:5.691735E-15)
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            X.SQ2.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.2gB r5 = r6.A03
            java.lang.String r4 = "payout_details_v2_fragment"
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Object r0 = r8.A02()
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0a3a
            java.lang.String r11 = r0.A07(r2)
        L_0x0a3a:
            java.lang.String r0 = "financial_entity_id"
            r3.putString(r0, r11)
            X.C8115Qh7.A0A(r3, r6)
            java.lang.String r2 = r7.getId()
            java.lang.String r0 = "payout_release_id"
            r3.putString(r0, r2)
            X.Su0 r0 = new X.Su0
            r0.<init>(r4, r3)
            X.SR4.A01(r5, r0)
            r0 = 1630383453(0x612dad5d, float:2.0023618E20)
            goto L_0x1150
        L_0x0a59:
            r19 = 0
            goto L_0x0a00
        L_0x0a5c:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0a61:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0a66:
            r0 = -25412340(0xfffffffffe7c3d0c, float:-8.3820607E37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r2.A02
            X.QDO r9 = (X.QDO) r9
            java.lang.Object r3 = r2.A01
            X.QXT r3 = (X.QXT) r3
            r7 = 0
            java.lang.Class<X.QU2> r5 = X.QU2.class
            r4 = 6
            java.lang.String r2 = "action"
            r0 = -720091827(0xffffffffd514454d, float:-1.01890853E13)
            X.3lr r4 = r3.getOptionalTreeField(r4, r2, r5, r0)
            r15 = 0
            if (r4 == 0) goto L_0x0b0d
            java.lang.Class<X.QU1> r2 = X.QU1.class
            r0 = 115444621(0x6e18b8d, float:8.4840645E-35)
            X.3lr r8 = r4.reinterpretRequired(r7, r2, r0)
            if (r8 == 0) goto L_0x0b0d
            X.RGG r2 = X.RGG.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r8.getOptionalEnumField(r7, r0, r2)
            X.RGG r0 = (X.RGG) r0
            if (r0 == 0) goto L_0x0b0d
            int r0 = r0.ordinal()
            r6 = 5
            if (r0 != r6) goto L_0x0b0d
            java.lang.Class<X.QU0> r5 = X.QU0.class
            r4 = 1
            java.lang.String r2 = "PAYObjectNotificationActionURL"
            r0 = 253749097(0xf1fe769, float:7.883873E-30)
            X.3lr r2 = r8.reinterpretIfFulfillsType(r4, r2, r5, r0)
            if (r2 == 0) goto L_0x0ab9
            java.lang.String r0 = "redirect_url"
            java.lang.String r15 = r2.getOptionalStringField(r7, r0)
        L_0x0ab9:
            java.lang.String r0 = "notification_identifier"
            java.lang.String r12 = r3.A08(r0)
            X.RGh r0 = r3.A0E()
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "button_content"
            java.lang.String r14 = r3.getOptionalStringField(r6, r0)
            java.lang.String r0 = "header_content"
            java.lang.String r20 = r3.A0A(r0)
            java.lang.String r10 = "user_click_payouthub_atomic"
            java.lang.String r11 = "notification_hub_action_click"
            r16 = 0
            r17 = r16
            r18 = r16
            r19 = r16
            r21 = r16
            r22 = r16
            X.QDO.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r15 == 0) goto L_0x0b08
            X.RGh r2 = r3.A0E()
            X.RGh r0 = X.C8939RGh.PAYOUT_HOLD
            if (r2 == r0) goto L_0x0afb
            X.RGh r2 = r3.A0E()
            X.RGh r0 = X.C8939RGh.TASKLESS_INTERVIEW_INCOMPLETE
            if (r2 != r0) goto L_0x0afe
        L_0x0afb:
            X.C11426STk.A04()
        L_0x0afe:
            X.2Fj r2 = r9.A08
            X.Stz r0 = new X.Stz
            r0.<init>(r15)
            X.SR4.A01(r2, r0)
        L_0x0b08:
            r0 = 1563831620(0x5d362d44, float:8.2045145E17)
            goto L_0x1150
        L_0x0b0d:
            java.lang.String r0 = "notification_identifier"
            java.lang.String r12 = r3.A08(r0)
            X.RGh r0 = r3.A0E()
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "button_content"
            java.lang.String r14 = r3.A0C(r0)
            java.lang.String r0 = "header_content"
            java.lang.String r20 = r3.A0A(r0)
            java.lang.String r10 = "user_click_payouthub_atomic"
            java.lang.String r11 = "notification_hub_action_click"
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r22 = r15
            X.QDO.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b08
        L_0x0b3e:
            r0 = -1180527348(0xffffffffb9a2950c, float:-3.1010096E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A02
            X.Qh8 r5 = (X.C8116Qh8) r5
            java.lang.Object r0 = r2.A01
            X.2Fj r1 = r5.A05
            r1.A0B(r0)
            X.2FO r3 = X.C11426STk.A00()
            com.facebookpay.msc.logging.LoggingData r0 = r5.A02
            if (r0 == 0) goto L_0x0c1a
            java.util.HashMap r2 = X.C9634ReE.A00(r0)
            java.lang.Object r0 = r1.A02()
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0b8d
            java.lang.String r1 = X.Pxh.A0j(r0)
            if (r1 == 0) goto L_0x0b8d
            java.lang.String r0 = "financial_entity_id"
            r2.put(r0, r1)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "payouthub_financial_entity_choose_option_click"
            r2.put(r1, r0)
            java.lang.String r1 = r5.A0B()
            java.lang.String r0 = "view_name"
            r2.put(r0, r1)
            java.lang.String r0 = "user_click_payouthub_atomic"
            r3.Cgl(r0, r2)
            r0 = 371035280(0x161d8c90, float:1.2726713E-25)
            goto L_0x1529
        L_0x0b8d:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0b92:
            r0 = 639647552(0x26203f40, float:5.559687E-16)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r14 = r2.A02
            X.QhB r14 = (X.C8119QhB) r14
            java.lang.Object r3 = r2.A01
            X.3lr r3 = (X.C250663lr) r3
            r0 = 0
            java.lang.String r2 = "payout_record_id"
            java.lang.String r5 = r3.getOptionalStringField(r0, r2)
            if (r5 == 0) goto L_0x0c15
            r6 = 0
            java.lang.String r15 = "user_click_payouthub_atomic"
            java.lang.String r16 = "payouthub_earnings_detail_view_click"
            r17 = r6
            r18 = r5
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            X.C8119QhB.A06(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = 10
            java.lang.Integer r0 = X.00y.A0m(r5, r0)
            int r13 = X.DbX.A01(r0)
            X.AnonymousClass2E0.A02()
            java.lang.String r3 = r14.A03
            if (r3 == 0) goto L_0x0c1e
            java.lang.String r7 = r14.A04
            java.lang.String r4 = "payout_details"
            r12 = 667750821(0x27cd11a5, float:5.691806E-15)
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            X.SQ2.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.2gB r4 = r14.A03
            X.0eP r5 = X.AnonymousClass7TE.A1L(r2, r5)
            com.facebookpay.msc.logging.LoggingData r2 = r14.A01
            if (r2 == 0) goto L_0x0c1a
            java.lang.String r0 = "logging_data"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.String r2 = r14.A03
            if (r2 == 0) goto L_0x0c1e
            java.lang.String r0 = "financial_entity_id"
            X.0eP[] r0 = X.Pxg.A1b(r0, r2, r5, r3)
            android.os.Bundle r3 = X.Q21.A00(r0)
            java.lang.String r2 = r14.A04
            if (r2 == 0) goto L_0x0c0b
            java.lang.String r0 = "managed_merchant_account_id"
            r3.putString(r0, r2)
        L_0x0c0b:
            java.lang.String r2 = "earnings_details_v2_fragment"
            X.Su0 r0 = new X.Su0
            r0.<init>(r2, r3)
            X.SR4.A01(r4, r0)
        L_0x0c15:
            r0 = 1503684983(0x59a06977, float:5.6439945E15)
            goto L_0x1150
        L_0x0c1a:
            java.lang.String r0 = "loggingData"
            goto L_0x0d3b
        L_0x0c1e:
            java.lang.String r0 = "financialID"
            goto L_0x0d3b
        L_0x0c22:
            r0 = -218282079(0xfffffffff2fd47a1, float:-1.00334466E31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.QhP r3 = (X.C8131QhP) r3
            X.QDM r0 = r3.A09()
            X.QDL r0 = r0.A0Q
            java.util.List r9 = r0.A07()
            X.QDM r0 = r3.A09()
            X.QDL r0 = r0.A0Q
            java.util.List r10 = r0.A09()
            X.SNr r4 = X.C11336SNr.A00
            android.view.ContextThemeWrapper r5 = r3.A00
            if (r5 != 0) goto L_0x0c4c
            java.lang.String r0 = "wrapperContext"
            goto L_0x0d3b
        L_0x0c4c:
            androidx.fragment.app.Fragment r6 = r3.mParentFragment
            if (r6 == 0) goto L_0x0c84
            java.lang.Object r0 = r2.A01
            X.QEW r0 = (X.QEW) r0
            com.facebookpay.logging.LoggingContext r8 = r0.A03
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r3.A0I
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "ecpPaymentRequest"
            goto L_0x0d3b
        L_0x0c5e:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.RFs r7 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"
            X.0qQ.A0C(r9, r0)
            r0 = 28
            X.TY2 r11 = X.TY2.A00(r3, r0)
            r0 = 29
            X.TY2 r12 = X.TY2.A00(r3, r0)
            X.QDM r0 = r3.A09()
            X.QDL r0 = r0.A0Q
            boolean r13 = r0.A06
            r4.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -596166800(0xffffffffdc773770, float:-2.78341094E17)
            goto L_0x1150
        L_0x0c84:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -1295449779(0xffffffffb2c9014d, float:-2.3400071E-8)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0c8f:
            r0 = -223697511(0xfffffffff2aaa599, float:-6.760019E30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = -352784492(0xffffffffeaf8ef94, float:-1.5047249E26)
            goto L_0x1150
        L_0x0ca4:
            r0 = 1837890039(0x6d8bf9f7, float:5.4150757E27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.Qh6 r4 = (X.C8114Qh6) r4
            java.lang.Object r0 = r2.A01
            X.QXV r0 = (X.QXV) r0
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.QXU r0 = (X.QXU) r0
            if (r0 == 0) goto L_0x0ce4
            X.QUR r1 = r0.A0E()
            if (r1 == 0) goto L_0x0ce4
            java.lang.String r0 = "url"
            java.lang.String r2 = r1.A07(r0)
            if (r2 == 0) goto L_0x0ce4
            java.lang.String r1 = "user_click_payouthub_atomic"
            java.lang.String r0 = "payouthub_link_click"
            X.C8114Qh6.A02(r4, r1, r0, r2)
            X.2gB r1 = r4.A03
            X.Stz r0 = new X.Stz
            r0.<init>(r2)
            X.SR4.A01(r1, r0)
        L_0x0ce4:
            r0 = -1927773487(0xffffffff8d1882d1, float:-4.699608E-31)
            goto L_0x1369
        L_0x0ce9:
            r0 = -657712084(0xffffffffd8cc1c2c, float:-1.79537095E15)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r2.A01
            X.QXV r0 = (X.QXV) r0
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.QXU r0 = (X.QXU) r0
            if (r0 == 0) goto L_0x0d1c
            X.QUR r2 = r0.A0E()
            if (r2 == 0) goto L_0x0d1c
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.A07(r0)
        L_0x0d14:
            r3.invoke(r0)
            r0 = 456626289(0x1b379071, float:1.5184077E-22)
            goto L_0x1150
        L_0x0d1c:
            r0 = 0
            goto L_0x0d14
        L_0x0d1e:
            r0 = -1311809332(0xffffffffb1cf60cc, float:-6.0354974E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A02
            X.Qh4 r5 = (X.C8112Qh4) r5
            java.lang.Object r1 = r2.A01
            X.3lr r1 = (X.C250663lr) r1
            r4 = 1
            java.lang.String r0 = "cta_uri"
            java.lang.String r2 = r1.getOptionalStringField(r4, r0)
            X.QVi r1 = r5.A00
            if (r1 != 0) goto L_0x0d43
            java.lang.String r0 = "topLevelDialog"
        L_0x0d3b:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0d43:
            java.lang.String r0 = "is_hard_block"
            boolean r4 = r1.getCoercedBooleanField(r4, r0)
            if (r2 == 0) goto L_0x0d69
            boolean r0 = X.00l.A0W(r2)
            if (r0 != 0) goto L_0x0d69
            java.lang.String r1 = "user_click_payouthub_atomic"
            java.lang.String r0 = "payouthub_update_dialogue_accept_click"
            X.C8112Qh4.A02(r5, r1, r0, r2)
            X.2gB r1 = r5.A03
            X.Stz r0 = new X.Stz
            r0.<init>(r2)
        L_0x0d61:
            X.SR4.A01(r1, r0)
            r0 = -1329112134(0xffffffffb0c75bba, float:-1.4505226E-9)
            goto L_0x1369
        L_0x0d69:
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r1 = "payouthub_update_dialogue_dismiss_click"
            r0 = 0
            X.C8112Qh4.A02(r5, r2, r1, r0)
            X.2gB r1 = r5.A03
            X.Sty r0 = new X.Sty
            r0.<init>(r4)
            goto L_0x0d61
        L_0x0d7b:
            r0 = 914953331(0x36891473, float:4.0852988E-6)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qek r0 = (X.C7997Qek) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 2129443871(0x7eecbc1f, float:1.5733729E38)
            goto L_0x1150
        L_0x0d92:
            r0 = -1857294102(0xffffffff914bf0ea, float:-1.6088114E-28)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.QEW r0 = (X.QEW) r0
            android.view.View$OnClickListener r3 = r0.A00
            java.lang.Object r0 = r2.A01
            X.QF4 r0 = (X.QF4) r0
            com.facebookpay.widget.paybutton.FBPayAnimationButton r0 = r0.A00
            r3.onClick(r0)
            r0 = 2124435701(0x7ea050f5, float:1.0654842E38)
            goto L_0x1150
        L_0x0dad:
            r0 = -120962922(0xfffffffff8ca4096, float:-3.281731E34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qee r0 = (X.C7991Qee) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = -73641631(0xfffffffffb9c5161, float:-1.6232977E36)
            goto L_0x1150
        L_0x0dc4:
            r0 = -1620906637(0xffffffff9f62ed73, float:-4.8053775E-20)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qee r0 = (X.C7991Qee) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = -749637432(0xffffffffd35170c8, float:-8.9954032E11)
            goto L_0x1150
        L_0x0ddb:
            r0 = -859591882(0xffffffffccc3ab36, float:-1.025868E8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qed r0 = (X.C7990Qed) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 1646350174(0x62214f5e, float:7.439112E20)
            goto L_0x1150
        L_0x0df2:
            r0 = 1082846167(0x408aebd7, float:4.341289)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qea r0 = (X.C7987Qea) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 1114641108(0x427012d4, float:60.018387)
            goto L_0x1150
        L_0x0e09:
            r0 = 1675964809(0x63e53189, float:8.4557476E21)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r5 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem) r5
            java.lang.String r4 = r5.A02
            if (r4 == 0) goto L_0x0e23
            java.lang.Object r0 = r2.A02
            X.QeX r0 = (X.C7984QeX) r0
            X.0sL r1 = r0.A00
            java.lang.String r0 = r5.A00
            r1.invoke(r4, r0)
        L_0x0e23:
            r0 = -996726399(0xffffffffc4972981, float:-1209.297)
            goto L_0x1369
        L_0x0e28:
            r0 = -307491097(0xffffffffedac0ee7, float:-6.6561797E27)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qeg r0 = (X.C7993Qeg) r0
            X.0sP r3 = r0.A01
            java.lang.Object r0 = r2.A01
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r0 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem) r0
            java.lang.String r0 = r0.A00
            r3.invoke(r0)
            r0 = -12509700(0xffffffffff411dfc, float:-2.566967E38)
            goto L_0x1150
        L_0x0e43:
            r0 = -596357052(0xffffffffdc745044, float:-2.75072589E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.QeV r0 = (X.C7982QeV) r0
            X.0sP r3 = r0.A00
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 619810918(0x24f19066, float:1.0476171E-16)
            goto L_0x1150
        L_0x0e5a:
            r0 = 866570107(0x33a6cf7b, float:7.767718E-8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qex r0 = (X.C8010Qex) r0
            X.0sP r3 = r0.A02
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 47107294(0x2ceccde, float:3.0386568E-37)
            goto L_0x1150
        L_0x0e71:
            r0 = -1370381335(0xffffffffae51a3e9, float:-4.766668E-11)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qew r0 = (X.C8009Qew) r0
            X.0sP r3 = r0.A02
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = -733648158(0xffffffffd4456ae2, float:-3.39160701E12)
            goto L_0x1150
        L_0x0e88:
            r0 = -797862409(0xffffffffd07195f7, float:-1.62125486E10)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.Qev r0 = (X.C8008Qev) r0
            X.0sP r3 = r0.A02
            java.lang.Object r0 = r2.A01
            r3.invoke(r0)
            r0 = 912289038(0x36606d0e, float:3.344208E-6)
            goto L_0x1150
        L_0x0e9f:
            r0 = 659877918(0x2754f01e, float:2.9551078E-15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A02
            X.Qd0 r2 = (X.C7929Qd0) r2
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L_0x0eb8
            r1 = 55
            X.SbK r0 = new X.SbK
            r0.<init>(r2, r1)
            X.C7929Qd0.A00(r0, r2)
        L_0x0eb8:
            r0 = 437709103(0x1a16e92f, float:3.1207637E-23)
            goto L_0x1369
        L_0x0ebd:
            r0 = 484369624(0x1cdee4d8, float:1.4749882E-21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.Qd0 r3 = (X.C7929Qd0) r3
            r2 = 54
            X.SbK r0 = new X.SbK
            r0.<init>(r3, r2)
            X.C7929Qd0.A00(r0, r3)
            r0 = 1426609039(0x5508538f, float:9.3682789E12)
            goto L_0x1150
        L_0x0ed7:
            r0 = -1013641700(0xffffffffc3950e1c, float:-298.11023)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.Qcu r4 = (X.C7923Qcu) r4
            androidx.viewpager.widget.ViewPager r0 = r4.A04
            X.0qQ.A0A(r0)
            int r3 = r0.getCurrentItem()
            java.lang.Object r0 = r2.A01
            X.QFY r0 = (X.QFY) r0
            java.util.List r0 = r0.A00
            int r0 = X.C51966G9m.A06(r0)
            if (r3 != r0) goto L_0x0f0b
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r0 = r0.get()
            X.TaW r0 = (X.C13443TaW) r0
            if (r0 == 0) goto L_0x0f06
            com.facebook.smartcapture.view.SelfieOnboardingActivity r0 = (com.facebook.smartcapture.view.SelfieOnboardingActivity) r0
            com.facebook.smartcapture.view.SelfieOnboardingActivity.A01(r0)
        L_0x0f06:
            r0 = 1917201787(0x72462d7b, float:3.925313E30)
            goto L_0x1150
        L_0x0f0b:
            androidx.viewpager.widget.ViewPager r2 = r4.A04
            X.0qQ.A0A(r2)
            androidx.viewpager.widget.ViewPager r0 = r4.A04
            X.0qQ.A0A(r0)
            int r0 = r0.getCurrentItem()
            int r0 = r0 + 1
            r2.setCurrentItem(r0)
            r0 = 997063445(0x3b6dfb15, float:0.0036312987)
            goto L_0x1150
        L_0x0f23:
            r0 = 1037366238(0x3dd4f3de, float:0.103980765)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A02
            X.QBy r5 = (X.C7414QBy) r5
            java.lang.Object r1 = r2.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            int r0 = r1.getVisibility()
            r3 = 1
            if (r0 != 0) goto L_0x0f6a
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L_0x0f6a
        L_0x0f3f:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "allowMobileData"
            X.0eP[] r0 = X.DbW.A1b(r0, r1)
            X.C7414QBy.A00(r5, r2, r2, r0)
            X.0eM r0 = r5.A01
            X.Jfk r2 = X.Pxh.A0O(r0)
            X.2Fk r0 = r2.A07
            java.lang.Object r1 = r0.A02()
            boolean r0 = r1 instanceof X.C13941Tln
            if (r0 == 0) goto L_0x0f65
            X.Tln r1 = (X.C13941Tln) r1
            if (r1 == 0) goto L_0x0f65
            X.C60104Jfk.A00(r2, r1, r3)
        L_0x0f65:
            r0 = 527760655(0x1f74fd0f, float:5.1878335E-20)
            goto L_0x1529
        L_0x0f6a:
            r3 = 0
            goto L_0x0f3f
        L_0x0f6c:
            r0 = 551792414(0x20e3af1e, float:3.8571179E-19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1K(r0)
            r0 = 1663587764(0x632855b4, float:3.1052286E21)
            goto L_0x1150
        L_0x0f86:
            r0 = -1642149846(0xffffffff9e1ec82a, float:-8.405843E-21)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.QBv r4 = (X.C7411QBv) r4
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r1 = 0
            X.0eP[] r0 = new X.0eP[r1]
            X.0eM r5 = r4.A01
            X.Jfk r4 = X.Pxh.A0O(r5)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            X.0eP[] r1 = (X.0eP[]) r1
            X.L7Y r0 = new X.L7Y
            r0.<init>(r7, r6, r7, r1)
            r4.A0E(r0)
            X.Jfk r0 = X.Pxh.A0O(r5)
            X.2Fk r0 = r0.A07
            java.lang.Object r1 = r0.A02()
            boolean r0 = r1 instanceof X.C7622QQm
            if (r0 == 0) goto L_0x0fca
            X.SoN r1 = (X.C12172SoN) r1
            if (r1 == 0) goto L_0x0fca
            X.S4u r4 = r1.A00
            X.S1A r1 = r4.A03
            X.TC3 r0 = new X.TC3
            r0.<init>(r4)
            r1.A00(r0)
        L_0x0fca:
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r0 = -1265366955(0xffffffffb4940855, float:-2.757321E-7)
            goto L_0x1369
        L_0x0fd6:
            r0 = -897335318(0xffffffffca83bfea, float:-4317173.0)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.QBu r0 = (X.C7410QBu) r0
            X.0eM r8 = r0.A01
            X.Jfk r0 = X.Pxh.A0O(r8)
            X.2Fk r0 = r0.A07
            java.lang.Object r7 = r0.A02()
            boolean r0 = r7 instanceof X.C13943Tlp
            if (r0 == 0) goto L_0x102a
            X.Ta9 r7 = (X.C13423Ta9) r7
        L_0x0ff3:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r0 = 1
            if (r7 != 0) goto L_0x0ffb
            r0 = 0
        L_0x0ffb:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "isCancelable"
            X.0eP[] r3 = X.DbW.A1b(r0, r1)
            X.Jfk r1 = X.Pxh.A0O(r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Pxj.A1F(r1, r6, r5, r0, r3)
            if (r7 == 0) goto L_0x101e
            X.SoN r7 = (X.C12172SoN) r7
            X.S4u r3 = r7.A00
            X.S1A r1 = r3.A03
            X.TC2 r0 = new X.TC2
            r0.<init>(r3)
            r1.A00(r0)
        L_0x101e:
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r0 = 1274304140(0x4bf4568c, float:3.202588E7)
            goto L_0x1529
        L_0x102a:
            r7 = 0
            goto L_0x0ff3
        L_0x102c:
            r0 = -1505372154(0xffffffffa645d806, float:-6.864087E-16)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A02
            X.QBu r3 = (X.C7410QBu) r3
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r0 = 0
            X.0eP[] r4 = new X.0eP[r0]
            X.0eM r0 = r3.A01
            X.Jfk r3 = X.Pxh.A0O(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Pxj.A1F(r3, r6, r5, r0, r4)
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r0 = 421651245(0x1921e32d, float:8.369383E-24)
            goto L_0x1150
        L_0x1055:
            r0 = -1896907363(0xffffffff8eef7d9d, float:-5.903901E-30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.QKb r0 = (X.C7570QKb) r0
            com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel r0 = r0.A00
            java.lang.String r0 = r0.A00
            android.content.Intent r3 = X.DbX.A09(r0)
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            X.0kR.A09(r0, r3)
            r0 = 1532175825(0x5b5325d1, float:5.94328E16)
            goto L_0x1150
        L_0x1078:
            r0 = -1266781891(0xffffffffb47e713d, float:-2.3696789E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.7ka r0 = (X.C340027ka) r0
            androidx.fragment.app.FragmentActivity r7 = r0.getActivity()
            if (r7 == 0) goto L_0x110c
            java.lang.Object r0 = r2.A02
            X.QKa r0 = (X.C7569QKa) r0
            com.instagram.common.session.UserSession r9 = r0.A01
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r0 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r1 = "tel: +"
            java.lang.String r0 = r0.A00
            java.lang.String r8 = X.002.A0R(r1, r0)
            java.lang.String r2 = "ig_iab_sticky_footer_clicked"
            r6 = 0
            r1 = 1
            r0 = 3
            X.0qQ.A0B(r8, r0)
            X.T7B r5 = new X.T7B
            r5.<init>(r9, r4, r2)
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r0 = X.1DL.A07(r7, r0)
            r5.A02(r0)
            X.8ab r4 = new X.8ab
            r4.<init>((android.app.Activity) r7)
            r4.A0s(r1)
            r2 = 2131954433(0x7f130b01, float:1.9545365E38)
            java.lang.String r1 = "tel:"
            java.lang.String r0 = ""
            java.lang.String r1 = X.00p.A0g(r8, r1, r0, r6)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, r0)
            X.0qQ.A0A(r0)
            java.lang.String r2 = X.DbY.A0c(r7, r0, r2)
            r1 = 4
            X.SV5 r0 = new X.SV5
            r0.<init>(r7, r5, r8, r1)
            r4.A0c(r0, r2)
            X.SUw r0 = new X.SUw
            r0.<init>(r5, r6)
            r4.A0B(r0)
            android.app.Dialog r4 = r4.A02()
            android.view.Window r2 = r4.getWindow()
            if (r2 == 0) goto L_0x1104
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            if (r1 == 0) goto L_0x1101
            r0 = 80
            r1.gravity = r0
            r0 = -1
            r1.width = r0
        L_0x1101:
            r2.setAttributes(r1)
        L_0x1104:
            X.AnonymousClass0fN.A00(r4)
            java.lang.String r0 = "ctc_confirmation_dialog_shown"
            X.T7B.A01(r5, r0)
        L_0x110c:
            r0 = -62597738(0xfffffffffc44d596, float:-4.088089E36)
            goto L_0x1369
        L_0x1111:
            r0 = 984895735(0x3ab450f7, float:0.001375704)
            int r1 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.Object r0 = r2.A02
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            org.json.JSONObject r0 = r0.A01()
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            r6.putString(r0, r3)
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r0 = "save_autofill_request_fragment"
            r6.putString(r3, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.lang.Object r4 = r2.A01
            X.0SM r4 = (X.0SM) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            r0 = 676(0x2a4, float:9.47E-43)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            X.AnonymousClass6W8.A05(r3, r6, r5, r2, r0)
            r4.A07()
            r0 = 1403057514(0x53a0f56a, float:1.38262426E12)
        L_0x1150:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x1154:
            r0 = 302950328(0x120ea7b8, float:4.501403E-28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.QKB r4 = (X.QKB) r4
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r0 = r4.A00
            if (r0 == 0) goto L_0x1249
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r4.A05
            if (r0 == 0) goto L_0x1249
            java.lang.Object r1 = r2.A02
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r1
            int r0 = r1.A00
            android.view.View r0 = r1.requireViewById(r0)
            java.lang.Object r5 = r0.getTag()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r5 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r5
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r4.A05
            r7 = 0
            if (r0 == 0) goto L_0x1253
            java.util.LinkedHashSet r1 = r0.A01()
        L_0x1180:
            X.1yd r0 = r4.A04
            r6 = 1
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = X.S8K.A01(r0, r5, r1, r6)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r4.A05
            java.lang.String r0 = "callbackID"
            java.lang.Object r1 = X.Pxh.A0d(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            r2.getClass()
            org.json.JSONObject r0 = r2.A01()
            android.os.Bundle r2 = com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall.A01(r1, r0)
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r1 = r4.A00
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r4.A05
            r1.A0C(r2, r0)
            X.QKv r0 = r4.A03
            if (r0 == 0) goto L_0x11aa
            r0.A0C(r5)
        L_0x11aa:
            X.S5W r1 = r4.A01
            r2 = 0
            if (r1 == 0) goto L_0x1216
            java.lang.String r0 = "ACCEPTED_AUTOFILL"
            X.RRP r5 = r1.A00(r0, r2)
            java.lang.String r0 = r4.A07
            r5.A0A = r0
            java.lang.String r0 = r4.A06
            r5.A08 = r0
            java.util.List r0 = r4.A08
            int r0 = r0.size()
            r5.A00 = r0
            X.4gR r0 = r4.A02
            if (r0 == 0) goto L_0x11cf
            X.RzL r0 = r0.A00
            X.QP6 r0 = r0.A06
            java.lang.String r7 = r0.A05
        L_0x11cf:
            r5.A0G = r7
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r4.A05
            java.lang.String r0 = "requestAutofillData"
            java.lang.Object r0 = X.Pxh.A0d(r1, r0)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
            if (r0 != 0) goto L_0x1250
            r0 = 0
        L_0x11df:
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A06 = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r4.A05
            java.util.LinkedHashSet r0 = r0.A01()
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A0F = r0
            java.util.List r0 = r4.A08
            java.lang.Object r0 = r0.get(r2)
            java.util.Set r0 = X.Pxj.A10(r0)
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A07 = r0
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x120d
            boolean r1 = r4.A0A
            boolean r0 = r4.A09
            if (r1 == 0) goto L_0x124e
            if (r0 != 0) goto L_0x124e
        L_0x120d:
            r5.A0P = r6
            r4.A0H(r5)
            X.SHz r7 = r5.A00()
        L_0x1216:
            android.os.Bundle r1 = r4.mArguments
            X.4gR r0 = r4.A02
            X.SUR.A0A(r1, r0, r7)
            X.4gR r0 = r4.A02
            if (r0 == 0) goto L_0x1246
            boolean r0 = r4.A0I(r2)
            if (r0 == 0) goto L_0x1246
            X.4gR r0 = r4.A02
            X.RzL r0 = r0.A00
            X.QP4 r0 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1246
            X.QKv r0 = r4.A03
            if (r0 == 0) goto L_0x1246
            X.S5u r0 = r0.A09
            if (r0 == 0) goto L_0x1246
            com.instagram.common.session.UserSession r2 = r0.A01
            X.4gR r0 = r0.A00
            X.RzL r0 = r0.A00
            X.QP4 r0 = r0.A00
            long r0 = r0.A00
            X.SRr.A02(r2, r0)
        L_0x1246:
            r4.A07()
        L_0x1249:
            r0 = 1996394493(0x76fe8ffd, float:2.58157E33)
            goto L_0x1369
        L_0x124e:
            r6 = 0
            goto L_0x120d
        L_0x1250:
            java.util.LinkedHashSet r0 = r0.A01
            goto L_0x11df
        L_0x1253:
            r1 = r7
            goto L_0x1180
        L_0x1256:
            r0 = 787030095(0x2ee9204f, float:1.06013524E-10)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.SRY r7 = X.SRY.A00()
            java.lang.Object r4 = r2.A01
            com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome r4 = (com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome) r4
            X.7ka r6 = r4.A0D
            com.facebook.browser.lite.BrowserLiteFragment r6 = (com.facebook.browser.lite.BrowserLiteFragment) r6
            X.A9z r0 = r6.A0d
            com.facebook.iabeventlogging.model.IABEvent r5 = r0.A00()
            android.os.Bundle r1 = r4.A02
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r6.A0e
            r7.A06(r1, r5, r0)
            java.lang.Object r9 = r2.A02
            java.util.AbstractCollection r9 = (java.util.AbstractCollection) r9
            X.QLA r0 = r4.A0G
            if (r0 == 0) goto L_0x1366
            java.lang.String r0 = r0.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x1366
            java.lang.String r0 = "OPEN_SAVED_LINKS"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            java.util.HashSet r8 = X.C66580MXl.A12(r0)
            android.content.Intent r1 = r4.A01
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ACTION_BUTTON"
            r1.getBundleExtra(r0)
            X.SOg r6 = new X.SOg
            r6.<init>()
            android.content.Context r5 = r4.A00
            X.7kb r7 = r4.A0E
            X.7ka r2 = r4.A0D
            boolean r0 = r7.canGoBack()
            if (r0 != 0) goto L_0x12b0
            boolean r0 = r7.canGoForward()
            if (r0 == 0) goto L_0x12b3
        L_0x12b0:
            X.QK4.A00(r6, r7)
        L_0x12b3:
            java.util.Iterator r12 = r9.iterator()
        L_0x12b7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x131d
            java.lang.Object r1 = r12.next()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "action"
            java.lang.String r10 = r1.getString(r0)
            boolean r0 = r8.contains(r10)
            if (r0 != 0) goto L_0x12b7
            java.lang.String r0 = "KEY_LABEL"
            java.lang.String r11 = r1.getString(r0)
            r0 = r7
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x12eb
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x12eb
            java.util.HashSet r0 = X.C10063Rm0.A00
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x12eb
            goto L_0x12b7
        L_0x12eb:
            java.lang.String r0 = "KEY_ICON_RES"
            int r9 = r1.getInt(r0)
            if (r10 != 0) goto L_0x1312
            java.lang.String r0 = "MENU_OPEN_WITH"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x12b7
            X.QK5 r1 = X.QK5.A01(r5, r2, r7, r9)
            if (r1 == 0) goto L_0x12b7
        L_0x1301:
            java.lang.String r0 = "ACTION_REPORT"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x130e
            r0 = 2132017793(0x7f140281, float:1.9673874E38)
            r1.A01 = r0
        L_0x130e:
            r6.A04(r1)
            goto L_0x12b7
        L_0x1312:
            X.SOg r1 = X.C11347SOg.A02(r10)
            r1.A03 = r11
            if (r9 <= 0) goto L_0x1301
            r1.A00 = r9
            goto L_0x1301
        L_0x131d:
            java.util.ArrayList r0 = r6.A04
            if (r0 == 0) goto L_0x1366
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1366
            boolean r2 = r4.A0I
            java.util.ArrayList r1 = r6.A04
            X.SlB r0 = new X.SlB
            r0.<init>(r4)
            X.QA3 r1 = X.QA3.A00(r5, r0, r1, r2)
            r4.A0C = r1
            r0 = 2131231190(0x7f0801d6, float:1.8078454E38)
            r1.A01(r0)
            X.QA3 r1 = r4.A0C
            android.widget.ImageView r0 = r4.A06
            r1.setAnchorView(r0)
            X.QA3 r0 = r4.A0C
            r0.show()
            X.QA3 r0 = r4.A0C
            android.widget.ListView r1 = r0.getListView()
            r0 = 2
            r1.setOverScrollMode(r0)
            X.QA3 r0 = r4.A0C
            android.widget.ListView r1 = r0.getListView()
            r0 = 0
            r1.setVerticalScrollBarEnabled(r0)
            X.QA3 r0 = r4.A0C
            android.widget.ListView r1 = r0.getListView()
            r0 = 0
            r1.setDivider(r0)
        L_0x1366:
            r0 = 285488700(0x1104363c, float:1.0429676E-28)
        L_0x1369:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x136d:
            r0 = -1010374356(0xffffffffc3c6e92c, float:-397.82166)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A02
            com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome r6 = (com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome) r6
            android.content.Intent r3 = r6.A00
            r1 = 0
            if (r3 == 0) goto L_0x13a9
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_OPEN_MENU_AFTER_EXPANSION_ON_PARTIAL_SHEET_THREE_DOTS_CLICKED"
            boolean r0 = r3.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x13a9
            r0 = 1
            r6.A0H = r0
            java.lang.Object r0 = r2.A01
            X.7ka r0 = (X.C340027ka) r0
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.RvU r2 = r0.A0f
            if (r2 == 0) goto L_0x139c
            X.SUL r1 = r2.A01
            boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x13a1
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x13a1
        L_0x139c:
            r0 = -856819016(0xffffffffccedfab8, float:-1.24769728E8)
            goto L_0x1529
        L_0x13a1:
            X.37D r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A0T(r0)
            goto L_0x139c
        L_0x13a9:
            X.SRY r5 = X.SRY.A00()
            java.lang.Object r3 = r2.A01
            X.7ka r3 = (X.C340027ka) r3
            com.facebook.browser.lite.BrowserLiteFragment r3 = (com.facebook.browser.lite.BrowserLiteFragment) r3
            X.A9z r0 = r3.A0d
            if (r0 == 0) goto L_0x13c6
            com.facebook.iabeventlogging.model.IABEvent r2 = r0.A00()
        L_0x13bb:
            android.os.Bundle r1 = r6.A01
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r3.A0e
            r5.A06(r1, r2, r0)
            com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.A02(r6)
            goto L_0x139c
        L_0x13c6:
            r2 = 0
            goto L_0x13bb
        L_0x13c8:
            java.lang.Object r3 = r2.A01
            com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome r3 = (com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome) r3
            java.lang.Object r9 = r2.A02
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            X.SRY r5 = X.SRY.A00()
            X.7ka r4 = r3.A05
            com.facebook.browser.lite.BrowserLiteFragment r4 = (com.facebook.browser.lite.BrowserLiteFragment) r4
            X.A9z r0 = r4.A0d
            com.facebook.iabeventlogging.model.IABEvent r2 = r0.A00()
            android.os.Bundle r1 = r3.A01
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r4.A0e
            r5.A06(r1, r2, r0)
            X.7kb r0 = r3.A06
            X.QLA r1 = r0.C8U()
            if (r1 == 0) goto L_0x14f7
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x1444
            java.lang.String r0 = r1.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x1444
        L_0x13f9:
            X.SOg r6 = new X.SOg
            r6.<init>()
            android.content.Context r5 = r3.getContext()
            X.7kb r8 = r3.A06
            X.7ka r7 = r3.A05
            java.util.HashSet r10 = X.AnonymousClass7TE.A1F()
            X.RUD.A00(r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r0 = r6.A04
            if (r0 == 0) goto L_0x14f7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x14f7
            java.util.ArrayList r1 = r6.A04
            r4 = 0
            X.Sl9 r0 = new X.Sl9
            r0.<init>(r3)
            r2 = 0
            X.QA3 r1 = X.QA3.A00(r5, r0, r1, r2)
            r3.A04 = r1
            r0 = 2130970084(0x7f0405e4, float:1.7548868E38)
            int r0 = X.2Yu.A0H(r5, r0)
            r1.A01(r0)
            X.QA3 r1 = r3.A04
            android.widget.ImageView r0 = r3.A02
            r1.setAnchorView(r0)
            X.QA3 r0 = r3.A04
            r0.show()
            X.QA3 r0 = r3.A04
            android.widget.ListView r1 = r0.getListView()
            goto L_0x14e7
        L_0x1444:
            java.lang.String r0 = r1.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x13f9
            return
        L_0x144f:
            java.lang.Object r5 = r2.A01
            com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome r5 = (com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome) r5
            java.lang.Object r3 = r2.A02
            X.RyD r3 = (X.C10791RyD) r3
            X.7ka r0 = r5.A08
            if (r0 == 0) goto L_0x14f7
            android.os.Bundle r4 = r5.A01
            if (r4 == 0) goto L_0x14f7
            X.SRY r2 = X.SRY.A00()
            X.7ka r0 = r5.A08
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.A9z r0 = r0.A0d
            r0.getClass()
            com.facebook.iabeventlogging.model.IABEvent r1 = r0.A00()
            X.7ka r0 = r5.A08
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r0.A0e
            r2.A06(r4, r1, r0)
            X.7kb r7 = r3.A05
            X.QLA r4 = r7.C8U()
            if (r4 == 0) goto L_0x14f7
            boolean r0 = r4.A0b
            r1 = 1
            if (r0 == 0) goto L_0x1490
            java.lang.String r0 = r4.A0M
            if (r0 == 0) goto L_0x1490
            int r0 = r0.length()
            if (r0 != 0) goto L_0x1491
        L_0x1490:
            r1 = 0
        L_0x1491:
            r2 = 0
            if (r1 != 0) goto L_0x14a1
            java.lang.String r0 = r4.A05()
            if (r0 == 0) goto L_0x14f7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x14a1
            return
        L_0x14a1:
            X.SOg r5 = new X.SOg
            r5.<init>()
            android.content.Context r4 = r3.A01
            X.7ka r6 = r3.A04
            java.util.HashSet r9 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r8 = r3.A06
            X.RUD.A00(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = r5.A04
            if (r1 == 0) goto L_0x14f7
            X.Sl8 r0 = new X.Sl8
            r0.<init>(r3)
            X.QA3 r1 = X.QA3.A00(r4, r0, r1, r2)
            r3.A00 = r1
            r0 = 2130970084(0x7f0405e4, float:1.7548868E38)
            int r0 = X.2Yu.A0H(r4, r0)
            r1.A01(r0)
            X.QA3 r1 = r3.A00
            if (r1 == 0) goto L_0x14d5
            android.widget.ImageView r0 = r3.A03
            r1.setAnchorView(r0)
        L_0x14d5:
            X.QA3 r0 = r3.A00
            if (r0 == 0) goto L_0x14dc
            r0.show()
        L_0x14dc:
            X.QA3 r0 = r3.A00
            r4 = 0
            if (r0 == 0) goto L_0x14f7
            android.widget.ListView r1 = r0.getListView()
            if (r1 == 0) goto L_0x14f7
        L_0x14e7:
            r0 = 2
            r1.setOverScrollMode(r0)
            r1.setVerticalScrollBarEnabled(r2)
            r1.setDivider(r4)
            return
        L_0x14f2:
            r0 = 8
            r3.setVisibility(r0)
        L_0x14f7:
            return
        L_0x14f8:
            r0 = -518086320(0xffffffffe11ea150, float:-1.8288808E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            com.facebook.browser.lite.BrowserLiteFragment r3 = (com.facebook.browser.lite.BrowserLiteFragment) r3
            X.A9z r1 = r3.A0d
            java.lang.String r11 = "error_screen_tap"
            boolean r0 = r1.A0p
            if (r0 != 0) goto L_0x152d
            com.facebook.iabeventlogging.model.IABEmptyEvent r5 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x150d:
            android.os.Bundle r1 = r3.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r3.A0e
            r3.CjX(r1, r5, r0)
            com.facebook.browser.lite.views.BrowserLiteErrorScreen r0 = r3.A0a
            if (r0 == 0) goto L_0x151b
            r0.A00()
        L_0x151b:
            java.lang.Object r0 = r2.A02
            X.QLA r0 = (X.QLA) r0
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.reload()
            r0 = -178579618(0xfffffffff55b175e, float:-2.7773119E32)
        L_0x1529:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x152d:
            X.0JP r0 = r1.A0m
            long r6 = r0.now()
            java.lang.String r8 = r1.A0Z
            com.facebook.iabeventlogging.model.IABRefreshEvent r5 = new com.facebook.iabeventlogging.model.IABRefreshEvent
            r9 = r6
            r5.<init>(r6, r8, r9, r11)
            goto L_0x150d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11499SbM.onClick(android.view.View):void");
    }

    public C11499SbM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
