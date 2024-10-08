package X;

import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class WNS implements X3E {
    public final int A00;
    public final Object A01;
    public final String A02;

    public WNS(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                ArchiveReelHighlightsFragment archiveReelHighlightsFragment = (ArchiveReelHighlightsFragment) this.A01;
                ArchiveReelHighlightsFragment.A00(archiveReelHighlightsFragment, this.A02);
                C59689JTv.A07(archiveReelHighlightsFragment.getContext(), 2131963426);
                return;
            case 1:
                C19491Wad wad = (C19491Wad) this.A01;
                UserSession userSession = wad.A02;
                Reel A0M = 1OP.A05(userSession).A0M(this.A02);
                if (A0M != null) {
                    AnonymousClass1Nd.A00(userSession).A00(new C321936uz(A0M));
                    JZV.A09(wad.A04.requireActivity(), userSession, A0M);
                    return;
                }
                return;
            default:
                C15343Uat uat = (C15343Uat) this.A01;
                AnonymousClass0eM r3 = uat.A0C;
                Reel A0M2 = 1OP.A05(AnonymousClass7TE.A0l(r3)).A0M(this.A02);
                if (A0M2 != null) {
                    DbX.A0R(r3).A00(new C321936uz(A0M2));
                    JZV.A09(uat.requireActivity(), AnonymousClass7TE.A0l(r3), A0M2);
                    return;
                }
                return;
        }
    }
}
