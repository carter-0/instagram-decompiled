package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.instagram.direct.ui.countertextview.CounterTextView;
import org.webrtc.EglBase14Impl;

public final class U0N extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public U0N(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new U0N(obj, i));
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A01;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                return;
            case 3:
                X26 x26 = ((C14720U4e) this.A01).A06;
                if (x26 != null) {
                    x26.DkQ();
                    return;
                }
                return;
            case 4:
                X25 x25 = ((C14720U4e) this.A01).A05;
                if (x25 != null) {
                    x25.D9H();
                    return;
                }
                return;
            case 5:
                Q3Q.A01((Q3Q) this.A01);
                return;
            case 21:
                C309426Yf r1 = ((C305966Kg) this.A01).A00;
                if (r1 != null) {
                    r1.A0i = false;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        r5.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0163;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c8;
                case 5: goto L_0x015b;
                case 6: goto L_0x0005;
                case 7: goto L_0x0153;
                case 8: goto L_0x0005;
                case 9: goto L_0x00ac;
                case 10: goto L_0x014b;
                case 11: goto L_0x0005;
                case 12: goto L_0x0140;
                case 13: goto L_0x0028;
                case 14: goto L_0x009c;
                case 15: goto L_0x0087;
                case 16: goto L_0x0042;
                case 17: goto L_0x0020;
                case 18: goto L_0x0127;
                case 19: goto L_0x0008;
                case 20: goto L_0x0011;
                case 21: goto L_0x0036;
                case 22: goto L_0x0102;
                case 23: goto L_0x0008;
                case 24: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r5)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            goto L_0x0098
        L_0x0011:
            java.lang.Object r2 = r4.A01
            X.ViC r2 = (X.C17921ViC) r2
            android.widget.TextView r1 = r2.A06
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r1 = r2.A07
            r0 = 0
            goto L_0x0098
        L_0x0020:
            java.lang.Object r0 = r4.A01
            X.MrV r0 = (X.C67642MrV) r0
            android.animation.ValueAnimator r5 = r0.A05
            goto L_0x00a8
        L_0x0028:
            java.lang.Object r2 = r4.A01
            X.UWb r2 = (X.C15224UWb) r2
            com.google.android.material.internal.CheckableImageButton r1 = r2.A01
            boolean r0 = r2.A07
            r1.setChecked(r0)
            android.animation.ValueAnimator r5 = r2.A01
            goto L_0x00a8
        L_0x0036:
            java.lang.Object r0 = r4.A01
            X.6Kg r0 = (X.C305966Kg) r0
            X.6Yf r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 1
            r1.A0i = r0
            return
        L_0x0042:
            java.lang.Object r3 = r4.A01
            com.instagram.common.ui.widget.imageview.TransitionCarouselImageView r3 = (com.instagram.common.ui.widget.imageview.TransitionCarouselImageView) r3
            android.graphics.Bitmap r0 = r3.A02
            r3.A01 = r0
            android.graphics.Rect r1 = r3.A0I
            android.graphics.Rect r0 = r3.A0J
            r1.set(r0)
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0066
            android.animation.ValueAnimator r2 = r3.A0F
            android.animation.ValueAnimator r1 = r3.A0H
            float r0 = r1.getAnimatedFraction()
            r2.setCurrentFraction(r0)
            r1.cancel()
            r2.start()
        L_0x0066:
            android.graphics.Bitmap r0 = r3.A01
            if (r0 == 0) goto L_0x006d
            r3.invalidate()
        L_0x006d:
            java.util.List r2 = r3.A03
            if (r2 == 0) goto L_0x0008
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0008
            int r0 = r3.A00
            int r1 = r0 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            r3.A00 = r1
            com.instagram.common.ui.widget.imageview.TransitionCarouselImageView.A01(r3)
            return
        L_0x0087:
            java.lang.Object r2 = r4.A01
            X.UB3 r2 = (X.UB3) r2
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0008
            X.0eM r0 = r2.A0B
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 4
        L_0x0098:
            r1.setVisibility(r0)
            return
        L_0x009c:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.W4L r0 = (X.W4L) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0008
        L_0x00a8:
            r5.start()
            return
        L_0x00ac:
            super.onAnimationEnd(r5)
            java.lang.Object r2 = r4.A01
            X.UWN r2 = (X.UWN) r2
            android.util.Property r0 = X.UWN.A08
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0008
            android.animation.ObjectAnimator r1 = r2.A02
            r0 = -1
            r1.setRepeatCount(r0)
            X.6Xn r0 = r2.A03
            r0.A00()
            r0 = 0
            r2.A04 = r0
            return
        L_0x00c8:
            java.lang.Object r0 = r4.A01
            X.U4e r0 = (X.C14720U4e) r0
            X.X25 r0 = r0.A05
            if (r0 == 0) goto L_0x0008
            r0.D9H()
            return
        L_0x00d4:
            java.lang.Object r0 = r4.A01
            X.U4e r0 = (X.C14720U4e) r0
            X.X26 r0 = r0.A06
            if (r0 == 0) goto L_0x0008
            r0.DkQ()
            return
        L_0x00e0:
            java.lang.Object r1 = r4.A01
            X.TyN r1 = (X.C14558TyN) r1
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x0008
            android.view.animation.Interpolator r0 = X.C14558TyN.A07
            android.animation.ObjectAnimator r0 = r1.A04
            if (r5 != r0) goto L_0x00fa
            android.animation.ObjectAnimator r0 = r1.A03
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L_0x0008
        L_0x00fa:
            android.view.View r0 = X.C13988Tno.A0G(r1)
            X.C14558TyN.A01(r0, r1)
            return
        L_0x0102:
            java.lang.Object r0 = r4.A01
            X.WCN r0 = (X.WCN) r0
            com.instagram.ui.widget.expanding.ExpandingListView r0 = r0.A03
            java.util.List r3 = r0.A02
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0123
            java.util.Iterator r2 = r3.iterator()
        L_0x0114:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0123
            android.view.View r1 = X.JTO.A0H(r2)
            r0 = 0
            r1.setHasTransientState(r0)
            goto L_0x0114
        L_0x0123:
            r3.clear()
            return
        L_0x0127:
            java.lang.Object r2 = r4.A01
            com.instagram.direct.ui.countertextview.CounterTextView r2 = (com.instagram.direct.ui.countertextview.CounterTextView) r2
            android.graphics.Paint r1 = r2.A00
            r0 = 0
            r1.setShader(r0)
            com.instagram.direct.ui.countertextview.CounterTextView.A04(r2)
            com.instagram.direct.ui.countertextview.CounterTextView.A02(r2)
            r2.invalidate()
            java.lang.Runnable r0 = r2.A0B
            r2.post(r0)
            return
        L_0x0140:
            java.lang.Object r0 = r4.A01
            X.VV7 r0 = (X.VV7) r0
            com.google.android.material.textfield.TextInputLayout r1 = r0.A02
            r0 = 0
            r1.setEndIconVisible(r0)
            return
        L_0x014b:
            java.lang.Object r0 = r4.A01
            X.W1m r0 = (X.W1m) r0
            r0.A06()
            return
        L_0x0153:
            java.lang.Object r1 = r4.A01
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r1 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r1
            r0 = 0
            r1.A02 = r0
            return
        L_0x015b:
            java.lang.Object r0 = r4.A01
            X.Q3Q r0 = (X.Q3Q) r0
            X.Q3Q.A01(r0)
            return
        L_0x0163:
            java.lang.Object r0 = r4.A01
            X.TtI r0 = (X.C14284TtI) r0
            r0.A0J()
            r5.removeListener(r4)
            return
        L_0x016e:
            java.lang.Object r1 = r4.A01
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U0N.onAnimationEnd(android.animation.Animator):void");
    }

    public final void onAnimationRepeat(Animator animator) {
        switch (this.A00) {
            case 8:
                super.onAnimationRepeat(animator);
                UWM uwm = (UWM) this.A01;
                uwm.A01 = (uwm.A01 + 1) % uwm.A05.A05.length;
                uwm.A04 = true;
                return;
            case 9:
                super.onAnimationRepeat(animator);
                UWN uwn = (UWN) this.A01;
                uwn.A01 = (uwn.A01 + 1) % uwn.A06.A05.length;
                uwn.A05 = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        View view;
        Object obj;
        switch (this.A00) {
            case 6:
                ArrowHintView arrowHintView = (ArrowHintView) this.A01;
                arrowHintView.A00 = arrowHintView.A05;
                ImageView imageView = arrowHintView.A02;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ImageView imageView2 = arrowHintView.A02;
                    if (imageView2 != null) {
                        imageView2.setAlpha(0.0f);
                        return;
                    }
                }
                0qQ.A0F("checkView");
                throw AnonymousClass00P.createAndThrow();
            case 10:
                Handler handler = W1m.A0D;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) ((W1m) this.A01).A0A;
                snackbarContentLayout.A01.setAlpha(0.0f);
                snackbarContentLayout.A01.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
                if (snackbarContentLayout.A00.getVisibility() == 0) {
                    snackbarContentLayout.A00.setAlpha(0.0f);
                    snackbarContentLayout.A00.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
                    return;
                }
                return;
            case 11:
                ((VV7) this.A01).A02.setEndIconVisible(true);
                return;
            case 15:
                UB3 ub3 = (UB3) this.A01;
                if (ub3.A01 == AnonymousClass05K.A00) {
                    obj = ub3.A0B.getValue();
                    break;
                } else {
                    return;
                }
            case 17:
            case 24:
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                0qQ.A0B(animator, 0);
                super.onAnimationStart(animator);
                CounterTextView counterTextView = (CounterTextView) this.A01;
                counterTextView.A00.setShader(counterTextView.A01);
                counterTextView.invalidate();
                return;
            case 19:
                C17921ViC viC = (C17921ViC) this.A01;
                viC.A07.setVisibility(4);
                view = viC.A06;
                break;
            case 23:
                obj = this.A01;
                break;
            default:
                super.onAnimationStart(animator);
                return;
        }
        view = (View) obj;
        view.setVisibility(0);
    }
}
