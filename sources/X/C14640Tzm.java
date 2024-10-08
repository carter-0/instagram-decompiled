package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Tzm  reason: case insensitive filesystem */
public final class C14640Tzm {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public Scroller A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public final Runnable A0I = new C19920Whp(this);

    public static void A02(C14640Tzm tzm, float f) {
        tzm.A0A = true;
        tzm.A0H.A01(tzm.A08, f);
        tzm.A0A = false;
        if (tzm.A03 == 1) {
            tzm.A0A(0);
        }
    }

    public final void A08() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public static void A03(C14640Tzm tzm, float f, float f2, int i) {
        float[] fArr = tzm.A0B;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = tzm.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = tzm.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = tzm.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            tzm.A0B = fArr2;
            fArr = fArr2;
            tzm.A0C = fArr3;
            tzm.A0D = fArr4;
            tzm.A0E = fArr5;
        }
        tzm.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = tzm.A0C;
        tzm.A0E[i] = f2;
        fArr9[i] = f2;
        tzm.A05 |= 1 << i;
    }

    public static void A04(C14640Tzm tzm, int i) {
        float[] fArr = tzm.A0B;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            tzm.A0C[i] = 0.0f;
            tzm.A0D[i] = 0.0f;
            tzm.A0E[i] = 0.0f;
            tzm.A05 = ((1 << i) ^ -1) & tzm.A05;
        }
    }

    public static void A05(C14640Tzm tzm, int i, int i2) {
        int Bdk;
        int Bdk2;
        int left = tzm.A08.getLeft();
        int top = tzm.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = tzm.A0H;
        View view = tzm.A08;
        C14597Tz1 tz1 = ((C14916UFa) viewDragHelper$Callback).A00;
        if (tz1.A02 != null) {
            i2 = (int) (((float) i2) * 0.15f);
        }
        int i3 = top + i2;
        if (i != 0) {
            view.offsetLeftAndRight(-left);
        }
        if (i2 != 0) {
            View view2 = tzm.A08;
            if (tz1.A0C != null) {
                int height = tz1.getHeight();
                C70652Tj r4 = null;
                C70652Tj r3 = null;
                for (C70652Tj r2 : tz1.A0C) {
                    if (r4 == null) {
                        r4 = r2;
                    } else {
                        int Bdk3 = r2.Bdk(view2, height);
                        if (Bdk3 >= r3.Bdk(view2, height)) {
                            if (Bdk3 > r4.Bdk(view2, height)) {
                                r4 = r2;
                            }
                        }
                    }
                    r3 = r2;
                }
                if (r4 == null) {
                    Bdk = i3;
                } else {
                    Bdk = r4.Bdk(view2, height);
                }
                if (r3 == null) {
                    Bdk2 = i3;
                } else {
                    Bdk2 = r3.Bdk(view2, height);
                }
                i3 = height - Math.max(Bdk2, Math.min(Bdk, height - i3));
            }
            tzm.A08.offsetTopAndBottom(i3 - top);
        }
        if (i != 0 || i2 != 0) {
            viewDragHelper$Callback.A00(tzm.A08);
        }
    }

    public static boolean A06(C14640Tzm tzm, int i, int i2, int i3) {
        float f;
        int i4;
        int min;
        int i5 = i3;
        int left = tzm.A08.getLeft();
        int top = tzm.A08.getTop();
        int i6 = -left;
        int i7 = i - top;
        if (i6 == 0 && i7 == 0) {
            tzm.A09.abortAnimation();
            tzm.A0A(0);
            return false;
        }
        if (i3 < 0) {
            int i8 = (int) tzm.A01;
            int i9 = (int) tzm.A00;
            int abs = Math.abs(i2);
            if (abs < i8) {
                i2 = 0;
            } else if (abs > i9) {
                if (i2 <= 0) {
                    i9 = -i9;
                }
                i2 = i9;
            }
            int abs2 = Math.abs(i6);
            int abs3 = Math.abs(i7);
            int i10 = abs2 + abs3;
            if (i2 != 0) {
                f = 1.0f;
            } else {
                f = ((float) abs3) / ((float) i10);
            }
            int height = ((C14916UFa) tzm.A0H).A00.getHeight();
            int width = tzm.A0G.getWidth();
            if (i7 == 0) {
                min = 0;
            } else {
                float f2 = (float) abs3;
                float f3 = (float) (width / 2);
                float sin = f3 + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, f2 / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f3);
                int abs4 = Math.abs(i2);
                if (abs4 > 0) {
                    i4 = AnonymousClass7TE.A05(Math.abs(sin / ((float) abs4)), 1000.0f) * 4;
                } else {
                    i4 = (int) (((f2 / ((float) height)) + 1.0f) * 256.0f);
                }
                min = Math.min(i4, 600);
            }
            i5 = (int) (((float) min) * f);
        }
        tzm.A09.startScroll(left, top, i6, i7, i5);
        tzm.A04 = top + i7;
        tzm.A0A(2);
        return true;
    }

    public final View A07(int i, int i2) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void A09() {
        Scroller scroller = this.A09;
        Scroller scroller2 = this.A0F;
        if (scroller != scroller2) {
            A08();
            if (this.A03 == 2) {
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A09.abortAnimation();
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A0H.A00(this.A08);
            }
            A0A(0);
            this.A09 = scroller2;
        }
    }

    public final void A0A(int i) {
        C70652Tj r2;
        if (this.A03 != i) {
            this.A03 = i;
            C14597Tz1 tz1 = ((C14916UFa) this.A0H).A00;
            View view = tz1.A01;
            if (view != null && view.isLaidOut()) {
                List<C20941X5k> list = tz1.A0H;
                if (!list.isEmpty()) {
                    if (i == 0) {
                        List emptyList = Collections.emptyList();
                        View view2 = tz1.A01;
                        if (view2 == null || !view2.isLaidOut()) {
                            r2 = null;
                        } else {
                            int height = tz1.getHeight();
                            r2 = C14597Tz1.A00(view2, tz1, emptyList, height - view2.getTop(), height);
                        }
                        tz1.A04 = r2;
                        for (C20941X5k DYK : list) {
                            DYK.DYK(view, r2);
                        }
                        this.A08 = null;
                    }
                    return;
                }
            }
            if (i != 0) {
                return;
            }
            this.A08 = null;
        }
    }

    public final boolean A0B(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0G;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            A0A(1);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(viewGroup);
        throw Pxg.A0d(")", sb);
    }

    public C14640Tzm(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A09 = scroller;
        this.A0F = scroller;
    }

    public static float A00(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    public static void A01(MotionEvent motionEvent, C14640Tzm tzm) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & tzm.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                tzm.A0D[pointerId] = x;
                tzm.A0E[pointerId] = y;
            }
        }
    }
}
