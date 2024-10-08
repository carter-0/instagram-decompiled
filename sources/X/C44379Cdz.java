package X;

import java.io.IOException;

/* renamed from: X.Cdz  reason: case insensitive filesystem */
public abstract class C44379Cdz {
    public static UNU parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("avatar_sticker_media_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("avatar_sticker_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("avatar_sticker_media_type", r8, "StoryAvatarQuickReactionDictImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new UNU(str, str2);
            } else {
                AnonymousClass7TF.A1L("avatar_sticker_url", r8, "StoryAvatarQuickReactionDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
