package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent;
import com.facebookpay.logging.LoggingContext;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

public final class QDR extends 2YL implements C13844TiK {
    public LoggingContext A00;
    public Integer A01;
    public Integer A02;
    public final AnonymousClass2gB A03;
    public final AnonymousClass2Fj A04;
    public final AnonymousClass2Fj A05 = new 2Fk(SUj.A09(0sn.A00));
    public final AnonymousClass2Fj A06;
    public final AnonymousClass2Fj A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2gO A0A;
    public final QDH A0B;
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass2gO A0D;
    public final AnonymousClass2gO A0E;

    public final void AR6(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
    }

    public final void D5K(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
    }

    public final void EIE() {
    }

    public final void EzK() {
    }

    public final void FKb(SparseArray sparseArray) {
    }

    public static final String A00(QDR qdr) {
        C10575RuU ruU;
        FulfillmentOptionComponent fulfillmentOptionComponent;
        SUj A0W = Pxe.A0W(qdr.A03);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (fulfillmentOptionComponent = (FulfillmentOptionComponent) ruU.A01) == null) {
            return null;
        }
        return fulfillmentOptionComponent.A02();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.lang.Object, com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r17v1, types: [com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem] */
    /* JADX WARNING: type inference failed for: r18v2, types: [com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.QDR r28, java.util.List r29) {
        /*
            r1 = r28
            if (r29 != 0) goto L_0x0065
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0010
            boolean r0 = X.C11431STx.A02()
            if (r0 != 0) goto L_0x0065
        L_0x0010:
            X.2Fj r8 = r1.A05
            X.SUj r0 = X.Pxe.A0W(r8)
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005f
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0026:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r5 = r6.next()
            X.SUj r5 = (X.SUj) r5
            java.lang.Object r4 = r5.A01
            if (r4 == 0) goto L_0x0052
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r4 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            boolean r0 = r4 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem
            if (r0 == 0) goto L_0x004a
            r2 = r4
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r2 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r2
            java.lang.String r0 = A00(r1)
            X.C9621Rdz.A00(r2, r0, r3)
        L_0x004a:
            X.SUj r0 = X.SUj.A06(r5, r4)
            r7.add(r0)
            goto L_0x0026
        L_0x0052:
            r4 = 0
            goto L_0x004a
        L_0x0054:
            java.lang.Object r0 = r8.A02()
            if (r0 == 0) goto L_0x0060
            X.SUj r0 = (X.SUj) r0
            X.SUj.A0I(r8, r0, r7)
        L_0x005f:
            return
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0065:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r2 != r3) goto L_0x0121
            r2 = 0
            r4 = 2131961250(0x7f1325a2, float:1.9559192E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
        L_0x0079:
            X.RH6 r5 = X.RH6.A0p
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r4 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r8 = r2
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0082:
            X.SUj.A0O(r4, r0)
            r6 = 0
            if (r29 == 0) goto L_0x014a
            java.util.Iterator r16 = r29.iterator()
        L_0x008c:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x014a
            java.lang.Object r7 = r16.next()
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r7 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r7
            X.0qQ.A0B(r7, r6)
            X.RH6 r20 = X.RH6.A06
            boolean r4 = r7 instanceof com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent
            if (r4 == 0) goto L_0x00cf
            com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent r7 = (com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent) r7
            java.lang.String r11 = r7.A02
            java.lang.String r10 = r7.A03
            com.facebookpay.common.models.CurrencyAmount r9 = r7.A00
            java.lang.String r8 = r7.A01
            java.util.Date r5 = r7.A05
            java.util.Date r4 = r7.A04
            java.lang.Integer r21 = X.AnonymousClass05K.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem r7 = new com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem
            r18 = r7
            r19 = r9
            r22 = r11
            r23 = r10
            r24 = r8
            r25 = r5
            r26 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00c4:
            java.lang.String r4 = A00(r1)
            X.C9621Rdz.A00(r7, r4, r6)
            X.SUj.A0O(r7, r0)
            goto L_0x008c
        L_0x00cf:
            boolean r4 = r7 instanceof com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent
            if (r4 == 0) goto L_0x0107
            com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent r7 = (com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent) r7
            java.lang.String r15 = r7.A05
            java.lang.String r14 = r7.A06
            com.facebookpay.common.models.CurrencyAmount r12 = r7.A00
            java.lang.String r11 = r7.A04
            java.util.Date r10 = r7.A08
            java.util.Date r9 = r7.A07
            com.facebookpay.shippingaddress.model.ShippingAddress r8 = r7.A02
            java.lang.Boolean r5 = r7.A03
            com.facebookpay.common.models.Distance r4 = r7.A01
            boolean r13 = r7.A09
            java.lang.Integer r23 = X.AnonymousClass05K.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem r7 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem
            r27 = r10
            r28 = r9
            r29 = r13
            r21 = r8
            r22 = r5
            r24 = r15
            r25 = r14
            r26 = r11
            r19 = r4
            r18 = r12
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00c4
        L_0x0107:
            java.lang.String r11 = r7.A02()
            java.lang.String r12 = r7.A03()
            com.facebookpay.common.models.CurrencyAmount r8 = r7.A00()
            java.lang.String r13 = r7.A01()
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r7 = new com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem
            r9 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00c4
        L_0x0121:
            if (r2 != 0) goto L_0x013e
            java.lang.Integer r2 = r1.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            if (r2 != r5) goto L_0x013e
            r2 = 0
            r4 = 2131961252(0x7f1325a4, float:1.9559196E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            X.RH6 r7 = X.RH6.A0p
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r4 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r6 = r4
            r9 = r5
            r10 = r2
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0082
        L_0x013e:
            r2 = 0
            r4 = 2131961236(0x7f132594, float:1.9559163E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x0079
        L_0x014a:
            java.lang.Integer r4 = r1.A01
            if (r4 != r3) goto L_0x019a
            X.2Fj r5 = r1.A06
            java.lang.Object r4 = r5.A02()
            r3 = r4
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x017d
            boolean r3 = X.00l.A0W(r3)
            if (r3 != 0) goto L_0x017d
            boolean r3 = X.C11431STx.A02()
            if (r3 == 0) goto L_0x017d
            if (r4 == 0) goto L_0x017d
            java.lang.String r4 = "Showing all stores near "
            java.lang.Object r3 = r5.A02()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = X.002.A0R(r4, r3)
            X.RH6 r4 = X.RH6.A0u
            com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem r3 = new com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem
            r3.<init>(r4, r2, r5, r6)
            X.SUj.A0O(r3, r0)
        L_0x017d:
            X.TXB r4 = X.TXB.A00
            X.TXC r3 = X.TXC.A00
            X.TXD r2 = X.TXD.A00
            X.0sP[] r3 = new X.0sP[]{r4, r3, r2}
            X.TLm r2 = new X.TLm
            r2.<init>(r3)
            java.util.List r2 = X.00k.A0g(r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>"
            X.0qQ.A0C(r2, r0)
            java.util.List r0 = X.0u4.A01(r2)
        L_0x019a:
            X.2Fj r1 = r1.A05
            X.SUj.A0K(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDR.A01(X.QDR, java.util.List):void");
    }

    public final boolean A02() {
        int i;
        SUj A0W;
        List list;
        C8882RDz rDz;
        AnonymousClass2Fj r1 = this.A04;
        SUj A0W2 = Pxe.A0W(r1);
        if (A0W2 == null || (rDz = A0W2.A00) == null) {
            i = -1;
        } else {
            i = rDz.ordinal();
        }
        if (i != 0 || (A0W = Pxe.A0W(r1)) == null || (list = (List) A0W.A01) == null || list.isEmpty() || list.size() != 1) {
            return false;
        }
        return true;
    }

    public final void AGm(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        LoggingContext loggingContext;
        String id;
        LinkedHashMap A082;
        String str;
        1Ln A0U;
        int i;
        Object obj;
        Object fulfillmentOptionComponent;
        C10575RuU ruU;
        Fragment fragment2 = fragment;
        0qQ.A0B(contextThemeWrapper, 2);
        Object obj2 = sUj.A01;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem");
        SelectionFulfillmentOptionItem selectionFulfillmentOptionItem = (SelectionFulfillmentOptionItem) obj2;
        boolean z = selectionFulfillmentOptionItem instanceof SelectionShippingFulfillmentOptionItem;
        if (z || (selectionFulfillmentOptionItem instanceof SelectionPickupFulfillmentOptionItem)) {
            C12411Sto A0g = C51965G9l.A0g();
            loggingContext = this.A00;
            if (loggingContext != null) {
                id = selectionFulfillmentOptionItem.getId();
                A082 = SUU.A08(this.A0B);
                str = "select_existing_fulfillment_option";
                A0U = C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_fulfillmentoption_atomic"), 402);
                i = 3;
            }
            0qQ.A0F("loggingContext");
            throw AnonymousClass00P.createAndThrow();
        }
        C12411Sto A0g2 = C51965G9l.A0g();
        loggingContext = this.A00;
        if (loggingContext != null) {
            id = selectionFulfillmentOptionItem.getId();
            A082 = SUU.A08(this.A0B);
            str = "select_existing_shipping_option";
            A0U = C51965G9l.A0U(C51969G9p.A0d(A0g2.A00, "user_click_shippingoption_atomic"), 406);
            i = 4;
        }
        0qQ.A0F("loggingContext");
        throw AnonymousClass00P.createAndThrow();
        C12411Sto.A03(A0U, loggingContext, new C74192PqY((Object) loggingContext, (Object) A082, id, str, i));
        SUj A0W = Pxe.A0W(this.A03);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            obj = null;
        } else {
            obj = ruU.A01;
        }
        if (!selectionFulfillmentOptionItem.equals(obj)) {
            AnonymousClass2Fj r1 = this.A07;
            if (z) {
                SelectionShippingFulfillmentOptionItem selectionShippingFulfillmentOptionItem = (SelectionShippingFulfillmentOptionItem) selectionFulfillmentOptionItem;
                fulfillmentOptionComponent = new ShippingFulfillmentOptionComponent(selectionShippingFulfillmentOptionItem.A01, selectionShippingFulfillmentOptionItem.A04, selectionShippingFulfillmentOptionItem.A05, selectionShippingFulfillmentOptionItem.A03, selectionShippingFulfillmentOptionItem.A07, selectionShippingFulfillmentOptionItem.A06);
            } else if (selectionFulfillmentOptionItem instanceof SelectionPickupFulfillmentOptionItem) {
                SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) selectionFulfillmentOptionItem;
                String str2 = selectionPickupFulfillmentOptionItem.A07;
                String str3 = selectionPickupFulfillmentOptionItem.A08;
                CurrencyAmount currencyAmount = selectionPickupFulfillmentOptionItem.A01;
                String str4 = selectionPickupFulfillmentOptionItem.A06;
                Date date = selectionPickupFulfillmentOptionItem.A0A;
                Date date2 = selectionPickupFulfillmentOptionItem.A09;
                Boolean bool = selectionPickupFulfillmentOptionItem.A05;
                fulfillmentOptionComponent = new PickupFulfillmentOptionComponent(currencyAmount, selectionPickupFulfillmentOptionItem.A02, selectionPickupFulfillmentOptionItem.A04, bool, str2, str3, str4, date, date2, selectionPickupFulfillmentOptionItem.A0B);
            } else {
                fulfillmentOptionComponent = new FulfillmentOptionComponent(selectionFulfillmentOptionItem.A00(), id, selectionFulfillmentOptionItem.A02(), selectionFulfillmentOptionItem.A01());
            }
            SUj.A0J(r1, AnonymousClass05K.A01, fulfillmentOptionComponent, (String) null);
        }
        ((C13894TjH) fragment2).D68();
    }

    public final AnonymousClass2Fj AuQ() {
        return this.A0C;
    }

    public final 2Fk ELG() {
        AnonymousClass2Fj r1 = this.A05;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
        return r1;
    }

    public final /* synthetic */ boolean Ern() {
        return true;
    }

    public QDR(QDH qdh) {
        this.A0B = qdh;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A08 = A0K;
        this.A02 = AnonymousClass05K.A00;
        this.A06 = JTO.A0K();
        this.A09 = JTO.A0K();
        this.A04 = JTO.A0K();
        AnonymousClass2Fj A002 = SUj.A00((Object) null);
        this.A07 = A002;
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A03 = A0M;
        this.A0C = new 2Fk(REO.ALWAYS_SELECT);
        C11647Sdp A003 = C11647Sdp.A00(this, 3);
        this.A0D = A003;
        C11647Sdp A004 = C11647Sdp.A00(this, 5);
        this.A0E = A004;
        this.A0A = C11647Sdp.A00(this, 4);
        A0M.A0E(A0K, A003);
        A0M.A0E(A002, A004);
    }
}
