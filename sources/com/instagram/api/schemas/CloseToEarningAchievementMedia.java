package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class CloseToEarningAchievementMedia extends AnonymousClass0T0 implements Parcelable, CloseToEarningAchievementMediaIntf {
    public static final Parcelable.Creator CREATOR = DE7.A00(10);
    public final int A00;
    public final String A01;
    public final String A02;

    public CloseToEarningAchievementMedia(String str, String str2, int i) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CloseToEarningAchievementMedia) {
                CloseToEarningAchievementMedia closeToEarningAchievementMedia = (CloseToEarningAchievementMedia) obj;
                if (!0qQ.A0K(this.A01, closeToEarningAchievementMedia.A01) || !0qQ.A0K(this.A02, closeToEarningAchievementMedia.A02) || this.A00 != closeToEarningAchievementMedia.A00) {
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
        parcel.writeInt(this.A00);
    }

    public final String BQ0() {
        return this.A01;
    }

    public final int BhS() {
        return this.A00;
    }

    public final String getMediaId() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A01) * 31) + this.A00;
    }
}
