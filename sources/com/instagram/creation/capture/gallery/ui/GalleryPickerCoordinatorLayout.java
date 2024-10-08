package com.instagram.creation.capture.gallery.ui;

import X.AnonymousClass7TG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class GalleryPickerCoordinatorLayout extends CoordinatorLayout {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        AnonymousClass7TG.A1N(view, view2);
        this.A02 = view;
        this.A03 = view2;
        this.A00 = i;
        this.A01 = i2;
        return super.DmW(view, view2, i, i2);
    }
}
