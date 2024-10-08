package com.instagram.model.direct.stickerstore;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectStoreStickerResponseItem extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(43);
    public final int A00;
    public final int A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public DirectStoreStickerResponseItem(Boolean bool, Boolean bool2, Double d, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str6, 11);
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = d;
        this.A06 = str4;
        this.A05 = str5;
        this.A03 = bool;
        this.A02 = bool2;
        this.A0A = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectStoreStickerResponseItem) {
                DirectStoreStickerResponseItem directStoreStickerResponseItem = (DirectStoreStickerResponseItem) obj;
                if (!0qQ.A0K(this.A07, directStoreStickerResponseItem.A07) || !0qQ.A0K(this.A09, directStoreStickerResponseItem.A09) || !0qQ.A0K(this.A08, directStoreStickerResponseItem.A08) || this.A00 != directStoreStickerResponseItem.A00 || this.A01 != directStoreStickerResponseItem.A01 || !0qQ.A0K(this.A04, directStoreStickerResponseItem.A04) || !0qQ.A0K(this.A06, directStoreStickerResponseItem.A06) || !0qQ.A0K(this.A05, directStoreStickerResponseItem.A05) || !0qQ.A0K(this.A03, directStoreStickerResponseItem.A03) || !0qQ.A0K(this.A02, directStoreStickerResponseItem.A02) || !0qQ.A0K(this.A0A, directStoreStickerResponseItem.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Double d = this.A04;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        C41848B3p.A1I(parcel, this.A03);
        C41848B3p.A1I(parcel, this.A02);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A0A, (((((((((((((((((AnonymousClass7TE.A0O(this.A07) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }
}
