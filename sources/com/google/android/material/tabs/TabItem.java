package com.google.android.material.tabs;

import X.2Yi;
import X.C297865sU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View {
    public final int A00;
    public final Drawable A01;
    public final CharSequence A02;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        2Yi r3 = new 2Yi(context, context.obtainStyledAttributes(attributeSet, C297865sU.A0Z));
        TypedArray typedArray = r3.A02;
        this.A02 = typedArray.getText(2);
        this.A01 = r3.A02(0);
        this.A00 = typedArray.getResourceId(1, 0);
        typedArray.recycle();
    }
}
