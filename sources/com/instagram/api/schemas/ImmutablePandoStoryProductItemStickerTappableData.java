package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import X.DMY;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoStoryProductItemStickerTappableData extends 17P implements StoryProductItemStickerTappableDataIntf {
    public static final C3035269k CREATOR = CTB.A00(84);

    public final ProductItemStickerBundleStyle BEW() {
        return (ProductItemStickerBundleStyle) A0N(3355, DMY.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final StoryProductItemStickerTappableData FAk() {
        return new StoryProductItemStickerTappableData(BEW());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData, com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf] */
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
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
