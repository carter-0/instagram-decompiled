package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.instagram.android.R;

public final class W2N {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public C297895sX A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public final MaterialButton A0I;

    public static void A02(W2N w2n) {
        int i;
        C297875sV A002 = A00(w2n, false);
        C297875sV A003 = A00(w2n, true);
        if (A002 != null) {
            A002.A0H(w2n.A09, (float) w2n.A06);
            if (A003 != null) {
                float f = (float) w2n.A06;
                if (w2n.A0H) {
                    i = C298035sl.A01(w2n.A0I, R.attr.colorSurface);
                } else {
                    i = 0;
                }
                A003.A00.A04 = f;
                A003.invalidateSelf();
                A003.A0G(ColorStateList.valueOf(i));
            }
        }
    }

    public static C297875sV A00(W2N w2n, boolean z) {
        LayerDrawable layerDrawable = w2n.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C297875sV) ((LayerDrawable) ((DrawableWrapper) w2n.A0C.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public static void A01(W2N w2n) {
        int i;
        MaterialButton materialButton = w2n.A0I;
        C297875sV r6 = new C297875sV(w2n.A0D);
        r6.A0E(materialButton.getContext());
        r6.setTintList(w2n.A07);
        PorterDuff.Mode mode = w2n.A0A;
        if (mode != null) {
            r6.setTintMode(mode);
        }
        r6.A0H(w2n.A09, (float) w2n.A06);
        C297875sV r5 = new C297875sV(w2n.A0D);
        r5.setTint(0);
        float f = (float) w2n.A06;
        if (w2n.A0H) {
            i = C298035sl.A01(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        r5.A00.A04 = f;
        r5.invalidateSelf();
        r5.A0G(ColorStateList.valueOf(i));
        C297875sV r1 = new C297875sV(w2n.A0D);
        w2n.A0B = r1;
        r1.setTint(-1);
        ColorStateList colorStateList = w2n.A08;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, new InsetDrawable(new LayerDrawable(new Drawable[]{r5, r6}), w2n.A03, w2n.A05, w2n.A04, w2n.A02), w2n.A0B);
        w2n.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C297875sV A002 = A00(w2n, false);
        if (A002 != null) {
            A002.A0A((float) w2n.A01);
        }
    }

    public static void A03(W2N w2n, int i, int i2) {
        MaterialButton materialButton = w2n.A0I;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = w2n.A05;
        int i4 = w2n.A02;
        w2n.A02 = i2;
        w2n.A05 = i;
        if (!w2n.A0E) {
            A01(w2n);
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final C297885sW A04() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.A0C.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.A0C;
        if (numberOfLayers > 2) {
            drawable = layerDrawable2.getDrawable(2);
        } else {
            drawable = layerDrawable2.getDrawable(1);
        }
        return (C297885sW) drawable;
    }

    public final void A05(C297895sX r3) {
        this.A0D = r3;
        if (A00(this, false) != null) {
            A00(this, false).setShapeAppearanceModel(r3);
        }
        if (A00(this, true) != null) {
            A00(this, true).setShapeAppearanceModel(r3);
        }
        if (A04() != null) {
            A04().setShapeAppearanceModel(r3);
        }
    }

    public W2N(MaterialButton materialButton, C297895sX r3) {
        this.A0I = materialButton;
        this.A0D = r3;
    }
}
