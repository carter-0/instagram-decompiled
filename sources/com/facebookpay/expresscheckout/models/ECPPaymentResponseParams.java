package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C21267XRm;
import X.C41848B3p;
import X.C51974G9v;
import X.C8891REi;
import X.Pxj;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ECPPaymentResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(40);
    @SerializedName("externalConfirmationUrl")
    public String A00;
    @SerializedName("fulfillmentOption")
    public final FulfillmentOption A01;
    @SerializedName("shippingOption")
    public final ShippingOption A02;
    @SerializedName("transactionInfo")
    public final TransactionInfo A03;
    @SerializedName("credentialType")
    public final C21267XRm A04;
    @SerializedName("otcInput")
    public final OtcInput A05;
    @SerializedName("billingAddress")
    public final ShippingAddress A06;
    @SerializedName("shippingAddress")
    public final ShippingAddress A07;
    @SerializedName("credentialId")
    public final Long A08;
    @SerializedName("containerDescription")
    public final String A09;
    @SerializedName("containerExternalId")
    public final String A0A;
    @SerializedName("containerId")
    public final String A0B;
    @SerializedName("containerType")
    public final String A0C;
    @SerializedName("merchantName")
    public final String A0D;
    @SerializedName("orderId")
    public final String A0E;
    @SerializedName("payerEmail")
    public final String A0F;
    @SerializedName("payerName")
    public final String A0G;
    @SerializedName("payerPhone")
    public final String A0H;
    @SerializedName("paymentContainer")
    public final String A0I;
    @SerializedName("paymentMode")
    public final String A0J;
    @SerializedName("pickupEmail")
    public final String A0K;
    @SerializedName("pickupName")
    public final String A0L;
    @SerializedName("pickupNotes")
    public final String A0M;
    @SerializedName("pickupPhone")
    public final String A0N;
    @SerializedName("productId")
    public final String A0O;
    @SerializedName("receiverId")
    public final String A0P;
    @SerializedName("requestId")
    public final String A0Q;
    @SerializedName("sessionId")
    public final String A0R;
    @SerializedName("appliedOffers")
    public final List<ECPOffer> A0S;
    @SerializedName("isEmailOptInToggleOn")
    public final boolean A0T;
    @SerializedName("apiVersion")
    public final int A0U;
    @SerializedName("checkoutConfigReturnFields")
    public final Set<C8891REi> A0V;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A0U);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A06, i);
        ShippingOption shippingOption = this.A02;
        if (shippingOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOption.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A01, i);
        Set<C8891REi> set = this.A0V;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w = Pxj.A0w(parcel, set);
            while (A0w.hasNext()) {
                AnonymousClass7TE.A1T(parcel, (C8891REi) A0w.next());
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0O);
        parcel.writeParcelable(this.A05, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0S);
        while (A1F.hasNext()) {
            ((ECPOffer) A1F.next()).writeToParcel(parcel, i);
        }
        this.A03.writeToParcel(parcel, i);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0T ? 1 : 0);
        Pxj.A1A(parcel, this.A04);
        C41848B3p.A1K(parcel, this.A08);
        parcel.writeString(this.A00);
    }

    public ECPPaymentResponseParams(FulfillmentOption fulfillmentOption, ShippingOption shippingOption, TransactionInfo transactionInfo, C21267XRm xRm, OtcInput otcInput, ShippingAddress shippingAddress, ShippingAddress shippingAddress2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, Set set, int i, boolean z) {
        String str21 = str;
        0qQ.A0B(str21, 1);
        String str22 = str3;
        String str23 = str4;
        String str24 = str5;
        String str25 = str2;
        C51974G9v.A0d(3, str25, str22, str23, str24);
        String str26 = str7;
        0qQ.A0B(str26, 8);
        String str27 = str15;
        0qQ.A0B(str27, 21);
        String str28 = str16;
        0qQ.A0B(str28, 22);
        String str29 = str18;
        0qQ.A0B(str29, 24);
        0qQ.A0B(transactionInfo, 27);
        this.A0R = str21;
        this.A0U = i;
        this.A0Q = str25;
        this.A0A = str22;
        this.A0B = str23;
        this.A09 = str24;
        this.A0I = str6;
        this.A0J = str26;
        this.A0G = str8;
        this.A0F = str9;
        this.A0H = str10;
        this.A0L = str11;
        this.A0K = str12;
        this.A0N = str13;
        this.A0M = str14;
        this.A07 = shippingAddress;
        this.A06 = shippingAddress2;
        this.A02 = shippingOption;
        this.A01 = fulfillmentOption;
        this.A0V = set;
        this.A0E = str27;
        this.A0P = str28;
        this.A0D = str17;
        this.A0O = str29;
        this.A05 = otcInput;
        this.A0S = list;
        this.A03 = transactionInfo;
        this.A0C = str19;
        this.A0T = z;
        this.A04 = xRm;
        this.A08 = l;
        this.A00 = str20;
    }
}
