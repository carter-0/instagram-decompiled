package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NudgeVisualType implements Parcelable {
    UNRECOGNIZED("NudgeVisualType_unspecified"),
    POST_LEVEL_PERSISTENT("post_level_persistent");
    
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
        NudgeVisualType[] nudgeVisualTypeArr;
        A02 = 0oU.A00(nudgeVisualTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (NudgeVisualType nudgeVisualType : values()) {
            linkedHashMap.put(nudgeVisualType.A00, nudgeVisualType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    NudgeVisualType(String str) {
        this.A00 = str;
    }
}
