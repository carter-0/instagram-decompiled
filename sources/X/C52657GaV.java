package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;

/* renamed from: X.GaV  reason: case insensitive filesystem */
public final class C52657GaV extends AnonymousClass0T0 implements JSB {
    public final int A00;
    public final ClipsCameraCommandAction A01;

    public C52657GaV(ClipsCameraCommandAction clipsCameraCommandAction, int i) {
        0qQ.A0B(clipsCameraCommandAction, 1);
        this.A01 = clipsCameraCommandAction;
        this.A00 = i;
    }

    public final C52657GaV F74() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52657GaV) {
                C52657GaV gaV = (C52657GaV) obj;
                if (!(this.A01 == gaV.A01 && this.A00 == gaV.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ClipsCameraCommandAction AYB() {
        return this.A01;
    }

    public final int B1y() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
