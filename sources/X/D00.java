package X;

import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

public abstract class D00 {
    public static StoryTemplateAssetDict parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            ImageInfoImpl imageInfoImpl2 = null;
            Boolean bool = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("background_pk".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("background_versions2".equals(A17)) {
                    imageInfoImpl = 1dH.parseFromJson(r11);
                } else if ("image_versions2".equals(A17)) {
                    imageInfoImpl2 = 1dH.parseFromJson(r11);
                } else if ("is_pinned_gallery_opaque".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("pinned_gallery_opaque_percentage".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("pk".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (!"template_sticker_id".equals(A17)) {
                    num2 = C41847B3o.A13(r11, num2, A17, "z_index");
                } else if (r11.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r11.A1P();
                }
                r11.A0z();
            }
            return new StoryTemplateAssetDict(imageInfoImpl, imageInfoImpl2, bool, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, StoryTemplateAssetDict storyTemplateAssetDict) {
        r2.A0c();
        String str = storyTemplateAssetDict.A05;
        if (str != null) {
            r2.A0R("background_pk", str);
        }
        ImageInfo imageInfo = storyTemplateAssetDict.A00;
        if (imageInfo != null) {
            r2.A0q("background_versions2");
            1dH.A00(r2, imageInfo.FEa());
        }
        C41847B3o.A1J(r2, storyTemplateAssetDict.A01);
        Boolean bool = storyTemplateAssetDict.A02;
        if (bool != null) {
            r2.A0S("is_pinned_gallery_opaque", bool.booleanValue());
        }
        Integer num = storyTemplateAssetDict.A03;
        if (num != null) {
            r2.A0P("pinned_gallery_opaque_percentage", num.intValue());
        }
        String str2 = storyTemplateAssetDict.A06;
        if (str2 != null) {
            r2.A0R("pk", str2);
        }
        String str3 = storyTemplateAssetDict.A07;
        if (str3 != null) {
            r2.A0R("template_sticker_id", str3);
        }
        Integer num2 = storyTemplateAssetDict.A04;
        if (num2 != null) {
            r2.A0P("z_index", num2.intValue());
        }
        r2.A0Z();
    }
}
