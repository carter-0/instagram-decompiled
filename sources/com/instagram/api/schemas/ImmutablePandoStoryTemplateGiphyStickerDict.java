package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393569we;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateGiphyStickerDict extends 17P implements StoryTemplateGiphyStickerDictIntf {
    public static final C3035269k CREATOR = new CTB(96);

    public final StoryTemplateGiphyStickerImageDictIntf BFu() {
        return (StoryTemplateGiphyStickerImageDictIntf) A05(100313435, ImmutablePandoStoryTemplateGiphyStickerImageDict.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf, com.instagram.api.schemas.ImmutablePandoStoryTemplateGiphyStickerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393569we.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B9D() {
        return A0i(-1246061706);
    }

    public final StoryTemplateGiphyStickerDict FBc() {
        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict;
        String A0i = A0i(-1246061706);
        StoryTemplateGiphyStickerImageDictIntf BFu = BFu();
        if (BFu != null) {
            storyTemplateGiphyStickerImageDict = BFu.FBd();
        } else {
            storyTemplateGiphyStickerImageDict = null;
        }
        return new StoryTemplateGiphyStickerDict(storyTemplateGiphyStickerImageDict, A0i, A0Y(), A0i(-265713450));
    }

    public final String getTitle() {
        return A0Y();
    }

    public final String getUsername() {
        return A0i(-265713450);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateGiphyStickerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
