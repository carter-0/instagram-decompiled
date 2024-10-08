package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QDT extends 2YL implements C13844TiK {
    public static final REO A0N = REO.SELECT;
    public SparseArray A00;
    public SJ1 A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass2gB A08;
    public final AnonymousClass2gB A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass2Fj A0D = JTO.A0K();
    public final AnonymousClass2Fj A0E;
    public final AnonymousClass2gO A0F;
    public final QDH A0G;
    public final Stc A0H = AnonymousClass2E0.A01().A0D;
    public final Map A0I;
    public final Map A0J;
    public final AnonymousClass0eM A0K = AnonymousClass0eN.A01(TV1.A00);
    public final AnonymousClass2Fj A0L;
    public final AnonymousClass2gO A0M;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r13.A0G.A08() == false) goto L_0x0080;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A02(java.lang.String r14, java.util.List r15, boolean r16) {
        /*
            r13 = this;
            r3 = 0
            if (r15 == 0) goto L_0x002b
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x000b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r0 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.Asm()
        L_0x0021:
            r2.add(r0)
            goto L_0x000b
        L_0x0025:
            r0 = r3
            goto L_0x0021
        L_0x0027:
            java.util.Set r3 = X.00k.A0k(r2)
        L_0x002b:
            java.util.Map r5 = r13.A0J
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r5)
        L_0x0031:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004b
            if (r3 == 0) goto L_0x0031
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r0.getKey()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0031
            r1.remove()
            goto L_0x0031
        L_0x004b:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r15 == 0) goto L_0x0173
            java.util.Iterator r12 = r15.iterator()
        L_0x0055:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r7 = r12.next()
            X.SUj r7 = (X.SUj) r7
            java.lang.Object r6 = X.SUj.A0D(r7)
            com.facebookpay.paymentmethod.model.PaymentMethod r6 = (com.facebookpay.paymentmethod.model.PaymentMethod) r6
            java.lang.Integer r8 = r13.A0J(r6)
            if (r6 == 0) goto L_0x016e
            boolean r2 = r13.A0B()
            boolean r0 = r13.A0B()
            if (r0 == 0) goto L_0x0080
            X.QDH r0 = r13.A0G
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r3 = X.SQ4.A00(r6, r8, r2, r0)
            r0 = r16
            r3.A06 = r0
            A06(r3, r13)
            boolean r9 = r6 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r9 == 0) goto L_0x00d5
            r10 = r6
            com.facebookpay.paymentmethod.model.CreditCard r10 = (com.facebookpay.paymentmethod.model.CreditCard) r10
            if (r10 == 0) goto L_0x00d5
            java.lang.String r0 = r10.Asm()
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00d5
            X.QRJ r11 = r10.A01
            if (r11 == 0) goto L_0x00d5
            X.RGe r2 = X.C8936RGe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 1
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r1 = r11.getRequiredCompactedEnumListField(r1, r0, r2)
            if (r1 == 0) goto L_0x00d5
            X.RGe r0 = X.C8936RGe.ADDRESS
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00d5
            X.TlY r2 = r10.A00
            X.2Fj r0 = r13.A0B
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r1 = r0.A01
            X.QSO r1 = (X.QSO) r1
            if (r1 == 0) goto L_0x0169
            java.lang.String r0 = r10.A03
            boolean r0 = X.C9652ReW.A00(r1, r2, r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r10.Asm()
            r5.remove(r0)
        L_0x00d5:
            X.SUj r0 = X.SUj.A06(r7, r3)
            r4.add(r0)
            r1 = 0
            if (r9 == 0) goto L_0x0166
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
        L_0x00e2:
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00f9
            X.QRJ r2 = r0.A01
            if (r2 == 0) goto L_0x00f9
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r2.getOptionalStringField(r7, r0)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r3) goto L_0x00f9
            r7 = 1
        L_0x00f9:
            if (r9 == 0) goto L_0x0164
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
        L_0x00fe:
            boolean r0 = r13.A0D(r0, r8)
            if (r0 != 0) goto L_0x0162
            if (r8 == 0) goto L_0x010c
            int r0 = r8.intValue()
            if (r0 != 0) goto L_0x010e
        L_0x010c:
            if (r7 == 0) goto L_0x0162
        L_0x010e:
            X.TQq r7 = new X.TQq
            r7.<init>(r8, r1, r1)
        L_0x0113:
            java.util.Map r2 = r13.A0I
            java.lang.String r0 = r6.Asm()
            r2.put(r0, r7)
            X.2gB r3 = r13.A08
            X.SUj r0 = X.Pxe.A0W(r3)
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x0160
            java.lang.String r2 = r0.Asm()
        L_0x0134:
            java.lang.String r0 = r6.Asm()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0055
            X.SUj r0 = X.Pxe.A0W(r3)
            if (r7 == 0) goto L_0x0151
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r0.A01
        L_0x0148:
            X.SUj r0 = X.SUj.A0A(r1, r7)
        L_0x014c:
            r3.A0B(r0)
            goto L_0x0055
        L_0x0151:
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x015b
            java.lang.Integer r1 = r0.A00
        L_0x015b:
            X.SUj r0 = X.SUj.A07(r1, r6, r14)
            goto L_0x014c
        L_0x0160:
            r2 = r1
            goto L_0x0134
        L_0x0162:
            r7 = r1
            goto L_0x0113
        L_0x0164:
            r0 = r1
            goto L_0x00fe
        L_0x0166:
            r0 = r1
            goto L_0x00e2
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0173:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A02(java.lang.String, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A03(java.lang.Boolean r16, java.lang.String r17, java.util.List r18, java.util.List r19, java.util.List r20) {
        /*
            r15 = this;
            r5 = 1
            r6 = r17
            r0 = r18
            java.util.ArrayList r4 = r15.A02(r6, r0, r5)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r0 = r15.A0B()
            if (r0 == 0) goto L_0x003e
            X.QDH r0 = r15.A0G
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x003e
        L_0x001f:
            boolean r0 = r15.A0C()
            r1 = 0
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00b6
            com.facebookpay.form.fragment.model.FormParams r4 = A00(r15, r5)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r15.A02
            java.lang.String r0 = "ecpPaymentRequest"
            if (r1 != 0) goto L_0x009a
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003e:
            if (r20 == 0) goto L_0x001f
            X.2Fj r1 = r15.A0A
            com.google.common.collect.ImmutableList r0 = X.SQ4.A01(r20)
            X.SUj.A0K(r1, r0)
            java.util.Iterator r8 = r20.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r8.next()
            X.QXj r1 = (X.C7798QXj) r1
            X.QTy r0 = r1.A0E()
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x0082
            X.QTy r1 = r1.A0E()
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = "title"
            java.lang.String r14 = r1.A0C(r0)
            if (r14 == 0) goto L_0x010a
            r12 = 0
            r0 = 3
        L_0x0072:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.RH6 r10 = X.RH6.A0n
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r9 = new com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            X.SUj.A0O(r9, r2)
            goto L_0x004d
        L_0x0082:
            X.QTz r0 = r1.A0F()
            if (r0 == 0) goto L_0x004d
            X.QTz r1 = r1.A0F()
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = "title"
            java.lang.String r14 = r1.A0A(r0)
            if (r14 == 0) goto L_0x0114
            r12 = 0
            r0 = 7
            goto L_0x0072
        L_0x009a:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r1.A05
            if (r0 == 0) goto L_0x00b1
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x00b1
        L_0x00a6:
            X.RH6 r1 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r4, r2)
            X.SUj.A0O(r0, r3)
            return r3
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00b6:
            android.util.SparseArray r0 = X.Pxe.A0L()
            r15.A00 = r0
            X.QDH r8 = r15.A0G
            X.5tb r0 = X.C298525tb.PAYMENT_METHOD
            r7 = 0
            com.facebookpay.otc.models.OtcInput r0 = r8.A02(r0, r5)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r1 = r0.A01
        L_0x00c9:
            int r0 = r4.size()
            if (r0 != r5) goto L_0x00da
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "CARD"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00da
            return r3
        L_0x00da:
            r0 = r19
            java.util.ArrayList r1 = r15.A02(r6, r0, r7)
            boolean r0 = r15.A0B()
            if (r0 == 0) goto L_0x00f0
            r0 = 2131961226(0x7f13258a, float:1.9559143E38)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r0 = X.Pxj.A0X(r0)
            X.SUj.A0O(r0, r3)
        L_0x00f0:
            r0 = r16
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 == 0) goto L_0x0103
            r3.addAll(r2)
            r15.A0A(r3, r4, r1)
        L_0x00fe:
            java.util.List r0 = X.00k.A0a(r3)
            return r0
        L_0x0103:
            r15.A0A(r3, r4, r1)
            r3.addAll(r2)
            goto L_0x00fe
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A03(java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List):java.util.List");
    }

    public static final void A09(QDT qdt, SUj sUj) {
        Object obj;
        List list;
        List list2;
        List list3;
        String str;
        Boolean bool;
        List list4;
        List list5;
        List list6;
        String str2;
        Boolean bool2;
        Object obj2;
        String str3;
        String str4;
        QDT qdt2 = qdt;
        AnonymousClass2Fj r5 = qdt.A0D;
        SUj.A0E(C11588Scn.A00, r5, sUj);
        AnonymousClass2Fj r3 = qdt.A0E;
        Object obj3 = null;
        if (SUj.A0V(sUj)) {
            qdt.A0B.A0B(SUj.A04(C11589Sco.A00, sUj));
            qdt.A0L.A0B(SUj.A04(C11590Scp.A00, sUj));
            AnonymousClass2gB r4 = qdt.A09;
            SUj A0W = Pxe.A0W(r5);
            if (A0W != null) {
                list4 = (List) A0W.A01;
            } else {
                list4 = null;
            }
            Object obj4 = sUj.A01;
            SJH sjh = (SJH) obj4;
            if (sjh != null) {
                list5 = sjh.A04;
                list6 = sjh.A03;
                str2 = sjh.A06;
                bool2 = Boolean.valueOf(sjh.A09);
            } else {
                list5 = null;
                list6 = null;
                str2 = null;
                bool2 = null;
            }
            SUj.A0K(r4, qdt2.A03(bool2, str2, list4, list5, list6));
            obj4.getClass();
            Iterator it = sjh.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                Object obj5 = ((SUj) obj2).A01;
                if (obj5 != null) {
                    PaymentMethod paymentMethod = (PaymentMethod) obj5;
                    if (paymentMethod != null) {
                        str3 = paymentMethod.Asm();
                    } else {
                        str3 = null;
                    }
                    if (0qQ.A0K(str3, sjh.A05)) {
                        break;
                    }
                    if (paymentMethod != null) {
                        str4 = paymentMethod.Asm();
                    } else {
                        str4 = null;
                    }
                    if (0qQ.A0K(str4, qdt2.A04)) {
                        break;
                    }
                }
            }
            SUj sUj2 = (SUj) obj2;
            if (sUj2 != null) {
                qdt2.A04 = null;
                Stc stc = qdt2.A0H;
                String str5 = qdt2.A05;
                if (str5 == null) {
                    0qQ.A0F("productId");
                    throw AnonymousClass00P.createAndThrow();
                }
                stc.A0A(SJ1.A00(C298525tb.PAYMENT_METHOD, qdt2.A0G, str5));
                obj = SUj.A07(AnonymousClass05K.A00, SUj.A0D(sUj2), sjh.A06);
                r3.A0B(obj);
            }
        } else if (SUj.A0S(sUj)) {
            AnonymousClass2gB r42 = qdt.A09;
            Throwable th = sUj.A02;
            SUj A0W2 = Pxe.A0W(r5);
            if (A0W2 != null) {
                list = (List) A0W2.A01;
            } else {
                list = null;
            }
            SJH sjh2 = (SJH) sUj.A01;
            if (sjh2 != null) {
                list2 = sjh2.A04;
                list3 = sjh2.A03;
                str = sjh2.A06;
                bool = Boolean.valueOf(sjh2.A09);
            } else {
                list2 = null;
                list3 = null;
                str = null;
                bool = null;
            }
            SUj.A0M(r42, qdt2.A03(bool, str, list, list2, list3), th);
            SUj A0W3 = Pxe.A0W(r3);
            if (A0W3 != null) {
                obj3 = A0W3.A01;
            }
            obj = SUj.A0A(obj3, th);
            r3.A0B(obj);
        } else {
            SUj.A0L(qdt.A09, (Object) null);
        }
        obj = r3.A02();
        r3.A0B(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2.contains(X.C8936RGe.A02) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r2.contains(X.C8936RGe.A04) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2.contains(X.C8936RGe.A02) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0D(com.facebookpay.paymentmethod.model.CreditCard r6, java.lang.Integer r7) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x0045
            X.QRJ r2 = r6.A01
            if (r2 == 0) goto L_0x0045
            X.RGe r1 = X.C8936RGe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 1
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r2 = r2.getRequiredCompactedEnumListField(r3, r0, r1)
            if (r2 == 0) goto L_0x0045
            int r1 = r2.size()
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0048
            r0 = 2
            if (r1 != r0) goto L_0x0046
            X.RGe r0 = X.C8936RGe.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0046
        L_0x0025:
            X.RGe r0 = X.C8936RGe.ZIP
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0046
        L_0x002d:
            r2 = 1
        L_0x002e:
            java.util.Map r1 = r5.A0J
            java.lang.String r0 = r6.Asm()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0044
            int r0 = r7.intValue()
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r4 = 1
        L_0x0045:
            return r4
        L_0x0046:
            r2 = 0
            goto L_0x002e
        L_0x0048:
            X.RGe r0 = X.C8936RGe.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A0D(com.facebookpay.paymentmethod.model.CreditCard, java.lang.Integer):boolean");
    }

    public final void A0L(C13930TlY tlY, PaymentMethod paymentMethod) {
        CreditCard creditCard;
        boolean z;
        boolean z2;
        Integer num;
        C10575RuU ruU;
        C10575RuU ruU2;
        0qQ.A0B(tlY, 0);
        String str = null;
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            C7648QRp qRp = creditCard.A02;
            boolean z3 = creditCard instanceof TokenizedCard;
            if (z3) {
                z = ((TokenizedCard) creditCard).A05;
            } else {
                z = creditCard.A05;
            }
            if (z3) {
                z2 = ((TokenizedCard) creditCard).A04;
            } else {
                z2 = creditCard.A04;
            }
            CreditCard creditCard2 = new CreditCard(qRp, z, z2);
            creditCard2.A00 = tlY;
            this.A0J.put(creditCard2.Asm(), tlY);
            if (A0D(creditCard2, A0J(creditCard2))) {
                this.A0I.put(creditCard2.Asm(), (Object) null);
            }
            AnonymousClass2gB r3 = this.A08;
            SUj A0W = Pxe.A0W(r3);
            if (A0W == null || (ruU2 = (C10575RuU) A0W.A01) == null) {
                num = null;
            } else {
                num = ruU2.A00;
            }
            SUj A0W2 = Pxe.A0W(r3);
            if (!(A0W2 == null || (ruU = (C10575RuU) A0W2.A01) == null)) {
                str = ruU.A02;
            }
            SUj.A0J(r3, num, creditCard2, str);
            if (A0C() && paymentMethod != null) {
                SUj.A0J(this.A0E, AnonymousClass05K.A01, paymentMethod, A01(this));
                A0K();
            }
        }
    }

    public final boolean A0O(CreditCard creditCard, boolean z) {
        QSO qso;
        if (creditCard != null && ((!z || !this.A0J.containsKey(creditCard.Asm())) && this.A06)) {
            C13930TlY tlY = creditCard.A00;
            SUj A0W = Pxe.A0W(this.A0B);
            if (A0W == null || (qso = (QSO) A0W.A01) == null) {
                throw AnonymousClass7TE.A0y();
            } else if (!C9652ReW.A00(qso, tlY, creditCard.A03)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0198, code lost:
        if (r5.A0G.A08() == false) goto L_0x019a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5K(android.os.Bundle r40, android.view.ContextThemeWrapper r41, androidx.fragment.app.Fragment r42, X.SUj r43) {
        /*
            r39 = this;
            r2 = 0
            r1 = 1
            r10 = 3
            r0 = r43
            java.lang.Object r9 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r9 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r9
            if (r9 == 0) goto L_0x003c
            boolean r6 = r9 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            java.lang.String r8 = "Required value was null."
            r0 = 7
            r5 = r39
            r4 = r40
            r3 = r42
            if (r6 == 0) goto L_0x00c2
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r9 = (com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem) r9
            java.lang.Integer r7 = r9.A02
            if (r7 == 0) goto L_0x003c
            int r6 = r7.intValue()
            if (r6 != r10) goto L_0x003d
            X.XRm r6 = X.C21267XRm.A02
            java.lang.String r0 = "add_card"
            r5.A07(r6, r0)
        L_0x002b:
            com.facebookpay.form.fragment.model.FormParams r5 = A00(r5, r2)
        L_0x002f:
            X.0qQ.A0B(r5, r1)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r4.putParcelable(r0, r5)
            java.lang.String r0 = "content_form_fragment"
            X.C11336SNr.A00(r4, r3, r0, r1, r2)
        L_0x003c:
            return
        L_0x003d:
            int r1 = r7.intValue()
            if (r1 != r0) goto L_0x003c
            X.XRm r1 = X.C21267XRm.A08
            java.lang.String r0 = "add_paypal"
            r5.A07(r1, r0)
            java.lang.String r0 = "ECP_CONTENT_FRAGMENT_REQUEST_KEY"
            java.lang.String r4 = r4.getString(r0)
            if (r4 == 0) goto L_0x01a3
            X.QNI r6 = new X.QNI
            r6.<init>()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            java.lang.String r1 = "is_p2p_receiver"
            X.0Df r0 = r6.A02()
            X.0Df.A00(r0, r7, r1)
            com.facebookpay.logging.LoggingContext r0 = r5.A03
            r1 = 0
            if (r0 != 0) goto L_0x0073
            java.lang.String r7 = "loggingContext"
        L_0x006b:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0073:
            java.lang.String r7 = r0.A02
            java.lang.String r0 = "logging_id"
            r6.A07(r7, r0)
            java.lang.String r7 = X.Pxi.A0Y()
            java.lang.String r0 = "login_ref_id"
            r6.A07(r7, r0)
            java.lang.String r7 = "ECP"
            java.lang.String r0 = "payment_type"
            r6.A07(r7, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r5.A02
            java.lang.String r7 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x006b
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = r0.A02
        L_0x0097:
            java.lang.String r0 = "receiver_id"
            r6.A07(r1, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r5.A02
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "product_id"
            r6.A07(r1, r0)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.0eK r0 = r0.A0I
            java.lang.Object r0 = X.C66580MXl.A0s(r0)
            X.Rzo r0 = (X.C10888Rzo) r0
            X.2gB r1 = r0.A00(r6)
            X.Sdd r0 = new X.Sdd
            r0.<init>(r5, r3, r4, r2)
            X.SUj.A0G(r3, r1, r0)
            return
        L_0x00c2:
            boolean r6 = r9 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            if (r6 == 0) goto L_0x0180
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r9 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r9
            java.lang.Integer r6 = r9.A0B
            if (r6 == 0) goto L_0x01a8
            int r6 = r6.intValue()
            if (r6 == r10) goto L_0x019f
            if (r6 != r0) goto L_0x01a8
            java.lang.String r14 = r9.A05
            java.lang.String r8 = r9.A04
            java.lang.String r7 = r9.A0D
            java.lang.String r5 = r9.A0F
            r18 = r5
            r32 = 2131961343(0x7f1325ff, float:1.955938E38)
            r16 = 2131961342(0x7f1325fe, float:1.9559378E38)
            java.lang.String r6 = "client_load_credential_success"
            java.lang.String r13 = "edit_paypal"
            r15 = 0
            com.facebookpay.form.fragment.model.FormDisplayEvent r5 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r5.<init>(r6, r13, r15)
            java.util.List r25 = X.AnonymousClass7TE.A1I(r5)
            java.lang.String r6 = "user_remove_credential_enter"
            java.lang.String r5 = "remove_paypal"
            com.facebookpay.form.fragment.model.FormClickEvent r12 = new com.facebookpay.form.fragment.model.FormClickEvent
            r12.<init>(r6, r5)
            java.lang.String r6 = "user_remove_credential_submit"
            java.lang.String r5 = "remove_paypal_save"
            com.facebookpay.form.fragment.model.FormClickEvent r11 = new com.facebookpay.form.fragment.model.FormClickEvent
            r11.<init>(r6, r5)
            java.lang.String r6 = "user_remove_credential_cancel"
            java.lang.String r5 = "remove_paypal_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r10 = new com.facebookpay.form.fragment.model.FormClickEvent
            r10.<init>(r6, r5)
            java.lang.String r5 = "client_remove_credential_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r9 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r9.<init>(r5, r13)
            java.lang.String r6 = "client_remove_credential_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r5 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r5.<init>(r6, r13)
            com.facebookpay.form.fragment.model.FormLoggingEvents r19 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r22 = r10
            r23 = r9
            r24 = r5
            r26 = r15
            r27 = r15
            r28 = r15
            r20 = r12
            r21 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r6 = X.C11431STx.A04()
            r5 = 2131961203(0x7f132573, float:1.9559096E38)
            if (r6 == 0) goto L_0x0142
            r5 = 2131961197(0x7f13256d, float:1.9559084E38)
        L_0x0142:
            com.facebookpay.form.cell.label.LabelCellParams r17 = X.C11089S9k.A01(r5, r2, r2, r2)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r16)
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
            X.RH3 r21 = X.RH3.A0L
            com.facebookpay.form.fragment.model.ListCellParams r6 = new com.facebookpay.form.fragment.model.ListCellParams
            r6.<init>(r14, r8, r7)
            r33 = 2131961318(0x7f1325e6, float:1.955933E38)
            r34 = 2131961317(0x7f1325e5, float:1.9559328E38)
            r35 = 2131961310(0x7f1325de, float:1.9559313E38)
            r36 = 2131961303(0x7f1325d7, float:1.95593E38)
            com.facebookpay.form.fragment.model.FormParams r5 = new com.facebookpay.form.fragment.model.FormParams
            r22 = r15
            r23 = r15
            r25 = r15
            r27 = r18
            r29 = r15
            r30 = r15
            r31 = r0
            r37 = r2
            r38 = r2
            r18 = r15
            r20 = r6
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x002f
        L_0x0180:
            boolean r0 = r9 instanceof com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            if (r0 == 0) goto L_0x003c
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r9 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r9
            com.facebookpay.paymentmethod.model.PaymentMethod r7 = r9.A01
            if (r7 == 0) goto L_0x002b
            r6 = 0
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x019a
            X.QDH r0 = r5.A0G
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x019b
        L_0x019a:
            r0 = 0
        L_0x019b:
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r9 = X.SQ4.A00(r7, r6, r2, r0)
        L_0x019f:
            r5.A04(r4, r3, r9)
            return
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x01a8:
            java.lang.UnsupportedOperationException r0 = X.C66580MXl.A11()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.D5K(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.SUj):void");
    }

    public static final String A01(QDT qdt) {
        SJH sjh;
        C10575RuU ruU;
        String str;
        C10575RuU ruU2;
        AnonymousClass2Fj r1 = qdt.A0E;
        SUj A0W = Pxe.A0W(r1);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (str = ruU.A02) == null || 00l.A0W(str)) {
            Stc stc = qdt.A0H;
            String str2 = qdt.A05;
            if (str2 == null) {
                0qQ.A0F("productId");
                throw AnonymousClass00P.createAndThrow();
            }
            SUj A0W2 = Pxe.A0W(stc.A05(SJ1.A00(C298525tb.PAYMENT_METHOD, qdt.A0G, str2)));
            if (A0W2 == null || (sjh = (SJH) A0W2.A01) == null) {
                return null;
            }
            return sjh.A06;
        }
        SUj A0W3 = Pxe.A0W(r1);
        if (A0W3 == null || (ruU2 = (C10575RuU) A0W3.A01) == null) {
            return null;
        }
        return ruU2.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        if (r1.A0G.A09() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.os.Bundle r47, androidx.fragment.app.Fragment r48, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r49) {
        /*
            r46 = this;
            r0 = r49
            X.TlY r4 = r0.A08
            if (r4 == 0) goto L_0x00fc
            X.QRJ r3 = r0.A00
            r2 = 1
            r1 = r46
            if (r3 == 0) goto L_0x009a
            java.lang.String r5 = "error_msg"
            java.lang.String r5 = r3.A07(r5)
            if (r5 == 0) goto L_0x009a
            boolean r5 = X.C51966G9m.A1X(r5)
            if (r5 != r2) goto L_0x009a
        L_0x001b:
            r40 = 0
        L_0x001d:
            X.SGH r10 = X.C10077RmF.A00
            r5 = 2131961340(0x7f1325fc, float:1.9559374E38)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r5)
            r16 = 0
            java.lang.String r9 = r0.A0I
            java.lang.String r8 = r0.A0E
            java.lang.String r7 = r0.A0C
            java.lang.String r24 = r4.C1d()
            java.lang.String r25 = r4.C1e()
            java.lang.String r26 = r4.AZd()
            java.lang.String r27 = r4.AZf()
            java.lang.String r28 = r4.CHc()
            java.lang.String r29 = r4.Arl()
            java.lang.String r6 = r0.A0F
            X.RGo r15 = r0.A0A
            X.2Fj r4 = r1.A0B
            java.lang.Object r4 = X.SUj.A0C(r4)
            X.QSO r4 = (X.QSO) r4
            com.facebookpay.form.model.AddressFormFieldsConfig r12 = X.C11393SRk.A00(r4)
            X.2Fj r4 = r1.A0L
            java.lang.Object r4 = X.SUj.A0C(r4)
            java.util.List r4 = (java.util.List) r4
            com.facebookpay.form.model.CardFormFieldConfig r13 = X.C11393SRk.A01(r4)
            if (r3 == 0) goto L_0x0095
            X.RGe r5 = X.C8936RGe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r4 = "fields_to_verify"
            com.google.common.collect.ImmutableList r17 = r3.getRequiredCompactedEnumListField(r2, r4, r5)
            java.lang.String r4 = "error_msg"
            java.lang.String r32 = r3.A07(r4)
        L_0x0072:
            boolean r5 = r1.A07
            X.QDH r4 = r1.A0G
            boolean r38 = r4.A09()
            r39 = r40 ^ 1
            com.facebookpay.logging.LoggingContext r14 = r1.A03
            if (r14 != 0) goto L_0x008a
            java.lang.String r0 = "loggingContext"
        L_0x0082:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008a:
            boolean r42 = r1.A0B()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r1.A02
            if (r4 != 0) goto L_0x00a6
            java.lang.String r0 = "ecpPaymentRequest"
            goto L_0x0082
        L_0x0095:
            r17 = r16
            r32 = r16
            goto L_0x0072
        L_0x009a:
            X.QDH r5 = r1.A0G
            boolean r5 = r5.A09()
            r40 = 1
            if (r5 == 0) goto L_0x001d
            goto L_0x001b
        L_0x00a6:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x00f9
            java.lang.Boolean r4 = r4.A08
            boolean r45 = X.AnonymousClass7TF.A1Y(r4, r2)
        L_0x00b0:
            r34 = 2131961332(0x7f1325f4, float:1.9559358E38)
            r35 = 2131961345(0x7f132601, float:1.9559384E38)
            X.REC r11 = X.REC.NONE
            r4 = 0
            r19 = r16
            r22 = r16
            r23 = r7
            r30 = r6
            r31 = r16
            r33 = r16
            r36 = r4
            r37 = r5
            r41 = r4
            r43 = r4
            r44 = r4
            r20 = r9
            r21 = r8
            com.facebookpay.form.fragment.model.FormParams r5 = r10.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            long r9 = java.lang.Long.parseLong(r6)
            X.XRm r0 = r0.A09
            boolean r11 = r1.A0B()
            r7 = r3
            r8 = r0
            r6 = r1
            r6.A05(r7, r8, r9, r11)
            X.0qQ.A0B(r5, r2)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r3 = r47
            r3.putParcelable(r0, r5)
            java.lang.String r0 = "content_form_fragment"
            r1 = r48
            X.C11336SNr.A00(r3, r1, r0, r2, r4)
            return
        L_0x00f9:
            r45 = 0
            goto L_0x00b0
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A04(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(X.QRJ r11, X.C21267XRm r12, long r13, boolean r15) {
        /*
            r10 = this;
            X.2Fj r0 = r10.A0C
            java.lang.Object r3 = r0.A02()
            X.REO r1 = X.REO.EDIT
            r0 = 0
            java.lang.String r4 = "user_edit_credential_enter"
            java.lang.String r2 = "edit_card"
            if (r3 == r1) goto L_0x0029
            if (r15 != 0) goto L_0x0029
            java.lang.String r4 = "user_click_credential_atomic"
            java.lang.String r2 = "select_existing_credential "
        L_0x0018:
            r7 = r0
        L_0x0019:
            X.Sto r5 = X.C11353SOm.A00()
            com.facebookpay.logging.LoggingContext r9 = r10.A03
            if (r9 != 0) goto L_0x0040
            X.Pxh.A11()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            r5 = 1
            if (r11 == 0) goto L_0x0018
            X.RGe r3 = X.C8936RGe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "fields_to_verify"
            com.google.common.collect.ImmutableList r1 = r11.getRequiredCompactedEnumListField(r5, r1, r3)
            if (r1 == 0) goto L_0x0018
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 != r5) goto L_0x0018
            java.lang.String r7 = "need_verification"
            goto L_0x0019
        L_0x0040:
            X.QDH r1 = r10.A0G
            X.SEB r8 = r1.A03()
            if (r11 == 0) goto L_0x0051
            X.RGe r3 = X.C8936RGe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 1
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r0 = r11.getRequiredCompactedEnumListField(r1, r0, r3)
        L_0x0051:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.util.LinkedHashMap r3 = X.Pxi.A0n(r9)
            java.lang.String r0 = "TARGET_NAME"
            r3.put(r0, r2)
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "component_data_id"
            r3.put(r0, r1)
        L_0x0069:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r3.put(r0, r12)
            java.lang.String r2 = "extra_data"
            java.lang.Object r1 = r3.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0084
            boolean r0 = r1 instanceof X.C62650uo
            if (r0 == 0) goto L_0x0080
            boolean r0 = r1 instanceof X.AnonymousClass0s2
            if (r0 == 0) goto L_0x0084
        L_0x0080:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0088
        L_0x0084:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
        L_0x0088:
            X.SUU.A0A(r8, r1)
            r3.put(r2, r1)
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = "selected_credential_state"
            X.SUU.A0C(r7, r0, r3)
        L_0x0096:
            if (r6 == 0) goto L_0x009d
            java.lang.String r0 = "fields_to_verify"
            X.SUU.A0C(r6, r0, r3)
        L_0x009d:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r3)
            X.0qQ.A07(r0)
            r5.Cgl(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A05(X.QRJ, X.XRm, long, boolean):void");
    }

    public static final void A06(SelectionPaymentMethodItem selectionPaymentMethodItem, QDT qdt) {
        String str;
        Integer num;
        Integer num2;
        String A072;
        C10575RuU ruU;
        PaymentMethod paymentMethod;
        REO reo = (REO) qdt.A0C.A02();
        if (reo != null) {
            boolean z = true;
            if (reo.ordinal() == 1) {
                selectionPaymentMethodItem.Ejn(AnonymousClass05K.A01);
                return;
            }
            SUj A0W = Pxe.A0W(qdt.A08);
            if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (paymentMethod = (PaymentMethod) ruU.A01) == null) {
                str = null;
            } else {
                str = paymentMethod.Asm();
            }
            QRJ qrj = selectionPaymentMethodItem.A00;
            if ((qrj == null || (A072 = qrj.A07("error_msg")) == null || !C51966G9m.A1X(A072)) && (((num = selectionPaymentMethodItem.A02) == null || num.intValue() != 2131961348) && (A0E(qdt) || (num2 = selectionPaymentMethodItem.A02) == null || num2.intValue() != 2131961347))) {
                z = false;
            }
            C9621Rdz.A00(selectionPaymentMethodItem, str, z);
        }
    }

    public static final void A08(QDT qdt) {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        TQq tQq;
        Integer num;
        SUj A072;
        C10575RuU ruU;
        C10575RuU ruU2;
        Integer num2;
        C10575RuU ruU3;
        C10575RuU ruU4;
        String optionalStringField;
        SUj A0W;
        C10575RuU ruU5;
        PaymentMethod paymentMethod2;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        CreditCard creditCard2;
        List list;
        Object obj;
        String str;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        C10575RuU ruU6;
        AnonymousClass2gB r5 = qdt.A08;
        SUj A0W2 = Pxe.A0W(r5);
        String str2 = null;
        if (A0W2 == null || (ruU6 = (C10575RuU) A0W2.A01) == null) {
            paymentMethod = null;
        } else {
            paymentMethod = (PaymentMethod) ruU6.A01;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            qdt.A0J.remove(creditCard.Asm());
            if (!(!A0E(qdt) || (A0W = Pxe.A0W(r5)) == null || (ruU5 = (C10575RuU) A0W.A01) == null || (paymentMethod2 = (PaymentMethod) ruU5.A01) == null)) {
                SUj A0W3 = Pxe.A0W(qdt.A09);
                BaseCheckoutItem baseCheckoutItem = null;
                if (!(A0W3 == null || (list = (List) A0W3.A01) == null)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Object obj2 = ((SUj) obj).A01;
                        if (!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) {
                            str = null;
                        } else {
                            str = selectionPaymentMethodItem2.A0F;
                        }
                        if (0qQ.A0K(str, paymentMethod2.Asm())) {
                            break;
                        }
                    }
                    SUj sUj = (SUj) obj;
                    if (sUj != null) {
                        baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
                    }
                }
                if ((baseCheckoutItem instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) != null) {
                    selectionPaymentMethodItem.A07 = false;
                    C13930TlY tlY = selectionPaymentMethodItem.A08;
                    if (!(tlY == null || !(paymentMethod2 instanceof CreditCard) || (creditCard2 = (CreditCard) paymentMethod2) == null)) {
                        creditCard2.A00 = tlY;
                    }
                    selectionPaymentMethodItem.A02 = qdt.A0J(paymentMethod2);
                }
            }
            Integer A0J2 = qdt.A0J(creditCard);
            QRJ qrj = creditCard.A01;
            boolean z = false;
            if (!(qrj == null || (optionalStringField = qrj.getOptionalStringField(0, "error_msg")) == null || !C51966G9m.A1X(optionalStringField))) {
                z = true;
            }
            if ((A0J2 == null || A0J2.intValue() == 0) && !z) {
                tQq = null;
            } else {
                tQq = new TQq(A0J2, (Integer) null, (List) null);
            }
            qdt.A0I.put(creditCard.Asm(), tQq);
            SUj A0W4 = Pxe.A0W(r5);
            if (tQq != null) {
                if (A0W4 == null || (ruU4 = (C10575RuU) A0W4.A01) == null) {
                    num2 = null;
                } else {
                    num2 = ruU4.A00;
                }
                SUj A0W5 = Pxe.A0W(r5);
                if (!(A0W5 == null || (ruU3 = (C10575RuU) A0W5.A01) == null)) {
                    str2 = ruU3.A02;
                }
                A072 = SUj.A0A(new C10575RuU(num2, creditCard, str2), tQq);
            } else {
                if (A0W4 == null || (ruU2 = (C10575RuU) A0W4.A01) == null) {
                    num = null;
                } else {
                    num = ruU2.A00;
                }
                SUj A0W6 = Pxe.A0W(r5);
                if (!(A0W6 == null || (ruU = (C10575RuU) A0W6.A01) == null)) {
                    str2 = ruU.A02;
                }
                A072 = SUj.A07(num, creditCard, str2);
            }
            r5.A0B(A072);
        }
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A09);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A0A);
        }
        return false;
    }

    public static final boolean A0E(QDT qdt) {
        ECPPaymentRequest eCPPaymentRequest = qdt.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A07);
        }
        return false;
    }

    public final ShippingAddress A0F() {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C13930TlY tlY;
        C10575RuU ruU;
        SUj A0W = Pxe.A0W(this.A08);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            paymentMethod = null;
        } else {
            paymentMethod = (PaymentMethod) ruU.A01;
        }
        if (!(paymentMethod instanceof CreditCard) || (creditCard = (CreditCard) paymentMethod) == null || (tlY = creditCard.A00) == null) {
            return null;
        }
        String str = creditCard.A03;
        if (str == null) {
            str = "";
        }
        return new ShippingAddress((String) null, (String) null, str, tlY.C1d(), tlY.C1e(), tlY.AZd(), tlY.AZf(), tlY.Arl(), tlY.CHc(), (String) null, true, true, false, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.facebookpay.paymentmethod.model.CreditCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.facebookpay.paymentmethod.model.CreditCard} */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SUj A0G() {
        /*
            r13 = this;
            X.2gB r0 = r13.A09
            X.SUj r0 = X.Pxe.A0W(r0)
            r1 = 1
            if (r0 == 0) goto L_0x011d
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x011d
            boolean r5 = r0.isEmpty()
        L_0x0013:
            X.2gB r2 = r13.A08
            X.SUj r3 = X.Pxe.A0W(r2)
            java.lang.Object r0 = r3.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x011a
            java.lang.Object r9 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r9 = (com.facebookpay.paymentmethod.model.PaymentMethod) r9
        L_0x0023:
            r10 = 0
            r12 = r5 ^ 1
            X.RH6 r8 = X.RH6.A0h
            r11 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r7 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r7.<init>(r8, r9, r10, r11, r12)
            X.SUj r7 = X.SUj.A06(r3, r7)
            boolean r0 = X.SUj.A0R(r2)
            if (r0 != 0) goto L_0x0080
            X.SUj r0 = X.Pxe.A0W(r2)
            r5 = 0
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r0.A01
        L_0x0047:
            r6 = 3
            if (r0 != 0) goto L_0x0087
            X.SUj r0 = X.Pxe.A0W(r2)
            if (r0 == 0) goto L_0x0052
            java.lang.Throwable r5 = r0.A02
        L_0x0052:
            boolean r0 = r5 instanceof X.TQU
            if (r0 != 0) goto L_0x0080
            boolean r0 = r13.A0C()
            r3 = 2131961230(0x7f13258e, float:1.9559151E38)
            if (r0 == 0) goto L_0x0062
            r3 = 2131961243(0x7f13259b, float:1.9559177E38)
        L_0x0062:
            boolean r0 = r13.A0C()
            if (r0 == 0) goto L_0x0084
            X.RH2 r0 = X.RH2.A1F
        L_0x006a:
            X.TQh r2 = new X.TQh
            r2.<init>(r0, r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r3 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r4 = r8
            r5 = r10
            r7 = r11
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x007c:
            X.SUj r7 = X.SUj.A0A(r3, r2)
        L_0x0080:
            X.0qQ.A0A(r7)
            return r7
        L_0x0084:
            X.RH2 r0 = X.RH2.A0Y
            goto L_0x006a
        L_0x0087:
            X.SUj r0 = X.Pxe.A0W(r2)
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0120
            java.lang.Object r9 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r9 = (com.facebookpay.paymentmethod.model.PaymentMethod) r9
            if (r9 == 0) goto L_0x0120
            java.lang.Integer r3 = r13.A0J(r9)
            boolean r2 = r9 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r2 == 0) goto L_0x00a4
            r5 = r9
            com.facebookpay.paymentmethod.model.CreditCard r5 = (com.facebookpay.paymentmethod.model.CreditCard) r5
        L_0x00a4:
            boolean r0 = r13.A0D(r5, r3)
            if (r0 == 0) goto L_0x00b9
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r2 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            X.SUj r7 = X.SUj.A09(r2)
            goto L_0x0080
        L_0x00b9:
            if (r2 == 0) goto L_0x00e8
            r0 = r9
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            X.QRJ r2 = r0.A01
            if (r2 == 0) goto L_0x00e8
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r2.getOptionalStringField(r11, r0)
            if (r0 == 0) goto L_0x00e8
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x00e8
            r0 = 2131961262(0x7f1325ae, float:1.9559216E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.TQq r2 = new X.TQq
            r2.<init>(r0, r10, r10)
        L_0x00dc:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r3 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r12 = r1
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x007c
        L_0x00e8:
            if (r3 == 0) goto L_0x0080
            int r0 = r3.intValue()
            if (r0 == 0) goto L_0x0080
            X.2Fj r0 = r13.A0D
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x010a
            int r0 = r0.size()
            if (r0 != r1) goto L_0x010a
            X.TQq r2 = new X.TQq
            r2.<init>(r3, r10, r10)
            goto L_0x00dc
        L_0x010a:
            r0 = 2131961262(0x7f1325ae, float:1.9559216E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.TQq r2 = new X.TQq
            r2.<init>(r0, r10, r10)
            goto L_0x00dc
        L_0x0117:
            r0 = r5
            goto L_0x0047
        L_0x011a:
            r9 = 0
            goto L_0x0023
        L_0x011d:
            r5 = 1
            goto L_0x0013
        L_0x0120:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A0G():X.SUj");
    }

    public final Boolean A0H() {
        Object obj = this.A00.get(45);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Boolean A0I() {
        Object obj = this.A00.get(29);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Integer A0J(PaymentMethod paymentMethod) {
        int i;
        if (paymentMethod instanceof CreditCard) {
            if ((paymentMethod instanceof TokenizedCard) && ((TokenizedCard) paymentMethod).A01.getOptionalEnumField(0, "token_status", C8934RGc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == C8934RGc.SUSPENDED) {
                i = 2131961348;
            } else if (A0O((CreditCard) paymentMethod, true)) {
                i = 2131961347;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final void A0K() {
        List<SUj> list;
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass2gB r7 = this.A09;
        SUj A0W = Pxe.A0W(r7);
        if (A0W != null && (list = (List) A0W.A01) != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (SUj sUj : list) {
                Object obj = sUj.A01;
                if (obj != null) {
                    baseCheckoutItem = (BaseCheckoutItem) obj;
                    0qQ.A0B(baseCheckoutItem, 0);
                    if (baseCheckoutItem instanceof SelectionPaymentMethodItem) {
                        SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem;
                        if (this.A0I.get(selectionPaymentMethodItem.A0F) == null) {
                            selectionPaymentMethodItem.A02 = null;
                        }
                        A06(selectionPaymentMethodItem, this);
                    }
                } else {
                    baseCheckoutItem = null;
                }
                A0r.add(SUj.A06(sUj, baseCheckoutItem));
            }
            Object A022 = r7.A02();
            if (A022 != null) {
                SUj.A0I(r7, (SUj) A022, A0r);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A0M(PaymentMethod paymentMethod) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        String str;
        String str2;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        SUj A0W = Pxe.A0W(this.A09);
        BaseCheckoutItem baseCheckoutItem = null;
        if (!(A0W == null || (list = (List) A0W.A01) == null)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object obj2 = ((SUj) obj).A01;
                if (!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) {
                    str = null;
                } else {
                    str = selectionPaymentMethodItem2.A0F;
                }
                if (paymentMethod != null) {
                    str2 = paymentMethod.Asm();
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str, str2)) {
                    break;
                }
            }
            SUj sUj = (SUj) obj;
            if (sUj != null) {
                baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
            }
        }
        if ((baseCheckoutItem instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) != null) {
            selectionPaymentMethodItem.A07 = true;
        }
    }

    public final boolean A0N() {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C10575RuU ruU;
        Map map = this.A0J;
        SUj A0W = Pxe.A0W(this.A08);
        String str = null;
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            paymentMethod = null;
        } else {
            paymentMethod = (PaymentMethod) ruU.A01;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            str = creditCard.Asm();
        }
        return AnonymousClass7TF.A1V(map.get(str));
    }

    public final void AGm(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        String str;
        TQq tQq;
        Object obj;
        C10575RuU ruU;
        PaymentMethod paymentMethod;
        SUj A0W;
        List list;
        Object obj2;
        String str2;
        List list2;
        Object obj3;
        C10575RuU ruU2;
        PaymentMethod paymentMethod2;
        Fragment fragment2 = fragment;
        SUj sUj2 = sUj;
        0qQ.A0B(sUj2, 0);
        Bundle bundle2 = bundle;
        AnonymousClass7TG.A1P(fragment2, bundle2);
        Object obj4 = sUj2.A01;
        0qQ.A0C(obj4, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
        SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) obj4;
        String str3 = selectionPaymentMethodItem.A0F;
        A05((QRJ) null, selectionPaymentMethodItem.A09, Long.parseLong(str3), false);
        AnonymousClass2Fj r7 = this.A0E;
        SUj A0W2 = Pxe.A0W(r7);
        if (A0W2 == null || (ruU2 = (C10575RuU) A0W2.A01) == null || (paymentMethod2 = (PaymentMethod) ruU2.A01) == null) {
            str = null;
        } else {
            str = paymentMethod2.Asm();
        }
        if (0qQ.A0K(str3, str)) {
            if (!selectionPaymentMethodItem.A07) {
                obj = this.A0I.get(str3);
            }
            ((C13894TjH) fragment2).D68();
        }
        SUj A0A2 = SUj.A0A((Object) null, AnonymousClass7TE.A11("Selected item not in the list"));
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) obj4;
        if (!(baseCheckoutItem == null || !(baseCheckoutItem instanceof BaseSelectionCheckoutItem) || (A0W = Pxe.A0W(this.A0D)) == null || (list = (List) A0W.A01) == null)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                PaymentMethod paymentMethod3 = (PaymentMethod) ((SUj) obj2).A01;
                if (paymentMethod3 != null) {
                    str2 = paymentMethod3.Asm();
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str2, ((BaseSelectionCheckoutItem) baseCheckoutItem).getId())) {
                    break;
                }
            }
            SUj sUj3 = (SUj) obj2;
            if (sUj3 != null) {
                A0A2 = SUj.A07(AnonymousClass05K.A01, SUj.A0D(sUj3), A01(this));
            }
        }
        r7.A0B(A0A2);
        SUj A0W3 = Pxe.A0W(r7);
        if (A0W3 == null || (ruU = (C10575RuU) A0W3.A01) == null || (paymentMethod = (PaymentMethod) ruU.A01) == null) {
            str3 = null;
        } else {
            str3 = paymentMethod.Asm();
        }
        if (!selectionPaymentMethodItem.A07 && SUj.A0Q(r7) && (tQq = (TQq) this.A0I.get(str3)) != null) {
            obj = tQq.A01;
        }
        ((C13894TjH) fragment2).D68();
        if (obj != null) {
            SUj A0W4 = Pxe.A0W(this.A09);
            if (A0W4 != null && (list2 = (List) A0W4.A01) != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    Object obj5 = ((SUj) obj3).A01;
                    if (obj5 instanceof SelectionPaymentMethodItem) {
                        0qQ.A0C(obj5, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
                        if (0qQ.A0K(((SelectionPaymentMethodItem) obj5).A0F, str3)) {
                            break;
                        }
                    }
                }
                SUj sUj4 = (SUj) obj3;
                if (sUj4 != null) {
                    Object obj6 = sUj4.A01;
                    0qQ.A0C(obj6, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
                    A04(bundle2, fragment2, (SelectionPaymentMethodItem) obj6);
                    return;
                }
                return;
            }
            return;
        }
        ((C13894TjH) fragment2).D68();
    }

    public final void AR6(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
        if (baseCheckoutItem != null) {
            A04(bundle, fragment, (SelectionPaymentMethodItem) baseCheckoutItem);
        }
    }

    public final AnonymousClass2Fj AuQ() {
        return this.A0C;
    }

    public final void EIE() {
        AnonymousClass2Fj r2 = this.A0C;
        if (r2.A02() != REO.NONE) {
            r2.A0B(A0N);
            A0K();
        }
    }

    public final 2Fk ELG() {
        return this.A09;
    }

    public final boolean Ern() {
        C10575RuU ruU;
        PaymentMethod paymentMethod;
        String Asm;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        String str;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        SUj A0W = Pxe.A0W(this.A0E);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (paymentMethod = (PaymentMethod) ruU.A01) == null || (Asm = paymentMethod.Asm()) == null) {
            return true;
        }
        SUj A0W2 = Pxe.A0W(this.A09);
        BaseCheckoutItem baseCheckoutItem = null;
        if (!(A0W2 == null || (list = (List) A0W2.A01) == null)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object obj2 = ((SUj) obj).A01;
                if (!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) {
                    str = null;
                } else {
                    str = selectionPaymentMethodItem2.A0F;
                }
                if (0qQ.A0K(str, Asm)) {
                    break;
                }
            }
            SUj sUj = (SUj) obj;
            if (sUj != null) {
                baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
            }
        }
        if (!(baseCheckoutItem instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) == null || !selectionPaymentMethodItem.A07 || this.A0J.containsKey(Asm)) {
            return true;
        }
        return false;
    }

    public final void EzK() {
        AnonymousClass2Fj r3 = this.A0C;
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
        A0K();
    }

    public final void FKb(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }

    public QDT(QDH qdh) {
        this.A0G = qdh;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A0E = A0K2;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A09 = A0M2;
        this.A0B = JTO.A0K();
        this.A0L = JTO.A0K();
        this.A0A = JTO.A0K();
        this.A0I = AnonymousClass7TE.A1H();
        AnonymousClass2gB A0M3 = Pxh.A0M();
        SUj.A0L(A0M3, (Object) null);
        this.A08 = A0M3;
        this.A0C = new 2Fk(A0N);
        this.A0F = C11647Sdp.A00(this, 22);
        C11647Sdp A002 = C11647Sdp.A00(this, 23);
        this.A0M = A002;
        this.A0J = AnonymousClass7TE.A1H();
        this.A00 = Pxe.A0L();
        A0M3.A0E(A0K2, A002);
        A0M2.A0E(A0K2, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (X.DbT.A1b(r13) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        if (r51 != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018c, code lost:
        if (r51 != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        if (r51 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0198, code lost:
        if (r51 != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019e, code lost:
        if (r51 != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (r51 != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a9, code lost:
        if (r51 != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ae, code lost:
        if (r51 != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b3, code lost:
        if (r51 != false) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.form.fragment.model.FormParams A00(X.QDT r50, boolean r51) {
        /*
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            r0 = r50
            X.0eM r1 = r0.A0K
            java.lang.Object r3 = r1.getValue()
            X.Stb r3 = (X.Stb) r3
            java.lang.String r2 = r0.A05
            if (r2 != 0) goto L_0x001d
            java.lang.String r0 = "productId"
        L_0x0015:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            X.QDH r12 = r0.A0G
            X.5tb r1 = X.C298525tb.SHIPPING_ADDRESS
            r15 = 1
            X.SJ1 r1 = X.SJ1.A00(r1, r12, r2)
            X.2gB r1 = r3.A01(r1)
            X.SUj r2 = X.Pxe.A0W(r1)
            if (r2 == 0) goto L_0x009e
            boolean r1 = X.SUj.A0V(r2)
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r2.A01
            X.Rua r1 = (X.C10580Rua) r1
            if (r1 == 0) goto L_0x009e
            java.util.List r1 = r1.A02
            java.util.Iterator r10 = r1.iterator()
        L_0x0042:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x009e
            java.lang.Object r2 = r10.next()
            com.facebookpay.shippingaddress.model.ShippingAddress r2 = (com.facebookpay.shippingaddress.model.ShippingAddress) r2
            java.lang.String r9 = r2.A04
            if (r9 == 0) goto L_0x01d6
            boolean r1 = r0.A0B()
            if (r1 == 0) goto L_0x009b
            X.RH6 r17 = X.RH6.A08
        L_0x005a:
            java.lang.String r8 = r2.A00
            java.lang.String r30 = X.SKf.A02(r2)
            java.lang.String r31 = X.SKf.A01(r2)
            java.lang.String r7 = r2.A08
            java.lang.String r6 = r2.A09
            java.lang.String r5 = r2.A06
            java.lang.String r4 = r2.A01
            java.lang.String r3 = r2.A07
            java.lang.String r2 = r2.A02
            r19 = 0
            java.lang.Integer r18 = X.AnonymousClass05K.A0N
            r35 = 0
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r1 = new com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            r23 = r19
            r24 = r19
            r26 = r3
            r27 = r2
            r28 = r5
            r29 = r8
            r32 = r19
            r33 = r19
            r34 = r19
            r20 = r9
            r21 = r7
            r22 = r6
            r25 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r13.add(r1)
            goto L_0x0042
        L_0x009b:
            X.RH6 r17 = X.RH6.A0l
            goto L_0x005a
        L_0x009e:
            boolean r1 = r0.A07
            if (r1 != 0) goto L_0x00aa
            boolean r1 = X.DbT.A1b(r13)
            r47 = 1
            if (r1 != 0) goto L_0x00ac
        L_0x00aa:
            r47 = 0
        L_0x00ac:
            X.SGH r16 = X.C10077RmF.A00
            r40 = 2131961323(0x7f1325eb, float:1.955934E38)
            r41 = 2131961345(0x7f132601, float:1.9559384E38)
            r49 = r51
            if (r51 == 0) goto L_0x00be
            r40 = 2131961226(0x7f13258a, float:1.9559143E38)
            r41 = 2131961330(0x7f1325f2, float:1.9559354E38)
        L_0x00be:
            X.2Fj r1 = r0.A0B
            java.lang.Object r1 = X.SUj.A0C(r1)
            X.QSO r1 = (X.QSO) r1
            com.facebookpay.form.model.AddressFormFieldsConfig r18 = X.C11393SRk.A00(r1)
            X.2Fj r1 = r0.A0L
            java.lang.Object r1 = X.SUj.A0C(r1)
            java.util.List r1 = (java.util.List) r1
            com.facebookpay.form.model.CardFormFieldConfig r19 = X.C11393SRk.A01(r1)
            r21 = 0
            if (r51 == 0) goto L_0x0184
            android.util.SparseArray r2 = r0.A00
            r1 = 13
            java.lang.Object r11 = r2.get(r1)
            boolean r1 = r11 instanceof java.lang.String
            if (r1 == 0) goto L_0x0184
            java.lang.String r11 = (java.lang.String) r11
        L_0x00e8:
            android.util.SparseArray r2 = r0.A00
            r1 = 14
            java.lang.Object r10 = r2.get(r1)
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L_0x018a
            java.lang.String r10 = (java.lang.String) r10
        L_0x00f6:
            android.util.SparseArray r2 = r0.A00
            r1 = 15
            java.lang.Object r9 = r2.get(r1)
            boolean r1 = r9 instanceof java.lang.String
            if (r1 == 0) goto L_0x0190
            java.lang.String r9 = (java.lang.String) r9
        L_0x0104:
            android.util.SparseArray r2 = r0.A00
            r1 = 2
            java.lang.Object r8 = r2.get(r1)
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto L_0x0196
            java.lang.String r8 = (java.lang.String) r8
        L_0x0111:
            android.util.SparseArray r2 = r0.A00
            r1 = 5
            java.lang.Object r6 = r2.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x019c
            java.lang.String r6 = (java.lang.String) r6
        L_0x011e:
            android.util.SparseArray r2 = r0.A00
            r1 = 6
            java.lang.Object r5 = r2.get(r1)
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L_0x01a2
            java.lang.String r5 = (java.lang.String) r5
        L_0x012b:
            android.util.SparseArray r2 = r0.A00
            r1 = 7
            java.lang.Object r4 = r2.get(r1)
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L_0x01a7
            java.lang.String r4 = (java.lang.String) r4
        L_0x0138:
            android.util.SparseArray r2 = r0.A00
            r1 = 8
            java.lang.Object r3 = r2.get(r1)
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L_0x01ac
            java.lang.String r3 = (java.lang.String) r3
        L_0x0146:
            android.util.SparseArray r2 = r0.A00
            r1 = 9
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x01b1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0154:
            android.util.SparseArray r7 = r0.A00
            r1 = 21
            java.lang.Object r1 = r7.get(r1)
            boolean r7 = r1 instanceof java.lang.String
            if (r7 == 0) goto L_0x01b6
            java.lang.String r1 = (java.lang.String) r1
        L_0x0162:
            X.2Fj r7 = r0.A0A
            X.SUj r7 = X.Pxe.A0W(r7)
            if (r7 == 0) goto L_0x0181
            java.lang.Object r7 = r7.A01
            com.google.common.collect.ImmutableList r7 = (com.google.common.collect.ImmutableList) r7
        L_0x016e:
            boolean r14 = r0.A07
            boolean r44 = r12.A09()
            X.AnonymousClass2E0.A0D()
            X.REC r17 = X.REC.NONE
            com.facebookpay.logging.LoggingContext r12 = r0.A03
            if (r12 != 0) goto L_0x01b9
            java.lang.String r0 = "loggingContext"
            goto L_0x0015
        L_0x0181:
            r7 = r21
            goto L_0x016e
        L_0x0184:
            r11 = r21
            if (r51 == 0) goto L_0x018a
            goto L_0x00e8
        L_0x018a:
            r10 = r21
            if (r51 == 0) goto L_0x0190
            goto L_0x00f6
        L_0x0190:
            r9 = r21
            if (r51 == 0) goto L_0x0196
            goto L_0x0104
        L_0x0196:
            r8 = r21
            if (r51 == 0) goto L_0x019c
            goto L_0x0111
        L_0x019c:
            r6 = r21
            if (r51 == 0) goto L_0x01a2
            goto L_0x011e
        L_0x01a2:
            r5 = r21
            if (r51 == 0) goto L_0x01a7
            goto L_0x012b
        L_0x01a7:
            r4 = r21
            if (r51 == 0) goto L_0x01ac
            goto L_0x0138
        L_0x01ac:
            r3 = r21
            if (r51 == 0) goto L_0x01b1
            goto L_0x0146
        L_0x01b1:
            r2 = r21
            if (r51 == 0) goto L_0x01b6
            goto L_0x0154
        L_0x01b6:
            r1 = r21
            goto L_0x0162
        L_0x01b9:
            r39 = r21
            if (r47 == 0) goto L_0x01bf
            r39 = r13
        L_0x01bf:
            boolean r48 = r0.A0B()
            boolean r13 = r0.A0B()
            r42 = 0
            if (r13 == 0) goto L_0x01ce
            r42 = 2131961194(0x7f13256a, float:1.9559078E38)
        L_0x01ce:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A02
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "ecpPaymentRequest"
            goto L_0x0015
        L_0x01d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01db:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0216
            java.lang.Boolean r0 = r0.A08
            boolean r51 = X.AnonymousClass7TF.A1Y(r0, r15)
        L_0x01e5:
            r45 = 0
            r23 = r21
            r24 = r21
            r26 = r21
            r27 = r10
            r28 = r9
            r29 = r8
            r30 = r6
            r31 = r5
            r32 = r4
            r33 = r3
            r34 = r2
            r35 = r21
            r36 = r21
            r37 = r1
            r38 = r21
            r43 = r14
            r46 = r45
            r50 = r49
            r20 = r12
            r22 = r7
            r25 = r11
            com.facebookpay.form.fragment.model.FormParams r0 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            return r0
        L_0x0216:
            r51 = 0
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDT.A00(X.QDT, boolean):com.facebookpay.form.fragment.model.FormParams");
    }

    private final void A07(C21267XRm xRm, String str) {
        Map map;
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        SEB A032 = this.A0G.A03();
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        A0n.put("TARGET_NAME", str);
        A0n.put("CREDENTIAL_TYPE", xRm);
        Object obj = A0n.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
            map = AnonymousClass7TE.A1H();
        }
        SUU.A0A(A032, map);
        A0n.put("extra_data", map);
        ImmutableMap copyOf = ImmutableMap.copyOf(A0n);
        0qQ.A07(copyOf);
        A002.Cgl("user_add_credential_enter", copyOf);
    }

    private final void A0A(List list, List list2, List list3) {
        if (list3.isEmpty()) {
            list.addAll(list2);
            return;
        }
        Integer num = AnonymousClass05K.A00;
        RH6 rh6 = RH6.A0p;
        list.add(SUj.A09(new SelectionHeaderItem(rh6, 2131961190, num, (String) null, (String) null)));
        list.addAll(list2);
        list.add(SUj.A09(new SelectionHeaderItem(rh6, 2131961421, num, (String) null, (String) null)));
        list.addAll(list3);
    }
}
