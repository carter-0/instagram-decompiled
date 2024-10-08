package com.instagram.model.shopping.productfeed;

import X.0qQ;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ProductCollectionFooter implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(13);
    public String A00;
    public ArrayList A01 = AnonymousClass7TE.A1C();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A01);
    }
}
