package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gpj  reason: case insensitive filesystem */
public final class C53513Gpj extends AnonymousClass0T0 implements C59486JLk {
    public final float A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53513Gpj) {
                C53513Gpj gpj = (C53513Gpj) obj;
                if (!0qQ.A0K(this.A01, gpj.A01) || !C289095d0.A01(this.A00, gpj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TG.A0C(this.A01) * 31, this.A00);
    }

    public C53513Gpj(ImageUrl imageUrl, float f) {
        this.A01 = imageUrl;
        this.A00 = f;
    }
}
