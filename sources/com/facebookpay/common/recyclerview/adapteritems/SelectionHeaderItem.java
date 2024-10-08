package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.DbW;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(12);
    public Integer A00;
    public String A01;
    public String A02;
    public final Integer A03;
    public final RH6 A04;

    public SelectionHeaderItem(RH6 rh6, Integer num, Integer num2, String str, String str2) {
        DbW.A1N(rh6, 1, num2);
        this.A04 = rh6;
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A03 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        parcel.writeString(this.A02);
        switch (this.A03.intValue()) {
            case 0:
                str = "CREDENTIAL_TYPE_HEADER";
                break;
            case 1:
                str = "SECTION_HEADER";
                break;
            case 2:
                str = "ACCORDION_HEADER";
                break;
            case 3:
                str = "ACCORDION_HEADER_NO_RIGHT_ADDON";
                break;
            case 4:
                str = "PICKUP_CONTACT_HEADER";
                break;
            default:
                str = "ORDER_SUMMARY_HEADER_WITH_PICKUP";
                break;
        }
        parcel.writeString(str);
    }

    public final RH6 BJZ() {
        return this.A04;
    }
}
