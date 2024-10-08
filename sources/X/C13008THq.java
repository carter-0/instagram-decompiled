package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.THq  reason: case insensitive filesystem */
public final class C13008THq implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;

    public C13008THq(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A01 = str;
    }

    public final void run() {
        Activity A002 = Pxe.A0T(this.A00).A00();
        A002.getClass();
        AnonymousClass4DH A02 = SQI.A02(A002);
        A02.getClass();
        String str = this.A01;
        Intent A0A = C66580MXl.A0A(A002, IGShopPayCustomTabsActivity.class);
        A0A.putExtra("extra_url", str);
        0kR.A05(A02, A0A, 1);
    }
}
