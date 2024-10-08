package X;

import com.instagram.api.schemas.StoryTextAttributionType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CfE  reason: case insensitive filesystem */
public abstract class C44456CfE {
    public static BHS parseFromJson(16F r10) {
        String A00;
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            StoryTextAttributionType storyTextAttributionType = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r8 = 16L.A09;
                A00 = AnonymousClass000.A00(514);
                if (A1J == r8) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    storyTextAttributionType = (StoryTextAttributionType) StoryTextAttributionType.A01.get(str);
                    if (storyTextAttributionType == null) {
                        storyTextAttributionType = StoryTextAttributionType.UNRECOGNIZED;
                    }
                } else if ("bold_ranges".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            BHR parseFromJson = C44454CfC.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (storyTextAttributionType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "StoryTextAttribution");
            } else if (arrayList == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("bold_ranges", r10, "StoryTextAttribution");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new BHS(storyTextAttributionType, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("text", r10, "StoryTextAttribution");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
