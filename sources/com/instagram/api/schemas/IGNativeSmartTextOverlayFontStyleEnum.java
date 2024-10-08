package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGNativeSmartTextOverlayFontStyleEnum implements Parcelable {
    UNRECOGNIZED("IGNativeSmartTextOverlayFontStyleEnum_unspecified"),
    HOEFLER_TEXT_REGULAR("HOEFLER_TEXT_REGULAR"),
    INSTAGRAM_SANS("INSTAGRAM_SANS"),
    ROBOTO("ROBOTO"),
    ROBOTO_BOLD("ROBOTO_BOLD"),
    SF_PRO_BOLD_TEXT("SF_PRO_BOLD_TEXT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGNativeSmartTextOverlayFontStyleEnum[] iGNativeSmartTextOverlayFontStyleEnumArr;
        A02 = 0oU.A00(iGNativeSmartTextOverlayFontStyleEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum : values()) {
            linkedHashMap.put(iGNativeSmartTextOverlayFontStyleEnum.A00, iGNativeSmartTextOverlayFontStyleEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGNativeSmartTextOverlayFontStyleEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
