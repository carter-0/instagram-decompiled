package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.UHx  reason: case insensitive filesystem */
public final class C14979UHx extends C283285Gy {
    public final int A00;
    public final Object A01;

    public C14979UHx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float A04;
        float A042;
        double d;
        if (this.A00 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        0qQ.A0B(motionEvent, 0);
        WJo wJo = (WJo) this.A01;
        if (wJo.A0Q) {
            return false;
        }
        if (wJo.A0L != AnonymousClass05K.A00) {
            return true;
        }
        float f = wJo.A02;
        if (f - 1.0f < wJo.A03 - f) {
            View view = wJo.A0V;
            wJo.A04 = (((float) (view.getWidth() / 2)) - motionEvent.getX()) * (wJo.A03 - 1.0f);
            float f2 = wJo.A03;
            wJo.A05 = (((float) (view.getHeight() / 2)) - motionEvent.getY()) * (f2 - 1.0f);
            0eP A012 = WJo.A01(wJo, f2);
            A04 = AnonymousClass7TE.A04(A012.A00);
            A042 = AnonymousClass7TE.A04(A012.A01);
            d = (double) wJo.A03;
        } else {
            0eP A013 = WJo.A01(wJo, 1.0f);
            A04 = AnonymousClass7TE.A04(A013.A00);
            A042 = AnonymousClass7TE.A04(A013.A01);
            d = 1.0d;
        }
        WJo.A03(wJo, d, (double) A04, (double) A042, false);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        WJo wJo;
        int A012;
        float f3;
        float f4 = f;
        MotionEvent motionEvent3 = motionEvent2;
        float f5 = f2;
        MotionEvent motionEvent4 = motionEvent;
        switch (this.A00) {
            case 0:
                0qQ.A0B(motionEvent3, 1);
                int i = 0;
                if (motionEvent == null) {
                    return false;
                }
                float x = motionEvent4.getX() - motionEvent3.getX();
                float y = motionEvent4.getY() - motionEvent3.getY();
                float abs = Math.abs(f4);
                float abs2 = Math.abs(f5);
                if (abs <= abs2) {
                    z = true;
                    wJo = (WJo) this.A01;
                    FrameLayout.LayoutParams layoutParams = WJo.A0c;
                    if (abs2 < ((float) wJo.A0R)) {
                        return false;
                    }
                } else {
                    z = false;
                    wJo = (WJo) this.A01;
                    FrameLayout.LayoutParams layoutParams2 = WJo.A0c;
                    if (abs < ((float) wJo.A0R)) {
                        return false;
                    }
                }
                C15173UTy uTy = wJo.A0G;
                if (uTy != null) {
                    float f6 = wJo.A02;
                    View view = wJo.A0V;
                    int A05 = JTO.A05((f6 * ((float) view.getWidth())) - ((float) view.getWidth()), 2.0f);
                    int A052 = JTO.A05((wJo.A02 * ((float) view.getHeight())) - ((float) view.getHeight()), 2.0f);
                    if (!z ? !WJo.A04(wJo, x) : !WJo.A05(wJo, y)) {
                        Integer num = wJo.A0L;
                        if (num != AnonymousClass05K.A00 && num != AnonymousClass05K.A0j) {
                            return true;
                        }
                        if (Math.signum(f4) != Math.signum(wJo.A00)) {
                            f4 = -1.0f * f;
                        }
                        if (Math.signum(f5) == Math.signum(wJo.A01)) {
                            f3 = f5;
                        } else {
                            f3 = -1.0f * f2;
                        }
                        uTy.dispatchNestedPreFling(f4, f5);
                        return uTy.dispatchNestedFling(f4, f3, false);
                    }
                    wJo.A08(AnonymousClass05K.A0u);
                    OverScroller overScroller = wJo.A0W;
                    int A013 = AnonymousClass1GB.A01(wJo.A04);
                    int A014 = AnonymousClass1GB.A01(wJo.A05);
                    if (z) {
                        A012 = 0;
                        i = AnonymousClass1GB.A01(f5);
                    } else {
                        A012 = AnonymousClass1GB.A01(f4);
                    }
                    overScroller.fling(A013, A014, A012, i, -A05, A05, -A052, A052);
                    uTy.postOnAnimation(new C20120Wlg(uTy, wJo));
                    return true;
                }
                throw AnonymousClass7TE.A0y();
            case 2:
                C18739VzK vzK = (C18739VzK) this.A01;
                Scroller scroller = vzK.A06;
                scroller.forceFinished(true);
                U17 u17 = vzK.A07;
                scroller.fling(0, u17.A0A, 0, -((int) f5), 0, 0, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE);
                int finalY = scroller.getFinalY();
                if (finalY >= 0 && finalY < u17.A09) {
                    scroller.setFinalY(u17.A02(finalY));
                }
                vzK.A01 = AnonymousClass05K.A0C;
                View view2 = vzK.A05;
                Runnable runnable = vzK.A08;
                view2.removeCallbacks(runnable);
                view2.post(runnable);
                return true;
            default:
                return super.onFling(motionEvent4, motionEvent3, f4, f5);
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        03N r1;
        int i;
        int A012;
        int A013;
        int[] iArr;
        int i2;
        Integer num;
        switch (this.A00) {
            case 0:
                0qQ.A0B(motionEvent2, 1);
                if (motionEvent == null) {
                    return false;
                }
                float x = motionEvent.getX() - motionEvent2.getX();
                WJo wJo = (WJo) this.A01;
                wJo.A00 -= x;
                float y = motionEvent.getY() - motionEvent2.getY();
                wJo.A01 -= y;
                Integer num2 = wJo.A0L;
                Integer num3 = AnonymousClass05K.A0j;
                if (num2 == num3 || (num2 != (num = AnonymousClass05K.A0Y) && !WJo.A04(wJo, f) && !WJo.A05(wJo, f2))) {
                    wJo.A08(num3);
                    C15173UTy uTy = wJo.A0G;
                    if (uTy != null) {
                        r1 = uTy.A00;
                        i = 0;
                        A012 = AnonymousClass1GB.A01(x);
                        A013 = AnonymousClass1GB.A01(y);
                        iArr = null;
                        i2 = 0;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    wJo.A08(num);
                    float f3 = wJo.A04 - f;
                    wJo.A04 = f3;
                    wJo.A05 -= f2;
                    wJo.A0H.A08((double) f3, true);
                    wJo.A0I.A08((double) wJo.A05, true);
                    float f4 = wJo.A04;
                    float f5 = wJo.A05;
                    View A002 = WJo.A00(wJo);
                    A002.setTranslationX(f4);
                    A002.setTranslationY(f5);
                    C15173UTy uTy2 = wJo.A0G;
                    if (uTy2 != null) {
                        r1 = uTy2.A00;
                        i = AnonymousClass1GB.A01(x);
                        i2 = AnonymousClass1GB.A01(y);
                        A012 = 0;
                        iArr = null;
                        A013 = 0;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                r1.A06(i, i2, A012, A013, iArr);
                return true;
            case 1:
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                if (activity == null || f2 >= -1.0f * activity.getResources().getDimension(R.dimen.canvas_colour_wheel_offset_y)) {
                    return false;
                }
                activity.onBackPressed();
                return false;
            default:
                C18739VzK vzK = (C18739VzK) this.A01;
                vzK.A01 = AnonymousClass05K.A01;
                C18739VzK.A00(vzK, (int) (((float) vzK.A07.A0A) + f2));
                return true;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        C62320sa r0 = ((WJo) this.A01).A0O;
        if (r0 == null) {
            return false;
        }
        r0.invoke();
        return true;
    }
}
