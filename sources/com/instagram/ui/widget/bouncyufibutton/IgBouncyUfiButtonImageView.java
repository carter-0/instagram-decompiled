package com.instagram.ui.widget.bouncyufibutton;

import X.0qQ;
import X.AnonymousClass3TK;
import X.C2355730j;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public final class IgBouncyUfiButtonImageView extends ColorFilterAlphaImageView implements AnonymousClass3TK, C2355730j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final /* synthetic */ void CvC() {
    }

    public final void A05() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
    }

    public final void CvR(boolean z, float f) {
        setScaleX(f);
        setScaleY(f);
        if (!z) {
            f = 1.0f;
        }
        setAlpha(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
