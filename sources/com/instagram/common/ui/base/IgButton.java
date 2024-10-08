package com.instagram.common.ui.base;

import X.0qQ;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public final class IgButton extends Button {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0z);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
