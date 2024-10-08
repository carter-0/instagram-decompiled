package com.instagram.discovery.api.model;

import X.0qQ;
import X.C17424VVd;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SectionPagination implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(22);
    public final String A00;
    public final String A01;
    public final List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A02);
        parcel.writeString(this.A01);
    }

    public SectionPagination(String str, String str2, List list) {
        this.A00 = str;
        this.A02 = list;
        this.A01 = str2;
    }

    public SectionPagination(C17424VVd vVd) {
        this(vVd.A00, vVd.A01, vVd.A02);
    }
}
