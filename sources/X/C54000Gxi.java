package X;

import android.widget.ImageView;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxi  reason: case insensitive filesystem */
public final class C54000Gxi extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A00;

    public C54000Gxi() {
        super("SolidColor");
    }

    public static C53616GrV A00(2V1 r2) {
        return new C53616GrV(r2, new C54000Gxi());
    }

    public final Object[] A0W() {
        return C51968G9o.A1Z(Float.valueOf(-1.0f), this.A00);
    }

    public final C251263mp A0b(2V1 r4) {
        int i = this.A00;
        C247393gG A002 = C247373gE.A00(r4);
        A002.A0E(ImageView.ScaleType.FIT_XY);
        A002.A0D(C51965G9l.A0D(i));
        return A002.A0A();
    }
}
