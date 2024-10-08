package X;

import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;

public final class TFY implements Runnable {
    public final /* synthetic */ AutofillController$InstagramAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ String A01;

    public TFY(AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler, String str) {
        this.A00 = autofillController$InstagramAutofillOptOutCallbackHandler;
        this.A01 = str;
    }

    public final void run() {
        String str = this.A01;
        AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = this.A00;
        QLA qla = autofillController$InstagramAutofillOptOutCallbackHandler.A02;
        if (TextUtils.equals(str, C11429STt.A02(qla.A05()))) {
            autofillController$InstagramAutofillOptOutCallbackHandler.A01.A0E(qla);
        }
    }
}
