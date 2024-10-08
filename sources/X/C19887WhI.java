package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.WhI  reason: case insensitive filesystem */
public final class C19887WhI implements Runnable {
    public final /* synthetic */ U5m A00;

    public C19887WhI(U5m u5m) {
        this.A00 = u5m;
    }

    public final void run() {
        C18932WDk wDk;
        U5m u5m = this.A00;
        Menu A002 = U5m.A00(u5m);
        if (A002 instanceof C18932WDk) {
            wDk = (C18932WDk) A002;
            if (wDk != null) {
                wDk.A06();
            }
        } else {
            wDk = null;
        }
        try {
            A002.clear();
            Window.Callback callback = u5m.A04;
            if (!callback.onCreatePanelMenu(0, A002) || !callback.onPreparePanel(0, (View) null, A002)) {
                A002.clear();
            }
        } finally {
            if (wDk != null) {
                wDk.A05();
            }
        }
    }
}
