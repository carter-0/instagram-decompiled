package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.model.mediasize.ImageInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cf7  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44449Cf7 {
    public static Map A00(StoryTemplateAssetDictIntf storyTemplateAssetDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateAssetDictIntf.Aer() != null) {
            A1H.put("background_pk", storyTemplateAssetDictIntf.Aer());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyTemplateAssetDictIntf.Aew() != null) {
            ImageInfo Aew = storyTemplateAssetDictIntf.Aew();
            if (Aew != null) {
                treeUpdaterJNI = Aew.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("background_versions2", treeUpdaterJNI);
        }
        if (storyTemplateAssetDictIntf.BGO() != null) {
            ImageInfo BGO = storyTemplateAssetDictIntf.BGO();
            if (BGO != null) {
                treeUpdaterJNI2 = BGO.FHC();
            }
            A1H.put("image_versions2", treeUpdaterJNI2);
        }
        if (storyTemplateAssetDictIntf.CZC() != null) {
            A1H.put("is_pinned_gallery_opaque", storyTemplateAssetDictIntf.CZC());
        }
        if (storyTemplateAssetDictIntf.BcU() != null) {
            A1H.put("pinned_gallery_opaque_percentage", storyTemplateAssetDictIntf.BcU());
        }
        if (storyTemplateAssetDictIntf.getPk() != null) {
            A1H.put("pk", storyTemplateAssetDictIntf.getPk());
        }
        if (storyTemplateAssetDictIntf.C4c() != null) {
            A1H.put("template_sticker_id", storyTemplateAssetDictIntf.C4c());
        }
        if (storyTemplateAssetDictIntf.CHa() != null) {
            A1H.put("z_index", storyTemplateAssetDictIntf.CHa());
        }
        return 0Yt.A0B(A1H);
    }
}
