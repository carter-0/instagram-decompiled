package com.instagram.model.mediasize;

import X.0qQ;
import X.17P;
import X.A0W;
import X.C3035269k;
import X.C376379Ht;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoSpriteSheetInfoCandidates extends 17P implements SpriteSheetInfoCandidates {
    public static final C3035269k CREATOR = new C376379Ht(8);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpriteSheetInfoCandidates] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final SpritesheetInfo CHi() {
        return (SpritesheetInfo) A05(1544803905, ImmutablePandoSpritesheetInfo.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.SpriteSheetInfoCandidates, com.instagram.model.mediasize.ImmutablePandoSpriteSheetInfoCandidates] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(A0W.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final SpriteSheetInfoCandidatesImpl FEb() {
        SpritesheetInfoImpl spritesheetInfoImpl;
        SpritesheetInfo CHi = CHi();
        if (CHi != null) {
            spritesheetInfoImpl = CHi.FEc();
        } else {
            spritesheetInfoImpl = null;
        }
        return new SpriteSheetInfoCandidatesImpl(spritesheetInfoImpl);
    }
}
