package X;

import android.graphics.Rect;

public final class S6R {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Rect A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6R) {
                S6R s6r = (S6R) obj;
                if (!(Float.compare(this.A00, s6r.A00) == 0 && Float.compare(this.A01, s6r.A01) == 0 && 0qQ.A0K(this.A04, s6r.A04) && this.A03 == s6r.A03 && this.A02 == s6r.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A01) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A03) * 31) + this.A02;
    }

    public S6R(Rect rect, float f, float f2, int i, int i2) {
        this.A00 = f;
        this.A01 = f2;
        this.A04 = rect;
        this.A03 = i;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DetectedFace(xAngle=");
        A1A.append(this.A00);
        A1A.append(", yAngle=");
        A1A.append(this.A01);
        A1A.append(", faceRect=");
        A1A.append(this.A04);
        A1A.append(", containerWidth=");
        A1A.append(this.A03);
        A1A.append(", containerHeight=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
