package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUChainingSourceType implements Parcelable {
    UNRECOGNIZED("RIXUChainingSourceType_unspecified"),
    ACCOUNTS_YOU_MAY_FOLLOW("accounts_you_may_follow"),
    CONNECTED(RealtimeConstants.MQTT_CONNECTED),
    CONTENT_NOTES("content_notes"),
    LIKED_BY_FOLLOWEE("liked_by_followee"),
    META_VERIFIED_CREATORS("meta_verified_creators"),
    TOP_RESHARED("top_reshared"),
    UNCONNECTED("unconnected");
    
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
        RIXUChainingSourceType[] rIXUChainingSourceTypeArr;
        A02 = 0oU.A00(rIXUChainingSourceTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXUChainingSourceType rIXUChainingSourceType : values()) {
            linkedHashMap.put(rIXUChainingSourceType.A00, rIXUChainingSourceType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(9);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUChainingSourceType(String str) {
        this.A00 = str;
    }
}
