package X;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class WDG implements OnBackInvokedCallback {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ WDG(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onBackInvoked() {
        this.A00.run();
    }
}
