package com.facebookpay.incentives.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51972G9s;
import X.C51974G9v;
import X.RGS;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class ECPOnsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = SWV.A00(99);
    public final CurrencyAmount A00;
    public final String A01;
    public final RGS A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        AnonymousClass7TE.A1T(parcel, this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final String B2h() {
        return this.A03;
    }

    public final RGS BGn() {
        return this.A02;
    }

    public final boolean CPP() {
        return this.A07;
    }

    public final String getId() {
        return this.A04;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public ECPOnsiteOffer(CurrencyAmount currencyAmount, RGS rgs, String str, String str2, String str3, String str4, String str5, boolean z) {
        C51974G9v.A1L(str, str2, rgs);
        C51972G9s.A1E(str4, str5);
        0qQ.A0B(currencyAmount, 8);
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = rgs;
        this.A07 = z;
        this.A01 = str4;
        this.A03 = str5;
        this.A00 = currencyAmount;
    }
}
