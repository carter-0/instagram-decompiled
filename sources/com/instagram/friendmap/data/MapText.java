package com.instagram.friendmap.data;

import X.0qQ;
import X.OSL;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public interface MapText extends Parcelable {
    public static final OSL A00 = OSL.A00;

    public final class Raw implements MapText {
        public static final Parcelable.Creator CREATOR = new W6E(56);
        public final String A00;

        public Raw(String str) {
            0qQ.A0B(str, 1);
            this.A00 = str;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    public final class Res implements MapText {
        public static final Parcelable.Creator CREATOR = new W6E(57);
        public final int A00;
        public final String[] A01;

        public Res(int i, String[] strArr) {
            0qQ.A0B(strArr, 2);
            this.A00 = i;
            this.A01 = strArr;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(this.A00);
            parcel.writeStringArray(this.A01);
        }
    }
}
