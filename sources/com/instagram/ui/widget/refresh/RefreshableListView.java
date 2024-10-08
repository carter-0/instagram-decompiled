package com.instagram.ui.widget.refresh;

import X.2Yu;
import X.2cs;
import X.AnonymousClass03M;
import X.AnonymousClass0fD;
import X.AnonymousClass3DB;
import X.C19763Wf4;
import X.C20094Wks;
import X.C228252l5;
import X.C252203oj;
import X.C323676xv;
import X.C323686xw;
import X.C61340me;
import X.C71392co;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;

public class RefreshableListView extends ListView implements C252203oj, AnonymousClass3DB, AnonymousClass03M {
    public int A00;
    public AbsListView.OnScrollListener A01;
    public AbsListView.OnScrollListener A02;
    public C19763Wf4 A03;
    public C228252l5 A04;
    public C323676xv A05 = C323676xv.PULLING_TO_REFRESH;
    public Runnable A06;
    public boolean A07 = true;
    public boolean A08;
    public float A09 = -1.0f;
    public int A0A;
    public int A0B;
    public Paint A0C;
    public Paint A0D;
    public Drawable A0E;
    public LayerDrawable A0F;
    public View.OnClickListener A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = true;
    public boolean A0K;
    public final AlphaAnimation A0L = new AlphaAnimation(0.0f, 1.0f);
    public final AbsListView.OnScrollListener A0M = new C323686xw(this);
    public final AlphaAnimation A0N = new AlphaAnimation(-0.2f, 0.2f);
    public final Transformation A0O = new Transformation();
    public final 2cs A0P = C61340me.A00().A02();

    public final void APL() {
        this.A08 = false;
        C19763Wf4 wf4 = this.A03;
        if (wf4 != null) {
            wf4.APL();
        }
    }

    public final void AWI() {
        setIsLoading(true);
        if (this.A06 == null) {
            C20094Wks wks = new C20094Wks(this);
            this.A06 = wks;
            post(wks);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (this.A08 && this.A03 == null && CaY()) {
            canvas.save();
            canvas.translate(0.0f, (float) (this.A00 + getScrollY()));
            Paint paint = this.A0D;
            if (paint != null) {
                canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) (-getScrollY()), paint);
            }
            if (this.A07 && (-getScrollY()) > this.A0B) {
                canvas2.drawLine(0.0f, (float) (-getScrollY()), (float) getWidth(), (float) (-getScrollY()), this.A0C);
            }
            canvas.translate((float) ((getWidth() - this.A0A) / 2), 0.0f);
            canvas.clipRect(0, 0, getWidth(), -getScrollY());
            AlphaAnimation alphaAnimation = this.A0N;
            long drawingTime = getDrawingTime();
            Transformation transformation = this.A0O;
            if (alphaAnimation.getTransformation(drawingTime, transformation)) {
                float abs = 1.2f - Math.abs(transformation.getAlpha());
                float f = (float) (this.A0A / 2);
                canvas.scale(abs, abs, f, f);
            }
            if (this.A05 == C323676xv.PULLING_TO_REFRESH) {
                this.A0F.draw(canvas);
            } else if (this.A0J && this.A0L.getTransformation(getDrawingTime(), transformation)) {
                int i = this.A0A;
                float min = Math.min(1.0f, (((float) (-getScrollY())) * 1.0f) / ((float) i));
                float f2 = (float) (i / 2);
                canvas.scale(min, min, f2, f2);
                this.A0E.setLevel((int) (transformation.getAlpha() * 10000.0f));
                this.A0E.draw(canvas);
                postInvalidateOnAnimation();
            }
            canvas.restore();
        }
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        scrollTo(0, Math.min(0, A00((float) (-i4))));
        A03();
        return super.dispatchNestedScroll(i, i2 + i4, i3, 0, iArr);
    }

    public void setUpPTRSpinner(C19763Wf4 wf4) {
        this.A08 = true;
        this.A03 = wf4;
    }

    public void setupAndEnableRefresh(View.OnClickListener onClickListener) {
        this.A08 = true;
        this.A0G = onClickListener;
    }

    private void A02() {
        if (this.A05 != C323676xv.PULLING_TO_REFRESH && this.A0I && getVisibility() == 0 && CaY()) {
            AlphaAnimation alphaAnimation = this.A0L;
            alphaAnimation.setDuration(700);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setStartTime(-1);
            alphaAnimation.start();
        }
    }

    public static void A04(RefreshableListView refreshableListView) {
        double d;
        2cs r3 = refreshableListView.A0P;
        r3.A09(C71392co.A04(70.0d, 11.0d));
        r3.A02 = 1.0d;
        r3.A00 = 0.5d;
        r3.A0A(refreshableListView);
        r3.A08((double) refreshableListView.getScrollY(), true);
        if (refreshableListView.A05 == C323676xv.REFRESHING) {
            d = (double) (-refreshableListView.A0A);
        } else {
            d = 0.0d;
        }
        r3.A06(d);
    }

    private void setState(C323676xv r3) {
        if (!this.A0J && r3 == C323676xv.REFRESHING) {
            r3 = C323676xv.COLLAPSING;
        }
        this.A05 = r3;
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            this.A0L.cancel();
        } else if (ordinal == 1) {
            A02();
        } else if (ordinal == 2) {
            A04(this);
        }
    }

    public final void ARa() {
        if (this.A0G != null) {
            this.A08 = true;
        }
        C19763Wf4 wf4 = this.A03;
        if (wf4 != null) {
            wf4.ARa();
        }
    }

    public final boolean CaY() {
        C19763Wf4 wf4 = this.A03;
        if (wf4 != null) {
            return wf4.A00.A0G;
        }
        if (getScrollY() < 0) {
            return true;
        }
        return false;
    }

    public final void DmE(2cs r5) {
        if (this.A03 == null) {
            A03();
            scrollTo(0, (int) r5.A09.A00);
            if (!CaY() && this.A05 == C323676xv.COLLAPSING) {
                setState(C323676xv.PULLING_TO_REFRESH);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A03 == null) {
            if (motionEvent.getAction() == 0 && CaY()) {
                this.A0K = true;
            }
            if (this.A05 != C323676xv.REFRESHING || !CaY()) {
                this.A09 = motionEvent.getRawY();
            } else {
                if (this.A09 == -1.0f) {
                    this.A09 = motionEvent.getRawY();
                }
                onTouchEvent(motionEvent);
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.A05 != C323676xv.COLLAPSING && !z2) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    public void setIsLoading(boolean z) {
        C323676xv r0;
        if (z) {
            setState(C323676xv.REFRESHING);
            invalidate();
            return;
        }
        Runnable runnable = this.A06;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A06 = null;
        }
        if (!CaY()) {
            r0 = C323676xv.PULLING_TO_REFRESH;
        } else {
            r0 = C323676xv.COLLAPSING;
        }
        setState(r0);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        AbsListView.OnScrollListener onScrollListener2 = this.A0M;
        super.setOnScrollListener(onScrollListener2);
        if (onScrollListener != onScrollListener2) {
            this.A02 = onScrollListener;
        }
    }

    public void setPullToRefreshBackgroundColor(int i) {
        Paint paint = new Paint();
        this.A0D = paint;
        paint.setColor(i);
    }

    public RefreshableListView(Context context) {
        super(context);
        A01();
    }

    private int A00(float f) {
        float f2 = (float) (-getScrollY());
        float f3 = (float) this.A0A;
        if (f2 < f3 * 1.4f) {
            return (int) (-(f2 + f));
        }
        return (int) (-Math.sqrt((double) Math.max(0.0f, (f * f3 * 1.4f) + ((float) (getScrollY() * getScrollY())))));
    }

    private void A01() {
        this.A0A = getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        Context context = getContext();
        LayerDrawable layerDrawable = (LayerDrawable) context.getDrawable(R.drawable.refreshable_progress_drawable);
        this.A0F = layerDrawable;
        int i = this.A0A;
        layerDrawable.setBounds(0, 0, i, i);
        Drawable drawable = context.getDrawable(R.drawable.refreshable_spinner_drawable);
        this.A0E = drawable;
        int i2 = this.A0A;
        drawable.setBounds(0, 0, i2, i2);
        Paint paint = new Paint();
        this.A0C = paint;
        paint.setColor(2Yu.A0F(context, R.attr.dividerColor));
        this.A0C.setStrokeWidth(0.0f);
        this.A0B = ViewConfiguration.get(context).getScaledOverflingDistance();
        setOnScrollListener(this.A0M);
    }

    private void A03() {
        this.A0F.setLevel((int) (Math.max(0.0f, getScrollAsFactorOfProgressDrawableSize()) * 10000.0f));
        if ((this.A04 == null || this.A0H) && this.A05 == C323676xv.PULLING_TO_REFRESH && this.A0F.getLevel() >= 10000) {
            AlphaAnimation alphaAnimation = this.A0N;
            alphaAnimation.setDuration(300);
            alphaAnimation.setStartTime(-1);
            alphaAnimation.start();
            setState(C323676xv.REFRESHING);
            View.OnClickListener onClickListener = this.A0G;
            onClickListener.getClass();
            onClickListener.onClick(this);
        } else if (this.A05 == C323676xv.REFRESHING) {
            AlphaAnimation alphaAnimation2 = this.A0L;
            if (!alphaAnimation2.hasStarted() || alphaAnimation2.hasEnded()) {
                A02();
            }
        }
    }

    private float getScrollAsFactorOfProgressDrawableSize() {
        float f = (float) (-getScrollY());
        float f2 = (float) this.A0A;
        return (f - (0.4f * f2)) / f2;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(72929578);
        super.onAttachedToWindow();
        this.A0I = true;
        A02();
        AnonymousClass0fD.A0D(-1009905561, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1521583130);
        super.onDetachedFromWindow();
        this.A0I = false;
        this.A0L.cancel();
        2cs r3 = this.A0P;
        r3.A0B(this);
        r3.A08(r3.A01, true);
        AnonymousClass0fD.A0D(977747204, A062);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (CaY() && (getFirstVisiblePosition() != 0 || getChildCount() == 0 || getChildAt(0).getTop() < getPaddingTop())) {
            setScrollY(0);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r8.getAction() == 1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 69097984(0x41e5a00, float:1.8614137E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.Wf4 r0 = r7.A03
            if (r0 == 0) goto L_0x0016
            boolean r1 = super.onTouchEvent(r8)
            r0 = -544755739(0xffffffffdf87afe5, float:-1.955457E19)
        L_0x0012:
            X.AnonymousClass0fD.A0C(r0, r2)
            return r1
        L_0x0016:
            int r0 = r8.getAction()
            r6 = 3
            r1 = 1
            r4 = 0
            if (r0 == r6) goto L_0x0026
            int r3 = r8.getAction()
            r0 = 0
            if (r3 != r1) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r7.A0H = r0
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00a8
            float r3 = r8.getRawY()
            X.6xv r5 = r7.A05
            X.6xv r0 = X.C323676xv.COLLAPSING
            if (r5 == r0) goto L_0x0073
            int r5 = r8.getActionMasked()
            r0 = 2
            if (r5 != r0) goto L_0x0097
            int r0 = r7.getFirstVisiblePosition()
            if (r0 != 0) goto L_0x0064
            int r0 = r7.getChildCount()
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r7.getChildAt(r4)
            int r5 = r0.getTop()
            int r0 = r7.getPaddingTop()
            if (r5 < r0) goto L_0x0064
            float r0 = r7.A09
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            boolean r0 = r7.hasNestedScrollingParent()
            if (r0 == 0) goto L_0x0083
        L_0x0064:
            boolean r0 = r7.CaY()
            if (r0 != 0) goto L_0x0083
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0073
            r7.A0K = r4
            r8.setAction(r4)
        L_0x0073:
            r0 = 0
        L_0x0074:
            r7.A09 = r3
            if (r0 != 0) goto L_0x007f
            boolean r0 = super.onTouchEvent(r8)
            if (r0 != 0) goto L_0x007f
            r1 = 0
        L_0x007f:
            r0 = -211447861(0xfffffffff3658fcb, float:-1.8187751E31)
            goto L_0x0012
        L_0x0083:
            float r0 = r7.A09
            float r0 = r3 - r0
            int r0 = r7.A00(r0)
            int r0 = java.lang.Math.min(r4, r0)
            r7.scrollTo(r4, r0)
            r7.A03()
            r0 = 1
            goto L_0x0074
        L_0x0097:
            if (r5 == r1) goto L_0x009b
            if (r5 != r6) goto L_0x0073
        L_0x009b:
            boolean r0 = r7.CaY()
            if (r0 == 0) goto L_0x0073
            A04(r7)
            r8.setAction(r6)
            goto L_0x0073
        L_0x00a8:
            boolean r1 = super.onTouchEvent(r8)
            r0 = 52075533(0x31a9c0d, float:4.543567E-37)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.refresh.RefreshableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AlphaAnimation alphaAnimation = this.A0L;
        if (alphaAnimation == null) {
            return;
        }
        if (i == 0) {
            A02();
        } else {
            alphaAnimation.cancel();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        int A062 = AnonymousClass0fD.A06(550934797);
        int scrollY = getScrollY();
        super.onWindowFocusChanged(z);
        setScrollY(scrollY);
        AnonymousClass0fD.A0D(1731029879, A062);
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.A03 == null) {
            C228252l5 r2 = this.A04;
            if (r2 != null) {
                r2.E5B(getScrollAsFactorOfProgressDrawableSize(), getScrollAsFactorOfProgressDrawableSize());
            }
            this.A0M.onScroll(this, getFirstVisiblePosition(), getChildCount(), getCount());
        }
    }

    public void setDrawBorder(boolean z) {
        this.A07 = z;
    }

    public void setDrawableTopOffset(int i) {
        this.A00 = i;
    }

    public void setGlobalOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A01 = onScrollListener;
    }

    public void setPullDownProgressDelegate(C228252l5 r1) {
        this.A04 = r1;
    }

    public RefreshableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
