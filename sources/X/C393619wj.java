package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wj  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393619wj {
    public static Map A00(StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateStaticOverlayDictIntf.B9L() != null) {
            StoryTemplateGiphyStickerDictIntf B9L = storyTemplateStaticOverlayDictIntf.B9L();
            if (B9L != null) {
                treeUpdaterJNI = B9L.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("giphy_sticker_data", treeUpdaterJNI);
        }
        storyTemplateStaticOverlayDictIntf.BCs();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TF.A0T(storyTemplateStaticOverlayDictIntf.BCs()));
        storyTemplateStaticOverlayDictIntf.Bod();
        A1H.put("rotation", AnonymousClass7TF.A0T(storyTemplateStaticOverlayDictIntf.Bod()));
        if (storyTemplateStaticOverlayDictIntf.Bzp() != null) {
            A1H.put("sticker_type", storyTemplateStaticOverlayDictIntf.Bzp());
        }
        if (storyTemplateStaticOverlayDictIntf.C1V() != null) {
            A1H.put("str_id", storyTemplateStaticOverlayDictIntf.C1V());
        }
        storyTemplateStaticOverlayDictIntf.CGW();
        A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TF.A0T(storyTemplateStaticOverlayDictIntf.CGW()));
        storyTemplateStaticOverlayDictIntf.CGs();
        A1H.put("x", AnonymousClass7TF.A0T(storyTemplateStaticOverlayDictIntf.CGs()));
        storyTemplateStaticOverlayDictIntf.CHR();
        A1H.put("y", AnonymousClass7TF.A0T(storyTemplateStaticOverlayDictIntf.CHR()));
        storyTemplateStaticOverlayDictIntf.getZIndex();
        return AnonymousClass7TG.A0s(A1H, storyTemplateStaticOverlayDictIntf.getZIndex());
    }
}
