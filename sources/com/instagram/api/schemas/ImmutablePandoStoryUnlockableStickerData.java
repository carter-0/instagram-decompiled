package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44468CfQ;
import X.C46114DMt;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryUnlockableStickerData extends 17P implements StoryUnlockableStickerData {
    public static final C3035269k CREATOR = CTA.A00(3);

    public final ImageURIDict C6x() {
        return (ImageURIDict) A05(2074606664, ImmutablePandoImageURIDict.class);
    }

    public final UnlockableStickerStatus CBf() {
        return (UnlockableStickerStatus) A0N(979171661, C46114DMt.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryUnlockableStickerData, com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44468CfQ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final StoryUnlockableStickerDataImpl FBs() {
        ImageURIDictImpl imageURIDictImpl;
        String A0e = A0e();
        String A0W = A0W();
        ImageURIDict C6x = C6x();
        if (C6x != null) {
            imageURIDictImpl = C6x.F5B();
        } else {
            imageURIDictImpl = null;
        }
        return new StoryUnlockableStickerDataImpl(imageURIDictImpl, CBf(), A0e, A0W);
    }

    public final String getId() {
        return A0e();
    }

    public final String getName() {
        return A0W();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
