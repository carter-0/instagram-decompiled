package com.instagram.litho.ui.unspecifiedheightlithoview;

import X.0qQ;
import X.AnonymousClass3XX;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;

public final class UnspecifiedHeightLithoView extends LithoView {
    public final int A00 = AnonymousClass3XX.A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnspecifiedHeightLithoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    public final void onMeasure(int i, int i2) {
        UnspecifiedHeightLithoView.super.onMeasure(i, this.A00);
    }
}
