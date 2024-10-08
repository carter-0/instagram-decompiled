package com.instagram.react.views.custom;

import X.0qQ;
import X.QZK;
import X.QZL;
import com.facebook.react.uimanager.SimpleViewManager;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class IgLoadingIndicatorViewManager extends SimpleViewManager {
    public IgLoadingIndicatorViewManager() {
        super((QZK) null);
    }

    public SpinnerImageView createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        SpinnerImageView spinnerImageView = new SpinnerImageView(qzl);
        spinnerImageView.setImageResource(R.drawable.spinner_large);
        return spinnerImageView;
    }

    public String getName() {
        return "IgLoadingIndicator";
    }
}
