package com.google.android.material.card;

import X.02K;
import X.AnonymousClass0fD;
import X.C13988Tno;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import X.C297875sV;
import X.C297885sW;
import X.C297895sX;
import X.C298035sl;
import X.C309286Xr;
import X.C323946yM;
import X.JTT;
import X.W34;
import X.X17;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;

public class MaterialCardView extends CardView implements Checkable, C297885sW {
    public static final int[] A05 = {16842911};
    public static final int[] A06 = {16842912};
    public static final int[] A07 = {R.attr.state_dragged};
    public boolean A00;
    public X17 A01;
    public boolean A02;
    public boolean A03;
    public final W34 A04;

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.A04.A00 = JTT.A05(this, i);
        }
    }

    private void A01() {
        W34 w34 = this.A04;
        Drawable drawable = w34.A08;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            w34.A08.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            w34.A08.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        C13988Tno.A0v(rectF, this.A04.A0G);
        return rectF;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.A04.A0G.A00.A0B;
    }

    public ColorStateList getCardForegroundColor() {
        return this.A04.A0H.A00.A0B;
    }

    public Drawable getCheckedIcon() {
        return this.A04.A06;
    }

    public int getCheckedIconMargin() {
        return this.A04.A00;
    }

    public int getCheckedIconSize() {
        return this.A04.A01;
    }

    public ColorStateList getCheckedIconTint() {
        return this.A04.A03;
    }

    public int getContentPaddingBottom() {
        return this.A04.A0E.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.A0E.left;
    }

    public int getContentPaddingRight() {
        return this.A04.A0E.right;
    }

    public int getContentPaddingTop() {
        return this.A04.A0E.top;
    }

    public float getProgress() {
        return this.A04.A0G.A00.A01;
    }

    public float getRadius() {
        return this.A04.A0G.A07();
    }

    public ColorStateList getRippleColor() {
        return this.A04.A04;
    }

    public C297895sX getShapeAppearanceModel() {
        return this.A04.A0B;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.A04.A05;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.A04.A05;
    }

    public int getStrokeWidth() {
        return this.A04.A02;
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        W34 w34 = this.A04;
        if (w34 != null && w34.A0C) {
            View.mergeDrawableStates(onCreateDrawableState, A05);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A06);
        }
        if (this.A00) {
            View.mergeDrawableStates(onCreateDrawableState, A07);
        }
        return onCreateDrawableState;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A03) {
            W34 w34 = this.A04;
            if (!w34.A0D) {
                w34.A0D = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCardBackgroundColor(int i) {
        W34 w34 = this.A04;
        w34.A0G.A0F(ColorStateList.valueOf(i));
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C297875sV r1 = this.A04.A0H;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r1.A0F(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.A04.A0C = z;
    }

    public void setChecked(boolean z) {
        if (this.A02 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.A04.A07(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.A04.A00 = i;
    }

    public void setCheckedIconResource(int i) {
        this.A04.A07(C13990Tnq.A0E(this, i));
    }

    public void setCheckedIconSize(int i) {
        this.A04.A01 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.A04.A01 = JTT.A05(this, i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        W34 w34 = this.A04;
        w34.A03 = colorStateList;
        Drawable drawable = w34.A06;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void setDragged(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            A01();
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(X17 x17) {
        this.A01 = x17;
    }

    public void setProgress(float f) {
        W34 w34 = this.A04;
        w34.A0G.A0B(f);
        w34.A0H.A0B(f);
        C297875sV r0 = w34.A0A;
        if (r0 != null) {
            r0.A0B(f);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        W34 w34 = this.A04;
        w34.A04 = colorStateList;
        Drawable drawable = w34.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        W34 w34 = this.A04;
        ColorStateList A022 = 02K.A02(getContext(), i);
        w34.A04 = A022;
        Drawable drawable = w34.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(A022);
        }
    }

    public void setStrokeColor(int i) {
        W34 w34 = this.A04;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (w34.A05 != valueOf) {
            w34.A05 = valueOf;
            w34.A0H.A0H(valueOf, (float) w34.A02);
        }
    }

    public void setStrokeWidth(int i) {
        W34 w34 = this.A04;
        if (i != w34.A02) {
            w34.A02 = i;
            w34.A0H.A0H(w34.A05, (float) i);
        }
    }

    public final void toggle() {
        W34 w34 = this.A04;
        if (w34 != null && w34.A0C && isEnabled()) {
            this.A02 = !this.A02;
            refreshDrawableState();
            A01();
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018517), attributeSet, i);
        this.A02 = false;
        this.A00 = false;
        this.A03 = true;
        TypedArray A002 = C297855sT.A00(getContext(), attributeSet, C297865sU.A0N, new int[0], i, 2132018517);
        W34 w34 = new W34(attributeSet, this, i);
        this.A04 = w34;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C297875sV r6 = w34.A0G;
        r6.A0F(cardBackgroundColor);
        Rect rect = this.A02;
        w34.A0E.set(rect.left, rect.top, rect.right, rect.bottom);
        w34.A05();
        MaterialCardView materialCardView = w34.A0F;
        Context context2 = materialCardView.getContext();
        ColorStateList A012 = C309286Xr.A01(context2, A002, 10);
        w34.A05 = A012;
        if (A012 == null) {
            w34.A05 = ColorStateList.valueOf(-1);
        }
        w34.A02 = A002.getDimensionPixelSize(11, 0);
        boolean z = A002.getBoolean(0, false);
        w34.A0C = z;
        materialCardView.setLongClickable(z);
        w34.A03 = C309286Xr.A01(context2, A002, 5);
        w34.A07(C309286Xr.A03(context2, A002, 2));
        w34.A01 = A002.getDimensionPixelSize(4, 0);
        w34.A00 = A002.getDimensionPixelSize(3, 0);
        ColorStateList A013 = C309286Xr.A01(context2, A002, 6);
        w34.A04 = A013;
        if (A013 == null) {
            w34.A04 = ColorStateList.valueOf(C298035sl.A01(materialCardView, R.attr.colorControlHighlight));
        }
        ColorStateList A014 = C309286Xr.A01(context2, A002, 1);
        C297875sV r2 = w34.A0H;
        r2.A0F(A014 == null ? ColorStateList.valueOf(0) : A014);
        Drawable drawable = w34.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(w34.A04);
        }
        r6.A0A(materialCardView.getCardElevation());
        r2.A0H(w34.A05, (float) w34.A02);
        super.setBackgroundDrawable(W34.A03(r6, w34));
        Drawable A022 = materialCardView.isClickable() ? W34.A02(w34) : r2;
        w34.A07 = A022;
        materialCardView.setForeground(W34.A03(A022, w34));
        A002.recycle();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1238775993);
        super.onAttachedToWindow();
        C323946yM.A00(this, this.A04.A0G);
        AnonymousClass0fD.A0D(1740829464, A062);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r3.setClassName(r0)
            X.W34 r0 = r2.A04
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        W34 w34 = this.A04;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (w34.A09 != null) {
            int i3 = w34.A00;
            int i4 = w34.A01;
            int i5 = (measuredWidth - i3) - i4;
            int i6 = (measuredHeight - i3) - i4;
            MaterialCardView materialCardView = w34.A0F;
            if (materialCardView.A00) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                if (W34.A04(w34)) {
                    f = W34.A00(w34);
                } else {
                    f = 0.0f;
                }
                i6 -= C13988Tno.A02(maxCardElevation + f, 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (W34.A04(w34)) {
                    f2 = W34.A00(w34);
                } else {
                    f2 = 0.0f;
                }
                i5 -= C13988Tno.A02(maxCardElevation2 + f2, 2.0f);
            }
            int i7 = w34.A00;
            int i8 = i7;
            if (materialCardView.getLayoutDirection() == 1) {
                i8 = i5;
                i5 = i7;
            }
            w34.A09.setLayerInset(2, i5, w34.A00, i8, i6);
        }
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        W34 w34 = this.A04;
        w34.A0G.A0A(w34.A0F.getCardElevation());
    }

    public void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        W34 w34 = this.A04;
        if (w34 != null) {
            Drawable drawable2 = w34.A07;
            MaterialCardView materialCardView = w34.A0F;
            if (materialCardView.isClickable()) {
                drawable = W34.A02(w34);
            } else {
                drawable = w34.A0H;
            }
            w34.A07 = drawable;
            if (drawable2 == drawable) {
                return;
            }
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((DrawableWrapper) materialCardView.getForeground()).setDrawable(drawable);
            } else {
                materialCardView.setForeground(W34.A03(drawable, w34));
            }
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.A04.A06();
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        W34 w34 = this.A04;
        w34.A06();
        w34.A05();
    }

    public void setRadius(float f) {
        super.setRadius(f);
        W34 w34 = this.A04;
        w34.A08(C13991Tnr.A0K(w34.A0B, f));
        w34.A07.invalidateSelf();
        if (W34.A04(w34) || (w34.A0F.A01 && !w34.A0G.A0I())) {
            w34.A05();
        }
        if (W34.A04(w34)) {
            w34.A06();
        }
    }

    public void setShapeAppearanceModel(C297895sX r2) {
        setClipToOutline(r2.A03(getBoundsAsRectF()));
        this.A04.A08(r2);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        W34 w34 = this.A04;
        w34.A06();
        w34.A05();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.A04.A0G.A0F(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        W34 w34 = this.A04;
        if (w34.A05 != colorStateList) {
            w34.A05 = colorStateList;
            w34.A0H.A0H(colorStateList, (float) w34.A02);
        }
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }
}
