package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NZv  reason: case insensitive filesystem */
public final class C68863NZv extends C69607Nop {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68863NZv) {
                C68863NZv nZv = (C68863NZv) obj;
                if (!0qQ.A0K(this.A01, nZv.A01) || this.A00 != nZv.A00 || this.A03 != nZv.A03 || !0qQ.A0K(this.A02, nZv.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, C51972G9s.A07(this.A00, AnonymousClass7TG.A0C(this.A01) * 31)) + AnonymousClass7TE.A0L(this.A02);
    }

    public C68863NZv(ImageUrl imageUrl, Integer num, long j, boolean z) {
        this.A01 = imageUrl;
        this.A00 = j;
        this.A03 = z;
        this.A02 = num;
    }
}
