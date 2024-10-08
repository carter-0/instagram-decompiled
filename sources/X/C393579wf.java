package X;

import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wf  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393579wf {
    public static Map A00(StoryTemplateGiphyStickerImageDictIntf storyTemplateGiphyStickerImageDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateGiphyStickerImageDictIntf.BCv() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateGiphyStickerImageDictIntf.BCv());
        }
        if (storyTemplateGiphyStickerImageDictIntf.BUL() != null) {
            A1H.put("mp4_url", storyTemplateGiphyStickerImageDictIntf.BUL());
        }
        if (storyTemplateGiphyStickerImageDictIntf.getUrl() != null) {
            A1H.put("url", storyTemplateGiphyStickerImageDictIntf.getUrl());
        }
        if (storyTemplateGiphyStickerImageDictIntf.CGZ() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, storyTemplateGiphyStickerImageDictIntf.CGZ());
        }
        return 0Yt.A0B(A1H);
    }
}
