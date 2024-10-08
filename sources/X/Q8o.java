package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebook.browser.lite.webview.SystemWebView;

public final class Q8o extends AutofillManager.AutofillCallback {
    public final /* synthetic */ SystemWebView A00;

    public Q8o(SystemWebView systemWebView) {
        this.A00 = systemWebView;
    }

    public final void onAutofillEvent(View view, int i, int i2) {
        REJ rej;
        C10376RrD rrD = this.A00.A0F;
        if (rrD != null) {
            C270254gR r0 = rrD.A00.A0b;
            1yd r2 = r0.A04;
            C10860RzL rzL = r0.A00;
            if (i2 == 1) {
                rej = REJ.EVENT_INPUT_SHOWN;
            } else if (i2 == 2) {
                rej = REJ.EVENT_INPUT_HIDDEN;
            } else if (i2 == 3) {
                rej = REJ.EVENT_INPUT_UNAVAILABLE;
            } else {
                throw DbW.A0a("SystemAutofillEventType - Unknown type: ", i2);
            }
            RUK.A00(rzL, rej, r2);
        }
    }
}
