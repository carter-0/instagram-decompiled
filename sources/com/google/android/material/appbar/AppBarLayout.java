package com.google.android.material.appbar;

import X.03v;
import X.04k;
import X.04x;
import X.2X8;
import X.AnonymousClass03M;
import X.AnonymousClass03j;
import X.AnonymousClass05A;
import X.AnonymousClass0fD;
import X.AnonymousClass3MO;
import X.AnonymousClass6Y2;
import X.C14134TqT;
import X.C18942WDv;
import X.C18943WDw;
import X.C297835sR;
import X.C297845sS;
import X.C297855sT;
import X.C297865sU;
import X.C297875sV;
import X.C298045sm;
import X.C298055sn;
import X.C320036re;
import X.C323946yM;
import X.C324246ys;
import X.C324256yt;
import X.W4D;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppBarLayout extends LinearLayout implements AnonymousClass3MO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Drawable A06;
    public 04k A07;
    public WeakReference A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public boolean A0E;
    public int[] A0F;

    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02 = -1;
        public ValueAnimator A03;
        public WeakReference A04;
        public boolean A05;
        public int A06;

        private void A07(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(A0S() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int A0S = A0S();
            ValueAnimator valueAnimator = this.A03;
            if (A0S != i) {
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A03 = valueAnimator2;
                    valueAnimator2.setInterpolator(AnonymousClass6Y2.A00);
                    this.A03.addUpdateListener(new C14134TqT(coordinatorLayout, this, appBarLayout));
                } else {
                    valueAnimator.cancel();
                }
                this.A03.setDuration((long) Math.min(height, 600));
                this.A03.setIntValues(new int[]{A0S, i});
                this.A03.start();
            } else if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A03.cancel();
            }
        }

        /* renamed from: A0X */
        public void A0P(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
            int i4;
            AppBarLayout appBarLayout2 = appBarLayout;
            if (i2 != 0) {
                int i5 = -appBarLayout.getTotalScrollRange();
                if (i2 < 0) {
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = A0T(appBarLayout2, coordinatorLayout, A0S() - i2, i5, i4);
                }
            }
            if (appBarLayout.A0B) {
                appBarLayout.A05(appBarLayout.A04(view));
            }
        }

        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new C320036re();
            public float A00;
            public int A01;
            public boolean A02;

            public final void writeToParcel(Parcel parcel, int i) {
                BaseBehavior.super.writeToParcel(parcel, i);
                parcel.writeInt(this.A01);
                parcel.writeFloat(this.A00);
                parcel.writeByte(this.A02 ? (byte) 1 : 0);
            }
        }

        public static void A06(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            AnonymousClass05A wDv;
            04x r4 = 04x.A0Z;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            03v.A09(coordinatorLayout, r4.A00());
            04x r3 = 04x.A0X;
            03v.A09(coordinatorLayout, r3.A00());
            View A042 = A04(coordinatorLayout);
            if (A042 != null) {
                AppBarLayout appBarLayout2 = appBarLayout;
                if (appBarLayout.getTotalScrollRange() != 0 && (A042.getLayoutParams().A0A instanceof ScrollingViewBehavior)) {
                    BaseBehavior baseBehavior2 = baseBehavior;
                    if (baseBehavior.A0S() != (-appBarLayout.getTotalScrollRange()) && A042.canScrollVertically(1)) {
                        03v.A0E(coordinatorLayout2, r4, new C18942WDv(baseBehavior, appBarLayout, false));
                    }
                    if (baseBehavior.A0S() != 0) {
                        if (A042.canScrollVertically(-1)) {
                            int i = -appBarLayout.getDownNestedPreScrollRange();
                            if (i != 0) {
                                wDv = new C18943WDw(A042, coordinatorLayout2, baseBehavior2, appBarLayout2, i);
                            } else {
                                return;
                            }
                        } else {
                            wDv = new C18942WDv(baseBehavior, appBarLayout, true);
                        }
                        03v.A0E(coordinatorLayout2, r3, wDv);
                    }
                }
            }
        }

        public void A0W(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            if (this.A06 == 0 || i == 1) {
                A05(coordinatorLayout, this, appBarLayout);
                if (appBarLayout.A0B) {
                    appBarLayout.A05(appBarLayout.A04(view));
                }
            }
            this.A04 = new WeakReference(view);
        }

        public boolean A0Y(View view, View view2, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            boolean z;
            if ((i & 2) == 0 || (!appBarLayout.A0B && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            } else {
                z = true;
                ValueAnimator valueAnimator = this.A03;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A04 = null;
            this.A06 = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static View A04(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof AnonymousClass03M) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void A05(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            int A0S = baseBehavior.A0S();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C298055sn r1 = (C298055sn) childAt.getLayoutParams();
                if ((r1.A00 & 32) == 32) {
                    top -= r1.topMargin;
                    bottom += r1.bottomMargin;
                }
                int i2 = -A0S;
                if (top > i2 || bottom < i2) {
                    i++;
                } else if (i >= 0) {
                    View childAt2 = appBarLayout.getChildAt(i);
                    C298055sn r6 = (C298055sn) childAt2.getLayoutParams();
                    int i3 = r6.A00;
                    if ((i3 & 17) == 17) {
                        int i4 = -childAt2.getTop();
                        int i5 = -childAt2.getBottom();
                        if (i == appBarLayout.getChildCount() - 1) {
                            i5 += appBarLayout.getTopInset();
                        }
                        if ((i3 & 2) == 2) {
                            i5 += childAt2.getMinimumHeight();
                        } else if ((i3 & 5) == 5) {
                            int minimumHeight = childAt2.getMinimumHeight() + i5;
                            if (A0S < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                        if ((i3 & 32) == 32) {
                            i4 += r6.topMargin;
                            i5 -= r6.bottomMargin;
                        }
                        if (A0S < (i5 + i4) / 2) {
                            i4 = i5;
                        }
                        int i6 = -appBarLayout.getTotalScrollRange();
                        if (i4 >= i6) {
                            i6 = i4;
                            if (i4 > 0) {
                                i6 = 0;
                            }
                        }
                        baseBehavior.A07(coordinatorLayout, appBarLayout, i6);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }

        public static void A08(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List arrayList;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else {
                    int i4 = ((C298055sn) childAt.getLayoutParams()).A00;
                    boolean z2 = false;
                    if ((i4 & 1) != 0) {
                        int minimumHeight = childAt.getMinimumHeight();
                        if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                            z2 = true;
                        }
                    }
                    if (appBarLayout.A0B) {
                        z2 = appBarLayout.A04(A04(coordinatorLayout));
                    }
                    boolean A052 = appBarLayout.A05(z2);
                    if (!z) {
                        if (A052) {
                            ArrayList arrayList2 = (ArrayList) coordinatorLayout.A0C.A00.get(appBarLayout);
                            if (arrayList2 == null) {
                                arrayList = Collections.emptyList();
                            } else {
                                arrayList = new ArrayList(arrayList2);
                            }
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                CoordinatorLayout.Behavior behavior = ((View) arrayList.get(i5)).getLayoutParams().A0A;
                                if (!(behavior instanceof ScrollingViewBehavior)) {
                                    i5++;
                                } else if (((HeaderScrollingViewBehavior) behavior).A00 == 0) {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                    return;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
        /* renamed from: A0Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8) {
            /*
                r5 = this;
                boolean r4 = super.A0Q(r7, r6, r8)
                int r3 = r7.A03
                int r1 = r5.A02
                r2 = 0
                if (r1 < 0) goto L_0x006c
                r0 = r3 & 8
                if (r0 != 0) goto L_0x006c
                android.view.View r1 = r7.getChildAt(r1)
                int r0 = r1.getBottom()
                int r3 = -r0
                boolean r0 = r5.A05
                if (r0 == 0) goto L_0x005f
                int r1 = r1.getMinimumHeight()
                int r0 = r7.getTopInset()
                int r1 = r1 + r0
            L_0x0025:
                int r3 = r3 + r1
            L_0x0026:
                r5.A0V(r7, r6, r3)
            L_0x0029:
                r1 = 0
                r7.A03 = r2
                r0 = -1
                r5.A02 = r0
                X.6yd r0 = r5.A01
                if (r0 == 0) goto L_0x0035
                int r1 = r0.A02
            L_0x0035:
                int r0 = r7.getTotalScrollRange()
                int r0 = -r0
                if (r1 >= r0) goto L_0x005b
                r1 = r0
            L_0x003d:
                r5.A0R(r1)
                X.6yd r0 = r5.A01
                if (r0 == 0) goto L_0x0059
                int r1 = r0.A02
            L_0x0046:
                r0 = 1
                A08(r6, r7, r1, r2, r0)
                X.6yd r0 = r5.A01
                if (r0 == 0) goto L_0x0057
                int r0 = r0.A02
            L_0x0050:
                r7.A01(r0)
                A06(r6, r5, r7)
                return r4
            L_0x0057:
                r0 = 0
                goto L_0x0050
            L_0x0059:
                r1 = 0
                goto L_0x0046
            L_0x005b:
                if (r1 <= r2) goto L_0x003d
                r1 = 0
                goto L_0x003d
            L_0x005f:
                int r0 = r1.getHeight()
                float r1 = (float) r0
                float r0 = r5.A00
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                goto L_0x0025
            L_0x006c:
                if (r3 == 0) goto L_0x0029
                r0 = r3 & 4
                r1 = 0
                if (r0 == 0) goto L_0x0074
                r1 = 1
            L_0x0074:
                r0 = r3 & 2
                if (r0 == 0) goto L_0x0083
                int r0 = r7.getTotalScrollRange()
                int r3 = -r0
                if (r1 == 0) goto L_0x0026
                r5.A07(r6, r7, r3)
                goto L_0x0029
            L_0x0083:
                r0 = r3 & 1
                if (r0 == 0) goto L_0x0029
                if (r1 == 0) goto L_0x008d
                r5.A07(r6, r7, r2)
                goto L_0x0029
            L_0x008d:
                r5.A0V(r7, r6, r2)
                goto L_0x0029
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int):boolean");
        }

        public BaseBehavior() {
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0V);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
            CoordinatorLayout.Behavior behavior = view2.getLayoutParams().A0A;
            if (behavior instanceof BaseBehavior) {
                view.offsetTopAndBottom((((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).A01) + this.A01) - A0S(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A0B) {
                return false;
            }
            appBarLayout.A05(appBarLayout.A04(view));
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public final void A01(int i) {
        this.A0D = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C324256yt r0 = (C324256yt) this.A09.get(i2);
                if (r0 != null) {
                    r0.DUz(this, i);
                }
            }
        }
    }

    public final void A02(C324246ys r2) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList();
            this.A09 = list;
        }
        if (r2 != null && !list.contains(r2)) {
            this.A09.add(r2);
        }
    }

    public final void A03(C324246ys r2) {
        List list = this.A09;
        if (list != null && r2 != null) {
            list.remove(r2);
        }
    }

    public final boolean A04(View view) {
        View view2;
        int i;
        View view3;
        if (this.A08 == null && (i = this.A02) != -1 && (!(view == null || (view3 = view.findViewById(i)) == null) || ((getParent() instanceof ViewGroup) && (view3 = ((View) getParent()).findViewById(this.A02)) != null))) {
            this.A08 = new WeakReference(view3);
        }
        WeakReference weakReference = this.A08;
        if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
            view = view2;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public final boolean A05(boolean z) {
        if (this.A0E == z) {
            return false;
        }
        this.A0E = z;
        refreshDrawableState();
        if (!this.A0B || !(getBackground() instanceof C297875sV)) {
            return true;
        }
        C297875sV r3 = (C297875sV) getBackground();
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        float f = 0.0f;
        if (!z) {
            f = dimension;
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.A05 = ofFloat;
        ofFloat.setDuration((long) resources.getInteger(R.integer.abc_config_activityShortDur));
        this.A05.setInterpolator(AnonymousClass6Y2.A03);
        this.A05.addUpdateListener(new W4D(this, r3));
        this.A05.start();
        return true;
    }

    public CoordinatorLayout.Behavior getBehavior() {
        return new BaseBehavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C298055sn r7 = (C298055sn) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r7.A00;
            if ((i4 & 5) == 5) {
                int i5 = r7.topMargin + r7.bottomMargin;
                if ((i4 & 8) != 0) {
                    minimumHeight = childAt.getMinimumHeight();
                } else if ((i4 & 2) != 0) {
                    minimumHeight = measuredHeight - childAt.getMinimumHeight();
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && childAt.getFitsSystemWindows()) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + minimumHeight;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.A00 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C298055sn r3 = (C298055sn) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + r3.topMargin + r3.bottomMargin;
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A01 = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A02;
    }

    public int getPendingAction() {
        return this.A03;
    }

    public Drawable getStatusBarForeground() {
        return this.A06;
    }

    public final int getTopInset() {
        04k r0 = this.A07;
        if (r0 != null) {
            return r0.A00.A03().A03;
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A04;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C298055sn r3 = (C298055sn) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + r3.topMargin + r3.bottomMargin;
            if (i2 == 0 && childAt.getFitsSystemWindows()) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A04 = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r1 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r5 = r6.A0F
            if (r5 != 0) goto L_0x0009
            r0 = 4
            int[] r5 = new int[r0]
            r6.A0F = r5
        L_0x0009:
            int r0 = r5.length
            int r7 = r7 + r0
            int[] r4 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r3 = r6.A0C
            r0 = 2130971241(0x7f040a69, float:1.7551215E38)
            if (r3 != 0) goto L_0x001a
            r0 = -2130971241(0xffffffff80fbf597, float:-2.313881E-38)
        L_0x001a:
            r5[r1] = r0
            r2 = 1
            if (r3 == 0) goto L_0x0026
            boolean r1 = r6.A0E
            r0 = 2130971242(0x7f040a6a, float:1.7551217E38)
            if (r1 != 0) goto L_0x0029
        L_0x0026:
            r0 = -2130971242(0xffffffff80fbf596, float:-2.3138809E-38)
        L_0x0029:
            r5[r2] = r0
            r1 = 2
            r0 = 2130971236(0x7f040a64, float:1.7551205E38)
            if (r3 != 0) goto L_0x0034
            r0 = -2130971236(0xffffffff80fbf59c, float:-2.3138818E-38)
        L_0x0034:
            r5[r1] = r0
            r2 = 3
            if (r3 == 0) goto L_0x0040
            boolean r1 = r6.A0E
            r0 = 2130971235(0x7f040a63, float:1.7551203E38)
            if (r1 != 0) goto L_0x0043
        L_0x0040:
            r0 = -2130971235(0xffffffff80fbf59d, float:-2.3138819E-38)
        L_0x0043:
            r5[r2] = r0
            int[] r0 = android.view.View.mergeDrawableStates(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A02 = i;
        WeakReference weakReference = this.A08;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A08 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (getTopInset() <= 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r1 = r4.A06
            if (r1 == r5) goto L_0x0053
            r0 = 0
            if (r1 == 0) goto L_0x000a
            r1.setCallback(r0)
        L_0x000a:
            if (r5 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r0 = r5.mutate()
        L_0x0010:
            r4.A06 = r0
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0023
            android.graphics.drawable.Drawable r1 = r4.A06
            int[] r0 = r4.getDrawableState()
            r1.setState(r0)
        L_0x0023:
            android.graphics.drawable.Drawable r1 = r4.A06
            int r0 = r4.getLayoutDirection()
            r1.setLayoutDirection(r0)
            android.graphics.drawable.Drawable r3 = r4.A06
            int r2 = r4.getVisibility()
            r1 = 0
            r0 = 0
            if (r2 != 0) goto L_0x0037
            r0 = 1
        L_0x0037:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r4.A06
            r0.setCallback(r4)
        L_0x003f:
            android.graphics.drawable.Drawable r0 = r4.A06
            if (r0 == 0) goto L_0x004a
            int r1 = r4.getTopInset()
            r0 = 1
            if (r1 > 0) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r0 = r0 ^ 1
            r4.setWillNotDraw(r0)
            r4.postInvalidateOnAnimation()
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.5sn, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: A00 */
    public final C298055sn generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.A00 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A01);
        layoutParams.A00 = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            layoutParams.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(-747726983);
        super.draw(canvas);
        if (this.A06 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.A0D));
            this.A06.draw(canvas);
            canvas.restoreToCount(save);
        }
        AnonymousClass0fD.A0A(-334214418, A032);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) {
            return (minimumHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1110133092);
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            C323946yM.A00(this, (C297875sV) background);
        }
        AnonymousClass0fD.A0D(31956987, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(875153656);
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A08;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A08 = null;
        AnonymousClass0fD.A0D(1583163271, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A0A = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C298055sn) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A0A = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.A0B) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C298055sn) getChildAt(i6).getLayoutParams()).A00;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                }
                i6++;
            }
        }
        if (this.A0C != z2) {
            this.A0C = z2;
            refreshDrawableState();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = getMeasuredHeight() + getTopInset();
                    int size = View.MeasureSpec.getSize(i2);
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight > size) {
                        measuredHeight = size;
                    }
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            ((C297875sV) background).A0A(f);
        }
    }

    public void setExpanded(boolean z) {
        boolean isLaidOut = isLaidOut();
        int i = 2;
        if (z) {
            i = 1;
        }
        int i2 = 0;
        if (isLaidOut) {
            i2 = 4;
        }
        this.A03 = i | i2 | 8;
        requestLayout();
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(2X8.A02().A05(getContext(), i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A06) {
            return true;
        }
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C298055sn;
    }

    public void setLiftOnScroll(boolean z) {
        this.A0B = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C297845sS.A00(this, f);
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018484), attributeSet, i);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = 0;
        Context context2 = getContext();
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        TypedArray A002 = C297855sT.A00(context2, attributeSet2, C297845sS.A00, new int[0], i2, 2132018484);
        try {
            if (A002.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, A002.getResourceId(0, 0)));
            }
            A002.recycle();
            TypedArray A003 = C297855sT.A00(context2, attributeSet2, C297865sU.A00, new int[0], i2, 2132018484);
            setBackground(A003.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                C297875sV r5 = new C297875sV();
                r5.A0F(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                r5.A0E(context2);
                setBackground(r5);
            }
            if (A003.hasValue(4)) {
                this.A03 = A003.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (A003.hasValue(3)) {
                C297845sS.A00(this, (float) A003.getDimensionPixelSize(3, 0));
            }
            if (A003.hasValue(2)) {
                setKeyboardNavigationCluster(A003.getBoolean(2, false));
            }
            if (A003.hasValue(1)) {
                setTouchscreenBlocksFocus(A003.getBoolean(1, false));
            }
            this.A0B = A003.getBoolean(5, false);
            this.A02 = A003.getResourceId(6, -1);
            setStatusBarForeground(A003.getDrawable(7));
            A003.recycle();
            AnonymousClass03j.A00(this, new C298045sm(this));
        } catch (Throwable th) {
            A002.recycle();
            throw th;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }
}
