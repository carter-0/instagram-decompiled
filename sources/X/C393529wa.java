package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9wa  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393529wa {
    public static Map A00(StoryTemplateDictIntf storyTemplateDictIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (storyTemplateDictIntf.B5p() != null) {
            StoryTemplateFillableStickersDict B5p = storyTemplateDictIntf.B5p();
            if (B5p != null) {
                treeUpdaterJNI3 = B5p.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("fillable_stickers", treeUpdaterJNI3);
        }
        if (storyTemplateDictIntf.CSG() != null) {
            A1H.put(C273654mx.A00(316), storyTemplateDictIntf.CSG());
        }
        if (storyTemplateDictIntf.CU1() != null) {
            A1H.put(AnonymousClass000.A00(3432), storyTemplateDictIntf.CU1());
        }
        if (storyTemplateDictIntf.BV3() != null) {
            StoryTemplateMusicStickerDictIntf BV3 = storyTemplateDictIntf.BV3();
            if (BV3 != null) {
                treeUpdaterJNI2 = BV3.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("music_sticker", treeUpdaterJNI2);
        }
        if (storyTemplateDictIntf.BnV() != null) {
            StoryTemplateReshareMediaDict BnV = storyTemplateDictIntf.BnV();
            if (BnV != null) {
                treeUpdaterJNI = BnV.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("reshare_media", treeUpdaterJNI);
        }
        if (storyTemplateDictIntf.C0B() != null) {
            List<StoryTemplateAvatarStickerOverlayDict> C0B = storyTemplateDictIntf.C0B();
            if (C0B != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : C0B) {
                    if (storyTemplateAvatarStickerOverlayDict != null) {
                        arrayList3.add(storyTemplateAvatarStickerOverlayDict.FHC());
                    }
                }
            } else {
                arrayList3 = null;
            }
            A1H.put("story_avatar_overlays", arrayList3);
        }
        if (storyTemplateDictIntf.C0G() != null) {
            List<StoryTemplateCaptionDictIntf> C0G = storyTemplateDictIntf.C0G();
            if (C0G != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf : C0G) {
                    if (storyTemplateCaptionDictIntf != null) {
                        arrayList2.add(storyTemplateCaptionDictIntf.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("story_captions", arrayList2);
        }
        if (storyTemplateDictIntf.C1I() != null) {
            List<StoryTemplateStaticOverlayDictIntf> C1I = storyTemplateDictIntf.C1I();
            if (C1I != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf : C1I) {
                    if (storyTemplateStaticOverlayDictIntf != null) {
                        arrayList.add(storyTemplateStaticOverlayDictIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("story_static_overlays", arrayList);
        }
        if (storyTemplateDictIntf.C4X() != null) {
            StoryTemplateAssetDictIntf C4X = storyTemplateDictIntf.C4X();
            if (C4X != null) {
                treeUpdaterJNI4 = C4X.FHC();
            }
            A1H.put("template_asset", treeUpdaterJNI4);
        }
        if (storyTemplateDictIntf.C4d() != null) {
            A1H.put("template_sticker_ids", storyTemplateDictIntf.C4d());
        }
        return 0Yt.A0B(A1H);
    }
}
