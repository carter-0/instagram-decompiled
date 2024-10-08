package X;

import kotlin.Deprecated;

@Deprecated(message = "Are you sure you want to use this? Custom styles lead to inconsistent design. Consider using one of the preset styles.")
public final class GS6 extends AnonymousClass0T0 implements JSI {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GS6) {
                GS6 gs6 = (GS6) obj;
                if (!C289095d0.A01(this.A03, gs6.A03) || !C289095d0.A01(this.A02, gs6.A02) || !C289095d0.A01(this.A00, gs6.A00) || !C289095d0.A01(this.A01, gs6.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float AeL() {
        return this.A00;
    }

    public final float AeM() {
        return this.A01;
    }

    public final float AeN() {
        return this.A02;
    }

    public final float AeO() {
        return this.A03;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A03), this.A02), this.A00), this.A01);
    }

    public GS6(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
    }
}
