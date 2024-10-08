package com.instagram.ui.widget.nestablescrollingview;

import X.AnonymousClass0fD;
import X.C363518jr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class NestableViewPager extends ViewPager {
    public C363518jr A00 = new C363518jr(getContext());
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(int r2, boolean r3) {
        /*
            r1 = this;
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0007
            r0 = 1
            if (r3 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager.super.A0I(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nestablescrollingview.NestableViewPager.A0I(int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View, androidx.viewpager.widget.ViewPager] */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        this.A00.A01(motionEvent, this, true);
        return NestableViewPager.super.onInterceptTouchEvent(motionEvent);
    }

    public void setCurrentItem(int i) {
        if (this.A01) {
            A0I(i, false);
        } else {
            NestableViewPager.super.setCurrentItem(i);
        }
    }

    public void setPassThroughEdge(int i) {
        C363518jr r1 = this.A00;
        r1.A00 = i;
        r1.A01 = false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    public NestableViewPager(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = AnonymousClass0fD.A05(141079147);
        if (this.A01) {
            onTouchEvent = false;
            i = 1948225680;
        } else {
            onTouchEvent = NestableViewPager.super.onTouchEvent(motionEvent);
            i = -907873473;
        }
        AnonymousClass0fD.A0C(i, A05);
        return onTouchEvent;
    }

    public void setSwipingDisabled(boolean z) {
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    public NestableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
