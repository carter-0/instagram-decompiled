package X;

import com.instagram.android.R;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.MbC  reason: case insensitive filesystem */
public final class C66705MbC extends C69600Noi {
    public final int A00 = R.drawable.instagram_camera_pano_outline_24;
    public final int A01;
    public final DirectShareTarget A02;
    public final C254743sy A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66705MbC) {
                C66705MbC mbC = (C66705MbC) obj;
                if (!(this.A00 == mbC.A00 && this.A01 == mbC.A01 && 0qQ.A0K(this.A03, mbC.A03) && 0qQ.A0K(this.A02, mbC.A02) && this.A04 == mbC.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, ((this.A00 * 31) + this.A01) * 31)) + 891516874 + this.A04.intValue();
    }

    public C66705MbC(DirectShareTarget directShareTarget, C254743sy r3, Integer num, int i) {
        this.A01 = i;
        this.A03 = r3;
        this.A02 = directShareTarget;
        this.A04 = num;
    }
}
