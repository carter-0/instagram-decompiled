package X;

import android.graphics.Bitmap;

/* renamed from: X.Hss  reason: case insensitive filesystem */
public final class C56105Hss {
    public final int A00;
    public final Bitmap A01;
    public final C56146HtY A02;

    public C56105Hss(Bitmap bitmap, C56146HtY htY, int i) {
        0qQ.A0B(htY, 1);
        this.A02 = htY;
        this.A01 = bitmap;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56105Hss) {
                C56105Hss hss = (C56105Hss) obj;
                if (!0qQ.A0K(this.A02, hss.A02) || !0qQ.A0K(this.A01, hss.A01) || this.A00 != hss.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmuFlashGeneratedImage(generatedMedia=");
        A1A.append(this.A02);
        A1A.append(", bitmap=");
        A1A.append(this.A01);
        A1A.append(", instanceKey=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
