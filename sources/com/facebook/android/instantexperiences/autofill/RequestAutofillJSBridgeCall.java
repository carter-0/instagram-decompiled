package com.facebook.android.instantexperiences.autofill;

import X.0qQ;
import X.C7216Pzk;
import X.C8910RFd;
import X.RKR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.LinkedHashSet;

public final class RequestAutofillJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(89);
    public volatile LinkedHashSet A00;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }

    public final void A02() {
        super.A02();
        String valueOf = String.valueOf(A00("selectedAutoCompleteTag"));
        if (valueOf == null || valueOf.length() == 0) {
            throw new RKR(C8910RFd.INVALID_PARAM, "Selected auto fill tag cannot be empty or null");
        }
        String valueOf2 = String.valueOf(A00("autofillFields"));
        if (valueOf2 == null || valueOf2.length() == 0) {
            throw new RKR(C8910RFd.INVALID_PARAM, "Autofill fields cannot be empty or null");
        }
    }
}
