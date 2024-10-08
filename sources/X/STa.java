package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class STa {
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0138, code lost:
        if (r0 != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0144, code lost:
        if (r8 != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r0 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r0 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r0 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r9.contains(X.C8891REi.REQUEST_PAYER_EMAIL) != true) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r0 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r0 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009f, code lost:
        if (r9.contains(X.C8891REi.REQUEST_PAYER_PHONE) != true) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        if (r0 == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b3, code lost:
        if (r0 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c5, code lost:
        if (((X.Stc) r3.A08.getValue()).A0C(r6, (X.RFC) null) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0109, code lost:
        if (r3 != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0111, code lost:
        if (r0 != null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1.A0J == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(com.facebookpay.expresscheckout.models.ECPPaymentRequest r16, X.QDN r17, boolean r18) {
        /*
            r5 = 1
            r4 = r16
            X.0qQ.A0B(r4, r5)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.C11353SOm.A01()
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r4.A01
            r7 = 0
            if (r1 == 0) goto L_0x016c
            java.util.Set<X.REn> r2 = r1.A0H
            java.util.Set<X.REi> r9 = r1.A0I
        L_0x0013:
            r0 = r17
            X.SUj r0 = r0.A0N
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x001f
            com.facebookpay.paymentmethod.model.PaymentMethod r7 = r0.A01
        L_0x001f:
            if (r18 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.A0J
            r18 = 1
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r18 = 0
        L_0x002b:
            java.lang.String r0 = r4.A08
            r1 = 0
            r4 = 0
            X.SJ1 r6 = new X.SJ1
            r6.<init>(r4, r0)
            if (r2 == 0) goto L_0x0169
            X.REn r0 = X.REn.UX_SHIPPING_ADDRESS
            boolean r2 = r2.contains(r0)
        L_0x003c:
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.Stb r0 = (X.Stb) r0
            boolean r0 = r0.A06(r6)
            r17 = 1
            if (r2 == 0) goto L_0x0050
            r16 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            r16 = 0
            if (r2 == 0) goto L_0x0057
            r15 = 0
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r15 = 1
        L_0x0058:
            if (r9 == 0) goto L_0x0166
            X.REi r0 = X.C8891REi.REQUEST_PAYER_NAME
            boolean r2 = r9.contains(r0)
        L_0x0060:
            X.0eM r8 = r3.A07
            X.Std r0 = X.Pxh.A0S(r8)
            boolean r0 = r0.A0E(r6)
            if (r2 == 0) goto L_0x006f
            r14 = 1
            if (r0 != 0) goto L_0x0075
        L_0x006f:
            r14 = 0
            if (r2 == 0) goto L_0x0075
            r13 = 0
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            r13 = 1
        L_0x0076:
            if (r9 == 0) goto L_0x0081
            X.REi r0 = X.C8891REi.REQUEST_PAYER_EMAIL
            boolean r0 = r9.contains(r0)
            r2 = 1
            if (r0 == r5) goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            X.Std r0 = X.Pxh.A0S(r8)
            boolean r0 = r0.A0D(r6)
            if (r2 == 0) goto L_0x008f
            r12 = 1
            if (r0 != 0) goto L_0x0095
        L_0x008f:
            r12 = 0
            if (r2 == 0) goto L_0x0095
            r11 = 0
            if (r0 == 0) goto L_0x0096
        L_0x0095:
            r11 = 1
        L_0x0096:
            if (r9 == 0) goto L_0x00a1
            X.REi r0 = X.C8891REi.REQUEST_PAYER_PHONE
            boolean r0 = r9.contains(r0)
            r2 = 1
            if (r0 == r5) goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            X.Std r0 = X.Pxh.A0S(r8)
            boolean r0 = r0.A0F(r6)
            if (r2 == 0) goto L_0x00af
            r10 = 1
            if (r0 != 0) goto L_0x00b5
        L_0x00af:
            r10 = 0
            if (r2 == 0) goto L_0x00b5
            r9 = 0
            if (r0 == 0) goto L_0x00b6
        L_0x00b5:
            r9 = 1
        L_0x00b6:
            if (r7 != 0) goto L_0x00c7
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.Stc r0 = (X.Stc) r0
            boolean r0 = r0.A0C(r6, r4)
            r8 = 0
            if (r0 == 0) goto L_0x00c8
        L_0x00c7:
            r8 = 1
        L_0x00c8:
            X.0eM r5 = r3.A08
            java.lang.Object r0 = r5.getValue()
            X.Stc r0 = (X.Stc) r0
            X.2gB r0 = r0.A05(r6)
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r0.A01
            X.SJH r0 = (X.SJH) r0
            if (r0 == 0) goto L_0x0163
            X.QSO r4 = r0.A00
        L_0x00e2:
            boolean r3 = r7 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r3 == 0) goto L_0x00ef
            r0 = r7
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x00ef
            X.TlY r2 = r0.A00
            if (r2 != 0) goto L_0x010b
        L_0x00ef:
            java.lang.Object r0 = r5.getValue()
            X.Stc r0 = (X.Stc) r0
            X.SUj r0 = r0.A07(r6)
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
        L_0x00ff:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0161
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x0161
            X.TlY r2 = r1.A00
        L_0x0109:
            if (r3 == 0) goto L_0x0113
        L_0x010b:
            com.facebookpay.paymentmethod.model.CreditCard r7 = (com.facebookpay.paymentmethod.model.CreditCard) r7
            if (r7 == 0) goto L_0x0113
            java.lang.String r0 = r7.A03
            if (r0 != 0) goto L_0x012d
        L_0x0113:
            java.lang.Object r0 = r5.getValue()
            X.Stc r0 = (X.Stc) r0
            X.SUj r0 = r0.A07(r6)
            if (r0 == 0) goto L_0x015f
            java.lang.Object r1 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
        L_0x0123:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x015d
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x015d
            java.lang.String r0 = r1.A03
        L_0x012d:
            if (r4 == 0) goto L_0x015b
            if (r2 == 0) goto L_0x015b
            boolean r0 = X.C9652ReW.A00(r4, r2, r0)
        L_0x0135:
            if (r18 == 0) goto L_0x013a
            r1 = 0
            if (r0 == 0) goto L_0x013b
        L_0x013a:
            r1 = 1
        L_0x013b:
            if (r16 != 0) goto L_0x0146
            if (r14 != 0) goto L_0x0146
            if (r12 != 0) goto L_0x0146
            if (r10 != 0) goto L_0x0146
            r0 = 0
            if (r8 == 0) goto L_0x0147
        L_0x0146:
            r0 = 1
        L_0x0147:
            if (r15 == 0) goto L_0x0158
            if (r13 == 0) goto L_0x0158
            if (r11 == 0) goto L_0x0158
            if (r9 == 0) goto L_0x0158
            if (r8 == 0) goto L_0x0158
            if (r1 == 0) goto L_0x0158
        L_0x0153:
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "NUX"
            return r0
        L_0x0158:
            r17 = 0
            goto L_0x0153
        L_0x015b:
            r0 = 0
            goto L_0x0135
        L_0x015d:
            r0 = 0
            goto L_0x012d
        L_0x015f:
            r1 = 0
            goto L_0x0123
        L_0x0161:
            r2 = 0
            goto L_0x0109
        L_0x0163:
            r4 = r1
            goto L_0x00e2
        L_0x0166:
            r2 = 0
            goto L_0x0060
        L_0x0169:
            r2 = 0
            goto L_0x003c
        L_0x016c:
            r2 = r7
            r9 = r7
            goto L_0x0013
        L_0x0170:
            if (r17 == 0) goto L_0x0175
            java.lang.String r0 = "FULL_PUX"
            return r0
        L_0x0175:
            if (r8 == 0) goto L_0x017a
            java.lang.String r0 = "PARTIAL_PUX_WITH_CREDENTIAL"
            return r0
        L_0x017a:
            java.lang.String r0 = "PARTIAL_PUX_WITHOUT_CREDENTIAL"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STa.A00(com.facebookpay.expresscheckout.models.ECPPaymentRequest, X.QDN, boolean):java.lang.String");
    }

    public static final void A02(ECPPaymentResponseParams eCPPaymentResponseParams, QDN qdn, SUj sUj, String str) {
        PaymentMethod paymentMethod;
        ECPPaymentResponseParams eCPPaymentResponseParams2 = eCPPaymentResponseParams;
        0qQ.A0B(eCPPaymentResponseParams, 3);
        QDN qdn2 = qdn;
        PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) qdn.A0N.A01;
        if (puxPaymentMethodItem == null || (paymentMethod = puxPaymentMethodItem.A01) == null) {
            throw AnonymousClass7TE.A0y();
        }
        String str2 = str;
        SUU.A0B(sUj, new C58210IoE(eCPPaymentResponseParams, qdn, paymentMethod, str2, 2), new C73963Pmh(eCPPaymentResponseParams2, qdn2, sUj, paymentMethod, str2, 7));
    }

    public static final void A05(QDN qdn, Throwable th, boolean z) {
        Map map = qdn.A1Y;
        C298525tb r0 = C298525tb.ONE_TIME_CHECKOUT_OPTION;
        if (z) {
            C11360SOw A0T = Pxh.A0T(r0, map);
            if (A0T != null) {
                A0T.A03(TY1.A00(qdn, 12));
                return;
            }
            return;
        }
        C11360SOw A0T2 = Pxh.A0T(r0, map);
        if (A0T2 != null) {
            A0T2.A01(new C13349TVw(29, th, qdn));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.0qQ.A0K(r0, true) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.QDN r3, java.lang.Throwable r4, boolean r5) {
        /*
            java.lang.Boolean r0 = r3.A0U
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r0 != 0) goto L_0x003f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A0U = r0
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x002a
        L_0x0015:
            java.util.Map r1 = r3.A1Y
            X.5tb r0 = X.C298525tb.ORDER_SUMMARY
            if (r5 == 0) goto L_0x002e
            X.SOw r1 = X.Pxh.A0T(r0, r1)
            if (r1 == 0) goto L_0x002a
            r0 = 14
            X.TY1 r0 = X.TY1.A00(r3, r0)
            r1.A03(r0)
        L_0x002a:
            r3.A0m()
            return
        L_0x002e:
            X.SOw r2 = X.Pxh.A0T(r0, r1)
            if (r2 == 0) goto L_0x002a
            r1 = 31
            X.TVw r0 = new X.TVw
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            goto L_0x002a
        L_0x003f:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            if (r5 != 0) goto L_0x0048
            r2 = 0
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0U = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STa.A06(X.QDN, java.lang.Throwable, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.RH6 r7, X.RH6 r8, X.QDN r9, java.lang.Boolean r10) {
        /*
            int r0 = r7.ordinal()
            r2 = 0
            switch(r0) {
                case 2: goto L_0x0029;
                case 3: goto L_0x0144;
                case 4: goto L_0x00ea;
                case 5: goto L_0x015f;
                case 6: goto L_0x0008;
                case 7: goto L_0x0008;
                case 8: goto L_0x0008;
                case 9: goto L_0x0008;
                case 10: goto L_0x0008;
                case 11: goto L_0x0008;
                case 12: goto L_0x0029;
                case 13: goto L_0x0144;
                case 14: goto L_0x00ea;
                case 15: goto L_0x015f;
                case 16: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            if (r10 == 0) goto L_0x0024
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = "expand_ordersummary"
        L_0x0013:
            X.Sto r2 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r1 = r9.A1P
            java.util.LinkedHashMap r0 = X.C66584MXp.A0f(r9)
            r2.A0V(r1, r3, r0)
            return
        L_0x0021:
            java.lang.String r3 = "collapse_ordersummary"
            goto L_0x0013
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0029:
            if (r10 == 0) goto L_0x00bb
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r7 = "expand_credential"
        L_0x0033:
            r0 = r2
        L_0x0034:
            X.Sto r5 = X.C11353SOm.A00()
            com.facebookpay.logging.LoggingContext r4 = r9.A1P
            X.QDT r1 = r9.A1R
            X.2gB r8 = r1.A08
            X.SUj r1 = X.Pxe.A0W(r8)
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = r1.Asm()
            if (r1 == 0) goto L_0x00b5
            java.lang.Long r3 = X.DbV.A0q(r1)
        L_0x005a:
            X.QDH r1 = r9.A1Q
            X.SEB r6 = r1.A03()
            X.SUj r1 = X.Pxe.A0W(r8)
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            if (r1 == 0) goto L_0x0076
            X.XRm r2 = r1.Asn()
        L_0x0076:
            java.util.LinkedHashMap r4 = X.Pxi.A0n(r4)
            java.lang.String r1 = "TARGET_NAME"
            X.Pxj.A1K(r3, r1, r7, r4)
            X.Pxi.A1I(r2, r4)
            java.lang.String r3 = "extra_data"
            java.lang.Object r2 = r4.get(r3)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x0098
            boolean r1 = r2 instanceof X.C62650uo
            if (r1 == 0) goto L_0x0094
            boolean r1 = r2 instanceof X.AnonymousClass0s2
            if (r1 == 0) goto L_0x0098
        L_0x0094:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x009c
        L_0x0098:
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
        L_0x009c:
            X.SUU.A0A(r6, r2)
            r4.put(r3, r2)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = "selected_credential_state"
            X.SUU.A0C(r0, r1, r4)
        L_0x00aa:
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r4)
            X.0qQ.A07(r1)
            java.lang.String r0 = "user_click_credential_atomic"
            goto L_0x0133
        L_0x00b5:
            r3 = r2
            goto L_0x005a
        L_0x00b7:
            java.lang.String r7 = "collapse_credential"
            goto L_0x0033
        L_0x00bb:
            if (r8 == 0) goto L_0x00c3
            java.lang.String r7 = X.SUU.A02(r8)
            goto L_0x0033
        L_0x00c3:
            X.SUj r0 = r9.A0N
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x00e5
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = r0.A01
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x00e1
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            X.QRJ r0 = r1.A01
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "need_verification"
            java.lang.String r7 = "update_payment_info"
            goto L_0x0034
        L_0x00e1:
            java.lang.String r7 = "edit_selected_credential"
            goto L_0x0033
        L_0x00e5:
            java.lang.String r7 = "select_payment_info"
            goto L_0x0033
        L_0x00ea:
            if (r10 == 0) goto L_0x013a
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0137
            java.lang.String r2 = "expand_contact"
        L_0x00f4:
            X.Sto r5 = X.C11353SOm.A00()
            com.facebookpay.logging.LoggingContext r1 = r9.A1P
            X.QDH r0 = r9.A1Q
            X.SEB r4 = r0.A03()
            java.util.LinkedHashMap r3 = X.Pxi.A0n(r1)
            java.lang.String r0 = "TARGET_NAME"
            r3.put(r0, r2)
            java.lang.String r2 = "extra_data"
            java.lang.Object r1 = r3.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x011f
            boolean r0 = r1 instanceof X.C62650uo
            if (r0 == 0) goto L_0x011b
            boolean r0 = r1 instanceof X.AnonymousClass0s2
            if (r0 == 0) goto L_0x011f
        L_0x011b:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0123
        L_0x011f:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
        L_0x0123:
            X.SUU.A0A(r4, r1)
            r3.put(r2, r1)
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r3)
            X.0qQ.A07(r1)
            java.lang.String r0 = "user_click_contact_atomic"
        L_0x0133:
            r5.Cgl(r0, r1)
            return
        L_0x0137:
            java.lang.String r2 = "collapse_contact"
            goto L_0x00f4
        L_0x013a:
            if (r8 == 0) goto L_0x0141
            java.lang.String r2 = X.SUU.A02(r8)
            goto L_0x00f4
        L_0x0141:
            java.lang.String r2 = "edit_selected_contact"
            goto L_0x00f4
        L_0x0144:
            if (r10 == 0) goto L_0x0155
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = "expand_shippingaddress"
        L_0x014e:
            A03(r9, r0)
            return
        L_0x0152:
            java.lang.String r0 = "collapse_shippingaddress"
            goto L_0x014e
        L_0x0155:
            if (r8 == 0) goto L_0x015c
            java.lang.String r0 = X.SUU.A02(r8)
            goto L_0x014e
        L_0x015c:
            java.lang.String r0 = "edit_selected_shipping_address"
            goto L_0x014e
        L_0x015f:
            X.QDR r2 = r9.A1N
            java.lang.Integer r0 = r2.A01
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x01b9
            if (r10 == 0) goto L_0x01af
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r6 = "expand_fulfillmentoption"
        L_0x0171:
            X.Sto r1 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r3 = r9.A1P
            X.2gB r0 = r2.A03
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L_0x018f
            java.lang.String r5 = r0.A02()
        L_0x018f:
            java.util.LinkedHashMap r4 = X.C66584MXp.A0f(r9)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_click_fulfillmentoption_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 402(0x192, float:5.63E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r7 = 3
        L_0x01a3:
            X.PqY r2 = new X.PqY
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
            X.C12411Sto.A03(r0, r3, r2)
            return
        L_0x01ac:
            java.lang.String r6 = "collapse_fulfillmentoption"
            goto L_0x0171
        L_0x01af:
            if (r8 == 0) goto L_0x01b6
            java.lang.String r6 = X.SUU.A02(r8)
            goto L_0x0171
        L_0x01b6:
            java.lang.String r6 = "edit_selected_fulfillment_option"
            goto L_0x0171
        L_0x01b9:
            if (r10 == 0) goto L_0x01f9
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x01f6
            java.lang.String r6 = "expand_shippingoption"
        L_0x01c3:
            X.Sto r1 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r3 = r9.A1P
            X.2gB r0 = r2.A03
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L_0x01e1
            java.lang.String r5 = r0.A02()
        L_0x01e1:
            java.util.LinkedHashMap r4 = X.C66584MXp.A0f(r9)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_click_shippingoption_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 406(0x196, float:5.69E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r7 = 4
            goto L_0x01a3
        L_0x01f6:
            java.lang.String r6 = "collapse_shippingoption"
            goto L_0x01c3
        L_0x01f9:
            if (r8 == 0) goto L_0x0200
            java.lang.String r6 = X.SUU.A02(r8)
            goto L_0x01c3
        L_0x0200:
            java.lang.String r6 = "edit_selected_shipping_option"
            goto L_0x01c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STa.A01(X.RH6, X.RH6, X.QDN, java.lang.Boolean):void");
    }

    public static final void A03(QDN qdn, String str) {
        Long l;
        C10575RuU ruU;
        ShippingAddress shippingAddress;
        String str2;
        C12411Sto A0g = C51965G9l.A0g();
        LoggingContext loggingContext = qdn.A1P;
        SUj A0W = Pxe.A0W(qdn.A1U.A06);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (shippingAddress = (ShippingAddress) ruU.A01) == null || (str2 = shippingAddress.A04) == null) {
            l = null;
        } else {
            l = DbV.A0q(str2);
        }
        A0g.A0H(loggingContext, l, str, C66584MXp.A0f(qdn));
    }

    public static final void A04(QDN qdn, String str, String str2) {
        Long l;
        C10575RuU ruU;
        PaymentMethod paymentMethod;
        String Asm;
        C12411Sto sto = Pxi.A0I(qdn).A03;
        LoggingContext loggingContext = qdn.A1P;
        C21267XRm xRm = C21267XRm.A02;
        SUj A0W = Pxe.A0W(qdn.A1R.A08);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (paymentMethod = (PaymentMethod) ruU.A01) == null || (Asm = paymentMethod.Asm()) == null) {
            l = null;
        } else {
            l = DbV.A0q(Asm);
        }
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        Pxj.A1K(l, "TARGET_NAME", str2, A0n);
        C12411Sto.A0A(sto, "CREDENTIAL_TYPE", xRm, str, A0n);
    }

    public static final void A07(QDN qdn, Throwable th, boolean z, boolean z2) {
        C12411Sto A0g = C51965G9l.A0g();
        LoggingContext loggingContext = qdn.A1P;
        SEB A03 = qdn.A1Q.A03();
        Boolean valueOf = Boolean.valueOf(z2);
        LinkedHashMap A07 = SUU.A07(A03);
        if (z) {
            if (valueOf != null) {
                A07.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
            }
            TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_load_ecpcheckout_success"), 57), loggingContext, A07, "pux_checkout", 26);
            return;
        }
        Pxj.A1Q(th, A07);
        if (valueOf != null) {
            A07.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
        }
        A0g.A0Y(loggingContext, "pux_checkout", A07);
    }
}
