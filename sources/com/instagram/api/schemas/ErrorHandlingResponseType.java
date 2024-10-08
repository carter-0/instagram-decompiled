package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ErrorHandlingResponseType implements Parcelable {
    UNRECOGNIZED("ErrorHandlingResponseType_unspecified"),
    DISPLAY_ERROR_MESSAGE("DISPLAY_ERROR_MESSAGE"),
    DISPLAY_ERROR_PAGE("DISPLAY_ERROR_PAGE"),
    DISPLAY_ERROR_PAGE_WITH_ACTION("DISPLAY_ERROR_PAGE_WITH_ACTION"),
    DISPLAY_TEMPORARY_MESSAGE("DISPLAY_TEMPORARY_MESSAGE"),
    DISPLAY_WARNING_ROW("DISPLAY_WARNING_ROW"),
    DO_NOTHING("DO_NOTHING");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ErrorHandlingResponseType[] errorHandlingResponseTypeArr;
        A02 = 0oU.A00(errorHandlingResponseTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ErrorHandlingResponseType errorHandlingResponseType : values()) {
            linkedHashMap.put(errorHandlingResponseType.A00, errorHandlingResponseType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(59);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ErrorHandlingResponseType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
