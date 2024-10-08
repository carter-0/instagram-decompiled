package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Woy  reason: case insensitive filesystem */
public final class C20309Woy implements Runnable {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ VWP A02;

    public C20309Woy(1Xj r1, C255783ui r2, VWP vwp) {
        this.A02 = vwp;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        VWP vwp = this.A02;
        ImageView imageView = vwp.A02;
        if (imageView != null) {
            C255783ui r3 = this.A01;
            View view = vwp.A01;
            if (view != null) {
                C306406Ma.A04(imageView, r3, this.A00.A0l(), view.getWidth(), view.getHeight(), true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
