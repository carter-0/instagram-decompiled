package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import java.util.ArrayList;
import java.util.List;

public class A9D {
    public StoryTemplateAssetDictIntf A00;
    public StoryTemplateFillableStickersDict A01;
    public StoryTemplateMusicStickerDictIntf A02;
    public StoryTemplateReshareMediaDict A03;
    public Boolean A04;
    public Boolean A05;
    public List A06;
    public List A07;
    public List A08;
    public List A09;
    public final StoryTemplateDictIntf A0A;

    public final StoryTemplateDictIntf A00() {
        Object obj;
        StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict;
        StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        StoryTemplateDictIntf storyTemplateDictIntf = this.A0A;
        if (storyTemplateDictIntf instanceof ImmutablePandoStoryTemplateDict) {
            StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = this.A01;
            TreeUpdaterJNI treeUpdaterJNI4 = null;
            if (storyTemplateFillableStickersDict != null) {
                treeUpdaterJNI = storyTemplateFillableStickersDict.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("fillable_stickers", treeUpdaterJNI);
            0eP A1L2 = AnonymousClass7TE.A1L(C273654mx.A00(316), this.A04);
            0eP A1L3 = AnonymousClass7TE.A1L(AnonymousClass000.A00(3432), this.A05);
            StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf = this.A02;
            if (storyTemplateMusicStickerDictIntf != null) {
                treeUpdaterJNI2 = storyTemplateMusicStickerDictIntf.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("music_sticker", treeUpdaterJNI2);
            StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = this.A03;
            if (storyTemplateReshareMediaDict != null) {
                treeUpdaterJNI3 = storyTemplateReshareMediaDict.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            0eP A1L5 = AnonymousClass7TE.A1L("reshare_media", treeUpdaterJNI3);
            List<StoryTemplateAvatarStickerOverlayDict> list = this.A06;
            if (list != null) {
                arrayList4 = AnonymousClass7TE.A1C();
                for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : list) {
                    if (storyTemplateAvatarStickerOverlayDict != null) {
                        arrayList4.add(storyTemplateAvatarStickerOverlayDict.FHC());
                    }
                }
            } else {
                arrayList4 = null;
            }
            0eP A1L6 = AnonymousClass7TE.A1L("story_avatar_overlays", arrayList4);
            List<StoryTemplateCaptionDictIntf> list2 = this.A07;
            if (list2 != null) {
                arrayList5 = AnonymousClass7TE.A1C();
                for (StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf : list2) {
                    if (storyTemplateCaptionDictIntf != null) {
                        arrayList5.add(storyTemplateCaptionDictIntf.FHC());
                    }
                }
            } else {
                arrayList5 = null;
            }
            0eP A1L7 = AnonymousClass7TE.A1L("story_captions", arrayList5);
            List<StoryTemplateStaticOverlayDictIntf> list3 = this.A08;
            if (list3 != null) {
                arrayList6 = AnonymousClass7TE.A1C();
                for (StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf : list3) {
                    if (storyTemplateStaticOverlayDictIntf != null) {
                        arrayList6.add(storyTemplateStaticOverlayDictIntf.FHC());
                    }
                }
            } else {
                arrayList6 = null;
            }
            0eP A1L8 = AnonymousClass7TE.A1L("story_static_overlays", arrayList6);
            StoryTemplateAssetDictIntf storyTemplateAssetDictIntf = this.A00;
            if (storyTemplateAssetDictIntf != null) {
                treeUpdaterJNI4 = storyTemplateAssetDictIntf.FHC();
            }
            TreeJNI treeJNI = (TreeJNI) storyTemplateDictIntf;
            obj = new TreeUpdaterJNI(0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L("template_asset", treeUpdaterJNI4), AnonymousClass7TE.A1L("template_sticker_ids", this.A09)}), treeJNI).applyToTree(treeJNI);
            0qQ.A07(obj);
        } else {
            StoryTemplateFillableStickersDict storyTemplateFillableStickersDict2 = this.A01;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            if (storyTemplateFillableStickersDict2 != null) {
                storyTemplateFillableStickersDictImpl = storyTemplateFillableStickersDict2.FBb();
            } else {
                storyTemplateFillableStickersDictImpl = null;
            }
            Boolean bool = this.A04;
            Boolean bool2 = this.A05;
            StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf2 = this.A02;
            if (storyTemplateMusicStickerDictIntf2 != null) {
                storyTemplateMusicStickerDict = storyTemplateMusicStickerDictIntf2.FBf();
            } else {
                storyTemplateMusicStickerDict = null;
            }
            StoryTemplateReshareMediaDict storyTemplateReshareMediaDict2 = this.A03;
            if (storyTemplateReshareMediaDict2 != null) {
                storyTemplateReshareMediaDictImpl = storyTemplateReshareMediaDict2.FBg();
            } else {
                storyTemplateReshareMediaDictImpl = null;
            }
            List<StoryTemplateAvatarStickerOverlayDict> list4 = this.A06;
            if (list4 != null) {
                arrayList = AnonymousClass7TF.A0p(list4);
                for (StoryTemplateAvatarStickerOverlayDict FBW : list4) {
                    arrayList.add(FBW.FBW());
                }
            } else {
                arrayList = null;
            }
            List<StoryTemplateCaptionDictIntf> list5 = this.A07;
            if (list5 != null) {
                arrayList2 = AnonymousClass7TF.A0p(list5);
                for (StoryTemplateCaptionDictIntf FBX : list5) {
                    arrayList2.add(FBX.FBX());
                }
            } else {
                arrayList2 = null;
            }
            List<StoryTemplateStaticOverlayDictIntf> list6 = this.A08;
            if (list6 != null) {
                arrayList3 = AnonymousClass7TF.A0p(list6);
                for (StoryTemplateStaticOverlayDictIntf FBh : list6) {
                    arrayList3.add(FBh.FBh());
                }
            } else {
                arrayList3 = null;
            }
            StoryTemplateAssetDictIntf storyTemplateAssetDictIntf2 = this.A00;
            if (storyTemplateAssetDictIntf2 != null) {
                storyTemplateAssetDict = storyTemplateAssetDictIntf2.FBV();
            }
            obj = new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, bool, bool2, arrayList, arrayList2, arrayList3, this.A09);
        }
        return (StoryTemplateDictIntf) obj;
    }

    public A9D(StoryTemplateDictIntf storyTemplateDictIntf) {
        this.A0A = storyTemplateDictIntf;
        this.A01 = storyTemplateDictIntf.B5p();
        this.A04 = storyTemplateDictIntf.CSG();
        this.A05 = storyTemplateDictIntf.CU1();
        this.A02 = storyTemplateDictIntf.BV3();
        this.A03 = storyTemplateDictIntf.BnV();
        this.A06 = storyTemplateDictIntf.C0B();
        this.A07 = storyTemplateDictIntf.C0G();
        this.A08 = storyTemplateDictIntf.C1I();
        this.A00 = storyTemplateDictIntf.C4X();
        this.A09 = storyTemplateDictIntf.C4d();
    }
}
