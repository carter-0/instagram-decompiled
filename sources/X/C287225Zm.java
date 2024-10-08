package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.5Zm  reason: invalid class name and case insensitive filesystem */
public final class C287225Zm implements Alignment {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287225Zm) {
                C287225Zm r5 = (C287225Zm) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return 002.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
    }

    public final long AB3(AnonymousClass5Q8 r6, long j, long j2) {
        float f;
        float f2 = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float A002 = ((float) (C289005cr.A00(j2) - C289005cr.A00(j))) / 2.0f;
        if (r6 == AnonymousClass5Q8.Ltr) {
            f = this.A00;
        } else {
            f = -1.0f * this.A00;
        }
        return AnonymousClass5TW.A00(Math.round(f2 * (f + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
    }

    public C287225Zm(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
