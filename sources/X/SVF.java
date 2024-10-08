package X;

import android.content.DialogInterface;

public final class SVF implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public SVF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        X.0qQ.A0C(r1, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        ((X.0SM) r1).onDismiss(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0094;
                case 3: goto L_0x0035;
                case 4: goto L_0x007b;
                case 5: goto L_0x004c;
                case 6: goto L_0x000b;
                case 7: goto L_0x0041;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r7.A01
            X.Q5H r0 = (X.Q5H) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "instagram_android_13_notifications_priming_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = "no_in_test"
            java.lang.String r0 = "experiment_group"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "mock_system_dialog_dismissed"
            java.lang.String r0 = "event_name"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x0035:
            java.lang.Object r0 = r7.A01
            X.QhN r0 = (X.C8129QhN) r0
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r0.A05
            if (r0 == 0) goto L_0x000a
            r0.CIW()
            return
        L_0x0041:
            java.lang.Object r0 = r7.A01
            X.R8N r0 = (X.R8N) r0
            X.R8N.A04(r0)
            X.R8N.A05(r0)
            return
        L_0x004c:
            X.Sto r6 = X.C51965G9l.A0g()
            java.lang.Object r5 = r7.A01
            X.QCE r5 = (X.QCE) r5
            com.facebookpay.logging.LoggingContext r4 = r5.A05
            r3 = 0
            if (r4 != 0) goto L_0x005c
            java.lang.String r0 = "loggingContext"
            goto L_0x009f
        L_0x005c:
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r0 = r5.A06
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "launchParams"
            goto L_0x009f
        L_0x0063:
            java.lang.String r0 = r0.A05
            long r1 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "cancel"
            r6.A0O(r4, r0, r1)
            X.2gB r1 = r5.A09
            X.TQV r0 = new X.TQV
            r0.<init>()
            X.SUj.A0M(r1, r3, r0)
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            goto L_0x0088
        L_0x007b:
            java.lang.Object r1 = r7.A01
            X.QhN r1 = (X.C8129QhN) r1
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r1.A05
            if (r0 == 0) goto L_0x0086
            r0.CIW()
        L_0x0086:
            androidx.fragment.app.Fragment r1 = r1.mParentFragment
        L_0x0088:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.0qQ.A0C(r1, r0)
            X.0SM r1 = (X.0SM) r1
            r1.onDismiss(r8)
            return
        L_0x0094:
            java.lang.Object r0 = r7.A01
            X.QgH r0 = (X.C8065QgH) r0
            X.5tS r1 = r0.A00
            if (r1 != 0) goto L_0x00a7
            java.lang.String r0 = "viewModel"
        L_0x009f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a7:
            r0 = 0
            r1.A0L(r0)
            return
        L_0x00ac:
            java.lang.Object r0 = r7.A01
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = X.Pxj.A0V(r0)
            com.facebook.smartcapture.logging.CancelReason r0 = com.facebook.smartcapture.logging.CancelReason.ENCRYPTION_FAILURE
            r1.logFlowCancel(r0)
            return
        L_0x00b8:
            java.lang.Object r0 = r7.A01
            com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5 r0 = (com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5) r0
            X.QKv r1 = r0.A01
            X.7kb r0 = r1.A04
            r0.getClass()
            X.QLA r0 = r0.C8U()
            r1.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVF.onDismiss(android.content.DialogInterface):void");
    }
}
