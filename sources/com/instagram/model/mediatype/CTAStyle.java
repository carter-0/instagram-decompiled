package com.instagram.model.mediatype;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CTAStyle implements Parcelable {
    UNRECOGNIZED("CTAStyle_unspecified"),
    BAR_CTA(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    CLIENT_DEFAULT("0");
    
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
        CTAStyle[] cTAStyleArr;
        A02 = 0oU.A00(cTAStyleArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CTAStyle cTAStyle : values()) {
            linkedHashMap.put(cTAStyle.A00, cTAStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(37);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CTAStyle(String str) {
        this.A00 = str;
    }
}
