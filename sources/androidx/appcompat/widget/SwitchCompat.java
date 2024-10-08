package androidx.appcompat.widget;

import X.03v;
import X.AnonymousClass0fD;
import X.AnonymousClass3NX;
import X.AnonymousClass3Tm;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13993Tnu;
import X.C14638Tzk;
import X.C14759U7q;
import X.C242413Ty;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.instagram.android.R;

public class SwitchCompat extends CompoundButton {
    public static final Property A0i = new C14638Tzk(0);
    public static final int[] A0j = {16842912};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ObjectAnimator A08;
    public ColorStateList A09;
    public Drawable A0A;
    public Drawable A0B;
    public TransformationMethod A0C;
    public VelocityTracker A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public float A0G;
    public float A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public PorterDuff.Mode A0Q;
    public PorterDuff.Mode A0R;
    public Layout A0S;
    public Layout A0T;
    public AnonymousClass3Tm A0U;
    public C14759U7q A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Rect A0f;
    public final TextPaint A0g;
    public final C242413Ty A0h;

    /* JADX WARNING: type inference failed for: r1v10, types: [X.W7r, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r11 = r15
            r8 = r16
            r10 = r17
            r13 = r18
            r15.<init>(r8, r10, r13)
            r1 = 0
            r15.A0O = r1
            r15.A0Q = r1
            r14 = 0
            r15.A0Z = r14
            r15.A0a = r14
            r15.A0P = r1
            r15.A0R = r1
            r15.A0b = r14
            r15.A0c = r14
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r15.A0D = r0
            r4 = 1
            r15.A0Y = r4
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.A0f = r0
            android.content.Context r3 = r15.getContext()
            X.C242363Tt.A03(r15, r3)
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>(r4)
            r15.A0g = r2
            android.util.DisplayMetrics r0 = X.C13988Tno.A0F(r15)
            float r0 = r0.density
            r2.density = r0
            int[] r12 = X.AnonymousClass2Z3.A0M
            X.2Yi r2 = X.2Yi.A00(r8, r10, r12, r13, r14)
            android.content.res.TypedArray r9 = r2.A02
            X.03v.A06(r8, r9, r10, r11, r12, r13, r14)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            r15.A0A = r0
            if (r0 == 0) goto L_0x0059
            r0.setCallback(r15)
        L_0x0059:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            r15.A0B = r0
            if (r0 == 0) goto L_0x0066
            r0.setCallback(r15)
        L_0x0066:
            java.lang.CharSequence r0 = r9.getText(r14)
            r15.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r9.getText(r4)
            r15.setTextOffInternal(r0)
            r0 = 3
            boolean r0 = r9.getBoolean(r0, r4)
            r15.A0d = r0
            r0 = 8
            int r0 = r9.getDimensionPixelSize(r0, r14)
            r15.A0N = r0
            r0 = 5
            int r0 = r9.getDimensionPixelSize(r0, r14)
            r15.A0J = r0
            r0 = 6
            int r0 = r9.getDimensionPixelSize(r0, r14)
            r15.A0K = r0
            r0 = 4
            boolean r0 = r9.getBoolean(r0, r14)
            r15.A0e = r0
            r0 = 9
            android.content.res.ColorStateList r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00a4
            r15.A0O = r0
            r15.A0Z = r4
        L_0x00a4:
            r0 = 10
            r6 = -1
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass3NX.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r15.A0Q
            if (r0 == r5) goto L_0x00b7
            r15.A0Q = r5
            r15.A0a = r4
        L_0x00b7:
            boolean r0 = r15.A0Z
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r15.A0a
            if (r0 == 0) goto L_0x00c2
        L_0x00bf:
            r15.A01()
        L_0x00c2:
            r0 = 12
            android.content.res.ColorStateList r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00ce
            r15.A0P = r0
            r15.A0b = r4
        L_0x00ce:
            r0 = 13
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass3NX.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r15.A0R
            if (r0 == r1) goto L_0x00e0
            r15.A0R = r1
            r15.A0c = r4
        L_0x00e0:
            boolean r0 = r15.A0b
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r15.A0c
            if (r0 == 0) goto L_0x00eb
        L_0x00e8:
            r15.A02()
        L_0x00eb:
            r0 = 7
            int r1 = r9.getResourceId(r0, r14)
            if (r1 == 0) goto L_0x0180
            int[] r0 = X.AnonymousClass2Z3.A0N
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r1, r0)
            X.2Yi r1 = new X.2Yi
            r1.<init>(r8, r0)
            r5 = 3
            android.content.res.ColorStateList r0 = r1.A01(r5)
            if (r0 != 0) goto L_0x0108
            android.content.res.ColorStateList r0 = r15.getTextColors()
        L_0x0108:
            r15.A09 = r0
            android.content.res.TypedArray r2 = r1.A02
            int r0 = r2.getDimensionPixelSize(r14, r14)
            if (r0 == 0) goto L_0x0123
            float r7 = (float) r0
            android.text.TextPaint r1 = r15.A0g
            float r0 = r1.getTextSize()
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            r1.setTextSize(r7)
            r15.requestLayout()
        L_0x0123:
            int r1 = r2.getInt(r4, r6)
            r0 = 2
            int r7 = r2.getInt(r0, r6)
            if (r1 == r4) goto L_0x01cc
            if (r1 == r0) goto L_0x01c8
            if (r1 == r5) goto L_0x01c4
            r1 = 0
        L_0x0133:
            r5 = 0
            r6 = 0
            if (r7 <= 0) goto L_0x01b8
            if (r1 != 0) goto L_0x01b3
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
        L_0x013d:
            r15.setSwitchTypeface(r0)
            if (r0 == 0) goto L_0x01b1
            int r0 = r0.getStyle()
        L_0x0146:
            r4 = r0 ^ -1
            r4 = r4 & r7
            android.text.TextPaint r1 = r15.A0g
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0150
            r6 = 1
        L_0x0150:
            r1.setFakeBoldText(r6)
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0159
            r5 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0159:
            r1.setTextSkewX(r5)
        L_0x015c:
            r0 = 14
            boolean r0 = r2.getBoolean(r0, r14)
            if (r0 == 0) goto L_0x01af
            X.W7r r1 = new X.W7r
            r1.<init>()
            android.content.res.Configuration r0 = X.Pxf.A0G(r3)
            java.util.Locale r0 = r0.locale
            r1.A00 = r0
        L_0x0171:
            r15.A0C = r1
            java.lang.CharSequence r0 = r15.A0F
            r15.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r15.A0E
            r15.setTextOffInternal(r0)
            r2.recycle()
        L_0x0180:
            X.3Ty r0 = new X.3Ty
            r0.<init>(r15)
            r15.A0h = r0
            r0.A08(r10, r13)
            r9.recycle()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r8)
            int r0 = r1.getScaledTouchSlop()
            r15.A07 = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r15.A01 = r0
            X.3Tm r0 = r15.getEmojiTextViewHelper()
            r0.A00(r10, r13)
            r15.refreshDrawableState()
            boolean r0 = r15.isChecked()
            r15.setChecked(r0)
            return
        L_0x01af:
            r1 = 0
            goto L_0x0171
        L_0x01b1:
            r0 = 0
            goto L_0x0146
        L_0x01b3:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r7)
            goto L_0x013d
        L_0x01b8:
            android.text.TextPaint r0 = r15.A0g
            r0.setFakeBoldText(r14)
            r0.setTextSkewX(r5)
            r15.setSwitchTypeface(r1)
            goto L_0x015c
        L_0x01c4:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            goto L_0x0133
        L_0x01c8:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            goto L_0x0133
        L_0x01cc:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private StaticLayout A00(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.A0g;
        CharSequence charSequence2 = charSequence;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void A01() {
        Drawable drawable = this.A0A;
        if (drawable == null) {
            return;
        }
        if (this.A0Z || this.A0a) {
            Drawable mutate = drawable.mutate();
            this.A0A = mutate;
            if (this.A0Z) {
                mutate.setTintList(this.A0O);
            }
            if (this.A0a) {
                this.A0A.setTintMode(this.A0Q);
            }
            if (this.A0A.isStateful()) {
                C13988Tno.A0x(this.A0A, this);
            }
        }
    }

    private void A02() {
        Drawable drawable = this.A0B;
        if (drawable == null) {
            return;
        }
        if (this.A0b || this.A0c) {
            Drawable mutate = drawable.mutate();
            this.A0B = mutate;
            if (this.A0b) {
                mutate.setTintList(this.A0P);
            }
            if (this.A0c) {
                this.A0B.setTintMode(this.A0R);
            }
            if (this.A0B.isStateful()) {
                C13988Tno.A0x(this.A0B, this);
            }
        }
    }

    private void A03() {
        if (this.A0V == null && this.A0U.A00.A00.A03() && C13993Tnu.A09 != null) {
            C13993Tnu A002 = C13993Tnu.A00();
            int A012 = A002.A01();
            if (A012 == 3 || A012 == 0) {
                C14759U7q u7q = new C14759U7q(this);
                this.A0V = u7q;
                A002.A04(u7q);
            }
        }
    }

    private AnonymousClass3Tm getEmojiTextViewHelper() {
        AnonymousClass3Tm r0 = this.A0U;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3Tm r02 = new AnonymousClass3Tm(this);
        this.A0U = r02;
        return r02;
    }

    private boolean getTargetCheckedState() {
        return AnonymousClass7TF.A1R((this.A00 > 0.5f ? 1 : (this.A00 == 0.5f ? 0 : -1)));
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0B;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.A0f;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.A0A;
        if (drawable2 != null) {
            rect = AnonymousClass3NX.A01(drawable2);
        } else {
            rect = AnonymousClass3NX.A00;
        }
        return ((((this.A0M - this.A05) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.A0E = charSequence;
        AnonymousClass3Tm emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod A002 = emojiTextViewHelper.A00.A00.A00(this.A0C);
        if (A002 != null) {
            charSequence = A002.getTransformation(charSequence, this);
        }
        this.A0W = charSequence;
        this.A0S = null;
        if (this.A0d) {
            A03();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A0F = charSequence;
        AnonymousClass3Tm emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod A002 = emojiTextViewHelper.A00.A00.A00(this.A0C);
        if (A002 != null) {
            charSequence = A002.getTransformation(charSequence, this);
        }
        this.A0X = charSequence;
        this.A0T = null;
        if (this.A0d) {
            A03();
        }
    }

    public final void A04() {
        setTextOnInternal(this.A0F);
        setTextOffInternal(this.A0E);
        requestLayout();
    }

    public boolean getShowText() {
        return this.A0d;
    }

    public boolean getSplitTrack() {
        return this.A0e;
    }

    public int getSwitchMinWidth() {
        return this.A0J;
    }

    public int getSwitchPadding() {
        return this.A0K;
    }

    public CharSequence getTextOff() {
        return this.A0E;
    }

    public CharSequence getTextOn() {
        return this.A0F;
    }

    public Drawable getThumbDrawable() {
        return this.A0A;
    }

    public final float getThumbPosition() {
        return this.A00;
    }

    public int getThumbTextPadding() {
        return this.A0N;
    }

    public ColorStateList getThumbTintList() {
        return this.A0O;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0Q;
    }

    public Drawable getTrackDrawable() {
        return this.A0B;
    }

    public ColorStateList getTrackTintList() {
        return this.A0P;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0R;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0j);
        }
        return onCreateDrawableState;
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.A0Y = z;
        invalidate();
    }

    public void setShowText(boolean z) {
        if (this.A0d != z) {
            this.A0d = z;
            requestLayout();
            if (z) {
                A03();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0e = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A0J = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A0K = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0g;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        C13989Tnp.A14(this.A0A);
        this.A0A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.A0N = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0O = colorStateList;
        this.A0Z = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0Q = mode;
        this.A0a = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        C13989Tnp.A14(this.A0B);
        this.A0B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0P = colorStateList;
        this.A0b = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0R = mode;
        this.A0c = true;
        A02();
    }

    private int getThumbOffset() {
        float f;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.A00;
        } else {
            f = this.A00;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int A032 = AnonymousClass0fD.A03(-1118505062);
        Rect rect2 = this.A0f;
        int i = this.A03;
        int i2 = this.A04;
        int i3 = this.A0L;
        int i4 = this.A02;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0A;
        if (drawable != null) {
            rect = AnonymousClass3NX.A01(drawable);
        } else {
            rect = AnonymousClass3NX.A00;
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = i2;
            if (i7 > i8) {
                i9 = (i7 - i8) + i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4;
            if (i12 > i13) {
                i14 = i4 - (i12 - i13);
            }
            this.A0B.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0A;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A05 + rect2.right;
            this.A0A.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
        AnonymousClass0fD.A0A(-2103423384, A032);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0A;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (!z) {
            return compoundPaddingLeft;
        }
        int i = compoundPaddingLeft + this.A0M;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0K;
        }
        return i;
    }

    public int getCompoundPaddingRight() {
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (z) {
            return compoundPaddingRight;
        }
        int i = compoundPaddingRight + this.A0M;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0K;
        }
        return i;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A08.end();
            this.A08 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0f;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A02;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0A;
        if (drawable != null) {
            if (!this.A0e || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = AnonymousClass3NX.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0T;
        } else {
            layout = this.A0S;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A09;
            if (colorStateList != null) {
                this.A0g.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0g.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.A0F;
            } else {
                charSequence = this.A0E;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0G2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A0A != null) {
            Rect rect = this.A0f;
            Drawable drawable = this.A0B;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = AnonymousClass3NX.A01(this.A0A);
            i5 = C13988Tno.A07(A012.left, rect.left, 0);
            i9 = C13988Tno.A07(A012.right, rect.right, 0);
        } else {
            i5 = 0;
        }
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            A0G2 = ((this.A0M + i6) - i5) - i9;
        } else {
            A0G2 = C13989Tnp.A0G(this) - i9;
            i6 = (A0G2 - this.A0M) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A0I;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.A0I;
        } else {
            i8 = C13989Tnp.A0F(this);
            paddingTop = i8 - this.A0I;
            this.A03 = i6;
            this.A04 = paddingTop;
            this.A02 = i8;
            this.A0L = A0G2;
        }
        i8 = i7 + paddingTop;
        this.A03 = i6;
        this.A04 = paddingTop;
        this.A02 = i8;
        this.A0L = A0G2;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int A062 = AnonymousClass0fD.A06(1754638480);
        if (this.A0d) {
            if (this.A0T == null) {
                this.A0T = A00(this.A0X);
            }
            if (this.A0S == null) {
                this.A0S = A00(this.A0W);
            }
        }
        Rect rect = this.A0f;
        Drawable drawable = this.A0A;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0A.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0A.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0d) {
            i5 = Math.max(this.A0T.getWidth(), this.A0S.getWidth()) + (this.A0N * 2);
        } else {
            i5 = 0;
        }
        this.A05 = Math.max(i5, i3);
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.A0B.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.A0A;
        if (drawable3 != null) {
            Rect A012 = AnonymousClass3NX.A01(drawable3);
            i8 = Math.max(i8, A012.left);
            i9 = Math.max(i9, A012.right);
        }
        if (this.A0Y) {
            i6 = Math.max(this.A0J, (this.A05 * 2) + i8 + i9);
        } else {
            i6 = this.A0J;
        }
        int max = Math.max(i7, i4);
        this.A0M = i6;
        this.A0I = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
        AnonymousClass0fD.A0D(1799498547, A062);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0F;
        } else {
            charSequence = this.A0E;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (isEnabled() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1730099252(0x671f3834, float:7.51893E23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            android.view.VelocityTracker r8 = r10.A0D
            r8.addMovement(r11)
            int r1 = r11.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x010e
            r7 = 2
            if (r1 == r4) goto L_0x0099
            if (r1 == r7) goto L_0x0026
            r0 = 3
            if (r1 == r0) goto L_0x0099
        L_0x001b:
            boolean r1 = super.onTouchEvent(r11)
            r0 = -934947634(0xffffffffc845d4ce, float:-202579.22)
            X.AnonymousClass0fD.A0C(r0, r5)
            return r1
        L_0x0026:
            int r0 = r10.A06
            if (r0 == r4) goto L_0x006d
            if (r0 != r7) goto L_0x001b
            float r7 = r11.getX()
            int r2 = r10.getThumbScrollRange()
            float r0 = r10.A0G
            float r1 = r7 - r0
            r6 = 0
            if (r2 == 0) goto L_0x0064
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x003d:
            int r0 = r10.getLayoutDirection()
            if (r0 != r4) goto L_0x0044
            float r1 = -r1
        L_0x0044:
            float r3 = r10.A00
            float r2 = r3 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            r2 = 0
        L_0x004f:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
            r10.A0G = r7
            r10.setThumbPosition(r2)
        L_0x0058:
            r0 = -894055266(0xffffffffcab5cc9e, float:-5957199.0)
            goto L_0x00f4
        L_0x005d:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004f
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004f
        L_0x0064:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x003d
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x006d:
            float r6 = r11.getX()
            float r3 = r11.getY()
            float r0 = r10.A0G
            float r2 = X.AnonymousClass7TE.A00(r6, r0)
            int r0 = r10.A07
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008c
            float r0 = r10.A0H
            float r0 = X.AnonymousClass7TE.A00(r3, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
        L_0x008c:
            r10.A06 = r7
            X.JTP.A15(r10, r4)
            r10.A0G = r6
            r10.A0H = r3
            r0 = 1767748952(0x695db558, float:1.6751811E25)
            goto L_0x00f4
        L_0x0099:
            int r0 = r10.A06
            if (r0 != r7) goto L_0x0106
            r6 = 0
            r10.A06 = r6
            int r0 = r11.getAction()
            r3 = 1
            if (r0 != r4) goto L_0x00ae
            boolean r1 = r10.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            boolean r2 = r10.isChecked()
            if (r0 == 0) goto L_0x0104
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            float r7 = r8.getXVelocity()
            float r1 = java.lang.Math.abs(r7)
            int r0 = r10.A01
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            int r0 = r10.getLayoutDirection()
            boolean r1 = X.C13988Tno.A1W(r0, r4)
            r0 = 0
            if (r1 == 0) goto L_0x00f8
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fd
        L_0x00d8:
            if (r3 == r2) goto L_0x00dd
            r10.playSoundEffect(r6)
        L_0x00dd:
            r10.setChecked(r3)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r11)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            super.onTouchEvent(r11)
            r0 = 1603188502(0x5f8eb716, float:2.0567425E19)
        L_0x00f4:
            X.AnonymousClass0fD.A0C(r0, r5)
            return r4
        L_0x00f8:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            goto L_0x00d8
        L_0x00fd:
            r3 = 0
            goto L_0x00d8
        L_0x00ff:
            boolean r3 = r10.getTargetCheckedState()
            goto L_0x00d8
        L_0x0104:
            r3 = r2
            goto L_0x00d8
        L_0x0106:
            r0 = 0
            r10.A06 = r0
            r8.clear()
            goto L_0x001b
        L_0x010e:
            float r3 = r11.getX()
            float r2 = r11.getY()
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x001b
            android.graphics.drawable.Drawable r0 = r10.A0A
            if (r0 == 0) goto L_0x001b
            int r6 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r0 = r10.A0A
            android.graphics.Rect r1 = r10.A0f
            r0.getPadding(r1)
            int r8 = r10.A04
            int r9 = r10.A07
            int r8 = r8 - r9
            int r7 = r10.A03
            int r7 = r7 + r6
            int r7 = r7 - r9
            int r6 = r10.A05
            int r6 = r6 + r7
            int r0 = r1.left
            int r6 = r6 + r0
            int r0 = r1.right
            int r6 = r6 + r0
            int r6 = r6 + r9
            int r1 = r10.A02
            int r1 = r1 + r9
            float r0 = (float) r7
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            float r0 = (float) r8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            r10.A06 = r4
            r10.A0G = r3
            r10.A0H = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r6) {
        /*
            r5 = this;
            super.setChecked(r6)
            boolean r2 = r5.isChecked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 == 0) goto L_0x0050
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0F
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131951964(0x7f13015c, float:1.9540357E38)
        L_0x001a:
            java.lang.String r0 = r1.getString(r0)
        L_0x001e:
            X.03v.A0G(r5, r0)
        L_0x0021:
            android.os.IBinder r0 = r5.getWindowToken()
            if (r0 == 0) goto L_0x005e
            boolean r0 = r5.isLaidOut()
            if (r0 == 0) goto L_0x005e
            r4 = 0
            if (r2 == 0) goto L_0x0032
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0032:
            android.util.Property r2 = A0i
            r3 = 1
            float[] r1 = new float[r3]
            r0 = 0
            r1[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            r5.A08 = r2
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r0 = r5.A08
            r0.setAutoCancel(r3)
            android.animation.ObjectAnimator r0 = r5.A08
            r0.start()
            return
        L_0x0050:
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0E
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131951963(0x7f13015b, float:1.9540355E38)
            goto L_0x001a
        L_0x005e:
            android.animation.ObjectAnimator r0 = r5.A08
            if (r0 == 0) goto L_0x0065
            r0.cancel()
        L_0x0065:
            r0 = 0
            if (r2 == 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x006a:
            r5.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.setChecked(boolean):void");
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
        setTextOnInternal(this.A0F);
        setTextOffInternal(this.A0E);
        requestLayout();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0E;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(2131951963);
            }
            03v.A0G(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0F;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(2131951964);
            }
            03v.A0G(this, charSequence2);
        }
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C13990Tnq.A0E(this, i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C13990Tnq.A0E(this, i));
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0A || drawable == this.A0B) {
            return true;
        }
        return false;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }
}
