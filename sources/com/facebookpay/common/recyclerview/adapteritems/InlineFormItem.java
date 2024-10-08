package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.fragment.model.FormParams;

public final class InlineFormItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(95);
    public final FormParams A00;
    public final String A01;
    public final RH6 A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final RH6 BJZ() {
        return this.A02;
    }

    public InlineFormItem(RH6 rh6, FormParams formParams, String str) {
        AnonymousClass7TG.A1U(rh6, formParams, str);
        this.A02 = rh6;
        this.A00 = formParams;
        this.A01 = str;
    }
}
