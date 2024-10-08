package X;

import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D02 {
    public static C43813CEf parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                ArrayList arrayList = null;
                if ("cursor".equals(A17)) {
                    r2.A04 = AnonymousClass7TG.A0l(r10);
                } else if ("disclaimer".equals(A17)) {
                    r2.A05 = AnonymousClass7TG.A0l(r10);
                } else if ("featured_injected_prompts_response".equals(A17)) {
                    r2.A00 = C44467CfP.parseFromJson(r10);
                } else if ("has_next_page".equals(A17)) {
                    r2.A03 = AnonymousClass7TF.A0S(r10);
                } else if ("prompts_info".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            BHV parseFromJson = C44462CfK.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r2.A07 = arrayList;
                } else if (C41845B3m.A1E(A17)) {
                    r2.A06 = AnonymousClass7TG.A0l(r10);
                } else if ("trending_story_template_section_type".equals(A17)) {
                    StoryTrendingTemplateSectionType storyTrendingTemplateSectionType = (StoryTrendingTemplateSectionType) StoryTrendingTemplateSectionType.A01.get(AnonymousClass7TG.A0l(r10));
                    if (storyTrendingTemplateSectionType == null) {
                        storyTrendingTemplateSectionType = StoryTrendingTemplateSectionType.UNRECOGNIZED;
                    }
                    r2.A02 = storyTrendingTemplateSectionType;
                } else {
                    1XY.A01(r10, r2, A17);
                }
                r10.A0z();
            }
            String str = r2.A04;
            0qQ.A0A(str);
            String str2 = r2.A05;
            C61080JwI jwI = r2.A00;
            boolean A14 = C41845B3m.A14(r2.A03);
            List list = r2.A07;
            0qQ.A0A(list);
            r2.A01 = new C68158N2y(jwI, r2.A02, str, str2, r2.A06, list, A14);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
