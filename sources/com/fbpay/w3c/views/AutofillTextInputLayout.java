package com.fbpay.w3c.views;

import X.0qQ;
import X.AnonymousClass2IJ;
import X.AnonymousClass7TE;
import X.C51966G9m;
import X.Pxh;
import X.Pxj;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;

public final class AutofillTextInputLayout extends TextInputLayout {
    public Drawable A00;
    public Drawable A01;
    public CharSequence A02;
    public View.OnClickListener A03;
    public final ColorStateList A04;
    public final ColorStateList A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A06 = i;
        CharSequence hint = getHint();
        if (hint == null) {
            EditText editText = this.A0F;
            if (editText != null) {
                hint = editText.getHint();
            } else {
                hint = null;
            }
        }
        this.A02 = hint;
        this.A05 = this.A0C;
        Context A0S = AnonymousClass7TE.A0S(this);
        0qQ.A0B(A0S, 0);
        this.A04 = new ColorStateList(new int[][]{Pxh.A1Y(16842910), Pxh.A1Y(-16842910)}, new int[]{Pxj.A0J(A0S, R.attr.w3c_bottom_sheet_error_text_color).data, Pxj.A0J(A0S, R.attr.w3c_bottom_sheet_error_text_color).data});
        this.A00 = A0S.getDrawable(R.drawable.instagram_activity_error_badge);
        AnonymousClass2IJ.A00().A01.getValue();
    }

    public final int getDefStyleAttr() {
        return this.A06;
    }

    public final View.OnClickListener getInitCardScanner() {
        return this.A03;
    }

    public final void setInitCardScanner(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    public final void A0U(String str) {
        CharSequence hint = getHint();
        if (str == null) {
            CharSequence charSequence = this.A02;
            if (C51966G9m.A1a(hint, charSequence)) {
                setHint(charSequence);
                setDefaultHintTextColor(this.A05);
                if (0qQ.A0K(this.A1D.getDrawable(), this.A00)) {
                    setEndIconDrawable(this.A01);
                }
            }
        } else if (!0qQ.A0K(hint, str)) {
            setDefaultHintTextColor(this.A04);
            Drawable drawable = this.A1D.getDrawable();
            if (drawable != null) {
                this.A01 = drawable;
            }
            setEndIconDrawable(this.A00);
            setHint((CharSequence) str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
