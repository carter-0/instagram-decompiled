package com.instagram.ui.recyclerpager;

import X.0mk;
import X.AnonymousClass0fD;
import X.AnonymousClass3AQ;
import X.C252553pI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalRecyclerPager extends RecyclerView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = false;

    public HorizontalRecyclerPager(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public final boolean A1F(int i, int i2) {
        if (this.A04) {
            return super.A1F(i, i2);
        }
        this.A02 = i;
        return true;
    }

    public final void A1I() {
        int right;
        boolean z = this.A03;
        C252553pI r1 = this.A0D;
        r1.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        View A1D = linearLayoutManager.A1D(linearLayoutManager.A1c());
        if (A1D != null) {
            if (z) {
                right = ((A1D.getLeft() - C252553pI.A05(A1D)) - getWidth()) + this.A01;
            } else {
                right = (A1D.getRight() + C252553pI.A07(A1D)) - this.A01;
            }
            A0u(right, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.recyclerview.widget.LinearLayoutManager, X.3pI, androidx.recyclerview.widget.AutoMeasureLinearLayoutManager] */
    private void A00() {
        Context context = getContext();
        this.A03 = 0mk.A02(context);
        ? linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A00 = true;
        linearLayoutManager.A00 = false;
        setLayoutManager(linearLayoutManager);
        this.A0S = true;
        setItemAnimator(new AnonymousClass3AQ());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int A052 = AnonymousClass0fD.A05(1078189374);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A04) {
            i = -96762475;
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A02 = 0;
            } else if (action == 1) {
                C252553pI r2 = this.A0D;
                r2.getClass();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
                int A1a = linearLayoutManager.A1a();
                if (this.A05) {
                    A1a += 2;
                }
                View A1D = linearLayoutManager.A1D(A1a);
                if (A1D != null) {
                    int right = A1D.getRight() + C252553pI.A07(A1D);
                    int left = A1D.getLeft() - C252553pI.A05(A1D);
                    getMeasuredWidth();
                    A1D.getMeasuredWidth();
                    int i4 = this.A01;
                    int i5 = this.A02;
                    if (i5 > 0 || (i5 == 0 && Math.abs(right) < Math.abs(left))) {
                        if (this.A05 && this.A03) {
                            i2 = (int) (((double) (right - i4)) * 0.98d);
                        } else if (this.A03) {
                            i2 = (right - getWidth()) + this.A00 + this.A01;
                        } else {
                            i2 = (right + this.A00) - i4;
                        }
                        A0u(i2, 0);
                    } else {
                        if (this.A05 && !this.A03) {
                            i3 = (int) (((double) ((getWidth() - left) - this.A01)) * -0.98d);
                        } else if (this.A03) {
                            i3 = ((left - getWidth()) - this.A00) + this.A01;
                        } else {
                            i3 = (left - this.A00) - i4;
                        }
                        A0u(i3, 0);
                        if (getScrollState() == 1) {
                            A0l();
                        }
                    }
                }
            }
            i = -1142866302;
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public void setExtraScroll(int i) {
        this.A00 = i;
    }

    public void setHorizontalPeekOffset(int i) {
        this.A01 = i;
    }

    public void setSnappingDisabled(boolean z) {
        this.A04 = z;
    }

    public void setUseQuadCardSnapping(boolean z) {
        this.A05 = z;
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
