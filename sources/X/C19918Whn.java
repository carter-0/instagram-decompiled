package X;

import android.widget.FrameLayout;

/* renamed from: X.Whn  reason: case insensitive filesystem */
public final class C19918Whn implements Runnable {
    public final /* synthetic */ C14577Tyh A00;

    public C19918Whn(C14577Tyh tyh) {
        this.A00 = tyh;
    }

    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            C13989Tnp.A17(frameLayout);
            frameLayout.removeAllViews();
        }
    }
}
