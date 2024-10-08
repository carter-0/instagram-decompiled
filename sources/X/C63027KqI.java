package X;

import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KqI  reason: case insensitive filesystem */
public abstract class C63027KqI {
    public static C61118JxU parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("aggregation_visibility".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    storyMusicPickAggregationVisibility = (StoryMusicPickAggregationVisibility) StoryMusicPickAggregationVisibility.A01.get(str);
                    if (storyMusicPickAggregationVisibility == null) {
                        storyMusicPickAggregationVisibility = StoryMusicPickAggregationVisibility.UNRECOGNIZED;
                    }
                } else if ("songs".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C61119JxV parseFromJson = C63028KqJ.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (storyMusicPickAggregationVisibility == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("aggregation_visibility", r8, "StoryMusicPickAggregationInfoImpl");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new C61118JxU(storyMusicPickAggregationVisibility, arrayList);
            } else {
                AnonymousClass7TF.A1L("songs", r8, "StoryMusicPickAggregationInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
