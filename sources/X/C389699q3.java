package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9q3  reason: invalid class name and case insensitive filesystem */
public final class C389699q3 extends AnonymousClass3PS {
    public final /* synthetic */ ReelViewerFragment A00;

    public C389699q3(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void A01(Map map) {
        ReelViewerFragment reelViewerFragment = this.A00;
        CallerContext callerContext = ReelViewerFragment.A3S;
        reelViewerFragment.A2N = false;
        if (!reelViewerFragment.A2q) {
            C314586iW r1 = reelViewerFragment.mLoadingOverlay;
            r1.A01.A08();
            r1.A00.setVisibility(8);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                AnonymousClass9I1 r3 = reelViewerFragment.A0D;
                Reel reel = (Reel) A1J.getValue();
                UserSession session = reelViewerFragment.getSession();
                0qQ.A0B(reel, 0);
                0qQ.A0B(session, 1);
                if (reel.A16(session)) {
                    r3.A01++;
                } else {
                    r3.A00++;
                }
            }
            ReelViewerFragment.A0H(reelViewerFragment, false);
            reelViewerFragment.A1E.Ei7(reelViewerFragment.A1d.A00);
            ReelViewerFragment.A0D(reelViewerFragment);
        }
    }

    public final void A02(Set set) {
        ReelViewerFragment reelViewerFragment = this.A00;
        CallerContext callerContext = ReelViewerFragment.A3S;
        reelViewerFragment.A2N = false;
        if (!reelViewerFragment.A2q) {
            ReelViewerFragment.A0D(reelViewerFragment);
        }
    }
}
