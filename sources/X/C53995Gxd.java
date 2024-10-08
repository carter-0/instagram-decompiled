package X;

import android.content.Context;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxd  reason: case insensitive filesystem */
public final class C53995Gxd extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 0)
    public float A00;
    @Prop(optional = true, resType = C54606HKp.A04)
    @Comparable(type = 0)
    public float A01 = -1.0f;
    @Prop(optional = true, resType = C54606HKp.A04)
    @Comparable(type = 0)
    public float A02 = -1.0f;
    @Prop(optional = true, resType = C54606HKp.A04)
    @Comparable(type = 0)
    public float A03;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A04;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A05;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A06;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A07;

    public final boolean A0P() {
        return true;
    }

    public final boolean A18(C251263mp r5, boolean z) {
        if (this != r5) {
            if (r5 != null && getClass() == r5.getClass()) {
                C53995Gxd gxd = (C53995Gxd) r5;
                if (!(Float.compare(this.A00, gxd.A00) == 0 && this.A06 == gxd.A06 && this.A07 == gxd.A07 && Float.compare(-1.0f, -1.0f) == 0 && this.A04 == gxd.A04 && Float.compare(this.A01, gxd.A01) == 0 && Float.compare(this.A02, gxd.A02) == 0 && Float.compare(this.A03, gxd.A03) == 0 && this.A05 == gxd.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53995Gxd() {
        super("CardShadow");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
    }

    public final Object A0H(Context context) {
        return new C52796Gcn();
    }

    public final void A0t(2V1 r11, C70672Tq r12, Object obj) {
        C52796Gcn gcn = (C52796Gcn) obj;
        int i = this.A05;
        int i2 = this.A04;
        float f = this.A00;
        float f2 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        float f3 = this.A01;
        float f4 = this.A02;
        if (gcn.A07 != i) {
            gcn.A07 = i;
            gcn.A08 = true;
            gcn.invalidateSelf();
        }
        if (gcn.A06 != i2) {
            gcn.A06 = i2;
            gcn.A08 = true;
            gcn.invalidateSelf();
        }
        float f5 = (float) ((int) (f + 0.5f));
        if (gcn.A00 != f5) {
            gcn.A00 = f5;
            gcn.A08 = true;
            gcn.invalidateSelf();
        }
        if (f2 >= 0.0f) {
            int i3 = (int) (f2 + 0.5f);
            if (i3 % 2 == 1) {
                i3--;
            }
            float f6 = (float) i3;
            if (gcn.A05 != f6) {
                gcn.A05 = f6;
                gcn.A08 = true;
                gcn.invalidateSelf();
            }
            gcn.A0A = z;
            gcn.A09 = z2;
            gcn.A03 = f3;
            gcn.A04 = f4;
            if (-1.0f != gcn.A01) {
                gcn.A01 = -1.0f;
                gcn.A08 = true;
                gcn.invalidateSelf();
            }
            if (-1.0f != gcn.A02) {
                gcn.A02 = -1.0f;
                gcn.A08 = true;
                gcn.invalidateSelf();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("invalid shadow size");
    }
}
