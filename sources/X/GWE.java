package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class GWE {
    public static GSY parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("mentions_count_string".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("reels".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("product_stories_count".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("product_stories_reels".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson2 = AnonymousClass3HR.parseFromJson(r10);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mentions_count_string", r10, "StoryMentionsInfo");
            } else if (arrayList != null || !(r10 instanceof 0c9)) {
                return new GSY(str, str2, (List) arrayList, (List) arrayList2);
            } else {
                AnonymousClass7TF.A1L("reels", r10, "StoryMentionsInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
