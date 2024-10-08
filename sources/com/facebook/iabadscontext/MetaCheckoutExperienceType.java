package com.facebook.iabadscontext;

import X.0oU;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public enum MetaCheckoutExperienceType implements Parcelable {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    BAU_WEB_CHECKOUT,
    ONSITE_SHOPIFY_SDK_CHECKOUT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        MetaCheckoutExperienceType[] metaCheckoutExperienceTypeArr;
        A00 = 0oU.A00(metaCheckoutExperienceTypeArr);
        CREATOR = SWZ.A01(8);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
