package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class RankingInfo extends AnonymousClass0T0 implements Parcelable, RankingInfoIntf {
    public static final Parcelable.Creator CREATOR = new DE6(64);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RankingInfo) {
                RankingInfo rankingInfo = (RankingInfo) obj;
                if (!0qQ.A0K(this.A00, rankingInfo.A00) || !0qQ.A0K(this.A01, rankingInfo.A01) || !0qQ.A0K(this.A02, rankingInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final String BkH() {
        return this.A00;
    }

    public final String BnM() {
        return this.A01;
    }

    public final String CGl() {
        return this.A02;
    }

    public RankingInfo(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
