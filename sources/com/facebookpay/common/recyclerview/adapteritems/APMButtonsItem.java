package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.expresscheckout.models.APMConfiguration;

public final class APMButtonsItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(83);
    public final APMBloksNativeProps A00;
    public final APMConfiguration A01;
    public final Integer A02;
    public final RH6 A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(C41847B3o.A00(parcel, this.A02));
        parcel.writeParcelable(this.A01, i);
    }

    public final RH6 BJZ() {
        return this.A03;
    }

    public APMButtonsItem(APMBloksNativeProps aPMBloksNativeProps, RH6 rh6, APMConfiguration aPMConfiguration, Integer num) {
        AnonymousClass7TG.A1O(rh6, aPMBloksNativeProps);
        this.A03 = rh6;
        this.A00 = aPMBloksNativeProps;
        this.A02 = num;
        this.A01 = aPMConfiguration;
    }
}
