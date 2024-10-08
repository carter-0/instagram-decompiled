package com.instagram.direct.ui;

import X.0qQ;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;

public final class NonFocusingHorizontalScrollView extends HorizontalScrollView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    public final ArrayList getFocusables(int i) {
        return new ArrayList();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
