package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393559wd;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoStoryTemplateFillableStickersDict extends 17P implements StoryTemplateFillableStickersDict {
    public static final C3035269k CREATOR = new CTB(95);

    public final List B5n() {
        return A08(-1399026747, ImmutablePandoStoryTemplateFillableGalleryStickerDict.class);
    }

    public final StoryTemplateFillableMusicStickerDict B5o() {
        return (StoryTemplateFillableMusicStickerDict) A05(-1542167103, ImmutablePandoStoryTemplateFillableMusicStickerDict.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableStickersDict, com.instagram.api.schemas.StoryTemplateFillableStickersDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393559wd.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final StoryTemplateFillableStickersDictImpl FBb() {
        ArrayList arrayList;
        List<StoryTemplateFillableGalleryStickerDict> B5n = B5n();
        StoryTemplateFillableMusicStickerDictImpl storyTemplateFillableMusicStickerDictImpl = null;
        if (B5n != null) {
            arrayList = AnonymousClass7TG.A0r(B5n);
            for (StoryTemplateFillableGalleryStickerDict FBZ : B5n) {
                arrayList.add(FBZ.FBZ());
            }
        } else {
            arrayList = null;
        }
        StoryTemplateFillableMusicStickerDict B5o = B5o();
        if (B5o != null) {
            storyTemplateFillableMusicStickerDictImpl = B5o.FBa();
        }
        return new StoryTemplateFillableStickersDictImpl(storyTemplateFillableMusicStickerDictImpl, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableStickersDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
