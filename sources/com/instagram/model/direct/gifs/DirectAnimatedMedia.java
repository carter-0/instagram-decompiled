package com.instagram.model.direct.gifs;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass53H;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.GifUrlImpl;

public final class DirectAnimatedMedia extends AnonymousClass0T0 implements Parcelable, AnonymousClass53H {
    public static final Parcelable.Creator CREATOR = new C376399Hv(20);
    public String A00;
    public final DirectAnimatedMediaUser A01;
    public final GifUrlImpl A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;
    public final boolean A06;

    public DirectAnimatedMedia(DirectAnimatedMediaUser directAnimatedMediaUser, GifUrlImpl gifUrlImpl, Boolean bool, Boolean bool2, String str, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(gifUrlImpl, 2);
        this.A05 = str;
        this.A02 = gifUrlImpl;
        this.A04 = bool;
        this.A06 = z;
        this.A01 = directAnimatedMediaUser;
        this.A03 = bool2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectAnimatedMedia) {
                DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) obj;
                if (!0qQ.A0K(this.A05, directAnimatedMedia.A05) || !0qQ.A0K(this.A02, directAnimatedMedia.A02) || !0qQ.A0K(this.A04, directAnimatedMedia.A04) || this.A06 != directAnimatedMedia.A06 || !0qQ.A0K(this.A01, directAnimatedMedia.A01) || !0qQ.A0K(this.A03, directAnimatedMedia.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directAnimatedMediaUser.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public final DirectAnimatedMediaUser CCc() {
        return this.A01;
    }

    public final Boolean COc() {
        return this.A03;
    }

    public final boolean CcW() {
        return this.A06;
    }

    public final String getId() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31;
        Boolean bool = this.A04;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = directAnimatedMediaUser.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Boolean bool2 = this.A03;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i5 + i;
    }
}
