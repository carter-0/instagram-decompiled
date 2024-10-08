package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum WearablesAppAttributionType implements Parcelable {
    UNRECOGNIZED("WearablesAppAttributionType_unspecified"),
    GREATWHITE("greatwhite"),
    HAMMERHEAD("hammerhead"),
    HORIZON("horizon"),
    ICONIC_ENTRYPOINTS("iconic_entrypoints"),
    ICONIC_ENTRYPOINTS_AND_WORLD_PAGES("iconic_entrypoints_and_world_pages"),
    META_QUEST("meta_quest"),
    STELLA("stella"),
    WORLD_PAGES("world_pages");
    
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
        WearablesAppAttributionType[] wearablesAppAttributionTypeArr;
        A02 = 0oU.A00(wearablesAppAttributionTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (WearablesAppAttributionType wearablesAppAttributionType : values()) {
            linkedHashMap.put(wearablesAppAttributionType.A00, wearablesAppAttributionType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(54);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    WearablesAppAttributionType(String str) {
        this.A00 = str;
    }
}
