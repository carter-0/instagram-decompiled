package X;

import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

/* renamed from: X.T5m  reason: case insensitive filesystem */
public final class C12752T5m implements TeZ {
    public final /* synthetic */ T0O A00;

    public C12752T5m(T0O t0o) {
        this.A00 = t0o;
    }

    public final void Cx8(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        T0O t0o = this.A00;
        InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) t0o.A02;
        instantExperiencesJSBridgeCall.A03(new RequestAutofillJSBridgeCallResult(new TSO(browserExtensionsAutofillData, this, 0)));
        instantExperiencesJSBridgeCall.A03(new RequestAutofillJSBridgeCallResult(new TSO(browserExtensionsAutofillData, this, 1)));
        ((SIB) t0o.A01).A01(instantExperiencesJSBridgeCall);
    }
}
