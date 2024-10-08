package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

public abstract class U4W extends FrameLayout {
    public static final View.OnTouchListener A07 = new C14649Tzv(0);
    public int A00;
    public ColorStateList A01;
    public X34 A02;
    public X1A A03;
    public PorterDuff.Mode A04;
    public final float A05;
    public final float A06;

    public U4W(Context context, AttributeSet attributeSet) {
        super(C297835sR.A00(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C297865sU.A0Y);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation((float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.A00 = obtainStyledAttributes.getInt(2, 0);
        this.A06 = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(C309286Xr.A01(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(C295305nv.A01(PorterDuff.Mode.SRC_IN, obtainStyledAttributes.getInt(5, -1)));
        this.A05 = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(A07);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C18108Vlc.A00(this.A06, C298035sl.A01(this, R.attr.colorSurface), C298035sl.A01(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.A01;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.A05;
    }

    public int getAnimationMode() {
        return this.A00;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A06;
    }

    public void setAnimationMode(int i) {
        this.A00 = i;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.A01 == null)) {
            drawable = drawable.mutate();
            drawable.setTintList(this.A01);
            drawable.setTintMode(this.A04);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.A04);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(X34 x34) {
        this.A02 = x34;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = A07;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(X1A x1a) {
        this.A03 = x1a;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1997438247);
        super.onAttachedToWindow();
        X34 x34 = this.A02;
        if (x34 != null) {
            x34.onViewAttachedToWindow(this);
        }
        requestApplyInsets();
        AnonymousClass0fD.A0D(-2104590064, A062);
    }

    public final void onDetachedFromWindow() {
        boolean z;
        int A062 = AnonymousClass0fD.A06(-422997081);
        super.onDetachedFromWindow();
        X34 x34 = this.A02;
        if (x34 != null) {
            WMV wmv = (WMV) x34;
            W1m w1m = wmv.A00;
            C18800W2n A002 = C18800W2n.A00();
            X1C x1c = w1m.A04;
            synchronized (A002.A03) {
                if (!C18800W2n.A03(x1c, A002)) {
                    VV6 vv6 = A002.A01;
                    if (vv6 == null || x1c == null || vv6.A02.get() != x1c) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                W1m.A0D.post(new C19970Wih(wmv));
            }
        }
        AnonymousClass0fD.A0D(1299515988, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        X1A x1a = this.A03;
        if (x1a != null) {
            W1m w1m = ((WMW) x1a).A00;
            w1m.A09.A03 = null;
            W1m.A01(w1m);
        }
    }

    public void setBackground(Drawable drawable) {
        throw AnonymousClass00P.createAndThrow();
    }
}
