package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class OneTapLinkedProfileInfoImpl extends AnonymousClass0T0 implements Parcelable, OneTapLinkedProfileInfo {
    public static final Parcelable.Creator CREATOR = FK5.A00(98);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OneTapLinkedProfileInfoImpl) {
                OneTapLinkedProfileInfoImpl oneTapLinkedProfileInfoImpl = (OneTapLinkedProfileInfoImpl) obj;
                if (!0qQ.A0K(this.A04, oneTapLinkedProfileInfoImpl.A04) || !0qQ.A0K(this.A00, oneTapLinkedProfileInfoImpl.A00) || !0qQ.A0K(this.A01, oneTapLinkedProfileInfoImpl.A01) || !0qQ.A0K(this.A02, oneTapLinkedProfileInfoImpl.A02) || !0qQ.A0K(this.A03, oneTapLinkedProfileInfoImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public OneTapLinkedProfileInfoImpl(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }
}
