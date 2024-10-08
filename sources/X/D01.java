package X;

import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import java.io.IOException;

public abstract class D01 {
    public static StoryThenAndNowStickerDict parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("after_string".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("before_string".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (!C41845B3m.A17(A17)) {
                    bool = C41847B3o.A0z(r7, bool, A17, "is_before");
                } else if (r7.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r7.A1P();
                }
                r7.A0z();
            }
            return new StoryThenAndNowStickerDict(bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, StoryThenAndNowStickerDict storyThenAndNowStickerDict, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = storyThenAndNowStickerDict.A01;
        if (str != null) {
            r2.A0R("after_string", str);
        }
        String str2 = storyThenAndNowStickerDict.A02;
        if (str2 != null) {
            r2.A0R("before_string", str2);
        }
        C41846B3n.A0y(r2, storyThenAndNowStickerDict.A03);
        Boolean bool = storyThenAndNowStickerDict.A00;
        if (bool != null) {
            r2.A0S("is_before", bool.booleanValue());
        }
        if (z) {
            r2.A0Z();
        }
    }
}
