package com.instagram.igds.components.gradient;

import X.0nH;
import X.0qQ;
import X.C52184GIa;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;

public final class IGGradientView extends View {
    public static final C52184GIa A00 = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(attributeSet);
    }

    private final void A00(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0y);
            0qQ.A07(obtainStyledAttributes);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.values()[obtainStyledAttributes.getInt(2, 0)];
            int color = obtainStyledAttributes.getColor(1, 0);
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            if (((float) (color >>> 24)) / 255.0f == 0.0f) {
                color |= -16777216;
            }
            setBackground(C52184GIa.A00(orientation, 0nH.A06(color, f)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
