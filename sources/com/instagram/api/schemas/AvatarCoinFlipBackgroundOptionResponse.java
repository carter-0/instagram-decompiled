package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;

public final class AvatarCoinFlipBackgroundOptionResponse extends AnonymousClass0T0 implements Parcelable, AvatarCoinFlipBackgroundOptionResponseIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(57);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AvatarCoinFlipBackgroundOptionResponse(String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipBackgroundOptionResponse) {
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) obj;
                if (!0qQ.A0K(this.A00, avatarCoinFlipBackgroundOptionResponse.A00) || !0qQ.A0K(this.A01, avatarCoinFlipBackgroundOptionResponse.A01) || !0qQ.A0K(this.A02, avatarCoinFlipBackgroundOptionResponse.A02) || !0qQ.A0K(this.A03, avatarCoinFlipBackgroundOptionResponse.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
