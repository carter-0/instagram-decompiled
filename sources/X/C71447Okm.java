package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Okm  reason: case insensitive filesystem */
public final class C71447Okm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public C71447Okm(View view, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        ReelViewerFragment reelViewerFragment = this.A01;
        if (reelViewerFragment.isAdded()) {
            FragmentActivity requireActivity = reelViewerFragment.requireActivity();
            CallerContext callerContext = ReelViewerFragment.A3S;
            C317756nm.A05(requireActivity, reelViewerFragment.getSession(), !C61290mR.A07());
        }
        C51967G9n.A0y(this.A00, this);
    }
}
