package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BoostedComponentMessageType implements Parcelable {
    UNRECOGNIZED("BoostedComponentMessageType_unspecified"),
    ACTIVE_FEEDBACK("ACTIVE_FEEDBACK"),
    BLOCKING_TIP("BLOCKING_TIP"),
    CONFIRMATION("CONFIRMATION"),
    ERROR("ERROR"),
    POLICY_UPDATE("POLICY_UPDATE"),
    TIP("TIP");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BoostedComponentMessageType[] boostedComponentMessageTypeArr;
        A02 = 0oU.A00(boostedComponentMessageTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (BoostedComponentMessageType boostedComponentMessageType : values()) {
            linkedHashMap.put(boostedComponentMessageType.A00, boostedComponentMessageType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BoostedComponentMessageType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
