package com.instagram.discovery.mediamap.intf;

import X.002;
import X.2PP;
import X.C16614UyA;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaMapQuery implements Parcelable {
    public static final MediaMapQuery A08 = new MediaMapQuery(C16614UyA.POPULAR, "17843767138059124", "popular");
    public static final MediaMapQuery A09 = new MediaMapQuery(C16614UyA.SAVED, "saved", "saved");
    public static final Parcelable.Creator CREATOR = new W6E(31);
    public String A00;
    public String A01;
    public String A02;
    public List A03 = new ArrayList();
    public boolean A04;
    public boolean A05;
    public final C16614UyA A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MediaMapQuery)) {
            return false;
        }
        MediaMapQuery mediaMapQuery = (MediaMapQuery) obj;
        return 2PP.A00(this.A07, mediaMapQuery.A07) && 2PP.A00(this.A06, mediaMapQuery.A06);
    }

    public final String A00() {
        String str;
        String str2;
        int ordinal = this.A06.ordinal();
        if (ordinal == 3) {
            return "";
        }
        if (ordinal == 1) {
            str = "#";
            str2 = this.A01;
        } else if (ordinal != 0) {
            return this.A01;
        } else {
            String str3 = this.A01;
            str = String.valueOf(str3.charAt(0)).toUpperCase();
            str2 = str3.substring(1);
        }
        return 002.A0R(str, str2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A06, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06.ordinal());
    }

    public MediaMapQuery(C16614UyA uyA, String str, String str2) {
        this.A06 = uyA;
        this.A07 = str;
        this.A01 = str2;
    }

    public MediaMapQuery(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A07 = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A01 = readString2;
        this.A06 = C16614UyA.values()[parcel.readInt()];
    }
}
