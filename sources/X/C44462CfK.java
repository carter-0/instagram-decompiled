package X;

import com.instagram.api.schemas.StoryPromptTappableData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CfK  reason: case insensitive filesystem */
public abstract class C44462CfK {
    public static BHV parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryPromptTappableData storyPromptTappableData = null;
            ArrayList arrayList2 = null;
            BHW bhw = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("logging_info".equals(A17)) {
                    bhw = C44464CfM.parseFromJson(r11);
                } else if ("media_infos".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1D(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prompt_sticker".equals(A17)) {
                    storyPromptTappableData = C281985Ai.parseFromJson(r11);
                } else if ("reel_pks".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r11, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r11.A0z();
            }
            if (arrayList == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_infos", r11, "StoryTrendingPromptInfo");
            } else if (storyPromptTappableData == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("prompt_sticker", r11, "StoryTrendingPromptInfo");
            } else if (arrayList2 != null || !(r11 instanceof 0c9)) {
                return new BHV(storyPromptTappableData, bhw, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("reel_pks", r11, "StoryTrendingPromptInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
