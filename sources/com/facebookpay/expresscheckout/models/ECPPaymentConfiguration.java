package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C8881RDy;
import X.C8914RFh;
import X.Pxi;
import X.Pxj;
import X.REB;
import X.RFA;
import X.SWV;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ECPPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(38);
    @SerializedName("estimatedTotal")
    public final CurrencyAmount A00;
    @SerializedName("knownData")
    public final KnownData A01;
    @SerializedName("paymentEnv")
    public final RFA A02;
    @SerializedName("containerContext")
    public final String A03;
    @SerializedName("securityOrigin")
    public final String A04;
    @SerializedName("offers")
    public final ArrayList<String> A05;
    @SerializedName("paymentActionType")
    public final ArrayList<REB> A06;
    @SerializedName("supportedContainerTypes")
    public final ArrayList<C8914RFh> A07;
    @SerializedName("supportedContainerConfigurations")
    public final Map<C8914RFh, Bundle> A08;
    @SerializedName("allowedCredentialTypes")
    public final Set<C8881RDy> A09;

    public ECPPaymentConfiguration(CurrencyAmount currencyAmount, KnownData knownData, RFA rfa, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map, Set set) {
        0qQ.A0B(rfa, 1);
        this.A02 = rfa;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = arrayList;
        this.A00 = currencyAmount;
        this.A07 = arrayList2;
        this.A01 = knownData;
        this.A05 = arrayList3;
        this.A08 = map;
        this.A09 = set;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        Iterator A0l = Pxi.A0l(parcel, this.A06);
        while (A0l.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (REB) A0l.next());
        }
        parcel.writeParcelable(this.A00, i);
        Iterator A0l2 = Pxi.A0l(parcel, this.A07);
        while (A0l2.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (C8914RFh) A0l2.next());
        }
        KnownData knownData = this.A01;
        if (knownData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            knownData.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A05);
        Map<C8914RFh, Bundle> map = this.A08;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                AnonymousClass7TE.A1T(parcel, (C8914RFh) A1J.getKey());
                parcel.writeBundle((Bundle) A1J.getValue());
            }
        }
        Set<C8881RDy> set = this.A09;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0w = Pxj.A0w(parcel, set);
        while (A0w.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (C8881RDy) A0w.next());
        }
    }
}
