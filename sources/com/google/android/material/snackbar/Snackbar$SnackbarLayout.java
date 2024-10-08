package com.google.android.material.snackbar;

import X.C13988Tno;
import X.C66582MXn;
import X.SN3;
import X.U4W;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class Snackbar$SnackbarLayout extends U4W {
    public Snackbar$SnackbarLayout(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int A04 = C66582MXn.A04(this, getMeasuredWidth());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                C13988Tno.A11(childAt, childAt.getMeasuredHeight(), SN3.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(A04, SN3.MAX_SIGNED_POWER_OF_TWO));
            }
        }
    }

    public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
