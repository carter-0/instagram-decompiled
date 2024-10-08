package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

/* renamed from: X.U4e  reason: case insensitive filesystem */
public final class C14720U4e extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public X25 A05;
    public X26 A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public Tz8 A0B;
    public C273694n2 A0C;
    public AnonymousClass6NS A0D;
    public boolean A0E;
    public final Animator.AnimatorListener A0F = new U0N(this, 4);
    public final Animator.AnimatorListener A0G = new U0N(this, 3);
    public final GestureDetector.OnGestureListener A0H;
    public final GestureDetector A0I;
    public final Runnable A0J = new C19922Whr(this);

    public C14720U4e(Context context, Integer num, boolean z) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener w83 = new W83(this);
        this.A0H = w83;
        this.A09 = z;
        this.A07 = num;
        this.A0I = new GestureDetector(context, !z ? new C14705U2p(this) : w83);
    }

    public final void A02() {
        View activityRootView;
        setAlpha(0.0f);
        if (this.A0A && this.A07.equals(AnonymousClass05K.A01) && (activityRootView = getActivityRootView()) != null) {
            Tz8 tz8 = new Tz8(activityRootView, false);
            this.A0B = tz8;
            tz8.A03.add(new WF6(activityRootView, this));
            this.A0B.onGlobalLayout();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new WC9(this, 4));
    }

    public static void A00(C14720U4e u4e) {
        AccessibilityManager accessibilityManager;
        if (u4e.A00 != 0 && !u4e.A0E) {
            Runnable runnable = u4e.A0J;
            u4e.removeCallbacks(runnable);
            int i = u4e.A00;
            if (Build.VERSION.SDK_INT >= 29 && (accessibilityManager = (AccessibilityManager) u4e.getContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled()) {
                i = accessibilityManager.getRecommendedTimeoutMillis(i, 3);
            }
            u4e.postDelayed(runnable, (long) i);
        }
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() > C13988Tno.A01(getHeight())) {
                A03(this.A01);
            } else {
                A04((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public final void A03(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0J);
        this.A0E = true;
        if (getContext() == null || !isAttachedToWindow()) {
            X25 x25 = this.A05;
            if (x25 != null) {
                x25.D9H();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A09) {
            clearAnimation();
            alpha = animate().setDuration((long) i).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A07.equals(AnonymousClass05K.A00);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i).translationY((float) height).setInterpolator(this.A03).alpha(0.0f);
        }
        alpha.setListener(this.A0F);
        Tz8 tz8 = this.A0B;
        if (tz8 != null) {
            tz8.A03.clear();
            ViewTreeObserver viewTreeObserver = tz8.A02.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(tz8);
            }
            this.A0B = null;
        }
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setBloksContentViewFromParseResult(C307786Rm r4, C3034368u r5) {
        AnonymousClass6NS r0 = this.A0D;
        if (r0 != null) {
            r0.A03();
            this.A0D = null;
        }
        C273694n2 r02 = this.A0C;
        if (r02 != null) {
            removeView(r02);
        }
        Context context = r4.A00;
        if (!context.equals(getContext())) {
            1Kn.A02("bk.action.toast.ShowToastV2", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A0C = new C273694n2(context);
        AnonymousClass6NS A002 = AnonymousClass6NS.A00(context, r5, r4.A02).A00();
        this.A0D = A002;
        A002.A07(this.A0C);
        setContentView(this.A0D.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            1Kn.A02("bk.action.toast.ShowToastV2", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(X25 x25) {
        this.A05 = x25;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAboveKeyboard(boolean z) {
        this.A0A = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(X26 x26) {
        this.A06 = x26;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }

    private View getActivityRootView() {
        Window window;
        Activity A002 = C46604Dhk.A00(getContext());
        if (A002 == null || (window = A002.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().findViewById(16908290);
    }

    public final void A04(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration((long) i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1065279139);
        super.onDetachedFromWindow();
        AnonymousClass6NS r0 = this.A0D;
        if (r0 != null) {
            r0.A03();
            this.A0D = null;
            this.A0C = null;
        }
        AnonymousClass0fD.A0D(1929518435, A062);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0J);
        } else if (action == 1 || action == 3) {
            A00(this);
            A01();
        }
        return this.A0I.onTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(-538809931);
        boolean onTouchEvent = this.A0I.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        boolean z2 = true;
        if (action == 0) {
            this.A08 = false;
            i = -1153010405;
        } else if (action == 1 || action == 3) {
            A00(this);
            z2 = A01();
            i = -688547336;
        } else {
            if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                z = true;
            }
            AnonymousClass0fD.A0C(-759278360, A052);
            return z;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z2;
    }
}
