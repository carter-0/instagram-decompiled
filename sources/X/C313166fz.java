package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6fz  reason: invalid class name and case insensitive filesystem */
public abstract class C313166fz {
    public static C273384mU A00;

    /* JADX WARNING: type inference failed for: r0v8, types: [X.6UQ, X.1qK, java.lang.Object] */
    public static final void A00() {
        C273384mU r4 = A00;
        if (r4 != null) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r4;
            C250973mM r0 = reelViewerFragment.A0a;
            r0.getClass();
            Reel reel = r0.A0H;
            C311546cr r2 = reelViewerFragment.A0k;
            String id = reel.getId();
            C250973mM r02 = reelViewerFragment.A0a;
            r02.getClass();
            r2.Dnn(r02, id);
            AnonymousClass6YW.A00(reelViewerFragment.getSession()).A01(reel);
            C250973mM r03 = reelViewerFragment.A0a;
            r03.getClass();
            r03.A0H.A1q = true;
            1Ng A002 = AnonymousClass1Nd.A00(reelViewerFragment.getSession());
            Reel reel2 = reelViewerFragment.A0a.A0H;
            ? obj = new Object();
            obj.A00 = reel2;
            A002.A00(obj);
        }
    }
}
