package com.facebook.common.payments.paymentmethods.model;

import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C66580MXl;
import X.Pxe;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class NewCreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = SWS.A00(71);
    public final AdditionalFields A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A1C;
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A02);
        Set set = this.A03;
        if (set == null) {
            A1C = null;
        } else {
            A1C = AnonymousClass7TE.A1C();
            A1C.addAll(set);
        }
        parcel.writeList(A1C);
    }

    public NewCreditCard(Parcel parcel) {
        Set A12;
        this.A01 = parcel.readString();
        this.A00 = (AdditionalFields) C41847B3o.A03(parcel, AdditionalFields.class);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Pxe.A1O(parcel, ArrayList.class, A1C);
        this.A02 = A1C;
        ArrayList readArrayList = parcel.readArrayList(List.class.getClassLoader());
        if (readArrayList == null) {
            A12 = Collections.EMPTY_SET;
        } else {
            A12 = C66580MXl.A12(readArrayList);
        }
        this.A03 = A12;
    }
}
