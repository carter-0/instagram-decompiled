package X;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* renamed from: X.Gep  reason: case insensitive filesystem */
public final class C52915Gep extends C288195bW {
    public float[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52915Gep) {
                float[] fArr = this.A00;
                if (fArr == null) {
                    ColorFilter colorFilter = this.A00;
                    if (colorFilter instanceof ColorMatrixColorFilter) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
                        fArr = colorMatrix.getArray();
                        this.A00 = fArr;
                    } else {
                        throw AnonymousClass7TE.A0w("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
                    }
                }
                C52915Gep gep = (C52915Gep) obj;
                float[] fArr2 = gep.A00;
                if (fArr2 == null) {
                    ColorFilter colorFilter2 = gep.A00;
                    if (colorFilter2 instanceof ColorMatrixColorFilter) {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        ((ColorMatrixColorFilter) colorFilter2).getColorMatrix(colorMatrix2);
                        fArr2 = colorMatrix2.getArray();
                        gep.A00 = fArr2;
                    } else {
                        throw AnonymousClass7TE.A0w("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
                    }
                }
                if (!Arrays.equals(fArr, fArr2)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float[] fArr = this.A00;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String A0k;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.A00;
        if (fArr == null) {
            A0k = "null";
        } else {
            A0k = G9w.A0k("ColorMatrix(values=", Arrays.toString(fArr));
        }
        return AnonymousClass7TG.A0n(A0k, A1A);
    }
}
