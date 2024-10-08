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

public enum OverlayAdTapDestinationEnum implements Parcelable {
    UNRECOGNIZED("OverlayAdTapDestinationEnum_unspecified"),
    CTA_DESTINATION("cta_destination"),
    ENLARGED_VIEWER("enlarged_viewer"),
    WATCH_AND_BROWSE("watch_and_browse");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        OverlayAdTapDestinationEnum[] overlayAdTapDestinationEnumArr;
        A02 = 0oU.A00(overlayAdTapDestinationEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (OverlayAdTapDestinationEnum overlayAdTapDestinationEnum : values()) {
            A0x.put(overlayAdTapDestinationEnum.A00, overlayAdTapDestinationEnum);
        }
        A01 = A0x;
        CREATOR = new DE6(4);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    OverlayAdTapDestinationEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
