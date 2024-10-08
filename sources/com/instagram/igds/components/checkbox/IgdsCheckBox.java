package com.instagram.igds.components.checkbox;

import X.0qQ;
import X.2Yo;
import X.AnonymousClass3Z5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public class IgdsCheckBox extends IgCheckBox implements AnonymousClass3Z5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void A01() {
        if (this.A00) {
            Context context = getContext();
            boolean A01 = 2Yo.A01(true);
            int i = R.drawable.prism_checkbox_state_selector;
            if (A01) {
                i = R.drawable.prism_checkbox_state_selector_ax_fix;
            }
            Drawable drawable = context.getDrawable(i);
            if (drawable != null) {
                super.setBackground(drawable);
            }
        }
    }

    @Deprecated(message = "Background is set by IGDSCheckbox and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        if (!this.A00) {
            super.setBackground(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsCheckBox(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
