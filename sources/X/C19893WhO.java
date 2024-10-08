package X;

import android.view.View;

/* renamed from: X.WhO  reason: case insensitive filesystem */
public final class C19893WhO implements Runnable {
    public final /* synthetic */ WDV A00;

    public C19893WhO(WDV wdv) {
        this.A00 = wdv;
    }

    public final void run() {
        WDV wdv = this.A00;
        View view = wdv.A06;
        if (view != null && view.getWindowToken() != null) {
            wdv.show();
        }
    }
}
