package androidx.appcompat.view.menu;

import X.AnonymousClass0fD;
import X.AnonymousClass3Tj;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C18932WDk;
import X.C18934WDm;
import X.C20868X1u;
import X.C20937X5f;
import X.C20938X5g;
import X.DbW;
import X.SN3;
import X.U6N;
import X.V25;
import X.WC5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ActionMenuItemView extends AnonymousClass3Tj implements View.OnClickListener, C20937X5f, C20938X5g {
    public V25 A00;
    public C20868X1u A01;
    public C18934WDm A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public WC5 A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    private void A00() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A06 != null && ((this.A02.A05 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.A02.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.A02.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A02.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.A02.getTitle();
            }
            setTooltipText(charSequence2);
            return;
        }
        setTooltipText(tooltipText);
    }

    public final void CN5(C18934WDm wDm, int i) {
        this.A02 = wDm;
        setIcon(wDm.getIcon());
        setTitle(wDm.getTitleCondensed());
        setId(wDm.getItemId());
        setVisibility(DbW.A01(wDm.isVisible() ? 1 : 0));
        setEnabled(wDm.isEnabled());
        if (wDm.hasSubMenu() && this.A07 == null) {
            this.A07 = new U6N(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C18934WDm getItemData() {
        return this.A02;
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            C18934WDm wDm = this.A02;
            if (wDm != null) {
                C18932WDk wDk = wDm.A0A;
                wDk.A0A = true;
                wDk.A0D(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A03;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        A00();
    }

    public void setItemInvoker(C20868X1u x1u) {
        this.A01 = x1u;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.A05 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(V25 v25) {
        this.A00 = v25;
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2.orientation == 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.res.Resources r0 = X.DbU.A05(r4)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x001b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r4.A09 = r0
            int[] r0 = X.AnonymousClass2Z3.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A04 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A03 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A05 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean Cqt() {
        return C13990Tnq.A1a(getText());
    }

    public final boolean Cqu() {
        if (!C13990Tnq.A1a(getText()) || this.A02.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1268696158);
        C20868X1u x1u = this.A01;
        if (x1u != null) {
            x1u.CNz(this.A02);
        }
        AnonymousClass0fD.A0C(-1262562698, A052);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2.orientation == 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.res.Resources r0 = X.DbU.A05(r3)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x0017
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r3.A09 = r0
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int A062 = AnonymousClass0fD.A06(1845867706);
        boolean A1a = C13990Tnq.A1a(getText());
        if (A1a && (i5 = this.A05) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A04;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A04;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, SN3.MAX_SIGNED_POWER_OF_TWO), i2);
        }
        if (!A1a && this.A06 != null) {
            super.setPadding((getMeasuredWidth() - AnonymousClass7TF.A06(this.A06)) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        AnonymousClass0fD.A0D(1295482007, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        WC5 wc5;
        int A052 = AnonymousClass0fD.A05(1971064676);
        if (!this.A02.hasSubMenu() || (wc5 = this.A07) == null || !wc5.onTouch(this, motionEvent)) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -543317402;
        } else {
            onTouchEvent = true;
            i = -1481508837;
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
