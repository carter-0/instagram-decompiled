package androidx.coordinatorlayout.widget;

import X.002;
import X.01r;
import X.02U;
import X.03v;
import X.04k;
import X.04x;
import X.0kz;
import X.0l2;
import X.0qQ;
import X.0uj;
import X.2cx;
import X.2dP;
import X.AnonymousClass03P;
import X.AnonymousClass03Q;
import X.AnonymousClass03j;
import X.AnonymousClass0fD;
import X.AnonymousClass3MO;
import X.AnonymousClass6U4;
import X.AnonymousClass6WC;
import X.AnonymousClass972;
import X.C324086yc;
import X.C324096yd;
import X.C324116yf;
import X.SN3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import com.instagram.android.R;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements 0uj, 0kz {
    public static final String A0I;
    public static final ThreadLocal A0J = new ThreadLocal();
    public static final Comparator A0K = new Object();
    public static final Class[] A0L = {Context.class, AttributeSet.class};
    public static final 02U A0M = new 0l2(12);
    public ViewGroup.OnHierarchyChangeListener A00;
    public C324086yc A01;
    public 04k A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public View A07;
    public View A08;
    public AnonymousClass03Q A09;
    public boolean A0A;
    public int[] A0B;
    public final 2cx A0C;
    public final AnonymousClass03P A0D;
    public final List A0E;
    public final List A0F;
    public final int[] A0G;
    public final int[] A0H;

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class value();
    }

    public abstract class Behavior {
        public boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public void A0G() {
        }

        public void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
            View view3 = view;
            int i6 = i4;
            if (this instanceof AppBarLayout.BaseBehavior) {
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                AppBarLayout appBarLayout = (AppBarLayout) view3;
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                if (i4 < 0) {
                    iArr[1] = baseBehavior.A0T(appBarLayout, coordinatorLayout2, baseBehavior.A0S() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
                } else if (i4 == 0) {
                    AppBarLayout.BaseBehavior.A06(coordinatorLayout, baseBehavior, appBarLayout);
                }
            } else {
                iArr[0] = iArr[0] + i3;
                iArr[1] = iArr[1] + i4;
                if (this instanceof RefreshableAppBarLayoutBehavior) {
                    RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = (RefreshableAppBarLayoutBehavior) this;
                    0qQ.A0B(view2, 2);
                    if (!refreshableAppBarLayoutBehavior.A0C && !refreshableAppBarLayoutBehavior.A09) {
                        refreshableAppBarLayoutBehavior.A08 = true;
                        if (refreshableAppBarLayoutBehavior.A0A && i2 == 0 && i4 < 0 && i5 == 0) {
                            RefreshableAppBarLayoutBehavior.A03(refreshableAppBarLayoutBehavior, i6);
                        }
                    }
                }
            }
        }

        public void A0K(2dP r1) {
        }

        public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
            View view4 = view;
            if (!(this instanceof AppBarLayout.BaseBehavior)) {
                return false;
            }
            return ((AppBarLayout.BaseBehavior) this).A0Y(view2, view3, coordinatorLayout, (AppBarLayout) view4, i, i2);
        }

        public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
            return false;
        }

        public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
            return false;
        }

        public final void A09(View view, CoordinatorLayout coordinatorLayout) {
            if ((this instanceof AppBarLayout.ScrollingViewBehavior) && (view instanceof AppBarLayout)) {
                03v.A09(coordinatorLayout, 04x.A0Z.A00());
                03v.A09(coordinatorLayout, 04x.A0X.A00());
            }
        }

        public final boolean A0B(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
            if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
                return false;
            }
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            List A0B = coordinatorLayout.A0B(view);
            int size = A0B.size();
            for (int i = 0; i < size; i++) {
                View view2 = (View) A0B.get(i);
                if (view2 instanceof AppBarLayout) {
                    AppBarLayout appBarLayout = (AppBarLayout) view2;
                    if (appBarLayout == null) {
                        return false;
                    }
                    rect.offset(view.getLeft(), view.getTop());
                    Rect rect2 = headerScrollingViewBehavior.A02;
                    rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                    if (rect2.contains(rect)) {
                        return false;
                    }
                    int i2 = 0;
                    if (!z) {
                        i2 = 4;
                    }
                    appBarLayout.A03 = i2 | 2 | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        public boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
            if (this instanceof AppBarLayout.ScrollingViewBehavior) {
                return view2 instanceof AppBarLayout;
            }
            return false;
        }

        public final boolean A0E(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
            int makeMeasureSpec;
            04k r5;
            if (this instanceof AppBarLayout.BaseBehavior) {
                if (view.getLayoutParams().height != -2) {
                    return false;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else if (!(this instanceof HeaderScrollingViewBehavior)) {
                return false;
            } else {
                int i4 = view.getLayoutParams().height;
                if (i4 != -1 && i4 != -2) {
                    return false;
                }
                List A0B = coordinatorLayout.A0B(view);
                int size = A0B.size();
                int i5 = 0;
                while (i5 < size) {
                    View view2 = (View) A0B.get(i5);
                    if (!(view2 instanceof AppBarLayout)) {
                        i5++;
                    } else if (view2 == null) {
                        return false;
                    } else {
                        int size2 = View.MeasureSpec.getSize(i3);
                        if (size2 <= 0) {
                            size2 = coordinatorLayout.getHeight();
                        } else if (view2.getFitsSystemWindows() && (r5 = coordinatorLayout.A02) != null) {
                            size2 += r5.A00.A03().A03 + r5.A02();
                        }
                        int totalScrollRange = (size2 + ((AppBarLayout) view2).getTotalScrollRange()) - view2.getMeasuredHeight();
                        int i6 = AnonymousClass972.MUTABLE_FLAG_MASK;
                        if (i4 == -1) {
                            i6 = SN3.MAX_SIGNED_POWER_OF_TWO;
                        }
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(totalScrollRange, i6);
                    }
                }
                return false;
            }
            coordinatorLayout.A0F(view, i, i2, makeMeasureSpec);
            return true;
        }

        public Parcelable A0F(View view, CoordinatorLayout coordinatorLayout) {
            int i;
            if (!(this instanceof AppBarLayout.BaseBehavior)) {
                return AbsSavedState.EMPTY_STATE;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
            C324096yd r0 = ((ViewOffsetBehavior) this).A01;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + i;
                if (childAt.getTop() + i > 0 || bottom < 0) {
                    i2++;
                } else {
                    androidx.customview.view.AbsSavedState absSavedState2 = new androidx.customview.view.AbsSavedState(absSavedState);
                    absSavedState2.A01 = i2;
                    if (bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    absSavedState2.A02 = z;
                    absSavedState2.A00 = ((float) bottom) / ((float) childAt.getHeight());
                    return absSavedState2;
                }
            }
            return absSavedState;
        }

        public void A0H(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                if (parcelable instanceof AppBarLayout.BaseBehavior.SavedState) {
                    AppBarLayout.BaseBehavior.SavedState savedState = (AppBarLayout.BaseBehavior.SavedState) parcelable;
                    baseBehavior.A02 = savedState.A01;
                    baseBehavior.A00 = savedState.A00;
                    baseBehavior.A05 = savedState.A02;
                    return;
                }
                baseBehavior.A02 = -1;
            }
        }

        public void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                ((AppBarLayout.BaseBehavior) this).A0W(view2, coordinatorLayout, (AppBarLayout) view, i);
            }
        }

        public void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void A0F(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
        DTm(view, this.A0H, i, i2, i3, i4, 0);
    }

    public boolean DmW(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                2dP layoutParams = childAt.getLayoutParams();
                Behavior behavior = layoutParams.A0A;
                int i4 = i2;
                if (behavior != null) {
                    z = behavior.A0N(childAt, view, view2, this, i, i4);
                    z2 |= z;
                } else {
                    z = false;
                }
                if (i2 == 0) {
                    layoutParams.A0D = z;
                } else if (i4 == 1) {
                    layoutParams.A0C = z;
                }
            }
        }
        return z2;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new 2dP(-2, -2);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                2dP layoutParams = childAt.getLayoutParams();
                if (layoutParams.A0D && (behavior = layoutParams.A0A) != null) {
                    z |= behavior.A0O(childAt, view, this, f, f2);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        DTk(view, iArr, i, i2, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        DTl(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        DTn(view, view2, i, 0);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return DmW(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        DnO(view, 0);
    }

    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator CREATOR = new AnonymousClass6U4();
        public SparseArray A00;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            SparseArray sparseArray = new SparseArray(readInt);
            this.A00 = sparseArray;
            for (int i = 0; i < readInt; i++) {
                sparseArray.append(iArr[i], readParcelableArray[i]);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.Parcelable[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeToParcel(android.os.Parcel r6, int r7) {
            /*
                r5 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout.super.writeToParcel(r6, r7)
                android.util.SparseArray r0 = r5.A00
                r4 = 0
                if (r0 == 0) goto L_0x0028
                int r3 = r0.size()
            L_0x000c:
                r6.writeInt(r3)
                int[] r2 = new int[r3]
                android.os.Parcelable[] r1 = new android.os.Parcelable[r3]
            L_0x0013:
                if (r4 >= r3) goto L_0x002a
                android.util.SparseArray r0 = r5.A00
                int r0 = r0.keyAt(r4)
                r2[r4] = r0
                android.util.SparseArray r0 = r5.A00
                java.lang.Object r0 = r0.valueAt(r4)
                r1[r4] = r0
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0028:
                r3 = 0
                goto L_0x000c
            L_0x002a:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r1, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.writeToParcel(android.os.Parcel, int):void");
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        String str = null;
        if (packageR != null) {
            str = packageR.getName();
        }
        A0I = str;
    }

    private int A00(int i) {
        StringBuilder sb;
        int[] iArr = this.A0B;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public static Rect A01() {
        Rect rect = (Rect) A0M.A7A();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r11 = getLayoutDirection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r12 = this;
            java.util.List r7 = r12.A0E
            r7.clear()
            X.2cx r6 = r12.A0C
            X.01r r5 = r6.A00
            int r3 = r5.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r3) goto L_0x0023
            java.lang.Object r1 = r5.A06(r2)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x0020
            r1.clear()
            X.02U r0 = r6.A01
            r0.ECR(r1)
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0023:
            r5.clear()
            int r9 = r12.getChildCount()
            r8 = 0
        L_0x002b:
            if (r8 >= r9) goto L_0x0167
            android.view.View r3 = r12.getChildAt(r8)
            X.2dP r4 = A02(r3)
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x00bc
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x003f:
            boolean r0 = r5.containsKey(r3)
            if (r0 != 0) goto L_0x0049
            r0 = 0
            r5.put(r3, r0)
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r2 >= r9) goto L_0x00b8
            if (r2 == r8) goto L_0x00aa
            android.view.View r1 = r12.getChildAt(r2)
            android.view.View r0 = r4.A08
            if (r1 == r0) goto L_0x0071
            int r11 = r12.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.2dP r0 = (X.2dP) r0
            int r0 = r0.A03
            int r10 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            if (r10 == 0) goto L_0x00ad
            int r0 = r4.A01
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & r10
            if (r0 != r10) goto L_0x00ad
        L_0x0071:
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0081
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0081
            r0 = 0
            r5.put(r1, r0)
        L_0x0081:
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r5.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a7
            X.02U r0 = r6.A01
            java.lang.Object r0 = r0.A7A()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00a4:
            r5.put(r1, r0)
        L_0x00a7:
            r0.add(r3)
        L_0x00aa:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x00ad:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r4.A0A
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A0C(r3, r1, r12)
            if (r0 == 0) goto L_0x00aa
            goto L_0x0071
        L_0x00b8:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x00bc:
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.getId()
            int r0 = r4.A05
            if (r1 != r0) goto L_0x00e9
            android.view.View r2 = r4.A09
            android.view.ViewParent r1 = r2.getParent()
        L_0x00ce:
            if (r1 == r12) goto L_0x00e0
            if (r1 == 0) goto L_0x00e4
            if (r1 == r3) goto L_0x00e4
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00db
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x00db:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x00ce
        L_0x00e0:
            r4.A08 = r2
            goto L_0x003f
        L_0x00e4:
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x00e9:
            int r11 = r4.A05
            android.view.View r10 = r12.findViewById(r11)
            r4.A09 = r10
            r2 = 0
            if (r10 == 0) goto L_0x012c
            if (r10 != r12) goto L_0x0104
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0104:
            android.view.ViewParent r1 = r10.getParent()
        L_0x0108:
            if (r1 == r12) goto L_0x0128
            if (r1 == 0) goto L_0x0128
            if (r1 != r3) goto L_0x011c
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x011c:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0123
            r10 = r1
            android.view.View r10 = (android.view.View) r10
        L_0x0123:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0108
        L_0x0128:
            r4.A08 = r10
            goto L_0x003f
        L_0x012c:
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find CoordinatorLayout descendant view with id "
            r1.append(r0)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r0 = r0.getResourceName(r11)
            r1.append(r0)
            java.lang.String r0 = " to anchor view "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            r4.A08 = r2
            r4.A09 = r2
            goto L_0x003f
        L_0x015f:
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.util.ArrayList r4 = r6.A02
            r4.clear()
            java.util.HashSet r3 = r6.A03
            r3.clear()
            int r2 = r5.size()
            r1 = 0
        L_0x0176:
            if (r1 >= r2) goto L_0x0182
            java.lang.Object r0 = r5.A05(r1)
            X.2cx.A00(r6, r0, r4, r3)
            int r1 = r1 + 1
            goto L_0x0176
        L_0x0182:
            r7.addAll(r4)
            java.util.Collections.reverse(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A03():void");
    }

    private void A04() {
        View view = this.A07;
        if (view != null) {
            Behavior behavior = view.getLayoutParams().A0A;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.A0M(obtain, this.A07, this);
                obtain.recycle();
            }
            this.A07 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        this.A0A = false;
    }

    public static void A07(Rect rect, Rect rect2, 2dP r11, int i, int i2, int i3) {
        int width;
        int height;
        int i4 = r11.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = r11.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final List A0B(View view) {
        01r r4 = this.A0C.A00;
        int size = r4.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractCollection abstractCollection = (AbstractCollection) r4.A06(i);
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r4.A05(i));
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0260, code lost:
        if (r13 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0250 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(int r28) {
        /*
            r27 = this;
            r6 = r27
            int r20 = r6.getLayoutDirection()
            java.util.List r5 = r6.A0E
            int r19 = r5.size()
            android.graphics.Rect r4 = A01()
            android.graphics.Rect r3 = A01()
            android.graphics.Rect r18 = A01()
            r2 = 0
        L_0x0019:
            r0 = r19
            if (r2 >= r0) goto L_0x028d
            java.lang.Object r1 = r5.get(r2)
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            X.2dP r10 = (X.2dP) r10
            r7 = r28
            if (r28 != 0) goto L_0x0038
            int r8 = r1.getVisibility()
            r0 = 8
            if (r8 != r0) goto L_0x0038
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0038:
            r14 = 0
        L_0x0039:
            if (r14 >= r2) goto L_0x00db
            java.lang.Object r8 = r5.get(r14)
            android.view.View r0 = r10.A08
            if (r0 != r8) goto L_0x00d3
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            X.2dP r13 = (X.2dP) r13
            android.view.View r0 = r13.A09
            if (r0 == 0) goto L_0x00d3
            android.graphics.Rect r17 = A01()
            android.graphics.Rect r12 = A01()
            android.graphics.Rect r11 = A01()
            android.view.View r8 = r13.A09
            r0 = r17
            X.C324116yf.A01(r0, r8, r6)
            r16 = 0
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x00d7
            int r8 = r1.getVisibility()
            r0 = 8
            if (r8 == r0) goto L_0x00d7
            int r15 = r1.getLeft()
            int r9 = r1.getTop()
            int r8 = r1.getRight()
            int r0 = r1.getBottom()
            r12.set(r15, r9, r8, r0)
        L_0x0083:
            int r15 = r1.getMeasuredWidth()
            int r9 = r1.getMeasuredHeight()
            r21 = r17
            r22 = r11
            r23 = r13
            r24 = r20
            r25 = r15
            r26 = r9
            A07(r21, r22, r23, r24, r25, r26)
            int r8 = r11.left
            int r0 = r12.left
            if (r8 != r0) goto L_0x00a6
            int r8 = r11.top
            int r0 = r12.top
            if (r8 == r0) goto L_0x00a8
        L_0x00a6:
            r16 = 1
        L_0x00a8:
            r6.A08(r11, r13, r15, r9)
            int r9 = r11.left
            int r0 = r12.left
            int r9 = r9 - r0
            int r8 = r11.top
            int r0 = r12.top
            int r8 = r8 - r0
            if (r9 == 0) goto L_0x00ba
            r1.offsetLeftAndRight(r9)
        L_0x00ba:
            if (r8 == 0) goto L_0x00bf
            r1.offsetTopAndBottom(r8)
        L_0x00bf:
            if (r16 == 0) goto L_0x00ca
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r8 = r13.A0A
            if (r8 == 0) goto L_0x00ca
            android.view.View r0 = r13.A09
            r8.A0D(r1, r0, r6)
        L_0x00ca:
            A06(r17)
            A06(r12)
            A06(r11)
        L_0x00d3:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00d7:
            r12.setEmpty()
            goto L_0x0083
        L_0x00db:
            r8 = 1
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x0288
            int r9 = r1.getVisibility()
            r0 = 8
            if (r9 == r0) goto L_0x0288
            X.C324116yf.A01(r3, r1, r6)
        L_0x00ed:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x012f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x012f
            int r9 = r10.A03
            r0 = r20
            int r12 = android.view.Gravity.getAbsoluteGravity(r9, r0)
            r9 = r12 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r9 == r0) goto L_0x027c
            r0 = 80
            if (r9 != r0) goto L_0x0118
            int r11 = r4.bottom
            int r9 = r6.getHeight()
            int r0 = r3.top
            int r9 = r9 - r0
            int r0 = java.lang.Math.max(r11, r9)
            r4.bottom = r0
        L_0x0118:
            r9 = r12 & 7
            r0 = 3
            if (r9 == r0) goto L_0x0270
            r0 = 5
            if (r9 != r0) goto L_0x012f
            int r11 = r4.right
            int r9 = r6.getWidth()
            int r0 = r3.left
            int r9 = r9 - r0
            int r0 = java.lang.Math.max(r11, r9)
            r4.right = r0
        L_0x012f:
            int r0 = r10.A01
            if (r0 == 0) goto L_0x020a
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x020a
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L_0x020a
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L_0x020a
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L_0x020a
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            X.2dP r12 = (X.2dP) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r15 = r12.A0A
            android.graphics.Rect r10 = A01()
            android.graphics.Rect r14 = A01()
            int r13 = r1.getLeft()
            int r11 = r1.getTop()
            int r9 = r1.getRight()
            int r0 = r1.getBottom()
            r14.set(r13, r11, r9, r0)
            if (r15 == 0) goto L_0x0173
            r15.A0A(r10, r1, r6)
        L_0x0173:
            r10.set(r14)
            A06(r14)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0207
            int r9 = r12.A01
            r0 = r20
            int r14 = android.view.Gravity.getAbsoluteGravity(r9, r0)
            r9 = r14 & 48
            r0 = 48
            r11 = 0
            if (r9 != r0) goto L_0x026d
            int r9 = r10.top
            int r0 = r12.topMargin
            int r9 = r9 - r0
            int r0 = r12.A07
            int r9 = r9 - r0
            int r0 = r4.top
            if (r9 >= r0) goto L_0x026d
            int r0 = r0 - r9
            A09(r1, r0)
            r13 = 1
        L_0x019f:
            r9 = r14 & 80
            r0 = 80
            if (r9 != r0) goto L_0x0266
            int r9 = r6.getHeight()
            int r0 = r10.bottom
            int r9 = r9 - r0
            int r0 = r12.bottomMargin
            int r9 = r9 - r0
            int r0 = r12.A07
            int r9 = r9 + r0
            int r0 = r4.bottom
            if (r9 >= r0) goto L_0x0266
            int r9 = r9 - r0
            A09(r1, r9)
        L_0x01ba:
            r9 = r14 & 3
            r0 = 3
            if (r9 != r0) goto L_0x0263
            int r9 = r10.left
            int r0 = r12.leftMargin
            int r9 = r9 - r0
            int r0 = r12.A06
            int r9 = r9 - r0
            int r13 = r4.left
            if (r9 >= r13) goto L_0x0263
            int r13 = r13 - r9
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            X.2dP r9 = (X.2dP) r9
            int r0 = r9.A06
            if (r0 == r13) goto L_0x01dd
            int r0 = r13 - r0
            r1.offsetLeftAndRight(r0)
            r9.A06 = r13
        L_0x01dd:
            r13 = 1
        L_0x01de:
            r9 = 5
            r0 = r14 & 5
            if (r0 != r9) goto L_0x0260
            int r9 = r6.getWidth()
            int r0 = r10.right
            int r9 = r9 - r0
            int r0 = r12.rightMargin
            int r9 = r9 - r0
            int r0 = r12.A06
            int r9 = r9 + r0
            int r0 = r4.right
            if (r9 >= r0) goto L_0x0260
            int r11 = r9 - r0
        L_0x01f6:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            X.2dP r9 = (X.2dP) r9
            int r0 = r9.A06
            if (r0 == r11) goto L_0x0207
            int r0 = r11 - r0
            r1.offsetLeftAndRight(r0)
            r9.A06 = r11
        L_0x0207:
            A06(r10)
        L_0x020a:
            r10 = 2
            if (r7 == r10) goto L_0x022b
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.2dP r0 = (X.2dP) r0
            android.graphics.Rect r9 = r0.A0F
            r0 = r18
            r0.set(r9)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0035
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.2dP r0 = (X.2dP) r0
            android.graphics.Rect r0 = r0.A0F
            r0.set(r3)
        L_0x022b:
            int r12 = r2 + 1
        L_0x022d:
            r0 = r19
            if (r12 >= r0) goto L_0x0035
            java.lang.Object r13 = r5.get(r12)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            X.2dP r11 = (X.2dP) r11
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r11.A0A
            if (r9 == 0) goto L_0x0250
            boolean r0 = r9.A0C(r13, r1, r6)
            if (r0 == 0) goto L_0x0250
            if (r28 != 0) goto L_0x0253
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0259
            r0 = 0
        L_0x024e:
            r11.A0E = r0
        L_0x0250:
            int r12 = r12 + 1
            goto L_0x022d
        L_0x0253:
            if (r7 != r10) goto L_0x0259
            r9.A09(r1, r6)
            goto L_0x0250
        L_0x0259:
            boolean r0 = r9.A0D(r13, r1, r6)
            if (r7 != r8) goto L_0x0250
            goto L_0x024e
        L_0x0260:
            if (r13 != 0) goto L_0x0207
            goto L_0x01f6
        L_0x0263:
            r13 = 0
            goto L_0x01de
        L_0x0266:
            if (r13 != 0) goto L_0x01ba
            A09(r1, r11)
            goto L_0x01ba
        L_0x026d:
            r13 = 0
            goto L_0x019f
        L_0x0270:
            int r9 = r4.left
            int r0 = r3.right
            int r0 = java.lang.Math.max(r9, r0)
            r4.left = r0
            goto L_0x012f
        L_0x027c:
            int r9 = r4.top
            int r0 = r3.bottom
            int r0 = java.lang.Math.max(r9, r0)
            r4.top = r0
            goto L_0x0118
        L_0x0288:
            r3.setEmpty()
            goto L_0x00ed
        L_0x028d:
            A06(r4)
            A06(r3)
            A06(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0C(int):void");
    }

    public final void A0D(View view) {
        AbstractList abstractList = (AbstractList) this.A0C.A00.get(view);
        if (abstractList != null && !abstractList.isEmpty()) {
            for (int i = 0; i < abstractList.size(); i++) {
                View view2 = (View) abstractList.get(i);
                Behavior behavior = view2.getLayoutParams().A0A;
                if (behavior != null) {
                    behavior.A0D(view2, view, this);
                }
            }
        }
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                2dP layoutParams = childAt.getLayoutParams();
                int i7 = i3;
                if (i3 == 0) {
                    z = layoutParams.A0D;
                } else if (i7 == 1) {
                    z = layoutParams.A0C;
                }
                if (z && (behavior = layoutParams.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.A0P(childAt, view, this, iArr2, i, i2, i7);
                    int i8 = iArr2[0];
                    if (i > 0) {
                        i4 = Math.max(i4, i8);
                    } else {
                        i4 = Math.min(i4, i8);
                    }
                    int i9 = iArr2[1];
                    if (i2 > 0) {
                        i5 = Math.max(i5, i9);
                    } else {
                        i5 = Math.min(i5, i9);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            A0C(1);
        }
    }

    public final void DTm(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                2dP layoutParams = childAt.getLayoutParams();
                int i9 = i5;
                if (i5 == 0) {
                    z = layoutParams.A0D;
                } else if (i9 == 1) {
                    z = layoutParams.A0C;
                }
                if (z && (behavior = layoutParams.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.A0J(childAt, view, this, iArr2, i, i2, i3, i4, i9);
                    int i10 = iArr2[0];
                    if (i3 > 0) {
                        i6 = Math.max(i6, i10);
                    } else {
                        i6 = Math.min(i6, i10);
                    }
                    int i11 = iArr2[1];
                    if (i4 > 0) {
                        i7 = Math.max(i7, i11);
                    } else {
                        i7 = Math.min(i7, i11);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            A0C(1);
        }
    }

    public final void DTn(View view, View view2, int i, int i2) {
        AnonymousClass03P r1 = this.A0D;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A08 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public final void DnO(View view, int i) {
        boolean z;
        AnonymousClass03P r0 = this.A0D;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            2dP layoutParams = childAt.getLayoutParams();
            if (i == 0) {
                z = layoutParams.A0D;
            } else if (i == 1) {
                z = layoutParams.A0C;
            }
            if (z) {
                Behavior behavior = layoutParams.A0A;
                if (behavior != null) {
                    behavior.A0I(childAt, view, this, i);
                }
                if (i != 0) {
                    layoutParams.A0C = false;
                } else {
                    layoutParams.A0D = false;
                }
                layoutParams.A0E = false;
            }
        }
        this.A08 = null;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof 2dP) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof 2dP) {
            return new 2dP((2dP) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new 2dP((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new 2dP(layoutParams);
    }

    public final 04k getLastWindowInsets() {
        return this.A02;
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0D;
        return r0.A01 | r0.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (getFitsSystemWindows() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r20 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        if (r20 != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
        r1 = (r19 - r21) - r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r3 = r32
            r3.A03()
            int r8 = r3.getChildCount()
            r7 = 0
            r6 = 0
        L_0x000b:
            if (r6 >= r8) goto L_0x002b
            android.view.View r5 = r3.getChildAt(r6)
            X.2cx r0 = r3.A0C
            X.01r r4 = r0.A00
            int r2 = r4.size()
            r1 = 0
        L_0x001a:
            if (r1 >= r2) goto L_0x0180
            java.lang.Object r0 = r4.A06(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x017c
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x017c
            r7 = 1
        L_0x002b:
            boolean r0 = r3.A05
            if (r7 == r0) goto L_0x004c
            boolean r0 = r3.A04
            if (r7 == 0) goto L_0x016a
            if (r0 == 0) goto L_0x0049
            X.6yc r0 = r3.A01
            if (r0 != 0) goto L_0x0040
            X.6yc r0 = new X.6yc
            r0.<init>(r3)
            r3.A01 = r0
        L_0x0040:
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.6yc r0 = r3.A01
            r1.addOnPreDrawListener(r0)
        L_0x0049:
            r0 = 1
        L_0x004a:
            r3.A05 = r0
        L_0x004c:
            int r23 = r3.getPaddingLeft()
            int r22 = r3.getPaddingTop()
            int r21 = r3.getPaddingRight()
            int r1 = r3.getPaddingBottom()
            int r11 = r3.getLayoutDirection()
            r0 = 1
            r20 = 0
            if (r11 != r0) goto L_0x0067
            r20 = 1
        L_0x0067:
            r31 = r33
            int r10 = android.view.View.MeasureSpec.getMode(r31)
            int r19 = android.view.View.MeasureSpec.getSize(r31)
            r30 = r34
            int r9 = android.view.View.MeasureSpec.getMode(r30)
            int r18 = android.view.View.MeasureSpec.getSize(r30)
            int r17 = r23 + r21
            int r22 = r22 + r1
            int r8 = r3.getSuggestedMinimumWidth()
            int r6 = r3.getSuggestedMinimumHeight()
            X.04k r0 = r3.A02
            if (r0 == 0) goto L_0x0093
            boolean r0 = r3.getFitsSystemWindows()
            r16 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0093:
            r16 = 0
        L_0x0095:
            java.util.List r7 = r3.A0E
            int r5 = r7.size()
            r4 = 0
            r2 = 0
        L_0x009d:
            if (r2 >= r5) goto L_0x0184
            java.lang.Object r12 = r7.get(r2)
            android.view.View r12 = (android.view.View) r12
            int r1 = r12.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0153
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            X.2dP r13 = (X.2dP) r13
            int r0 = r13.A04
            if (r0 < 0) goto L_0x0167
            if (r10 == 0) goto L_0x0167
            int r0 = r13.A04
            int r1 = r3.A00(r0)
            int r0 = r13.A02
            if (r0 != 0) goto L_0x00c6
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00c6:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r14 = r0 & 7
            r0 = 3
            if (r14 != r0) goto L_0x015c
            if (r20 == 0) goto L_0x0161
        L_0x00d1:
            int r1 = r1 - r23
        L_0x00d3:
            r0 = 0
            int r15 = java.lang.Math.max(r0, r1)
        L_0x00d8:
            if (r16 == 0) goto L_0x0157
            boolean r0 = r12.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0157
            X.04k r0 = r3.A02
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r14 = r0.A01
            X.04k r0 = r3.A02
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r0 = r0.A02
            int r14 = r14 + r0
            X.04k r0 = r3.A02
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r1 = r0.A03
            X.04k r0 = r3.A02
            int r0 = r0.A02()
            int r1 = r1 + r0
            int r0 = r19 - r14
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            int r0 = r18 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
        L_0x0112:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r13.A0A
            if (r0 == 0) goto L_0x0128
            r24 = r0
            r25 = r12
            r26 = r3
            r27 = r14
            r28 = r15
            r29 = r1
            boolean r0 = r24.A0E(r25, r26, r27, r28, r29)
            if (r0 != 0) goto L_0x012b
        L_0x0128:
            r3.A0F(r12, r14, r15, r1)
        L_0x012b:
            int r0 = r12.getMeasuredWidth()
            int r1 = r17 + r0
            int r0 = r13.leftMargin
            int r1 = r1 + r0
            int r0 = r13.rightMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r8, r1)
            int r0 = r12.getMeasuredHeight()
            int r1 = r22 + r0
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r13.bottomMargin
            int r1 = r1 + r0
            int r6 = java.lang.Math.max(r6, r1)
            int r0 = r12.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r0)
        L_0x0153:
            int r2 = r2 + 1
            goto L_0x009d
        L_0x0157:
            r14 = r31
            r1 = r30
            goto L_0x0112
        L_0x015c:
            r0 = 5
            if (r14 != r0) goto L_0x0167
            if (r20 == 0) goto L_0x00d1
        L_0x0161:
            int r0 = r19 - r21
            int r1 = r0 - r1
            goto L_0x00d3
        L_0x0167:
            r15 = 0
            goto L_0x00d8
        L_0x016a:
            if (r0 == 0) goto L_0x0179
            X.6yc r0 = r3.A01
            if (r0 == 0) goto L_0x0179
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.6yc r0 = r3.A01
            r1.removeOnPreDrawListener(r0)
        L_0x0179:
            r0 = 0
            goto L_0x004a
        L_0x017c:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0180:
            int r6 = r6 + 1
            goto L_0x000b
        L_0x0184:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r0 = r31
            int r2 = android.view.View.resolveSizeAndState(r8, r0, r1)
            int r1 = r4 << 16
            r0 = r30
            int r0 = android.view.View.resolveSizeAndState(r6, r0, r1)
            r3.setMeasuredDimension(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        SparseArray sparseArray = savedState.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = A02(childAt).A0A;
            if (!(id == -1 || behavior == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                behavior.A0H(parcelable2, childAt, this);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable A0F2;
        Parcelable.Creator creator = SavedState.CREATOR;
        androidx.customview.view.AbsSavedState absSavedState = new androidx.customview.view.AbsSavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = childAt.getLayoutParams().A0A;
            if (!(id == -1 || behavior == null || (A0F2 = behavior.A0F(childAt, this)) == null)) {
                sparseArray.append(id, A0F2);
            }
        }
        absSavedState.A00 = sparseArray;
        return absSavedState;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A06 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A06.setState(getDrawableState());
                }
                this.A06.setLayoutDirection(getLayoutDirection());
                Drawable drawable4 = this.A06;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A06.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public static final 2dP A02(View view) {
        2dP layoutParams = view.getLayoutParams();
        if (!layoutParams.A0B) {
            if (view instanceof AnonymousClass3MO) {
                layoutParams.A00(new AppBarLayout.Behavior());
            } else {
                Class cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            layoutParams.A00((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception e) {
                            Log.e("CoordinatorLayout", 002.A0g("Default behavior class ", defaultBehavior.value().getName(), " could not be instantiated. Did you forget a default constructor?"), e);
                        }
                    }
                }
            }
            layoutParams.A0B = true;
        }
        return layoutParams;
    }

    private void A05() {
        if (getFitsSystemWindows()) {
            AnonymousClass03Q r0 = this.A09;
            if (r0 == null) {
                r0 = new AnonymousClass6WC(this);
                this.A09 = r0;
            }
            AnonymousClass03j.A00(this, r0);
            setSystemUiVisibility(1280);
            return;
        }
        AnonymousClass03j.A00(this, (AnonymousClass03Q) null);
    }

    public static void A06(Rect rect) {
        rect.setEmpty();
        A0M.ECR(rect);
    }

    private void A08(Rect rect, 2dP r7, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + r7.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - r7.rightMargin));
        int max2 = Math.max(getPaddingTop() + r7.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - r7.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public static void A09(View view, int i) {
        2dP layoutParams = view.getLayoutParams();
        int i2 = layoutParams.A07;
        if (i2 != i) {
            view.offsetTopAndBottom(i - i2);
            layoutParams.A07 = i;
        }
    }

    private boolean A0A(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.A0F;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Collections.sort(list, A0K);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            Behavior behavior = view.getLayoutParams().A0A;
            if (!z) {
                if (behavior != null) {
                    if (i != 0) {
                        z = behavior.A0M(motionEvent, view, this);
                    } else {
                        z = behavior.A0L(motionEvent, view, this);
                    }
                    if (z) {
                        this.A07 = view;
                        if (!(actionMasked == 3 || actionMasked == 1)) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                View view2 = (View) list.get(i5);
                                Behavior behavior2 = view2.getLayoutParams().A0A;
                                if (behavior2 != null) {
                                    if (motionEvent2 == null) {
                                        motionEvent2 = MotionEvent.obtain(motionEvent);
                                        motionEvent2.setAction(3);
                                    }
                                    if (i != 0) {
                                        behavior2.A0M(motionEvent2, view2, this);
                                    } else {
                                        behavior2.A0L(motionEvent2, view2, this);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (!(actionMasked == 0 || behavior == null)) {
                if (motionEvent2 == null) {
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    motionEvent2.setAction(3);
                }
                if (i != 0) {
                    behavior.A0M(motionEvent2, view, this);
                } else {
                    behavior.A0L(motionEvent2, view, this);
                }
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    public final void A0E(View view, int i) {
        2dP layoutParams = view.getLayoutParams();
        View view2 = layoutParams.A09;
        int i2 = i;
        if (view2 != null) {
            Rect A012 = A01();
            Rect A013 = A01();
            try {
                C324116yf.A01(A012, view2, this);
                2dP layoutParams2 = view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A07(A012, A013, layoutParams2, i2, measuredWidth, measuredHeight);
                A08(A013, layoutParams2, measuredWidth, measuredHeight);
                view.layout(A013.left, A013.top, A013.right, A013.bottom);
            } finally {
                A06(A012);
                A06(A013);
            }
        } else if (layoutParams.A05 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else {
            int i3 = layoutParams.A04;
            if (i3 >= 0) {
                2dP layoutParams3 = view.getLayoutParams();
                int i4 = layoutParams3.A02;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int A002 = A00(i3) - measuredWidth2;
                int i7 = 0;
                if (i5 == 1) {
                    A002 += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    A002 += measuredWidth2;
                }
                if (i6 == 16) {
                    i7 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i7 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + layoutParams3.leftMargin, Math.min(A002, ((width - getPaddingRight()) - measuredWidth2) - layoutParams3.rightMargin));
                int max2 = Math.max(getPaddingTop() + layoutParams3.topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - layoutParams3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            2dP layoutParams4 = view.getLayoutParams();
            Rect A014 = A01();
            A014.set(getPaddingLeft() + layoutParams4.leftMargin, getPaddingTop() + layoutParams4.topMargin, (getWidth() - getPaddingRight()) - layoutParams4.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams4.bottomMargin);
            if (this.A02 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A014.left += this.A02.A00.A03().A01;
                A014.top += this.A02.A00.A03().A03;
                A014.right -= this.A02.A00.A03().A02;
                A014.bottom -= this.A02.A02();
            }
            Rect A015 = A01();
            int i8 = layoutParams4.A02;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), A014, A015, i2);
            view.layout(A015.left, A015.top, A015.right, A015.bottom);
            A06(A014);
            A06(A015);
        }
    }

    public final boolean A0G(View view, int i, int i2) {
        Rect A012 = A01();
        C324116yf.A01(A012, view, this);
        try {
            return A012.contains(i, i2);
        } finally {
            A06(A012);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List getDependencySortedChildren() {
        A03();
        return Collections.unmodifiableList(this.A0E);
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1150113293);
        super.onAttachedToWindow();
        A04();
        if (this.A05) {
            if (this.A01 == null) {
                this.A01 = new C324086yc(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A01);
        }
        if (this.A02 == null && getFitsSystemWindows()) {
            requestApplyInsets();
        }
        this.A04 = true;
        AnonymousClass0fD.A0D(-1230308864, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-2145637674);
        super.onDetachedFromWindow();
        A04();
        if (this.A05 && this.A01 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A01);
        }
        View view = this.A08;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A04 = false;
        AnonymousClass0fD.A0D(-1487264345, A062);
    }

    public final void onDraw(Canvas canvas) {
        04k r0;
        int i;
        super.onDraw(canvas);
        if (this.A03 && this.A06 != null && (r0 = this.A02) != null && (i = r0.A00.A03().A03) > 0) {
            this.A06.setBounds(0, 0, getWidth(), i);
            this.A06.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A04();
        }
        boolean A0A2 = A0A(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        return A0A2;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        List list = this.A0E;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((behavior = view.getLayoutParams().A0A) == null || !behavior.A0Q(view, this, layoutDirection))) {
                A0E(view, layoutDirection);
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean A0A2;
        int A052 = AnonymousClass0fD.A05(1710293130);
        int actionMasked = motionEvent.getActionMasked();
        View view = this.A07;
        boolean z = false;
        if (view != null) {
            Behavior behavior = view.getLayoutParams().A0A;
            A0A2 = behavior != null ? behavior.A0M(motionEvent, this.A07, this) : false;
        } else {
            A0A2 = A0A(motionEvent, 1);
            if (actionMasked != 0 && A0A2) {
                z = true;
            }
        }
        if (this.A07 == null || actionMasked == 3) {
            A0A2 |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        AnonymousClass0fD.A0C(-1448077126, A052);
        return A0A2;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = view.getLayoutParams().A0A;
        if (behavior == null || !behavior.A0B(rect, view, this, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.A0A) {
            if (this.A07 == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    Behavior behavior = childAt.getLayoutParams().A0A;
                    if (behavior != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        behavior.A0L(motionEvent, childAt, this);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            A04();
            this.A0A = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isVisible() != z) {
            this.A06.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A06) {
            return true;
        }
        return false;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A00 = onHierarchyChangeListener;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.03P] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoordinatorLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r6 = r16
            r3 = r17
            r5 = r18
            r14 = r19
            r6.<init>(r3, r5, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0E = r0
            X.2cx r0 = new X.2cx
            r0.<init>()
            r6.A0C = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0F = r0
            r1 = 2
            int[] r0 = new int[r1]
            r6.A0G = r0
            int[] r0 = new int[r1]
            r6.A0H = r0
            X.03P r0 = new X.03P
            r0.<init>()
            r6.A0D = r0
            r8 = 0
            int[] r7 = X.AnonymousClass2cy.A00
            if (r19 != 0) goto L_0x0064
            r9 = 2132018582(0x7f140596, float:1.9675475E38)
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r5, r7, r8, r9)
            X.03v.A06(r3, r4, r5, r6, r7, r8, r9)
        L_0x003f:
            int r0 = r4.getResourceId(r8, r8)
            if (r0 == 0) goto L_0x0072
            android.content.res.Resources r1 = r3.getResources()
            int[] r0 = r1.getIntArray(r0)
            r6.A0B = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r3 = r0.density
            int[] r2 = r6.A0B
            int r1 = r2.length
        L_0x0058:
            if (r8 >= r1) goto L_0x0072
            r0 = r2[r8]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r2[r8] = r0
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0064:
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r5, r7, r14, r8)
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r8
            X.03v.A06(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x003f
        L_0x0072:
            r1 = 1
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r1)
            r6.A06 = r0
            r4.recycle()
            r6.A05()
            X.2cz r0 = new X.2cz
            r0.<init>(r6)
            super.setOnHierarchyChangeListener(r0)
            int r0 = r6.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0090
            r6.setImportantForAccessibility(r1)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new 2dP(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }
}
