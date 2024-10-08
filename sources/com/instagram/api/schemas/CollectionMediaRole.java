package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CollectionMediaRole implements Parcelable {
    UNRECOGNIZED("CollectionMediaRole_unspecified"),
    MAIN_MEDIA(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    THUMBNAIL_MEDIA("2");
    
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
        CollectionMediaRole[] collectionMediaRoleArr;
        A02 = 0oU.A00(collectionMediaRoleArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CollectionMediaRole collectionMediaRole : values()) {
            linkedHashMap.put(collectionMediaRole.A00, collectionMediaRole);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(80);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CollectionMediaRole(String str) {
        this.A00 = str;
    }
}
