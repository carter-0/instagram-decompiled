package X;

import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6Yx  reason: invalid class name and case insensitive filesystem */
public final class C309606Yx implements C309616Yy {
    public final /* synthetic */ ReelViewerFragment A00;

    public C309606Yx(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void DaI(C270184gK r5) {
        ReelViewerFragment reelViewerFragment = this.A00;
        CallerContext callerContext = ReelViewerFragment.A3S;
        boolean z = reelViewerFragment.A2Y;
        AnonymousClass3Q2 r1 = r5.A00;
        if (z != r1.A0n()) {
            reelViewerFragment.A2Y = r1.A0n();
            ((C313046fl) reelViewerFragment.mViewPager).A02.post(reelViewerFragment.A3L);
        }
    }
}
