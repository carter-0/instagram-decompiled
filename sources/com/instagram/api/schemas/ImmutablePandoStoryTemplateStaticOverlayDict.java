package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393619wj;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateStaticOverlayDict extends 17P implements StoryTemplateStaticOverlayDictIntf {
    public static final C3035269k CREATOR = new CTA(1);

    public final StoryTemplateGiphyStickerDictIntf B9L() {
        return (StoryTemplateGiphyStickerDictIntf) A05(682612812, ImmutablePandoStoryTemplateGiphyStickerDict.class);
    }

    public final float CGs() {
        return A02(120);
    }

    public final float CHR() {
        return A02(121);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf, com.instagram.api.schemas.ImmutablePandoStoryTemplateStaticOverlayDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393619wj.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final float BCs() {
        return A02(-1221029593);
    }

    public final float Bod() {
        return A02(-40300674);
    }

    public final String Bzp() {
        return A0h(-2030994180);
    }

    public final String C1V() {
        return A0h(-891995671);
    }

    public final float CGW() {
        return A02(113126854);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoStoryTemplateStaticOverlayDict] */
    public final StoryTemplateStaticOverlayDict FBh() {
        StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict;
        StoryTemplateGiphyStickerDictIntf B9L = B9L();
        if (B9L != null) {
            storyTemplateGiphyStickerDict = B9L.FBc();
        } else {
            storyTemplateGiphyStickerDict = null;
        }
        return new StoryTemplateStaticOverlayDict(storyTemplateGiphyStickerDict, A0h(-2030994180), A0h(-891995671), A02(-1221029593), A02(-40300674), A02(113126854), A02(120), A02(121), getIntValueByHashCode(-573585203));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateStaticOverlayDict] */
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateStaticOverlayDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
