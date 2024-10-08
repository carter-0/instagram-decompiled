package X;

import com.instagram.model.mediasize.GifUrlImpl;

public final class NYR extends AnonymousClass7FV implements AnonymousClass7FW {
    public final GifUrlImpl A00;
    public final String A01;
    public final AnonymousClass7FT A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYR(AnonymousClass7FT r2, GifUrlImpl gifUrlImpl, String str, boolean z) {
        super(r2);
        0qQ.A0B(gifUrlImpl, 1);
        this.A00 = gifUrlImpl;
        this.A01 = str;
        this.A02 = r2;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYR) {
                NYR nyr = (NYR) obj;
                if (!0qQ.A0K(this.A00, nyr.A00) || !0qQ.A0K(this.A01, nyr.A01) || !0qQ.A0K(this.A02, nyr.A02) || this.A03 != nyr.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
