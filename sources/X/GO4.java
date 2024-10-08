package X;

import android.content.Context;
import android.graphics.Paint;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

public final class GO4 extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 0)
    public float A00;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A01 = -1;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A02 = 0;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A03;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A04;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A05;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A06;
    public 2V5[] A07;

    public final boolean A0P() {
        return true;
    }

    public final boolean A18(C251263mp r5, boolean z) {
        if (this != r5) {
            if (r5 != null && getClass() == r5.getClass()) {
                GO4 go4 = (GO4) r5;
                if (!(this.A01 == go4.A01 && this.A02 == go4.A02 && Float.compare(this.A00, go4.A00) == 0 && this.A03 == go4.A03 && this.A04 == go4.A04 && this.A05 == go4.A05 && this.A06 == go4.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public GO4() {
        super("TransparencyEnabledCardClip");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
    }

    public final Object A0H(Context context) {
        return new GPA();
    }

    public final void A0t(2V1 r10, C70672Tq r11, Object obj) {
        GPA gpa = (GPA) obj;
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A03;
        boolean z4 = this.A04;
        Paint paint = gpa.A04;
        if (paint.getColor() != i) {
            paint.setColor(i);
            gpa.invalidateSelf();
        }
        gpa.A00(i2);
        float f2 = (float) ((int) (f + 0.5f));
        if (gpa.A00 != f2) {
            gpa.A03 = true;
            gpa.A00 = f2;
            gpa.invalidateSelf();
        }
        char c = 0;
        char c2 = 0;
        if (z2) {
            c2 = 2;
        }
        boolean z5 = c2 | z;
        char c3 = 0;
        if (z3) {
            c3 = 4;
        }
        boolean z6 = z5 | c3;
        if (z4) {
            c = 8;
        }
        gpa.A01(c | z6 ? 1 : 0);
    }

    public final void A0v(2V1 r4, C70672Tq r5, Object obj) {
        GPA gpa = (GPA) obj;
        float f = (float) ((int) (0.0f + 0.5f));
        if (gpa.A00 != f) {
            gpa.A03 = true;
            gpa.A00 = f;
            gpa.invalidateSelf();
        }
        Paint paint = gpa.A04;
        if (paint.getColor() != -1) {
            paint.setColor(-1);
            gpa.invalidateSelf();
        }
        gpa.A00(0);
        gpa.A02 = AnonymousClass7TE.A0V(1);
        gpa.A01(0);
    }

    public final 2V5[] A19() {
        return this.A07;
    }

    public final void A0h(int i, Object obj, Object obj2) {
    }
}
