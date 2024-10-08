package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.lang.ref.WeakReference;

public final class SlF implements C13704TfN {
    public final Bundle A00;
    public final SRY A01;
    public final WeakReference A02;

    public final void Cx7(AutofillData autofillData, boolean z) {
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall;
        C7580QKv A0Q = Pxe.A0Q(this.A02);
        if (A0Q != null) {
            if (!(A0Q.A05 == null || (requestAutofillJSBridgeCall = A0Q.A0F) == null)) {
                A0Q.A05.A0C(BusinessExtensionJSBridgeCall.A01((String) Pxh.A0d(requestAutofillJSBridgeCall, "callbackID"), autofillData.A01()), A0Q.A0F);
            }
            A0Q.A0C(autofillData);
        }
        this.A01.A07(this.A00, C9919RjY.A00.A00("ACCEPTED_AUTOFILL", "CONTACT_AUTOFILL", z));
    }

    public final void onDecline() {
        C7580QKv A0Q = Pxe.A0Q(this.A02);
        if (A0Q != null) {
            A0Q.A0C((AutofillData) null);
        }
    }

    public SlF(Bundle bundle, SRY sry, C7580QKv qKv) {
        this.A00 = bundle;
        this.A01 = sry;
        this.A02 = C51965G9l.A0v(qKv);
    }
}
