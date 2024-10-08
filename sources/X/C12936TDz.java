package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TDz  reason: case insensitive filesystem */
public final class C12936TDz implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public C12936TDz(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    public final void run() {
        FragmentActivity A01 = SQI.A01(this.A00);
        if (A01 != null) {
            A01.finish();
        }
    }
}
