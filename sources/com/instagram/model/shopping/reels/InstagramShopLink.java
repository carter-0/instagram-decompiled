package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class InstagramShopLink extends AnonymousClass0T0 implements Parcelable {
    public static final LVO CREATOR = new LVO(25);
    public boolean A00 = false;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof InstagramShopLink) && this.A00 == ((InstagramShopLink) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }
}
