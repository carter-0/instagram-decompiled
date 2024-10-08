package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class UWU extends C297875sV implements Drawable.Callback, C20973X7d {
    public static final ShapeDrawable A0w = new ShapeDrawable(new OvalShape());
    public static final int[] A0x = {16842910};
    public float A00 = -1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D = 255;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ColorStateList A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorFilter A0P;
    public PorterDuffColorFilter A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public Drawable A0T;
    public Drawable A0U;
    public TextUtils.TruncateAt A0V;
    public C11356SOs A0W;
    public C11356SOs A0X;
    public CharSequence A0Y;
    public CharSequence A0Z;
    public WeakReference A0a = new WeakReference((Object) null);
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public int[] A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public PorterDuff.Mode A0m = PorterDuff.Mode.SRC_IN;
    public boolean A0n;
    public boolean A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q = new Paint.FontMetrics();
    public final Paint A0r = new Paint(1);
    public final Path A0s = new Path();
    public final PointF A0t = new PointF();
    public final RectF A0u = new RectF();
    public final C18007Vjj A0v;

    public final void A0V(ColorStateList colorStateList) {
        this.A0o = true;
        if (this.A0K != colorStateList) {
            this.A0K = colorStateList;
            if (A04()) {
                this.A0S.setTintList(colorStateList);
            }
            C13990Tnq.A1B(this);
        }
    }

    private void A01(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            Drawable drawable2 = this.A0T;
            boolean isStateful = drawable.isStateful();
            if (drawable == drawable2) {
                if (isStateful) {
                    drawable.setState(this.A0h);
                }
                drawable.setTintList(this.A0N);
                return;
            }
            if (isStateful) {
                drawable.setState(getState());
            }
            Drawable drawable3 = this.A0S;
            if (drawable == drawable3 && this.A0o) {
                drawable3.setTintList(this.A0K);
            }
        }
    }

    private boolean A02() {
        if (!this.A0c || this.A0R == null || !this.A0e) {
            return false;
        }
        return true;
    }

    private boolean A04() {
        if (!this.A0n || this.A0S == null) {
            return false;
        }
        return true;
    }

    public static boolean A05(UWU uwu) {
        if (!uwu.A0d || uwu.A0T == null) {
            return false;
        }
        return true;
    }

    public final void A0L() {
        X18 x18 = (X18) this.A0a.get();
        if (x18 != null) {
            Chip chip = (Chip) x18;
            chip.A06(chip.A00);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Deprecated
    public final void A0M(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            setShapeAppearanceModel(C13991Tnr.A0K(this.A00.A0K, f));
        }
    }

    public final void A0N(float f) {
        if (this.A02 != f) {
            float A0J2 = A0J();
            this.A02 = f;
            float A0J3 = A0J();
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0O(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            if (this.A0f) {
                this.A00.A04 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void A0P(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0Q(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0R(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A05(this)) {
                A0L();
            }
        }
    }

    public final void A0S(float f) {
        if (this.A09 != f) {
            float A0J2 = A0J();
            this.A09 = f;
            float A0J3 = A0J();
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0T(float f) {
        if (this.A0A != f) {
            float A0J2 = A0J();
            this.A0A = f;
            float A0J3 = A0J();
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0U(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0I != colorStateList) {
            this.A0I = colorStateList;
            if (this.A0c && (drawable = this.A0R) != null && this.A0b) {
                drawable.setTintList(colorStateList);
            }
            C13990Tnq.A1B(this);
        }
    }

    public final void A0W(ColorStateList colorStateList) {
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            if (this.A0f) {
                A0G(colorStateList);
            }
            C13990Tnq.A1B(this);
        }
    }

    public final void A0X(ColorStateList colorStateList) {
        if (this.A0N != colorStateList) {
            this.A0N = colorStateList;
            if (A05(this)) {
                this.A0T.setTintList(colorStateList);
            }
            C13990Tnq.A1B(this);
        }
    }

    public final void A0Y(Drawable drawable) {
        if (this.A0R != drawable) {
            float A0J2 = A0J();
            this.A0R = drawable;
            float A0J3 = A0J();
            C13989Tnp.A14(this.A0R);
            A01(this.A0R);
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0Z(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0S;
        if (drawable3 == null) {
            drawable3 = null;
        }
        if (drawable3 != drawable) {
            float A0J2 = A0J();
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.A0S = drawable2;
            float A0J3 = A0J();
            C13989Tnp.A14(drawable3);
            if (A04()) {
                A01(this.A0S);
            }
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0a(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0T;
        if (drawable3 == null) {
            drawable3 = null;
        }
        if (drawable3 != drawable) {
            float A0K2 = A0K();
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.A0T = drawable2;
            ColorStateList colorStateList = this.A0O;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0U = new RippleDrawable(colorStateList, this.A0T, A0w);
            float A0K3 = A0K();
            C13989Tnp.A14(drawable3);
            if (A05(this)) {
                A01(this.A0T);
            }
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0L();
            }
        }
    }

    public final void A0b(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            float A0J2 = A0J();
            if (!z && this.A0e) {
                this.A0e = false;
            }
            float A0J3 = A0J();
            invalidateSelf();
            if (A0J2 != A0J3) {
                A0L();
            }
        }
    }

    public final void A0c(boolean z) {
        if (this.A0c != z) {
            boolean A022 = A02();
            this.A0c = z;
            boolean A023 = A02();
            if (A022 != A023) {
                Drawable drawable = this.A0R;
                if (A023) {
                    A01(drawable);
                } else {
                    C13989Tnp.A14(drawable);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    public final void A0d(boolean z) {
        if (this.A0n != z) {
            boolean A042 = A04();
            this.A0n = z;
            boolean A043 = A04();
            if (A042 != A043) {
                Drawable drawable = this.A0S;
                if (A043) {
                    A01(drawable);
                } else {
                    C13989Tnp.A14(drawable);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    public final void A0e(boolean z) {
        if (this.A0d != z) {
            boolean A052 = A05(this);
            this.A0d = z;
            boolean A053 = A05(this);
            if (A052 != A053) {
                Drawable drawable = this.A0T;
                if (A053) {
                    A01(drawable);
                } else {
                    C13989Tnp.A14(drawable);
                }
                invalidateSelf();
                A0L();
            }
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0D) != 0) {
            int i2 = 0;
            Canvas canvas2 = canvas;
            if (i < 255) {
                i2 = canvas2.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i);
            }
            if (!this.A0f) {
                Paint paint = this.A0r;
                C13988Tno.A0p(this.A0G, paint);
                RectF rectF = this.A0u;
                rectF.set(bounds);
                if (this.A0f) {
                    f4 = A07();
                } else {
                    f4 = this.A00;
                }
                if (this.A0f) {
                    f5 = A07();
                } else {
                    f5 = this.A00;
                }
                canvas2.drawRoundRect(rectF, f4, f5, paint);
            }
            if (!this.A0f) {
                Paint paint2 = this.A0r;
                C13988Tno.A0p(this.A0E, paint2);
                ColorFilter colorFilter = this.A0P;
                if (colorFilter == null) {
                    colorFilter = this.A0Q;
                }
                paint2.setColorFilter(colorFilter);
                RectF rectF2 = this.A0u;
                rectF2.set(bounds);
                if (this.A0f) {
                    f2 = A07();
                } else {
                    f2 = this.A00;
                }
                if (this.A0f) {
                    f3 = A07();
                } else {
                    f3 = this.A00;
                }
                canvas2.drawRoundRect(rectF2, f2, f3, paint2);
            }
            if (this.A0f) {
                super.draw(canvas2);
            }
            if (this.A05 > 0.0f && !this.A0f) {
                Paint paint3 = this.A0r;
                paint3.setColor(this.A0F);
                JTO.A1N(paint3);
                if (!this.A0f) {
                    ColorFilter colorFilter2 = this.A0P;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0Q;
                    }
                    paint3.setColorFilter(colorFilter2);
                }
                RectF rectF3 = this.A0u;
                float f6 = this.A05 / 2.0f;
                rectF3.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.A00 - (this.A05 / 2.0f);
                canvas2.drawRoundRect(rectF3, f7, f7, paint3);
            }
            Paint paint4 = this.A0r;
            C13988Tno.A0p(0, paint4);
            RectF rectF4 = this.A0u;
            rectF4.set(bounds);
            if (!this.A0f) {
                float f8 = this.A00;
                canvas2.drawRoundRect(rectF4, f8, f8, paint4);
            } else {
                RectF rectF5 = new RectF(bounds);
                Path path = this.A0s;
                C297985sg r11 = this.A0E;
                C297955sd r0 = this.A00;
                C297985sg r16 = r11;
                r16.A01(path, rectF5, r0.A0K, this.A0D, r0.A01);
                RectF rectF6 = this.A0C;
                C13988Tno.A0v(rectF6, this);
                C297895sX r1 = this.A00.A0K;
                if (r1.A03(rectF6)) {
                    float ArV = r1.A03.ArV(rectF6) * this.A00.A01;
                    canvas2.drawRoundRect(rectF6, ArV, ArV, paint4);
                } else {
                    canvas2.drawPath(path, paint4);
                }
            }
            if (A04()) {
                A00(bounds, rectF4);
                float f9 = rectF4.left;
                float f10 = rectF4.top;
                canvas2.translate(f9, f10);
                this.A0S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0S.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (A02()) {
                A00(bounds, rectF4);
                float f11 = rectF4.left;
                float f12 = rectF4.top;
                canvas2.translate(f11, f12);
                this.A0R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0R.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (this.A0g && this.A0Z != null) {
                PointF pointF = this.A0t;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0Z != null) {
                    float A0J2 = this.A04 + A0J() + this.A0C;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + A0J2;
                    } else {
                        pointF.x = ((float) bounds.right) - A0J2;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0v.A04;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF4.setEmpty();
                if (this.A0Z != null) {
                    float A0J3 = this.A04 + A0J() + this.A0C;
                    float A0K2 = this.A01 + A0K() + this.A0B;
                    int layoutDirection = getLayoutDirection();
                    float f13 = (float) bounds.left;
                    if (layoutDirection == 0) {
                        rectF4.left = f13 + A0J3;
                        f = ((float) bounds.right) - A0K2;
                    } else {
                        rectF4.left = f13 + A0K2;
                        f = ((float) bounds.right) - A0J3;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                C18007Vjj vjj = this.A0v;
                if (vjj.A00 != null) {
                    TextPaint textPaint2 = vjj.A04;
                    textPaint2.drawableState = getState();
                    vjj.A00.A03(this.A0p, textPaint2, vjj.A05);
                }
                TextPaint textPaint3 = vjj.A04;
                textPaint3.setTextAlign(align);
                int round = Math.round(vjj.A00(this.A0Z.toString()));
                int i3 = 0;
                boolean z = false;
                if (round > Math.round(rectF4.width())) {
                    z = true;
                    i3 = canvas2.save();
                    canvas2.clipRect(rectF4);
                }
                CharSequence charSequence = this.A0Z;
                if (z && this.A0V != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF4.width(), this.A0V);
                }
                canvas2.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (A05(this)) {
                rectF4.setEmpty();
                if (A05(this)) {
                    float f14 = this.A01 + this.A06;
                    if (getLayoutDirection() == 0) {
                        float f15 = ((float) bounds.right) - f14;
                        rectF4.right = f15;
                        rectF4.left = f15 - this.A07;
                    } else {
                        float f16 = ((float) bounds.left) + f14;
                        rectF4.left = f16;
                        rectF4.right = f16 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f17 = this.A07;
                    float f18 = exactCenterY - (f17 / 2.0f);
                    rectF4.top = f18;
                    rectF4.bottom = f18 + f17;
                }
                float f19 = rectF4.left;
                float f20 = rectF4.top;
                canvas2.translate(f19, f20);
                this.A0T.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0U.setBounds(this.A0T.getBounds());
                this.A0U.jumpToCurrentState();
                this.A0U.draw(canvas2);
                canvas2.translate(-f19, -f20);
            }
            if (this.A0D < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public final int getAlpha() {
        return this.A0D;
    }

    public final ColorFilter getColorFilter() {
        return this.A0P;
    }

    public final int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.A04 + A0J() + this.A0C + this.A0v.A00(this.A0Z.toString()) + this.A0B + A0K() + this.A01), this.A0H);
    }

    public final void getOutline(Outline outline) {
        Outline outline2 = outline;
        if (this.A0f) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0D) / 255.0f);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0M;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A0J;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0L;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        W0Q w0q = this.A0v.A00;
        if (w0q != null && (colorStateList = w0q.A0A) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0c && this.A0R != null && this.A0b) {
            return true;
        }
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0R;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0l;
        if (colorStateList5 == null || !colorStateList5.isStateful()) {
            return false;
        }
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.A0f) {
            super.onStateChange(iArr);
        }
        return A06(this, iArr, this.A0h);
    }

    public final void setAlpha(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.A0P != colorFilter) {
            this.A0P = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            C13990Tnq.A1B(this);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0m != mode) {
            this.A0m = mode;
            ColorStateList colorStateList = this.A0l;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.A0Q = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public UWU(Context context, AttributeSet attributeSet, int i) {
        super(new C297895sX(C297895sX.A01(context, attributeSet, i, 2132018519)));
        A0E(context);
        this.A0p = context;
        C18007Vjj vjj = new C18007Vjj(this);
        this.A0v = vjj;
        this.A0Z = "";
        vjj.A04.density = C13989Tnp.A03(context);
        int[] iArr = A0x;
        setState(iArr);
        if (!Arrays.equals(this.A0h, iArr)) {
            this.A0h = iArr;
            if (A05(this)) {
                A06(this, getState(), iArr);
            }
        }
        this.A0g = true;
        A0w.setTint(-1);
    }

    private void A00(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (A04() || A02()) {
            float f = this.A04 + this.A0A;
            if (this.A0e) {
                drawable = this.A0R;
            } else {
                drawable = this.A0S;
            }
            float f2 = this.A02;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.A0e) {
                drawable2 = this.A0R;
            } else {
                drawable2 = this.A0S;
            }
            float f5 = this.A02;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) C295305nv.A00(this.A0p, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r8.A0b == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r1 != r8.A0J()) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.UWU r8, int[] r9, int[] r10) {
        /*
            boolean r7 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A0M
            r4 = 0
            if (r1 == 0) goto L_0x013c
            int r0 = r8.A0G
            int r0 = r1.getColorForState(r9, r0)
        L_0x000f:
            int r2 = r8.A08(r0)
            int r0 = r8.A0G
            r6 = 1
            if (r0 == r2) goto L_0x001b
            r8.A0G = r2
            r7 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r8.A0J
            if (r1 == 0) goto L_0x0139
            int r0 = r8.A0E
            int r0 = r1.getColorForState(r9, r0)
        L_0x0025:
            int r1 = r8.A08(r0)
            int r0 = r8.A0E
            if (r0 == r1) goto L_0x0030
            r8.A0E = r1
            r7 = 1
        L_0x0030:
            int r2 = X.2eL.A05(r1, r2)
            int r0 = r8.A0i
            boolean r1 = X.JTQ.A1O(r0, r2)
            X.5sd r0 = r8.A00
            android.content.res.ColorStateList r0 = r0.A0B
            boolean r0 = X.DbW.A1a(r0)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x004f
            r8.A0i = r2
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r8.A0F(r0)
            r7 = 1
        L_0x004f:
            android.content.res.ColorStateList r1 = r8.A0L
            if (r1 == 0) goto L_0x0136
            int r0 = r8.A0F
            int r1 = r1.getColorForState(r9, r0)
        L_0x0059:
            int r0 = r8.A0F
            if (r0 == r1) goto L_0x0060
            r8.A0F = r1
            r7 = 1
        L_0x0060:
            X.Vjj r0 = r8.A0v
            X.W0Q r0 = r0.A00
            if (r0 == 0) goto L_0x0133
            android.content.res.ColorStateList r1 = r0.A0A
            if (r1 == 0) goto L_0x0133
            int r0 = r8.A0j
            int r1 = r1.getColorForState(r9, r0)
        L_0x0070:
            int r0 = r8.A0j
            if (r0 == r1) goto L_0x0077
            r8.A0j = r1
            r7 = 1
        L_0x0077:
            int[] r5 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r5 == 0) goto L_0x008d
            int r2 = r5.length
            r1 = 0
        L_0x0082:
            if (r1 >= r2) goto L_0x008d
            r0 = r5[r1]
            if (r0 != r3) goto L_0x012f
            boolean r0 = r8.A0b
            r2 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            boolean r0 = r8.A0e
            if (r0 == r2) goto L_0x00a6
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00a6
            float r1 = r8.A0J()
            r8.A0e = r2
            float r0 = r8.A0J()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 1
            r5 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            android.content.res.ColorStateList r1 = r8.A0l
            if (r1 == 0) goto L_0x012d
            int r0 = r8.A0k
            int r1 = r1.getColorForState(r9, r0)
        L_0x00b1:
            int r0 = r8.A0k
            if (r0 == r1) goto L_0x012b
            r8.A0k = r1
            android.content.res.ColorStateList r1 = r8.A0l
            android.graphics.PorterDuff$Mode r2 = r8.A0m
            if (r1 == 0) goto L_0x0129
            if (r2 == 0) goto L_0x0129
            int[] r0 = r8.getState()
            int r0 = r1.getColorForState(r0, r4)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r2)
        L_0x00cc:
            r8.A0Q = r1
        L_0x00ce:
            android.graphics.drawable.Drawable r0 = r8.A0S
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r0 = r8.A0S
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00df:
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r8.A0R
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00f0:
            android.graphics.drawable.Drawable r0 = r8.A0T
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x010d
            int r3 = r9.length
            int r2 = r10.length
            int r0 = r3 + r2
            int[] r1 = new int[r0]
            java.lang.System.arraycopy(r9, r4, r1, r4, r3)
            java.lang.System.arraycopy(r10, r4, r1, r3, r2)
            android.graphics.drawable.Drawable r0 = r8.A0T
            boolean r0 = r0.setState(r1)
            r6 = r6 | r0
        L_0x010d:
            android.graphics.drawable.Drawable r0 = r8.A0U
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x011e
            android.graphics.drawable.Drawable r0 = r8.A0U
            boolean r0 = r0.setState(r10)
            r6 = r6 | r0
        L_0x011e:
            if (r6 == 0) goto L_0x0123
            r8.invalidateSelf()
        L_0x0123:
            if (r5 == 0) goto L_0x0128
            r8.A0L()
        L_0x0128:
            return r6
        L_0x0129:
            r1 = 0
            goto L_0x00cc
        L_0x012b:
            r6 = r7
            goto L_0x00ce
        L_0x012d:
            r1 = 0
            goto L_0x00b1
        L_0x012f:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x0133:
            r1 = 0
            goto L_0x0070
        L_0x0136:
            r1 = 0
            goto L_0x0059
        L_0x0139:
            r0 = 0
            goto L_0x0025
        L_0x013c:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWU.A06(X.UWU, int[], int[]):boolean");
    }

    public final float A0J() {
        Drawable drawable;
        if (!A04() && !A02()) {
            return 0.0f;
        }
        float f = this.A0A;
        if (this.A0e) {
            drawable = this.A0R;
        } else {
            drawable = this.A0S;
        }
        float f2 = this.A02;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f + f2 + this.A09;
    }

    public final float A0K() {
        if (A05(this)) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public final void Dr7() {
        A0L();
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A04()) {
            onLayoutDirectionChanged |= this.A0S.setLayoutDirection(i);
        }
        if (A02()) {
            onLayoutDirectionChanged |= this.A0R.setLayoutDirection(i);
        }
        if (A05(this)) {
            onLayoutDirectionChanged |= this.A0T.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A04()) {
            onLevelChange |= this.A0S.setLevel(i);
        }
        if (A02()) {
            onLevelChange |= this.A0R.setLevel(i);
        }
        if (A05(this)) {
            onLevelChange |= this.A0T.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A04()) {
            visible |= this.A0S.setVisible(z, z2);
        }
        if (A02()) {
            visible |= this.A0R.setVisible(z, z2);
        }
        if (A05(this)) {
            visible |= this.A0T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
