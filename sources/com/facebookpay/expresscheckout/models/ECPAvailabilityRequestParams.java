package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51973G9u;
import X.C51974G9v;
import X.C8891REi;
import X.Pxj;
import X.REn;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.logging.LoggingPolicy;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

public final class ECPAvailabilityRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(34);
    @SerializedName("apiVersion")
    public final int A00;
    @SerializedName("paymentConfiguration")
    public final ECPPaymentConfiguration A01;
    @SerializedName("receiverInfo")
    public final PaymentReceiverInfo A02;
    @SerializedName("loggingPolicy")
    public final LoggingPolicy A03;
    @SerializedName("productId")
    public final String A04;
    @SerializedName("requestId")
    public final String A05;
    @SerializedName("securityOrigin")
    public final String A06;
    @SerializedName("sessionId")
    public final String A07;
    @SerializedName("optionalFields")
    public final Set<REn> A08;
    @SerializedName("returnFields")
    public final Set<C8891REi> A09;
    public final boolean A0A;
    @SerializedName("getDefaultPaymentMethodFields")
    public final boolean A0B;
    public final boolean A0C;

    public ECPAvailabilityRequestParams(ECPPaymentConfiguration eCPPaymentConfiguration, PaymentReceiverInfo paymentReceiverInfo, LoggingPolicy loggingPolicy, String str, String str2, String str3, String str4, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        C51974G9v.A0d(2, str2, paymentReceiverInfo, str3, str4);
        C51973G9u.A0u(8, set2, eCPPaymentConfiguration, loggingPolicy);
        this.A07 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = paymentReceiverInfo;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = set;
        this.A09 = set2;
        this.A01 = eCPPaymentConfiguration;
        this.A03 = loggingPolicy;
        this.A0B = z;
        this.A0A = z2;
        this.A0C = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        Iterator A0w = Pxj.A0w(parcel, this.A08);
        while (A0w.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (REn) A0w.next());
        }
        Iterator A0w2 = Pxj.A0w(parcel, this.A09);
        while (A0w2.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (C8891REi) A0w2.next());
        }
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
    }
}
