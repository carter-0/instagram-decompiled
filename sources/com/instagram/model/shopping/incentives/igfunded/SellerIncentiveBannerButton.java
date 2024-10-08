package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class SellerIncentiveBannerButton extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(7);
    public final String A00;

    public SellerIncentiveBannerButton(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SellerIncentiveBannerButton) && 0qQ.A0K(this.A00, ((SellerIncentiveBannerButton) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }
}
