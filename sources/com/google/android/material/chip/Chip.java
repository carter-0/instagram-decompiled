package com.google.android.material.chip;

import X.02K;
import X.03v;
import X.2Vy;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass972;
import X.C11356SOs;
import X.C13990Tnq;
import X.C14748U7f;
import X.C297885sW;
import X.C297895sX;
import X.C304216Cp;
import X.C323656xt;
import X.C323946yM;
import X.DbU;
import X.U4J;
import X.UWU;
import X.V4P;
import X.W0Q;
import X.X18;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Chip extends U4J implements C297885sW, X18 {
    public static final Rect A0G = new Rect();
    public static final int[] A0H = {16842911};
    public static final int[] A0I = {16842913};
    public int A00;
    public InsetDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public UWU A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public RippleDrawable A0A;
    public boolean A0B;
    public final C14748U7f A0C;
    public final Rect A0D;
    public final RectF A0E;
    public final V4P A0F;

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    private void A02() {
        C14748U7f u7f;
        UWU uwu = this.A04;
        if (uwu == null || uwu.A0T == null || !uwu.A0d || this.A02 == null) {
            u7f = null;
        } else {
            u7f = this.A0C;
        }
        03v.A0B(this, u7f);
    }

    private void A03() {
        ColorStateList colorStateList = this.A04.A0O;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = this.A04;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, drawable, (Drawable) null);
        this.A0A = rippleDrawable;
        setBackground(rippleDrawable);
        A04();
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0E;
        rectF.setEmpty();
        UWU uwu = this.A04;
        if (!(uwu == null || uwu.A0T == null || this.A02 == null)) {
            Rect bounds = uwu.getBounds();
            rectF.setEmpty();
            if (UWU.A05(uwu)) {
                float f = uwu.A01 + uwu.A06 + uwu.A07 + uwu.A08 + uwu.A0B;
                if (uwu.getLayoutDirection() == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    private W0Q getTextAppearance() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0v.A00;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r1.right == r2) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r1 > 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r7) {
        /*
            r6 = this;
            r6.A00 = r7
            boolean r0 = r6.A08
            r3 = 0
            if (r0 == 0) goto L_0x0064
            X.UWU r2 = r6.A04
            float r0 = r2.A03
            int r0 = (int) r0
            int r1 = X.C13988Tno.A07(r7, r0, r3)
            int r0 = r2.getIntrinsicWidth()
            int r0 = X.C13988Tno.A07(r7, r0, r3)
            if (r0 > 0) goto L_0x005f
            if (r1 <= 0) goto L_0x0064
            r2 = 0
        L_0x001d:
            int r3 = r1 / 2
        L_0x001f:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x0041
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            r0.getPadding(r1)
            int r0 = r1.top
            if (r0 != r3) goto L_0x0041
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x0041
            int r0 = r1.left
            if (r0 != r2) goto L_0x0041
            int r0 = r1.right
            if (r0 != r2) goto L_0x0041
        L_0x003d:
            r6.A03()
            return
        L_0x0041:
            int r0 = r6.getMinHeight()
            if (r0 == r7) goto L_0x004a
            r6.setMinHeight(r7)
        L_0x004a:
            int r0 = r6.getMinWidth()
            if (r0 == r7) goto L_0x0053
            r6.setMinWidth(r7)
        L_0x0053:
            X.UWU r1 = r6.A04
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r4 = r2
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r0
            goto L_0x003d
        L_0x005f:
            int r2 = r0 / 2
            if (r1 <= 0) goto L_0x001f
            goto L_0x001d
        L_0x0064:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x003d
            r0 = 0
            r6.A01 = r0
            r6.setMinWidth(r3)
            float r0 = r6.getChipMinHeight()
            int r0 = (int) r0
            r6.setMinHeight(r0)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A06(int):void");
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            Class<2Vy> cls = 2Vy.class;
            try {
                Field declaredField = cls.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                C14748U7f u7f = this.A0C;
                if (AnonymousClass7TE.A0M(declaredField.get(u7f)) != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("updateHoveredVirtualView", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(u7f, new Object[]{Integer.valueOf(AnonymousClass972.MUTABLE_FLAG_MASK)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        if (this.A0C.A0o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C14748U7f u7f = this.A0C;
        if (!u7f.A0n(keyEvent) || u7f.A01 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.A01;
        if (insetDrawable == null) {
            return this.A04;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0R;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0I;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        float f;
        UWU uwu = this.A04;
        if (uwu == null) {
            return 0.0f;
        }
        if (uwu.A0f) {
            f = uwu.A07();
        } else {
            f = uwu.A00;
        }
        return Math.max(0.0f, f);
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        UWU uwu = this.A04;
        if (uwu == null || (drawable = uwu.A0S) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0K;
        }
        return null;
    }

    public float getChipMinHeight() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A05;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        UWU uwu = this.A04;
        if (uwu == null || (drawable = uwu.A0T) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0N;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0V;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        C14748U7f u7f = this.A0C;
        if (u7f.A01 == 1 || u7f.A00 == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C11356SOs getHideMotionSpec() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0W;
        }
        return null;
    }

    public float getIconEndPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0O;
        }
        return null;
    }

    public C297895sX getShapeAppearanceModel() {
        return this.A04.A00.A0K;
    }

    public C11356SOs getShowMotionSpec() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0X;
        }
        return null;
    }

    public float getTextEndPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        UWU uwu = this.A04;
        if (uwu != null) {
            return uwu.A0C;
        }
        return 0.0f;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0I);
        }
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0b) {
            View.mergeDrawableStates(onCreateDrawableState, A0H);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0A) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0A) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0b(z);
        }
    }

    public void setCheckableResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0b(uwu.A0p.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        UWU uwu = this.A04;
        if (uwu == null) {
            this.A0B = z;
        } else if (uwu.A0b) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.A03) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Y(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Y(C323656xt.A00(uwu.A0p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0U(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0U(02K.A02(uwu.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0c(uwu.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0J != colorStateList) {
            uwu.A0J = colorStateList;
            C13990Tnq.A1B(uwu);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A022;
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0J != (A022 = 02K.A02(uwu.A0p, i))) {
            uwu.A0J = A022;
            C13990Tnq.A1B(uwu);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0M(DbU.A00(uwu.A0p, i));
        }
    }

    public void setChipDrawable(UWU uwu) {
        UWU uwu2 = this.A04;
        if (uwu2 != uwu) {
            if (uwu2 != null) {
                uwu2.A0a = new WeakReference((Object) null);
            }
            this.A04 = uwu;
            uwu.A0g = false;
            uwu.A0a = new WeakReference(this);
            A06(this.A00);
        }
    }

    public void setChipEndPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A01 != f) {
            uwu.A01 = f;
            uwu.invalidateSelf();
            uwu.A0L();
        }
    }

    public void setChipEndPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            float A002 = DbU.A00(uwu.A0p, i);
            if (uwu.A01 != A002) {
                uwu.A01 = A002;
                uwu.invalidateSelf();
                uwu.A0L();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Z(drawable);
        }
    }

    public void setChipIconResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Z(C323656xt.A00(uwu.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0N(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0N(DbU.A00(uwu.A0p, i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0V(02K.A02(uwu.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0d(uwu.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A03 != f) {
            uwu.A03 = f;
            uwu.invalidateSelf();
            uwu.A0L();
        }
    }

    public void setChipMinHeightResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            float A002 = DbU.A00(uwu.A0p, i);
            if (uwu.A03 != A002) {
                uwu.A03 = A002;
                uwu.invalidateSelf();
                uwu.A0L();
            }
        }
    }

    public void setChipStartPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A04 != f) {
            uwu.A04 = f;
            uwu.invalidateSelf();
            uwu.A0L();
        }
    }

    public void setChipStartPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            float A002 = DbU.A00(uwu.A0p, i);
            if (uwu.A04 != A002) {
                uwu.A04 = A002;
                uwu.invalidateSelf();
                uwu.A0L();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0W(02K.A02(uwu.A0p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0O(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0O(DbU.A00(uwu.A0p, i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0a(drawable);
        }
        A02();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0Y != charSequence) {
            C304216Cp A022 = C304216Cp.A02();
            uwu.A0Y = A022.A03(A022.A00, charSequence);
            uwu.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0P(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0P(DbU.A00(uwu.A0p, i));
        }
    }

    public void setCloseIconResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0a(C323656xt.A00(uwu.A0p, i));
        }
        A02();
    }

    public void setCloseIconSize(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Q(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0Q(DbU.A00(uwu.A0p, i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0R(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0R(DbU.A00(uwu.A0p, i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0X(02K.A02(uwu.A0p, i));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            UWU uwu = this.A04;
            if (uwu != null) {
                uwu.A0V = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.A08 = z;
        A06(this.A00);
    }

    public void setHideMotionSpec(C11356SOs sOs) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0W = sOs;
        }
    }

    public void setHideMotionSpecResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0W = C11356SOs.A00(uwu.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0S(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0S(DbU.A00(uwu.A0p, i));
        }
    }

    public void setIconStartPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0T(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0T(DbU.A00(uwu.A0p, i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.A04 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
        A02();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        UWU uwu = this.A04;
        if (!(uwu == null || uwu.A0O == colorStateList)) {
            uwu.A0O = colorStateList;
            C13990Tnq.A1B(uwu);
        }
        A03();
    }

    public void setRippleColorResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            ColorStateList A022 = 02K.A02(uwu.A0p, i);
            if (uwu.A0O != A022) {
                uwu.A0O = A022;
                C13990Tnq.A1B(uwu);
            }
            A03();
        }
    }

    public void setShapeAppearanceModel(C297895sX r2) {
        this.A04.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(C11356SOs sOs) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0X = sOs;
        }
    }

    public void setShowMotionSpecResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0X = C11356SOs.A00(uwu.A0p, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        UWU uwu = this.A04;
        if (uwu != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = uwu.A0g;
            CharSequence charSequence2 = charSequence;
            if (z) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            UWU uwu2 = this.A04;
            if (uwu2 != null && !TextUtils.equals(uwu2.A0Z, charSequence)) {
                uwu2.A0Z = charSequence;
                uwu2.A0v.A02 = true;
                uwu2.invalidateSelf();
                uwu2.A0L();
            }
        }
    }

    public void setTextEndPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0B != f) {
            uwu.A0B = f;
            uwu.invalidateSelf();
            uwu.A0L();
        }
    }

    public void setTextEndPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            float A002 = DbU.A00(uwu.A0p, i);
            if (uwu.A0B != A002) {
                uwu.A0B = A002;
                uwu.invalidateSelf();
                uwu.A0L();
            }
        }
    }

    public void setTextStartPadding(float f) {
        UWU uwu = this.A04;
        if (uwu != null && uwu.A0C != f) {
            uwu.A0C = f;
            uwu.invalidateSelf();
            uwu.A0L();
        }
    }

    public void setTextStartPaddingResource(int i) {
        UWU uwu = this.A04;
        if (uwu != null) {
            float A002 = DbU.A00(uwu.A0p, i);
            if (uwu.A0C != A002) {
                uwu.A0C = A002;
                uwu.invalidateSelf();
                uwu.A0L();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r6 = 2132018519(0x7f140557, float:1.9675347E38)
            r0 = r20
            r14 = r21
            r7 = r22
            android.content.Context r0 = X.C297835sR.A00(r0, r14, r7, r6)
            r8 = r19
            r8.<init>(r0, r14, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A0D = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r8.A0E = r0
            X.UWO r0 = new X.UWO
            r0.<init>(r8)
            r8.A0F = r0
            android.content.Context r5 = r8.getContext()
            if (r21 == 0) goto L_0x0095
            r0 = 220(0xdc, float:3.08E-43)
            java.lang.String r3 = X.Pxd.A00(r0)
            java.lang.String r0 = "background"
            java.lang.String r0 = r14.getAttributeValue(r3, r0)
            java.lang.String r2 = "Chip"
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
        L_0x0042:
            java.lang.String r0 = "drawableLeft"
            java.lang.String r0 = r14.getAttributeValue(r3, r0)
            if (r0 != 0) goto L_0x039b
            java.lang.String r0 = "drawableStart"
            java.lang.String r0 = r14.getAttributeValue(r3, r0)
            if (r0 != 0) goto L_0x0393
            java.lang.String r0 = "drawableEnd"
            java.lang.String r0 = r14.getAttributeValue(r3, r0)
            java.lang.String r1 = "Please set end drawable using R.attr#closeIcon."
            if (r0 != 0) goto L_0x038d
            java.lang.String r0 = "drawableRight"
            java.lang.String r0 = r14.getAttributeValue(r3, r0)
            if (r0 != 0) goto L_0x0387
            java.lang.String r0 = "singleLine"
            r1 = 1
            boolean r0 = r14.getAttributeBooleanValue(r3, r0, r1)
            if (r0 == 0) goto L_0x037f
            java.lang.String r0 = "lines"
            int r0 = r14.getAttributeIntValue(r3, r0, r1)
            if (r0 != r1) goto L_0x037f
            java.lang.String r0 = "minLines"
            int r0 = r14.getAttributeIntValue(r3, r0, r1)
            if (r0 != r1) goto L_0x037f
            java.lang.String r0 = "maxLines"
            int r0 = r14.getAttributeIntValue(r3, r0, r1)
            if (r0 != r1) goto L_0x037f
            java.lang.String r0 = "gravity"
            r1 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r14.getAttributeIntValue(r3, r0, r1)
            if (r0 == r1) goto L_0x0095
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r0)
        L_0x0095:
            X.UWU r4 = new X.UWU
            r4.<init>(r5, r14, r7)
            android.content.Context r13 = r4.A0p
            int[] r15 = X.C297865sU.A06
            r3 = 0
            int[] r0 = new int[r3]
            r18 = r6
            r17 = r7
            r16 = r0
            android.content.res.TypedArray r9 = X.C297855sT.A00(r13, r14, r15, r16, r17, r18)
            r2 = 37
            boolean r0 = r9.hasValue(r2)
            r4.A0f = r0
            r0 = 24
            android.content.res.ColorStateList r1 = X.C309286Xr.A01(r13, r9, r0)
            android.content.res.ColorStateList r0 = r4.A0M
            if (r0 == r1) goto L_0x00c2
            r4.A0M = r1
            X.C13990Tnq.A1B(r4)
        L_0x00c2:
            r0 = 11
            android.content.res.ColorStateList r1 = X.C309286Xr.A01(r13, r9, r0)
            android.content.res.ColorStateList r0 = r4.A0J
            if (r0 == r1) goto L_0x00d1
            r4.A0J = r1
            X.C13990Tnq.A1B(r4)
        L_0x00d1:
            r0 = 19
            r1 = 0
            float r10 = r9.getDimension(r0, r1)
            float r0 = r4.A03
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            r4.A03 = r10
            r4.invalidateSelf()
            r4.A0L()
        L_0x00e6:
            r10 = 12
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x00f5
            float r0 = r9.getDimension(r10, r1)
            r4.A0M(r0)
        L_0x00f5:
            r0 = 22
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r13, r9, r0)
            r4.A0W(r0)
            r0 = 23
            float r0 = r9.getDimension(r0, r1)
            r4.A0O(r0)
            r0 = 36
            android.content.res.ColorStateList r10 = X.C309286Xr.A01(r13, r9, r0)
            android.content.res.ColorStateList r0 = r4.A0O
            if (r0 == r10) goto L_0x0116
            r4.A0O = r10
            X.C13990Tnq.A1B(r4)
        L_0x0116:
            r0 = 5
            java.lang.CharSequence r10 = r9.getText(r0)
            if (r10 != 0) goto L_0x011f
            java.lang.String r10 = ""
        L_0x011f:
            java.lang.CharSequence r0 = r4.A0Z
            boolean r0 = android.text.TextUtils.equals(r0, r10)
            if (r0 != 0) goto L_0x0134
            r4.A0Z = r10
            X.Vjj r10 = r4.A0v
            r0 = 1
            r10.A02 = r0
            r4.invalidateSelf()
            r4.A0L()
        L_0x0134:
            boolean r0 = r9.hasValue(r3)
            if (r0 == 0) goto L_0x037c
            int r0 = r9.getResourceId(r3, r3)
            if (r0 == 0) goto L_0x037c
            X.W0Q r10 = new X.W0Q
            r10.<init>(r13, r0)
        L_0x0145:
            r12 = 1
            float r0 = r10.A00
            float r0 = r9.getDimension(r12, r0)
            r10.A00 = r0
            X.Vjj r0 = r4.A0v
            r0.A01(r13, r10)
            r11 = 3
            int r10 = r9.getInt(r11, r3)
            if (r10 == r12) goto L_0x0378
            r0 = 2
            if (r10 == r0) goto L_0x0374
            if (r10 != r11) goto L_0x0163
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x0161:
            r4.A0V = r0
        L_0x0163:
            r0 = 18
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0d(r0)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r21 == 0) goto L_0x0189
            java.lang.String r0 = "chipIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "chipIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 != 0) goto L_0x0189
            r0 = 15
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0d(r0)
        L_0x0189:
            r0 = 14
            android.graphics.drawable.Drawable r0 = X.C309286Xr.A03(r13, r9, r0)
            r4.A0Z(r0)
            r11 = 17
            boolean r0 = r9.hasValue(r11)
            if (r0 == 0) goto L_0x01a1
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r13, r9, r11)
            r4.A0V(r0)
        L_0x01a1:
            r11 = 16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r9.getDimension(r11, r0)
            r4.A0N(r0)
            r0 = 31
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0e(r0)
            if (r21 == 0) goto L_0x01d0
            java.lang.String r0 = "closeIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 == 0) goto L_0x01d0
            java.lang.String r0 = "closeIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 != 0) goto L_0x01d0
            r0 = 26
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0e(r0)
        L_0x01d0:
            r0 = 25
            android.graphics.drawable.Drawable r0 = X.C309286Xr.A03(r13, r9, r0)
            r4.A0a(r0)
            r0 = 30
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r13, r9, r0)
            r4.A0X(r0)
            r0 = 28
            float r0 = r9.getDimension(r0, r1)
            r4.A0Q(r0)
            r0 = 6
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0b(r0)
            r0 = 10
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0c(r0)
            if (r21 == 0) goto L_0x0217
            java.lang.String r0 = "checkedIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 == 0) goto L_0x0217
            java.lang.String r0 = "checkedIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r10, r0)
            if (r0 != 0) goto L_0x0217
            r0 = 8
            boolean r0 = r9.getBoolean(r0, r3)
            r4.A0c(r0)
        L_0x0217:
            r0 = 7
            android.graphics.drawable.Drawable r0 = X.C309286Xr.A03(r13, r9, r0)
            r4.A0Y(r0)
            r10 = 9
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x022e
            android.content.res.ColorStateList r0 = X.C309286Xr.A01(r13, r9, r10)
            r4.A0U(r0)
        L_0x022e:
            r10 = 39
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0371
            int r0 = r9.getResourceId(r10, r3)
            if (r0 == 0) goto L_0x0371
            X.SOs r0 = X.C11356SOs.A00(r13, r0)
        L_0x0240:
            r4.A0X = r0
            r10 = 33
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x036e
            int r0 = r9.getResourceId(r10, r3)
            if (r0 == 0) goto L_0x036e
            X.SOs r0 = X.C11356SOs.A00(r13, r0)
        L_0x0254:
            r4.A0W = r0
            r0 = 21
            float r10 = r9.getDimension(r0, r1)
            float r0 = r4.A04
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x026a
            r4.A04 = r10
            r4.invalidateSelf()
            r4.A0L()
        L_0x026a:
            r0 = 35
            float r0 = r9.getDimension(r0, r1)
            r4.A0T(r0)
            r0 = 34
            float r0 = r9.getDimension(r0, r1)
            r4.A0S(r0)
            r0 = 41
            float r10 = r9.getDimension(r0, r1)
            float r0 = r4.A0C
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0290
            r4.A0C = r10
            r4.invalidateSelf()
            r4.A0L()
        L_0x0290:
            r0 = 40
            float r10 = r9.getDimension(r0, r1)
            float r0 = r4.A0B
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x02a4
            r4.A0B = r10
            r4.invalidateSelf()
            r4.A0L()
        L_0x02a4:
            r0 = 29
            float r0 = r9.getDimension(r0, r1)
            r4.A0R(r0)
            r0 = 27
            float r0 = r9.getDimension(r0, r1)
            r4.A0P(r0)
            r0 = 13
            float r1 = r9.getDimension(r0, r1)
            float r0 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02ca
            r4.A01 = r1
            r4.invalidateSelf()
            r4.A0L()
        L_0x02ca:
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r9.getDimensionPixelSize(r1, r0)
            r4.A0H = r0
            r9.recycle()
            int[] r0 = new int[r3]
            r16 = r0
            r13 = r5
            android.content.res.TypedArray r9 = X.C297855sT.A00(r13, r14, r15, r16, r17, r18)
            r0 = 32
            boolean r0 = r9.getBoolean(r0, r3)
            r8.A08 = r0
            r0 = 48
            float r0 = X.C295305nv.A00(r5, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r10 = (float) r0
            r0 = 20
            float r0 = r9.getDimension(r0, r10)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r10 = (int) r0
            r8.A00 = r10
            r9.recycle()
            r8.setChipDrawable(r4)
            float r0 = r8.getElevation()
            r4.A0A(r0)
            int[] r0 = new int[r3]
            r10 = r14
            r11 = r15
            r12 = r0
            r13 = r7
            r14 = r6
            r9 = r5
            android.content.res.TypedArray r0 = X.C297855sT.A00(r9, r10, r11, r12, r13, r14)
            boolean r1 = r0.hasValue(r2)
            r0.recycle()
            X.U7f r0 = new X.U7f
            r0.<init>(r8, r8)
            r8.A0C = r0
            r8.A02()
            if (r1 != 0) goto L_0x0336
            X.U3s r0 = new X.U3s
            r0.<init>(r8, r3)
            r8.setOutlineProvider(r0)
        L_0x0336:
            boolean r0 = r8.A0B
            r8.setChecked(r0)
            java.lang.CharSequence r0 = r4.A0Z
            r8.setText(r0)
            android.text.TextUtils$TruncateAt r0 = r4.A0V
            r8.setEllipsize(r0)
            r8.A05()
            X.UWU r0 = r8.A04
            boolean r0 = r0.A0g
            if (r0 != 0) goto L_0x0355
            r0 = 1
            r8.setLines(r0)
            r8.setHorizontallyScrolling(r0)
        L_0x0355:
            r0 = 8388627(0x800013, float:1.175497E-38)
            r8.setGravity(r0)
            r8.A04()
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0367
            int r0 = r8.A00
            r8.setMinHeight(r0)
        L_0x0367:
            int r0 = r8.getLayoutDirection()
            r8.A09 = r0
            return
        L_0x036e:
            r0 = 0
            goto L_0x0254
        L_0x0371:
            r0 = 0
            goto L_0x0240
        L_0x0374:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0161
        L_0x0378:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x0161
        L_0x037c:
            r10 = 0
            goto L_0x0145
        L_0x037f:
            java.lang.String r1 = "Chip does not support multi-line text"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0387:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x038d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0393:
            java.lang.String r1 = "Please set start drawable using R.attr#chipIcon."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x039b:
            java.lang.String r1 = "Please set left drawable using R.attr#chipIcon."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A04() {
        UWU uwu;
        if (!TextUtils.isEmpty(getText()) && (uwu = this.A04) != null) {
            int A0K = (int) (uwu.A01 + uwu.A0B + uwu.A0K());
            int A0J = (int) (uwu.A04 + uwu.A0C + uwu.A0J());
            if (this.A01 != null) {
                Rect rect = new Rect();
                this.A01.getPadding(rect);
                A0J += rect.left;
                A0K += rect.right;
            }
            setPaddingRelative(A0J, getPaddingTop(), A0K, getPaddingBottom());
        }
    }

    private void A05() {
        TextPaint paint = getPaint();
        UWU uwu = this.A04;
        if (uwu != null) {
            paint.drawableState = uwu.getState();
        }
        W0Q textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A03(getContext(), paint, this.A0F);
        }
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A0D;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public final void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        UWU uwu = this.A04;
        if (uwu != null && (drawable = uwu.A0T) != null && drawable.isStateful()) {
            UWU uwu2 = this.A04;
            int isEnabled = isEnabled();
            if (this.A05) {
                isEnabled++;
            }
            if (this.A06) {
                isEnabled++;
            }
            if (this.A07) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.A05) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A06) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.A07) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(uwu2.A0h, iArr)) {
                uwu2.A0h = iArr;
                if (UWU.A05(uwu2) && UWU.A06(uwu2, uwu2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(571470192);
        super.onAttachedToWindow();
        C323946yM.A00(this, this.A04);
        AnonymousClass0fD.A0D(-1067645884, A062);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = AnonymousClass0fD.A06(205850806);
        super.onFocusChanged(z, i, rect);
        this.A0C.A0j(z, i, rect);
        AnonymousClass0fD.A0D(1467851652, A062);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            X.UWU r0 = r7.A04
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.A0b
            if (r0 != 0) goto L_0x0057
        L_0x000b:
            boolean r0 = r7.isClickable()
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "android.view.View"
        L_0x0013:
            r8.setClassName(r0)
            X.UWU r0 = r7.A04
            if (r0 == 0) goto L_0x001f
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r8.setCheckable(r0)
            boolean r0 = r7.isClickable()
            r8.setClickable(r0)
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0080
            android.view.ViewParent r2 = r7.getParent()
            X.U3j r2 = (X.C14716U3j) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0065
            r1 = 0
            r3 = 0
        L_0x003e:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L_0x0065
            android.view.View r0 = r2.getChildAt(r1)
            boolean r0 = r0 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x0054
            android.view.View r0 = r2.getChildAt(r1)
            if (r0 == r7) goto L_0x0066
            int r3 = r3 + 1
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0057:
            X.UWU r0 = r7.A04
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L_0x0013
        L_0x0062:
            java.lang.String r0 = "android.widget.Button"
            goto L_0x0013
        L_0x0065:
            r3 = -1
        L_0x0066:
            r0 = 2131440264(0x7f0b3288, float:1.8502506E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0081
            r1 = -1
        L_0x0072:
            boolean r6 = r7.isChecked()
            r2 = 1
            r5 = 0
            r4 = r2
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r8.setCollectionItemInfo(r0)
        L_0x0080:
            return
        L_0x0081:
            int r1 = X.AnonymousClass7TE.A0M(r1)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A09 != i) {
            this.A09 = i;
            A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r0 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r5 != 3) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (super.onTouchEvent(r7) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1491463464(0x58e5ed28, float:2.02245393E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            int r5 = r7.getActionMasked()
            android.graphics.RectF r2 = r6.getCloseIconTouchBounds()
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 0
            r1 = 1
            if (r5 == 0) goto L_0x005b
            if (r5 == r1) goto L_0x003f
            r0 = 2
            if (r5 == r0) goto L_0x0035
            r0 = 3
            if (r5 == r0) goto L_0x0059
        L_0x0027:
            boolean r0 = super.onTouchEvent(r7)
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            r0 = -1313376603(0xffffffffb1b776a5, float:-5.3394893E-9)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r2
        L_0x0035:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0027
            if (r3 != 0) goto L_0x002d
            r6.setCloseIconPressed(r2)
            goto L_0x002d
        L_0x003f:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0059
            r6.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r6.A02
            if (r0 == 0) goto L_0x004d
            r0.onClick(r6)
        L_0x004d:
            X.U7f r0 = r6.A0C
            r0.A0d(r1, r1)
            r0 = 1
        L_0x0053:
            r6.setCloseIconPressed(r2)
            if (r0 != 0) goto L_0x002d
            goto L_0x0027
        L_0x0059:
            r0 = 0
            goto L_0x0053
        L_0x005b:
            if (r3 == 0) goto L_0x0027
            r6.setCloseIconPressed(r1)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Deprecated
    public void setChipTextResource(int i) {
        DbU.A1A(getResources(), this, i);
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0A(f);
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0H = i;
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        UWU uwu = this.A04;
        if (uwu != null) {
            Context context = uwu.A0p;
            uwu.A0v.A01(context, new W0Q(context, i));
        }
        A05();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCheckedIconVisible(boolean z) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0c(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0d(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0e(z);
        }
        A02();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        UWU uwu = this.A04;
        if (uwu != null) {
            Context context2 = uwu.A0p;
            uwu.A0v.A01(context2, new W0Q(context2, i));
        }
        A05();
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setTextAppearance(W0Q w0q) {
        UWU uwu = this.A04;
        if (uwu != null) {
            uwu.A0v.A01(uwu.A0p, w0q);
        }
        A05();
    }
}
