package X;

import java.util.Arrays;

/* renamed from: X.GjY  reason: case insensitive filesystem */
public final class C53162GjY extends C21288XSt {
    public final float[] A00;

    public C53162GjY(float[] fArr) {
        0qQ.A0B(fArr, 1);
        this.A00 = fArr;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53162GjY) && 0qQ.A0K(this.A00, ((C53162GjY) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return G9w.A0k("AiInputFloatArray(floatArray=", Arrays.toString(this.A00));
    }
}
