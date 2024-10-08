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

public enum IGRevShareProductType implements Parcelable {
    UNRECOGNIZED("IGRevShareProductType_unspecified"),
    PROFILE_ADS("profile_ads"),
    REELS_OVERLAY_ADS("reels_overlay_ads");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGRevShareProductType[] iGRevShareProductTypeArr;
        A02 = 0oU.A00(iGRevShareProductTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IGRevShareProductType iGRevShareProductType : values()) {
            A0x.put(iGRevShareProductType.A00, iGRevShareProductType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(32);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGRevShareProductType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
