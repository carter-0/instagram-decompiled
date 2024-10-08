package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.THo  reason: case insensitive filesystem */
public final class C13006THo implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;

    public C13006THo(IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
    }

    public final void run() {
        IgReactNavigatorModule igReactNavigatorModule = this.A01;
        FragmentActivity A012 = SQI.A01(igReactNavigatorModule);
        if (A012 != null && igReactNavigatorModule.mIsHostResumed) {
            A012.getSupportFragmentManager().A19(Integer.toString((int) this.A00), 1);
        }
    }
}
