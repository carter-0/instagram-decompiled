package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGCTAStickerPositioningStrategyEnum implements Parcelable {
    UNRECOGNIZED("IGCTAStickerPositioningStrategyEnum_unspecified"),
    CONSERVATIVE_POSITIONING("CONSERVATIVE_POSITIONING"),
    HIGHEST_POSITION_0_20("HIGHEST_POSITION_0_20"),
    HIGHEST_POSITION_0_30("HIGHEST_POSITION_0_30"),
    HIGHEST_POSITION_WITH_MIN_BUFFER_0_20("HIGHEST_POSITION_WITH_MIN_BUFFER_0_20"),
    HIGHEST_POSITION_WITH_MIN_BUFFER_0_30("HIGHEST_POSITION_WITH_MIN_BUFFER_0_30"),
    LARGEST_EMPTY_AREA_0_20("LARGEST_EMPTY_AREA_0_20"),
    LARGEST_EMPTY_AREA_0_30("LARGEST_EMPTY_AREA_0_30"),
    NEAR_CENTER_0_20("NEAR_CENTER_0_20");
    
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
        IGCTAStickerPositioningStrategyEnum[] iGCTAStickerPositioningStrategyEnumArr;
        A02 = 0oU.A00(iGCTAStickerPositioningStrategyEnumArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum : values()) {
            linkedHashMap.put(iGCTAStickerPositioningStrategyEnum.A00, iGCTAStickerPositioningStrategyEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(27);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGCTAStickerPositioningStrategyEnum(String str) {
        this.A00 = str;
    }
}
