package X;

import com.instagram.common.typedurl.ImageUrl;

public final class NYP extends AnonymousClass7FV implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final AnonymousClass7FT A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYP) {
                NYP nyp = (NYP) obj;
                if (!0qQ.A0K(this.A00, nyp.A00) || !0qQ.A0K(this.A01, nyp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public NYP(ImageUrl imageUrl, AnonymousClass7FT r2) {
        super(r2);
        this.A00 = imageUrl;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
