package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;

public final class CJU extends 17P implements C46275DTe {
    public final CreatorViewerInsightCTA At7() {
        return (CreatorViewerInsightCTA) A0N(98832, DKY.A00);
    }

    public final CreatorViewerInsightType BHh() {
        return (CreatorViewerInsightType) A0M(-1011512447, DKZ.A00);
    }

    public final PopularReelWithFollowersInsightMetadata Bdh() {
        return (PopularReelWithFollowersInsightMetadata) A05(1340568954, ImmutablePandoPopularReelWithFollowersInsightMetadata.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DTe, X.CJU] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44118CWj.A00(this));
    }

    public final BEU F2L() {
        PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl;
        CreatorViewerInsightCTA At7 = At7();
        CreatorViewerInsightType BHh = BHh();
        PopularReelWithFollowersInsightMetadata Bdh = Bdh();
        if (Bdh != null) {
            popularReelWithFollowersInsightMetadataImpl = Bdh.F7a();
        } else {
            popularReelWithFollowersInsightMetadataImpl = null;
        }
        return new BEU(At7, BHh, popularReelWithFollowersInsightMetadataImpl, A0P());
    }

    public final String getText() {
        return A0P();
    }
}
