package com.instagram.creation.video.ui;

import X.C59796JYp;
import X.C59873Jaw;
import X.C60045JeD;
import X.C66523MVb;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;

public class ClipStackView extends LinearLayout implements C66523MVb {
    public final Drawable A00;
    public final Drawable A01;

    public ClipStackView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void D3Q(C59796JYp jYp, Integer num) {
    }

    public final void D3R(C59796JYp jYp) {
    }

    public final void D3X() {
    }

    public final void DfJ() {
    }

    private void A00(C59796JYp jYp) {
        Context context = getContext();
        Drawable.ConstantState constantState = this.A00.getConstantState();
        constantState.getClass();
        Drawable newDrawable = constantState.newDrawable();
        Drawable.ConstantState constantState2 = this.A01.getConstantState();
        constantState2.getClass();
        addView(new C60045JeD(context, newDrawable, constantState2.newDrawable(), jYp));
    }

    public final void D3W(C59796JYp jYp) {
        View findViewWithTag = findViewWithTag(jYp);
        if (findViewWithTag != null) {
            jYp.A08.remove(findViewWithTag);
            removeView(findViewWithTag);
        }
    }

    public void setClipStack(C59873Jaw jaw) {
        Iterator it = jaw.iterator();
        while (it.hasNext()) {
            A00((C59796JYp) it.next());
        }
    }

    public final void D3P(C59796JYp jYp) {
        A00(jYp);
    }

    public ClipStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A0G, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        drawable.getClass();
        this.A00 = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        drawable2.getClass();
        this.A01 = drawable2;
        obtainStyledAttributes.recycle();
    }

    public ClipStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
