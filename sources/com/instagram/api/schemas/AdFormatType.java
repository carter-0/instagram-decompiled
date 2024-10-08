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

public enum AdFormatType implements Parcelable {
    UNRECOGNIZED("AdFormatType_unspecified"),
    GRID("3"),
    H_SCROLL("2"),
    MEGACARD("5"),
    NATIVE_CAROUSEL(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    PEEK("6"),
    SLIDE_SCRUBBER("4");
    
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
        AdFormatType[] adFormatTypeArr;
        A02 = 0oU.A00(adFormatTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AdFormatType adFormatType : values()) {
            linkedHashMap.put(adFormatType.A00, adFormatType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(48);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdFormatType(String str) {
        this.A00 = str;
    }
}
