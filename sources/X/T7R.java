package X;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class T7R implements AnonymousClass0lh {
    public final InAppPurchaseControllerCoro A00;

    public final 1aU A00(Context context, C61046Jvk jvk) {
        0qQ.A0B(context, 0);
        return 1aU.A06(new C72168Oxd(10, context, this, jvk));
    }

    public final void A02(Activity activity, C7610QOs qOs, C13713Tfb tfb, C10300Rpy rpy) {
        C7610QOs qOs2 = qOs;
        AnonymousClass7TG.A1N(activity, qOs);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        inAppPurchaseControllerCoro.A03 = C51965G9l.A0v(activity);
        inAppPurchaseControllerCoro.A00 = qOs;
        inAppPurchaseControllerCoro.A01 = tfb;
        inAppPurchaseControllerCoro.A02 = rpy;
        SPQ spq = inAppPurchaseControllerCoro.A06;
        String str = qOs.A02;
        String A002 = inAppPurchaseControllerCoro.A0B.A00();
        String str2 = qOs.A07;
        0sm r0 = qOs.A09;
        if (r0 == null) {
            r0 = 0Yt.A0E();
        }
        AnonymousClass7TF.A1H(str, A002);
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0);
        Pxe.A1U(RH0.A0U, str, linkedHashMap);
        Pxe.A1U(RH0.A0n, A002, linkedHashMap);
        if (str2 != null) {
            Pxe.A1U(RH0.A0k, str2, linkedHashMap);
        }
        linkedHashMap.put(RH0.A0c.A00, String.valueOf(false));
        inAppPurchaseControllerCoro.A05 = linkedHashMap;
        spq.A00.Cgp(linkedHashMap, (Map) null, "client_execute_dcpiap_init");
        boolean A003 = RWE.A00(qOs.A02);
        Map map = inAppPurchaseControllerCoro.A05;
        if (A003) {
            inAppPurchaseControllerCoro.A0I(qOs, map);
            return;
        }
        1Eo.A05(new InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, inAppPurchaseControllerCoro, tfb), new MHP((Object) inAppPurchaseControllerCoro, (Object) qOs2, (Object) map, (AnonymousClass4D7) null, 42), inAppPurchaseControllerCoro.A0E);
    }

    public final void A01() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        InAppPurchaseControllerCoro.A0C(inAppPurchaseControllerCoro);
        C13851TiU tiU = inAppPurchaseControllerCoro.A0B.A02;
        if (tiU != null) {
            tiU.ASK();
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.SGo] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.SGo] */
    public final void A03(C13560TcZ tcZ, String str, List list, List list2) {
        List list3;
        List list4;
        SPQ spq;
        String A002;
        String str2;
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        if (list == null) {
            list3 = 0sn.A00;
        } else {
            list3 = list;
        }
        if (list2 == null) {
            list4 = 0sn.A00;
        } else {
            list4 = list2;
        }
        ArrayList A0S = 00k.A0S(list4, list3);
        C11266SId sId = inAppPurchaseControllerCoro.A0B;
        if (!sId.A01()) {
            spq = inAppPurchaseControllerCoro.A06;
            A002 = sId.A00();
            str2 = "IAP is not enabled";
        } else if (sId.A04) {
            LinkedHashMap A003 = S95.A00(list, list2);
            LinkedHashMap A0o = C51975G9x.A0o(A003);
            Iterator A0s = AnonymousClass7TF.A0s(A003);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                Object key = A1J.getKey();
                SkuDetails skuDetails = (SkuDetails) A1J.getValue();
                String A13 = DbT.A13(A1J);
                AnonymousClass7TG.A1N(skuDetails, A13);
                A0o.put(key, new QYH(skuDetails, A13));
            }
            ? obj = new Object();
            obj.A00 = 0;
            obj.A01 = "";
            tcZ.Df6(obj, (C8918RFl) null, A0o);
            return;
        } else {
            spq = inAppPurchaseControllerCoro.A06;
            spq.A08(A0S, sId.A00());
            if (A0S.isEmpty()) {
                A002 = sId.A00();
                str2 = "No skus to query";
            } else {
                S1B s1b = inAppPurchaseControllerCoro.A07;
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    RRR A004 = s1b.A00(A18);
                    if (A004 != null) {
                        AnonymousClass7TF.A1I(A18, A004, A1C);
                    }
                }
                0sm A08 = 0Yt.A08(A1C);
                if (A0S.size() != A08.size()) {
                    A08 = 0Yt.A0E();
                }
                if (!A08.isEmpty()) {
                    ? obj2 = new Object();
                    obj2.A00 = 0;
                    obj2.A01 = "";
                    tcZ.Df6(obj2, (C8918RFl) null, A08);
                    A002 = sId.A00();
                    str2 = "Skus already in cache";
                } else if (0qQ.A0K(str, "TIER_ID")) {
                    SHQ shq = inAppPurchaseControllerCoro.A0D;
                    C45369CvB cvB = new C45369CvB(tcZ, inAppPurchaseControllerCoro, list, list2);
                    C10319RqH rqH = shq.A00;
                    2IS A04 = C41845B3m.A04();
                    2IV A0R = Pxe.A0R();
                    A0R.A05("product_ids", A0S);
                    A0R.A09("GOOGLE", "platform");
                    A0R.A09("ALL_PRODUCTS", "product_type");
                    A04.A00(A0R, "input");
                    C239113Fa r4 = new C239113Fa(A04, C7593QNj.class, "IGQueryDCPProduct", false);
                    C363088j4.A00(rqH.A00).ATL(new C45917DEx(cvB, 5), new C45926DFg(cvB, 21), r4);
                    return;
                } else {
                    InAppPurchaseControllerCoro.A0A(tcZ, inAppPurchaseControllerCoro, list, list2, (Map) null);
                    return;
                }
            }
        }
        spq.A07(A002, str2, A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r12.isEmpty() != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r11.isEmpty() != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (r19 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r11.size() != r2.size()) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        r2 = X.0Yt.A04(r7, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    @kotlin.Deprecated(message = "Use queryDcpProductDetailsAsync instead. querySkuDetailsAsync is deprecated by Google since PBL v5.0. We now use queryDcpProductDetailsAsync to query product details from Google. We will remove this method in H2 2024.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C13562Tcb r17, java.util.List r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r14 = r0.A00
            r6 = 0
            r12 = r18
            if (r18 != 0) goto L_0x006b
            X.0sn r1 = X.0sn.A00
        L_0x000b:
            r11 = r19
            if (r19 != 0) goto L_0x0069
            X.0sn r0 = X.0sn.A00
        L_0x0011:
            java.util.ArrayList r5 = X.00k.A0S(r0, r1)
            X.SId r4 = r14.A0B
            boolean r0 = r4.A01()
            if (r0 != 0) goto L_0x0029
            X.SPQ r3 = r14.A06
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = "IAP is not enabled"
        L_0x0025:
            r3.A07(r1, r0, r5)
            return
        L_0x0029:
            boolean r0 = r4.A04
            r15 = r17
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = ""
            X.SGo r1 = X.C11230SGo.A00(r0, r6)
            java.util.LinkedHashMap r0 = X.S95.A00(r12, r11)
            r15.Df7(r1, r0)
            return
        L_0x003d:
            X.SPQ r3 = r14.A06
            java.lang.String r0 = r4.A00()
            r3.A08(r5, r0)
            if (r18 == 0) goto L_0x004f
            boolean r1 = r12.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r10 = r0 ^ 1
            if (r19 == 0) goto L_0x005b
            boolean r1 = r11.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            r9 = r0 ^ 1
            if (r10 != 0) goto L_0x006d
            if (r9 != 0) goto L_0x006d
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = "No skus to query"
            goto L_0x0025
        L_0x0069:
            r0 = r11
            goto L_0x0011
        L_0x006b:
            r1 = r12
            goto L_0x000b
        L_0x006d:
            X.S1C r8 = r14.A08
            if (r18 == 0) goto L_0x008d
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = r12.iterator()
        L_0x0079:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            com.android.billingclient.api.SkuDetails r0 = r8.A00(r1)
            if (r0 == 0) goto L_0x008d
            r7.put(r1, r0)
            goto L_0x0079
        L_0x008d:
            X.0sm r7 = X.0Yt.A0E()
        L_0x0091:
            if (r18 == 0) goto L_0x00bc
            int r1 = r12.size()
            int r0 = r7.size()
            if (r1 == r0) goto L_0x00bc
        L_0x009d:
            X.0sm r2 = X.0Yt.A0E()
        L_0x00a1:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = "Skus already in cache"
            r3.A07(r1, r0, r5)
            java.lang.String r0 = ""
            X.SGo r0 = X.C11230SGo.A00(r0, r6)
            r15.Df7(r0, r2)
            return
        L_0x00bc:
            if (r19 == 0) goto L_0x00da
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r13 = r11.iterator()
        L_0x00c6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.String r1 = X.AnonymousClass7TE.A18(r13)
            com.android.billingclient.api.SkuDetails r0 = r8.A00(r1)
            if (r0 == 0) goto L_0x00da
            r2.put(r1, r0)
            goto L_0x00c6
        L_0x00da:
            X.0sm r2 = X.0Yt.A0E()
            if (r19 == 0) goto L_0x00eb
        L_0x00e0:
            int r1 = r11.size()
            int r0 = r2.size()
            if (r1 == r0) goto L_0x00eb
            goto L_0x009d
        L_0x00eb:
            java.util.LinkedHashMap r2 = X.0Yt.A04(r7, r2)
            goto L_0x00a1
        L_0x00f0:
            X.0eP r1 = X.S95.A01(r12, r11, r10, r9)
            java.lang.Object r0 = r1.A00
            X.Rqv r0 = (X.C10358Rqv) r0
            java.lang.Object r12 = r1.A01
            X.TiU r13 = r4.A02
            if (r13 == 0) goto L_0x0107
            r11 = 1
            X.ShQ r10 = new X.ShQ
            r10.<init>(r11, r12, r13, r14, r15)
            r13.E5s(r0, r10, r6)
        L_0x0107:
            java.lang.String r0 = r4.A00()
            r3.A09(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7R.A04(X.Tcb, java.util.List, java.util.List):void");
    }

    public final void onSessionWillEnd() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        InAppPurchaseControllerCoro.A0C(inAppPurchaseControllerCoro);
        C13851TiU tiU = inAppPurchaseControllerCoro.A0B.A02;
        if (tiU != null) {
            tiU.ASK();
        }
    }

    public T7R(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        this.A00 = inAppPurchaseControllerCoro;
    }
}
