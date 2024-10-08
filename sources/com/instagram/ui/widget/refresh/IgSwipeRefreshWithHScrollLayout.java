package com.instagram.ui.widget.refresh;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.JTR;
import X.JTS;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public class IgSwipeRefreshWithHScrollLayout extends IgSwipeRefreshLayout {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final int A05;

    public IgSwipeRefreshWithHScrollLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00(MotionEvent motionEvent) {
        if (!this.A03 && !this.A02) {
            float rawX = this.A00 - motionEvent.getRawX();
            float rawY = this.A01 - motionEvent.getRawY();
            double A002 = JTR.A00(rawX, rawY);
            double A003 = JTS.A00(rawY, rawX);
            if (A002 <= ((double) this.A05)) {
                return;
            }
            if (A003 < ((double) this.A04)) {
                this.A02 = true;
            } else {
                this.A03 = true;
            }
        }
    }

    public void setXDraggingAngleRange(int i) {
        this.A04 = i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
        } else if (actionMasked == 2) {
            A00(motionEvent);
            float A002 = AnonymousClass7TE.A00(this.A00, motionEvent.getX());
            float A003 = AnonymousClass7TE.A00(this.A01, motionEvent.getY());
            if (this.A02 || A002 > A003) {
                return false;
            }
        }
        return IgSwipeRefreshWithHScrollLayout.super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View, com.instagram.ui.widget.refresh.IgSwipeRefreshWithHScrollLayout] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A052 = AnonymousClass0fD.A05(-138051306);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                A00(motionEvent);
                if (this.A02) {
                    ViewParent parent = getParent();
                    parent.getClass();
                    onTouchEvent = true;
                    parent.requestDisallowInterceptTouchEvent(true);
                    i = 1726160706;
                }
            }
            onTouchEvent = IgSwipeRefreshWithHScrollLayout.super.onTouchEvent(motionEvent);
            i = 1181906629;
        } else {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
            onTouchEvent = IgSwipeRefreshWithHScrollLayout.super.onTouchEvent(motionEvent);
            i = 1181906629;
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public IgSwipeRefreshWithHScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = 85;
        this.A05 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
