package X;

import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;
import java.io.IOException;

/* renamed from: X.CWl  reason: case insensitive filesystem */
public abstract class C44120CWl {
    public static BEU parseFromJson(16F r10) {
        String str;
        String str2;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            CreatorViewerInsightType creatorViewerInsightType = null;
            String str3 = null;
            CreatorViewerInsightCTA creatorViewerInsightCTA = null;
            PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("cta".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                    creatorViewerInsightCTA = (CreatorViewerInsightCTA) CreatorViewerInsightCTA.A01.get(str2);
                    if (creatorViewerInsightCTA == null) {
                        creatorViewerInsightCTA = CreatorViewerInsightCTA.UNRECOGNIZED;
                    }
                } else if ("insight_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    creatorViewerInsightType = (CreatorViewerInsightType) CreatorViewerInsightType.A01.get(str);
                    if (creatorViewerInsightType == null) {
                        creatorViewerInsightType = CreatorViewerInsightType.UNRECOGNIZED;
                    }
                } else if ("popular_reel_with_followers_insight_metadata".equals(A17)) {
                    popularReelWithFollowersInsightMetadataImpl = C44241Cbc.parseFromJson(r10);
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (creatorViewerInsightType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("insight_type", r10, "CreatorViewerInsight");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new BEU(creatorViewerInsightCTA, creatorViewerInsightType, popularReelWithFollowersInsightMetadataImpl, str3);
            } else {
                AnonymousClass7TF.A1L("text", r10, "CreatorViewerInsight");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
