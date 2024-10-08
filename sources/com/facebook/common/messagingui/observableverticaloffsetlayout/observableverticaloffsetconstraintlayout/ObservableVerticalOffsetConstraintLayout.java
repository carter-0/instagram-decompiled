package com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout;

import X.0qQ;
import X.AnonymousClass7G9;
import X.C328117Dn;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class ObservableVerticalOffsetConstraintLayout extends ConstraintLayout implements C328117Dn {
    public AnonymousClass7G9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

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

    public void setOffsetListener(AnonymousClass7G9 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}
