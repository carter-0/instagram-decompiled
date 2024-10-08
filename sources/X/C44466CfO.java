package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import java.io.IOException;

/* renamed from: X.CfO  reason: case insensitive filesystem */
public abstract class C44466CfO {
    public static BHX parseFromJson(16F r8) {
        String A00;
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(1584);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("media_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    storyTrendingPromptMediaSubType = (StoryTrendingPromptMediaSubType) StoryTrendingPromptMediaSubType.A01.get(str);
                    if (storyTrendingPromptMediaSubType == null) {
                        storyTrendingPromptMediaSubType = StoryTrendingPromptMediaSubType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r8, "StoryTrendingPromptMediaLoggingInfoImpl");
            } else if (storyTrendingPromptMediaSubType != null || !(r8 instanceof 0c9)) {
                return new BHX(storyTrendingPromptMediaSubType, str2);
            } else {
                AnonymousClass7TF.A1L(A00, r8, "StoryTrendingPromptMediaLoggingInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
