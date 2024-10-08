package com.instagram.common.gallery;

import X.0qQ;
import X.AnonymousClass5Ef;
import X.C253833rU;
import X.C347917xa;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;

public final class RemoteMedia implements Parcelable, AnonymousClass5Ef {
    public static final Parcelable.Creator CREATOR = new C376419Hx(73);
    public final float A00;
    public final int A01;
    public final MediaUploadMetadata A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final Integer A0A;
    public final Integer A0B;
    public final boolean A0C;

    public RemoteMedia(MediaUploadMetadata mediaUploadMetadata, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, Integer num3, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        float f;
        0qQ.A0B(str, 1);
        0qQ.A0B(imageUrl, 2);
        0qQ.A0B(imageUrl2, 5);
        0qQ.A0B(mediaUploadMetadata, 7);
        0qQ.A0B(str2, 8);
        this.A06 = str;
        this.A04 = imageUrl;
        this.A09 = z;
        this.A01 = i;
        this.A03 = imageUrl2;
        this.A05 = num;
        this.A02 = mediaUploadMetadata;
        this.A07 = str2;
        this.A08 = z2;
        this.A0C = z3;
        this.A0A = num2;
        this.A0B = num3;
        if (num3 == null || num2 == null) {
            f = 1.0f;
        } else {
            f = ((float) num3.intValue()) / ((float) num2.intValue());
        }
        this.A00 = f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A03, i);
        Integer num = this.A05;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        Integer num2 = this.A0A;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.A0B;
        if (num3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num3.intValue());
    }

    public final String B8E() {
        return C347917xa.A01(this.A01);
    }

    public final String BJR() {
        return this.A06;
    }

    public final int Boe() {
        return 0;
    }

    public final boolean COf() {
        return false;
    }

    public final boolean CeS() {
        return this.A09;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A06, ((RemoteMedia) obj).A06);
    }

    public final int getDuration() {
        return this.A01;
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public final boolean isValid() {
        return !C253833rU.A02(this.A04);
    }
}
