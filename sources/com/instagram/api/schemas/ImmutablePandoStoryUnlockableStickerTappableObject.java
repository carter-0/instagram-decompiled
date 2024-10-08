package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44470CfS;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoStoryUnlockableStickerTappableObject extends 17P implements StoryUnlockableStickerTappableObject {
    public static final C3035269k CREATOR = CTA.A00(4);

    public final List Bzq() {
        return A08(1531715286, ImmutablePandoStoryUnlockableStickerData.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryUnlockableStickerTappableObject, com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerTappableObject] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44470CfS.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final StoryUnlockableStickerTappableObjectImpl FBt() {
        ArrayList arrayList;
        List<StoryUnlockableStickerData> Bzq = Bzq();
        if (Bzq != null) {
            arrayList = AnonymousClass7TG.A0r(Bzq);
            for (StoryUnlockableStickerData FBs : Bzq) {
                arrayList.add(FBs.FBs());
            }
        } else {
            arrayList = null;
        }
        return new StoryUnlockableStickerTappableObjectImpl(A0U(), A0Y(), arrayList);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerTappableObject] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
