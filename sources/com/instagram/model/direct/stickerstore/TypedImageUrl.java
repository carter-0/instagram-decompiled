package com.instagram.model.direct.stickerstore;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class TypedImageUrl extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(46);
    public final ImageUrl A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TypedImageUrl) {
                TypedImageUrl typedImageUrl = (TypedImageUrl) obj;
                if (!0qQ.A0K(this.A00, typedImageUrl.A00) || !0qQ.A0K(this.A01, typedImageUrl.A01) || this.A02 != typedImageUrl.A02) {
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
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00));
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A08 + i;
    }

    public TypedImageUrl(ImageUrl imageUrl, String str, boolean z) {
        AnonymousClass7TG.A1O(imageUrl, str);
        this.A00 = imageUrl;
        this.A01 = str;
        this.A02 = z;
    }
}
