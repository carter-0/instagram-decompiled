package androidx.appcompat.widget;

import X.03v;
import X.04K;
import X.2Yi;
import X.AnonymousClass0fD;
import X.AnonymousClass2Z3;
import X.AnonymousClass7TE;
import X.AnonymousClass972;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C14736U5y;
import X.C16748V4h;
import X.C18932WDk;
import X.C18938WDr;
import X.C51968G9o;
import X.C66582MXn;
import X.DbS;
import X.DbW;
import X.SN3;
import X.WDU;
import X.WDW;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public class ActionBarContextView extends ViewGroup {
    public int A00;
    public View A01;
    public WDU A02;
    public 04K A03;
    public CharSequence A04;
    public CharSequence A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public View A0B;
    public View A0C;
    public LinearLayout A0D;
    public TextView A0E;
    public TextView A0F;
    public boolean A0G;
    public ActionMenuView A0H;
    public final Context A0I;
    public final C18938WDr A0J;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new C18938WDr(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i2);
        }
        2Yi A002 = 2Yi.A00(context, attributeSet, AnonymousClass2Z3.A03, i, 0);
        setBackground(A002.A02(0));
        TypedArray typedArray = A002.A02;
        this.A0A = typedArray.getResourceId(5, 0);
        this.A09 = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A08 = typedArray.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArray.recycle();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A01() {
        if (this.A0D == null) {
            Context context = getContext();
            LayoutInflater.from(context).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0D = linearLayout;
            this.A0F = AnonymousClass7TE.A0d(linearLayout, R.id.action_bar_title);
            this.A0E = AnonymousClass7TE.A0d(this.A0D, R.id.action_bar_subtitle);
            int i = this.A0A;
            if (i != 0) {
                this.A0F.setTextAppearance(context, i);
            }
            int i2 = this.A09;
            if (i2 != 0) {
                this.A0E.setTextAppearance(context, i2);
            }
        }
        this.A0F.setText(this.A05);
        this.A0E.setText(this.A04);
        boolean A1a = C13990Tnq.A1a(this.A05);
        boolean A1a2 = C13990Tnq.A1a(this.A04);
        int i3 = 0;
        this.A0E.setVisibility(DbW.A01(A1a2 ? 1 : 0));
        LinearLayout linearLayout2 = this.A0D;
        if (!A1a && !A1a2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.A0D.getParent() == null) {
            addView(this.A0D);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.V4T r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.A01
            if (r0 != 0) goto L_0x008c
            android.view.LayoutInflater r1 = X.DbV.A0D(r7)
            int r0 = r7.A08
            android.view.View r0 = X.DbT.A0C(r1, r7, r0)
            r7.A01 = r0
        L_0x0010:
            r7.addView(r0)
        L_0x0013:
            android.view.View r1 = r7.A01
            r0 = 2131427598(0x7f0b010e, float:1.8476817E38)
            android.view.View r1 = r1.findViewById(r0)
            r7.A0B = r1
            r6 = 0
            X.WBH r0 = new X.WBH
            r0.<init>((int) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            r1.setOnClickListener(r0)
            boolean r0 = r8 instanceof X.C14730U5q
            if (r0 == 0) goto L_0x0087
            X.U5q r8 = (X.C14730U5q) r8
            X.WDk r2 = r8.A02
        L_0x002f:
            X.WDU r0 = r7.A02
            if (r0 == 0) goto L_0x0036
            r0.A01()
        L_0x0036:
            android.content.Context r1 = r7.getContext()
            X.WDU r0 = new X.WDU
            r0.<init>(r1)
            r7.A02 = r0
            r5 = 1
            r0.A0G = r5
            r0.A0H = r5
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.WDU r1 = r7.A02
            android.content.Context r0 = r7.A0I
            r2.A07(r0, r1)
            X.WDU r3 = r7.A02
            X.X1v r2 = r3.A08
            if (r2 != 0) goto L_0x006f
            android.view.LayoutInflater r1 = r3.A05
            r0 = 2131623940(0x7f0e0004, float:1.8875046E38)
            android.view.View r1 = r1.inflate(r0, r7, r6)
            X.X1v r1 = (X.C20869X1v) r1
            r3.A08 = r1
            X.WDk r0 = r3.A06
            r1.CN4(r0)
            r3.FKm(r5)
        L_0x006f:
            X.X1v r1 = r3.A08
            if (r2 == r1) goto L_0x0079
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L_0x0079:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r7.A0H = r1
            r0 = 0
            r1.setBackground(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r7.A0H
            r7.addView(r0, r4)
            return
        L_0x0087:
            X.U5r r8 = (X.U5r) r8
            X.WDk r2 = r8.A03
            goto L_0x002f
        L_0x008c:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0013
            android.view.View r0 = r7.A01
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.V4T):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView */
    public int getAnimatedVisibility() {
        if (this.A03 != null) {
            return this.A0J.A00;
        }
        return getVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A00;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A00;
    }

    public CharSequence getSubtitle() {
        return this.A04;
    }

    public CharSequence getTitle() {
        return this.A05;
    }

    public void setContentHeight(int i) {
        this.A00 = i;
    }

    public void setCustomView(View view) {
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0C = view;
        if (view != null) {
            LinearLayout linearLayout = this.A0D;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A0D = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A04 = charSequence;
        A01();
    }

    public void setTitle(CharSequence charSequence) {
        this.A05 = charSequence;
        A01();
        03v.A0F(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A07) {
            requestLayout();
        }
        this.A07 = z;
    }

    public static final int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final void A04() {
        removeAllViews();
        this.A0C = null;
        this.A0H = null;
        this.A02 = null;
        View view = this.A0B;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass2Z3.A00, R.attr.actionBarStyle, 0);
        this.A00 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        WDU wdu = this.A02;
        if (wdu != null) {
            wdu.A00 = C16748V4h.A00(wdu.A01);
            C18932WDk wDk = wdu.A06;
            if (wDk != null) {
                wDk.A0D(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        WDW wdw;
        int A062 = AnonymousClass0fD.A06(-474531504);
        super.onDetachedFromWindow();
        WDU wdu = this.A02;
        if (wdu != null) {
            wdu.A02();
            C14736U5y u5y = this.A02.A09;
            if (!(u5y == null || (wdw = u5y.A03) == null || !wdw.Cc6())) {
                u5y.A03.dismiss();
            }
        }
        AnonymousClass0fD.A0D(1387246402, A062);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean z2 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int A0I2 = C13989Tnp.A0I(this, i4 - i2);
        View view = this.A01;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(this.A01);
            if (z2) {
                int i7 = A0D2.rightMargin;
                i5 = A0D2.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = A0D2.leftMargin;
                i5 = A0D2.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A002 = i6 + A00(this.A01, i6, paddingTop, A0I2, z2);
            int i9 = A002 + i5;
            if (z2) {
                i9 = A002 - i5;
            }
            paddingLeft = i9;
        }
        LinearLayout linearLayout = this.A0D;
        if (!(linearLayout == null || this.A0C != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += A00(this.A0D, paddingLeft, paddingTop, A0I2, z2);
        }
        View view2 = this.A0C;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, A0I2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingRight, paddingTop, A0I2, !z2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = SN3.MAX_SIGNED_POWER_OF_TWO;
        if (mode != 1073741824) {
            throw DbW.A0c(C51968G9o.A16(this), " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.A00;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int A0H2 = C13989Tnp.A0H(this);
            int A042 = C66582MXn.A04(this, size);
            int i5 = i4 - A0H2;
            int i6 = AnonymousClass972.MUTABLE_FLAG_MASK;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, AnonymousClass972.MUTABLE_FLAG_MASK);
            View view = this.A01;
            if (view != null) {
                C13990Tnq.A0u(view, A042, AnonymousClass972.MUTABLE_FLAG_MASK, makeMeasureSpec);
                int A072 = C13988Tno.A07(A042, view.getMeasuredWidth(), 0);
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(this.A01);
                A042 = A072 - (A0D2.leftMargin + A0D2.rightMargin);
            }
            ActionMenuView actionMenuView = this.A0H;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = this.A0H;
                C13990Tnq.A0u(actionMenuView2, A042, AnonymousClass972.MUTABLE_FLAG_MASK, makeMeasureSpec);
                A042 = C13988Tno.A07(A042, actionMenuView2.getMeasuredWidth(), 0);
            }
            LinearLayout linearLayout = this.A0D;
            if (linearLayout != null && this.A0C == null) {
                if (this.A07) {
                    this.A0D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A0D.getMeasuredWidth();
                    boolean z = false;
                    if (measuredWidth <= A042) {
                        z = true;
                        A042 -= measuredWidth;
                    }
                    this.A0D.setVisibility(C13988Tno.A0E(z));
                } else {
                    C13990Tnq.A0u(linearLayout, A042, AnonymousClass972.MUTABLE_FLAG_MASK, makeMeasureSpec);
                    A042 = C13988Tno.A07(A042, linearLayout.getMeasuredWidth(), 0);
                }
            }
            View view2 = this.A0C;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                if (i7 != -2) {
                    i6 = SN3.MAX_SIGNED_POWER_OF_TWO;
                    if (i7 >= 0) {
                        A042 = Math.min(i7, A042);
                    }
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
                } else if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                C13988Tno.A11(this.A0C, i5, i3, View.MeasureSpec.makeMeasureSpec(A042, i6));
            }
            if (this.A00 <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + A0H2;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw DbW.A0c(C51968G9o.A16(this), " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1720691346);
        int A053 = AnonymousClass0fD.A05(-756703698);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A06 = false;
        }
        if (!this.A06) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A06 = true;
                }
                AnonymousClass0fD.A0C(-656565677, A053);
                AnonymousClass0fD.A0C(1051507495, A052);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        AnonymousClass0fD.A0C(-656565677, A053);
        AnonymousClass0fD.A0C(1051507495, A052);
        return true;
    }

    /* renamed from: setVisibility$AbsActionBarView */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            04K r0 = this.A03;
            if (r0 != null) {
                r0.A00();
            }
            super.setVisibility(i);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }
}
