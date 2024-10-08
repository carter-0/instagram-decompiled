package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;

public final class ECPConfirmationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(36);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;

    public ECPConfirmationConfiguration(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str) {
        0qQ.A0B(str, 2);
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public ECPConfirmationConfiguration() {
        this((ECPConfirmationUpsellSection) null, "CLOSE");
    }
}
