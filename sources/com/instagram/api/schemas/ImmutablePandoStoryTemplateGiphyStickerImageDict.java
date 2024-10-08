package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393579wf;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateGiphyStickerImageDict extends 17P implements StoryTemplateGiphyStickerImageDictIntf {
    public static final C3035269k CREATOR = new CTB(97);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateGiphyStickerImageDict, com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393579wf.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BCv() {
        return A0i(-1221029593);
    }

    public final String BUL() {
        return A0i(1211087649);
    }

    public final String CGZ() {
        return A0i(113126854);
    }

    public final StoryTemplateGiphyStickerImageDict FBd() {
        return new StoryTemplateGiphyStickerImageDict(A0i(-1221029593), A0i(1211087649), A0V(), A0i(113126854));
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoStoryTemplateGiphyStickerImageDict, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
