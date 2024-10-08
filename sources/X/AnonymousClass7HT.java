package X;

import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.7HT  reason: invalid class name */
public final class AnonymousClass7HT implements View.OnTouchListener, C252203oj, C234382xm, C234392xn {
    public static final C71392co A0N = C71392co.A04(40.0d, 5.0d);
    public static final C71392co A0O = C71392co.A02;
    public static final C71392co A0P = C71392co.A04(90.0d, 0.0d);
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03 = 1.0f;
    public int A04;
    public int A05;
    public View A06;
    public ViewGroup.LayoutParams A07;
    public TouchInterceptorFrameLayout A08;
    public 2cv A09;
    public C253723rH A0A;
    public C253913rc A0B;
    public AnonymousClass7HV A0C;
    public Integer A0D = AnonymousClass05K.A00;
    public boolean A0E;
    public float A0F;
    public final ViewGroup A0G;
    public final 2cs A0H;
    public final 2cs A0I;
    public final 2cs A0J;
    public final 2cs A0K;
    public final PointF A0L = new PointF();
    public final PointF A0M;

    public final void Dgt(C253913rc r1) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A0E = true;
        C253913rc r0 = this.A0B;
        if (r0 != null) {
            r0.A01(motionEvent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r10 < 0.0f) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r9 < 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(float r9, float r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.A06
            if (r0 == 0) goto L_0x005d
            float r7 = r0.getScaleX()
            android.view.View r0 = r8.A06
            int r0 = r0.getMeasuredWidth()
            float r1 = (float) r0
            android.view.View r0 = r8.A06
            int r0 = r0.getMeasuredHeight()
            float r3 = (float) r0
            float r2 = r1 * r7
            float r2 = r2 - r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r3 * r7
            float r1 = r1 - r3
            float r1 = r1 / r0
            float r6 = r8.A00
            android.view.View r0 = r8.A06
            float r0 = r0.getScaleX()
            float r0 = r0 * r9
            float r6 = r6 + r0
            float r3 = r8.A01
            android.view.View r0 = r8.A06
            float r0 = r0.getScaleY()
            float r0 = r0 * r10
            float r3 = r3 + r0
            r5 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
        L_0x0043:
            r8.A00 = r2
        L_0x0045:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
        L_0x0051:
            r8.A01 = r1
        L_0x0053:
            android.view.View r0 = r8.A06
            if (r0 == 0) goto L_0x005d
            r0.setTranslationX(r2)
            r0.setTranslationY(r1)
        L_0x005d:
            return
        L_0x005e:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            float r1 = -r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            goto L_0x0051
        L_0x006c:
            r8.A01 = r3
            r1 = r3
            goto L_0x0053
        L_0x0070:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007e
            float r2 = -r2
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            goto L_0x0043
        L_0x007e:
            r8.A00 = r6
            r2 = r6
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HT.A01(float, float):void");
    }

    private void A02(float f, float f2) {
        PointF pointF = this.A0M;
        pointF.x = f;
        pointF.y = f2;
        View view = this.A06;
        if (view != null) {
            view.setPivotX(f);
            view.setPivotY(f2);
        }
    }

    public final void A04() {
        this.A0D = AnonymousClass05K.A0C;
        2cs r3 = this.A0I;
        r3.A02();
        r3.A04();
        2cs r2 = this.A0J;
        r2.A02();
        r2.A04();
        this.A03 = 1.0f;
        Integer num = this.A0D;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            this.A0D = num2;
            C253913rc r0 = this.A0B;
            if (r0 != null) {
                r0.A01.remove(this);
            }
            this.A0K.A0B(this);
            this.A0H.A0B(this);
            r2.A0D.clear();
            r3.A0D.clear();
            ViewGroup.LayoutParams layoutParams = this.A07;
            C253723rH r5 = this.A0A;
            View view = this.A06;
            if (!(view == null || r5 == null || layoutParams == null)) {
                A02(((float) view.getWidth()) / 2.0f, ((float) view.getHeight()) / 2.0f);
                float f = this.A02;
                View view2 = this.A06;
                if (view2 != null) {
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(f);
                }
                A00(1.0f);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A08;
                if (touchInterceptorFrameLayout != null) {
                    touchInterceptorFrameLayout.detachViewFromParent(view);
                    touchInterceptorFrameLayout.setVisibility(8);
                }
                r5.ACu(view, this.A04, layoutParams);
                0nA.A0V((View) r5, layoutParams.height);
                view.requestLayout();
            }
            this.A04 = -1;
            this.A07 = null;
            this.A05 = 0;
            this.A00 = 0.0f;
            this.A01 = 0.0f;
            2cv r02 = this.A09;
            if (r02 != null) {
                r02.CNi((View.OnTouchListener) null);
            }
            View view3 = this.A06;
            AnonymousClass7HV r03 = this.A0C;
            if (!(r03 == null || view3 == null)) {
                r03.E0a(view3);
            }
            this.A09 = null;
            this.A0B = null;
            this.A0E = false;
            this.A06 = null;
            C253723rH r04 = this.A0A;
            if (r04 != null) {
                r04.requestDisallowInterceptTouchEvent(false);
                r04.setHasTransientState(false);
            }
            this.A0A = null;
        }
    }

    /* renamed from: A05 */
    public final void Exy(View view, C253723rH r8, C253913rc r9) {
        this.A0D = AnonymousClass05K.A01;
        this.A0A = r8;
        0nA.A0V((View) r8, view.getMeasuredHeight());
        this.A0A.setHasTransientState(true);
        this.A06 = view;
        this.A02 = view.getTranslationY();
        this.A07 = view.getLayoutParams();
        this.A0B = r9;
        r9.A01.add(this);
        2cv r1 = this.A09;
        if (r1 == null) {
            r1 = C324286z2.A00(view);
            this.A09 = r1;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A08;
        if (r1 != null && touchInterceptorFrameLayout != null) {
            r1.requestDisallowInterceptTouchEvent(false);
            r1.CNi(this);
            r1.getParent().requestDisallowInterceptTouchEvent(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            r1.getLocationInWindow(iArr);
            this.A05 = i - iArr[1];
            int indexOfChild = r8.indexOfChild(view);
            this.A04 = indexOfChild;
            if (indexOfChild != -1) {
                r8.AOy(view);
                r8.invalidate();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            touchInterceptorFrameLayout.setVisibility(0);
            touchInterceptorFrameLayout.attachViewToParent(view, 0, layoutParams);
            touchInterceptorFrameLayout.bringToFront();
            ViewGroup viewGroup = this.A0G;
            viewGroup.requestLayout();
            viewGroup.invalidate();
            ScaleGestureDetector scaleGestureDetector = r9.A00;
            A02(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            2cs r0 = this.A0K;
            r0.A05(0.0d);
            r0.A0A(this);
            2cs r12 = this.A0I;
            r12.A05(0.0d);
            r12.A0A(new WJh(this));
            2cs r13 = this.A0J;
            r13.A05(0.0d);
            r13.A0A(new WJi(this));
            AnonymousClass7HV r02 = this.A0C;
            if (r02 != null) {
                r02.E0b(view);
            }
        }
    }

    public final boolean Dgn(C253913rc r8) {
        ScaleGestureDetector scaleGestureDetector = r8.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0E;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= (float) this.A05;
        }
        float f = focusY + this.A02;
        PointF pointF = this.A0M;
        float f2 = focusX - pointF.x;
        float f3 = f - pointF.y;
        if (this.A06 != null) {
            A01(f2, f3);
            A02(focusX, f);
        }
        2cs r6 = this.A0K;
        C71412ct r3 = r6.A09;
        double A002 = r3.A00 * ((double) r8.A00());
        if (A002 > 3.0d) {
            double d = r3.A00;
            if (A002 > d) {
                A002 = ((A002 - d) * 0.30000001192092896d) + d;
            }
        }
        r6.A05(Math.min(Math.max(A002, 1.0d), 3.200000047683716d));
        float A003 = this.A03 * r8.A00();
        this.A03 = A003;
        this.A03 = Math.max(1.0f, Math.min(A003, 3.2f));
        return true;
    }

    public final boolean Dgo(C253913rc r6) {
        this.A0D = AnonymousClass05K.A01;
        ScaleGestureDetector scaleGestureDetector = r6.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0E;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= (float) this.A05;
        }
        float f = focusY + this.A02;
        PointF pointF = this.A0M;
        float f2 = focusX - pointF.x;
        float f3 = f - pointF.y;
        if (this.A06 == null) {
            return true;
        }
        A01(f2, f3);
        A02(focusX, f);
        return true;
    }

    public final void DmE(2cs r12) {
        float f = (float) r12.A09.A00;
        this.A0F = f;
        if (this.A0D == AnonymousClass05K.A01) {
            A00(f);
            return;
        }
        C71412ct r4 = this.A0K.A09;
        A00((float) AnonymousClass37Q.A03((double) f, 1.0d, r4.A00));
        double d = (double) this.A0F;
        double d2 = r4.A00;
        float A012 = (float) AnonymousClass37Q.A01(d, ((double) this.A00) * d2);
        float A013 = (float) AnonymousClass37Q.A01(d, ((double) this.A01) * d2);
        View view = this.A06;
        if (view != null) {
            view.setTranslationX(A012);
            view.setTranslationY(A013);
        }
    }

    public final boolean isIdle() {
        if (this.A0D == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final void start() {
        ViewGroup viewGroup = this.A0G;
        TouchInterceptorFrameLayout inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zoom, viewGroup, false);
        this.A08 = inflate;
        if (inflate.getBackground() != null) {
            this.A08.getBackground().mutate().setAlpha(0);
        }
        this.A08.A00(new C18896WBo(this), new C18897WBp(this));
        viewGroup.addView(this.A08);
    }

    public final void stop() {
        this.A0G.post(new C14184TrO(this));
    }

    public AnonymousClass7HT(ViewGroup viewGroup) {
        this.A0G = viewGroup;
        this.A0M = new PointF();
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A09(A0P);
        this.A0K = A022;
        2cs A023 = A002.A02();
        C71392co r1 = A0O;
        A023.A09(r1);
        this.A0I = A023;
        2cs A024 = A002.A02();
        A024.A09(r1);
        this.A0J = A024;
        2cs A025 = A002.A02();
        A025.A09(A0N);
        A025.A06 = true;
        this.A0H = A025;
    }

    private void A00(float f) {
        if (Float.isNaN(f)) {
            0wb.A03("MultiGestureZoomableViewController", "updateScaleFactor() scale value is NaN resetting to default");
            f = 1.0f;
        }
        View view = this.A06;
        if (view != null) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public static void A03(MotionEvent motionEvent, AnonymousClass7HT r6) {
        Integer num;
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            r6.A0L.set(pointF);
            num = AnonymousClass05K.A0N;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 6) {
                    num = AnonymousClass05K.A00;
                } else {
                    return;
                }
            } else if (r6.A0D == AnonymousClass05K.A0N && motionEvent.getPointerCount() == 1) {
                float f = pointF.x;
                PointF pointF2 = r6.A0L;
                float f2 = f - pointF2.x;
                float f3 = pointF.y - pointF2.y;
                float f4 = r6.A03;
                r6.A01(f2 / f4, f3 / f4);
                pointF2.set(pointF.x, pointF.y);
                return;
            } else {
                return;
            }
        } else if (r6.A03 <= 1.0f) {
            r6.A04();
            return;
        } else {
            return;
        }
        r6.A0D = num;
    }
}
