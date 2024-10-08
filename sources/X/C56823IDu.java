package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.IDu  reason: case insensitive filesystem */
public final class C56823IDu implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public C56823IDu(View view, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        ReelViewerFragment reelViewerFragment = this.A01;
        CallerContext callerContext = ReelViewerFragment.A3S;
        reelViewerFragment.A2i = true;
        View view = this.A00;
        int height = view.getHeight();
        int width = view.getWidth();
        reelViewerFragment.A03 = height;
        reelViewerFragment.A04 = width;
        ReelViewerFragment.A0B(reelViewerFragment.A0a, reelViewerFragment.Aui(), reelViewerFragment);
        C313056fm r0 = reelViewerFragment.mViewPager;
        if (r0 != null) {
            C255963v0 r1 = ((C313046fl) r0).A00;
            if (r1 instanceof C314076hc) {
                0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.CubeItemPositioner");
                C314076hc r12 = (C314076hc) r1;
                r12.A03 = 0;
                r12.A02 = 0;
            }
        }
        C51967G9n.A0y(view, this);
    }
}
