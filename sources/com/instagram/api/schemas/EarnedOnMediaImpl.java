package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class EarnedOnMediaImpl extends AnonymousClass0T0 implements Parcelable, EarnedOnMedia {
    public static final Parcelable.Creator CREATOR = DE7.A00(55);
    public final EarnedOnMediaState A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public EarnedOnMediaImpl(EarnedOnMediaState earnedOnMediaState, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str4, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = earnedOnMediaState;
        this.A05 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EarnedOnMediaImpl) {
                EarnedOnMediaImpl earnedOnMediaImpl = (EarnedOnMediaImpl) obj;
                if (!0qQ.A0K(this.A01, earnedOnMediaImpl.A01) || !0qQ.A0K(this.A02, earnedOnMediaImpl.A02) || !0qQ.A0K(this.A03, earnedOnMediaImpl.A03) || !0qQ.A0K(this.A04, earnedOnMediaImpl.A04) || this.A00 != earnedOnMediaImpl.A00 || !0qQ.A0K(this.A05, earnedOnMediaImpl.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A04, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A05);
    }
}
