package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Tz1  reason: case insensitive filesystem */
public final class C14597Tz1 extends ViewGroup {
    public int A00;
    public View A01;
    public C18286Vp9 A02;
    public VL5 A03;
    public C70652Tj A04;
    public C14640Tzm A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public C70652Tj[] A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = true;
    public final List A0H;
    public final AnonymousClass03P A0I = new Object();
    public final boolean A0J;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.03P] */
    public C14597Tz1(Context context) {
        super(context);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.A0H = copyOnWriteArrayList;
        this.A07 = true;
        this.A08 = true;
        this.A00 = -1;
        this.A0B = false;
        this.A0J = true;
        C14916UFa uFa = new C14916UFa(this);
        if (this.A05 == null) {
            this.A05 = new C14640Tzm(getContext(), this, uFa);
        }
        copyOnWriteArrayList.add(new C14598Tz2(this));
    }

    public final void A03(C70652Tj[] r5, boolean z) {
        C70652Tj r1 = null;
        this.A0C = (C70652Tj[]) Arrays.copyOf(r5, r5.length);
        C70652Tj r2 = this.A04;
        if (r2 != null) {
            if (this.A01 != null) {
                int height = getHeight();
                List emptyList = Collections.emptyList();
                View view = this.A01;
                r1 = A00(view, this, emptyList, this.A04.Bdk(view, height), height);
            }
            this.A04 = r1;
            r2 = r1;
        }
        if (z) {
            if (r2 == null) {
                List emptyList2 = Collections.emptyList();
                View view2 = this.A01;
                if (view2 != null && view2.isLaidOut()) {
                    int height2 = getHeight();
                    r2 = A00(view2, this, emptyList2, height2 - view2.getTop(), height2);
                    if (r2 == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A02(r2, this.A00, false);
        }
    }

    public static C70652Tj A00(View view, C14597Tz1 tz1, List list, int i, int i2) {
        int abs;
        C70652Tj r6 = null;
        if (!(tz1.A0C == null || view == null || !view.isLaidOut())) {
            int i3 = Integer.MAX_VALUE;
            for (C70652Tj r1 : tz1.A0C) {
                if (!list.contains(r1) && (abs = Math.abs(r1.Bdk(view, i2) - i)) < i3) {
                    r6 = r1;
                    i3 = abs;
                }
            }
        }
        return r6;
    }

    private boolean A01(int i, int i2) {
        int i3;
        View view = this.A01;
        if (getNestedScrollAxes() == 1) {
            if (i2 == 0 || ((float) (Math.abs(i) / Math.abs(i2))) > 0.7f) {
                return false;
            }
        } else if (view == null) {
            return false;
        } else {
            int height = getHeight();
            C70652Tj[] r1 = this.A0C;
            if (r1 == null || r1.length <= 0) {
                i3 = 0;
            } else {
                i3 = height - r1[0].Bdk(view, height);
                int length = this.A0C.length;
                for (int i4 = 1; i4 < length; i4++) {
                    i3 = Math.min(i3, height - this.A0C[i4].Bdk(view, height));
                }
            }
            if (view.getBottom() <= height || view.getTop() <= i3) {
                return false;
            }
        }
        return true;
    }

    public final void A02(C70652Tj r5, int i, boolean z) {
        View view = this.A01;
        if (view != null) {
            this.A04 = r5;
            C14645Tzr tzr = new C14645Tzr(view, this, i, z);
            if (isLaidOut()) {
                tzr.run();
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new WCC(1, this, viewTreeObserver, tzr));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r3.A09.isFinished() == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r6 = this;
            X.Tzm r3 = r6.A05
            int r0 = r3.A03
            r2 = 2
            if (r0 != r2) goto L_0x0057
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x005e
            android.widget.Scroller r0 = r3.A09
            boolean r5 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A09
            int r4 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r0 = r4 - r0
            if (r0 <= 0) goto L_0x005f
            int r0 = r3.A04
            int r4 = java.lang.Math.min(r4, r0)
        L_0x0027:
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r1 = r4 - r0
            if (r1 == 0) goto L_0x003d
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r1)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r1 = r3.A0H
            android.view.View r0 = r3.A08
            r1.A00(r0)
        L_0x003d:
            if (r5 == 0) goto L_0x0050
            int r0 = r3.A04
            if (r4 != r0) goto L_0x0057
            android.widget.Scroller r0 = r3.A09
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A09
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L_0x0057:
            int r0 = r3.A03
            if (r0 != r2) goto L_0x005e
            r6.postInvalidateOnAnimation()
        L_0x005e:
            return
        L_0x005f:
            if (r0 >= 0) goto L_0x0027
            int r0 = r3.A04
            int r4 = java.lang.Math.max(r4, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14597Tz1.computeScroll():void");
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0I;
        return r0.A01 | r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1 == r2.A08) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ee, code lost:
        if (r2.A03 == 2) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f0, code lost:
        r2.A0B(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0A
            r3 = 1
            if (r0 == 0) goto L_0x0045
            boolean r0 = r9.A0F
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00f5
            X.Tzm r2 = r9.A05
            int r1 = r10.getActionMasked()
            int r7 = r10.getActionIndex()
            if (r1 != 0) goto L_0x001c
            r2.A08()
        L_0x001c:
            android.view.VelocityTracker r0 = r2.A07
            if (r0 != 0) goto L_0x0026
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.A07 = r0
        L_0x0026:
            r0.addMovement(r10)
            r6 = 2
            r5 = 0
            if (r1 == 0) goto L_0x00d3
            if (r1 == r3) goto L_0x00ce
            if (r1 == r6) goto L_0x0065
            r0 = 3
            if (r1 == r0) goto L_0x00ce
            r0 = 5
            if (r1 == r0) goto L_0x0046
            r0 = 6
            if (r1 != r0) goto L_0x0041
            int r0 = r10.getPointerId(r7)
            X.C14640Tzm.A04(r2, r0)
        L_0x0041:
            int r0 = r2.A03
            if (r0 != r3) goto L_0x00f5
        L_0x0045:
            return r3
        L_0x0046:
            int r4 = r10.getPointerId(r7)
            float r1 = r10.getX(r7)
            float r5 = r10.getY(r7)
            X.C14640Tzm.A03(r2, r1, r5, r4)
            int r0 = r2.A03
            if (r0 != r6) goto L_0x0041
            int r1 = (int) r1
            int r0 = (int) r5
            android.view.View r1 = r2.A07(r1, r0)
            android.view.View r0 = r2.A08
            if (r1 != r0) goto L_0x0041
            goto L_0x00f0
        L_0x0065:
            float[] r0 = r2.A0B
            if (r0 == 0) goto L_0x006d
            float[] r0 = r2.A0C
            if (r0 != 0) goto L_0x007c
        L_0x006d:
            float r4 = r10.getX()
            float r1 = r10.getY()
            int r0 = r10.getPointerId(r5)
            X.C14640Tzm.A03(r2, r4, r1, r0)
        L_0x007c:
            int r6 = r10.getPointerCount()
        L_0x0080:
            if (r5 >= r6) goto L_0x00c6
            int r7 = r10.getPointerId(r5)
            int r1 = r2.A05
            int r0 = r3 << r7
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00cb
            r10.getX(r5)
            float r8 = r10.getY(r5)
            float[] r0 = r2.A0B
            r1 = r0[r7]
            float[] r0 = r2.A0C
            r4 = r0[r7]
            float r8 = r8 - r4
            int r0 = r2.A03
            if (r0 == r3) goto L_0x00c6
            int r1 = (int) r1
            int r0 = (int) r4
            android.view.View r4 = r2.A07(r1, r0)
            if (r4 == 0) goto L_0x00cb
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r0 = r2.A0H
            X.UFa r0 = (X.C14916UFa) r0
            X.Tz1 r0 = r0.A00
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x00cb
            float r1 = java.lang.Math.abs(r8)
            int r0 = r2.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            boolean r0 = r2.A0B(r4, r7)
            if (r0 == 0) goto L_0x00cb
        L_0x00c6:
            X.C14640Tzm.A01(r10, r2)
            goto L_0x0041
        L_0x00cb:
            int r5 = r5 + 1
            goto L_0x0080
        L_0x00ce:
            r2.A08()
            goto L_0x0041
        L_0x00d3:
            float r1 = r10.getX()
            float r0 = r10.getY()
            int r4 = r10.getPointerId(r5)
            X.C14640Tzm.A03(r2, r1, r0, r4)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r2.A07(r1, r0)
            android.view.View r0 = r2.A08
            if (r1 != r0) goto L_0x0041
            int r0 = r2.A03
            if (r0 != r6) goto L_0x0041
        L_0x00f0:
            r2.A0B(r1, r4)
            goto L_0x0041
        L_0x00f5:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14597Tz1.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        C70652Tj r2;
        View view = this.A01;
        if (view != null) {
            if (!this.A0G) {
                height = view.getTop();
            } else {
                height = getHeight();
            }
            int measuredHeight = view.getMeasuredHeight() + height;
            if (this.A0J) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, height, getWidth(), measuredHeight);
            boolean A1O = JTQ.A1O(view.getMeasuredHeight(), this.A0D);
            this.A0D = view.getMeasuredHeight();
            if ((z || A1O) && (r2 = this.A04) != null) {
                A02(r2, this.A00, this.A0B);
            }
            List<C20941X5k> list = this.A0H;
            if (!list.isEmpty()) {
                for (C20941X5k DYF : list) {
                    DYF.DYF(view, getHeight());
                }
            }
            this.A0G = false;
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A07 || z) {
            return false;
        }
        C14640Tzm tzm = this.A05;
        View view2 = this.A01;
        tzm.A08 = view2;
        tzm.A0A = true;
        tzm.A0H.A01(view2, -f2);
        tzm.A0A = false;
        if (tzm.A03 != 1) {
            return true;
        }
        tzm.A0A(0);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A07 || !A01((int) f, (int) f2)) {
            return false;
        }
        C14640Tzm tzm = this.A05;
        View view2 = this.A01;
        tzm.A08 = view2;
        tzm.A0A = true;
        tzm.A0H.A01(view2, -f2);
        tzm.A0A = false;
        if (tzm.A03 != 1) {
            return true;
        }
        tzm.A0A(0);
        return true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A07 && A01(i, i2)) {
            C14640Tzm tzm = this.A05;
            int i3 = -i;
            int i4 = -i2;
            View view2 = tzm.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = tzm.A08.getTop() + i4;
                C14640Tzm.A05(tzm, i3, i4);
                View view3 = tzm.A08;
                if (!(view3 == null || iArr == null)) {
                    iArr[0] = (left - view3.getLeft()) - i3;
                    iArr[1] = (top - tzm.A08.getTop()) - i4;
                }
            }
            if (getNestedScrollAxes() == 1 && iArr[1] != 0) {
                iArr[0] = i;
            }
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A07) {
            C14640Tzm tzm = this.A05;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = tzm.A08;
            if (view2 != null) {
                view2.getLeft();
                tzm.A08.getTop();
                C14640Tzm.A05(tzm, i5, i6);
            }
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0I.A01 = i;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0F) {
            z = true;
            this.A0F = true;
            C14640Tzm tzm = this.A05;
            View view3 = this.A01;
            if (tzm.A07 == null) {
                tzm.A07 = VelocityTracker.obtain();
            }
            tzm.A0A(1);
            tzm.A08 = view3;
        }
        return z;
    }

    public final void onStopNestedScroll(View view) {
        this.A0I.A01 = 0;
        this.A0F = false;
        C14640Tzm tzm = this.A05;
        tzm.A08 = this.A01;
        if (tzm.A03 != 2) {
            C14640Tzm.A02(tzm, 0.0f);
        }
    }

    public void setApplyBottomPaddingFix(boolean z) {
    }

    public void setInteractable(boolean z) {
        this.A0A = z;
        if (!z) {
            this.A05.A08();
        }
    }

    public void setSlideToAnchorImmediately(boolean z) {
        this.A0B = z;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            if (this.A0D > 0) {
                view.setTop(getHeight() - this.A0D);
            }
            this.A0D = 0;
            super.addView(view, i, layoutParams);
            this.A01 = view;
            return;
        }
        throw new IllegalStateException("BloksSlidingViewGroup only supports a single child");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A09) {
            View view = this.A01;
            if (this.A0C == null || view == null) {
                i3 = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (C70652Tj Bdk : this.A0C) {
                    i3 = Math.max(i3, Bdk.Bdk(view, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, AnonymousClass972.MUTABLE_FLAG_MASK));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r4.A02 == -1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r0 = r4.A07;
        r3 = r4.A00;
        r0.computeCurrentVelocity(com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES, r3);
        r4.A07.getXVelocity(r4.A02);
        X.C14640Tzm.A02(r4, X.C14640Tzm.A00(r4.A07.getYVelocity(r4.A02), r4.A01, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        if (r2 > ((float) r5.getBottom())) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        if (r1 != 3) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = -1380357617(0xffffffffadb96a0f, float:-2.1079164E-11)
            int r7 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r12.A0A
            r6 = 1
            if (r0 != 0) goto L_0x0013
            r0 = 358908826(0x1564839a, float:4.614805E-26)
        L_0x000f:
            X.AnonymousClass0fD.A0C(r0, r7)
            return r6
        L_0x0013:
            android.view.View r5 = r12.A01
            if (r5 != 0) goto L_0x001d
            boolean r6 = r12.A08
            r0 = 1332614047(0x4f6e139f, float:3.9942633E9)
            goto L_0x000f
        L_0x001d:
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x00a9
            X.Tzm r4 = r12.A05
            int r2 = r13.getActionMasked()
            int r9 = r13.getActionIndex()
            if (r2 != 0) goto L_0x0030
            r4.A08()
        L_0x0030:
            android.view.VelocityTracker r0 = r4.A07
            if (r0 != 0) goto L_0x003a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A07 = r0
        L_0x003a:
            r0.addMovement(r13)
            r8 = 0
            if (r2 == 0) goto L_0x021a
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r6) goto L_0x01f2
            r0 = 2
            r3 = -1
            if (r2 == r0) goto L_0x015e
            r0 = 3
            if (r2 == r0) goto L_0x0157
            r0 = 5
            if (r2 == r0) goto L_0x011c
            r0 = 6
            if (r2 != r0) goto L_0x00a9
            int r9 = r13.getPointerId(r9)
            int r0 = r4.A03
            if (r0 != r6) goto L_0x00a6
            int r0 = r4.A02
            if (r9 != r0) goto L_0x00a6
            int r10 = r13.getPointerCount()
        L_0x0061:
            if (r8 >= r10) goto L_0x0087
            int r11 = r13.getPointerId(r8)
            int r0 = r4.A02
            if (r11 == r0) goto L_0x0118
            float r2 = r13.getX(r8)
            float r0 = r13.getY(r8)
            int r2 = (int) r2
            int r0 = (int) r0
            android.view.View r2 = r4.A07(r2, r0)
            android.view.View r0 = r4.A08
            if (r2 != r0) goto L_0x0118
            boolean r0 = r4.A0B(r0, r11)
            if (r0 == 0) goto L_0x0118
            int r0 = r4.A02
            if (r0 != r3) goto L_0x00a6
        L_0x0087:
            android.view.VelocityTracker r0 = r4.A07
            float r3 = r4.A00
            r0.computeCurrentVelocity(r1, r3)
            android.view.VelocityTracker r1 = r4.A07
            int r0 = r4.A02
            r1.getXVelocity(r0)
            float r2 = r4.A01
            android.view.VelocityTracker r1 = r4.A07
            int r0 = r4.A02
            float r0 = r1.getYVelocity(r0)
            float r0 = X.C14640Tzm.A00(r0, r2, r3)
            X.C14640Tzm.A02(r4, r0)
        L_0x00a6:
            X.C14640Tzm.A04(r4, r9)
        L_0x00a9:
            float r0 = r13.getX()
            int r2 = java.lang.Math.round(r0)
            float r0 = r13.getY()
            int r0 = java.lang.Math.round(r0)
            int r1 = r13.getActionMasked()
            float r3 = (float) r2
            float r2 = (float) r0
            int r0 = r5.getLeft()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00e4
            int r0 = r5.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00e4
            int r0 = r5.getTop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00e4
            int r0 = r5.getBottom()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            r2 = 0
            if (r1 == 0) goto L_0x00f9
            if (r1 == r6) goto L_0x00fc
            r0 = 3
            if (r1 == r0) goto L_0x0115
        L_0x00ed:
            if (r3 != 0) goto L_0x00f4
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x00f4
            r6 = 0
        L_0x00f4:
            r0 = 695539208(0x29751608, float:5.4420037E-14)
            goto L_0x000f
        L_0x00f9:
            r2 = r3 ^ 1
            goto L_0x0115
        L_0x00fc:
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0115
            if (r3 != 0) goto L_0x0115
            X.VL5 r0 = r12.A03
            if (r0 == 0) goto L_0x0115
            X.2Tb r1 = r0.A00
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0115
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0115
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A06(r0)
        L_0x0115:
            r12.A0E = r2
            goto L_0x00ed
        L_0x0118:
            int r8 = r8 + 1
            goto L_0x0061
        L_0x011c:
            int r8 = r13.getPointerId(r9)
            float r2 = r13.getX(r9)
            float r1 = r13.getY(r9)
            X.C14640Tzm.A03(r4, r2, r1, r8)
            int r0 = r4.A03
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x0137
            android.view.View r0 = r4.A07(r3, r2)
            goto L_0x022f
        L_0x0137:
            android.view.View r1 = r4.A08
            if (r1 == 0) goto L_0x00a9
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x00a9
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x00a9
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x00a9
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x00a9
            android.view.View r0 = r4.A08
            goto L_0x022f
        L_0x0157:
            int r0 = r4.A03
            if (r0 != r6) goto L_0x0215
            r0 = 0
            goto L_0x0212
        L_0x015e:
            int r0 = r4.A03
            if (r0 != r6) goto L_0x018f
            int r2 = r4.A02
            int r1 = r4.A05
            int r0 = r6 << r2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a9
            int r0 = r13.findPointerIndex(r2)
            if (r0 == r3) goto L_0x00a9
            float r1 = r13.getX(r0)
            float r3 = r13.getY(r0)
            float[] r0 = r4.A0D
            int r2 = r4.A02
            r0 = r0[r2]
            float r1 = r1 - r0
            int r1 = (int) r1
            float[] r0 = r4.A0E
            r0 = r0[r2]
            float r3 = r3 - r0
            int r0 = (int) r3
            X.C14640Tzm.A05(r4, r1, r0)
        L_0x018a:
            X.C14640Tzm.A01(r13, r4)
            goto L_0x00a9
        L_0x018f:
            float[] r0 = r4.A0B
            if (r0 == 0) goto L_0x0197
            float[] r0 = r4.A0C
            if (r0 != 0) goto L_0x01a6
        L_0x0197:
            float r2 = r13.getX()
            float r1 = r13.getY()
            int r0 = r13.getPointerId(r8)
            X.C14640Tzm.A03(r4, r2, r1, r0)
        L_0x01a6:
            int r3 = r13.getPointerCount()
        L_0x01aa:
            if (r8 >= r3) goto L_0x018a
            int r9 = r13.getPointerId(r8)
            int r1 = r4.A05
            int r0 = r6 << r9
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01ef
            float r1 = r13.getX(r8)
            float r2 = r13.getY(r8)
            float[] r0 = r4.A0C
            r0 = r0[r9]
            float r10 = r2 - r0
            int r0 = r4.A03
            if (r0 == r6) goto L_0x018a
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r2 = r4.A07(r1, r0)
            if (r2 == 0) goto L_0x01ef
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r0 = r4.A0H
            X.UFa r0 = (X.C14916UFa) r0
            X.Tz1 r0 = r0.A00
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x01ef
            float r1 = java.lang.Math.abs(r10)
            int r0 = r4.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ef
            boolean r0 = r4.A0B(r2, r9)
            if (r0 == 0) goto L_0x01ef
            goto L_0x018a
        L_0x01ef:
            int r8 = r8 + 1
            goto L_0x01aa
        L_0x01f2:
            int r0 = r4.A03
            if (r0 != r6) goto L_0x0215
            android.view.VelocityTracker r0 = r4.A07
            float r3 = r4.A00
            r0.computeCurrentVelocity(r1, r3)
            android.view.VelocityTracker r1 = r4.A07
            int r0 = r4.A02
            r1.getXVelocity(r0)
            float r2 = r4.A01
            android.view.VelocityTracker r1 = r4.A07
            int r0 = r4.A02
            float r0 = r1.getYVelocity(r0)
            float r0 = X.C14640Tzm.A00(r0, r2, r3)
        L_0x0212:
            X.C14640Tzm.A02(r4, r0)
        L_0x0215:
            r4.A08()
            goto L_0x00a9
        L_0x021a:
            float r3 = r13.getX()
            float r2 = r13.getY()
            int r8 = r13.getPointerId(r8)
            int r1 = (int) r3
            int r0 = (int) r2
            android.view.View r0 = r4.A07(r1, r0)
            X.C14640Tzm.A03(r4, r3, r2, r8)
        L_0x022f:
            r4.A0B(r0, r8)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14597Tz1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
