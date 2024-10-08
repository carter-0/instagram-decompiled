package X;

import java.util.Locale;

/* renamed from: X.4P7  reason: invalid class name */
public final class AnonymousClass4P7 {
    public static final AnonymousClass4P7 A03 = new AnonymousClass4P7(1.0f, 1.0f);
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4P7 r5 = (AnonymousClass4P7) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.A01), Float.valueOf(this.A00)};
        return String.format(Locale.US, AnonymousClass000.A00(2411), objArr);
    }

    public AnonymousClass4P7(float f, float f2) {
        boolean z = true;
        C256703wD.A03(f > 0.0f);
        C256703wD.A03(f2 <= 0.0f ? false : z);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(f * 1000.0f);
    }
}
