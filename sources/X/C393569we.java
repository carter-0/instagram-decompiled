package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9we  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393569we {
    public static Map A00(StoryTemplateGiphyStickerDictIntf storyTemplateGiphyStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateGiphyStickerDictIntf.B9D() != null) {
            A1H.put("gif_id", storyTemplateGiphyStickerDictIntf.B9D());
        }
        if (storyTemplateGiphyStickerDictIntf.BFu() != null) {
            StoryTemplateGiphyStickerImageDictIntf BFu = storyTemplateGiphyStickerDictIntf.BFu();
            if (BFu != null) {
                treeUpdaterJNI = BFu.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("image", treeUpdaterJNI);
        }
        if (storyTemplateGiphyStickerDictIntf.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, storyTemplateGiphyStickerDictIntf.getTitle());
        }
        if (storyTemplateGiphyStickerDictIntf.getUsername() != null) {
            A1H.put(AnonymousClass9NF.A00(), storyTemplateGiphyStickerDictIntf.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
