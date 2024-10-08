package com.instagram.model.mapquery;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class MapQuery implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(59);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public MapQuery(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = "";
        this.A02 = str3;
    }

    public MapQuery() {
        this("", "", AnonymousClass7TF.A0j("CATEGORY"));
    }
}
