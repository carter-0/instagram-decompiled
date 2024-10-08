package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;

/* renamed from: X.JVb  reason: case insensitive filesystem */
public final class C59717JVb extends GradientDrawable implements C262414Dp {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public float[] A0D;
    public int[] A0E;

    public C59717JVb(GradientDrawable.Orientation orientation) {
        super(orientation, (int[]) null);
        this.A0E = null;
        this.A0A = -1;
        this.A06 = -1;
        this.A09 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59717JVb)) {
            return false;
        }
        C59717JVb jVb = (C59717JVb) obj;
        return this.A04 == jVb.A04 && 0qQ.A0K(this.A0B, jVb.A0B) && this.A00 == jVb.A00 && this.A05 == jVb.A05 && this.A01 == jVb.A01 && this.A07 == jVb.A07 && this.A0A == jVb.A0A && this.A06 == jVb.A06 && this.A09 == jVb.A09 && this.A03 == jVb.A03 && this.A02 == jVb.A02 && this.A08 == jVb.A08 && getOrientation() == jVb.getOrientation() && Arrays.equals(this.A0E, jVb.A0E) && Arrays.equals(this.A0D, jVb.A0D) && 0qQ.A0K(this.A0C, jVb.A0C);
    }

    public final void setStroke(int i, ColorStateList colorStateList, float f, float f2) {
        0qQ.A0B(colorStateList, 1);
        super.setStroke(i, colorStateList, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A0C = colorStateList;
    }

    public final boolean CSn(C262414Dp r2) {
        return Dba.A1Y(r2, this);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return Dba.A1Y(obj, this);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(new Object[]{getOrientation(), Integer.valueOf(this.A04), this.A0B, Float.valueOf(this.A00), Integer.valueOf(this.A05), Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A0A), Integer.valueOf(this.A06), Integer.valueOf(this.A09), Float.valueOf(this.A03), Float.valueOf(this.A02), Integer.valueOf(this.A08), this.A0C}) * 31) + Arrays.hashCode(this.A0E)) * 31) + Arrays.hashCode(this.A0D);
    }

    public final void setColor(int i) {
        super.setColor(i);
        this.A04 = i;
    }

    public final void setColors(int[] iArr) {
        super.setColors(iArr);
        this.A0E = iArr;
    }

    public final void setCornerRadii(float[] fArr) {
        super.setCornerRadii(fArr);
        this.A0D = fArr;
    }

    public final void setCornerRadius(float f) {
        super.setCornerRadius(f);
        this.A00 = f;
    }

    public final void setGradientRadius(float f) {
        super.setGradientRadius(f);
        this.A01 = f;
    }

    public final void setGradientType(int i) {
        super.setGradientType(i);
        this.A05 = i;
    }

    public final void setShape(int i) {
        super.setShape(i);
        this.A07 = i;
    }

    public final void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.A0A = i;
        this.A06 = i2;
    }

    public C59717JVb() {
        this(GradientDrawable.Orientation.TOP_BOTTOM);
    }

    public final void setColor(ColorStateList colorStateList) {
        super.setColor(colorStateList);
        this.A0B = colorStateList;
    }

    public final void setStroke(int i, int i2, float f, float f2) {
        super.setStroke(i, i2, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A08 = i2;
    }
}
