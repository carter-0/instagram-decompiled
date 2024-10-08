package com.instagram.creation.base.ui.grid;

import X.AnonymousClass0fD;
import X.C301485zM;
import X.C66438MRs;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class GridLinesView extends View {
    public float A00;
    public C66438MRs A01;
    public boolean A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final int A06;
    public final Rect A07;
    public final C301485zM A08;

    public GridLinesView(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getStrokeWidth() {
        return this.A06;
    }

    public void setGridlinesRect(Rect rect) {
        this.A08.A03(rect);
    }

    public void setInnerStrokeColor(int i) {
        this.A08.A05.setColor(i);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A08.A02(canvas);
    }

    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.A02) {
            boolean z = this.A05;
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredWidth();
            if (z) {
                measuredHeight += this.A06 * 2;
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1527950090);
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.A07;
        rect.set(0, 0, i, (int) (((float) i2) * this.A00));
        this.A08.A03(rect);
        C66438MRs mRs = this.A01;
        if (mRs != null) {
            mRs.DlK(this, i, i2);
        }
        AnonymousClass0fD.A0D(1069032219, A062);
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public void setShouldGridBeSquare(boolean z) {
        this.A02 = z;
    }

    public void setSizeChangedListener(C66438MRs mRs) {
        this.A01 = mRs;
    }

    public void setSquareGrid(boolean z) {
        this.A02 = z;
    }

    public GridLinesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3 = 1;
        this.A02 = true;
        this.A05 = false;
        float f = 1.0f;
        this.A00 = 1.0f;
        i3 = ((double) getResources().getDisplayMetrics().density) >= 1.5d ? 2 : i3;
        this.A06 = i3;
        int i4 = 3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0x);
            i2 = obtainStyledAttributes.getInteger(6, 3);
            i4 = obtainStyledAttributes.getInteger(1, 3);
            this.A04 = obtainStyledAttributes.getInteger(3, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(2, this.A03);
            this.A02 = obtainStyledAttributes.getBoolean(5, this.A02);
            this.A05 = obtainStyledAttributes.getBoolean(5, this.A05);
            f = obtainStyledAttributes.getFloat(0, 1.0f);
            obtainStyledAttributes.recycle();
        } else {
            i2 = 3;
        }
        this.A07 = new Rect();
        C301485zM r3 = new C301485zM((float) i3, i2, i4, this.A04, this.A03, this.A05);
        this.A08 = r3;
        r3.A04(f);
    }

    public GridLinesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
