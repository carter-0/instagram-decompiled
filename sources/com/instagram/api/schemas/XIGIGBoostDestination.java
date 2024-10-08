package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XIGIGBoostDestination implements Parcelable {
    UNRECOGNIZED("XIGIGBoostDestination_unspecified"),
    DIRECT_MESSAGE("DIRECT_MESSAGE"),
    DO_NOT_USE_WEBSITE_CLICKS_FIX("DO_NOT_USE_WEBSITE_CLICKS_FIX"),
    JOIN_BROADCAST_CHANNEL("JOIN_BROADCAST_CHANNEL"),
    LEAD_GENERATION("LEAD_GENERATION"),
    MULTI_DESTINATION_MESSAGE("MULTI_DESTINATION_MESSAGE"),
    OUTCOME_SALES("OUTCOME_SALES"),
    POST_ENGAGEMENT("POST_ENGAGEMENT"),
    PROFILE_VISITS("PROFILE_VISITS"),
    UNSELECTED("UNSELECTED"),
    WEBSITE_CLICK("WEBSITE_CLICK"),
    WEBSITE_CONVERSION("WEBSITE_CONVERSION"),
    WHATSAPP_MESSAGE("WHATSAPP_MESSAGE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XIGIGBoostDestination[] xIGIGBoostDestinationArr;
        A02 = 0oU.A00(xIGIGBoostDestinationArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (XIGIGBoostDestination xIGIGBoostDestination : values()) {
            linkedHashMap.put(xIGIGBoostDestination.A00, xIGIGBoostDestination);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(74);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XIGIGBoostDestination(String str) {
        this.A00 = str;
    }
}
