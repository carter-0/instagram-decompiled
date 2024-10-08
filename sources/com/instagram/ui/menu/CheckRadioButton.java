package com.instagram.ui.menu;

import X.2Yu;
import X.AnonymousClass7TE;
import X.DbT;
import X.DbX;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;

public class CheckRadioButton extends IgdsRadioButton {
    public Drawable A00;

    public CheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        this.A00 = drawable;
        DbX.A11(context, drawable.mutate(), R.color.badge_color);
        setCompoundDrawablePadding(AnonymousClass7TE.A0C(context.getResources()));
    }

    public void setChecked(boolean z) {
        int A07;
        Drawable drawable;
        super.setChecked(z);
        Context context = getContext();
        if (z) {
            A07 = R.color.badge_color;
        } else {
            A07 = 2Yu.A07(context);
        }
        DbT.A17(context, this, A07);
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        if (z) {
            drawable = this.A00;
        } else {
            drawable = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable, compoundDrawables[3]);
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public CheckRadioButton(Context context) {
        super(context);
        A00();
    }
}
