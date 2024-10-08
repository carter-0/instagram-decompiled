package com.google.android.material.button;

import X.02K;
import X.AnonymousClass0fD;
import X.C13988Tno;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C14161Tqz;
import X.C295305nv;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import X.C297885sW;
import X.C297895sX;
import X.C309286Xr;
import X.C323946yM;
import X.JTT;
import X.U4G;
import X.W2N;
import X.WMT;
import X.WMU;
import X.X15;
import X.X16;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends U4G implements Checkable, C297885sW {
    public static final int[] A0D = {16842911};
    public static final int[] A0E = {16842912};
    public int A00;
    public Drawable A01;
    public X16 A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final W2N A0B;
    public final LinkedHashSet A0C;

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(7);
        public boolean A00;

        public final void writeToParcel(Parcel parcel, int i) {
            MaterialButton.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    private void A00(int i, int i2) {
        if (this.A01 != null && getLayout() != null) {
            int i3 = this.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 2)) {
                z = false;
            }
            if (z || i3 == 3 || i3 == 4) {
                this.A06 = 0;
                boolean z2 = true;
                if (i3 == 1 || i3 == 3) {
                    this.A03 = 0;
                } else {
                    int i4 = this.A05;
                    if (i4 == 0) {
                        i4 = this.A01.getIntrinsicWidth();
                    }
                    int textWidth = (((((i - getTextWidth()) - getPaddingEnd()) - i4) - this.A04) - getPaddingStart()) / 2;
                    boolean A1W = C13988Tno.A1W(getLayoutDirection(), 1);
                    if (this.A00 != 4) {
                        z2 = false;
                    }
                    if (A1W != z2) {
                        textWidth = -textWidth;
                    }
                    if (this.A03 != textWidth) {
                        this.A03 = textWidth;
                    } else {
                        return;
                    }
                }
            } else if (i3 == 16 || i3 == 32) {
                this.A03 = 0;
                if (i3 == 16) {
                    this.A06 = 0;
                } else {
                    int i5 = this.A05;
                    if (i5 == 0) {
                        i5 = this.A01.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.A04) - getPaddingBottom()) / 2;
                    if (this.A06 != textHeight) {
                        this.A06 = textHeight;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            A01(false);
        }
    }

    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A01 = mutate;
            mutate.setTintList(this.A07);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                this.A01.setTintMode(mode);
            }
            int i = this.A05;
            if (i == 0) {
                i = this.A01.getIntrinsicWidth();
            }
            int i2 = this.A05;
            if (i2 == 0) {
                i2 = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i3 = this.A03;
            int i4 = this.A06;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            int i5 = this.A00;
            if (!(i5 == 1 || i5 == 2) || drawable3 == this.A01) {
                if (i5 == 3 || i5 == 4) {
                    if (drawable5 == this.A01) {
                        return;
                    }
                } else if (!(i5 == 16 || i5 == 32) || drawable4 == this.A01) {
                    return;
                }
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (!(i6 == 1 || i6 == 2)) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.A01, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i6 == 3 || i6 == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.A01, (Drawable) null);
        } else if (i6 == 16 || i6 == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.A01, (Drawable) null, (Drawable) null);
        }
    }

    private boolean A02() {
        W2N w2n = this.A0B;
        if (w2n == null || w2n.A0E) {
            return false;
        }
        return true;
    }

    private String getA11yClassName() {
        Class cls;
        W2N w2n = this.A0B;
        if (w2n == null || !w2n.A0F) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public Drawable getIcon() {
        return this.A01;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A04;
    }

    public int getIconSize() {
        return this.A05;
    }

    public ColorStateList getIconTint() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    public final boolean isChecked() {
        return this.A0A;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        W2N w2n = this.A0B;
        if (w2n != null && w2n.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        setChecked(savedState.A00);
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setChecked(boolean z) {
        int i;
        W2N w2n = this.A0B;
        if (w2n != null && w2n.A0F && isEnabled() && this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
            if (!this.A09) {
                this.A09 = true;
                Iterator it = this.A0C.iterator();
                while (it.hasNext()) {
                    boolean z2 = this.A0A;
                    MaterialButtonToggleGroup materialButtonToggleGroup = ((WMT) ((X15) it.next())).A00;
                    if (!materialButtonToggleGroup.A02) {
                        if (materialButtonToggleGroup.A01) {
                            if (z2) {
                                i = getId();
                            } else {
                                i = -1;
                            }
                            materialButtonToggleGroup.A00 = i;
                        }
                        if (MaterialButtonToggleGroup.A02(materialButtonToggleGroup, getId(), z2)) {
                            getId();
                            MaterialButtonToggleGroup.A01(materialButtonToggleGroup);
                        }
                        materialButtonToggleGroup.invalidate();
                    }
                }
                this.A09 = false;
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A01 != drawable) {
            this.A01 = drawable;
            A01(true);
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.A05 != i) {
            this.A05 = i;
            A01(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        W2N w2n = this.A0B;
        W2N.A03(w2n, w2n.A05, i);
    }

    public void setInsetTop(int i) {
        W2N w2n = this.A0B;
        W2N.A03(w2n, i, w2n.A02);
    }

    public void setOnPressedChangeListenerInternal(X16 x16) {
        this.A02 = x16;
    }

    public void setPressed(boolean z) {
        X16 x16 = this.A02;
        if (x16 != null) {
            ((WMU) x16).A00.invalidate();
        }
        super.setPressed(z);
    }

    public final void toggle() {
        setChecked(!this.A0A);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018510), attributeSet, i);
        this.A0C = new LinkedHashSet();
        boolean z = false;
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A002 = C297855sT.A00(context2, attributeSet, C297865sU.A0J, new int[0], i, 2132018510);
        this.A04 = A002.getDimensionPixelSize(12, 0);
        int i2 = A002.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.A08 = C295305nv.A01(mode, i2);
        this.A07 = C309286Xr.A01(context2, A002, 14);
        this.A01 = C309286Xr.A03(context2, A002, 10);
        this.A00 = A002.getInteger(11, 1);
        this.A05 = A002.getDimensionPixelSize(13, 0);
        W2N w2n = new W2N(this, new C297895sX(C297895sX.A01(context2, attributeSet, i, 2132018510)));
        this.A0B = w2n;
        w2n.A03 = A002.getDimensionPixelOffset(1, 0);
        w2n.A04 = A002.getDimensionPixelOffset(2, 0);
        w2n.A05 = A002.getDimensionPixelOffset(3, 0);
        w2n.A02 = A002.getDimensionPixelOffset(4, 0);
        if (A002.hasValue(8)) {
            int dimensionPixelSize = A002.getDimensionPixelSize(8, -1);
            w2n.A00 = dimensionPixelSize;
            w2n.A05(C13991Tnr.A0K(w2n.A0D, (float) dimensionPixelSize));
            w2n.A0G = true;
        }
        w2n.A06 = A002.getDimensionPixelSize(20, 0);
        w2n.A0A = C295305nv.A01(mode, A002.getInt(7, -1));
        MaterialButton materialButton = w2n.A0I;
        Context context3 = materialButton.getContext();
        w2n.A07 = C309286Xr.A01(context3, A002, 6);
        w2n.A09 = C309286Xr.A01(context3, A002, 19);
        w2n.A08 = C309286Xr.A01(context3, A002, 16);
        w2n.A0F = A002.getBoolean(5, false);
        w2n.A01 = A002.getDimensionPixelSize(9, 0);
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        if (A002.hasValue(0)) {
            w2n.A0E = true;
            materialButton.setSupportBackgroundTintList(w2n.A07);
            materialButton.setSupportBackgroundTintMode(w2n.A0A);
        } else {
            W2N.A01(w2n);
        }
        materialButton.setPaddingRelative(paddingStart + w2n.A03, paddingTop + w2n.A05, paddingEnd + w2n.A04, paddingBottom + w2n.A02);
        A002.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null ? true : z);
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    public C297895sX getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (A02()) {
            return this.A0B.A07;
        }
        return C13991Tnr.A02(this.A01);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A02()) {
            return this.A0B.A0A;
        }
        return C13991Tnr.A03(this.A01);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(704643737);
        super.onAttachedToWindow();
        if (A02()) {
            C323946yM.A00(this, W2N.A00(this.A0B, false));
        }
        AnonymousClass0fD.A0D(247432062, A062);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.W2N r0 = r2.A0B
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final Parcelable onSaveInstanceState() {
        AbsSavedState absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A0A;
        return absSavedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1760404247);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0fD.A0D(-964784038, A062);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackgroundColor(int i) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (W2N.A00(w2n, false) != null) {
                W2N.A00(w2n, false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (A02()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                W2N w2n = this.A0B;
                w2n.A0E = true;
                MaterialButton materialButton = w2n.A0I;
                materialButton.setSupportBackgroundTintList(w2n.A07);
                materialButton.setSupportBackgroundTintMode(w2n.A0A);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (!w2n.A0G || w2n.A00 != i) {
                w2n.A00 = i;
                w2n.A0G = true;
                w2n.A05(C13991Tnr.A0K(w2n.A0D, (float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(JTT.A05(this, i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            W2N.A00(this.A0B, false).A0A(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(02K.A02(getContext(), i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (w2n.A08 != colorStateList) {
                w2n.A08 = colorStateList;
                MaterialButton materialButton = w2n.A0I;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(02K.A02(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C297895sX r3) {
        if (A02()) {
            this.A0B.A05(r3);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            W2N w2n = this.A0B;
            w2n.A0H = z;
            W2N.A02(w2n);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (w2n.A09 != colorStateList) {
                w2n.A09 = colorStateList;
                W2N.A02(w2n);
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(02K.A02(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (w2n.A06 != i) {
                w2n.A06 = i;
                W2N.A02(w2n);
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(JTT.A05(this, i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (w2n.A07 != colorStateList) {
                w2n.A07 = colorStateList;
                if (W2N.A00(w2n, false) != null) {
                    W2N.A00(w2n, false).setTintList(w2n.A07);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            W2N w2n = this.A0B;
            if (w2n.A0A != mode) {
                w2n.A0A = mode;
                if (W2N.A00(w2n, false) != null && w2n.A0A != null) {
                    W2N.A00(w2n, false).setTintMode(w2n.A0A);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
