package com.instagram.business.controller.datamodel;

import X.0qQ;
import X.C41847B3o;
import X.C48092EVk;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class BusinessConversionStep implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(3);
    public final C48092EVk A00;
    public final ConversionStep A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionStep)) {
            return false;
        }
        BusinessConversionStep businessConversionStep = (BusinessConversionStep) obj;
        return businessConversionStep.A01 == this.A01 && businessConversionStep.A00 == this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public BusinessConversionStep(Parcel parcel) {
        C48092EVk eVk;
        this.A01 = (ConversionStep) C41847B3o.A03(parcel, ConversionStep.class);
        if (parcel.readInt() == 1) {
            eVk = C48092EVk.SKIP;
        } else {
            eVk = C48092EVk.NEXT;
        }
        this.A00 = eVk;
    }

    public BusinessConversionStep(C48092EVk eVk, ConversionStep conversionStep) {
        this.A01 = conversionStep;
        this.A00 = eVk;
    }
}
