package androidx.core.widget;

import X.002;
import X.02Z;
import X.03N;
import X.03v;
import X.0kz;
import X.AnonymousClass02k;
import X.AnonymousClass03M;
import X.AnonymousClass03P;
import X.AnonymousClass0fD;
import X.AnonymousClass972;
import X.C14067TpF;
import X.C355538Qj;
import X.C7216Pzk;
import X.MRN;
import X.Pxf;
import X.SN3;
import X.U7O;
import X.XD6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

public class NestedScrollView extends FrameLayout implements 0kz, AnonymousClass03M {
    public static final float A0T = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final U7O A0U = new 02Z();
    public static final int[] A0V = {16843130};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public AnonymousClass02k A0A;
    public MRN A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public int A0F;
    public long A0G;
    public View A0H;
    public SavedState A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final float A0M;
    public final Rect A0N;
    public final 03N A0O;
    public final C14067TpF A0P;
    public final AnonymousClass03P A0Q;
    public final int[] A0R;
    public final int[] A0S;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(15);
        public int A00;

        public final String toString() {
            return 002.A09(this.A00, "HorizontalScrollView.SavedState{", Pxf.A0h(this), " scrollPosition=", "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean A08(View view, View view2) {
        if (view != view2) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A08((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A09(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float A002 = XD6.A00(edgeEffect) * ((float) getHeight());
        float f = this.A0M * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) A0T;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A002;
    }

    public final void A0C(int i) {
        Rect rect;
        boolean z = false;
        if (i == 130) {
            z = true;
        }
        int height = getHeight();
        if (z) {
            rect = this.A0N;
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            rect = this.A0N;
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = i2 + height;
        rect.bottom = i3;
        A05(i, i2, i3);
    }

    public final boolean A0E(int i) {
        int childCount;
        boolean z = false;
        if (i == 130) {
            z = true;
        }
        int height = getHeight();
        Rect rect = this.A0N;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.bottom = bottom;
            rect.top = bottom - height;
        }
        return A05(i, rect.top, rect.bottom);
    }

    public final boolean A0F(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5 = i2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            z = false;
        }
        if (i6 > i4) {
            i6 = i4;
        } else if (i6 < 0) {
            i6 = 0;
        } else {
            z2 = false;
            onOverScrolled(i5, i6, z, z2);
            if (!z || z2) {
                return true;
            }
            return false;
        }
        z2 = true;
        if (this.A0O.A00 == null) {
            this.A09.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (!z) {
        }
        return true;
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
        this.A0O.A07(iArr, (int[]) null, i, i2, i3);
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
        A02(i4, (int[]) null, i5);
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0O.A07(iArr, iArr2, i, i2, 0);
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A0B((int) f2);
        return true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        DTk(view, iArr, i, i2, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A02(i4, (int[]) null, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        DTn(view, view2, i, 0);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = instance.findNextFocus(this, (View) null, i);
        } else {
            findNextFocusFromRect = instance.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (!A07(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    public final void onStopNestedScroll(View view) {
        DnO(view, 0);
    }

    public final void requestLayout() {
        this.A0L = true;
        super.requestLayout();
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.A0O.A05(i, 0);
    }

    public final void stopNestedScroll() {
        this.A0O.A01(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r25 != false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(int r22, int r23, int r24, boolean r25) {
        /*
            r21 = this;
            r2 = r22
            r3 = 1
            r5 = r21
            r4 = r24
            if (r4 != r3) goto L_0x000f
            r1 = 2
            X.03N r0 = r5.A0O
            r0.A05(r1, r3)
        L_0x000f:
            r18 = 0
            int[] r12 = r5.A0R
            int[] r11 = r5.A0S
            r13 = 0
            X.03N r10 = r5.A0O
            r15 = r10
            r16 = r12
            r17 = r11
            r19 = r2
            r20 = r4
            boolean r0 = r15.A07(r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x002d
            r0 = r12[r3]
            int r2 = r22 - r0
            r18 = r11[r3]
        L_0x002d:
            int r7 = r5.getScrollY()
            int r6 = r5.getScrollRange()
            int r0 = r5.getOverScrollMode()
            if (r0 == 0) goto L_0x0043
            if (r0 != r3) goto L_0x0046
            int r0 = r5.getScrollRange()
            if (r0 <= 0) goto L_0x0046
        L_0x0043:
            r9 = 1
            if (r25 == 0) goto L_0x0047
        L_0x0046:
            r9 = 0
        L_0x0047:
            r8 = 0
            boolean r0 = r5.A0F(r2, r13, r7, r6)
            if (r0 == 0) goto L_0x0055
            if (r24 == 0) goto L_0x00db
            android.view.ViewParent r0 = r10.A00
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            r8 = 1
        L_0x0055:
            int r14 = r5.getScrollY()
            int r14 = r14 - r7
            int r16 = r2 - r14
            r12[r3] = r13
            r15 = r13
            r17 = r4
            X.03N.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r11[r3]
            int r18 = r18 + r0
            r0 = r12[r3]
            int r2 = r2 - r0
            int r7 = r7 + r2
            r1 = r23
            if (r7 >= 0) goto L_0x00be
            if (r9 == 0) goto L_0x0091
            android.widget.EdgeEffect r6 = r5.A08
            int r0 = -r2
            float r2 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = (float) r1
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.XD6.A01(r6, r2, r1)
            android.widget.EdgeEffect r1 = r5.A07
        L_0x0088:
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x0091
            r1.onRelease()
        L_0x0091:
            android.widget.EdgeEffect r1 = r5.A08
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x00ad
            android.widget.EdgeEffect r0 = r5.A07
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00ad
            if (r8 == 0) goto L_0x00b0
            if (r24 != 0) goto L_0x00b0
            android.view.VelocityTracker r0 = r5.A06
            if (r0 == 0) goto L_0x00ac
            r0.clear()
        L_0x00ac:
            return r18
        L_0x00ad:
            r5.postInvalidateOnAnimation()
        L_0x00b0:
            if (r4 != r3) goto L_0x00ac
            r10.A01(r3)
            r1.onRelease()
            android.widget.EdgeEffect r0 = r5.A07
            r0.onRelease()
            return r18
        L_0x00be:
            if (r7 <= r6) goto L_0x0091
            if (r9 == 0) goto L_0x0091
            android.widget.EdgeEffect r7 = r5.A07
            float r6 = (float) r2
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r6 = r6 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r1
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 - r1
            X.XD6.A01(r7, r6, r2)
            android.widget.EdgeEffect r1 = r5.A08
            goto L_0x0088
        L_0x00db:
            android.view.ViewParent r0 = r10.A01
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A01(int, int, int, boolean):int");
    }

    public static void A04(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0G > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int scrollY = nestedScrollView.getScrollY();
                OverScroller overScroller = nestedScrollView.A09;
                int scrollX = nestedScrollView.getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingTop()) - nestedScrollView.getPaddingBottom())))) - scrollY, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
                if (z) {
                    nestedScrollView.A0O.A05(2, 1);
                } else {
                    nestedScrollView.A0O.A01(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                nestedScrollView.postInvalidateOnAnimation();
            } else {
                OverScroller overScroller2 = nestedScrollView.A09;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    nestedScrollView.A0O.A01(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0G = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r14 >= r11) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(int r19, int r20, int r21) {
        /*
            r18 = this;
            r11 = r21
            r13 = r18
            int r10 = r13.getHeight()
            int r9 = r13.getScrollY()
            int r10 = r10 + r9
            r8 = 0
            r7 = 1
            r0 = 33
            r17 = 0
            r12 = r19
            if (r12 != r0) goto L_0x0019
            r17 = 1
        L_0x0019:
            r0 = 2
            java.util.ArrayList r6 = r13.getFocusables(r0)
            int r5 = r6.size()
            r4 = 0
            r3 = 0
            r16 = 0
        L_0x0026:
            r0 = r20
            if (r3 >= r5) goto L_0x0069
            java.lang.Object r2 = r6.get(r3)
            android.view.View r2 = (android.view.View) r2
            int r15 = r2.getTop()
            int r14 = r2.getBottom()
            if (r0 >= r14) goto L_0x0047
            if (r15 >= r11) goto L_0x0047
            if (r0 >= r15) goto L_0x0041
            r1 = 1
            if (r14 < r11) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r4 != 0) goto L_0x004a
            r4 = r2
            r16 = r1
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x004a:
            if (r17 == 0) goto L_0x0061
            int r0 = r4.getTop()
            if (r15 < r0) goto L_0x0067
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r16 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x0047
        L_0x0057:
            if (r0 == 0) goto L_0x0047
            r4 = r2
            goto L_0x0047
        L_0x005b:
            if (r1 == 0) goto L_0x0057
            r4 = r2
            r16 = 1
            goto L_0x0047
        L_0x0061:
            int r0 = r4.getBottom()
            if (r14 <= r0) goto L_0x0052
        L_0x0067:
            r0 = 1
            goto L_0x0053
        L_0x0069:
            if (r4 != 0) goto L_0x006c
            r4 = r13
        L_0x006c:
            if (r0 < r9) goto L_0x007a
            if (r11 > r10) goto L_0x007a
        L_0x0070:
            android.view.View r0 = r13.findFocus()
            if (r4 == r0) goto L_0x0079
            r4.requestFocus(r12)
        L_0x0079:
            return r8
        L_0x007a:
            int r11 = r21 - r10
            if (r17 == 0) goto L_0x0080
            int r11 = r20 - r9
        L_0x0080:
            r13.A01(r11, r8, r7, r7)
            r8 = 1
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A05(int, int, int):boolean");
    }

    private boolean A06(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (XD6.A00(edgeEffect) != 0.0f) {
            XD6.A01(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (XD6.A00(edgeEffect2) == 0.0f) {
            return z;
        }
        XD6.A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private boolean A07(View view, int i, int i2) {
        Rect rect = this.A0N;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    public final boolean A0G(KeyEvent keyEvent) {
        this.A0N.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            }
        }
        int i = 130;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode == 122) {
                                    A0C(33);
                                    return false;
                                } else if (keyCode != 123) {
                                    return false;
                                }
                            }
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    A0C(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return A0D(130);
                }
                return A0E(130);
            } else if (!keyEvent.isAltPressed()) {
                return A0D(33);
            }
            return A0E(33);
        }
    }

    public final void DTn(View view, View view2, int i, int i2) {
        AnonymousClass03P r1 = this.A0Q;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A0O.A05(2, i2);
    }

    public final void DnO(View view, int i) {
        AnonymousClass03P r2 = this.A0Q;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        this.A0O.A01(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r19 = this;
            r1 = r19
            android.widget.OverScroller r2 = r1.A09
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L_0x00a9
            r2.computeScrollOffset()
            int r5 = r2.getCurrY()
            int r0 = r1.A02
            int r11 = r5 - r0
            int r8 = r1.getHeight()
            r7 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r11 <= 0) goto L_0x00ad
            android.widget.EdgeEffect r4 = r1.A08
            float r0 = X.XD6.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            int r0 = -r11
            float r0 = (float) r0
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            int r3 = -r8
            float r3 = (float) r3
        L_0x0031:
            float r3 = r3 / r6
            float r0 = X.XD6.A01(r4, r0, r7)
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r3)
            if (r0 == r11) goto L_0x0040
            r4.finish()
        L_0x0040:
            int r11 = r11 - r0
        L_0x0041:
            r1.A02 = r5
            int[] r7 = r1.A0R
            r12 = 1
            r8 = 0
            r7[r12] = r8
            r15 = 0
            X.03N r5 = r1.A0O
            r13 = r5
            r14 = r7
            r16 = r8
            r17 = r11
            r18 = r12
            r13.A07(r14, r15, r16, r17, r18)
            r0 = r7[r12]
            int r11 = r11 - r0
            int r4 = r1.getScrollRange()
            if (r11 == 0) goto L_0x00a0
            int r3 = r1.getScrollY()
            int r0 = r1.getScrollX()
            r1.A0F(r11, r0, r3, r4)
            int r9 = r1.getScrollY()
            int r9 = r9 - r3
            int r11 = r11 - r9
            r7[r12] = r8
            int[] r6 = r1.A0S
            r10 = r8
            X.03N.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r7[r12]
            int r11 = r11 - r0
            if (r11 == 0) goto L_0x00a0
            int r0 = r1.getOverScrollMode()
            if (r0 == 0) goto L_0x0088
            if (r0 != r12) goto L_0x009a
            if (r4 <= 0) goto L_0x009a
        L_0x0088:
            if (r11 >= 0) goto L_0x00aa
            android.widget.EdgeEffect r3 = r1.A08
        L_0x008c:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x009a
            float r0 = r2.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x009a:
            r2.abortAnimation()
            r5.A01(r12)
        L_0x00a0:
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L_0x00bf
            r1.postInvalidateOnAnimation()
        L_0x00a9:
            return
        L_0x00aa:
            android.widget.EdgeEffect r3 = r1.A07
            goto L_0x008c
        L_0x00ad:
            if (r11 >= 0) goto L_0x0041
            android.widget.EdgeEffect r4 = r1.A07
            float r0 = X.XD6.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            float r0 = (float) r11
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            goto L_0x0031
        L_0x00bf:
            r5.A01(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0O.A04(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0O.A03(f, f2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0O.A06(i, i2, i3, i4, iArr);
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0Q;
        return r0.A01 | r0.A00;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.A0E;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
            this.A0E = dimension;
            return dimension;
        }
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    }

    public final boolean hasNestedScrollingParent() {
        if (this.A0O.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A0O.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r25) {
        /*
            r24 = this;
            r2 = r25
            int r1 = r2.getAction()
            r23 = 0
            r0 = 8
            if (r1 != r0) goto L_0x01d6
            r8 = r24
            boolean r0 = r8.A0C
            if (r0 != 0) goto L_0x01d6
            r3 = 2
            int r0 = r2.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 != r3) goto L_0x001d
            r1 = 1
        L_0x001d:
            r7 = 26
            r22 = 0
            r0 = 9
            if (r1 == 0) goto L_0x01c1
            float r3 = r2.getAxisValue(r0)
            float r0 = r2.getX()
            int r0 = (int) r0
            r7 = 9
        L_0x0030:
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x01d6
            float r1 = r8.getVerticalScrollFactorCompat()
            float r3 = r3 * r1
            int r5 = (int) r3
            r4 = 8194(0x2002, float:1.1482E-41)
            int r1 = r2.getSource()
            r1 = r1 & r4
            r3 = 0
            if (r1 != r4) goto L_0x0045
            r3 = 1
        L_0x0045:
            int r1 = -r5
            r6 = 1
            r8.A01(r1, r0, r6, r3)
            X.02k r5 = r8.A0A
            int r10 = r2.getSource()
            int r9 = r2.getDeviceId()
            int r0 = r5.A03
            if (r0 != r10) goto L_0x0193
            int r0 = r5.A02
            if (r0 != r9) goto L_0x0193
            int r0 = r5.A01
            if (r0 != r7) goto L_0x0193
            r21 = 0
        L_0x0062:
            int[] r4 = r5.A07
            r1 = r4[r23]
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0076
            android.view.VelocityTracker r0 = r5.A04
            if (r0 == 0) goto L_0x0075
            r0.recycle()
            r0 = 0
            r5.A04 = r0
        L_0x0075:
            return r6
        L_0x0076:
            android.view.VelocityTracker r3 = r5.A04
            if (r3 != 0) goto L_0x0080
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r5.A04 = r3
        L_0x0080:
            X.AnonymousClass03d.A01(r2, r3)
            r0 = 1000(0x3e8, float:1.401E-42)
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.computeCurrentVelocity(r0, r8)
            java.util.Map r0 = X.AnonymousClass03d.A00
            java.lang.Object r2 = r0.get(r3)
            X.03e r2 = (X.AnonymousClass03e) r2
            if (r2 == 0) goto L_0x00e1
            int r13 = r2.A02
            r1 = 2
            r20 = 0
            if (r13 < r1) goto L_0x0190
            int r10 = r2.A01
            int r9 = r10 + 20
            int r0 = r13 - r6
            int r9 = r9 - r0
            int r12 = r9 % 20
            long[] r11 = r2.A04
            r18 = r11[r10]
        L_0x00a9:
            r16 = r11[r12]
            long r14 = r18 - r16
            r9 = 100
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            int r13 = r13 - r6
            r2.A02 = r13
            int r0 = r12 + 1
            int r12 = r0 % 20
            goto L_0x00a9
        L_0x00bb:
            if (r13 < r1) goto L_0x0190
            if (r13 != r1) goto L_0x012d
            int r0 = r12 + 1
            int r10 = r0 % 20
            r0 = r11[r10]
            int r9 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0190
            float[] r9 = r2.A03
            r10 = r9[r10]
            long r0 = r0 - r16
            float r9 = (float) r0
            float r10 = r10 / r9
        L_0x00d1:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 * r0
            r2.A00 = r10
            float r8 = java.lang.Math.abs(r8)
            float r1 = -r8
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0126
            r2.A00 = r1
        L_0x00e1:
            float r8 = X.AnonymousClass03d.A00(r3, r7)
            X.02l r7 = r5.A06
            float r0 = r7.BpZ()
            float r8 = r8 * r0
            float r1 = java.lang.Math.signum(r8)
            r3 = 0
            if (r21 != 0) goto L_0x0101
            float r0 = r5.A00
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0104
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x0104
        L_0x0101:
            r7.Ey9()
        L_0x0104:
            float r1 = java.lang.Math.abs(r8)
            r0 = r4[r23]
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            r2 = r4[r6]
            int r0 = -r2
            float r1 = (float) r0
            float r0 = (float) r2
            float r0 = java.lang.Math.min(r8, r0)
            float r1 = java.lang.Math.max(r1, r0)
            boolean r0 = r7.Ews(r1)
            if (r0 == 0) goto L_0x0123
            r3 = r1
        L_0x0123:
            r5.A00 = r3
            return r6
        L_0x0126:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            r2.A00 = r8
            goto L_0x00e1
        L_0x012d:
            r10 = 0
            r9 = 0
        L_0x012f:
            int r0 = r13 - r6
            if (r10 >= r0) goto L_0x0178
            int r1 = r10 + r12
            int r0 = r1 % 20
            r17 = r11[r0]
            int r0 = r1 + 1
            int r14 = r0 % 20
            r15 = r11[r14]
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0175
            int r9 = r9 + 1
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x014d
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x014d:
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.abs(r20)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r15 = (float) r0
            float r16 = r16 * r15
            float[] r0 = r2.A03
            r15 = r0[r14]
            r0 = r11[r14]
            long r0 = r0 - r17
            float r14 = (float) r0
            float r15 = r15 / r14
            float r1 = r15 - r16
            float r0 = java.lang.Math.abs(r15)
            float r1 = r1 * r0
            float r20 = r20 + r1
            if (r9 != r6) goto L_0x0175
            r0 = 1056964608(0x3f000000, float:0.5)
            float r20 = r20 * r0
        L_0x0175:
            int r10 = r10 + 1
            goto L_0x012f
        L_0x0178:
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x0180
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0180:
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.abs(r20)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r9 = (float) r0
            float r10 = r10 * r9
            goto L_0x00d1
        L_0x0190:
            r10 = 0
            goto L_0x00d1
        L_0x0193:
            android.content.Context r8 = r5.A05
            int[] r4 = r5.A07
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r8)
            int r1 = r2.getDeviceId()
            int r0 = r2.getSource()
            int r0 = X.AnonymousClass041.A01(r8, r3, r1, r7, r0)
            r4[r23] = r0
            int r1 = r2.getDeviceId()
            int r0 = r2.getSource()
            int r0 = X.AnonymousClass041.A00(r8, r3, r1, r7, r0)
            r4[r6] = r0
            r5.A03 = r10
            r5.A02 = r9
            r5.A01 = r7
            r21 = 1
            goto L_0x0062
        L_0x01c1:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r2.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L_0x01d6
            float r3 = r2.getAxisValue(r7)
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            goto L_0x0030
        L_0x01d6:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0O.A03(f, f2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0I = savedState;
        requestLayout();
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.A0L) {
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0A2 = A0A(rect);
            if (A0A2 != 0) {
                scrollBy(0, A0A2);
            }
        } else {
            this.A0H = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0J) {
            this.A0J = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A0O.A02(z);
    }

    private void A02(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        03N.A00(this.A0O, (int[]) null, iArr2, 0, scrollY2, 0, i - scrollY2, i2);
    }

    private void A03(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A01 = (int) motionEvent.getY(i);
            this.A00 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final int A0A(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int i4 = i3;
        if (rect.bottom < childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin) {
            i4 = i3 - verticalFadingEdgeLength;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + marginLayoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = i4 - rect.bottom;
            } else {
                i = scrollY - rect.top;
            }
            return Math.max(-i, -getScrollY());
        }
    }

    public void A0B(int i) {
        if (getChildCount() > 0) {
            this.A09.fling(getScrollX(), getScrollY(), 0, i, 0, 0, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE, 0, 0);
            this.A0O.A05(2, 1);
            this.A02 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean A0D(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A07(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A01(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.A0N;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A01(A0A(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!A07(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || A0G(keyEvent)) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1846447066);
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
        AnonymousClass0fD.A0A(367097215, A032);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1177636964);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
        AnonymousClass0fD.A0D(-494415307, A062);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-435033462);
        super.onAttachedToWindow();
        this.A0K = false;
        AnonymousClass0fD.A0D(-1278200131, A062);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0C) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A00;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", 002.A0c("Invalid pointerId=", " in onInterceptTouchEvent", i2));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.A01) > this.A05 && (getNestedScrollAxes() & 2) == 0) {
                                this.A0C = true;
                                this.A01 = y;
                                VelocityTracker velocityTracker = this.A06;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A06 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A0F = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A03(motionEvent);
                    }
                }
            }
            this.A0C = false;
            this.A00 = -1;
            VelocityTracker velocityTracker2 = this.A06;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A06 = null;
            }
            if (this.A09.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            this.A0O.A01(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A01 = y2;
                    this.A00 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A06;
                    if (velocityTracker3 == null) {
                        this.A06 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A06.addMovement(motionEvent);
                    OverScroller overScroller = this.A09;
                    overScroller.computeScrollOffset();
                    if (!A06(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0C = z;
                    this.A0O.A05(2, 0);
                }
            }
            if (!A06(motionEvent) && this.A09.isFinished()) {
                z = false;
            }
            this.A0C = z;
            VelocityTracker velocityTracker4 = this.A06;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A06 = null;
            }
        }
        return this.A0C;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0L = false;
        View view = this.A0H;
        if (view != null && A08(view, this)) {
            View view2 = this.A0H;
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0A2 = A0A(rect);
            if (A0A2 != 0) {
                scrollBy(0, A0A2);
            }
        }
        this.A0H = null;
        if (!this.A0K) {
            if (this.A0I != null) {
                scrollTo(getScrollX(), this.A0I.A00);
                this.A0I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (paddingTop >= i5 || scrollY < 0) {
                i6 = 0;
            } else if (paddingTop + scrollY > i5) {
                i6 = i5 - paddingTop;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0K = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0J && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, SN3.MAX_SIGNED_POWER_OF_TWO));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getScrollY();
        return baseSavedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        MRN mrn = this.A0B;
        if (mrn != null) {
            mrn.DhM(this, i, i2, i3, i4);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A062 = AnonymousClass0fD.A06(-901040595);
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus) {
            i5 = -1691735934;
        } else {
            if (A07(findFocus, 0, i4)) {
                Rect rect = this.A0N;
                findFocus.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(findFocus, rect);
                int A0A2 = A0A(rect);
                if (A0A2 != 0) {
                    if (this.A0D) {
                        A04(this, 0, A0A2, false);
                    } else {
                        scrollBy(0, A0A2);
                    }
                }
            }
            i5 = 485153778;
        }
        AnonymousClass0fD.A0D(i5, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        if (A09(r1, r6) != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0183, code lost:
        if (getChildCount() > 0) goto L_0x0185;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = -2134087325(0xffffffff80cc6963, float:-1.8772247E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            r5 = r18
            android.view.VelocityTracker r0 = r5.A06
            if (r0 != 0) goto L_0x0013
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.A06 = r0
        L_0x0013:
            r6 = r19
            int r1 = r6.getActionMasked()
            r14 = 0
            if (r1 != 0) goto L_0x001e
            r5.A0F = r14
        L_0x001e:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r6)
            int r0 = r5.A0F
            float r0 = (float) r0
            r7 = 0
            r3.offsetLocation(r7, r0)
            r2 = 1
            if (r1 == 0) goto L_0x01a0
            if (r1 == r2) goto L_0x010c
            r0 = 2
            if (r1 == r0) goto L_0x006d
            r0 = 3
            if (r1 == r0) goto L_0x017b
            r0 = 5
            if (r1 == r0) goto L_0x005b
            r0 = 6
            if (r1 != r0) goto L_0x004a
            r5.A03(r6)
            int r0 = r5.A00
            int r0 = r6.findPointerIndex(r0)
            float r0 = r6.getY(r0)
            int r0 = (int) r0
            r5.A01 = r0
        L_0x004a:
            android.view.VelocityTracker r0 = r5.A06
            if (r0 == 0) goto L_0x0051
            r0.addMovement(r3)
        L_0x0051:
            r3.recycle()
            r0 = -101315344(0xfffffffff9f60cf0, float:-1.5969593E35)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r2
        L_0x005b:
            int r1 = r6.getActionIndex()
            float r0 = r6.getY(r1)
            int r0 = (int) r0
            r5.A01 = r0
            int r0 = r6.getPointerId(r1)
            r5.A00 = r0
            goto L_0x004a
        L_0x006d:
            int r0 = r5.A00
            int r10 = r6.findPointerIndex(r0)
            r0 = -1
            if (r10 != r0) goto L_0x0086
            java.lang.String r6 = "Invalid pointerId="
            int r1 = r5.A00
            java.lang.String r0 = " in onTouchEvent"
            java.lang.String r1 = X.002.A0c(r6, r0, r1)
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r1)
            goto L_0x004a
        L_0x0086:
            float r0 = r6.getY(r10)
            int r8 = (int) r0
            int r9 = r5.A01
            int r9 = r9 - r8
            float r12 = r6.getX(r10)
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r12 = r12 / r0
            float r11 = (float) r9
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r11 = r11 / r0
            android.widget.EdgeEffect r1 = r5.A08
            float r0 = X.XD6.A00(r1)
            r13 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            float r0 = -r11
            float r0 = X.XD6.A01(r1, r0, r12)
            float r13 = -r0
        L_0x00b0:
            float r0 = X.XD6.A00(r1)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00bb
            r1.onRelease()
        L_0x00bb:
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r13 = r13 * r0
            int r0 = java.lang.Math.round(r13)
            if (r0 == 0) goto L_0x00ca
            r5.invalidate()
        L_0x00ca:
            int r9 = r9 - r0
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x00e5
            int r0 = java.lang.Math.abs(r9)
            int r1 = r5.A05
            if (r0 <= r1) goto L_0x004a
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x00e0
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00e0:
            r5.A0C = r2
            if (r9 <= 0) goto L_0x00f8
            int r9 = r9 - r1
        L_0x00e5:
            float r0 = r6.getX(r10)
            int r0 = (int) r0
            int r1 = r5.A01(r9, r0, r14, r14)
            int r8 = r8 - r1
            r5.A01 = r8
            int r0 = r5.A0F
            int r0 = r0 + r1
            r5.A0F = r0
            goto L_0x004a
        L_0x00f8:
            int r9 = r9 + r1
            goto L_0x00e5
        L_0x00fa:
            android.widget.EdgeEffect r1 = r5.A07
            float r0 = X.XD6.A00(r1)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00bb
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r12
            float r13 = X.XD6.A01(r1, r11, r0)
            goto L_0x00b0
        L_0x010c:
            android.view.VelocityTracker r6 = r5.A06
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r5.A03
            float r0 = (float) r0
            r6.computeCurrentVelocity(r1, r0)
            int r0 = r5.A00
            float r0 = r6.getYVelocity(r0)
            int r6 = (int) r0
            int r1 = java.lang.Math.abs(r6)
            int r0 = r5.A04
            if (r1 < r0) goto L_0x0185
            android.widget.EdgeEffect r1 = r5.A08
            float r0 = X.XD6.A00(r1)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0159
            boolean r0 = r5.A09(r1, r6)
            if (r0 != 0) goto L_0x016a
            int r6 = -r6
        L_0x0136:
            r5.A0B(r6)
        L_0x0139:
            r0 = -1
            r5.A00 = r0
            r5.A0C = r14
            android.view.VelocityTracker r0 = r5.A06
            if (r0 == 0) goto L_0x0148
            r0.recycle()
            r0 = 0
            r5.A06 = r0
        L_0x0148:
            X.03N r0 = r5.A0O
            r0.A01(r14)
            android.widget.EdgeEffect r0 = r5.A08
            r0.onRelease()
            android.widget.EdgeEffect r0 = r5.A07
            r0.onRelease()
            goto L_0x004a
        L_0x0159:
            android.widget.EdgeEffect r1 = r5.A07
            float r0 = X.XD6.A00(r1)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            int r6 = -r6
            if (r0 == 0) goto L_0x016e
            boolean r0 = r5.A09(r1, r6)
            if (r0 == 0) goto L_0x0136
        L_0x016a:
            r1.onAbsorb(r6)
            goto L_0x0139
        L_0x016e:
            float r1 = (float) r6
            X.03N r0 = r5.A0O
            boolean r0 = r0.A03(r7, r1)
            if (r0 != 0) goto L_0x0139
            r5.dispatchNestedFling(r7, r1, r2)
            goto L_0x0136
        L_0x017b:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0139
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x0139
        L_0x0185:
            android.widget.OverScroller r11 = r5.A09
            int r12 = r5.getScrollX()
            int r13 = r5.getScrollY()
            int r17 = r5.getScrollRange()
            r15 = r14
            r16 = r14
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0139
            r5.postInvalidateOnAnimation()
            goto L_0x0139
        L_0x01a0:
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L_0x01ad
            r0 = -762310293(0xffffffffd290116b, float:-3.09383758E11)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r14
        L_0x01ad:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x01ba
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x01ba
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x01ba:
            android.widget.OverScroller r1 = r5.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x01ca
            r1.abortAnimation()
            X.03N r0 = r5.A0O
            r0.A01(r2)
        L_0x01ca:
            float r0 = r6.getY()
            int r1 = (int) r0
            int r0 = r6.getPointerId(r14)
            r5.A01 = r1
            r5.A00 = r0
            r1 = 2
            X.03N r0 = r5.A0O
            r0.A05(r1, r14)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A0A2 = A0A(rect);
        boolean z2 = false;
        if (A0A2 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A0A2);
            } else {
                A04(this, 0, A0A2, false);
                return true;
            }
        }
        return z2;
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setOnScrollChangeListener(MRN mrn) {
        this.A0B = mrn;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0D = z;
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public final void DTm(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A02(i4, iArr, i5);
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, X.03P] */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0N = new Rect();
        this.A0L = true;
        this.A0K = false;
        this.A0H = null;
        this.A0C = false;
        this.A0D = true;
        this.A00 = -1;
        this.A0S = new int[2];
        this.A0R = new int[2];
        C14067TpF tpF = new C14067TpF(this);
        this.A0P = tpF;
        Context context2 = getContext();
        this.A0A = new AnonymousClass02k(context2, tpF);
        this.A08 = XD6.A02(context, attributeSet);
        this.A07 = XD6.A02(context, attributeSet);
        this.A0M = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(context2);
        setFocusable(true);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0V, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0Q = new Object();
        this.A0O = new 03N(this);
        setNestedScrollingEnabled(true);
        03v.A0B(this, A0U);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
