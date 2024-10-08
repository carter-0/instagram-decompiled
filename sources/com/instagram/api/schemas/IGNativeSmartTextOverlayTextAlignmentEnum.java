package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGNativeSmartTextOverlayTextAlignmentEnum implements Parcelable {
    UNRECOGNIZED("IGNativeSmartTextOverlayTextAlignmentEnum_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGNativeSmartTextOverlayTextAlignmentEnum[] iGNativeSmartTextOverlayTextAlignmentEnumArr;
        A02 = 0oU.A00(iGNativeSmartTextOverlayTextAlignmentEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum : values()) {
            linkedHashMap.put(iGNativeSmartTextOverlayTextAlignmentEnum.A00, iGNativeSmartTextOverlayTextAlignmentEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(27);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGNativeSmartTextOverlayTextAlignmentEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
