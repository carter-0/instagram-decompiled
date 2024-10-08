package X;

import android.app.Activity;
import android.webkit.JavascriptInterface;

public final class S1N {
    public final Activity A00;
    public final Runnable A01;

    @JavascriptInterface
    public final void interfacedUIMethod() {
        this.A00.runOnUiThread(this.A01);
    }

    public S1N(Activity activity, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = activity;
    }
}
