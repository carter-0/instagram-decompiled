package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ReelsMediaInteractivityType implements Parcelable {
    UNRECOGNIZED("ReelsMediaInteractivityType_unspecified"),
    LONG_PRESS_FOLLOW("LONG_PRESS_FOLLOW"),
    LONG_PRESS_RELEASE("LONG_PRESS_RELEASE"),
    SINGLE_TAP("SINGLE_TAP");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ReelsMediaInteractivityType[] reelsMediaInteractivityTypeArr;
        A02 = 0oU.A00(reelsMediaInteractivityTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ReelsMediaInteractivityType reelsMediaInteractivityType : values()) {
            A0x.put(reelsMediaInteractivityType.A00, reelsMediaInteractivityType);
        }
        A01 = A0x;
        CREATOR = new DE6(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ReelsMediaInteractivityType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
