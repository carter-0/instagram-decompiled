package X;

import android.app.Activity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.THn  reason: case insensitive filesystem */
public final class C13005THn implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;
    public final /* synthetic */ String A01;

    public C13005THn(IgReactNavigatorModule igReactNavigatorModule, String str) {
        this.A00 = igReactNavigatorModule;
        this.A01 = str;
    }

    public final void run() {
        IgReactNavigatorModule igReactNavigatorModule = this.A00;
        Activity A002 = Pxe.A0T(igReactNavigatorModule).A00();
        if (A002 != null) {
            SUL sul = new SUL(A002, igReactNavigatorModule.mSession, 2EG.A36, this.A01);
            sul.A0S = "Navigation";
            sul.A0A();
        }
    }
}
