package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C7X;
import X.C8942RGk;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class PuxBannerItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(99);
    public final C7X A00;
    public final RH6 A01;
    public final C8942RGk A02;
    public final CharSequence A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeString(this.A04);
        C8942RGk rGk = this.A02;
        if (rGk == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, rGk);
        }
        TextUtils.writeToParcel(this.A03, parcel, i);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A01;
    }

    public PuxBannerItem(C7X c7x, RH6 rh6, C8942RGk rGk, CharSequence charSequence, String str, boolean z) {
        AnonymousClass7TG.A1O(rh6, str);
        this.A01 = rh6;
        this.A04 = str;
        this.A02 = rGk;
        this.A03 = charSequence;
        this.A00 = c7x;
        this.A05 = z;
    }
}
