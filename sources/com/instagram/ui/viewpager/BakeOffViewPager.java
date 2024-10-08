package com.instagram.ui.viewpager;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.JTR;
import X.JTS;
import X.UFQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public final class BakeOffViewPager extends UFQ {
    public float A00;
    public float A01;
    public float A02 = ((float) ViewConfiguration.get(getContext()).getScaledPagingTouchSlop());
    public boolean A03;
    public boolean A04;
    public boolean A05;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.ui.viewpager.BakeOffViewPager] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BakeOffViewPager(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A03 = false;
            this.A04 = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A05 = false;
        } else if (actionMasked == 2) {
            if (!this.A04 && !this.A03) {
                float rawX = this.A00 - motionEvent.getRawX();
                float rawY = this.A01 - motionEvent.getRawY();
                boolean A1R = AnonymousClass7TF.A1R((JTR.A00(rawX, rawY) > ((double) this.A02) ? 1 : (JTR.A00(rawX, rawY) == ((double) this.A02) ? 0 : -1)));
                double A002 = JTS.A00(rawY, rawX);
                if (A1R) {
                    if (A002 < 90.0d) {
                        this.A03 = true;
                    } else {
                        this.A04 = true;
                    }
                }
            }
            if (this.A03) {
                if (!this.A05) {
                    this.A05 = true;
                }
            }
            return false;
        }
        return BakeOffViewPager.super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.ui.viewpager.BakeOffViewPager] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BakeOffViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }
}
