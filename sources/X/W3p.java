package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;

public final class W3p {
    public static final Interpolator A0N = new WCX();
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public boolean A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;
    public int[] A0F;
    public int[] A0G;
    public VelocityTracker A0H;
    public OverScroller A0I;
    public final int A0J;
    public final ViewGroup A0K;
    public final C16743V4a A0L;
    public final Runnable A0M = new C19903WhY(this);

    private void A03(int i, float f, float f2) {
        boolean A072 = A07(f, f2, i, 1);
        if (A07(f2, f, i, 4)) {
            A072 |= true;
        }
        if (A07(f, f2, i, 2)) {
            A072 |= true;
        }
        if (A07(f2, f, i, 8)) {
            A072 |= true;
        }
        if (A072) {
            int[] iArr = this.A0E;
            iArr[i] = iArr[i] | A072;
            C16743V4a v4a = this.A0L;
            if (v4a instanceof C14753U7k) {
                C14753U7k u7k = (C14753U7k) v4a;
                if (C14753U7k.A00(u7k)) {
                    SlidingPaneLayout slidingPaneLayout = u7k.A00;
                    slidingPaneLayout.A0K.A0H(slidingPaneLayout.A06, i);
                }
            }
        }
    }

    private boolean A09(View view, float f, float f2) {
        int i;
        float f3;
        int i2;
        if (view == null) {
            return false;
        }
        C16743V4a v4a = this.A0L;
        boolean A1R = AnonymousClass7TF.A1R(v4a.A01(view));
        if (v4a instanceof C14751U7i) {
            BottomSheetBehavior bottomSheetBehavior = ((C14751U7i) v4a).A00;
            if (bottomSheetBehavior.A0Q) {
                i = bottomSheetBehavior.A0C;
            } else {
                i = bottomSheetBehavior.A04;
            }
        } else {
            i = 0;
        }
        boolean A1R2 = AnonymousClass7TF.A1R(i);
        if (A1R) {
            if (A1R2) {
                f3 = (f * f) + (f2 * f2);
                int i3 = this.A06;
                i2 = i3 * i3;
            } else {
                f3 = Math.abs(f);
                i2 = this.A06;
            }
        } else if (!A1R2) {
            return false;
        } else {
            f3 = Math.abs(f2);
            i2 = this.A06;
        }
        return f3 > ((float) i2);
    }

    public static final boolean A0A(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void A0E() {
        this.A02 = -1;
        float[] fArr = this.A0A;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0B, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0G, 0);
            Arrays.fill(this.A0E, 0);
            Arrays.fill(this.A0F, 0);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A0H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0H = null;
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0K.getWidth();
        float abs = (float) Math.abs(i);
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = AnonymousClass7TE.A05(Math.abs(sin / ((float) abs2)), 1000.0f) * 4;
        } else {
            i4 = (int) (((abs / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private void A01() {
        VelocityTracker velocityTracker = this.A0H;
        float f = this.A00;
        velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES, f);
        float xVelocity = this.A0H.getXVelocity(this.A02);
        float f2 = this.A01;
        float f3 = f;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            f3 = 0.0f;
        } else if (abs <= f) {
            f3 = xVelocity;
        } else if (xVelocity <= 0.0f) {
            f3 = -f;
        }
        float yVelocity = this.A0H.getYVelocity(this.A02);
        float f4 = this.A01;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.A09 = true;
        this.A0L.A03(this.A08, f3, f);
        this.A09 = false;
        if (this.A03 == 1) {
            A0F(0);
        }
    }

    private void A02(int i) {
        float[] fArr = this.A0A;
        if (fArr != null) {
            int i2 = this.A05;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0D[i] = 0.0f;
                this.A0G[i] = 0;
                this.A0E[i] = 0;
                this.A0F[i] = 0;
                this.A05 = (i3 ^ -1) & i2;
            }
        }
    }

    private void A04(int i, float f, float f2) {
        float[] fArr = this.A0A;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0B;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0C;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0D;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0G;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0E;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0F;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0A = fArr2;
            fArr = fArr2;
            this.A0B = fArr3;
            this.A0C = fArr4;
            this.A0D = fArr5;
            this.A0G = iArr;
            this.A0E = iArr2;
            this.A0F = iArr3;
        }
        this.A0C[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0B;
        this.A0D[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0G;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0K;
        int A1T = AnonymousClass7TF.A1T(i3, viewGroup.getLeft() + this.A04);
        if (i4 < viewGroup.getTop() + this.A04) {
            A1T |= 4;
        }
        if (i3 > viewGroup.getRight() - this.A04) {
            A1T |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.A04) {
            A1T |= 8;
        }
        iArr7[i] = A1T;
        this.A05 |= 1 << i;
    }

    public static void A06(W3p w3p, int i) {
        if ((w3p.A0G[i] & w3p.A07) != 0) {
            C16743V4a v4a = w3p.A0L;
            if (v4a instanceof C14753U7k) {
                C14753U7k u7k = (C14753U7k) v4a;
                if (C14753U7k.A00(u7k)) {
                    SlidingPaneLayout slidingPaneLayout = u7k.A00;
                    slidingPaneLayout.A0K.A0H(slidingPaneLayout.A06, i);
                }
            }
        }
    }

    private boolean A08(int i) {
        if (((1 << i) & this.A05) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", 002.A0c("Ignoring pointerId=", " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.", i));
        return false;
    }

    public static boolean A0B(W3p w3p, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i4;
        int i7 = i3;
        int left = w3p.A08.getLeft();
        int top = w3p.A08.getTop();
        int i8 = i - left;
        int i9 = i2 - top;
        if (i8 == 0 && i9 == 0) {
            w3p.A0I.abortAnimation();
            w3p.A0F(0);
            return false;
        }
        View view = w3p.A08;
        int i10 = (int) w3p.A01;
        int i11 = (int) w3p.A00;
        int i12 = i11;
        int abs = Math.abs(i7);
        if (abs < i10) {
            i7 = 0;
        } else if (abs > i11) {
            if (i3 <= 0) {
                i12 = -i11;
            }
            i7 = i12;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i10) {
            i6 = 0;
        } else if (abs2 > i11) {
            if (i4 <= 0) {
                i11 = -i11;
            }
            i6 = i11;
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i7);
        int abs6 = Math.abs(i6);
        int i13 = abs5 + abs6;
        float f = (float) abs3;
        float f2 = (float) (abs3 + abs4);
        float f3 = f2;
        if (i7 != 0) {
            f = (float) abs5;
            f2 = (float) i13;
        }
        float f4 = f / f2;
        float f5 = (float) abs4;
        if (i6 != 0) {
            f5 = (float) abs6;
            f3 = (float) i13;
        }
        float f6 = f5 / f3;
        C16743V4a v4a = w3p.A0L;
        int A002 = w3p.A00(i8, i7, v4a.A01(view));
        if (v4a instanceof C14751U7i) {
            BottomSheetBehavior bottomSheetBehavior = ((C14751U7i) v4a).A00;
            if (bottomSheetBehavior.A0Q) {
                i5 = bottomSheetBehavior.A0C;
            } else {
                i5 = bottomSheetBehavior.A04;
            }
        } else {
            i5 = 0;
        }
        w3p.A0I.startScroll(left, top, i8, i9, (int) ((((float) A002) * f4) + (((float) w3p.A00(i9, i6, i5)) * f6)));
        w3p.A0F(2);
        return true;
    }

    public final View A0C(int i, int i2) {
        ViewGroup viewGroup = this.A0K;
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

    public final void A0F(int i) {
        boolean z;
        this.A0K.removeCallbacks(this.A0M);
        if (this.A03 != i) {
            this.A03 = i;
            C16743V4a v4a = this.A0L;
            if (v4a instanceof C14751U7i) {
                C14751U7i u7i = (C14751U7i) v4a;
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = u7i.A00;
                    if (bottomSheetBehavior.A0N) {
                        bottomSheetBehavior.A0X(1);
                    }
                }
            } else if (v4a instanceof C14752U7j) {
                X32 x32 = ((C14752U7j) v4a).A02.A04;
                if (x32 != null) {
                    C18800W2n A002 = C18800W2n.A00();
                    X1C x1c = ((WMS) x32).A00.A04;
                    if (i != 0) {
                        A002.A05(x1c);
                    } else {
                        A002.A06(x1c);
                    }
                }
            } else {
                SlidingPaneLayout slidingPaneLayout = ((C14753U7k) v4a).A00;
                if (slidingPaneLayout.A0K.A03 == 0) {
                    int i2 = (slidingPaneLayout.A00 > 1.0f ? 1 : (slidingPaneLayout.A00 == 1.0f ? 0 : -1));
                    View view = slidingPaneLayout.A06;
                    if (i2 == 0) {
                        slidingPaneLayout.A02(view);
                        Iterator it = slidingPaneLayout.A0M.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw new NullPointerException("onPanelClosed");
                        } else {
                            slidingPaneLayout.sendAccessibilityEvent(32);
                            z = false;
                        }
                    } else {
                        Iterator it2 = slidingPaneLayout.A0M.iterator();
                        if (it2.hasNext()) {
                            it2.next();
                            throw new NullPointerException("onPanelOpened");
                        } else {
                            slidingPaneLayout.sendAccessibilityEvent(32);
                            z = true;
                        }
                    }
                    slidingPaneLayout.A0B = z;
                }
            }
            if (this.A03 == 0) {
                this.A08 = null;
            }
        }
    }

    public final boolean A0I() {
        if (this.A03 == 2) {
            OverScroller overScroller = this.A0I;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A08.getLeft();
            int top = currY - this.A08.getTop();
            if (left != 0) {
                this.A08.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.A08.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.A0L.A04(this.A08, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            this.A0K.post(this.A0M);
        }
        if (this.A03 == 2) {
            return true;
        }
        return false;
    }

    public final boolean A0J(int i, int i2) {
        if (this.A09) {
            return A0B(this, i, i2, (int) this.A0H.getXVelocity(this.A02), (int) this.A0H.getYVelocity(this.A02));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        if (r16 != r7) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0K(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r8 = r20
            int r1 = r8.getActionMasked()
            int r2 = r8.getActionIndex()
            r4 = r19
            if (r1 != 0) goto L_0x0011
            r4.A0E()
        L_0x0011:
            android.view.VelocityTracker r0 = r4.A0H
            if (r0 != 0) goto L_0x001b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A0H = r0
        L_0x001b:
            r0.addMovement(r8)
            r6 = 2
            r3 = 1
            if (r1 == 0) goto L_0x011a
            if (r1 == r3) goto L_0x0115
            if (r1 == r6) goto L_0x0064
            r0 = 3
            if (r1 == r0) goto L_0x0115
            r0 = 5
            if (r1 == r0) goto L_0x003d
            r0 = 6
            if (r1 != r0) goto L_0x0036
            int r0 = r8.getPointerId(r2)
            r4.A02(r0)
        L_0x0036:
            r5 = 0
        L_0x0037:
            int r0 = r4.A03
            if (r0 != r3) goto L_0x003c
            r5 = 1
        L_0x003c:
            return r5
        L_0x003d:
            int r5 = r8.getPointerId(r2)
            float r1 = r8.getX(r2)
            float r2 = r8.getY(r2)
            r4.A04(r5, r1, r2)
            int r0 = r4.A03
            if (r0 != 0) goto L_0x0054
            A06(r4, r5)
            goto L_0x0036
        L_0x0054:
            if (r0 != r6) goto L_0x0036
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r1 = r4.A0C(r1, r0)
            android.view.View r0 = r4.A08
            if (r1 != r0) goto L_0x0036
            r4.A0L(r1, r5)
            goto L_0x0036
        L_0x0064:
            float[] r0 = r4.A0A
            if (r0 == 0) goto L_0x0036
            float[] r0 = r4.A0B
            if (r0 == 0) goto L_0x0036
            int r18 = r8.getPointerCount()
            r10 = 0
        L_0x0071:
            r0 = r18
            if (r10 >= r0) goto L_0x00ed
            int r12 = r8.getPointerId(r10)
            boolean r0 = r4.A08(r12)
            if (r0 == 0) goto L_0x0111
            float r1 = r8.getX(r10)
            float r2 = r8.getY(r10)
            float[] r0 = r4.A0A
            r0 = r0[r12]
            float r13 = r1 - r0
            float[] r0 = r4.A0B
            r0 = r0[r12]
            float r11 = r2 - r0
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r9 = r4.A0C(r1, r0)
            if (r9 == 0) goto L_0x00ff
            boolean r0 = r4.A09(r9, r13, r11)
            if (r0 == 0) goto L_0x00ff
            r17 = 1
            int r7 = r9.getLeft()
            int r0 = (int) r13
            int r0 = r0 + r7
            X.V4a r14 = r4.A0L
            int r16 = r14.A02(r9, r0)
            int r6 = r9.getTop()
            int r0 = (int) r11
            int r2 = r6 + r0
            boolean r1 = r14 instanceof X.C14751U7i
            if (r1 == 0) goto L_0x00fa
            r0 = r14
            X.U7i r0 = (X.C14751U7i) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r15 = r0.A00
            int r5 = r15.A0R()
            boolean r0 = r15.A0Q
            if (r0 == 0) goto L_0x00f7
            int r0 = r15.A0C
        L_0x00c9:
            if (r2 < r5) goto L_0x00cf
            r5 = r2
            if (r2 <= r0) goto L_0x00cf
            r5 = r0
        L_0x00cf:
            int r2 = r14.A01(r9)
            if (r1 == 0) goto L_0x00f5
            X.U7i r14 = (X.C14751U7i) r14
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r14.A00
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x00f2
            int r1 = r1.A0C
        L_0x00df:
            if (r2 == 0) goto L_0x00e7
            if (r2 <= 0) goto L_0x0101
            r0 = r16
            if (r0 != r7) goto L_0x0101
        L_0x00e7:
            if (r1 == 0) goto L_0x00ed
            if (r1 <= 0) goto L_0x0101
            if (r5 != r6) goto L_0x0101
        L_0x00ed:
            r4.A05(r8)
            goto L_0x0036
        L_0x00f2:
            int r1 = r1.A04
            goto L_0x00df
        L_0x00f5:
            r1 = 0
            goto L_0x00df
        L_0x00f7:
            int r0 = r15.A04
            goto L_0x00c9
        L_0x00fa:
            int r5 = r9.getTop()
            goto L_0x00cf
        L_0x00ff:
            r17 = 0
        L_0x0101:
            r4.A03(r12, r13, r11)
            int r0 = r4.A03
            if (r0 == r3) goto L_0x00ed
            if (r17 == 0) goto L_0x0111
            boolean r0 = r4.A0L(r9, r12)
            if (r0 == 0) goto L_0x0111
            goto L_0x00ed
        L_0x0111:
            int r10 = r10 + 1
            goto L_0x0071
        L_0x0115:
            r4.A0E()
            goto L_0x0036
        L_0x011a:
            float r1 = r8.getX()
            float r0 = r8.getY()
            r5 = 0
            int r2 = r8.getPointerId(r5)
            r4.A04(r2, r1, r0)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r4.A0C(r1, r0)
            android.view.View r0 = r4.A08
            if (r1 != r0) goto L_0x013b
            int r0 = r4.A03
            if (r0 != r6) goto L_0x013b
            r4.A0L(r1, r2)
        L_0x013b:
            A06(r4, r2)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3p.A0K(android.view.MotionEvent):boolean");
    }

    public final boolean A0L(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        View view2;
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        C16743V4a v4a = this.A0L;
        if (v4a instanceof C14751U7i) {
            BottomSheetBehavior bottomSheetBehavior = ((C14751U7i) v4a).A00;
            int i2 = bottomSheetBehavior.A0G;
            if (i2 == 1 || bottomSheetBehavior.A0W) {
                return false;
            }
            if ((i2 == 3 && bottomSheetBehavior.A03 == i && (weakReference2 = bottomSheetBehavior.A0L) != null && (view2 = (View) weakReference2.get()) != null && JTP.A1Y(view2)) || (weakReference = bottomSheetBehavior.A0M) == null || weakReference.get() != view) {
                return false;
            }
        } else if (v4a instanceof C14752U7j) {
            C14752U7j u7j = (C14752U7j) v4a;
            int i3 = u7j.A00;
            if (i3 != -1 && i3 != i) {
                return false;
            }
            if ((u7j.A02 instanceof BaseTransientBottomBar$Behavior) && !(view instanceof U4W)) {
                return false;
            }
        } else if (!C14753U7k.A00((C14753U7k) v4a) || !((C14715U3i) view.getLayoutParams()).A02) {
            return false;
        }
        this.A02 = i;
        A0H(view, i);
        return true;
    }

    public W3p(Context context, ViewGroup viewGroup, C16743V4a v4a) {
        if (v4a != null) {
            this.A0K = viewGroup;
            this.A0L = v4a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int A032 = (int) ((C13989Tnp.A03(context) * 20.0f) + 0.5f);
            this.A0J = A032;
            this.A04 = A032;
            this.A06 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A0I = new OverScroller(context, A0N);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private void A05(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A08(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0C[pointerId] = x;
                this.A0D[pointerId] = y;
            }
        }
    }

    private boolean A07(float f, float f2, int i, int i2) {
        int i3;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.A0G[i] & i2) != i2 || (this.A07 & i2) == 0 || (this.A0F[i] & i2) == i2 || (i3 = this.A0E[i] & i2) == i2)) {
            float f3 = (float) this.A06;
            if ((abs > f3 || abs2 > f3) && i3 == 0 && abs > f3) {
                return true;
            }
        }
        return false;
    }

    public final void A0D() {
        A0E();
        if (this.A03 == 2) {
            OverScroller overScroller = this.A0I;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.A0L.A04(this.A08, overScroller.getCurrX(), overScroller.getCurrY());
        }
        A0F(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r9.A02 == -1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r2 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r2 != 0) goto L_0x000d
            r9.A0E()
        L_0x000d:
            android.view.VelocityTracker r0 = r9.A0H
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0H = r0
        L_0x0017:
            r0.addMovement(r10)
            r5 = 0
            if (r2 == 0) goto L_0x018e
            r3 = 1
            if (r2 == r3) goto L_0x016b
            r0 = 2
            if (r2 == r0) goto L_0x009b
            r0 = 3
            if (r2 == r0) goto L_0x0173
            r0 = 5
            if (r2 == r0) goto L_0x006d
            r0 = 6
            if (r2 != r0) goto L_0x0069
            int r4 = r10.getPointerId(r1)
            int r0 = r9.A03
            if (r0 != r3) goto L_0x0066
            int r0 = r9.A02
            if (r4 != r0) goto L_0x0066
            int r6 = r10.getPointerCount()
        L_0x003c:
            r3 = -1
            if (r5 >= r6) goto L_0x0063
            int r2 = r10.getPointerId(r5)
            int r0 = r9.A02
            if (r2 == r0) goto L_0x006a
            float r1 = r10.getX(r5)
            float r0 = r10.getY(r5)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r9.A0C(r1, r0)
            android.view.View r0 = r9.A08
            if (r1 != r0) goto L_0x006a
            boolean r0 = r9.A0L(r0, r2)
            if (r0 == 0) goto L_0x006a
            int r0 = r9.A02
            if (r0 != r3) goto L_0x0066
        L_0x0063:
            r9.A01()
        L_0x0066:
            r9.A02(r4)
        L_0x0069:
            return
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x006d:
            int r3 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r1 = r10.getY(r1)
            r9.A04(r3, r2, r1)
            int r0 = r9.A03
            int r2 = (int) r2
            int r1 = (int) r1
            if (r0 != 0) goto L_0x008d
            android.view.View r0 = r9.A0C(r2, r1)
            r9.A0L(r0, r3)
            A06(r9, r3)
            return
        L_0x008d:
            android.view.View r0 = r9.A08
            boolean r0 = A0A(r0, r2, r1)
            if (r0 == 0) goto L_0x0069
            android.view.View r0 = r9.A08
            r9.A0L(r0, r3)
            return
        L_0x009b:
            int r0 = r9.A03
            if (r0 != r3) goto L_0x012a
            int r0 = r9.A02
            boolean r0 = r9.A08(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r9.A02
            int r0 = r10.findPointerIndex(r0)
            float r3 = r10.getX(r0)
            float r2 = r10.getY(r0)
            float[] r0 = r9.A0C
            int r1 = r9.A02
            r0 = r0[r1]
            float r3 = r3 - r0
            int r6 = (int) r3
            float[] r0 = r9.A0D
            r0 = r0[r1]
            float r2 = r2 - r0
            int r5 = (int) r2
            android.view.View r0 = r9.A08
            int r4 = r0.getLeft()
            int r4 = r4 + r6
            android.view.View r0 = r9.A08
            int r3 = r0.getTop()
            int r3 = r3 + r5
            android.view.View r0 = r9.A08
            int r2 = r0.getLeft()
            android.view.View r0 = r9.A08
            int r7 = r0.getTop()
            if (r6 == 0) goto L_0x00ee
            X.V4a r1 = r9.A0L
            android.view.View r0 = r9.A08
            int r4 = r1.A02(r0, r4)
            android.view.View r1 = r9.A08
            int r0 = r4 - r2
            r1.offsetLeftAndRight(r0)
        L_0x00ee:
            if (r5 == 0) goto L_0x0113
            X.V4a r2 = r9.A0L
            android.view.View r1 = r9.A08
            boolean r0 = r2 instanceof X.C14751U7i
            if (r0 == 0) goto L_0x0125
            X.U7i r2 = (X.C14751U7i) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r2.A00
            int r1 = r2.A0R()
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x0122
            int r0 = r2.A0C
        L_0x0106:
            if (r3 < r1) goto L_0x010c
            r1 = r3
            if (r3 <= r0) goto L_0x010c
            r1 = r0
        L_0x010c:
            r3 = r1
            android.view.View r0 = r9.A08
            int r1 = r1 - r7
            r0.offsetTopAndBottom(r1)
        L_0x0113:
            if (r6 != 0) goto L_0x0117
            if (r5 == 0) goto L_0x011e
        L_0x0117:
            X.V4a r1 = r9.A0L
            android.view.View r0 = r9.A08
            r1.A04(r0, r4, r3)
        L_0x011e:
            r9.A05(r10)
            return
        L_0x0122:
            int r0 = r2.A04
            goto L_0x0106
        L_0x0125:
            int r1 = r1.getTop()
            goto L_0x010c
        L_0x012a:
            int r6 = r10.getPointerCount()
        L_0x012e:
            if (r5 >= r6) goto L_0x011e
            int r7 = r10.getPointerId(r5)
            boolean r0 = r9.A08(r7)
            if (r0 == 0) goto L_0x0168
            float r1 = r10.getX(r5)
            float r8 = r10.getY(r5)
            float[] r0 = r9.A0A
            r0 = r0[r7]
            float r4 = r1 - r0
            float[] r0 = r9.A0B
            r0 = r0[r7]
            float r2 = r8 - r0
            r9.A03(r7, r4, r2)
            int r0 = r9.A03
            if (r0 == r3) goto L_0x011e
            int r1 = (int) r1
            int r0 = (int) r8
            android.view.View r1 = r9.A0C(r1, r0)
            boolean r0 = r9.A09(r1, r4, r2)
            if (r0 == 0) goto L_0x0168
            boolean r0 = r9.A0L(r1, r7)
            if (r0 == 0) goto L_0x0168
            goto L_0x011e
        L_0x0168:
            int r5 = r5 + 1
            goto L_0x012e
        L_0x016b:
            int r0 = r9.A03
            if (r0 != r3) goto L_0x018a
            r9.A01()
            goto L_0x018a
        L_0x0173:
            int r0 = r9.A03
            if (r0 != r3) goto L_0x018a
            r2 = 0
            r9.A09 = r3
            X.V4a r1 = r9.A0L
            android.view.View r0 = r9.A08
            r1.A03(r0, r2, r2)
            r9.A09 = r5
            int r0 = r9.A03
            if (r0 != r3) goto L_0x018a
            r9.A0F(r5)
        L_0x018a:
            r9.A0E()
            return
        L_0x018e:
            float r4 = r10.getX()
            float r3 = r10.getY()
            int r2 = r10.getPointerId(r5)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r9.A0C(r1, r0)
            r9.A04(r2, r4, r3)
            r9.A0L(r0, r2)
            A06(r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3p.A0G(android.view.MotionEvent):void");
    }

    public final void A0H(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0K;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            C16743V4a v4a = this.A0L;
            if (v4a instanceof C14752U7j) {
                C14752U7j u7j = (C14752U7j) v4a;
                u7j.A00 = i;
                u7j.A01 = view.getLeft();
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            } else if (v4a instanceof C14753U7k) {
                SlidingPaneLayout slidingPaneLayout = ((C14753U7k) v4a).A00;
                int childCount = slidingPaneLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = slidingPaneLayout.getChildAt(i2);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
            }
            A0F(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(viewGroup);
        throw Pxg.A0d(")", sb);
    }
}
