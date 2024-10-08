package com.instagram.phonenumber.model;

import X.002;
import X.0mp;
import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class CountryCodeData implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(69);
    public String A00;
    public String A01;
    public String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountryCodeData(int i, String str) {
        this(String.valueOf(i), new Locale("", str).getDisplayCountry(), str);
        0qQ.A0B(str, 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        return 002.A0D(this.A01, '+');
    }

    public final String A01() {
        return 0mp.A06("%s (+%s)", new Object[]{this.A02, this.A01});
    }

    public final String A02() {
        return 0mp.A06("%s +%s", new Object[]{this.A00, this.A01});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        CountryCodeData countryCodeData = (CountryCodeData) obj;
        int i = 0;
        0qQ.A0B(countryCodeData, 0);
        String str = this.A02;
        if (str == null || countryCodeData.A02 == null) {
            String str2 = countryCodeData.A02;
            if (str2 == null || str == null) {
                return -1;
            }
            i = str.compareTo(str2);
            if (Integer.valueOf(i) == null) {
                return -1;
            }
        }
        return i;
    }

    public CountryCodeData(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public CountryCodeData() {
        this.A01 = "";
        this.A00 = "";
    }
}
