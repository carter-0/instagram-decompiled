package com.facebookpay.form.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C11087S9i;
import X.C41847B3o;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class FormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(94);
    @SerializedName("valueType")
    public final Integer A00;
    @SerializedName("errorMessage")
    public final String A01;
    @SerializedName("fieldId")
    public final String A02;
    @SerializedName("label")
    public final String A03;
    @SerializedName("validationRules")
    public final List<TextValidatorParams> A04;
    @SerializedName("isOptional")
    public final boolean A05;
    @SerializedName("placeHolder")
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(C11087S9i.A01(this.A00));
    }

    public FormField(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(num, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A01 = str4;
        this.A05 = z;
        this.A04 = list;
        this.A00 = num;
    }
}
