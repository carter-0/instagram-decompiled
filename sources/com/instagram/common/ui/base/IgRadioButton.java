package com.instagram.common.ui.base;

import X.0qQ;
import X.C61670oa;
import X.C66581MXm;
import X.C66583MXo;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;
import kotlin.Deprecated;

@Deprecated(message = "IgRadioButton is no longer supported. Use IgdsRadioButton instead")
public class IgRadioButton extends RadioButton {
    public final boolean A00 = C61670oa.A0D();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    public void A01() {
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1F);
        boolean A1X = C66583MXo.A1X(context, obtainStyledAttributes, this);
        int resourceId = obtainStyledAttributes.getResourceId(1, A1X ? 1 : 0);
        if (resourceId != 0) {
            setHint(context.getText(resourceId));
        }
        C66583MXo.A0r(context, obtainStyledAttributes, this, A1X);
        int resourceId2 = obtainStyledAttributes.getResourceId(A1X, A1X);
        if (resourceId2 != 0) {
            C66581MXm.A15(context, this, resourceId2);
        }
        A01();
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRadioButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgRadioButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
