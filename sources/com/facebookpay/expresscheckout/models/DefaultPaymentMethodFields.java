package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class DefaultPaymentMethodFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(33);
    @SerializedName("creditCardFields")
    public final DefaultCreditCardFields A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        DefaultCreditCardFields defaultCreditCardFields = this.A00;
        if (defaultCreditCardFields == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        defaultCreditCardFields.writeToParcel(parcel, i);
    }

    public DefaultPaymentMethodFields(DefaultCreditCardFields defaultCreditCardFields) {
        this.A00 = defaultCreditCardFields;
    }

    public DefaultPaymentMethodFields() {
        this((DefaultCreditCardFields) null);
    }
}
