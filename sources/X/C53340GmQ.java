package X;

import android.graphics.Bitmap;

/* renamed from: X.GmQ  reason: case insensitive filesystem */
public final class C53340GmQ extends AnonymousClass0T0 {
    public final double A00;
    public final Bitmap A01;
    public final C54607HKq A02;
    public final boolean A03;

    public C53340GmQ(Bitmap bitmap, C54607HKq hKq, double d, boolean z) {
        0qQ.A0B(hKq, 1);
        this.A02 = hKq;
        this.A01 = bitmap;
        this.A00 = d;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53340GmQ) {
                C53340GmQ gmQ = (C53340GmQ) obj;
                if (!(this.A02 == gmQ.A02 && 0qQ.A0K(this.A01, gmQ.A01) && Double.compare(this.A00, gmQ.A00) == 0 && this.A03 == gmQ.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, (((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(loadingState=");
        A1A.append(this.A02);
        A1A.append(", previewImage=");
        A1A.append(this.A01);
        A1A.append(", transcodeProgress=");
        A1A.append(this.A00);
        A1A.append(", forcePlaybackPause=");
        return G9t.A1C(A1A, this.A03);
    }
}
