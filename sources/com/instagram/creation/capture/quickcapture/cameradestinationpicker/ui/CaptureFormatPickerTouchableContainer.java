package com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CaptureFormatPickerTouchableContainer extends TouchInterceptorLinearLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
