package com.instagram.payments.checkout.model;

import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;

public class CheckoutData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(71);
    public CheckoutLaunchParams A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
