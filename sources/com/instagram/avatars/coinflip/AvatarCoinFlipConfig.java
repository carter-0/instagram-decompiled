package com.instagram.avatars.coinflip;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C320946tJ;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.common.AvatarInfo;

public final class AvatarCoinFlipConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(59);
    public C320946tJ A00;
    public AvatarInfo A01;
    public boolean A02;
    public boolean A03;
    public final AvatarCoinFlipBackgroundOptionResponse A04;
    public final AvatarCoinFlipSticker A05;
    public final AvatarCoinFlipSticker A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AvatarCoinFlipConfig(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, C320946tJ r5, AvatarInfo avatarInfo, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(avatarCoinFlipSticker, 1);
        0qQ.A0B(avatarCoinFlipSticker2, 2);
        this.A05 = avatarCoinFlipSticker;
        this.A06 = avatarCoinFlipSticker2;
        this.A04 = avatarCoinFlipBackgroundOptionResponse;
        this.A07 = str;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A00 = r5;
        this.A03 = z4;
        this.A01 = avatarInfo;
        this.A02 = z5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipConfig) {
                AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) obj;
                if (!(0qQ.A0K(this.A05, avatarCoinFlipConfig.A05) && 0qQ.A0K(this.A06, avatarCoinFlipConfig.A06) && 0qQ.A0K(this.A04, avatarCoinFlipConfig.A04) && 0qQ.A0K(this.A07, avatarCoinFlipConfig.A07) && this.A08 == avatarCoinFlipConfig.A08 && this.A09 == avatarCoinFlipConfig.A09 && this.A0A == avatarCoinFlipConfig.A0A && this.A00 == avatarCoinFlipConfig.A00 && this.A03 == avatarCoinFlipConfig.A03 && 0qQ.A0K(this.A01, avatarCoinFlipConfig.A01) && this.A02 == avatarCoinFlipConfig.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A05.writeToParcel(parcel, i);
        this.A06.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        C320946tJ r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r1.name());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = this.A04;
        int i = 0;
        if (avatarCoinFlipBackgroundOptionResponse == null) {
            hashCode = 0;
        } else {
            hashCode = avatarCoinFlipBackgroundOptionResponse.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A08) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0A) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        C320946tJ r0 = this.A00;
        if (r0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r0.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        int i11 = 1237;
        if (this.A03) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        AvatarInfo avatarInfo = this.A01;
        if (avatarInfo != null) {
            i = avatarInfo.hashCode();
        }
        int i13 = (i12 + i) * 31;
        int i14 = 1237;
        if (this.A02) {
            i14 = 1231;
        }
        return i13 + i14;
    }
}
