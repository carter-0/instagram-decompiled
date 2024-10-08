package com.instagram.secondaryaccount.ui;

import X.0qQ;
import X.AnonymousClass972;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;

public final class UsernameSuggestionContainerView extends LinearLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen) * 5, AnonymousClass972.MUTABLE_FLAG_MASK));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
