package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.C11085S9f;
import X.Pxi;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TransactionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(57);
    @SerializedName("fulfillmentOptions")
    public final FulfillmentOptions A00;
    @SerializedName("pickupInfo")
    public final PickupInfo A01;
    @SerializedName("appliedPromoCodes")
    public final PromoCodeList A02;
    @SerializedName("shippingOptions")
    public final ShippingOptions A03;
    @SerializedName("shippingOptionType")
    public final Integer A04;
    @SerializedName("countryCode")
    public final String A05;
    @SerializedName("shippingAddressInlineErrorMessage")
    public final String A06;
    @SerializedName("lineItems")
    public final ArrayList<PriceInfo> A07;
    @SerializedName("priceItems")
    public final ArrayList<PriceInfo> A08;
    @SerializedName("appliedIncentiveCredentialIds")
    public final List<String> A09;
    @SerializedName("currencyCode")
    public final String A0A;

    public TransactionInfo(FulfillmentOptions fulfillmentOptions, PickupInfo pickupInfo, PromoCodeList promoCodeList, ShippingOptions shippingOptions, Integer num, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, List list) {
        0qQ.A0B(str, 1);
        this.A0A = str;
        this.A05 = str2;
        this.A08 = arrayList;
        this.A07 = arrayList2;
        this.A03 = shippingOptions;
        this.A00 = fulfillmentOptions;
        this.A02 = promoCodeList;
        this.A09 = list;
        this.A06 = str3;
        this.A04 = num;
        this.A01 = pickupInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        ArrayList<PriceInfo> arrayList = this.A08;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0l = Pxi.A0l(parcel, arrayList);
            while (A0l.hasNext()) {
                ((PriceInfo) A0l.next()).writeToParcel(parcel, i);
            }
        }
        ArrayList<PriceInfo> arrayList2 = this.A07;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0l2 = Pxi.A0l(parcel, arrayList2);
            while (A0l2.hasNext()) {
                ((PriceInfo) A0l2.next()).writeToParcel(parcel, i);
            }
        }
        ShippingOptions shippingOptions = this.A03;
        if (shippingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOptions.writeToParcel(parcel, i);
        }
        FulfillmentOptions fulfillmentOptions = this.A00;
        if (fulfillmentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fulfillmentOptions.writeToParcel(parcel, i);
        }
        PromoCodeList promoCodeList = this.A02;
        if (promoCodeList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCodeList.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A06);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C11085S9f.A01(num));
        }
        PickupInfo pickupInfo = this.A01;
        if (pickupInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        pickupInfo.writeToParcel(parcel, i);
    }
}
