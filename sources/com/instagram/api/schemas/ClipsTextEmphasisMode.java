package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsTextEmphasisMode implements Parcelable {
    UNRECOGNIZED("ClipsTextEmphasisMode_unspecified"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    DEFAULT_OUTLINES("default_outlines"),
    DISABLED("disabled"),
    FROSTED("frosted"),
    INVERTED("inverted"),
    INVERTED_OUTLINES("inverted_outlines");
    
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
        ClipsTextEmphasisMode[] clipsTextEmphasisModeArr;
        A02 = 0oU.A00(clipsTextEmphasisModeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ClipsTextEmphasisMode clipsTextEmphasisMode : values()) {
            linkedHashMap.put(clipsTextEmphasisMode.A00, clipsTextEmphasisMode);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTextEmphasisMode(String str) {
        this.A00 = str;
    }
}
