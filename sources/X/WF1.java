package X;

import android.content.Context;
import android.view.ViewManager;
import java.lang.ref.WeakReference;

public final class WF1 implements X25 {
    public final /* synthetic */ C14720U4e A00;
    public final /* synthetic */ C17709Vce A01;

    public WF1(C14720U4e u4e, C17709Vce vce) {
        this.A01 = vce;
        this.A00 = u4e;
    }

    public final void D9H() {
        C17709Vce vce = this.A01;
        Context context = vce.A07.A00;
        C14720U4e u4e = this.A00;
        WeakReference weakReference = C18287VpA.A00;
        u4e.setVisibility(8);
        try {
            ViewManager viewManager = (ViewManager) context.getSystemService("window");
            if (viewManager != null) {
                viewManager.removeView(u4e);
                WeakReference weakReference2 = C18287VpA.A00;
                if (weakReference2.get() == u4e) {
                    weakReference2.clear();
                }
                vce.A05.D9H();
                return;
            }
            throw new IllegalStateException("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }
}
