package com.instagram.model.shopping.video;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingCreationConfig implements Parcelable {
    public static final LVO CREATOR = LVO.A00(39);
    public int A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
    }
}
