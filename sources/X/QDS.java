package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class QDS extends 2YL implements C13844TiK {
    public static final REO A0H = REO.SELECT;
    public SJ1 A00;
    public ECPPaymentRequest A01;
    public LoggingContext A02;
    public String A03;
    public String A04;
    public SparseArray A05;
    public final AnonymousClass2gB A06;
    public final AnonymousClass2gB A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2gO A0B;
    public final QDH A0C;
    public final Map A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(TV2.A00);
    public final AnonymousClass2Fj A0F;
    public final AnonymousClass2gO A0G;

    public static final PuxShippingAddressItem A00(ShippingAddress shippingAddress) {
        ShippingAddress shippingAddress2 = shippingAddress;
        if (shippingAddress == null) {
            return new PuxShippingAddressItem(RH6.A0l, (ShippingAddress) null, (String) null, (String) null, (String) null, false);
        }
        return new PuxShippingAddressItem(RH6.A0l, shippingAddress2, shippingAddress.A00, SKf.A02(shippingAddress), SKf.A01(shippingAddress), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
        if (r0.A01 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AGm(android.os.Bundle r9, android.view.ContextThemeWrapper r10, androidx.fragment.app.Fragment r11, X.SUj r12) {
        /*
            r8 = this;
            r7 = 0
            com.facebookpay.logging.LoggingContext r5 = r8.A02
            r3 = 0
            if (r5 != 0) goto L_0x000e
            X.Pxh.A11()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            java.lang.Object r6 = r12.A01
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem"
            X.0qQ.A0C(r6, r2)
            r0 = r6
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            java.lang.String r4 = r0.A0A
            long r0 = java.lang.Long.parseLong(r4)
            r8.A06(r5, r0, r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem"
            X.0qQ.A0C(r6, r0)
            r0 = r6
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r0
            java.lang.String r1 = r0.getId()
            X.2gB r0 = r8.A06
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r0.A04
        L_0x0045:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009c
            java.util.Map r0 = r8.A0D
            X.0qQ.A0C(r6, r2)
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x0118
            X.0qQ.A0C(r6, r2)
        L_0x0059:
            X.2gB r0 = r8.A07
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0099
            java.util.Iterator r5 = r0.iterator()
        L_0x006b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r1 = r0.A01
            boolean r0 = r1 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            if (r0 == 0) goto L_0x006b
            X.0qQ.A0C(r1, r2)
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r1
            java.lang.String r0 = r1.A0A
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x006b
        L_0x008b:
            X.SUj r3 = (X.SUj) r3
            if (r3 == 0) goto L_0x0099
            java.lang.Object r0 = r3.A01
            X.0qQ.A0C(r0, r2)
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            r8.A04(r9, r11, r0)
        L_0x0099:
            return
        L_0x009a:
            r3 = 0
            goto L_0x008b
        L_0x009c:
            java.lang.String r0 = "Selected item not in the list"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            X.SUj r0 = X.SUj.A0A(r3, r0)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r6 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r6
            if (r6 == 0) goto L_0x00e4
            boolean r1 = r6 instanceof com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
            if (r1 == 0) goto L_0x00e4
            X.2Fj r1 = r8.A09
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00e4
            java.util.Iterator r7 = r1.iterator()
        L_0x00c0:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r5 = r7.next()
            r1 = r5
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = (com.facebookpay.shippingaddress.model.ShippingAddress) r1
            java.lang.String r4 = r1.A04
            r1 = r6
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r1
            java.lang.String r1 = r1.getId()
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 == 0) goto L_0x00c0
            if (r5 == 0) goto L_0x00e4
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.SUj r0 = X.SUj.A07(r0, r5, r3)
        L_0x00e4:
            X.2Fj r1 = r8.A0F
            r1.A0B(r0)
            X.SUj r0 = X.Pxe.A0W(r1)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            if (r0 == 0) goto L_0x0113
            java.lang.String r4 = r0.A04
        L_0x00fd:
            boolean r0 = X.SUj.A0Q(r1)
            if (r0 == 0) goto L_0x0118
            java.util.Map r0 = r8.A0D
            java.lang.Object r0 = r0.get(r4)
            X.TQq r0 = (X.TQq) r0
            if (r0 == 0) goto L_0x0118
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x0118
            goto L_0x0059
        L_0x0113:
            r4 = r3
            goto L_0x00fd
        L_0x0115:
            r0 = r3
            goto L_0x0045
        L_0x0118:
            X.TjH r11 = (X.C13894TjH) r11
            r11.D68()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDS.AGm(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.SUj):void");
    }

    public static final FormParams A01(QDS qds) {
        String str;
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        C10885Rzl rzl = C9963RkI.A00;
        QDS qds2 = qds;
        AddressFormFieldsConfig A002 = C11393SRk.A00((QSO) SUj.A0C(qds2.A0A));
        SparseArray sparseArray = qds2.A05;
        String A022 = A02(sparseArray, 2);
        String A023 = A02(sparseArray, 5);
        String A024 = A02(sparseArray, 6);
        String A025 = A02(sparseArray, 30);
        sparseArray.get(31);
        String A026 = A02(sparseArray, 7);
        String A027 = A02(sparseArray, 9);
        Object obj = sparseArray.get(8);
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String A028 = A02(sparseArray, 21);
        boolean A092 = qds2.A09();
        ECPPaymentRequest eCPPaymentRequest = qds2.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            z = false;
        } else {
            z = DbX.A1a(checkoutConfiguration.A08);
        }
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(A092, true, z);
        LoggingContext loggingContext = qds2.A02;
        if (loggingContext != null) {
            return rzl.A00(featureConfiguration, A002, loggingContext, (ImmutableList) null, (Integer) null, (String) null, A022, A023, A024, A025, A026, A027, str, A028, 2131961257, 0, 2131961330, false, true);
        }
        Pxh.A11();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6 A[LOOP:1: B:37:0x00a6->B:40:0x00ba, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.os.Bundle r37, androidx.fragment.app.Fragment r38, com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r39) {
        /*
            r36 = this;
            r20 = 0
            r0 = r39
            java.util.List r6 = r0.A06
            r4 = 0
            if (r6 == 0) goto L_0x0091
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0091
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            X.RFK r2 = (X.RFK) r2
            r1 = 0
            int r1 = X.DbU.A02(r2, r1)
            switch(r1) {
                case 1: goto L_0x0032;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x003d;
                case 5: goto L_0x0034;
                case 6: goto L_0x003f;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.String r0 = "Invalid Error Field"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0032:
            r1 = 7
            goto L_0x0041
        L_0x0034:
            r1 = 9
            goto L_0x0041
        L_0x0037:
            r1 = 8
            goto L_0x0041
        L_0x003a:
            r1 = 10
            goto L_0x0041
        L_0x003d:
            r1 = 2
            goto L_0x0041
        L_0x003f:
            r1 = 11
        L_0x0041:
            X.AnonymousClass7TF.A1M(r5, r1)
            goto L_0x0017
        L_0x0045:
            com.google.common.collect.ImmutableList r20 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            r1 = 2131961286(0x7f1325c6, float:1.9559265E38)
            r5 = 2131961285(0x7f1325c5, float:1.9559263E38)
            int r3 = r6.size()
            r2 = 1
            if (r3 != r2) goto L_0x0071
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r6)
            X.RFK r1 = (X.RFK) r1
            int r3 = r1.ordinal()
            if (r3 == r2) goto L_0x008d
            r1 = 3
            if (r3 == r1) goto L_0x0089
            r2 = 5
            r1 = 2131961288(0x7f1325c8, float:1.9559269E38)
            if (r3 == r2) goto L_0x006e
            r1 = 2131961286(0x7f1325c6, float:1.9559265E38)
        L_0x006e:
            r5 = 2131961284(0x7f1325c4, float:1.955926E38)
        L_0x0071:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            X.RFe r6 = X.C8911RFe.A04
            com.facebookpay.common.models.ErrorDialogContent r3 = new com.facebookpay.common.models.ErrorDialogContent
            r5 = r3
            r7 = r4
            r8 = r4
            r9 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0092
        L_0x0089:
            r1 = 2131961287(0x7f1325c7, float:1.9559267E38)
            goto L_0x006e
        L_0x008d:
            r1 = 2131961283(0x7f1325c3, float:1.9559259E38)
            goto L_0x006e
        L_0x0091:
            r3 = r4
        L_0x0092:
            r8 = r36
            X.2Fj r1 = r8.A09
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00bc
            java.util.Iterator r5 = r1.iterator()
        L_0x00a6:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r5.next()
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = (com.facebookpay.shippingaddress.model.ShippingAddress) r1
            java.lang.String r2 = r1.A04
            java.lang.String r1 = r0.A0A
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a6
        L_0x00bc:
            X.Rzl r16 = X.C9963RkI.A00
            boolean r1 = r8.A09()
            r31 = 2131961329(0x7f1325f1, float:1.9559352E38)
            if (r1 == 0) goto L_0x00ca
            r31 = 2131961322(0x7f1325ea, float:1.9559338E38)
        L_0x00ca:
            boolean r1 = r8.A09()
            r32 = 2131961338(0x7f1325fa, float:1.955937E38)
            if (r1 == 0) goto L_0x00d6
            r32 = 2131961331(0x7f1325f3, float:1.9559356E38)
        L_0x00d6:
            X.2Fj r7 = r8.A0A
            java.lang.Object r1 = X.SUj.A0C(r7)
            X.QSO r1 = (X.QSO) r1
            com.facebookpay.form.model.AddressFormFieldsConfig r18 = X.C11393SRk.A00(r1)
            r1 = 2131961339(0x7f1325fb, float:1.9559372E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = r0.A0A
            java.lang.String r1 = r0.A03
            r17 = r1
            java.lang.String r15 = r0.A0E
            java.lang.String r14 = r0.A0F
            java.lang.String r13 = r0.A0B
            java.lang.String r12 = r0.A07
            java.lang.String r11 = r0.A0C
            java.lang.String r10 = r0.A0D
            java.lang.String r5 = r0.A08
            boolean r9 = r8.A09()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r8.A01
            if (r0 == 0) goto L_0x0121
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0121
            java.lang.Boolean r0 = r0.A08
            boolean r0 = X.DbX.A1a(r0)
        L_0x010f:
            r2 = 0
            com.facebookpay.form.fragment.model.FeatureConfiguration r1 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r1.<init>(r9, r2, r0)
            com.facebookpay.logging.LoggingContext r0 = r8.A02
            if (r0 != 0) goto L_0x0123
            X.Pxh.A11()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0121:
            r0 = 0
            goto L_0x010f
        L_0x0123:
            boolean r34 = r8.A0C(r6)
            r33 = 2131961345(0x7f132601, float:1.9559384E38)
            r29 = r10
            r30 = r5
            r35 = r2
            r23 = r17
            r24 = r15
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r11
            r17 = r1
            r19 = r0
            r22 = r6
            com.facebookpay.form.fragment.model.FormParams r1 = r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            android.os.Bundle r0 = X.S9Y.A00(r7, r4, r4)
            r4 = r37
            r4.putAll(r0)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r4.putParcelable(r0, r1)
            if (r3 == 0) goto L_0x015b
            java.lang.String r0 = "ECP_FORM_FRAGMENT_ERROR_MESSAGE"
            r4.putParcelable(r0, r3)
        L_0x015b:
            r1 = 1
            java.lang.String r0 = "content_form_fragment"
            r3 = r38
            X.C11336SNr.A00(r4, r3, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDS.A04(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem):void");
    }

    public static final void A05(BaseSelectionCheckoutItem baseSelectionCheckoutItem, QDS qds) {
        C10575RuU ruU;
        ShippingAddress shippingAddress;
        REO reo = (REO) qds.A08.A02();
        if (reo == null) {
            return;
        }
        if (reo.ordinal() == 1) {
            baseSelectionCheckoutItem.Ejn(AnonymousClass05K.A01);
            return;
        }
        SUj A0W = Pxe.A0W(qds.A06);
        String str = null;
        if (!(A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (shippingAddress = (ShippingAddress) ruU.A01) == null)) {
            str = shippingAddress.A04;
        }
        C9621Rdz.A00(baseSelectionCheckoutItem, str, false);
    }

    private final void A06(LoggingContext loggingContext, long j, boolean z) {
        LoggingContext loggingContext2 = loggingContext;
        if (this.A08.A02() == REO.EDIT || z) {
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(C51965G9l.A0g().A00, "user_edit_shippingaddress_enter"), 407), loggingContext, new C74189PqV(loggingContext2, Long.valueOf(j), "edit_shipping_address", (Map) SUU.A08(this.A0C), 7));
            return;
        }
        C51965G9l.A0g().A0H(loggingContext, Long.valueOf(j), "select_existing_shipping_address", SUU.A08(this.A0C));
    }

    public static final void A07(QDS qds) {
        List<SUj> list;
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass2gB r5 = qds.A07;
        SUj A0W = Pxe.A0W(r5);
        if (A0W != null && (list = (List) A0W.A01) != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (SUj sUj : list) {
                Object obj = sUj.A01;
                if (obj != null) {
                    baseCheckoutItem = (BaseCheckoutItem) obj;
                    0qQ.A0B(baseCheckoutItem, 0);
                    if (baseCheckoutItem instanceof SelectionShippingAddressItem) {
                        A05((BaseSelectionCheckoutItem) baseCheckoutItem, qds);
                    }
                } else {
                    baseCheckoutItem = null;
                }
                A0r.add(SUj.A06(sUj, baseCheckoutItem));
            }
            Object A022 = r5.A02();
            if (A022 != null) {
                SUj.A0I(r5, (SUj) A022, A0r);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[EDGE_INSN: B:47:0x00b0->B:29:0x00b0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.QDS r9, X.SUj r10) {
        /*
            X.2Fj r4 = r9.A09
            X.Scv r0 = X.C11596Scv.A00
            X.SUj.A0E(r0, r4, r10)
            boolean r0 = X.SUj.A0V(r10)
            r3 = 0
            if (r0 == 0) goto L_0x006c
            X.2Fj r1 = r9.A0A
            X.Scw r0 = X.C11597Scw.A00
            X.SUj.A0E(r0, r1, r10)
            java.lang.Object r8 = X.SUj.A0D(r10)
            X.Rua r8 = (X.C10580Rua) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.List r7 = r8.A02
            java.util.Iterator r2 = r7.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r6 = r2.next()
            r0 = r6
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r8.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = r9.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
        L_0x0045:
            if (r6 == 0) goto L_0x00b0
            r9.A03 = r3
            X.0eM r0 = r9.A0E
            java.lang.Object r5 = r0.getValue()
            X.Stb r5 = (X.Stb) r5
            java.lang.String r2 = r9.A04
            if (r2 != 0) goto L_0x0060
            java.lang.String r0 = "productID"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0060:
            X.QDH r1 = r9.A0C
            X.5tb r0 = X.C298525tb.SHIPPING_ADDRESS
            X.SJ1 r0 = X.SJ1.A00(r0, r1, r2)
            r5.A04(r0)
            goto L_0x00c7
        L_0x006c:
            boolean r0 = X.SUj.A0S(r10)
            X.2gB r1 = r9.A07
            if (r0 == 0) goto L_0x0098
            java.lang.Throwable r2 = r10.A02
            X.SUj r0 = X.Pxe.A0W(r4)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
        L_0x0080:
            java.util.List r0 = r9.A03(r0)
            X.SUj.A0M(r1, r0, r2)
            X.2Fj r1 = r9.A0F
            X.SUj r0 = X.Pxe.A0W(r1)
            if (r0 == 0) goto L_0x0091
            java.lang.Object r3 = r0.A01
        L_0x0091:
            X.SUj r0 = X.SUj.A0A(r3, r2)
            goto L_0x00e8
        L_0x0096:
            r0 = r3
            goto L_0x0080
        L_0x0098:
            X.SUj r0 = X.Pxe.A0W(r4)
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
        L_0x00a2:
            java.util.List r0 = r9.A03(r3)
            X.SUj.A0L(r1, r0)
            X.2Fj r1 = r9.A0F
            java.lang.Object r0 = r1.A02()
            goto L_0x00e8
        L_0x00b0:
            java.util.Iterator r2 = r7.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x00b4
            r5 = r1
        L_0x00c6:
            r6 = r5
        L_0x00c7:
            X.2Fj r1 = r9.A0F
            if (r6 == 0) goto L_0x00ec
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.SUj r0 = X.SUj.A07(r0, r6, r3)
        L_0x00d1:
            r1.A0B(r0)
            X.2gB r1 = r9.A07
            X.SUj r0 = X.Pxe.A0W(r4)
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
        L_0x00e0:
            java.util.List r0 = r9.A03(r3)
            X.SUj r0 = X.SUj.A09(r0)
        L_0x00e8:
            r1.A0B(r0)
            return
        L_0x00ec:
            java.lang.Object r0 = r1.A02()
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDS.A08(X.QDS, X.SUj):void");
    }

    private final boolean A09() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            return false;
        }
        return DbX.A1a(checkoutConfiguration.A09);
    }

    public final void A0A(TQq tQq) {
        SUj A092;
        C10575RuU ruU;
        ShippingAddress shippingAddress;
        String str;
        List<SUj> list;
        BaseCheckoutItem baseCheckoutItem;
        String str2;
        Integer num;
        SelectionShippingAddressItem selectionShippingAddressItem;
        AnonymousClass2gB r3 = this.A06;
        SUj A0W = Pxe.A0W(r3);
        if (!(A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (shippingAddress = (ShippingAddress) ruU.A01) == null || (str = shippingAddress.A04) == null)) {
            this.A0D.put(str, tQq);
            AnonymousClass2gB r6 = this.A07;
            SUj A0W2 = Pxe.A0W(r6);
            if (!(A0W2 == null || (list = (List) A0W2.A01) == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (SUj sUj : list) {
                    Object obj = sUj.A01;
                    if (obj != null) {
                        baseCheckoutItem = (BaseCheckoutItem) obj;
                        0qQ.A0B(baseCheckoutItem, 0);
                        List list2 = null;
                        if (!(baseCheckoutItem instanceof SelectionShippingAddressItem) || (selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem) == null) {
                            str2 = null;
                        } else {
                            str2 = selectionShippingAddressItem.A0A;
                        }
                        if (0qQ.A0K(str2, str)) {
                            SelectionShippingAddressItem selectionShippingAddressItem2 = (SelectionShippingAddressItem) baseCheckoutItem;
                            if (tQq != null) {
                                num = tQq.A01;
                            } else {
                                num = null;
                            }
                            selectionShippingAddressItem2.A00 = num;
                            if (tQq != null) {
                                list2 = tQq.A02;
                            }
                            selectionShippingAddressItem2.A06 = list2;
                        }
                    } else {
                        baseCheckoutItem = null;
                    }
                    A0r.add(SUj.A06(sUj, baseCheckoutItem));
                }
                Object A022 = r6.A02();
                if (A022 != null) {
                    SUj.A0I(r6, (SUj) A022, A0r);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        if (!A0B()) {
            Object obj2 = null;
            SUj A0W3 = Pxe.A0W(r3);
            if (tQq != null) {
                if (A0W3 != null) {
                    obj2 = A0W3.A01;
                }
                A092 = SUj.A0A(obj2, tQq);
            } else {
                if (A0W3 != null) {
                    obj2 = A0W3.A01;
                }
                A092 = SUj.A09(obj2);
            }
            r3.A0B(A092);
        }
    }

    public final boolean A0B() {
        List list;
        SUj A0W = Pxe.A0W(this.A09);
        if (A0W == null || (list = (List) A0W.A01) == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final boolean A0C(String str) {
        List list;
        Object obj;
        SUj A0W = Pxe.A0W(this.A09);
        if (A0W == null || (list = (List) A0W.A01) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((ShippingAddress) obj).A04, str)) {
                break;
            }
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        if (shippingAddress != null) {
            return shippingAddress.A0E;
        }
        return false;
    }

    public final void AR6(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
        if (baseCheckoutItem != null) {
            LoggingContext loggingContext = this.A02;
            if (loggingContext == null) {
                Pxh.A11();
                throw AnonymousClass00P.createAndThrow();
            }
            SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
            A06(loggingContext, Long.parseLong(selectionShippingAddressItem.A0A), A09());
            A04(bundle, fragment, selectionShippingAddressItem);
        }
    }

    public final AnonymousClass2Fj AuQ() {
        return this.A08;
    }

    public final void EIE() {
        AnonymousClass2Fj r2 = this.A08;
        if (r2.A02() != REO.NONE) {
            r2.A0B(A0H);
            A07(this);
        }
    }

    public final 2Fk ELG() {
        return this.A07;
    }

    public final /* synthetic */ boolean Ern() {
        return true;
    }

    public final void EzK() {
        AnonymousClass2Fj r3 = this.A08;
        REO reo = (REO) r3.A02();
        if (reo != null) {
            int ordinal = reo.ordinal();
            if (ordinal == 1) {
                reo = REO.SELECT;
            } else if (ordinal == 2) {
                reo = REO.EDIT;
            }
            r3.A0B(reo);
        }
        A07(this);
    }

    public final void FKb(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A05 = sparseArray;
        }
    }

    public QDS(QDH qdh) {
        this.A0C = qdh;
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A07 = A0M;
        this.A09 = JTO.A0K();
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A0F = A0K;
        this.A08 = new 2Fk(A0H);
        AnonymousClass2gB A0M2 = Pxh.A0M();
        SUj.A0L(A0M2, (Object) null);
        this.A06 = A0M2;
        this.A0A = JTO.A0K();
        this.A0D = AnonymousClass7TE.A1H();
        this.A0B = C11647Sdp.A00(this, 28);
        C11647Sdp A002 = C11647Sdp.A00(this, 29);
        this.A0G = A002;
        this.A05 = Pxe.A0L();
        A0M2.A0E(A0K, A002);
        A0M.A0E(A0K, A002);
    }

    public static String A02(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final List A03(List list) {
        boolean z;
        Object selectionActionViewItem;
        RH6 rh6;
        Integer num;
        PaymentReceiverInfo paymentReceiverInfo;
        String str;
        CheckoutConfiguration checkoutConfiguration;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            z = false;
        } else {
            z = DbX.A1a(checkoutConfiguration.A0A);
        }
        if (!z || !A0B() || this.A02 == null) {
            this.A05 = Pxe.A0L();
            if (A09()) {
                SUj.A0O(Pxj.A0X(2131961257), A1C);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ShippingAddress shippingAddress = (ShippingAddress) it.next();
                    String str2 = shippingAddress.A04;
                    if (str2 != null) {
                        if (A09()) {
                            rh6 = RH6.A08;
                        } else {
                            rh6 = RH6.A0l;
                        }
                        String str3 = shippingAddress.A00;
                        String A022 = SKf.A02(shippingAddress);
                        String A012 = SKf.A01(shippingAddress);
                        String str4 = shippingAddress.A08;
                        String str5 = shippingAddress.A09;
                        String str6 = shippingAddress.A06;
                        String str7 = shippingAddress.A01;
                        String str8 = shippingAddress.A07;
                        String str9 = shippingAddress.A02;
                        Map map = this.A0D;
                        TQq tQq = (TQq) map.get(str2);
                        if (tQq != null) {
                            num = tQq.A01;
                        } else {
                            num = null;
                        }
                        map.get(str2);
                        String str10 = str4;
                        String str11 = str5;
                        String str12 = str7;
                        Integer num2 = num;
                        String str13 = str2;
                        SelectionShippingAddressItem selectionShippingAddressItem = new SelectionShippingAddressItem(rh6, AnonymousClass05K.A0N, num2, str13, str10, str11, (String) null, (String) null, str12, str8, str9, str6, str3, A022, A012, (String) null, shippingAddress.A03, (List) null, shippingAddress.A0D);
                        A05(selectionShippingAddressItem, this);
                        SUj.A0O(selectionShippingAddressItem, A1C);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            if (this.A0C.A01(C298525tb.SHIPPING_ADDRESS) != RED.OTC) {
                int i = 2131961176;
                if (A09()) {
                    i = 2131961181;
                }
                selectionActionViewItem = new SelectionActionViewItem(RH6.A0n, (Integer) null, Integer.valueOf(i), (String) null, (String) null);
            }
            return 00k.A0a(A1C);
        }
        if (this.A0A.A02() != null) {
            FormParams A013 = A01(this);
            ECPPaymentRequest eCPPaymentRequest2 = this.A01;
            if (eCPPaymentRequest2 == null || (paymentReceiverInfo = eCPPaymentRequest2.A05) == null || ((str = paymentReceiverInfo.A00) == null && (str = paymentReceiverInfo.A02) == null)) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            selectionActionViewItem = new InlineFormItem(RH6.A05, A013, str);
        }
        return 00k.A0a(A1C);
        SUj.A0O(selectionActionViewItem, A1C);
        return 00k.A0a(A1C);
    }

    public final void D5K(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        boolean A1Y = C51970G9q.A1Y(contextThemeWrapper);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionActionViewItem) {
                C12411Sto A0g = C51965G9l.A0g();
                LoggingContext loggingContext = this.A02;
                if (loggingContext != null) {
                    TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_add_shippingaddress_enter"), 387), loggingContext, SUU.A08(this.A0C), "add_shipping_address", 3);
                    AnonymousClass2Fj r4 = this.A0A;
                    boolean A092 = A09();
                    ECPPaymentRequest eCPPaymentRequest = this.A01;
                    if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
                        z = false;
                    } else {
                        z = DbX.A1a(checkoutConfiguration.A08);
                    }
                    FeatureConfiguration featureConfiguration = new FeatureConfiguration(A092, A1Y, z);
                    LoggingContext loggingContext2 = this.A02;
                    if (loggingContext2 != null) {
                        0qQ.A0B(r4, 1);
                        bundle.putAll(S9Y.A00(r4, featureConfiguration, loggingContext2));
                        C11336SNr.A00(bundle, fragment, "content_form_fragment", true, A1Y);
                        return;
                    }
                }
            } else {
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                LoggingContext loggingContext3 = this.A02;
                if (loggingContext3 != null) {
                    A06(loggingContext3, Long.parseLong(selectionShippingAddressItem.A0A), A1Y);
                    A04(bundle, fragment, selectionShippingAddressItem);
                    return;
                }
            }
            0qQ.A0F("loggingContext");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
