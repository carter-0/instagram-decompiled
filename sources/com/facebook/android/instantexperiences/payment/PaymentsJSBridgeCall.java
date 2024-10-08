package com.facebook.android.instantexperiences.payment;

import X.C8910RFd;
import X.Pxe;
import X.RKR;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;

public abstract class PaymentsJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public void A02() {
        super.A02();
        if (((IGInstantExperiencesParameters) this.A01).A00 == null) {
            throw new RKR(C8910RFd.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", Pxe.A1b()));
        }
    }
}
