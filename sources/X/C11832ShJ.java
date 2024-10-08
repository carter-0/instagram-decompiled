package X;

import com.android.billingclient.api.Purchase;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShJ  reason: case insensitive filesystem */
public final class C11832ShJ implements C13523Tbs {
    public final /* synthetic */ Purchase A00;
    public final /* synthetic */ InAppPurchaseControllerCoro A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;

    public C11832ShJ(Purchase purchase, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str, String str2, String str3, Map map) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = inAppPurchaseControllerCoro;
        this.A05 = str3;
        this.A00 = purchase;
        this.A02 = num;
        this.A06 = map;
    }

    public final void DZr(C11230SGo sGo, List list) {
        RRR qyi;
        AnonymousClass7TG.A1Z(sGo, list);
        if (sGo.A00 != 0 || !AnonymousClass7TE.A1b(list)) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
            inAppPurchaseControllerCoro.A06.A05(sGo, this.A06);
            C13713Tfb tfb = inAppPurchaseControllerCoro.A01;
            if (tfb != null) {
                tfb.Db0(C8918RFl.USER_PAYMENT_FAILED);
                return;
            }
            return;
        }
        S74 s74 = (S74) 00k.A0I(list);
        0qQ.A0A(s74);
        String str = this.A03;
        0qQ.A0B(s74, 0);
        if (0qQ.A0K(s74.A01, "inapp")) {
            qyi = new QYG(s74, str);
        } else {
            qyi = new QYI(s74, str);
        }
        String A062 = qyi.A06(this.A04);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A01;
        InAppPurchaseControllerCoro.A0D(inAppPurchaseControllerCoro2, qyi);
        InAppPurchaseControllerCoro.A05(Pxg.A0K(inAppPurchaseControllerCoro2.A03), this.A00, inAppPurchaseControllerCoro2, qyi, this.A02, this.A05, A062);
    }
}
