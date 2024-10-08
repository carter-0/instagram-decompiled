package com.facebook.common.messagingui.observableverticaloffsetlayout;

import X.AnonymousClass7G9;
import X.C328117Dn;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ObservableVerticalOffsetFrameLayout extends FrameLayout implements C328117Dn {
    public AnonymousClass7G9 A00;

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        AnonymousClass7G9 r0 = this.A00;
        if (r0 != null) {
            r0.DUy();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass7G9 r0 = this.A00;
        if (r0 != null) {
            r0.DUy();
        }
    }

    public ObservableVerticalOffsetFrameLayout(Context context) {
        super(context);
    }

    public void setOffsetListener(AnonymousClass7G9 r1) {
        this.A00 = r1;
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
