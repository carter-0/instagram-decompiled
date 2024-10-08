package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class StoryProductItemStickerTappableData extends AnonymousClass0T0 implements Parcelable, StoryProductItemStickerTappableDataIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(98);
    public final ProductItemStickerBundleStyle A00;

    public final StoryProductItemStickerTappableData FAk() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StoryProductItemStickerTappableData) && this.A00 == ((StoryProductItemStickerTappableData) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final ProductItemStickerBundleStyle BEW() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public StoryProductItemStickerTappableData(ProductItemStickerBundleStyle productItemStickerBundleStyle) {
        this.A00 = productItemStickerBundleStyle;
    }

    public final TreeUpdaterJNI FHC() {
        String str;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BEW() != null) {
            ProductItemStickerBundleStyle BEW = BEW();
            if (BEW != null) {
                str = BEW.A00;
            } else {
                str = null;
            }
            C41845B3m.A0x(str, A0t);
        }
        return C41845B3m.A0T("XDTStoryProductItemStickerTappableData", 0Yt.A0B(A0t));
    }
}
