package com.instagram.nux.cal.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SignupContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(67);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        List list = this.A07;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        List<ContentText> list2 = this.A07;
        if (list2 != null) {
            for (ContentText writeParcelable : list2) {
                parcel.writeParcelable(writeParcelable, 0);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
    }
}
