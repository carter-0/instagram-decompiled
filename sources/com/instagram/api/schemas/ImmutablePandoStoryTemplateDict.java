package com.instagram.api.schemas;

import X.17P;
import X.A9D;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393529wa;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoStoryTemplateDict extends 17P implements StoryTemplateDictIntf {
    public static final C3035269k CREATOR = new CTB(92);

    public final /* synthetic */ A9D AKS() {
        return new A9D(this);
    }

    public final StoryTemplateFillableStickersDict B5p() {
        return (StoryTemplateFillableStickersDict) A05(-1099860104, ImmutablePandoStoryTemplateFillableStickersDict.class);
    }

    public final StoryTemplateMusicStickerDictIntf BV3() {
        return (StoryTemplateMusicStickerDictIntf) A05(-1724798685, ImmutablePandoStoryTemplateMusicStickerDict.class);
    }

    public final StoryTemplateReshareMediaDict BnV() {
        return (StoryTemplateReshareMediaDict) A05(1465295729, ImmutablePandoStoryTemplateReshareMediaDict.class);
    }

    public final List C0B() {
        return A08(-2044334337, ImmutablePandoStoryTemplateAvatarStickerOverlayDict.class);
    }

    public final List C0G() {
        return A08(-1493295273, ImmutablePandoStoryTemplateCaptionDict.class);
    }

    public final List C1I() {
        return A08(1789905290, ImmutablePandoStoryTemplateStaticOverlayDict.class);
    }

    public final StoryTemplateAssetDictIntf C4X() {
        return (StoryTemplateAssetDictIntf) A05(-1303161109, ImmutablePandoStoryTemplateAssetDict.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict, com.instagram.api.schemas.StoryTemplateDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393529wa.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict] */
    public final List C4d() {
        return getOptionalStringListByHashCode(-134796175);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict] */
    public final Boolean CSG() {
        return getOptionalBooleanValueByHashCode(1850495666);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict] */
    public final Boolean CU1() {
        return getOptionalBooleanValueByHashCode(-1966983554);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict] */
    public final StoryTemplateDict FBY() {
        StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict;
        StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        StoryTemplateFillableStickersDict B5p = B5p();
        StoryTemplateAssetDict storyTemplateAssetDict = null;
        if (B5p != null) {
            storyTemplateFillableStickersDictImpl = B5p.FBb();
        } else {
            storyTemplateFillableStickersDictImpl = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1850495666);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1966983554);
        StoryTemplateMusicStickerDictIntf BV3 = BV3();
        if (BV3 != null) {
            storyTemplateMusicStickerDict = BV3.FBf();
        } else {
            storyTemplateMusicStickerDict = null;
        }
        StoryTemplateReshareMediaDict BnV = BnV();
        if (BnV != null) {
            storyTemplateReshareMediaDictImpl = BnV.FBg();
        } else {
            storyTemplateReshareMediaDictImpl = null;
        }
        List<StoryTemplateAvatarStickerOverlayDict> C0B = C0B();
        if (C0B != null) {
            arrayList = AnonymousClass7TF.A0p(C0B);
            for (StoryTemplateAvatarStickerOverlayDict FBW : C0B) {
                arrayList.add(FBW.FBW());
            }
        } else {
            arrayList = null;
        }
        List<StoryTemplateCaptionDictIntf> C0G = C0G();
        if (C0G != null) {
            arrayList2 = AnonymousClass7TF.A0p(C0G);
            for (StoryTemplateCaptionDictIntf FBX : C0G) {
                arrayList2.add(FBX.FBX());
            }
        } else {
            arrayList2 = null;
        }
        List<StoryTemplateStaticOverlayDictIntf> C1I = C1I();
        if (C1I != null) {
            arrayList3 = AnonymousClass7TF.A0p(C1I);
            for (StoryTemplateStaticOverlayDictIntf FBh : C1I) {
                arrayList3.add(FBh.FBh());
            }
        } else {
            arrayList3 = null;
        }
        StoryTemplateAssetDictIntf C4X = C4X();
        if (C4X != null) {
            storyTemplateAssetDict = C4X.FBV();
        }
        return new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, arrayList, arrayList2, arrayList3, getOptionalStringListByHashCode(-134796175));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
