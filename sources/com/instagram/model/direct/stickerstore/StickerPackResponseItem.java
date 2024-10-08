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

public final class StickerPackResponseItem extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(45);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StickerPackResponseItem) {
                StickerPackResponseItem stickerPackResponseItem = (StickerPackResponseItem) obj;
                if (!0qQ.A0K(this.A02, stickerPackResponseItem.A02) || !0qQ.A0K(this.A03, stickerPackResponseItem.A03) || !0qQ.A0K(this.A00, stickerPackResponseItem.A00) || !0qQ.A0K(this.A01, stickerPackResponseItem.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public StickerPackResponseItem(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
