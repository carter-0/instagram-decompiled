package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.List;

public final class CJV extends 17P implements C46307DUk {
    public List A00;

    public final CreatorViewerBottomCTA AhI() {
        return (CreatorViewerBottomCTA) A05(-1682227716, ImmutablePandoCreatorViewerBottomCTA.class);
    }

    public final List AhK() {
        return A0o(1278576897, ImmutablePandoCreatorViewerBottomCTA.class);
    }

    public final CreatorViewerContextCTA Aqv() {
        return (CreatorViewerContextCTA) A05(-102533248, ImmutablePandoCreatorViewerContextCTA.class);
    }

    public final List BwP() {
        return A0o(137058752, ImmutablePandoCreatorViewerSignalWithInsightsInfo.class);
    }

    public final List BwR() {
        List list = this.A00;
        if (list == null) {
            return A0o(2088265419, ImmutablePandoCreatorViewerSignalModel.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CJV, X.DUk] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44119CWk.A00(this));
    }

    public final C46307DUk E7I(1E9 r4) {
        List<CreatorViewerSignalModel> BwR = BwR();
        ArrayList A0r = AnonymousClass7TG.A0r(BwR);
        for (CreatorViewerSignalModel creatorViewerSignalModel : BwR) {
            creatorViewerSignalModel.E7L(r4);
            A0r.add(creatorViewerSignalModel);
        }
        this.A00 = A0r;
        return this;
    }

    public final BEV F2N(1E9 r9) {
        CreatorViewerBottomCTAImpl creatorViewerBottomCTAImpl;
        CreatorViewerBottomCTA AhI = AhI();
        CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = null;
        if (AhI != null) {
            creatorViewerBottomCTAImpl = AhI.F2J();
        } else {
            creatorViewerBottomCTAImpl = null;
        }
        List<CreatorViewerBottomCTA> AhK = AhK();
        ArrayList A0p = AnonymousClass7TF.A0p(AhK);
        for (CreatorViewerBottomCTA F2J : AhK) {
            A0p.add(F2J.F2J());
        }
        CreatorViewerContextCTA Aqv = Aqv();
        if (Aqv != null) {
            creatorViewerContextCTAImpl = Aqv.F2K();
        }
        List<CreatorViewerSignalWithInsightsInfo> BwP = BwP();
        ArrayList A0p2 = AnonymousClass7TF.A0p(BwP);
        for (CreatorViewerSignalWithInsightsInfo F2Y : BwP) {
            A0p2.add(F2Y.F2Y());
        }
        List<CreatorViewerSignalModel> BwR = BwR();
        ArrayList A0p3 = AnonymousClass7TF.A0p(BwR);
        for (CreatorViewerSignalModel F2U : BwR) {
            A0p3.add(F2U.F2U(r9));
        }
        return new BEV(creatorViewerBottomCTAImpl, creatorViewerContextCTAImpl, A0Y(), A0p, A0p2, A0p3);
    }

    public final BEV F2O(1E6 r2) {
        return F2N(C41846B3n.A0S(r2));
    }

    public final String getTitle() {
        return A0Y();
    }
}
