package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CollectionPrivacyModeEnum implements Parcelable {
    UNRECOGNIZED("CollectionPrivacyModeEnum_unspecified"),
    COLLABORATIVE(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    PRIVATE("0"),
    PUBLIC("2");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CollectionPrivacyModeEnum[] collectionPrivacyModeEnumArr;
        A02 = 0oU.A00(collectionPrivacyModeEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (CollectionPrivacyModeEnum collectionPrivacyModeEnum : values()) {
            linkedHashMap.put(collectionPrivacyModeEnum.A00, collectionPrivacyModeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(13);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CollectionPrivacyModeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
