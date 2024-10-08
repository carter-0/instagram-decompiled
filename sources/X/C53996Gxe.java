package X;

import android.content.Context;
import android.graphics.Paint;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxe  reason: case insensitive filesystem */
public final class C53996Gxe extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 0)
    public float A00;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A01 = -1;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A02;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A03;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A04;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A05;

    public final boolean A0P() {
        return true;
    }

    public final boolean A18(C251263mp r5, boolean z) {
        if (this != r5) {
            if (r5 != null && getClass() == r5.getClass()) {
                C53996Gxe gxe = (C53996Gxe) r5;
                if (!(this.A01 == gxe.A01 && Float.compare(this.A00, gxe.A00) == 0 && this.A02 == gxe.A02 && this.A03 == gxe.A03 && this.A04 == gxe.A04 && this.A05 == gxe.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53996Gxe() {
        super("CardClip");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
    }

    public final Object A0H(Context context) {
        return new C52787Gce();
    }

    public final void A0t(2V1 r9, C70672Tq r10, Object obj) {
        C52787Gce gce = (C52787Gce) obj;
        int i = this.A01;
        float f = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        Paint paint = gce.A03;
        if (paint.getColor() != i) {
            paint.setColor(i);
            gce.A02 = true;
            gce.invalidateSelf();
        }
        float f2 = (float) ((int) (f + 0.5f));
        if (gce.A00 != f2) {
            gce.A00 = f2;
            gce.A02 = true;
            gce.invalidateSelf();
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
        boolean z7 = c | z6;
        if (gce.A01 == false || !z7) {
            gce.A01 = z7 ? 1 : 0;
            gce.A02 = true;
            gce.invalidateSelf();
        }
    }

    public final void A0v(2V1 r4, C70672Tq r5, Object obj) {
        C52787Gce gce = (C52787Gce) obj;
        float f = (float) ((int) (0.0f + 0.5f));
        if (gce.A00 != f) {
            gce.A00 = f;
            gce.A02 = true;
            gce.invalidateSelf();
        }
        Paint paint = gce.A03;
        if (paint.getColor() != -1) {
            paint.setColor(-1);
            gce.A02 = true;
            gce.invalidateSelf();
        }
        gce.A01 = 0;
        gce.A02 = true;
        gce.invalidateSelf();
    }
}
