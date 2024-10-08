package com.instagram.shopping.widget.clickabletext;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C20849X1b;
import X.C295205nl;
import X.DbX;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClickableTextContainer extends LinearLayout {
    public C20849X1b A00;
    public final C295205nl A01;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        setAlpha(((1.0f - this.A01.A00) * 0.3f) + 0.7f);
        super.onDraw(canvas);
    }

    public final void setOnTouchListener(C20849X1b x1b) {
        this.A00 = x1b;
    }

    public ClickableTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.A01 = new C295205nl((View) this);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A03 = DbX.A03(motionEvent, 1440307382);
        boolean z = false;
        if (super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0fD.A0C(805195058, A03);
        return z;
    }

    public ClickableTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClickableTextContainer(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public /* synthetic */ ClickableTextContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
