package com.instagram.model.direct.stickerstore;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class StickerPack extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(44);
    public final String A00;
    public final List A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StickerPack) {
                StickerPack stickerPack = (StickerPack) obj;
                if (!0qQ.A0K(this.A04, stickerPack.A04) || !0qQ.A0K(this.A00, stickerPack.A00) || !0qQ.A0K(this.A02, stickerPack.A02) || !0qQ.A0K(this.A03, stickerPack.A03) || !0qQ.A0K(this.A01, stickerPack.A01)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            ((DirectStoreSticker) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return AnonymousClass7TE.A0N(this.A01, (((AnonymousClass7TF.A08(this.A00, A0O) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31);
    }

    public StickerPack(String str, String str2, String str3, String str4, List list) {
        AnonymousClass7TG.A1O(str, str2);
        this.A04 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = list;
    }
}
