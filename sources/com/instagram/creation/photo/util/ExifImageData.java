package com.instagram.creation.photo.util;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbS;
import X.DbT;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ExifImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(46);
    public int A00;
    public Double A01;
    public Double A02;
    public final HashMap A03 = AnonymousClass7TE.A1E();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        double d;
        0qQ.A0B(parcel, 0);
        Double d2 = this.A01;
        double d3 = 200.0d;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 200.0d;
        }
        parcel.writeDouble(d);
        Double d4 = this.A02;
        if (d4 != null) {
            d3 = d4.doubleValue();
        }
        parcel.writeDouble(d3);
        parcel.writeInt(this.A00);
        HashMap hashMap = this.A03;
        parcel.writeInt(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String A13 = DbT.A13(A1J);
            String A0s2 = DbS.A0s(A1J);
            parcel.writeString(A13);
            parcel.writeString(A0s2);
        }
    }
}
