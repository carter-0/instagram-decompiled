package com.instagram.ui.widget.nestablescrollingview;

import X.C252553pI;
import X.C363518jr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class NestableRecyclerView extends RecyclerView {
    public double A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public double A06;
    public final C363518jr A07;

    public NestableRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean A1F(int i, int i2) {
        double d = this.A00;
        if (d > 0.0d) {
            i = (int) (((double) i) * d);
        }
        double d2 = this.A06;
        if (d2 > 0.0d) {
            i2 = (int) (((double) i2) * d2);
        }
        return super.A1F(i, i2);
    }

    public float getBottomFadingEdgeStrength() {
        if (this.A01) {
            return 1.0f;
        }
        return 0.0f;
    }

    public float getLeftFadingEdgeStrength() {
        if (this.A02) {
            return 1.0f;
        }
        return 0.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (this.A03) {
            return 1.0f;
        }
        return 0.0f;
    }

    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return 1.0f;
        }
        return 0.0f;
    }

    public int getTopPaddingOffset() {
        boolean z = this.A05;
        int paddingTop = getPaddingTop();
        if (z) {
            return -paddingTop;
        }
        return paddingTop;
    }

    public final boolean isPaddingOffsetRequired() {
        if (!this.A05) {
            return false;
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C363518jr r1 = this.A07;
        C252553pI r0 = this.A0D;
        r0.getClass();
        r1.A01(motionEvent, this, r0.A1X());
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        C363518jr r1 = this.A07;
        r1.A00 = i;
        r1.A01 = false;
    }

    public void setPassThroughToParentOverride(boolean z) {
        this.A07.A03 = z;
    }

    public int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    public int getLeftPaddingOffset() {
        return getPaddingLeft();
    }

    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A01 = z;
    }

    public void setFlingVelocityFactorX(double d) {
        this.A00 = d;
    }

    public void setFlingVelocityFactorY(double d) {
        this.A06 = d;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = true;
        this.A03 = true;
        this.A04 = true;
        this.A01 = true;
        this.A05 = false;
        this.A00 = -1.0d;
        this.A06 = -1.0d;
        this.A07 = new C363518jr(getContext());
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
