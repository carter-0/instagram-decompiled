package com.instagram.model.shopping.sizechart;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SizeChart implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(36);
    public String A00;
    public List A01;
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A00);
    }
}
