package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdTransparencyDisclaimerPlacement implements Parcelable {
    UNRECOGNIZED("IGAdTransparencyDisclaimerPlacement_unspecified"),
    ABOVE_IMAGE("ABOVE_IMAGE"),
    BELOW_IMAGE("BELOW_IMAGE"),
    OVERFLOW_MENU("OVERFLOW_MENU");
    
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
        IGAdTransparencyDisclaimerPlacement[] iGAdTransparencyDisclaimerPlacementArr;
        A02 = 0oU.A00(iGAdTransparencyDisclaimerPlacementArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement : values()) {
            linkedHashMap.put(iGAdTransparencyDisclaimerPlacement.A00, iGAdTransparencyDisclaimerPlacement);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(16);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdTransparencyDisclaimerPlacement(String str) {
        this.A00 = str;
    }
}
