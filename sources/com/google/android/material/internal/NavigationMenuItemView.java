package com.google.android.material.internal;

import X.02Z;
import X.03v;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C18934WDm;
import X.C20937X5f;
import X.C249703kE;
import X.C297855sT;
import X.C297865sU;
import X.JTR;
import X.U7M;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.instagram.android.R;

public class NavigationMenuItemView extends LinearLayoutCompat implements C20937X5f {
    public static final int[] A0G = {16842912};
    public int A00;
    public int A01;
    public FrameLayout A02;
    public C18934WDm A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public ColorStateList A07;
    public Drawable A08;
    public Drawable A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final CheckedTextView A0E;
    public final 02Z A0F;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = new Rect();
        this.A0C = new Rect();
        this.A00 = 119;
        this.A06 = true;
        this.A05 = false;
        TypedArray A002 = C297855sT.A00(context, attributeSet, C297865sU.A0G, new int[0], i, 0);
        this.A00 = A002.getInt(1, 119);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A06 = A002.getBoolean(2, true);
        A002.recycle();
        U7M u7m = new U7M(this, 3);
        this.A0F = u7m;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.A01 = JTR.A06(context);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A0E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        03v.A0B(checkedTextView, u7m);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A0A) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.A07);
            }
            int i = this.A01;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A0B) {
            if (this.A08 == null) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.navigation_empty_icon, getContext().getTheme());
                this.A08 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.A01;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A08;
        }
        this.A0E.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) JTR.A0V(this, R.id.design_menu_item_action_area_stub);
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        if (r5.A03.getActionView() == null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN5(X.C18934WDm r6, int r7) {
        /*
            r5 = this;
            r5.A03 = r6
            int r0 = r6.getItemId()
            if (r0 <= 0) goto L_0x000b
            r5.setId(r0)
        L_0x000b:
            boolean r0 = r6.isVisible()
            int r0 = X.DbW.A01(r0)
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0052
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r1 = 2130969098(0x7f04020a, float:1.7546868E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto L_0x00ca
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.View.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L_0x004f:
            r5.setBackground(r3)
        L_0x0052:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            r5.setTooltipText(r0)
            X.WDm r1 = r5.A03
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto L_0x00a1
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto L_0x00a1
            X.WDm r0 = r5.A03
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            android.widget.CheckedTextView r1 = r5.A0E
            if (r0 == 0) goto L_0x00bc
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bb
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
        L_0x00b4:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A02
            r0.setLayoutParams(r1)
        L_0x00bb:
            return
        L_0x00bc:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bb
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            goto L_0x00b4
        L_0x00ca:
            r3 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.CN5(X.WDm, int):void");
    }

    public Drawable getForeground() {
        return this.A09;
    }

    public int getForegroundGravity() {
        return this.A00;
    }

    public C18934WDm getItemData() {
        return this.A03;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C18934WDm wDm = this.A03;
        if (wDm != null && wDm.isCheckable() && wDm.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A09;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A09);
            }
            this.A09 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    C13988Tno.A0x(drawable, this);
                }
                if (this.A00 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A09 != null) {
                this.A09.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void setIconPadding(int i) {
        this.A0E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.A01 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0A = AnonymousClass7TF.A1V(colorStateList);
        C18934WDm wDm = this.A03;
        if (wDm != null) {
            setIcon(wDm.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A0E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A0B = z;
    }

    public void setTextAppearance(int i) {
        this.A0E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(-781201612);
        super.draw(canvas);
        Drawable drawable = this.A09;
        if (drawable != null) {
            if (this.A05) {
                this.A05 = false;
                Rect rect = this.A0D;
                Rect rect2 = this.A0C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A06) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
        AnonymousClass0fD.A0A(-610563378, A032);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A09;
        if (drawable != null && drawable.isStateful()) {
            C13988Tno.A0x(this.A09, this);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A05 = z | this.A05;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(103646230);
        super.onSizeChanged(i, i2, i3, i4);
        this.A05 = true;
        AnonymousClass0fD.A0D(-1005867068, A062);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A0F.A0R(this.A0E, C249703kE.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A0E.setChecked(z);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A09) {
            return true;
        }
        return false;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
