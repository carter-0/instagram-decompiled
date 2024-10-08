package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CTABarType implements Parcelable {
    UNRECOGNIZED("CTABarType_unspecified"),
    COLLECTION_DROP_EVENT("cta_bar_collection_drop_event"),
    COLLECTIONS("cta_bar_collections"),
    DISCOUNTS("cta_bar_discounts"),
    FUNDRAISERS("cta_bar_fundraisers"),
    GENERAL_EVENT("cta_bar_general_event"),
    LIVE_EVENT("cta_bar_live_event"),
    MUSIC_EVENT("cta_bar_music_event"),
    PROFESSIONAL_ORGANIC_CTA("cta_bar_organic"),
    PRODUCT_DROP_EVENT("cta_bar_product_drop_event");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CTABarType[] cTABarTypeArr;
        A02 = 0oU.A00(cTABarTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (CTABarType cTABarType : values()) {
            linkedHashMap.put(cTABarType.A00, cTABarType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(79);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CTABarType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
