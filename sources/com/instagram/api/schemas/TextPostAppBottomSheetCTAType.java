package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextPostAppBottomSheetCTAType implements Parcelable {
    UNRECOGNIZED("TextPostAppBottomSheetCTAType_unspecified"),
    APP_AVAILABLE("app_available"),
    APP_UNAVAILABLE_AND_PREREGISTER_OFF("app_unavailable_and_preregister_off"),
    APP_UNAVAILABLE_AND_PREREGISTER_ON("app_unavailable_and_preregister_on");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextPostAppBottomSheetCTAType[] textPostAppBottomSheetCTATypeArr;
        A02 = 0oU.A00(textPostAppBottomSheetCTATypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType : values()) {
            A0x.put(textPostAppBottomSheetCTAType.A00, textPostAppBottomSheetCTAType);
        }
        A01 = A0x;
        CREATOR = new FK6(37);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextPostAppBottomSheetCTAType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
