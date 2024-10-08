package com.facebook.ui.compat.fbrelativelayout;

import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class FbRelativeLayout extends RelativeLayout {
    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0k);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public FbRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public FbRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    public FbRelativeLayout(Context context) {
        super(context);
    }

    public FbRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
