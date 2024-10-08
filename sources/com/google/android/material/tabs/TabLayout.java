package com.google.android.material.tabs;

import X.02K;
import X.02U;
import X.08m;
import X.0l2;
import X.2X8;
import X.AnonymousClass0fD;
import X.AnonymousClass6Y2;
import X.C295305nv;
import X.C297875sV;
import X.C323646xs;
import X.C323666xu;
import X.C323816y9;
import X.C323826yA;
import X.C323836yB;
import X.C323846yC;
import X.C323856yD;
import X.C323866yE;
import X.C323946yM;
import X.C324746zp;
import X.C324756zq;
import X.C52776GcT;
import X.C56687I7s;
import X.C64198LTi;
import X.SN3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final 02U A0g = new 0l2(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public PorterDuff.Mode A0H;
    public Drawable A0I;
    public ViewPager A0J;
    public C323666xu A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A0O;
    public ValueAnimator A0P;
    public DataSetObserver A0Q;
    public 08m A0R;
    public C323866yE A0S;
    public C323846yC A0T;
    public C323846yC A0U;
    public C324746zp A0V;
    public C323816y9 A0W;
    public boolean A0X;
    public final int A0Y;
    public final 02U A0Z;
    public final C323646xs A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A03(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                C323646xs r4 = this.A0a;
                int childCount = r4.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (r4.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int A002 = A00(i, 0.0f);
                if (scrollX != A002) {
                    A02();
                    this.A0P.setIntValues(new int[]{scrollX, A002});
                    this.A0P.start();
                }
                int i3 = this.A04;
                ValueAnimator valueAnimator = r4.A02;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    r4.A02.cancel();
                }
                View childAt = r4.getChildAt(r4.A01);
                View childAt2 = r4.getChildAt(i);
                if (childAt2 == null) {
                    C323646xs.A01(r4);
                    return;
                }
                C56687I7s i7s = new C56687I7s(childAt, childAt2, r4);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                r4.A02 = valueAnimator2;
                valueAnimator2.setInterpolator(AnonymousClass6Y2.A02);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator2.addUpdateListener(i7s);
                valueAnimator2.addListener(new C52776GcT(r4, i));
                valueAnimator2.start();
                return;
            }
            A0A(0.0f, i, true, true);
        }
    }

    private void A05(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0J;
        if (viewPager2 != null) {
            C323816y9 r1 = this.A0W;
            if (!(r1 == null || (list2 = viewPager2.A0B) == null)) {
                list2.remove(r1);
            }
            C323866yE r12 = this.A0S;
            if (!(r12 == null || (list = this.A0J.A0A) == null)) {
                list.remove(r12);
            }
        }
        C323846yC r2 = this.A0T;
        if (r2 != null) {
            this.A0b.remove(r2);
            this.A0T = null;
        }
        if (viewPager != null) {
            this.A0J = viewPager;
            C323816y9 r13 = this.A0W;
            if (r13 == null) {
                r13 = new C323816y9(this);
                this.A0W = r13;
            }
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0J(r13);
            C323826yA r22 = new C323826yA(viewPager);
            this.A0T = r22;
            ArrayList arrayList = this.A0b;
            if (!arrayList.contains(r22)) {
                arrayList.add(r22);
            }
            08m adapter = viewPager.getAdapter();
            if (adapter != null) {
                A0C(adapter, true);
            }
            C323866yE r14 = this.A0S;
            if (r14 == null) {
                r14 = new C323866yE(this);
                this.A0S = r14;
            }
            r14.A00 = true;
            List list3 = viewPager.A0A;
            if (list3 == null) {
                list3 = new ArrayList();
                viewPager.A0A = list3;
            }
            list3.add(r14);
            A0A(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.A0J = null;
            A0C((08m) null, false);
        }
        this.A0X = z;
    }

    public final void A0A(float f, int i, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            C323646xs r4 = this.A0a;
            if (round < r4.getChildCount()) {
                if (z2) {
                    ValueAnimator valueAnimator = r4.A02;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r4.A02.cancel();
                    }
                    r4.A01 = i;
                    r4.A00 = f;
                    C323646xs.A00(r4.getChildAt(i), r4.getChildAt(r4.A01 + 1), r4, r4.A00);
                }
                ValueAnimator valueAnimator2 = this.A0P;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0P.cancel();
                }
                scrollTo(A00(i, f), 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void A0G(boolean z) {
        float f;
        int i = 0;
        while (true) {
            C323646xs r1 = this.A0a;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.A02 == 1 && this.A03 == 0) {
                    layoutParams.width = 0;
                    f = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f = 0.0f;
                }
                layoutParams.weight = f;
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r5 = (X.C324756zq) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            X.6xs r1 = r7.A0a
            int r0 = r1.getChildCount()
            if (r6 >= r0) goto L_0x0032
            android.view.View r5 = r1.getChildAt(r6)
            boolean r0 = r5 instanceof X.C324756zq
            if (r0 == 0) goto L_0x002f
            X.6zq r5 = (X.C324756zq) r5
            android.graphics.drawable.Drawable r4 = r5.A00
            if (r4 == 0) goto L_0x002f
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r0.draw(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    @Deprecated
    public void setTabsFromPagerAdapter(08m r2) {
        A0C(r2, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A05(viewPager, false);
    }

    private int A00(int i, float f) {
        View view;
        int i2;
        int i3 = this.A02;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        C323646xs r3 = this.A0a;
        View childAt = r3.getChildAt(i);
        int i5 = i + 1;
        if (i5 < r3.getChildCount()) {
            view = r3.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i2 + i4)) * 0.5f * f);
        int i7 = left - i6;
        if (getLayoutDirection() == 0) {
            return left + i6;
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r5 = this;
            int r0 = r5.A02
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            r0 = 0
        L_0x0009:
            X.6xs r3 = r5.A0a
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x001b
            if (r0 == r4) goto L_0x001b
        L_0x0017:
            r5.A0G(r2)
            return
        L_0x001b:
            int r0 = r5.A03
            if (r0 != r4) goto L_0x0026
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r1, r0)
        L_0x0026:
            r3.setGravity(r2)
            goto L_0x0017
        L_0x002a:
            int r1 = r5.A03
            if (r1 == 0) goto L_0x0034
            r0 = 1
            if (r1 == r2) goto L_0x003e
            if (r1 == r4) goto L_0x003b
            goto L_0x0017
        L_0x0034:
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r1, r0)
        L_0x003b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x003e:
            r3.setGravity(r0)
            goto L_0x0017
        L_0x0042:
            int r1 = r5.A0O
            int r0 = r5.A0A
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A01():void");
    }

    private void A02() {
        if (this.A0P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0P = valueAnimator;
            valueAnimator.setInterpolator(AnonymousClass6Y2.A02);
            this.A0P.setDuration((long) this.A04);
            this.A0P.addUpdateListener(new C64198LTi(this));
        }
    }

    private void A04(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C324746zp A062 = A06();
            CharSequence charSequence = tabItem.A02;
            if (charSequence != null) {
                A062.A04(charSequence);
            }
            Drawable drawable = tabItem.A01;
            if (drawable != null) {
                A062.A02(drawable);
            }
            int i = tabItem.A00;
            if (i != 0) {
                A062.A03(LayoutInflater.from(A062.A04.getContext()).inflate(i, A062.A04, false));
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                A062.A06 = tabItem.getContentDescription();
                C324756zq r0 = A062.A04;
                if (r0 != null) {
                    r0.A04();
                }
            }
            A0E(A062, this.A0c.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C324746zp r1 = (C324746zp) arrayList.get(i);
            if (r1 == null || r1.A02 == null || TextUtils.isEmpty(r1.A07)) {
                i++;
            } else if (this.A0L) {
                return 48;
            } else {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.A0e;
        if (i != -1) {
            return i;
        }
        int i2 = this.A02;
        if (i2 == 0 || i2 == 2) {
            return this.A0f;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C323646xs r5 = this.A0a;
        int childCount = r5.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r5.getChildAt(i2);
                boolean z = true;
                boolean z2 = false;
                if (i2 == i) {
                    z2 = true;
                }
                childAt.setSelected(z2);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
            }
        }
    }

    public final C324746zp A06() {
        C324756zq r2;
        CharSequence charSequence;
        C324746zp r3 = (C324746zp) A0g.A7A();
        if (r3 == null) {
            r3 = new C324746zp();
        }
        r3.A05 = this;
        02U r0 = this.A0Z;
        if (r0 == null || (r2 = (C324756zq) r0.A7A()) == null) {
            r2 = new C324756zq(getContext(), this);
        }
        r2.setTab(r3);
        r2.setFocusable(true);
        r2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(r3.A06)) {
            charSequence = r3.A07;
        } else {
            charSequence = r3.A06;
        }
        r2.setContentDescription(charSequence);
        r3.A04 = r2;
        int i = r3.A00;
        if (i != -1) {
            r2.setId(i);
        }
        return r3;
    }

    public final C324746zp A07(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.A0c;
        if (i < arrayList.size()) {
            return (C324746zp) arrayList.get(i);
        }
        return null;
    }

    public final void A09() {
        C323646xs r3 = this.A0a;
        int childCount = r3.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C324756zq r1 = (C324756zq) r3.getChildAt(childCount);
            r3.removeViewAt(childCount);
            if (r1 != null) {
                r1.setTab((C324746zp) null);
                r1.setSelected(false);
                this.A0Z.ECR(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0c.iterator();
        while (it.hasNext()) {
            C324746zp r2 = (C324746zp) it.next();
            it.remove();
            r2.A05 = null;
            r2.A04 = null;
            r2.A02 = null;
            r2.A00 = -1;
            r2.A07 = null;
            r2.A06 = null;
            r2.A01 = -1;
            r2.A03 = null;
            A0g.ECR(r2);
        }
        this.A0V = null;
    }

    public final void A0B(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i2, i}));
    }

    public final void A0C(08m r3, boolean z) {
        DataSetObserver dataSetObserver;
        08m r1 = this.A0R;
        if (!(r1 == null || (dataSetObserver = this.A0Q) == null)) {
            r1.unregisterDataSetObserver(dataSetObserver);
        }
        this.A0R = r3;
        if (z && r3 != null) {
            DataSetObserver dataSetObserver2 = this.A0Q;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new C323856yD(this);
                this.A0Q = dataSetObserver2;
            }
            r3.registerDataSetObserver(dataSetObserver2);
        }
        A08();
    }

    public final void A0D(C323836yB r3) {
        ArrayList arrayList = this.A0b;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public final void A0E(C324746zp r9, boolean z) {
        float f;
        ArrayList arrayList = this.A0c;
        int size = arrayList.size();
        if (r9.A05 == this) {
            r9.A01 = size;
            arrayList.add(size, r9);
            int size2 = arrayList.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((C324746zp) arrayList.get(size)).A01 = size;
            }
            C324756zq r7 = r9.A04;
            r7.setSelected(false);
            r7.setActivated(false);
            C323646xs r5 = this.A0a;
            int i = r9.A01;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A02 == 1 && this.A03 == 0) {
                layoutParams.width = 0;
                f = 1.0f;
            } else {
                layoutParams.width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            r5.addView(r7, i, layoutParams);
            if (z) {
                r9.A01();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void A0F(C324746zp r6, boolean z) {
        int i;
        C324746zp r4 = this.A0V;
        if (r4 != r6) {
            if (r6 != null) {
                i = r6.A01;
            } else {
                i = -1;
            }
            if (z) {
                if ((r4 == null || r4.A01 == -1) && i != -1) {
                    A0A(0.0f, i, true, true);
                } else {
                    A03(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0V = r6;
            if (r4 != null) {
                ArrayList arrayList = this.A0b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C323846yC) arrayList.get(size)).DqN(r4);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0b;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        ((C323846yC) arrayList2.get(size2)).DqI(r6);
                    } else {
                        return;
                    }
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0b;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    arrayList3.get(size3);
                } else {
                    A03(r6.A01);
                    return;
                }
            }
        }
    }

    public int getSelectedTabPosition() {
        C324746zp r0 = this.A0V;
        if (r0 != null) {
            return r0.A01;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0c.size();
    }

    public int getTabGravity() {
        return this.A03;
    }

    public ColorStateList getTabIconTint() {
        return this.A0E;
    }

    public int getTabIndicatorAnimationMode() {
        return this.A05;
    }

    public int getTabIndicatorGravity() {
        return this.A06;
    }

    public int getTabMaxWidth() {
        return this.A07;
    }

    public int getTabMode() {
        return this.A02;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0F;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0I;
    }

    public ColorStateList getTabTextColors() {
        return this.A0G;
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.A0L != z) {
            this.A0L = z;
            int i = 0;
            while (true) {
                C323646xs r1 = this.A0a;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C324756zq) {
                        C324756zq r2 = (C324756zq) childAt;
                        r2.setOrientation(r2.A0A.A0L ^ true ? 1 : 0);
                        TextView textView = r2.A04;
                        if (textView == null && r2.A02 == null) {
                            textView = r2.A05;
                            imageView = r2.A03;
                        } else {
                            imageView = r2.A02;
                        }
                        C324756zq.A03(imageView, textView, r2);
                    }
                    i++;
                } else {
                    A01();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C323846yC r3) {
        C323846yC r1 = this.A0U;
        if (r1 != null) {
            this.A0b.remove(r1);
        }
        this.A0U = r3;
        if (r3 != null) {
            ArrayList arrayList = this.A0b;
            if (!arrayList.contains(r3)) {
                arrayList.add(r3);
            }
        }
    }

    public void setSelectedTabIndicator(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = 2X8.A02().A05(getContext(), i);
        } else {
            drawable = null;
        }
        setSelectedTabIndicator(drawable);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A0a.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C323646xs r4 = this.A0a;
        TabLayout tabLayout = r4.A03;
        Rect bounds = tabLayout.A0I.getBounds();
        tabLayout.A0I.setBounds(bounds.left, 0, bounds.right, i);
        r4.requestLayout();
    }

    public void setTabGravity(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            A01();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C324756zq r0 = ((C324746zp) arrayList.get(i)).A04;
                if (r0 != null) {
                    r0.A04();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6xu] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTabIndicatorAnimationMode(int r3) {
        /*
            r2 = this;
            r2.A05 = r3
            if (r3 == 0) goto L_0x000f
            r0 = 1
            if (r3 != r0) goto L_0x0015
            X.71p r0 = new X.71p
            r0.<init>()
        L_0x000c:
            r2.A0K = r0
            return
        L_0x000f:
            X.6xu r0 = new X.6xu
            r0.<init>()
            goto L_0x000c
        L_0x0015:
            java.lang.String r0 = " is not a valid TabIndicatorAnimationMode"
            java.lang.String r1 = X.002.A03(r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.setTabIndicatorAnimationMode(int):void");
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0M = z;
        this.A0a.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.A02) {
            this.A02 = i;
            A01();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0F != colorStateList) {
            this.A0F = colorStateList;
            int i = 0;
            while (true) {
                C323646xs r1 = this.A0a;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C324756zq) {
                        C324756zq.A02(getContext(), (C324756zq) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C324756zq r0 = ((C324746zp) arrayList.get(i)).A04;
                if (r0 != null) {
                    r0.A04();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            int i = 0;
            while (true) {
                C323646xs r1 = this.A0a;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C324756zq) {
                        C324756zq.A02(getContext(), (C324756zq) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A08() {
        int currentItem;
        A09();
        08m r0 = this.A0R;
        if (r0 != null) {
            int count = r0.getCount();
            for (int i = 0; i < count; i++) {
                C324746zp A062 = A06();
                A062.A04(this.A0R.getPageTitle(i));
                A0E(A062, false);
            }
            ViewPager viewPager = this.A0J;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0c.size()) {
                A0F(A07(currentItem), true);
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1891590377);
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            C323946yM.A00(this, (C297875sV) background);
        }
        if (this.A0J == null) {
            ViewPager parent = getParent();
            if (parent instanceof ViewPager) {
                A05(parent, true);
            }
        }
        AnonymousClass0fD.A0D(77190589, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1530616597);
        super.onDetachedFromWindow();
        if (this.A0X) {
            A05((ViewPager) null, false);
            this.A0X = false;
        }
        AnonymousClass0fD.A0D(481970430, A062);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0c.size(), false, 1));
    }

    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        int round = Math.round(C295305nv.A00(context, getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), SN3.MAX_SIGNED_POWER_OF_TWO);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0d;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - C295305nv.A00(context, 56));
            }
            this.A07 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A02;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            ((C297875sV) background).A0A(f);
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A02();
        this.A0P.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(02K.A02(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(02K.A02(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public final void addView(View view) {
        A04(view);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A0C = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r6 = 2132018492(0x7f14053c, float:1.9675292E38)
            r0 = r19
            r13 = r20
            r9 = r21
            android.content.Context r0 = X.C297835sR.A00(r0, r13, r9, r6)
            r2 = r18
            r2.<init>(r0, r13, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A0c = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r2.A0I = r0
            r1 = 0
            r2.A0C = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.A07 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A0b = r0
            r4 = 12
            X.0vW r0 = new X.0vW
            r0.<init>(r4)
            r2.A0Z = r0
            android.content.Context r12 = r2.getContext()
            r2.setHorizontalScrollBarEnabled(r1)
            X.6xs r10 = new X.6xs
            r10.<init>(r12, r2)
            r2.A0a = r10
            r3 = -2
            r7 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r7)
            super.addView(r10, r1, r0)
            int[] r14 = X.C297865sU.A0a
            r5 = 1
            r8 = 23
            int[] r15 = new int[]{r8}
            r17 = r6
            r16 = r9
            android.content.res.TypedArray r3 = X.C297855sT.A00(r12, r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x008c
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.5sV r6 = new X.5sV
            r6.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.A0F(r0)
            r6.A0E(r12)
            float r0 = r2.getElevation()
            r6.A0A(r0)
            r2.setBackground(r6)
        L_0x008c:
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.C309286Xr.A03(r12, r3, r0)
            r2.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            r0 = 8
            int r0 = r3.getColor(r0, r1)
            r2.A0C = r0
            r0 = 11
            int r11 = r3.getDimensionPixelSize(r0, r7)
            com.google.android.material.tabs.TabLayout r6 = r10.A03
            android.graphics.drawable.Drawable r0 = r6.A0I
            android.graphics.Rect r0 = r0.getBounds()
            android.graphics.drawable.Drawable r9 = r6.A0I
            int r6 = r0.left
            int r0 = r0.right
            r9.setBounds(r6, r1, r0, r11)
            r10.requestLayout()
            r0 = 10
            int r0 = r3.getInt(r0, r1)
            r2.setSelectedTabIndicatorGravity(r0)
            r0 = 9
            boolean r0 = r3.getBoolean(r0, r5)
            r2.setTabIndicatorFullWidth(r0)
            r0 = 7
            int r0 = r3.getInt(r0, r1)
            r2.setTabIndicatorAnimationMode(r0)
            r0 = 16
            int r6 = r3.getDimensionPixelSize(r0, r1)
            r2.A08 = r6
            r2.A09 = r6
            r2.A0B = r6
            r2.A0A = r6
            r0 = 19
            int r0 = r3.getDimensionPixelSize(r0, r6)
            r2.A0A = r0
            r6 = 20
            int r0 = r2.A0B
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A0B = r0
            r6 = 18
            int r0 = r2.A09
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A09 = r0
            r6 = 17
            int r0 = r2.A08
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A08 = r0
            r0 = 2132018262(0x7f140456, float:1.9674826E38)
            int r6 = r3.getResourceId(r8, r0)
            r2.A0D = r6
            int[] r0 = X.AnonymousClass2Z3.A0N
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r6, r0)
            int r0 = r6.getDimensionPixelSize(r1, r1)     // Catch:{ all -> 0x01d2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d2 }
            r2.A01 = r0     // Catch:{ all -> 0x01d2 }
            r0 = 3
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r12, r6, r0)     // Catch:{ all -> 0x01d2 }
            r2.A0G = r0     // Catch:{ all -> 0x01d2 }
            r6.recycle()
            r6 = 24
            boolean r0 = r3.hasValue(r6)
            if (r0 == 0) goto L_0x0132
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r12, r3, r6)
            r2.A0G = r0
        L_0x0132:
            r6 = 22
            boolean r0 = r3.hasValue(r6)
            if (r0 == 0) goto L_0x0157
            int r10 = r3.getColor(r6, r1)
            android.content.res.ColorStateList r0 = r2.A0G
            int r9 = r0.getDefaultColor()
            int[] r6 = android.view.View.SELECTED_STATE_SET
            int[] r0 = android.view.View.EMPTY_STATE_SET
            int[][] r8 = new int[][]{r6, r0}
            int[] r6 = new int[]{r10, r9}
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r8, r6)
            r2.A0G = r0
        L_0x0157:
            r0 = 3
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r12, r3, r0)
            r2.A0E = r0
            r0 = 4
            int r6 = r3.getInt(r0, r7)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C295305nv.A01(r0, r6)
            r2.A0H = r0
            r0 = 21
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r12, r3, r0)
            r2.A0F = r0
            r6 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r0 = r3.getInt(r6, r0)
            r2.A04 = r0
            r0 = 14
            int r0 = r3.getDimensionPixelSize(r0, r7)
            r2.A0e = r0
            r0 = 13
            int r0 = r3.getDimensionPixelSize(r0, r7)
            r2.A0d = r0
            int r0 = r3.getResourceId(r1, r1)
            r2.A0Y = r0
            int r0 = r3.getDimensionPixelSize(r5, r1)
            r2.A0O = r0
            r0 = 15
            int r0 = r3.getInt(r0, r5)
            r2.A02 = r0
            r0 = 2
            int r0 = r3.getInt(r0, r1)
            r2.A03 = r0
            boolean r0 = r3.getBoolean(r4, r1)
            r2.A0L = r0
            r0 = 25
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0N = r0
            r3.recycle()
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r2.A00 = r0
            r0 = 2131165522(0x7f070152, float:1.7945263E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A0f = r0
            r2.A01()
            return
        L_0x01d2:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A04(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C323836yB r1) {
        setOnTabSelectedListener((C323846yC) r1);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0I != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.A0I = drawable;
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public final void addView(View view, int i) {
        A04(view);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A04(view);
    }
}
