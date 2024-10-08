package com.instagram.guides.intf;

import X.0oU;
import X.Dbb;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public enum GuideCreationType implements Parcelable {
    POSTS("posts"),
    PLACES("places"),
    PRODUCTS("products");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GuideCreationType[] guideCreationTypeArr;
        A02 = 0oU.A00(guideCreationTypeArr);
        A01 = new HashMap();
        CREATOR = new W6E(64);
        for (GuideCreationType guideCreationType : values()) {
            A01.put(guideCreationType.A00, guideCreationType);
        }
    }

    /* access modifiers changed from: public */
    GuideCreationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
