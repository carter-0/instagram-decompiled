package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum GuideMediaType implements Parcelable {
    UNRECOGNIZED("GuideMediaType_unspecified"),
    IG_MEDIA("IG_MEDIA"),
    PRODUCT_IMAGE("PRODUCT_IMAGE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GuideMediaType[] guideMediaTypeArr;
        A02 = 0oU.A00(guideMediaTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (GuideMediaType guideMediaType : values()) {
            linkedHashMap.put(guideMediaType.A00, guideMediaType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(94);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    GuideMediaType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
