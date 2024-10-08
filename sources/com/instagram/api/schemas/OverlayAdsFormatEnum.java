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

public enum OverlayAdsFormatEnum implements Parcelable {
    UNRECOGNIZED("OverlayAdsFormatEnum_unspecified"),
    NO_INFO("no_info"),
    ONE_LINE_INFO("one_line_info"),
    THREE_LINE_INFO("three_line_info");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        OverlayAdsFormatEnum[] overlayAdsFormatEnumArr;
        A02 = 0oU.A00(overlayAdsFormatEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (OverlayAdsFormatEnum overlayAdsFormatEnum : values()) {
            A0x.put(overlayAdsFormatEnum.A00, overlayAdsFormatEnum);
        }
        A01 = A0x;
        CREATOR = new DE6(5);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    OverlayAdsFormatEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
