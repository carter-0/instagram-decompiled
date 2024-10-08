package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;

public final class S3F {
    public ECPHandler A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final 0hq A03;
    public final AnonymousClass07Z A04;
    public final AnonymousClass2gO A05;
    public final C10692RwW A06;
    public final ECPHandler A07;

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S3F(androidx.fragment.app.Fragment r3, androidx.fragment.app.FragmentActivity r4, com.facebookpay.expresscheckout.handler.ECPHandler r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A01 = r3
            r2.A02 = r4
            r2.A07 = r5
            java.lang.String r1 = "Input fragment or fragmentActivity cannot be null"
            if (r3 == 0) goto L_0x0013
            X.0hq r0 = r3.getChildFragmentManager()
            if (r0 != 0) goto L_0x001e
        L_0x0013:
            X.0hq r0 = r4.getSupportFragmentManager()
            if (r0 != 0) goto L_0x001e
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        L_0x001e:
            r2.A03 = r0
            r0 = r4
            if (r3 == 0) goto L_0x0024
            r0 = r3
        L_0x0024:
            X.07Z r0 = (X.AnonymousClass07Z) r0
            r2.A04 = r0
            if (r5 != 0) goto L_0x002f
            X.StU r5 = new X.StU
            r5.<init>(r0)
        L_0x002f:
            r2.A00 = r5
            X.AnonymousClass2E0.A01()
            X.RwW r0 = new X.RwW
            r0.<init>(r3, r4)
            r2.A06 = r0
            r0 = 21
            X.Sdr r0 = X.C11649Sdr.A00(r2, r0)
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3F.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, com.facebookpay.expresscheckout.handler.ECPHandler):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d1, code lost:
        if (r7.A07(r4, r6, r1) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2Fj A00(android.os.Bundle r28, com.facebookpay.expresscheckout.models.CheckoutConfiguration r29, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r30, com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r31, com.facebookpay.expresscheckout.models.EcpUIConfiguration r32, com.facebookpay.expresscheckout.models.PaymentReceiverInfo r33, com.facebookpay.expresscheckout.models.TransactionInfo r34, com.facebookpay.logging.LoggingPolicy r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41, boolean r42, boolean r43) {
        /*
            r27 = this;
            r15 = r29
            r17 = r31
            r13 = 0
            r2 = 0
            r5 = r36
            X.0qQ.A0B(r5, r2)
            r0 = r38
            r4 = r37
            r10 = r32
            X.AnonymousClass7TG.A1U(r4, r10, r0)
            r1 = 16
            r7 = r40
            X.0qQ.A0B(r7, r1)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r1 = X.C11353SOm.A01()
            r9 = r33
            if (r33 == 0) goto L_0x0037
            java.lang.String r3 = r9.A02
        L_0x0025:
            X.OV4 r1 = r1.A06
            X.RyJ r6 = r1.A00(r4, r3)
            com.facebookpay.expresscheckout.models.CheckoutResponse r1 = X.C11432SUd.A08(r6)
            if (r1 == 0) goto L_0x0039
            X.2Fj r0 = new X.2Fj
            r0.<init>(r1)
            return r0
        L_0x0037:
            r3 = r13
            goto L_0x0025
        L_0x0039:
            r8 = r34
            r3 = r27
            if (r34 == 0) goto L_0x0048
            com.facebookpay.expresscheckout.handler.ECPHandler r11 = r3.A00
            X.SUj r1 = X.SUj.A09(r8)
            r11.Ep6(r1)
        L_0x0048:
            X.0hq r11 = r3.A03
            X.QCg r1 = new X.QCg
            r1.<init>(r3, r2)
            r11.A0r(r1, r2)
            if (r29 != 0) goto L_0x005e
            if (r6 == 0) goto L_0x012e
            X.QXO r1 = r6.A00
            r11 = r43
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r15 = X.C11432SUd.A07(r1, r11)
        L_0x005e:
            r1 = r39
            if (r31 != 0) goto L_0x006a
            if (r6 == 0) goto L_0x012a
            X.QTG r6 = r6.A03
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r17 = X.C11432SUd.A0A(r6, r8, r1)
        L_0x006a:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r14 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r6 = r14
            r16 = r30
            r20 = r35
            r26 = r2
            r18 = r10
            r19 = r9
            r21 = r5
            r22 = r4
            r23 = r0
            r24 = r1
            r25 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r12 = X.C11353SOm.A01()
            X.2Fj r0 = r12.A00
            X.SUj.A0K(r0, r14)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r14.A05
            if (r0 == 0) goto L_0x00a3
            java.lang.String r11 = r0.A02
            if (r11 == 0) goto L_0x00a3
            java.lang.String r10 = r14.A08
            X.OV4 r0 = r12.A06
            X.RyJ r0 = r0.A00(r10, r11)
            if (r0 == 0) goto L_0x00a3
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = X.SQ0.A01(r0, r14, r8)
        L_0x00a3:
            X.07Z r12 = r3.A04
            X.0xx r11 = X.AnonymousClass07a.A00(r12)
            X.SDh r0 = X.AnonymousClass2E0.A0B()
            X.2F6 r0 = r0.A00
            X.12V r0 = r0.A00
            X.12U r0 = (X.AnonymousClass12U) r0
            X.4CZ r10 = r0.A04
            com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2 r0 = new com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2
            r24 = r41
            r15 = r0
            r16 = r3
            r17 = r14
            r18 = r9
            r19 = r8
            r20 = r13
            r23 = r1
            r25 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.1Eo.A05(r10, r0, r11)
            if (r42 == 0) goto L_0x0149
            X.RwW r6 = r3.A06
            r7 = r28
            if (r28 == 0) goto L_0x0144
            java.lang.String r0 = X.Py7.A00()
            java.lang.String r16 = r7.getString(r0)
            java.lang.String r8 = "Required value was null."
            if (r16 == 0) goto L_0x013f
            java.lang.String r0 = "product_id"
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x013a
            long r19 = java.lang.Long.parseLong(r0)
            X.0sl r17 = X.0sl.A00
            com.facebookpay.logging.LoggingContext r1 = new com.facebookpay.logging.LoggingContext
            r14 = r1
            r15 = r13
            r18 = r17
            r21 = r2
            r14.<init>(r15, r16, r17, r18, r19, r21)
            java.lang.String r0 = "logging_context"
            r7.putParcelable(r0, r1)
            r1 = 2132017647(0x7f1401ef, float:1.9673578E38)
            java.lang.String r0 = "STYLE_RES"
            r7.putInt(r0, r1)
            X.QhS r5 = new X.QhS
            r5.<init>()
            r5.setArguments(r7)
            r6.A00 = r5
            java.lang.String r4 = "ecpDialogFragment"
            X.0hq r2 = r6.A01
            java.lang.String r1 = "loading_fragment"
            java.lang.String r0 = "BOTTOM_SHEET_CONTAINER_FRAGMENT_TAG"
            r5.A0I(r7, r2, r1, r0)
            X.QhS r0 = r6.A00
            if (r0 != 0) goto L_0x0131
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012a:
            r17 = r13
            goto L_0x006a
        L_0x012e:
            r15 = r13
            goto L_0x005e
        L_0x0131:
            X.2gB r1 = r0.A04
            if (r1 != 0) goto L_0x021e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0149:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r11 = r6.A01
            if (r11 == 0) goto L_0x0158
            java.lang.Boolean r0 = r11.A0B
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0158
            X.AnonymousClass2E0.A0D()
        L_0x0158:
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S1J r1 = r0.A05
            java.lang.String r10 = r6.A0A
            java.lang.String r0 = "OPEN_CHECKOUT_BOTTOM_SHEET"
            r1.A00(r10, r0)
            X.RwW r9 = r3.A06
            r8 = 1
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r4 = r6.A08
            long r20 = java.lang.Long.parseLong(r4)
            com.facebookpay.logging.LoggingPolicy r1 = r6.A06
            if (r1 == 0) goto L_0x021a
            java.util.LinkedHashSet r18 = X.SQ1.A01(r1)
        L_0x017a:
            if (r1 == 0) goto L_0x0216
            java.util.LinkedHashSet r19 = X.SQ1.A02(r1)
        L_0x0180:
            boolean r14 = r6.A0B
            com.facebookpay.logging.LoggingContext r0 = new com.facebookpay.logging.LoggingContext
            r15 = r0
            r16 = r1
            r17 = r10
            r22 = r14
            r15.<init>(r16, r17, r18, r19, r20, r22)
            r10 = 2132017647(0x7f1401ef, float:1.9673578E38)
            java.lang.String r1 = "STYLE_RES"
            r5.putInt(r1, r10)
            java.lang.String r1 = "ECP_LAUNCH_PARAMS"
            r5.putParcelable(r1, r6)
            java.lang.String r1 = "logging_context"
            r5.putParcelable(r1, r0)
            if (r11 == 0) goto L_0x01a9
            boolean r6 = r11.A0K
            java.lang.String r1 = "checkoutInFullScreen"
            r5.putBoolean(r1, r6)
        L_0x01a9:
            X.QhS r1 = new X.QhS
            r1.<init>()
            r1.setArguments(r5)
            r9.A00 = r1
            java.lang.String r1 = "FORCE_NUX"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x01d3
            java.lang.String r1 = "DEFAULT_VALUE"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0212
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r7 = X.C11353SOm.A01()
            if (r11 == 0) goto L_0x020e
            java.util.Set<X.REn> r6 = r11.A0H
            java.util.Set<X.REi> r1 = r11.A0I
        L_0x01cd:
            boolean r1 = r7.A07(r4, r6, r1)
            if (r1 == 0) goto L_0x0212
        L_0x01d3:
            r4 = 1
            java.lang.String r1 = "IS_ECP_NUX_FORM_SCREEN"
            r5.putBoolean(r1, r8)
            java.lang.String r7 = "content_nux_fragment"
        L_0x01db:
            X.Sto r6 = X.C51965G9l.A0g()
            if (r4 == 0) goto L_0x020a
            java.lang.String r4 = "nux_checkout"
        L_0x01e4:
            X.SEB r1 = new X.SEB
            r1.<init>(r2, r13)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            r6.A0Z(r0, r4, r1)
            X.QhS r4 = r9.A00
            java.lang.String r2 = "ecpDialogFragment"
            if (r4 == 0) goto L_0x022a
            X.0hq r1 = r9.A01
            java.lang.String r0 = "BOTTOM_SHEET_CONTAINER_FRAGMENT_TAG"
            r4.A0I(r5, r1, r7, r0)
            X.QhS r0 = r9.A00
            if (r0 == 0) goto L_0x022a
            X.2gB r1 = r0.A04
            if (r1 != 0) goto L_0x021e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x020a:
            java.lang.String r4 = "pux_checkout"
            goto L_0x01e4
        L_0x020e:
            X.0sl r6 = X.0sl.A00
            r1 = r6
            goto L_0x01cd
        L_0x0212:
            r4 = 0
            java.lang.String r7 = "content_bottom_sheet_fragment"
            goto L_0x01db
        L_0x0216:
            X.0sl r19 = X.0sl.A00
            goto L_0x0180
        L_0x021a:
            X.0sl r18 = X.0sl.A00
            goto L_0x017a
        L_0x021e:
            X.2gO r0 = r3.A05
            r1.A06(r12, r0)
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r3.A00
            X.2Fj r0 = r0.AH8()
            return r0
        L_0x022a:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3F.A00(android.os.Bundle, com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration, com.facebookpay.expresscheckout.models.ECPPaymentConfiguration, com.facebookpay.expresscheckout.models.EcpUIConfiguration, com.facebookpay.expresscheckout.models.PaymentReceiverInfo, com.facebookpay.expresscheckout.models.TransactionInfo, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):X.2Fj");
    }
}
