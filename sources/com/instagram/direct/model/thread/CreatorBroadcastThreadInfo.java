package com.instagram.direct.model.thread;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class CreatorBroadcastThreadInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(0);
    public int A00 = 0;
    public int A01 = 0;
    public ImageUrl A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;
    public String A06 = null;
    public boolean A07 = false;
    public boolean A08 = false;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorBroadcastThreadInfo) {
                CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = (CreatorBroadcastThreadInfo) obj;
                if (!0qQ.A0K(this.A03, creatorBroadcastThreadInfo.A03) || !0qQ.A0K(this.A02, creatorBroadcastThreadInfo.A02) || this.A07 != creatorBroadcastThreadInfo.A07 || this.A00 != creatorBroadcastThreadInfo.A00 || !0qQ.A0K(this.A05, creatorBroadcastThreadInfo.A05) || this.A08 != creatorBroadcastThreadInfo.A08 || this.A01 != creatorBroadcastThreadInfo.A01 || !0qQ.A0K(this.A04, creatorBroadcastThreadInfo.A04) || !0qQ.A0K(this.A06, creatorBroadcastThreadInfo.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        ImageUrl imageUrl = this.A02;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (((i3 + i4) * 31) + this.A00) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        int i7 = 1237;
        if (this.A08) {
            i7 = 1231;
        }
        int i8 = (((i6 + i7) * 31) + this.A01) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        String str4 = this.A06;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i9 + i;
    }
}
