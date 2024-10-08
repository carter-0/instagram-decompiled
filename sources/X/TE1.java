package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class TE1 implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;

    public TE1(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
    }

    public final void run() {
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = this.A00;
        AnonymousClass37D A0i = DbT.A0i(Pxe.A0T(igReactPurchaseExperienceBridgeModule).A00());
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            FragmentActivity A01 = SQI.A01(igReactPurchaseExperienceBridgeModule);
            if (A01 != null) {
                A01.finish();
                return;
            }
            return;
        }
        A0i.A09().A02.A08();
    }
}
