package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import java.io.IOException;

/* renamed from: X.8uE  reason: invalid class name and case insensitive filesystem */
public abstract class C369298uE {
    public static StoryTemplateGiphyStickerDict parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("gif_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("image".equals(A0q)) {
                    storyTemplateGiphyStickerImageDict = C369308uF.parseFromJson(r9);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (AnonymousClass9NF.A02(42, 8, 57).equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new StoryTemplateGiphyStickerDict(storyTemplateGiphyStickerImageDict, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
