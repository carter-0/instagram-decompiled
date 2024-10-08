package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.BitSet;

/* renamed from: X.3gE  reason: invalid class name and case insensitive filesystem */
public final class C247373gE extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A06)
    @Comparable(type = 13)
    public Drawable A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public ImageView.ScaleType A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A02 = true;

    public C247373gE() {
        super("Image");
    }

    public static C247393gG A00(2V1 r2) {
        return new C247393gG(r2, new C247373gE());
    }

    public final C251263mp A0b(2V1 r8) {
        Drawable drawable = this.A00;
        ImageView.ScaleType scaleType = this.A01;
        boolean z = this.A02;
        0qQ.A0B(r8, 0);
        if (!2Sa.usePrimitiveImage || !2Sa.enablePrimitiveMeasurementFix) {
            C247423gJ r4 = new C247423gJ(r8, new C247403gH());
            C247403gH r3 = r4.A01;
            r3.A00 = drawable;
            BitSet bitSet = r4.A02;
            bitSet.set(0);
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            r3.A01 = scaleType;
            r3.A02 = z;
            C244113af.A00(bitSet, r4.A03, 1);
            r4.A02();
            0qQ.A0A(r3);
            return r3;
        }
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        return new C53938Gwi(drawable, scaleType, z);
    }
}
