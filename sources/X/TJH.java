package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

public final class TJH implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;

    public TJH(IgReactNavigatorModule igReactNavigatorModule, String str, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
        this.A02 = str;
    }

    public final void run() {
        FragmentActivity A012 = SQI.A01(this.A01);
        if (A012 != null && SQI.A03(A012, (int) this.A00)) {
            2dZ.A0t.A03(A012).setTitle(this.A02);
        }
    }
}
