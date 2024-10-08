package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGBuyWithPrimeExperienceTypes implements Parcelable {
    UNRECOGNIZED("IGBuyWithPrimeExperienceTypes_unspecified"),
    CUSTOM_IAB_FOR_1P("CUSTOM_IAB_FOR_1P"),
    CUSTOM_IAB_FOR_DTC("CUSTOM_IAB_FOR_DTC");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGBuyWithPrimeExperienceTypes[] iGBuyWithPrimeExperienceTypesArr;
        A02 = 0oU.A00(iGBuyWithPrimeExperienceTypesArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes : values()) {
            A0x.put(iGBuyWithPrimeExperienceTypes.A00, iGBuyWithPrimeExperienceTypes);
        }
        A01 = A0x;
        CREATOR = FK5.A00(11);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGBuyWithPrimeExperienceTypes(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
