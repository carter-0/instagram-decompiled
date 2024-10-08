package com.instagram.reels.viewer.attribution;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass6KC;
import X.AnonymousClass6KQ;
import X.AnonymousClass6KR;
import X.C74266Pru;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CyclingFrameLayout extends FrameLayout {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public C74266Pru A04;
    public Integer A05;
    public boolean A06;
    public int A07;
    public UserSession A08;
    public Runnable A09;
    public boolean A0A;
    public final List A0B;
    public final Handler A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A04() {
        this.A0A = false;
        this.A06 = true;
        this.A07 = 2500;
        this.A05 = null;
        Runnable runnable = this.A09;
        if (runnable != null) {
            this.A0C.removeCallbacks(runnable);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        List<View> list = this.A0B;
        for (View view : list) {
            view.setAlpha(1.0f);
            view.setVisibility(8);
            view.setY(this.A00);
        }
        list.clear();
    }

    public final void A05(UserSession userSession, List list) {
        this.A08 = userSession;
        List<View> list2 = this.A0B;
        list2.addAll(00k.A0X(list));
        for (View visibility : list2) {
            visibility.setVisibility(8);
        }
        if (!list.isEmpty()) {
            this.A00 = ((View) list2.get(0)).getY();
        }
        this.A02 = 0;
        A01(this);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            List list = this.A0B;
            if (!list.isEmpty()) {
                View view = (View) list.get(this.A02);
                View view2 = (View) list.get(getNextViewIndex());
                Object animatedValue = valueAnimator.getAnimatedValue();
                0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue).floatValue();
                float f = 1.0f - floatValue;
                view.setAlpha(f);
                view2.setAlpha(floatValue);
                float height = ((float) ((View) list.get(this.A02)).getHeight()) * this.A01;
                view.setY(this.A00 - (floatValue * height));
                view2.setY(this.A00 + (height * f));
            }
        }
    }

    public static final void A01(CyclingFrameLayout cyclingFrameLayout) {
        ((View) cyclingFrameLayout.A0B.get(cyclingFrameLayout.A02)).setVisibility(0);
        AnonymousClass6KC r3 = new AnonymousClass6KC(cyclingFrameLayout);
        cyclingFrameLayout.A09 = r3;
        cyclingFrameLayout.A0C.postDelayed(r3, (long) cyclingFrameLayout.A07);
    }

    public static final void A02(CyclingFrameLayout cyclingFrameLayout) {
        if (!cyclingFrameLayout.A0B.isEmpty()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            cyclingFrameLayout.A03 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(400);
            ofFloat.addUpdateListener(new AnonymousClass6KQ(cyclingFrameLayout));
            ofFloat.addListener(new AnonymousClass6KR(cyclingFrameLayout));
            cyclingFrameLayout.setLayerType(2);
            ofFloat.start();
        }
    }

    /* access modifiers changed from: private */
    public final int getNextViewIndex() {
        return (this.A02 + 1) % this.A0B.size();
    }

    /* access modifiers changed from: private */
    public final void setLayerType(int i) {
        List list = this.A0B;
        if (!list.isEmpty()) {
            ((View) list.get(this.A02)).setLayerType(i, (Paint) null);
            ((View) list.get(getNextViewIndex())).setLayerType(i, (Paint) null);
        }
    }

    public final View getCurrentVisibleView() {
        return (View) this.A0B.get(this.A02);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.A0B.isEmpty();
    }

    public final void setTimeToShowEachAttributionMs(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2500;
        }
        this.A07 = i;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(444490429);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
        A04();
        setOnClickListener((View.OnClickListener) null);
        this.A04 = null;
        AnonymousClass0fD.A0D(-1511526921, A062);
    }

    public final void onWindowFocusChanged(boolean z) {
        ValueAnimator valueAnimator;
        int A062 = AnonymousClass0fD.A06(-77578033);
        super.onWindowFocusChanged(z);
        UserSession userSession = this.A08;
        if (userSession != null && Boolean.valueOf(182.A06(0Tu.A05, userSession, 36326519857100599L)).booleanValue()) {
            if (z) {
                this.A06 = true;
                if (this.A0A && (valueAnimator = this.A03) != null && !valueAnimator.isRunning()) {
                    ((View) this.A0B.get(this.A02)).setVisibility(0);
                    A02(this);
                }
                this.A0A = false;
            } else if (!this.A0B.isEmpty()) {
                this.A06 = false;
                this.A0A = true;
                Runnable runnable = this.A09;
                if (runnable != null) {
                    this.A0C.removeCallbacks(runnable);
                }
            }
        }
        AnonymousClass0fD.A0D(-1863272788, A062);
    }

    public final void setDelegate(C74266Pru pru) {
        this.A04 = pru;
    }

    public final void setHeightFactor(float f) {
        this.A01 = f;
    }

    public final void setRepeatCount(Integer num) {
        this.A05 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0B = new ArrayList();
        this.A06 = true;
        this.A07 = 2500;
        this.A01 = 1.0f;
        setWillNotDraw(false);
        this.A0C = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CyclingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
