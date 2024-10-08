package X;

import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.FTr  reason: case insensitive filesystem */
public final class C50211FTr implements C51894G6k {
    public final /* synthetic */ SuggestBusinessFragment A00;

    public C50211FTr(SuggestBusinessFragment suggestBusinessFragment) {
        this.A00 = suggestBusinessFragment;
    }

    public final void Dp2() {
        Dbc.A0r(this.A00);
    }

    public final void Dp3(C47340Dva dva) {
        SuggestBusinessFragment suggestBusinessFragment = this.A00;
        SuggestBusinessFragment.A01(suggestBusinessFragment);
        suggestBusinessFragment.A07 = dva.A01;
        SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
        if (!(spinnerImageView == null || suggestBusinessFragment.mBusinessNavBar == null)) {
            spinnerImageView.setVisibility(8);
        }
        SuggestBusinessFragment.A02(suggestBusinessFragment);
    }
}
