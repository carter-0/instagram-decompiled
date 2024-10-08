package com.instagram.model.coupon;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteAdsCouponUseCase implements Parcelable {
    ACQUISITION,
    DEPRECATED,
    DOGFOODING,
    GENERAL,
    RESURRECTION;
    
    public static final C71269Ogb CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        PromoteAdsCouponUseCase[] promoteAdsCouponUseCaseArr;
        A00 = 0oU.A00(promoteAdsCouponUseCaseArr);
        CREATOR = C71269Ogb.A00(28);
    }

    public final String toString() {
        return name();
    }
}
