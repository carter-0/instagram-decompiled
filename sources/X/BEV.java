package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import java.util.List;

public final class BEV extends AnonymousClass0T0 implements C46307DUk {
    public final CreatorViewerBottomCTA A00;
    public final CreatorViewerContextCTA A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public BEV(CreatorViewerBottomCTA creatorViewerBottomCTA, CreatorViewerContextCTA creatorViewerContextCTA, String str, List list, List list2, List list3) {
        0qQ.A0B(list, 2);
        AnonymousClass7TG.A1R(list2, list3);
        this.A00 = creatorViewerBottomCTA;
        this.A03 = list;
        this.A01 = creatorViewerContextCTA;
        this.A04 = list2;
        this.A05 = list3;
        this.A02 = str;
    }

    public final BEV F2N(1E9 r1) {
        return this;
    }

    public final BEV F2O(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEV) {
                BEV bev = (BEV) obj;
                if (!0qQ.A0K(this.A00, bev.A00) || !0qQ.A0K(this.A03, bev.A03) || !0qQ.A0K(this.A01, bev.A01) || !0qQ.A0K(this.A04, bev.A04) || !0qQ.A0K(this.A05, bev.A05) || !0qQ.A0K(this.A02, bev.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final CreatorViewerBottomCTA AhI() {
        return this.A00;
    }

    public final List AhK() {
        return this.A03;
    }

    public final CreatorViewerContextCTA Aqv() {
        return this.A01;
    }

    public final List BwP() {
        return this.A04;
    }

    public final List BwR() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerInsightV2", C44119CWk.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TF.A07(this.A03, A0C) + AnonymousClass7TG.A0C(this.A01)) * 31)) + C41845B3m.A00(this.A02);
    }

    public final C46307DUk E7I(1E9 r1) {
        return this;
    }
}
