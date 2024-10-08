package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;

public final class BEU extends AnonymousClass0T0 implements C46275DTe {
    public final CreatorViewerInsightCTA A00;
    public final CreatorViewerInsightType A01;
    public final PopularReelWithFollowersInsightMetadata A02;
    public final String A03;

    public BEU(CreatorViewerInsightCTA creatorViewerInsightCTA, CreatorViewerInsightType creatorViewerInsightType, PopularReelWithFollowersInsightMetadata popularReelWithFollowersInsightMetadata, String str) {
        AnonymousClass7TF.A1D(creatorViewerInsightType, 2, str);
        this.A00 = creatorViewerInsightCTA;
        this.A01 = creatorViewerInsightType;
        this.A02 = popularReelWithFollowersInsightMetadata;
        this.A03 = str;
    }

    public final BEU F2L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEU) {
                BEU beu = (BEU) obj;
                if (this.A00 != beu.A00 || this.A01 != beu.A01 || !0qQ.A0K(this.A02, beu.A02) || !0qQ.A0K(this.A03, beu.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final CreatorViewerInsightCTA At7() {
        return this.A00;
    }

    public final CreatorViewerInsightType BHh() {
        return this.A01;
    }

    public final PopularReelWithFollowersInsightMetadata Bdh() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerInsight", C44118CWj.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A07(this.A01, A0C) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }
}
