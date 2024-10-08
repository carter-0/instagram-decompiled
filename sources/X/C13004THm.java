package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.THm  reason: case insensitive filesystem */
public final class C13004THm implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;
    public final /* synthetic */ String A01;

    public C13004THm(IgReactNavigatorModule igReactNavigatorModule, String str) {
        this.A00 = igReactNavigatorModule;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass34S A002;
        IgReactNavigatorModule igReactNavigatorModule = this.A00;
        Activity A003 = Pxe.A0T(igReactNavigatorModule).A00();
        if (A003 != null) {
            String str = this.A01;
            if (!FGU.A03(A003, igReactNavigatorModule.mSession, str, "Navigation")) {
                AnonymousClass14E r2 = 14D.A04;
                if (r2.A00().A00(igReactNavigatorModule.mSession, str) != null) {
                    FragmentActivity A004 = SQI.A00(A003);
                    if (A004 != null && (A002 = r2.A00().A00(igReactNavigatorModule.mSession, str)) != null) {
                        ((C51920G7o) A002.A00).CI1((Bundle) A002.A01, A004, igReactNavigatorModule.mSession);
                        return;
                    }
                    return;
                }
                SUL sul = new SUL(A003, igReactNavigatorModule.mSession, 2EG.A36, str);
                sul.A0S = "Navigation";
                sul.A0A();
            }
        }
    }
}
