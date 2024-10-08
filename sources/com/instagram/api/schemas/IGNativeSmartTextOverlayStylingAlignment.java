package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGNativeSmartTextOverlayStylingAlignment implements Parcelable {
    UNRECOGNIZED("IGNativeSmartTextOverlayStylingAlignment_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGNativeSmartTextOverlayStylingAlignment[] iGNativeSmartTextOverlayStylingAlignmentArr;
        A02 = 0oU.A00(iGNativeSmartTextOverlayStylingAlignmentArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment : values()) {
            linkedHashMap.put(iGNativeSmartTextOverlayStylingAlignment.A00, iGNativeSmartTextOverlayStylingAlignment);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(25);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGNativeSmartTextOverlayStylingAlignment(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
