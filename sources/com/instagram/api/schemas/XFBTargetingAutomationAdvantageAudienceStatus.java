package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XFBTargetingAutomationAdvantageAudienceStatus implements Parcelable {
    UNRECOGNIZED("XFBTargetingAutomationAdvantageAudienceStatus_unspecified"),
    OFF("OFF"),
    ON("ON");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XFBTargetingAutomationAdvantageAudienceStatus[] xFBTargetingAutomationAdvantageAudienceStatusArr;
        A02 = 0oU.A00(xFBTargetingAutomationAdvantageAudienceStatusArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus : values()) {
            linkedHashMap.put(xFBTargetingAutomationAdvantageAudienceStatus.A00, xFBTargetingAutomationAdvantageAudienceStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(71);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBTargetingAutomationAdvantageAudienceStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
