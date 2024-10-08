package X;

/* renamed from: X.Sv0  reason: case insensitive filesystem */
public final class C12468Sv0 implements C13612Tde {
    public final int A00;
    public final Object A01;

    public C12468Sv0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r0 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r1.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r0 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r0 = "viewContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r1.A01(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        X.SR4.A01(r2.A03, new X.C12421Stz(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        X.0b6.A00().A04().A0G(((androidx.fragment.app.Fragment) ((X.C11652Sdu) r5.A01).A01).requireActivity(), r1.setData(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f8, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DNd(X.SF9 r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 2: goto L_0x00a8;
                case 3: goto L_0x009f;
                case 4: goto L_0x008b;
                case 5: goto L_0x00ee;
                case 6: goto L_0x0062;
                case 7: goto L_0x004e;
                case 8: goto L_0x0077;
                case 9: goto L_0x003d;
                case 10: goto L_0x002d;
                case 11: goto L_0x001d;
                case 12: goto L_0x00c4;
                case 13: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r6.A03
            r1.invoke(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x000e
            android.content.Intent r1 = X.Pxe.A0E()
            android.net.Uri r0 = X.0cp.A03(r0)
            goto L_0x00d2
        L_0x001d:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            X.RRM r0 = X.AnonymousClass2E0.A07()
            r0.A01(r1, r2)
            return
        L_0x002d:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            X.RRM r0 = X.AnonymousClass2E0.A07()
            r0.A00(r1, r2)
            return
        L_0x003d:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A01
            X.QCE r0 = (X.QCE) r0
            X.RRM r1 = X.AnonymousClass2E0.A07()
            android.view.ContextThemeWrapper r0 = r0.A00
            if (r0 != 0) goto L_0x005e
            goto L_0x0072
        L_0x004e:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.RRM r1 = X.AnonymousClass2E0.A07()
            android.content.Context r0 = r0.requireContext()
        L_0x005e:
            r1.A00(r0, r2)
            return
        L_0x0062:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A01
            X.QhQ r0 = (X.C8132QhQ) r0
            X.RRM r1 = X.AnonymousClass2E0.A07()
            android.view.ContextThemeWrapper r0 = r0.A01
            if (r0 != 0) goto L_0x0087
        L_0x0072:
            java.lang.String r0 = "viewContext"
            goto L_0x00f8
        L_0x0077:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.RRM r1 = X.AnonymousClass2E0.A07()
            android.content.Context r0 = r0.requireContext()
        L_0x0087:
            r1.A01(r0, r2)
            return
        L_0x008b:
            java.lang.Object r0 = r5.A01
            X.RRI r0 = (X.RRI) r0
            X.Q6J r2 = r0.A00
            if (r2 == 0) goto L_0x000e
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x000e
            X.RRM r0 = X.AnonymousClass2E0.A07()
            r0.A01(r2, r1)
            return
        L_0x009f:
            java.lang.String r3 = r6.A03
            if (r3 == 0) goto L_0x000e
            java.lang.Object r2 = r5.A01
            X.QDP r2 = (X.QDP) r2
            goto L_0x00b9
        L_0x00a8:
            java.lang.Object r2 = r5.A01
            X.Qh6 r2 = (X.C8114Qh6) r2
            java.lang.String r3 = r6.A03
            if (r3 == 0) goto L_0x000e
            java.lang.String r1 = "user_click_payouthub_atomic"
            java.lang.String r0 = "payouthub_link_click"
            X.C8114Qh6.A02(r2, r1, r0, r3)
        L_0x00b9:
            X.2gB r1 = r2.A03
            X.Stz r0 = new X.Stz
            r0.<init>(r3)
            X.SR4.A01(r1, r0)
            return
        L_0x00c4:
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "https://www.facebook.com/help/pay?ref=learn_more"
        L_0x00ca:
            android.content.Intent r1 = X.Pxe.A0E()
            android.net.Uri r0 = X.0cp.A03(r0)
        L_0x00d2:
            android.content.Intent r2 = r1.setData(r0)
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r1 = r0.A04()
            java.lang.Object r0 = r5.A01
            X.Sdu r0 = (X.C11652Sdu) r0
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r1.A0G(r0, r2)
            return
        L_0x00ee:
            java.lang.Object r1 = r5.A01
            X.QhQ r1 = (X.C8132QhQ) r1
            X.QDN r0 = r1.A0B
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "ecpViewModel"
        L_0x00f8:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0100:
            X.QD3 r2 = r0.A1V
            X.0hq r4 = r1.getChildFragmentManager()
            X.0qQ.A07(r4)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r2.A00
            if (r1 != 0) goto L_0x0114
            java.lang.String r0 = "ecpPaymentRequest"
            goto L_0x00f8
        L_0x0114:
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            r3.putParcelable(r0, r1)
            com.facebookpay.logging.LoggingContext r1 = r2.A01
            if (r1 != 0) goto L_0x0120
            java.lang.String r0 = "loggingContext"
            goto L_0x00f8
        L_0x0120:
            java.lang.String r0 = "logging_context"
            r3.putParcelable(r0, r1)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            java.lang.String r0 = "blank_bottom_sheet_fragment"
            androidx.fragment.app.Fragment r2 = r1.A03(r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.0qQ.A0C(r2, r0)
            X.Qxp r2 = (X.C8608Qxp) r2
            java.lang.String r1 = "terms_condition_fragment"
            java.lang.String r0 = "TERMS_CONTENT_FRAGMENT_TAG"
            r2.A0I(r3, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12468Sv0.DNd(X.SF9):void");
    }
}
