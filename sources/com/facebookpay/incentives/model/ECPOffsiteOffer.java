package com.facebookpay.incentives.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.RGS;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class ECPOffsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = SWV.A00(98);
    public final RGS A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final CurrencyAmount A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
    }

    public final String B2h() {
        return this.A05;
    }

    public final RGS BGn() {
        return this.A00;
    }

    public final boolean CPP() {
        return this.A03;
    }

    public final String getId() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A06;
    }

    public final String getTitle() {
        return this.A07;
    }

    public ECPOffsiteOffer(CurrencyAmount currencyAmount, RGS rgs, String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(rgs, 5);
        this.A01 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A00 = rgs;
        this.A03 = z;
        this.A05 = str5;
        this.A04 = currencyAmount;
    }
}
