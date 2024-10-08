package com.facebook.browser.lite.extensions.igleadformextension;

import X.0qQ;
import X.C41847B3o;
import X.SWS;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class IGLeadFormExtensionModel implements Parcelable {
    public static final SWS CREATOR = new SWS(21);
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public IGLeadFormExtensionModel(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A01 = (ImageUrl) C41847B3o.A03(parcel, ImageUrl.class);
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0B = parcel.readString();
        this.A03 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 29) {
            z = parcel.readBoolean();
        } else if (parcel.readInt() != 1) {
            z = false;
        }
        this.A0C = z;
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A03);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.A0C;
        if (i2 >= 29) {
            parcel.writeBoolean(z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }

    public IGLeadFormExtensionModel(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, boolean z) {
        this.A05 = str;
        this.A01 = imageUrl;
        this.A06 = str2;
        this.A00 = i;
        this.A0B = str3;
        this.A03 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A08 = str7;
        this.A07 = str8;
        this.A0C = z;
        this.A02 = str9;
        this.A04 = str10;
    }
}
