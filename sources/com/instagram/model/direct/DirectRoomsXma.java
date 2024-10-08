package com.instagram.model.direct;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectRoomsXma extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public DirectRoomsXma(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A06 = z;
        this.A01 = str5;
        this.A05 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectRoomsXma) {
                DirectRoomsXma directRoomsXma = (DirectRoomsXma) obj;
                if (!0qQ.A0K(this.A00, directRoomsXma.A00) || !0qQ.A0K(this.A04, directRoomsXma.A04) || !0qQ.A0K(this.A03, directRoomsXma.A03) || !0qQ.A0K(this.A02, directRoomsXma.A02) || this.A06 != directRoomsXma.A06 || !0qQ.A0K(this.A01, directRoomsXma.A01) || !0qQ.A0K(this.A05, directRoomsXma.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectRoomsXma(roomsLink=");
        sb.append(this.A00);
        sb.append(", roomsTitle=");
        sb.append(this.A04);
        sb.append(", roomsSubtitle=");
        sb.append(this.A03);
        sb.append(", roomsName=");
        sb.append(this.A02);
        sb.append(", isAudioOnly=");
        sb.append(this.A06);
        sb.append(", roomsLinkHash=");
        sb.append(this.A01);
        sb.append(", roomsXmaType=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A06, (((((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A05);
    }
}
