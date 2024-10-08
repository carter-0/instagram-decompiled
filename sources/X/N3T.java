package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N3T extends AnonymousClass0T0 {
    public final float A00;
    public final long A01 = -1;
    public final ImageUrl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3T) {
                N3T n3t = (N3T) obj;
                if (!(Float.compare(this.A00, n3t.A00) == 0 && 0qQ.A0K(this.A02, n3t.A02) && this.A01 == n3t.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public N3T(ImageUrl imageUrl, float f) {
        this.A00 = f;
        this.A02 = imageUrl;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, Float.floatToIntBits(this.A00) * 31) + C51968G9o.A03(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImageFields(aspectRatio=");
        A1A.append(this.A00);
        A1A.append(", url=");
        A1A.append(this.A02);
        A1A.append(", expiringAtMillis=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
