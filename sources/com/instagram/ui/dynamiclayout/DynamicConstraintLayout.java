package com.instagram.ui.dynamiclayout;

import X.C323886yG;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class DynamicConstraintLayout extends ConstraintLayout {
    public C323886yG A00;

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C323886yG r0 = this.A00;
        if (r0 != null && r0.DPj()) {
            super.onMeasure(i, i2);
        }
    }

    public DynamicConstraintLayout(Context context) {
        super(context);
    }

    public void setOnMeasureListener(C323886yG r1) {
        this.A00 = r1;
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
