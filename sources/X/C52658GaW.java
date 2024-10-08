package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;

/* renamed from: X.GaW  reason: case insensitive filesystem */
public final class C52658GaW extends AnonymousClass0T0 implements JNG {
    public final 28D A00;
    public final ClipsCameraCommandAction A01;
    public final C2606046i A02;
    public final 1Xj A03;
    public final C53451Goj A04;

    public C52658GaW(28D r2, ClipsCameraCommandAction clipsCameraCommandAction, C53451Goj goj, C2606046i r5, 1Xj r6) {
        0qQ.A0B(clipsCameraCommandAction, 4);
        this.A04 = goj;
        this.A00 = r2;
        this.A03 = r6;
        this.A01 = clipsCameraCommandAction;
        this.A02 = r5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52658GaW) {
                C52658GaW gaW = (C52658GaW) obj;
                if (!0qQ.A0K(this.A04, gaW.A04) || this.A00 != gaW.A00 || !0qQ.A0K(this.A03, gaW.A03) || this.A01 != gaW.A01 || !0qQ.A0K(this.A02, gaW.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A04) * 31;
        return AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A00, A0C) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
