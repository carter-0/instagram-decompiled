package com.google.android.material.bottomsheet;

import X.03v;
import X.04x;
import X.2dP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C14161Tqz;
import X.C14751U7i;
import X.C16743V4a;
import X.C18941WDu;
import X.C20287Woc;
import X.C20323WpI;
import X.C297865sU;
import X.C297875sV;
import X.C297895sX;
import X.C309286Xr;
import X.C66579MXk;
import X.C66580MXl;
import X.DbW;
import X.JTQ;
import X.JTR;
import X.Pxg;
import X.V4O;
import X.W3p;
import X.W4Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends CoordinatorLayout.Behavior {
    public float A00 = -1.0f;
    public float A01 = 0.5f;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F = 0;
    public int A0G = 4;
    public ValueAnimator A0H;
    public VelocityTracker A0I;
    public W3p A0J;
    public C297875sV A0K;
    public WeakReference A0L;
    public WeakReference A0M;
    public boolean A0N = true;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public int A0Y = -1;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public C20323WpI A0d = null;
    public C297895sX A0e;
    public Map A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final ArrayList A0l = new ArrayList();
    public final C16743V4a A0m = new C14751U7i(this);

    private void A02(int i) {
        boolean A1S;
        ValueAnimator valueAnimator;
        if (i != 2 && this.A0h != (A1S = AnonymousClass7TF.A1S(i, 3))) {
            this.A0h = A1S;
            if (this.A0K != null && (valueAnimator = this.A0H) != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                float f = 1.0f;
                if (A1S) {
                    f = 0.0f;
                }
                valueAnimator.setFloatValues(new float[]{1.0f - f, f});
                valueAnimator.start();
            }
        }
    }

    public final void A0G() {
        this.A0M = null;
        this.A0J = null;
    }

    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
    }

    public final void A0K(2dP r2) {
        this.A0M = null;
        this.A0J = null;
    }

    public final boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A0a = 0;
        this.A0i = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(android.view.View r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int[] r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L_0x0031
            java.lang.ref.WeakReference r0 = r5.A0L
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r0.get()
        L_0x000b:
            if (r7 != r0) goto L_0x0031
            int r4 = r6.getTop()
            int r3 = r4 - r11
            if (r11 <= 0) goto L_0x0032
            int r0 = r5.A0R()
            if (r3 >= r0) goto L_0x004b
            int r4 = r4 - r0
            r9[r2] = r4
            int r0 = -r4
            r6.offsetTopAndBottom(r0)
            r0 = 3
        L_0x0023:
            r5.A0X(r0)
        L_0x0026:
            int r0 = r6.getTop()
            r5.A0U(r0)
            r5.A0a = r11
            r5.A0i = r2
        L_0x0031:
            return
        L_0x0032:
            if (r11 >= 0) goto L_0x0026
            boolean r0 = X.JTP.A1Y(r7)
            if (r0 != 0) goto L_0x0026
            int r1 = r5.A04
            if (r3 <= r1) goto L_0x004b
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x004b
            int r4 = r4 - r1
            r9[r2] = r4
            int r0 = -r4
            r6.offsetTopAndBottom(r0)
            r0 = 4
            goto L_0x0023
        L_0x004b:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0031
            r9[r2] = r11
            int r0 = -r11
            r6.offsetTopAndBottom(r0)
            r5.A0X(r2)
            goto L_0x0026
        L_0x0059:
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0P(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public final void A0T(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.A01 = f;
        if (this.A0M != null) {
            this.A08 = (int) (((float) this.A0C) * (1.0f - f));
        }
    }

    public final void A0V(int i) {
        View view;
        boolean z = this.A0U;
        if (i == -1) {
            if (!z) {
                this.A0U = true;
            } else {
                return;
            }
        } else if (z || this.A0E != i) {
            this.A0U = false;
            this.A0E = Math.max(0, i);
        } else {
            return;
        }
        WeakReference weakReference = this.A0M;
        if (weakReference != null) {
            A04(this);
            if (this.A0G == 4 && (view = (View) weakReference.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void A0Y(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.A04;
        } else if (i == 6) {
            int i3 = this.A08;
            if (!this.A0O || i3 > (i2 = this.A06)) {
                i2 = i3;
            } else {
                i = 3;
            }
        } else if (i == 3) {
            i2 = A0R();
        } else if (!this.A0Q || i != 5) {
            throw DbW.A0a("Illegal state argument: ", i);
        } else {
            i2 = this.A0C;
        }
        A0Z(view, i, i2, false);
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(6);
        public int A00;
        public boolean A01;
        public boolean A02;
        public boolean A03;
        public final int A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A04 = parcel.readInt();
            this.A00 = parcel.readInt();
            this.A01 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
            this.A02 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
            this.A03 = Pxg.A1V(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            BottomSheetBehavior.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A03 ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.A04 = bottomSheetBehavior.A0G;
            this.A00 = bottomSheetBehavior.A0E;
            this.A01 = bottomSheetBehavior.A0O;
            this.A02 = bottomSheetBehavior.A0Q;
            this.A03 = bottomSheetBehavior.A0V;
        }
    }

    private int A00() {
        int i;
        int i2;
        if (this.A0U) {
            i = Math.min(C13988Tno.A07(this.A0C, (this.A0D * 9) / 16, this.A0c), this.A0X);
        } else if (!this.A0P && !this.A0R && (i2 = this.A07) > 0) {
            return Math.max(this.A0E, i2 + this.A0b);
        } else {
            i = this.A0E;
        }
        return i + this.A09;
    }

    private void A03(Context context, ColorStateList colorStateList, AttributeSet attributeSet, boolean z) {
        if (this.A0k) {
            C297895sX r1 = new C297895sX(C297895sX.A01(context, attributeSet, R.attr.bottomSheetStyle, 2132018486));
            this.A0e = r1;
            C297875sV r0 = new C297875sV(r1);
            this.A0K = r0;
            r0.A0E(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A0K.setTint(typedValue.data);
                return;
            }
            this.A0K.A0F(colorStateList);
        }
    }

    public static void A05(BottomSheetBehavior bottomSheetBehavior) {
        View view;
        04x r1;
        C18941WDu wDu;
        int i;
        WeakReference weakReference = bottomSheetBehavior.A0M;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            03v.A09(view, Constants.LOAD_RESULT_WITH_VDEX_ODEX);
            03v.A09(view, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
            03v.A09(view, Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            int i2 = bottomSheetBehavior.A0Y;
            if (i2 != -1) {
                03v.A09(view, i2);
            }
            int i3 = 6;
            if (!bottomSheetBehavior.A0O && bottomSheetBehavior.A0G != 6) {
                String string = view.getResources().getString(2131954076);
                C18941WDu wDu2 = new C18941WDu(bottomSheetBehavior, 6);
                AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_accessibility_actions);
                if (abstractList == null) {
                    abstractList = new ArrayList();
                    view.setTag(R.id.tag_accessibility_actions, abstractList);
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= abstractList.size()) {
                        int i5 = 0;
                        i = -1;
                        while (true) {
                            int[] iArr = 03v.A04;
                            if (i5 >= 32 || i != -1) {
                                break;
                            }
                            int i6 = iArr[i5];
                            boolean z = true;
                            for (int i7 = 0; i7 < abstractList.size(); i7++) {
                                z &= JTQ.A1O(((04x) abstractList.get(i7)).A00(), i6);
                            }
                            if (z) {
                                i = i6;
                            }
                            i5++;
                        }
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((04x) abstractList.get(i4)).A03).getLabel())) {
                        i = ((04x) abstractList.get(i4)).A00();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    03v.A0D(view, new 04x(wDu2, string, (Class) null, (Object) null, i));
                }
                bottomSheetBehavior.A0Y = i;
            }
            if (bottomSheetBehavior.A0Q && bottomSheetBehavior.A0G != 5) {
                03v.A0E(view, 04x.A0D, new C18941WDu(bottomSheetBehavior, 5));
            }
            int i8 = bottomSheetBehavior.A0G;
            if (i8 == 3) {
                if (bottomSheetBehavior.A0O) {
                    i3 = 4;
                }
                r1 = 04x.A09;
                wDu = new C18941WDu(bottomSheetBehavior, i3);
            } else if (i8 == 4) {
                if (bottomSheetBehavior.A0O) {
                    i3 = 3;
                }
                r1 = 04x.A0H;
                wDu = new C18941WDu(bottomSheetBehavior, i3);
            } else if (i8 == 6) {
                03v.A0E(view, 04x.A09, new C18941WDu(bottomSheetBehavior, 4));
                r1 = 04x.A0H;
                wDu = new C18941WDu(bottomSheetBehavior, 3);
            } else {
                return;
            }
            03v.A0E(view, r1, wDu);
        }
    }

    private void A06(boolean z) {
        WeakReference weakReference = this.A0M;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                if (z) {
                    if (this.A0f == null) {
                        this.A0f = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this.A0M.get() && z) {
                        C66580MXl.A1T(childAt, this.A0f, childAt.getImportantForAccessibility());
                    }
                }
                if (!z) {
                    this.A0f = null;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState] */
    public final Parcelable A0F(View view, CoordinatorLayout coordinatorLayout) {
        return new SavedState((Parcelable) android.view.AbsSavedState.EMPTY_STATE, this);
    }

    public final void A0H(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.A0F;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0E = savedState.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0O = savedState.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0Q = savedState.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0V = savedState.A03;
            }
        }
        int i2 = savedState.A04;
        if (i2 == 1 || i2 == 2) {
            this.A0G = 4;
        } else {
            this.A0G = i2;
        }
    }

    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        WeakReference weakReference = this.A0L;
        if (weakReference == null || view2 != weakReference.get() || this.A0G == 3) {
            return false;
        }
        return true;
    }

    public final int A0R() {
        int i;
        if (this.A0O) {
            return this.A06;
        }
        int i2 = this.A05;
        if (this.A0j) {
            i = 0;
        } else {
            i = this.A0A;
        }
        return Math.max(i2, i);
    }

    public final void A0U(int i) {
        float f;
        int i2;
        int A0R2;
        View view = (View) this.A0M.get();
        if (view != null) {
            ArrayList arrayList = this.A0l;
            if (!arrayList.isEmpty()) {
                int i3 = this.A04;
                if (i > i3 || i3 == (A0R2 = A0R())) {
                    f = (float) (i3 - i);
                    i2 = this.A0C - i3;
                } else {
                    f = (float) (i3 - i);
                    i2 = i3 - A0R2;
                }
                float f2 = f / ((float) i2);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((V4O) arrayList.get(i4)).A01(view, f2);
                }
            }
        }
    }

    public final void A0W(int i) {
        if (i != this.A0G) {
            WeakReference weakReference = this.A0M;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow()) {
                        A0Y(view, i);
                    } else {
                        view.post(new C20287Woc(view, this, i));
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.A0Q && i == 5)) {
                this.A0G = i;
            }
        }
    }

    public final void A0X(int i) {
        View view;
        if (this.A0G != i) {
            this.A0G = i;
            WeakReference weakReference = this.A0M;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i2 = 0;
                if (i == 3) {
                    A06(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    A06(false);
                }
                A02(i);
                while (true) {
                    ArrayList arrayList = this.A0l;
                    if (i2 < arrayList.size()) {
                        ((V4O) arrayList.get(i2)).A02(view, i);
                        i2++;
                    } else {
                        A05(this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r2.A0J(r1, r6) != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z(android.view.View r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            X.W3p r2 = r3.A0J
            if (r2 == 0) goto L_0x0048
            int r1 = r4.getLeft()
            if (r7 == 0) goto L_0x0031
            boolean r0 = r2.A0J(r1, r6)
            if (r0 == 0) goto L_0x0048
        L_0x0010:
            r0 = 2
            r3.A0X(r0)
            r3.A02(r5)
            X.WpI r1 = r3.A0d
            if (r1 != 0) goto L_0x0022
            X.WpI r1 = new X.WpI
            r1.<init>(r4, r3, r5)
            r3.A0d = r1
        L_0x0022:
            boolean r0 = r1.A01
            r1.A00 = r5
            if (r0 != 0) goto L_0x0030
            r4.postOnAnimation(r1)
            X.WpI r1 = r3.A0d
            r0 = 1
            r1.A01 = r0
        L_0x0030:
            return
        L_0x0031:
            r2.A08 = r4
            r0 = -1
            r2.A02 = r0
            r0 = 0
            boolean r0 = X.W3p.A0B(r2, r1, r6, r0, r0)
            if (r0 != 0) goto L_0x0010
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0048
            android.view.View r0 = r2.A08
            if (r0 == 0) goto L_0x0048
            r0 = 0
            r2.A08 = r0
        L_0x0048:
            r3.A0X(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0Z(android.view.View, int, int, boolean):void");
    }

    public final void A0a(V4O v4o) {
        JTR.A1S(v4o, this.A0l);
    }

    public final void A0b(boolean z) {
        if (this.A0Q != z) {
            this.A0Q = z;
            if (!z && this.A0G == 5) {
                A0W(4);
            }
            A05(this);
        }
    }

    public final boolean A0c(View view, float f) {
        if (this.A0V) {
            return true;
        }
        if (view.getTop() < this.A04) {
            return false;
        }
        if (AnonymousClass7TE.A00(((float) view.getTop()) + (f * 0.1f), (float) this.A04) / ((float) A00()) <= 0.5f) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i;
        this.A0b = JTR.A04(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A04);
        this.A0k = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            A03(context, C309286Xr.A01(context, obtainStyledAttributes, 2), attributeSet, hasValue);
        } else {
            A03(context, (ColorStateList) null, attributeSet, false);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0H = ofFloat;
        ofFloat.setDuration(500);
        W4Q.A00(this.A0H, this, 3);
        this.A00 = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || peekValue.data != -1) {
            A0V(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            A0V(-1);
        }
        A0b(obtainStyledAttributes.getBoolean(7, false));
        this.A0P = obtainStyledAttributes.getBoolean(11, false);
        boolean z = obtainStyledAttributes.getBoolean(5, true);
        if (this.A0O != z) {
            this.A0O = z;
            if (this.A0M != null) {
                A04(this);
            }
            if (!z || this.A0G != 6) {
                i = this.A0G;
            } else {
                i = 3;
            }
            A0X(i);
            A05(this);
        }
        this.A0V = obtainStyledAttributes.getBoolean(10, false);
        this.A0N = obtainStyledAttributes.getBoolean(3, true);
        this.A0F = obtainStyledAttributes.getInt(9, 0);
        A0T(obtainStyledAttributes.getFloat(6, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        } else {
            dimensionPixelOffset = peekValue2.data;
        }
        if (dimensionPixelOffset >= 0) {
            this.A05 = dimensionPixelOffset;
            this.A0R = obtainStyledAttributes.getBoolean(12, false);
            this.A0S = obtainStyledAttributes.getBoolean(13, false);
            this.A0T = obtainStyledAttributes.getBoolean(14, false);
            this.A0j = obtainStyledAttributes.getBoolean(15, true);
            obtainStyledAttributes.recycle();
            this.A02 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public static BottomSheetBehavior A01(View view) {
        2dP layoutParams = view.getLayoutParams();
        if (layoutParams instanceof 2dP) {
            CoordinatorLayout.Behavior behavior = layoutParams.A0A;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException(C66579MXk.A00(253));
    }

    public static void A04(BottomSheetBehavior bottomSheetBehavior) {
        int A002 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0O;
        int i = bottomSheetBehavior.A0C - A002;
        if (z) {
            bottomSheetBehavior.A04 = Math.max(i, bottomSheetBehavior.A06);
        } else {
            bottomSheetBehavior.A04 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r1 >= X.C13988Tno.A06(r4, r2)) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r1 >= X.C13988Tno.A06(r0, r2)) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (r0 > r3) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r4 < X.C13988Tno.A06(r4, r6.A04)) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        r3 = A0R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        if (r1 < X.C13988Tno.A06(r4, r2)) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(android.view.View r7, android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9, int r10) {
        /*
            r6 = this;
            int r1 = r7.getTop()
            int r0 = r6.A0R()
            r5 = 3
            if (r1 != r0) goto L_0x000f
            r6.A0X(r5)
        L_0x000e:
            return
        L_0x000f:
            java.lang.ref.WeakReference r0 = r6.A0L
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            if (r8 != r0) goto L_0x000e
            boolean r0 = r6.A0i
            if (r0 == 0) goto L_0x000e
            int r0 = r6.A0a
            if (r0 <= 0) goto L_0x002e
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x0088
            int r3 = r6.A06
        L_0x0027:
            r0 = 0
            r6.A0Z(r7, r5, r3, r0)
            r6.A0i = r0
            return
        L_0x002e:
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x0051
            android.view.VelocityTracker r2 = r6.A0I
            if (r2 != 0) goto L_0x0041
            r0 = 0
        L_0x0037:
            boolean r0 = r6.A0c(r7, r0)
            if (r0 == 0) goto L_0x0051
            int r3 = r6.A0C
            r5 = 5
            goto L_0x0027
        L_0x0041:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r6.A02
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r6.A0I
            int r0 = r6.A03
            float r0 = r1.getYVelocity(r0)
            goto L_0x0037
        L_0x0051:
            int r0 = r6.A0a
            if (r0 != 0) goto L_0x006e
            int r4 = r7.getTop()
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x0092
            int r3 = r6.A06
            int r1 = X.C13988Tno.A06(r4, r3)
            int r2 = r6.A04
            int r0 = X.C13988Tno.A06(r4, r2)
            if (r1 < r0) goto L_0x0027
        L_0x006b:
            r3 = r2
        L_0x006c:
            r5 = 4
            goto L_0x0027
        L_0x006e:
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x0075
            int r3 = r6.A04
            goto L_0x006c
        L_0x0075:
            int r0 = r7.getTop()
            int r3 = r6.A08
            int r1 = X.C13988Tno.A06(r0, r3)
            int r2 = r6.A04
            int r0 = X.C13988Tno.A06(r0, r2)
            if (r1 < r0) goto L_0x0090
            goto L_0x006b
        L_0x0088:
            int r0 = r7.getTop()
            int r3 = r6.A08
            if (r0 <= r3) goto L_0x009e
        L_0x0090:
            r5 = 6
            goto L_0x0027
        L_0x0092:
            int r3 = r6.A08
            if (r4 >= r3) goto L_0x00a3
            int r0 = r6.A04
            int r0 = X.C13988Tno.A06(r4, r0)
            if (r4 >= r0) goto L_0x0090
        L_0x009e:
            int r3 = r6.A0R()
            goto L_0x0027
        L_0x00a3:
            int r1 = X.C13988Tno.A06(r4, r3)
            int r2 = r6.A04
            int r0 = X.C13988Tno.A06(r4, r2)
            if (r1 >= r0) goto L_0x006b
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0I(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r12.A0G(r11, r1, r9.A0Z) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0L(android.view.MotionEvent r10, android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x00cf
            int r6 = r10.getActionMasked()
            if (r6 != 0) goto L_0x001f
            r0 = -1
            r9.A03 = r0
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 == 0) goto L_0x001f
            r0.recycle()
            r0 = 0
            r9.A0I = r0
        L_0x001f:
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0I = r0
        L_0x0029:
            r0.addMovement(r10)
            r3 = 0
            r7 = -1
            r5 = 2
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0045
            r0 = 3
            if (r6 == r0) goto L_0x0045
        L_0x0036:
            boolean r0 = r9.A0g
            if (r0 != 0) goto L_0x008f
            X.W3p r0 = r9.A0J
            if (r0 == 0) goto L_0x008f
            boolean r0 = r0.A0K(r10)
            if (r0 == 0) goto L_0x008f
            return r4
        L_0x0045:
            r9.A0W = r2
            r9.A03 = r7
            boolean r0 = r9.A0g
            if (r0 == 0) goto L_0x0036
            r9.A0g = r2
            return r2
        L_0x0050:
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r8 = (int) r0
            r9.A0Z = r8
            int r0 = r9.A0G
            if (r0 == r5) goto L_0x007e
            java.lang.ref.WeakReference r0 = r9.A0L
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r12.A0G(r0, r1, r8)
            if (r0 == 0) goto L_0x007e
            int r0 = r10.getActionIndex()
            int r0 = r10.getPointerId(r0)
            r9.A03 = r0
            r9.A0W = r4
        L_0x007e:
            int r0 = r9.A03
            if (r0 != r7) goto L_0x008b
            int r0 = r9.A0Z
            boolean r1 = r12.A0G(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r9.A0g = r0
            goto L_0x0036
        L_0x008f:
            java.lang.ref.WeakReference r0 = r9.A0L
            if (r0 == 0) goto L_0x0099
            java.lang.Object r3 = r0.get()
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r6 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r0 = r9.A0g
            if (r0 != 0) goto L_0x00d1
            int r0 = r9.A0G
            if (r0 == r4) goto L_0x00d1
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r12.A0G(r3, r1, r0)
            if (r0 != 0) goto L_0x00d1
            X.W3p r0 = r9.A0J
            if (r0 == 0) goto L_0x00d1
            int r0 = r9.A0Z
            float r1 = (float) r0
            float r0 = r10.getY()
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            X.W3p r0 = r9.A0J
            int r0 = r0.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            r2 = 1
            return r2
        L_0x00cf:
            r9.A0g = r4
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0G == 1 && actionMasked == 0) {
            return true;
        }
        W3p w3p = this.A0J;
        if (w3p != null) {
            w3p.A0G(motionEvent);
        }
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A0I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0I = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0I;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0I = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0J != null && actionMasked == 2 && !this.A0g) {
            float A002 = AnonymousClass7TE.A00((float) this.A0Z, motionEvent.getY());
            W3p w3p2 = this.A0J;
            if (A002 > ((float) w3p2.A06)) {
                w3p2.A0H(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0g;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.V3e] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r8.A0U != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Q(android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r10.getFitsSystemWindows()
            r5 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r9.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0010
            r9.setFitsSystemWindows(r5)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r8.A0M
            r6 = 3
            r7 = 0
            if (r0 != 0) goto L_0x009d
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A0c = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0032
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.A0U
            r1 = 1
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r0 = r8.A0R
            if (r0 != 0) goto L_0x0123
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x0123
            boolean r0 = r8.A0T
            if (r0 != 0) goto L_0x0123
            if (r1 != 0) goto L_0x0123
        L_0x0041:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r8.A0M = r0
            boolean r0 = r8.A0k
            if (r0 == 0) goto L_0x0053
            X.5sV r0 = r8.A0K
            if (r0 == 0) goto L_0x0053
            r9.setBackground(r0)
        L_0x0053:
            X.5sV r2 = r8.A0K
            if (r2 == 0) goto L_0x0078
            float r0 = r8.A00
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            float r0 = r9.getElevation()
        L_0x0063:
            r2.A0A(r0)
            int r0 = r8.A0G
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r6)
            r8.A0h = r2
            X.5sV r1 = r8.A0K
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0075
            r0 = 0
        L_0x0075:
            r1.A0B(r0)
        L_0x0078:
            A05(r8)
            int r0 = r9.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0084
            r9.setImportantForAccessibility(r5)
        L_0x0084:
            int r0 = r9.getMeasuredWidth()
            int r2 = r8.A0B
            if (r0 <= r2) goto L_0x009d
            r0 = -1
            if (r2 == r0) goto L_0x009d
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            r1.width = r2
            X.Wob r0 = new X.Wob
            r0.<init>(r9, r1, r8)
            r9.post(r0)
        L_0x009d:
            X.W3p r0 = r8.A0J
            if (r0 != 0) goto L_0x00ae
            X.V4a r2 = r8.A0m
            android.content.Context r1 = r10.getContext()
            X.W3p r0 = new X.W3p
            r0.<init>(r1, r10, r2)
            r8.A0J = r0
        L_0x00ae:
            int r4 = r9.getTop()
            r10.A0E(r9, r11)
            int r0 = r10.getWidth()
            r8.A0D = r0
            int r0 = r10.getHeight()
            r8.A0C = r0
            int r2 = r9.getHeight()
            r8.A0X = r2
            int r3 = r8.A0C
            int r0 = r3 - r2
            int r1 = r8.A0A
            if (r0 >= r1) goto L_0x00d6
            boolean r0 = r8.A0j
            if (r0 == 0) goto L_0x011e
            r8.A0X = r3
            r2 = r3
        L_0x00d6:
            int r0 = X.C13988Tno.A07(r3, r2, r7)
            r8.A06 = r0
            float r2 = (float) r3
            float r1 = r8.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r2 = r2 * r0
            int r2 = (int) r2
            r8.A08 = r2
            A04(r8)
            int r1 = r8.A0G
            if (r1 != r6) goto L_0x0100
            int r2 = r8.A0R()
        L_0x00f1:
            r9.offsetTopAndBottom(r2)
        L_0x00f4:
            android.view.View r1 = r8.A0S(r9)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r8.A0L = r0
            return r5
        L_0x0100:
            r0 = 6
            if (r1 == r0) goto L_0x00f1
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x010c
            r0 = 5
            if (r1 != r0) goto L_0x010c
            r2 = r3
            goto L_0x00f1
        L_0x010c:
            r0 = 4
            if (r1 != r0) goto L_0x0112
            int r2 = r8.A04
            goto L_0x00f1
        L_0x0112:
            if (r1 == r5) goto L_0x0117
            r0 = 2
            if (r1 != r0) goto L_0x00f4
        L_0x0117:
            int r0 = r9.getTop()
            int r2 = r4 - r0
            goto L_0x00f1
        L_0x011e:
            int r2 = r3 - r1
            r8.A0X = r2
            goto L_0x00d6
        L_0x0123:
            X.Or6 r4 = new X.Or6
            r4.<init>(r8, r1)
            int r3 = r9.getPaddingStart()
            r9.getPaddingTop()
            int r2 = r9.getPaddingEnd()
            int r0 = r9.getPaddingBottom()
            X.V3e r1 = new X.V3e
            r1.<init>()
            r1.A02 = r3
            r1.A01 = r2
            r1.A00 = r0
            X.Olf r0 = new X.Olf
            r0.<init>(r7, r4, r1)
            X.AnonymousClass03j.A00(r9, r0)
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L_0x0155
            r9.requestApplyInsets()
            goto L_0x0041
        L_0x0155:
            X.W8I r0 = new X.W8I
            r0.<init>()
            r9.addOnAttachStateChangeListener(r0)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0Q(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public final View A0S(View view) {
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A0S2 = A0S(viewGroup.getChildAt(i));
                if (A0S2 != null) {
                    return A0S2;
                }
            }
        }
        return null;
    }

    public BottomSheetBehavior() {
    }
}
