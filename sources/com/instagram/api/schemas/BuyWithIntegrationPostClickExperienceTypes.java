package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BuyWithIntegrationPostClickExperienceTypes implements Parcelable {
    UNRECOGNIZED("BuyWithIntegrationPostClickExperienceTypes_unspecified"),
    BWI_STANDARD_IAB("BWI_STANDARD_IAB"),
    CUSTOM_IAB_FOR_1P_BWP("CUSTOM_IAB_FOR_1P_BWP"),
    CUSTOM_IAB_FOR_DTC_BWP("CUSTOM_IAB_FOR_DTC_BWP"),
    STANDARD_IAB("STANDARD_IAB");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BuyWithIntegrationPostClickExperienceTypes[] buyWithIntegrationPostClickExperienceTypesArr;
        A02 = 0oU.A00(buyWithIntegrationPostClickExperienceTypesArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes : values()) {
            A0x.put(buyWithIntegrationPostClickExperienceTypes.A00, buyWithIntegrationPostClickExperienceTypes);
        }
        A01 = A0x;
        CREATOR = SWT.A00(74);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BuyWithIntegrationPostClickExperienceTypes(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
