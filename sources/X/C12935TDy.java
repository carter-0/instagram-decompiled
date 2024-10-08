package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TDy  reason: case insensitive filesystem */
public final class C12935TDy implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public C12935TDy(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    public final void run() {
        FragmentActivity A01 = SQI.A01(this.A00);
        if (A01 != null) {
            A01.onBackPressed();
        }
    }
}
