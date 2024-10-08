package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGNativeSmartTextOverlayStylingFontStyle implements Parcelable {
    UNRECOGNIZED("IGNativeSmartTextOverlayStylingFontStyle_unspecified"),
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
        IGNativeSmartTextOverlayStylingFontStyle[] iGNativeSmartTextOverlayStylingFontStyleArr;
        A02 = 0oU.A00(iGNativeSmartTextOverlayStylingFontStyleArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle : values()) {
            linkedHashMap.put(iGNativeSmartTextOverlayStylingFontStyle.A00, iGNativeSmartTextOverlayStylingFontStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(26);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGNativeSmartTextOverlayStylingFontStyle(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
