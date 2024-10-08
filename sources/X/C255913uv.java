package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3uv  reason: invalid class name and case insensitive filesystem */
public abstract class C255913uv extends View implements AnonymousClass08u, C252203oj, C252293os {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnonymousClass54P A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final ArgbEvaluator A0E = new ArgbEvaluator();
    public final Paint A0F = new Paint(1);
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(C255923uw.A00);
    public final boolean A0H;

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r7, float f, float f2) {
        this.A02 = (float) Math.min(Math.max((double) f, 0.0d), (double) (this.A05 - 1));
        invalidate();
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        int i;
        double d;
        0qQ.A0B(r5, 0);
        if (this.A05 > this.A06) {
            if (this.A0H) {
                d = 1.0d - r5.A09.A00;
            } else {
                d = r5.A09.A00;
            }
            i = AnonymousClass1GB.A00(d);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public abstract int getCurrentPage();

    public abstract boolean getGestureInProgress();

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public abstract void setCurrentPage(int i);

    public abstract void setGestureInProgress(boolean z);

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final float getActiveCircleAlpha() {
        return this.A00;
    }

    public final int getActiveColor() {
        return this.A03;
    }

    public final boolean getAnimatePageDotSelection() {
        return this.A09;
    }

    public final int getDefaultSize() {
        return this.A0D;
    }

    public final ArgbEvaluator getEvaluator() {
        return this.A0E;
    }

    public final boolean getHasUserInteractedWithCarousel() {
        return this.A0C;
    }

    public final int getInactiveColor() {
        return this.A04;
    }

    public final float getIndicatorProgress() {
        return this.A01;
    }

    public final int getPageCount() {
        return this.A05;
    }

    public final Paint getPaint() {
        return this.A0F;
    }

    public final float getScrollOffset() {
        return this.A02;
    }

    public final AnonymousClass0eM getScrollSpring() {
        return this.A0G;
    }

    public final int getScrollingItemCountThreshold() {
        return this.A06;
    }

    public final boolean getShouldCarouselIndicatorProgressAnimate() {
        return this.A0B;
    }

    public final int getSpacing() {
        return this.A07;
    }

    public final void setActiveCircleAlpha(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setActiveColor(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setDarkMode(boolean z) {
        this.A0A = z;
        invalidate();
    }

    public final void setHasUserInteractedWithCarousel(boolean z) {
        this.A0C = z;
        invalidate();
    }

    public final void setInactiveColor(int i) {
        this.A04 = i;
        invalidate();
    }

    public final void setIndicatorProgress(float f) {
        this.A01 = f;
        if (f != 0.0f) {
            invalidate();
        }
    }

    public final void setPageCount(int i) {
        this.A05 = i;
        invalidate();
    }

    public C255913uv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.A0D = applyDimension;
        this.A07 = applyDimension;
        this.A0H = 0mk.A02(getContext());
        this.A00 = 1.0f;
    }

    public final void A01(int i, int i2) {
        setCurrentPage(i);
        setPageCount(i2);
        requestLayout();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-414870792);
        super.onAttachedToWindow();
        ((2cs) this.A0G.getValue()).A0A(this);
        AnonymousClass0fD.A0D(1253372409, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(133308048);
        super.onDetachedFromWindow();
        2cs r0 = (2cs) this.A0G.getValue();
        r0.A01();
        r0.A0B(this);
        AnonymousClass0fD.A0D(-950801674, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A052 = AnonymousClass0fD.A05(687039881);
        0qQ.A0B(motionEvent, 0);
        AnonymousClass54P r3 = this.A08;
        if (r3 != null) {
            onTouchEvent = r3.A05.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                r3.A04.removeCallbacks(r3.A07);
                if (r3.A00) {
                    r3.A06.setGestureInProgress(false);
                    r3.A00 = false;
                }
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        AnonymousClass0fD.A0C(420402286, A052);
        return onTouchEvent;
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        this.A0F.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    public final void setAnimatePageDotSelection(boolean z) {
        this.A09 = z;
    }

    public final void setProgressBarEnabled(boolean z) {
    }

    public final void setScrollOffset(float f) {
        this.A02 = f;
    }

    public final void setScrollingItemCountThreshold(int i) {
        this.A06 = i;
    }

    public final void setShouldCarouselIndicatorProgressAnimate(boolean z) {
        this.A0B = z;
    }

    public final void setSpacing(int i) {
        this.A07 = i;
    }

    public final void DVx(int i, int i2) {
        setCurrentPage(i);
    }
}
