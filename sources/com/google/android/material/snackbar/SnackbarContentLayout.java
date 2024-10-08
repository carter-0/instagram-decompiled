package com.google.android.material.snackbar;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C13988Tno;
import X.C297865sU;
import X.X1B;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public class SnackbarContentLayout extends LinearLayout implements X1B {
    public Button A00;
    public TextView A01;
    public int A02;
    public int A03;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public Button getActionView() {
        return this.A00;
    }

    public TextView getMessageView() {
        return this.A01;
    }

    public void setMaxInlineActionWidth(int i) {
        this.A02 = i;
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A01.getPaddingTop() == i2 && this.A01.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A01;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0fD.A06(146968401);
        super.onFinishInflate();
        this.A01 = AnonymousClass7TE.A0d(this, R.id.snackbar_text);
        this.A00 = (Button) findViewById(R.id.snackbar_action);
        AnonymousClass0fD.A0D(-674656186, A06);
    }

    public final void onMeasure(int i, int i2) {
        boolean A002;
        super.onMeasure(i, i2);
        int i3 = this.A03;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            i = C13988Tno.A04(i3);
            super.onMeasure(i, i2);
        }
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int A0G = AnonymousClass7TE.A0G(resources);
        if (this.A01.getLayout().getLineCount() > 1) {
            if (this.A02 > 0 && this.A00.getMeasuredWidth() > this.A02) {
                A002 = A00(1, dimensionPixelSize, dimensionPixelSize - A0G);
            }
            A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
        } else {
            dimensionPixelSize = A0G;
            A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
        }
        if (A002) {
            super.onMeasure(i, i2);
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0Y);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
}
