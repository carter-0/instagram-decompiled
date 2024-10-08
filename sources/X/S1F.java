package X;

import android.webkit.JavascriptInterface;

public final class S1F {
    public Q8z A00;
    public final /* synthetic */ Q8z A01;

    public S1F(Q8z q8z, Q8z q8z2) {
        this.A01 = q8z;
        this.A00 = q8z2;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.A00.post(new TGB(this, str));
    }
}
