package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.io.IOException;

/* renamed from: X.Cmu  reason: case insensitive filesystem */
public abstract class C44904Cmu {
    public static C42128BIg parseFromJson(16F r10) {
        String str;
        String str2;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            String str3 = null;
            String str4 = null;
            StoryAdKeywordStyleEnum storyAdKeywordStyleEnum = null;
            StoryAdKeywordTypeEnum storyAdKeywordTypeEnum = null;
            Integer num2 = null;
            String str5 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("end_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("keyword_background_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("keyword_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("keyword_style".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                    storyAdKeywordStyleEnum = (StoryAdKeywordStyleEnum) StoryAdKeywordStyleEnum.A01.get(str2);
                    if (storyAdKeywordStyleEnum == null) {
                        storyAdKeywordStyleEnum = StoryAdKeywordStyleEnum.UNRECOGNIZED;
                    }
                } else if ("keyword_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    storyAdKeywordTypeEnum = (StoryAdKeywordTypeEnum) StoryAdKeywordTypeEnum.A01.get(str);
                    if (storyAdKeywordTypeEnum == null) {
                        storyAdKeywordTypeEnum = StoryAdKeywordTypeEnum.UNRECOGNIZED;
                    }
                } else if ("start_index".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else if ("token".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new C42128BIg(storyAdKeywordStyleEnum, storyAdKeywordTypeEnum, num, num2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
