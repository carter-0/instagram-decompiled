package com.instagram.creation.capture;

import X.0qQ;
import X.DbU;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public final class FocusIndicatorView extends View {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    private final void setDrawable(int i) {
        DbU.A11(getContext(), this, i);
    }

    public final void A00() {
        setDrawable(R.drawable.ic_focus_failed);
    }

    public final void A01() {
        setDrawable(R.drawable.ic_focus_focusing);
    }

    public final void A02() {
        setDrawable(R.drawable.ic_focus_focused);
    }
}
