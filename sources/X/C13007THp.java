package X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;

/* renamed from: X.THp  reason: case insensitive filesystem */
public final class C13007THp implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ IgReactCountryCodeRoute A01;

    public C13007THp(Callback callback, IgReactCountryCodeRoute igReactCountryCodeRoute) {
        this.A01 = igReactCountryCodeRoute;
        this.A00 = callback;
    }

    public final void run() {
        0SM r3 = new 0SM();
        Bundle A0a = AnonymousClass7TE.A0a();
        IgReactCountryCodeRoute igReactCountryCodeRoute = this.A01;
        AnonymousClass0Dg.A00(A0a, igReactCountryCodeRoute.mSession);
        r3.setArguments(A0a);
        r3.A01 = new T86(this.A00);
        AnonymousClass4DH A02 = SQI.A02(Pxe.A0T(igReactCountryCodeRoute).A00());
        if (A02 != null && (A02 instanceof R8S)) {
            r3.A0B(A02.mFragmentManager, (String) null);
        }
    }
}
