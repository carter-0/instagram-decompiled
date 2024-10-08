package X;

import android.graphics.Bitmap;

/* renamed from: X.Hsr  reason: case insensitive filesystem */
public final class C56104Hsr {
    public final Bitmap A00;
    public final C54651HMi A01;
    public final String A02;

    public C56104Hsr(Bitmap bitmap, C54651HMi hMi, String str) {
        0qQ.A0B(hMi, 1);
        this.A01 = hMi;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56104Hsr) {
                C56104Hsr hsr = (C56104Hsr) obj;
                if (this.A01 != hsr.A01 || !0qQ.A0K(this.A00, hsr.A00) || !0qQ.A0K(this.A02, hsr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MEmuPoseData(memuPose=");
        A1A.append(this.A01);
        A1A.append(", bitmap=");
        A1A.append(this.A00);
        A1A.append(", uploadHandle=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
