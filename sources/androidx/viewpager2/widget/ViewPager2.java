package androidx.viewpager2.widget;

import X.01c;
import X.03v;
import X.2Rw;
import X.AnonymousClass3AS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C14050Toy;
import X.C14051Toz;
import X.C14052Tp0;
import X.C14053Tp1;
import X.C14054Tp2;
import X.C14055Tp3;
import X.C14056Tp4;
import X.C14057Tp5;
import X.C14058Tp6;
import X.C14069TpI;
import X.C14072TpM;
import X.C14161Tqz;
import X.C14191TrW;
import X.C19913Whi;
import X.C20119Wlf;
import X.C228422le;
import X.C231402rc;
import X.C252553pI;
import X.C51968G9o;
import X.C60731JqK;
import X.C66899Meh;
import X.DbW;
import X.GD1;
import X.JTP;
import X.Pxf;
import X.UFV;
import X.VUM;
import X.WE6;
import X.X0G;
import X.X21;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.List;

public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01 = -1;
    public LinearLayoutManager A02;
    public C231402rc A03 = new C14051Toz(this);
    public RecyclerView A04;
    public C14050Toy A05 = new C14050Toy();
    public GD1 A06;
    public C14058Tp6 A07;
    public C14056Tp4 A08;
    public C14052Tp0 A09;
    public boolean A0A = false;
    public boolean A0B = true;
    public int A0C = -1;
    public Parcelable A0D;
    public AnonymousClass3AS A0E = null;
    public C14050Toy A0F;
    public boolean A0G = false;
    public final Rect A0H = new Rect();
    public final Rect A0I = new Rect();
    public C228422le mPagerSnapHelper;

    public void setCurrentItem(int i) {
        A03(i, true);
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.A01 = i;
            this.A04.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(X21 x21) {
        boolean z = this.A0G;
        if (x21 != null) {
            if (!z) {
                this.A0E = this.A04.A0C;
                this.A0G = true;
            }
            this.A04.setItemAnimator((AnonymousClass3AS) null);
        } else if (z) {
            this.A04.setItemAnimator(this.A0E);
            this.A0E = null;
            this.A0G = false;
        }
        C14058Tp6 tp6 = this.A07;
        if (x21 != tp6.A00) {
            tp6.A00 = x21;
            if (x21 != null) {
                C14056Tp4 tp4 = this.A08;
                C14056Tp4.A01(tp4);
                VUM vum = tp4.A04;
                double d = ((double) vum.A02) + ((double) vum.A00);
                int i = (int) d;
                float f = (float) (d - ((double) i));
                this.A07.A02(i, f, AnonymousClass7TE.A05((float) getPageSize(), f));
            }
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(4);
        public int A00;
        public int A01;
        public Parcelable A02;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A02, i);
        }
    }

    private void A00() {
        X0G x0g;
        int length;
        int length2;
        if (this.A0C != -1 && (x0g = this.A04.A0A) != null) {
            Parcelable parcelable = this.A0D;
            if (parcelable != null) {
                if (x0g instanceof X0G) {
                    C14191TrW trW = (C14191TrW) x0g;
                    01c r8 = trW.A06;
                    if (r8.A00() == 0) {
                        01c r7 = trW.A04;
                        if (r7.A00() == 0) {
                            Bundle bundle = (Bundle) parcelable;
                            if (bundle.getClassLoader() == null) {
                                bundle.setClassLoader(Pxf.A0W(trW));
                            }
                            for (String next : bundle.keySet()) {
                                if (next.startsWith("f#") && next.length() > (length2 = "f#".length())) {
                                    r7.A09(Long.parseLong(next.substring(length2)), trW.A07.A0Q(bundle, next));
                                } else if (!next.startsWith("s#") || next.length() <= (length = "s#".length())) {
                                    throw AnonymousClass7TF.A0W("Unexpected key in savedState: ", next);
                                } else {
                                    long parseLong = Long.parseLong(next.substring(length));
                                    Parcelable parcelable2 = bundle.getParcelable(next);
                                    if (trW.A06(parseLong)) {
                                        r8.A09(parseLong, parcelable2);
                                    }
                                }
                            }
                            if (r7.A00() != 0) {
                                trW.A01 = true;
                                trW.A02 = true;
                                trW.A04();
                                Handler A0D2 = AnonymousClass7TF.A0D();
                                C19913Whi whi = new C19913Whi(trW);
                                trW.A08.A09(new WE6(A0D2, trW, whi));
                                A0D2.postDelayed(whi, 10000);
                            }
                        }
                    }
                    throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
                }
                this.A0D = null;
            }
            int max = Math.max(0, Math.min(this.A0C, x0g.getItemCount() - 1));
            this.A00 = max;
            this.A0C = -1;
            this.A04.A0o(max);
            this.A09.A00();
        }
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A09 = new C14052Tp0(this);
        C14053Tp1 tp1 = new C14053Tp1(context, this);
        this.A04 = tp1;
        JTP.A13(tp1);
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        C14054Tp2 tp2 = new C14054Tp2(context, this);
        this.A02 = tp2;
        this.A04.setLayoutManager(tp2);
        this.A04.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        C51968G9o.A1D(this.A04, -1);
        RecyclerView recyclerView = this.A04;
        C14055Tp3 tp3 = new C14055Tp3(this);
        List list = recyclerView.A0L;
        if (list == null) {
            list = new ArrayList();
            recyclerView.A0L = list;
        }
        list.add(tp3);
        C14056Tp4 tp4 = new C14056Tp4(this);
        this.A08 = tp4;
        RecyclerView recyclerView2 = this.A04;
        this.A06 = new GD1(recyclerView2, tp4, this);
        C66899Meh meh = new C66899Meh(this);
        this.mPagerSnapHelper = meh;
        meh.A07(recyclerView2);
        this.A04.A15(this.A08);
        C14050Toy toy = new C14050Toy();
        this.A0F = toy;
        this.A08.A05 = toy;
        C60731JqK jqK = new C60731JqK(this, 1);
        UFV ufv = new UFV(this, 0);
        toy.A00.add(jqK);
        this.A0F.A00.add(ufv);
        C14052Tp0 tp0 = this.A09;
        this.A04.setImportantForAccessibility(2);
        tp0.A00 = new C14057Tp5(tp0);
        ViewPager2 viewPager2 = tp0.A04;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
        C14050Toy toy2 = this.A0F;
        toy2.A00.add(this.A05);
        C14058Tp6 tp6 = new C14058Tp6(this.A02);
        this.A07 = tp6;
        this.A0F.A00.add(tp6);
        RecyclerView recyclerView3 = this.A04;
        attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
    }

    public final void A02() {
        C228422le r1 = this.mPagerSnapHelper;
        if (r1 != null) {
            View A032 = r1.A03(this.A02);
            if (A032 != null) {
                int A062 = C252553pI.A06(A032);
                if (A062 != this.A00 && this.A08.A02 == 0) {
                    this.A0F.A01(A062);
                }
                this.A0A = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void A03(int i, boolean z) {
        if (!this.A06.A06.A07) {
            A04(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void A04(int i, boolean z) {
        C14072TpM tpM;
        2Rw r2 = this.A04.A0A;
        if (r2 == null) {
            if (this.A0C != -1) {
                this.A0C = Math.max(i, 0);
            }
        } else if (r2.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), r2.getItemCount() - 1);
            int i2 = this.A00;
            if (min != i2 || this.A08.A02 != 0) {
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.A00 = min;
                    this.A09.A00();
                    C14056Tp4 tp4 = this.A08;
                    if (tp4.A02 != 0) {
                        C14056Tp4.A01(tp4);
                        VUM vum = tp4.A04;
                        d = ((double) vum.A02) + ((double) vum.A00);
                    }
                    C14056Tp4 tp42 = this.A08;
                    int i3 = 3;
                    if (z) {
                        i3 = 2;
                    }
                    tp42.A00 = i3;
                    boolean z2 = false;
                    tp42.A07 = false;
                    if (tp42.A03 != min) {
                        z2 = true;
                    }
                    tp42.A03 = min;
                    C14056Tp4.A02(tp42, 2);
                    if (z2 && (tpM = tp42.A05) != null) {
                        tpM.A01(min);
                    }
                    if (!z) {
                        this.A04.A0o(min);
                        return;
                    }
                    double d2 = (double) min;
                    int i4 = (Math.abs(d2 - d) > 3.0d ? 1 : (Math.abs(d2 - d) == 3.0d ? 0 : -1));
                    RecyclerView recyclerView = this.A04;
                    if (i4 > 0) {
                        int i5 = min + 3;
                        if (d2 > d) {
                            i5 = min - 3;
                        }
                        recyclerView.A0o(i5);
                        RecyclerView recyclerView2 = this.A04;
                        recyclerView2.post(new C20119Wlf(recyclerView2, min));
                        return;
                    }
                    recyclerView.A0p(min);
                }
            }
        }
    }

    public final void A05(C14072TpM tpM) {
        this.A05.A00.add(tpM);
    }

    public final boolean canScrollHorizontally(int i) {
        return this.A04.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.A04.canScrollVertically(i);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public 2Rw getAdapter() {
        return this.A04.A0A;
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getItemDecorationCount() {
        return this.A04.A12.size();
    }

    public int getOffscreenPageLimit() {
        return this.A01;
    }

    public int getOrientation() {
        if (this.A02.A01 != 1) {
            return 0;
        }
        return 1;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.A04;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A08.A02;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        Rect rect = this.A0I;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0H;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A04.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A0A) {
            A02();
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChild(this.A04, i, i2);
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        int measuredState = this.A04.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0C = savedState.A00;
        this.A0D = savedState.A02;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        C14052Tp0 tp0 = this.A09;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = tp0.A04;
        int i2 = viewPager2.A00;
        int i3 = i2 + 1;
        if (i == 8192) {
            i3 = i2 - 1;
        }
        if (!viewPager2.A0B) {
            return true;
        }
        viewPager2.A04(i3, true);
        return true;
    }

    public void setAdapter(2Rw r3) {
        2Rw r1 = this.A04.A0A;
        C14052Tp0 tp0 = this.A09;
        if (r1 != null) {
            r1.unregisterAdapterDataObserver(tp0.A00);
            r1.unregisterAdapterDataObserver(this.A03);
        }
        this.A04.setAdapter(r3);
        this.A00 = 0;
        A00();
        C14052Tp0 tp02 = this.A09;
        tp02.A00();
        if (r3 != null) {
            r3.registerAdapterDataObserver(tp02.A00);
            r3.registerAdapterDataObserver(this.A03);
        }
    }

    public void setOrientation(int i) {
        this.A02.A1o(i);
        this.A09.A00();
    }

    public void setUserInputEnabled(boolean z) {
        this.A0B = z;
        this.A09.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).A01;
            sparseArray.put(this.A04.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A00();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A09.A04;
        2Rw r1 = viewPager2.A04.A0A;
        int i2 = 1;
        if (r1 != null) {
            int orientation = viewPager2.getOrientation();
            i = r1.getItemCount();
            if (orientation == 1) {
                i2 = i;
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, 0));
        2Rw r0 = viewPager2.A04.A0A;
        if (r0 != null && (itemCount = r0.getItemCount()) != 0 && viewPager2.A0B) {
            if (viewPager2.A00 > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.A00 < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.viewpager2.widget.ViewPager2$SavedState] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r11 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.viewpager2.widget.ViewPager2$SavedState r8 = new androidx.viewpager2.widget.ViewPager2$SavedState
            r8.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A04
            int r0 = r0.getId()
            r8.A01 = r0
            int r1 = r11.A0C
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r11.A00
        L_0x0018:
            r8.A00 = r1
            android.os.Parcelable r5 = r11.A0D
            if (r5 != 0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r0 = r11.A04
            X.2Rw r7 = r0.A0A
            boolean r0 = r7 instanceof X.X0G
            if (r0 == 0) goto L_0x0088
            X.X0G r7 = (X.X0G) r7
            X.TrW r7 = (X.C14191TrW) r7
            X.01c r10 = r7.A04
            int r1 = r10.A00()
            X.01c r6 = r7.A06
            int r0 = r6.A00()
            int r1 = r1 + r0
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r1)
            r4 = 0
            r9 = 0
        L_0x003e:
            int r0 = r10.A00()
            if (r9 >= r0) goto L_0x0064
            long r0 = r10.A02(r9)
            java.lang.Object r3 = r10.A05(r0)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x0061
            boolean r2 = r3.isAdded()
            if (r2 == 0) goto L_0x0061
            java.lang.String r2 = "f#"
            java.lang.String r1 = X.002.A0Q(r2, r0)
            X.0hq r0 = r7.A07
            r0.A0g(r5, r3, r1)
        L_0x0061:
            int r9 = r9 + 1
            goto L_0x003e
        L_0x0064:
            int r0 = r6.A00()
            if (r4 >= r0) goto L_0x0086
            long r2 = r6.A02(r4)
            boolean r0 = r7.A06(r2)
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "s#"
            java.lang.String r1 = X.002.A0Q(r0, r2)
            java.lang.Object r0 = r6.A05(r2)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r5.putParcelable(r1, r0)
        L_0x0083:
            int r4 = r4 + 1
            goto L_0x0064
        L_0x0086:
            r8.A02 = r5
        L_0x0088:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onViewAdded(View view) {
        throw DbW.A0c(C51968G9o.A16(this), " does not support direct child views");
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A09.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(context, attributeSet);
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = C14069TpI.A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        03v.A06(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ViewPager2(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }
}
