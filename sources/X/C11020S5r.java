package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.S5r  reason: case insensitive filesystem */
public final class C11020S5r {
    public final Bitmap A00;
    public final List A01;
    public final boolean A02;

    public C11020S5r(Bitmap bitmap, List list, boolean z) {
        0qQ.A0B(list, 2);
        this.A00 = bitmap;
        this.A01 = list;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11020S5r) {
                C11020S5r s5r = (C11020S5r) obj;
                if (!0qQ.A0K(this.A00, s5r.A00) || !0qQ.A0K(this.A01, s5r.A01) || this.A02 != s5r.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UploadEditInputData(maskBitmap=");
        A1A.append(this.A00);
        A1A.append(", outputPoints=");
        A1A.append(this.A01);
        A1A.append(", audioEnabled=");
        return G9t.A1C(A1A, this.A02);
    }
}
