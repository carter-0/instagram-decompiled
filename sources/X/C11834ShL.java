package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ShL  reason: case insensitive filesystem */
public final class C11834ShL implements C13525Tbu {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ AnonymousClass4D7 A01;

    public C11834ShL(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, AnonymousClass4D7 r2) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = r2;
    }

    public final void Db6(C11230SGo sGo, 0sn r6) {
        AnonymousClass4D7 r1;
        AnonymousClass7TG.A1N(sGo, r6);
        int i = sGo.A00;
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        if (i == 0) {
            inAppPurchaseControllerCoro.A04 = r6;
            inAppPurchaseControllerCoro.A06.A00.Cgp(SPQ.A00(sGo, r6), (Map) null, "client_load_iap_store_purchases_success");
            r1 = this.A01;
        } else {
            C13888TjB tjB = inAppPurchaseControllerCoro.A06.A00;
            String str = sGo.A01;
            0qQ.A07(str);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            SKS.A01(str, A1H);
            SKS.A00(sGo, A1H);
            tjB.Cgp(A1H, (Map) null, "client_load_iap_store_purchases_fail");
            r1 = this.A01;
            r6 = 0sn.A00;
        }
        r1.resumeWith(AnonymousClass7TE.A1L(sGo, r6));
    }
}
