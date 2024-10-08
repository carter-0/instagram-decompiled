package com.instagram.model.direct.stickerstore;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectStoreSticker extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(42);
    public final TypedImageUrl A00;
    public final TypedImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectStoreSticker) {
                DirectStoreSticker directStoreSticker = (DirectStoreSticker) obj;
                if (!0qQ.A0K(this.A04, directStoreSticker.A04) || !0qQ.A0K(this.A01, directStoreSticker.A01) || !0qQ.A0K(this.A00, directStoreSticker.A00) || !0qQ.A0K(this.A05, directStoreSticker.A05) || !0qQ.A0K(this.A02, directStoreSticker.A02) || !0qQ.A0K(this.A03, directStoreSticker.A03) || this.A06 != directStoreSticker.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        TypedImageUrl typedImageUrl = this.A01;
        if (typedImageUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typedImageUrl.writeToParcel(parcel, i);
        }
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        int A08 = (((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0C(this.A01)) * 31)) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return A08 + i;
    }

    public DirectStoreSticker(TypedImageUrl typedImageUrl, TypedImageUrl typedImageUrl2, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1P(str, typedImageUrl2);
        0qQ.A0B(str2, 4);
        this.A04 = str;
        this.A01 = typedImageUrl;
        this.A00 = typedImageUrl2;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A06 = z;
    }
}
