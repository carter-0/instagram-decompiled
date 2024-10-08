package com.instagram.ui.widget.labelbutton;

import X.0qQ;
import X.C71382cm;
import X.C71622eP;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LabelButton extends IgLinearLayout {
    public final IgSimpleImageView A00;
    public final IgTextView A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setLabelText(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.A01.setVisibility(8);
            return;
        }
        IgTextView igTextView = this.A01;
        igTextView.setText(charSequence);
        igTextView.setVisibility(0);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.A00.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        this.A00.setImageResource(i);
    }

    public final void setImageTintList(ColorStateList colorStateList) {
        this.A00.setImageTintList(colorStateList);
    }

    public final void setSize(int i) {
        this.A00.setLayoutParams(new LinearLayout.LayoutParams(i, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setOrientation(1);
        setGravity(1);
        View.inflate(context, R.layout.layout_label_button, this);
        this.A00 = (IgSimpleImageView) findViewById(R.id.label_button_icon);
        this.A01 = JTO.A0X(this, R.id.label_button_text);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1e, i, 0);
            0qQ.A07(obtainStyledAttributes);
            setLabelText((CharSequence) C71622eP.A00(context, obtainStyledAttributes, 1));
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setImageResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setLabelText(int i) {
        setLabelText((CharSequence) getContext().getString(i));
    }

    public /* synthetic */ LabelButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
