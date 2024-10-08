package com.instagram.ui.widget.radiogroup;

import X.AnonymousClass0fD;
import X.C19744Wel;
import X.MT5;
import X.Q9l;
import X.WC8;
import X.X5E;
import X.XBN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class IgRadioGroup extends LinearLayout {
    public int A00 = -1;
    public MT5 A01 = new C19744Wel(this);
    public X5E A02;
    public WC8 A03;
    public boolean A04 = false;

    public final void A02(int i) {
        if (i == -1 || i != this.A00) {
            int i2 = this.A00;
            if (i2 != -1) {
                A01(this, i2, false);
            }
            if (i != -1) {
                A01(this, i, true);
            }
            setCheckedId(i);
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.A00 = i;
        X5E x5e = this.A02;
        if (x5e != null) {
            x5e.D1Z(this, i);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if ((view instanceof XBN) && ((Checkable) view).isChecked()) {
            this.A04 = true;
            int i2 = this.A00;
            if (i2 != -1) {
                A01(this, i2, false);
            }
            this.A04 = false;
            setCheckedId(view.getId());
        }
        super.addView(view, i, layoutParams);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Q9l;
    }

    public CharSequence getAccessibilityClassName() {
        return IgRadioGroup.class.getName();
    }

    public int getCheckedRadioButtonId() {
        return this.A00;
    }

    public void setOnCheckedChangeListener(X5E x5e) {
        this.A02 = x5e;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03.A00 = onHierarchyChangeListener;
    }

    public IgRadioGroup(Context context) {
        super(context);
        WC8 wc8 = new WC8(this);
        this.A03 = wc8;
        super.setOnHierarchyChangeListener(wc8);
    }

    public static void A01(IgRadioGroup igRadioGroup, int i, boolean z) {
        View findViewById = igRadioGroup.findViewById(i);
        if (findViewById != null && (findViewById instanceof XBN)) {
            ((Checkable) findViewById).setChecked(z);
        }
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0fD.A06(-1207466535);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            this.A04 = true;
            A01(this, i, true);
            this.A04 = false;
            setCheckedId(this.A00);
        }
        AnonymousClass0fD.A0D(687041123, A06);
    }

    public IgRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WC8 wc8 = new WC8(this);
        this.A03 = wc8;
        super.setOnHierarchyChangeListener(wc8);
    }

    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }
}
