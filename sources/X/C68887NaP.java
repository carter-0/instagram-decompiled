package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.NaP  reason: case insensitive filesystem */
public final class C68887NaP extends C69611Not {
    public final long A00;
    public final ImageUrl A01;
    public final ImageInfo A02;
    public final boolean A03;

    public C68887NaP(ImageUrl imageUrl, ImageInfo imageInfo, long j, boolean z) {
        0qQ.A0B(imageUrl, 2);
        this.A03 = z;
        this.A01 = imageUrl;
        this.A02 = imageInfo;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68887NaP) {
                C68887NaP naP = (C68887NaP) obj;
                if (this.A03 != naP.A03 || !0qQ.A0K(this.A01, naP.A01) || !0qQ.A0K(this.A02, naP.A02) || this.A00 != naP.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, C51965G9l.A05(this.A03)) + AnonymousClass7TG.A0C(this.A02)) * 31) + C51968G9o.A03(this.A00);
    }
}
