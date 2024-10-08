package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DbW;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class CachedExternalLoginUserImpl extends AnonymousClass0T0 implements Parcelable, CachedExternalLoginUser {
    public static final Parcelable.Creator CREATOR = new SWT(80);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public CachedExternalLoginUserImpl(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5) {
        DbW.A1O(str3, 3, str5);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedExternalLoginUserImpl) {
                CachedExternalLoginUserImpl cachedExternalLoginUserImpl = (CachedExternalLoginUserImpl) obj;
                if (!0qQ.A0K(this.A01, cachedExternalLoginUserImpl.A01) || !0qQ.A0K(this.A02, cachedExternalLoginUserImpl.A02) || !0qQ.A0K(this.A03, cachedExternalLoginUserImpl.A03) || !0qQ.A0K(this.A00, cachedExternalLoginUserImpl.A00) || !0qQ.A0K(this.A04, cachedExternalLoginUserImpl.A04) || !0qQ.A0K(this.A05, cachedExternalLoginUserImpl.A05)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        String str = this.A03;
        return C41845B3m.A01(this.A05, (((AnonymousClass7TF.A08(str, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A04)) * 31);
    }
}
