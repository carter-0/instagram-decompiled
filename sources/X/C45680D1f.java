package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1f  reason: case insensitive filesystem */
public abstract class C45680D1f {
    public static C269844fm parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("keywords".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C42128BIg parseFromJson = C44904Cmu.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("model_version".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C269844fm(arrayList, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C269844fm r5) {
        r4.A0c();
        List list = r5.A01;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "keywords", list);
            while (A0s.hasNext()) {
                C46305DUi dUi = (C46305DUi) A0s.next();
                if (dUi != null) {
                    C42128BIg FFA = dUi.FFA();
                    r4.A0c();
                    Integer num = FFA.A02;
                    if (num != null) {
                        r4.A0P("end_index", num.intValue());
                    }
                    String str = FFA.A04;
                    if (str != null) {
                        r4.A0R("keyword_background_color", str);
                    }
                    String str2 = FFA.A05;
                    if (str2 != null) {
                        r4.A0R("keyword_color", str2);
                    }
                    StoryAdKeywordStyleEnum storyAdKeywordStyleEnum = FFA.A00;
                    if (storyAdKeywordStyleEnum != null) {
                        r4.A0R("keyword_style", storyAdKeywordStyleEnum.A00);
                    }
                    StoryAdKeywordTypeEnum storyAdKeywordTypeEnum = FFA.A01;
                    if (storyAdKeywordTypeEnum != null) {
                        r4.A0R("keyword_type", storyAdKeywordTypeEnum.A00);
                    }
                    Integer num2 = FFA.A03;
                    if (num2 != null) {
                        r4.A0P("start_index", num2.intValue());
                    }
                    String str3 = FFA.A06;
                    if (str3 != null) {
                        r4.A0R("token", str3);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str4 = r5.A00;
        if (str4 != null) {
            r4.A0R("model_version", str4);
        }
        r4.A0Z();
    }
}
