package com.instagram.igds.components.switchbutton;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.AnonymousClass3Z5;
import X.C300695xf;
import X.C358618bC;
import X.C67611Mqj;
import X.U3w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsSwitch extends CompoundButton implements AnonymousClass3Z5 {
    public static final int A0M;
    public static final AnonymousClass0eM A0N = AnonymousClass0eN.A01(C300695xf.A00);
    public static final boolean A0O;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public C358618bC A07;
    public Boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public Drawable A0D;
    public final Drawable A0E;
    public final Rect A0F;
    public final Rect A0G;
    public final Rect A0H;
    public final Rect A0I;
    public final Drawable A0J;
    public final Drawable A0K;
    public final Drawable A0L;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        int i2;
        int paddingTop;
        int i3;
        int paddingLeft;
        int paddingTop2;
        int i4;
        int i5;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        float f = this.A00 / ((float) this.A02);
        if ((!isEnabled()) && !((Boolean) A0N.getValue()).booleanValue()) {
            f *= 0.3f;
        }
        Drawable drawable3 = this.A0J;
        int i6 = (int) (f * 255.0f);
        drawable3.setAlpha(i6);
        Drawable drawable4 = this.A0L;
        int i7 = (int) ((1.0f - f) * 255.0f);
        drawable4.setAlpha(i7);
        boolean z = A0O;
        if (!z || ((Boolean) A0N.getValue()).booleanValue()) {
            drawable = this.A0K;
            drawable.setAlpha(i6);
            drawable2 = this.A0E;
            drawable2.setAlpha(i7);
        } else {
            drawable = this.A0K;
            drawable.setAlpha(255);
            drawable2 = this.A0E;
            drawable2.setAlpha(255);
        }
        boolean z2 = false;
        if (f == 1.0f) {
            z2 = true;
        }
        ColorFilter colorFilter = null;
        if (z2) {
            Context context = getContext();
            Drawable drawable5 = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
            if (drawable5 != null) {
                this.A0D = drawable5;
                boolean isEnabled = isEnabled();
                int i8 = R.color.igds_secondary_icon;
                if (isEnabled) {
                    i8 = R.color.prism_lock_icon;
                }
                drawable5.setColorFilter(AnonymousClass37O.A00(context.getColor(i8)));
                if (isEnabled()) {
                    drawable.setColorFilter((ColorFilter) null);
                    drawable3.setColorFilter((ColorFilter) null);
                } else {
                    if (z) {
                        boolean booleanValue = ((Boolean) A0N.getValue()).booleanValue();
                        i4 = R.color.carouselIndicatorCustomInActiveColorVariant1;
                        if (booleanValue) {
                            i4 = R.color.prism_disabled_thumb_ax_fix;
                        }
                    } else {
                        i4 = R.color.disabled_thumb_on;
                    }
                    drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(i4)));
                    if (z) {
                        boolean booleanValue2 = ((Boolean) A0N.getValue()).booleanValue();
                        i5 = R.color.prism_disabled_background_on;
                        if (booleanValue2) {
                            i5 = R.color.checkbox_disabled_tint;
                        }
                    } else {
                        i5 = R.color.disabled_background_on;
                    }
                    drawable3.setColorFilter(AnonymousClass37O.A00(context.getColor(i5)));
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (f == 0.0f) {
            Context context2 = getContext();
            Drawable drawable6 = context2.getDrawable(R.drawable.instagram_unlock_pano_filled_24);
            if (drawable6 != null) {
                this.A0D = drawable6;
                boolean isEnabled2 = isEnabled();
                int i9 = R.color.igds_secondary_icon;
                if (isEnabled2) {
                    i9 = R.color.prism_lock_icon;
                }
                drawable6.setColorFilter(AnonymousClass37O.A00(context2.getColor(i9)));
                if (isEnabled()) {
                    drawable2.setColorFilter((ColorFilter) null);
                    if (((Boolean) A0N.getValue()).booleanValue()) {
                        i2 = R.color.prism_enabled_background_off_ax_fix;
                    }
                    drawable4.setColorFilter(colorFilter);
                } else {
                    if (z) {
                        boolean booleanValue3 = ((Boolean) A0N.getValue()).booleanValue();
                        i = R.color.prism_disabled_thumb_off;
                        if (booleanValue3) {
                            i = R.color.prism_disabled_thumb_ax_fix;
                        }
                    } else {
                        i = R.color.disabled_thumb_off;
                    }
                    drawable2.setColorFilter(AnonymousClass37O.A00(context2.getColor(i)));
                    if (z) {
                        boolean booleanValue4 = ((Boolean) A0N.getValue()).booleanValue();
                        i2 = R.color.prism_disabled_background_off;
                        if (booleanValue4) {
                            i2 = R.color.checkbox_disabled_tint;
                        }
                    } else {
                        i2 = R.color.callout_background;
                    }
                }
                colorFilter = AnonymousClass37O.A00(context2.getColor(i2));
                drawable4.setColorFilter(colorFilter);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int i10 = (int) this.A00;
        Rect rect = this.A0I;
        int paddingLeft2 = getPaddingLeft() + i10;
        if (z) {
            i3 = this.A03;
            int i11 = i3 / A0M;
            paddingLeft2 += i11;
            paddingTop = getPaddingTop() + i11;
            paddingLeft = i10 + i3 + getPaddingLeft() + i11;
            paddingTop2 = getPaddingTop() + drawable2.getIntrinsicHeight() + i11;
        } else {
            paddingTop = getPaddingTop();
            i3 = this.A03;
            paddingLeft = i10 + i3 + getPaddingLeft();
            paddingTop2 = getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        rect.set(paddingLeft2, paddingTop, paddingLeft, paddingTop2);
        drawable2.setBounds(rect);
        drawable.setBounds(rect);
        Rect rect2 = this.A0G;
        int i12 = i3 / 4;
        rect2.set(rect.left + i12, rect.top + i12, rect.right - i12, rect.bottom - i12);
        this.A0D.setBounds(rect2);
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        drawable2.draw(canvas);
        drawable.draw(canvas);
        if (this.A0A && z) {
            this.A0D.draw(canvas);
        }
    }

    public final boolean performClick() {
        this.A09 = true;
        return super.performClick();
    }

    public final void setCheckedAnimated(boolean z) {
        this.A09 = true;
        setChecked(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0019;
     */
    static {
        /*
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320330809352497(0x81092600042131, double:3.0324616818432724E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            A0O = r1
            X.5xf r0 = X.C300695xf.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            A0N = r0
            r0 = 5
            if (r1 == 0) goto L_0x0028
            r0 = 6
        L_0x0028:
            A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.switchbutton.IgdsSwitch.<clinit>():void");
    }

    private final boolean getTargetCheckedState() {
        if (this.A00 >= ((float) (this.A02 / 2))) {
            return true;
        }
        return false;
    }

    public final void toggle() {
        C358618bC r2 = this.A07;
        if (r2 == null || r2.onToggle(!isChecked())) {
            super.toggle();
        }
    }

    public final void A00() {
        super.toggle();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-386453948);
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.A06;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        AnonymousClass0fD.A0D(-1973474038, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int paddingTop;
        int paddingLeft;
        int paddingTop2;
        int intrinsicHeight;
        float f;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = A0O;
        Rect rect = this.A0F;
        int paddingLeft2 = getPaddingLeft();
        if (z2) {
            paddingTop = getPaddingTop();
            int paddingLeft3 = getPaddingLeft();
            drawable = this.A0L;
            paddingLeft = paddingLeft3 + drawable.getIntrinsicWidth();
            paddingTop2 = getPaddingTop();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            Drawable drawable2 = this.A0E;
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int i5 = A0M;
            paddingLeft2 += intrinsicWidth / i5;
            drawable = this.A0L;
            paddingTop = (getPaddingTop() + (drawable2.getIntrinsicHeight() / 2)) - (drawable.getIntrinsicHeight() / 2);
            paddingLeft = getPaddingLeft() + (drawable2.getIntrinsicWidth() / i5) + drawable.getIntrinsicWidth();
            paddingTop2 = getPaddingTop() + (drawable2.getIntrinsicHeight() / 2);
            intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        }
        rect.set(paddingLeft2, paddingTop, paddingLeft, paddingTop2 + intrinsicHeight);
        drawable.setBounds(rect);
        this.A0J.setBounds(rect);
        if (isChecked()) {
            f = (float) this.A02;
        } else {
            f = 0.0f;
        }
        this.A00 = f;
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(475612910);
        int[] A002 = C67611Mqj.A00(this.A0H, this.A0J, this.A0E);
        setMeasuredDimension(A002[0], A002[1]);
        AnonymousClass0fD.A0D(-1429226970, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1 != 3) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        if (isEnabled() == false) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = -48712401(0xfffffffffd18b52f, float:-1.2686463E37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r2 = 0
            X.0qQ.A0B(r12, r2)
            android.view.VelocityTracker r0 = r11.A06
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.A06 = r0
            if (r0 == 0) goto L_0x001a
        L_0x0017:
            r0.addMovement(r12)
        L_0x001a:
            int r1 = r12.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x011f
            r7 = 2
            if (r1 == r4) goto L_0x009a
            if (r1 == r7) goto L_0x0034
            r0 = 3
            if (r1 == r0) goto L_0x009a
        L_0x0029:
            boolean r1 = super.onTouchEvent(r12)
            r0 = -674824046(0xffffffffd7c70092, float:-4.37610527E14)
            X.AnonymousClass0fD.A0C(r0, r5)
            return r1
        L_0x0034:
            int r0 = r11.A04
            if (r0 == r4) goto L_0x0064
            if (r0 != r7) goto L_0x0029
            float r6 = r12.getX()
            float r0 = r11.A0B
            float r0 = r6 - r0
            float r3 = r11.A00
            float r2 = r3 + r0
            int r0 = r11.A02
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            r2 = r1
        L_0x004e:
            r1 = 0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            r1 = r2
        L_0x0054:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            r11.A00 = r1
            r11.A0B = r6
            r11.invalidate()
        L_0x005f:
            r0 = 902254701(0x35c7506d, float:1.4850062E-6)
            goto L_0x00fc
        L_0x0064:
            float r6 = r12.getX()
            float r3 = r12.getY()
            float r0 = r11.A0B
            float r0 = r6 - r0
            float r2 = java.lang.Math.abs(r0)
            int r0 = r11.A05
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            float r0 = r11.A0C
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
        L_0x0087:
            r11.A04 = r7
            android.view.ViewParent r0 = r11.getParent()
            if (r0 == 0) goto L_0x0092
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x0092:
            r11.A0B = r6
            r11.A0C = r3
            r0 = -432931273(0xffffffffe631fe37, float:-2.1013708E23)
            goto L_0x00fc
        L_0x009a:
            int r0 = r11.A04
            if (r0 != r7) goto L_0x010a
            r3 = 0
            r11.A04 = r2
            int r0 = r12.getAction()
            if (r0 != r4) goto L_0x00ae
            boolean r0 = r11.isEnabled()
            r2 = 1
            if (r0 != 0) goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r12)
            X.0qQ.A07(r1)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            if (r2 == 0) goto L_0x0105
            android.view.VelocityTracker r2 = r11.A06
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0172
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0)
            android.view.VelocityTracker r0 = r11.A06
            if (r0 == 0) goto L_0x016c
            float r2 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r2)
            int r0 = r11.A01
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            r3 = 1
        L_0x00e6:
            r11.A09 = r4
            java.lang.Boolean r1 = r11.A08
            if (r1 == 0) goto L_0x00f6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f9
        L_0x00f6:
            r11.toggle()
        L_0x00f9:
            r0 = -619610625(0xffffffffdb117dff, float:-4.0952406E16)
        L_0x00fc:
            X.AnonymousClass0fD.A0C(r0, r5)
            return r4
        L_0x0100:
            boolean r3 = r11.getTargetCheckedState()
            goto L_0x00e6
        L_0x0105:
            boolean r3 = r11.isChecked()
            goto L_0x00e6
        L_0x010a:
            r11.A04 = r2
            android.view.VelocityTracker r0 = r11.A06
            if (r0 == 0) goto L_0x0113
            r0.clear()
        L_0x0113:
            android.view.VelocityTracker r0 = r11.A06
            if (r0 == 0) goto L_0x011a
            r0.recycle()
        L_0x011a:
            r0 = 0
            r11.A06 = r0
            goto L_0x0029
        L_0x011f:
            float r3 = r12.getX()
            float r2 = r12.getY()
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L_0x0029
            int r9 = r11.getPaddingTop()
            int r10 = r11.A05
            int r9 = r9 - r10
            int r0 = r11.getPaddingLeft()
            float r6 = (float) r0
            float r1 = r11.A00
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            float r6 = r6 + r1
            float r0 = (float) r10
            float r6 = r6 - r0
            int r8 = (int) r6
            int r7 = r11.A03
            int r7 = r7 + r8
            int r6 = r10 * 2
            int r7 = r7 + r6
            android.graphics.drawable.Drawable r0 = r11.A0E
            int r1 = r0.getIntrinsicHeight()
            int r1 = r1 + r9
            int r1 = r1 + r6
            float r0 = (float) r8
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            float r0 = (float) r7
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            float r0 = (float) r9
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            r11.A04 = r4
            r11.A0B = r3
            r11.A0C = r2
            goto L_0x0029
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.switchbutton.IgdsSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        int i;
        super.setChecked(z);
        Boolean bool = this.A08;
        if (bool != null && !bool.equals(Boolean.valueOf(z))) {
            clearAnimation();
        }
        this.A08 = Boolean.valueOf(z);
        if (z) {
            i = this.A02;
        } else {
            i = 0;
        }
        if (!this.A09 || super.getWindowToken() == null) {
            this.A00 = (float) i;
            invalidate();
        } else {
            clearAnimation();
            startAnimation(new U3w(this, this.A00, (float) i));
        }
        this.A09 = false;
    }

    public final void setToggleListener(C358618bC r1) {
        this.A07 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int intrinsicWidth;
        int i2;
        Drawable drawable;
        0qQ.A0B(context, 1);
        this.A0F = new Rect();
        this.A0I = new Rect();
        this.A0G = new Rect();
        this.A0H = new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        super.setClickable(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        0qQ.A07(viewConfiguration);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        if (A0O) {
            Drawable drawable2 = context.getDrawable(R.drawable.prism_switch_handle);
            if (drawable2 != null) {
                this.A0E = drawable2;
                Drawable drawable3 = context.getDrawable(R.drawable.prism_switch_handle);
                if (drawable3 != null) {
                    this.A0K = drawable3;
                    Drawable drawable4 = context.getDrawable(R.drawable.prism_switch_background);
                    if (drawable4 != null) {
                        this.A0L = drawable4;
                        Drawable drawable5 = context.getDrawable(R.drawable.prism_switch_background_active);
                        if (drawable5 != null) {
                            this.A0J = drawable5;
                            this.A03 = drawable3.getIntrinsicWidth();
                            intrinsicWidth = drawable4.getIntrinsicWidth();
                            i2 = this.A03 * 8;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Drawable drawable6 = context.getDrawable(R.drawable.new_toggle_nub);
            if (drawable6 != null) {
                this.A0E = drawable6;
                Drawable drawable7 = context.getDrawable(R.drawable.new_toggle_nub_active);
                if (drawable7 != null) {
                    this.A0K = drawable7;
                    Drawable drawable8 = context.getDrawable(R.drawable.new_toggle);
                    if (drawable8 != null) {
                        this.A0L = drawable8;
                        Drawable drawable9 = context.getDrawable(R.drawable.new_toggle_active);
                        if (drawable9 != null) {
                            this.A0J = drawable9;
                            this.A03 = drawable7.getIntrinsicWidth();
                            intrinsicWidth = drawable8.getIntrinsicWidth();
                            i2 = this.A03 * 3;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A02 = intrinsicWidth - (i2 / A0M);
        if (this.A0A) {
            drawable = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            drawable = context.getDrawable(R.drawable.instagram_unlock_pano_filled_24);
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A0D = drawable;
        this.A03 = this.A0E.getIntrinsicWidth();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
