package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdsIABScreenshotVariant implements Parcelable {
    UNRECOGNIZED("IGAdsIABScreenshotVariant_unspecified"),
    NO_EFFECT("NO_EFFECT"),
    SHOW_BLUR("SHOW_BLUR"),
    SHOW_BRIGHTNESS("SHOW_BRIGHTNESS"),
    SHOW_OPACITY("SHOW_OPACITY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGAdsIABScreenshotVariant[] iGAdsIABScreenshotVariantArr;
        A02 = 0oU.A00(iGAdsIABScreenshotVariantArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant : values()) {
            A0x.put(iGAdsIABScreenshotVariant.A00, iGAdsIABScreenshotVariant);
        }
        A01 = A0x;
        CREATOR = FK5.A00(6);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsIABScreenshotVariant(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
