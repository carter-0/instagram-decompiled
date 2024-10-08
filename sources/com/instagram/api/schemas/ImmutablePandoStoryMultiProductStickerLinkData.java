package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoStoryMultiProductStickerLinkData extends 17P implements StoryMultiProductStickerLinkData {
    public static final C3035269k CREATOR = CTB.A00(82);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData] */
    public final Integer BMu() {
        return getOptionalIntValueByHashCode(1194206804);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData] */
    public final StoryMultiProductStickerLinkDataImpl FAU() {
        return new StoryMultiProductStickerLinkDataImpl(getOptionalIntValueByHashCode(1194206804));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (getOptionalIntValueByHashCode(1194206804) != null) {
            A0t.put("linkType", getOptionalIntValueByHashCode(1194206804));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
