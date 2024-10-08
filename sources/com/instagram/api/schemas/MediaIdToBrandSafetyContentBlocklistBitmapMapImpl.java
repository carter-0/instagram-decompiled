package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaIdToBrandSafetyContentBlocklistBitmapMapImpl extends AnonymousClass0T0 implements Parcelable, MediaIdToBrandSafetyContentBlocklistBitmapMap {
    public static final Parcelable.Creator CREATOR = new FK5(65);
    public final BrandSafetyContentBlocklistBitmapQLObj A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) {
                MediaIdToBrandSafetyContentBlocklistBitmapMapImpl mediaIdToBrandSafetyContentBlocklistBitmapMapImpl = (MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) obj;
                if (!0qQ.A0K(this.A00, mediaIdToBrandSafetyContentBlocklistBitmapMapImpl.A00) || !0qQ.A0K(this.A01, mediaIdToBrandSafetyContentBlocklistBitmapMapImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public MediaIdToBrandSafetyContentBlocklistBitmapMapImpl(BrandSafetyContentBlocklistBitmapQLObj brandSafetyContentBlocklistBitmapQLObj, String str) {
        this.A00 = brandSafetyContentBlocklistBitmapQLObj;
        this.A01 = str;
    }
}
