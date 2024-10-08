package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGUserProfileGridType implements Parcelable {
    UNRECOGNIZED("IGUserProfileGridType_unspecified"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    EMPTY("");
    
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
        IGUserProfileGridType[] iGUserProfileGridTypeArr;
        A02 = 0oU.A00(iGUserProfileGridTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGUserProfileGridType iGUserProfileGridType : values()) {
            linkedHashMap.put(iGUserProfileGridType.A00, iGUserProfileGridType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(42);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGUserProfileGridType(String str) {
        this.A00 = str;
    }
}
