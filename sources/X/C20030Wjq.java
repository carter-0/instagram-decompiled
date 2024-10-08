package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Wjq  reason: case insensitive filesystem */
public final class C20030Wjq implements Runnable {
    public final /* synthetic */ AdBakeOffFragment A00;

    public C20030Wjq(AdBakeOffFragment adBakeOffFragment) {
        this.A00 = adBakeOffFragment;
    }

    public final void run() {
        AdBakeOffFragment adBakeOffFragment = this.A00;
        int A02 = JTQ.A02(adBakeOffFragment.contentContainer);
        SpinnerImageView spinnerImageView = adBakeOffFragment.loadingSpinner;
        if (spinnerImageView != null) {
            spinnerImageView.setVisibility(A02);
        }
        if (adBakeOffFragment.retryViewGroup == null) {
            ViewStub viewStub = adBakeOffFragment.retryViewStub;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                C66580MXl.A1R(inflate);
                ViewGroup viewGroup = (ViewGroup) inflate;
                adBakeOffFragment.retryViewGroup = viewGroup;
                WB9.A00(viewGroup.requireViewById(R.id.retry), 29, adBakeOffFragment);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        ViewGroup viewGroup2 = adBakeOffFragment.retryViewGroup;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
