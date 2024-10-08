package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import java.io.IOException;

/* renamed from: X.9wh  reason: invalid class name and case insensitive filesystem */
public abstract class C393599wh {
    public static StoryTemplateMusicAssetInfoDict parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (AnonymousClass000.A00(573).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("cover_artwork_uri".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("duration_in_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("has_lyrics".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("is_explicit".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("progressive_download_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new StoryTemplateMusicAssetInfoDict(bool, bool2, num, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
