package com.instagram.model.shopping.productfeed;

import X.1XP;
import X.AnonymousClass1XV;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ProductFeedResponse extends 1XP implements Parcelable, AnonymousClass1XV {
    public static final Parcelable.Creator CREATOR = LVO.A00(18);
    public int A00;
    public String A01;
    public String A02;
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;

    public final boolean CP6() {
        return true;
    }

    public final boolean CPJ() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getNextMaxId() {
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A03);
        parcel.writeString(this.A02);
    }
}
