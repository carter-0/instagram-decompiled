package com.instagram.common.ui.widget.recyclerview;

import X.0qQ;
import X.C238683Cz;
import X.C59484JLi;
import X.IP2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

public class MainFeedRecyclerView extends RecyclerView {
    public double A00 = 1.0d;
    public long A01 = 0;
    public C238683Cz A02;
    public C59484JLi A03;
    public double A04 = 1.0d;
    public double A05 = 1.0d;

    public MainFeedRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C238683Cz r2 = this.A02;
        if (r2 != null && motionEvent.getAction() == 0) {
            r2.A01 = System.currentTimeMillis();
        }
        C59484JLi jLi = this.A03;
        if (jLi != null) {
            ((IP2) jLi).A00.A00("TOUCH");
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDownwardFlingScale(double d) {
        if (d > 0.0d) {
            this.A04 = d;
        }
    }

    public void setUpwardFlingScale(double d) {
        if (d > 0.0d) {
            this.A05 = d;
        }
    }

    public final boolean A1F(int i, int i2) {
        double d;
        int i3;
        if (System.currentTimeMillis() < this.A01) {
            return true;
        }
        int i4 = (int) (((double) i2) * this.A00);
        C238683Cz r3 = this.A02;
        if (r3 != null) {
            int i5 = r3.A00;
            r3.A00 = i4;
            if (Math.abs(i4 * 2) < Math.abs(i5) || Math.signum((float) i4) != Math.signum((float) i5) || System.currentTimeMillis() - r3.A01 > 200) {
                i3 = i4;
            } else {
                MainFeedRecyclerView mainFeedRecyclerView = r3.A02;
                0qQ.A0B(mainFeedRecyclerView, 0);
                OverScroller overScroller = mainFeedRecyclerView.mViewFlinger.A01;
                0qQ.A06(overScroller);
                int currVelocity = (int) overScroller.getCurrVelocity();
                i3 = i4 - currVelocity;
                if (i4 > 0) {
                    i3 = currVelocity + i4;
                }
            }
            i4 = i3;
        }
        double d2 = (double) i4;
        if (i4 < 0) {
            d = this.A05;
        } else {
            d = this.A04;
        }
        return super.A1F(i, (int) (d2 * d));
    }

    public void setCustomFlingVelocityFactor(double d) {
        this.A00 = d;
    }

    public void setOnTouchCallback(C59484JLi jLi) {
        this.A03 = jLi;
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
