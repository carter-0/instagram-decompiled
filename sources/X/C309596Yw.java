package X;

import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6Yw  reason: invalid class name and case insensitive filesystem */
public final class C309596Yw implements C273414mX {
    public final /* synthetic */ ReelViewerFragment A00;

    public final void Cyf() {
    }

    public C309596Yw(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void Cyc() {
        ReelViewerFragment reelViewerFragment = this.A00;
        CallerContext callerContext = ReelViewerFragment.A3S;
        AnonymousClass6ZN r3 = reelViewerFragment.A3J;
        r3.A09 = false;
        r3.A0A = false;
        K3O k3o = r3.A05;
        if ((k3o == null || !k3o.A07) && !r3.A0C) {
            if (k3o != null && k3o.A06) {
                reelViewerFragment.A0w.CxF();
            }
            C314436iG r0 = reelViewerFragment.mMessageComposerController;
            if (r0 != null) {
                r0.A08();
            }
        } else if (reelViewerFragment.mMessageComposerController != null) {
            reelViewerFragment.DMr(0, false);
            reelViewerFragment.mMessageComposerController.A07();
        } else {
            AnonymousClass6SY r02 = reelViewerFragment.mBackwardsCompatibilityViewModel;
            if (r02 != null) {
                r02.A00();
            }
        }
        reelViewerFragment.Eqe(false);
        K3O k3o2 = r3.A05;
        if (k3o2 != null) {
            k3o2.A07 = false;
        }
        r3.A0C = false;
    }
}
