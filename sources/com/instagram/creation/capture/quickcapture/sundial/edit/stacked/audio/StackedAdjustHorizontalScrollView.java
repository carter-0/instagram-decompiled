package com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C64286LYm;
import X.M37;
import X.MQR;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public final class StackedAdjustHorizontalScrollView extends HorizontalScrollView {
    public int A00;
    public MQR A01;
    public Runnable A02 = new M37(this);
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final long A06 = 100;

    public final void setOnScrollStoppedListener(MQR mqr) {
        0qQ.A0B(mqr, 0);
        this.A01 = mqr;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedAdjustHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
        setOnTouchListener(new C64286LYm((Object) this, 12));
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A03 = true;
        this.A05 = true;
    }
}
