package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.Woa  reason: case insensitive filesystem */
public final class C20285Woa implements Runnable {
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public C20285Woa(View view, SwipeDismissBehavior swipeDismissBehavior, boolean z) {
        this.A02 = swipeDismissBehavior;
        this.A00 = view;
        this.A01 = z;
    }

    public final void run() {
        X32 x32;
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        W3p w3p = swipeDismissBehavior.A03;
        if (w3p != null && w3p.A0I()) {
            this.A00.postOnAnimation(this);
        } else if (this.A01 && (x32 = swipeDismissBehavior.A04) != null) {
            x32.D9F(this.A00);
        }
    }
}
