package X;

import java.util.Arrays;

/* renamed from: X.Gja  reason: case insensitive filesystem */
public final class C53164Gja extends C21289XSu {
    public final float[] A00;
    public final float[] A01;
    public final float[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53164Gja) {
                C53164Gja gja = (C53164Gja) obj;
                if (!0qQ.A0K(this.A01, gja.A01) || !0qQ.A0K(this.A02, gja.A02) || !0qQ.A0K(this.A00, gja.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float[] fArr = this.A01;
        int i = 0;
        int hashCode = (fArr == null ? 0 : Arrays.hashCode(fArr)) * 31;
        float[] fArr2 = this.A02;
        int hashCode2 = (hashCode + (fArr2 == null ? 0 : Arrays.hashCode(fArr2))) * 31;
        float[] fArr3 = this.A00;
        if (fArr3 != null) {
            i = Arrays.hashCode(fArr3);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return 002.A14("RetinaFaceOutputModel(headBBox=", Arrays.toString(this.A01), ", rotationMatrix=", Arrays.toString(this.A02), ", eulerAngles=", Arrays.toString(this.A00), ')');
    }

    public C53164Gja(float[] fArr, float[] fArr2, float[] fArr3) {
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = fArr3;
    }

    public C53164Gja() {
        this((float[]) null, (float[]) null, (float[]) null);
    }
}
