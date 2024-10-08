package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PublisherPlatform implements Parcelable {
    UNRECOGNIZED("PublisherPlatform_unspecified"),
    FACEBOOK("FACEBOOK");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PublisherPlatform[] publisherPlatformArr;
        A02 = 0oU.A00(publisherPlatformArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (PublisherPlatform publisherPlatform : values()) {
            linkedHashMap.put(publisherPlatform.A00, publisherPlatform);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PublisherPlatform(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
