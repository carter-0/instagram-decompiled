package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxb  reason: case insensitive filesystem */
public final class C53993Gxb extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A00;
    @Prop(optional = false, resType = C54606HKp.A04)
    @Comparable(type = 3)
    public int A01;

    public C53993Gxb() {
        super("Dot");
    }

    public final C251263mp A0b(2V1 r4) {
        int i = this.A01;
        GradientDrawable A0H = C51972G9s.A0H(1, this.A00);
        A0H.setSize(i, i);
        C247393gG A002 = C247373gE.A00(r4);
        A002.A0D(A0H);
        return A002.A0A();
    }

    public final Object[] A0W() {
        Integer A0k = C51967G9n.A0k();
        return new Object[]{A0k, A0k, A0k, A0k, Integer.valueOf(this.A00), Integer.valueOf(this.A01)};
    }
}
