package com.instagram.avatars.coinflip;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class AvatarCoinFlipSticker extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(60);
    public final float A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public AvatarCoinFlipSticker(String str, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A01 = i5;
        this.A00 = ((float) i) / ((float) i5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipSticker) {
                AvatarCoinFlipSticker avatarCoinFlipSticker = (AvatarCoinFlipSticker) obj;
                if (!(0qQ.A0K(this.A03, avatarCoinFlipSticker.A03) && this.A02 == avatarCoinFlipSticker.A02 && this.A04 == avatarCoinFlipSticker.A04 && this.A05 == avatarCoinFlipSticker.A05 && this.A06 == avatarCoinFlipSticker.A06 && this.A01 == avatarCoinFlipSticker.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A03.hashCode() * 31) + this.A02) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
    }
}
