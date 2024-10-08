package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6UN  reason: invalid class name */
public final class AnonymousClass6UN implements 1wn {
    public final /* synthetic */ ReelViewerFragment A00;

    public AnonymousClass6UN(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2111797646);
        AnonymousClass6UQ r8 = (AnonymousClass6UQ) obj;
        int A032 = AnonymousClass0fD.A03(-826684506);
        ReelViewerFragment reelViewerFragment = this.A00;
        if (reelViewerFragment.A0d == AnonymousClass3BQ.MAIN_FEED_TRAY && r8.A01 != null) {
            C250973mM r3 = reelViewerFragment.A0a;
            if (r3 != null) {
                UserSession session = reelViewerFragment.getSession();
                0qQ.A0B(session, 0);
                if (C250973mM.A00(session, r3).size() <= 1) {
                    C310006aH r1 = reelViewerFragment.A0l;
                    if (r1 != null) {
                        r1.A03(reelViewerFragment.A0a);
                    }
                    reelViewerFragment.A2f = true;
                }
            }
            reelViewerFragment.A2L = true;
            reelViewerFragment.A2f = true;
        }
        AnonymousClass0fD.A0A(-1814646253, A032);
        AnonymousClass0fD.A0A(1835097840, A03);
    }
}
