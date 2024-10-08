package com.instagram.igds.components.button;

import X.0qQ;
import X.2Yo;
import X.AnonymousClass3Z5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgRadioButton;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public class IgdsRadioButton extends IgRadioButton implements AnonymousClass3Z5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void A01() {
        if (this.A00) {
            super.setBackground((Drawable) null);
            super.setButtonDrawable((Drawable) null);
            Context context = getContext();
            boolean A01 = 2Yo.A01(true);
            int i = R.drawable.prism_radio_button_state_selector;
            if (A01) {
                i = R.drawable.prism_radio_button_state_selector_ax_fix;
            }
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, context.getDrawable(i), (Drawable) null);
        }
    }

    @Deprecated(message = "Background is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        if (!this.A00) {
            super.setBackground(drawable);
        }
    }

    @Deprecated(message = "Button Drawable is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setButtonDrawable(int i) {
        if (!this.A00) {
            super.setButtonDrawable(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    @Deprecated(message = "Button Drawable is set by IGDSRadioButton and should not be changed", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setButtonDrawable(Drawable drawable) {
        if (!this.A00) {
            super.setButtonDrawable(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsRadioButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
