package com.facebook.smartcapture.ui;

import X.0qQ;
import X.Q9N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class PhotoRequirementsView extends FrameLayout {
    public View A00;
    public Q9N A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoRequirementsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final View getSheetContainer() {
        return this.A00;
    }

    public final void setSheetContainer(View view) {
        this.A00 = view;
    }
}
