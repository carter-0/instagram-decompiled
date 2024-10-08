package com.instagram.creation.capture.quickcapture.gallery.gallerygrid;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class BlockableCoordinatorLayout extends CoordinatorLayout {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockableCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(view2, 1);
        if (this.A00) {
            return super.DmW(view, view2, i, i2);
        }
        return true;
    }

    public final void setShouldScroll(boolean z) {
        this.A00 = z;
    }
}
