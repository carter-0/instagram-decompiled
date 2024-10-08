package com.instagram.rtc.presentation.areffects;

import X.0qQ;
import X.AnonymousClass7TG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.drawing.EffectSlider;

public final class RtcEffectSlider extends EffectSlider {
    public boolean A00;

    private final void A00() {
        float paddingLeft;
        boolean z = this.A00;
        int width = getWidth();
        if (z) {
            paddingLeft = (((float) width) / 2.0f) - ((float) getPaddingRight());
        } else {
            paddingLeft = (((float) (-width)) / 2.0f) + ((float) getPaddingLeft());
        }
        this.A01 = paddingLeft;
    }

    public final void setAlignedLeft(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A00();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    public final void onMeasure(int i, int i2) {
        this.A0R = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
