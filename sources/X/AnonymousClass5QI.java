package X;

import java.util.Arrays;

/* renamed from: X.5QI  reason: invalid class name */
public final class AnonymousClass5QI implements AnonymousClass5QJ {
    public final float[] A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AnonymousClass5QI)) {
                return false;
            }
            AnonymousClass5QI r4 = (AnonymousClass5QI) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final float AJw(float f) {
        return C289475de.A00(this.A01, this.A00, f);
    }

    public final float AK0(float f) {
        return C289475de.A00(this.A00, this.A01, f);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.A00);
        0qQ.A07(arrays);
        String arrays2 = Arrays.toString(this.A01);
        0qQ.A07(arrays2);
        return 002.A0v("FontScaleConverter{fromSpValues=", arrays, ", toDpValues=", arrays2, '}');
    }

    public AnonymousClass5QI(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.A00 = fArr;
            this.A01 = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }
}
