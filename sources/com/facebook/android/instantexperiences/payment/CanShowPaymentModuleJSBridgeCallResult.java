package com.facebook.android.instantexperiences.payment;

import X.SWS;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

public class CanShowPaymentModuleJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = SWS.A00(1);
}
