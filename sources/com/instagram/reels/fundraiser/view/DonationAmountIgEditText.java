package com.instagram.reels.fundraiser.view;

import X.0nA;
import X.AnonymousClass0fD;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgEditText;

public class DonationAmountIgEditText extends IgEditText {
    public DonationAmountIgEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(1311323137);
        if (motionEvent.getAction() == 1) {
            if (!isFocused()) {
                requestFocus();
            }
            0nA.A0Q(this);
        }
        AnonymousClass0fD.A0C(819163787, A05);
        return true;
    }

    public DonationAmountIgEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DonationAmountIgEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DonationAmountIgEditText(Context context) {
        super(context);
    }
}
