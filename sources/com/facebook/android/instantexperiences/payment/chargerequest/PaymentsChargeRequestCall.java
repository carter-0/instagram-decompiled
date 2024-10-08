package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AnonymousClass5He;
import X.C8910RFd;
import X.Pxe;
import X.RKR;
import android.os.Parcel;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;

public abstract class PaymentsChargeRequestCall extends InstantExperiencesJSBridgeCall {
    public String A00;

    public final void A02() {
        super.A02();
        if (AnonymousClass5He.A00(String.valueOf(A00("paymentId")))) {
            throw new RKR(C8910RFd.INVALID_PARAM, "Payment ID can not be null or empty");
        } else if (((IGInstantExperiencesParameters) this.A01).A00 == null) {
            throw new RKR(C8910RFd.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", Pxe.A1b()));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
