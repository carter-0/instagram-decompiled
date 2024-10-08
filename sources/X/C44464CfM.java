package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CfM  reason: case insensitive filesystem */
public abstract class C44464CfM {
    public static BHW parseFromJson(16F r7) {
        String A00;
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryTrendingPromptSubType storyTrendingPromptSubType = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r5 = 16L.A09;
                A00 = AnonymousClass000.A00(1579);
                if (A1J == r5) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if (A00.equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            BHX parseFromJson = C44466CfO.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1728).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    storyTrendingPromptSubType = (StoryTrendingPromptSubType) StoryTrendingPromptSubType.A01.get(str);
                    if (storyTrendingPromptSubType == null) {
                        storyTrendingPromptSubType = StoryTrendingPromptSubType.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            if (arrayList != null || !(r7 instanceof 0c9)) {
                return new BHW(storyTrendingPromptSubType, arrayList);
            }
            AnonymousClass7TF.A1L(A00, r7, "StoryTrendingPromptLoggingInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
