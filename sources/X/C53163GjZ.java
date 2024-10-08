package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.GjZ  reason: case insensitive filesystem */
public final class C53163GjZ extends C21289XSu {
    public final List A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53163GjZ) {
                C53163GjZ gjZ = (C53163GjZ) obj;
                if (!0qQ.A0K(this.A00, gjZ.A00) || !0qQ.A0K(this.A01, gjZ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        float[] fArr = this.A01;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return A0C + i;
    }

    public C53163GjZ(List list, float[] fArr) {
        this.A00 = list;
        this.A01 = fArr;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RetinaFaceFacialLandmarksOutputModel(facialLandmarks=");
        A1A.append(this.A00);
        A1A.append(", facialLandmarksScores=");
        return C51975G9x.A0i(Arrays.toString(this.A01), A1A);
    }

    public C53163GjZ() {
        this((List) null, (float[]) null);
    }
}
