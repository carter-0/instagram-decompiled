package X;

import com.instagram.common.typedurl.ImageUrl;

public final class GSI extends AnonymousClass0T0 implements C59641JRj {
    public final ImageUrl A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GSI) {
                GSI gsi = (GSI) obj;
                if (!0qQ.A0K(this.A00, gsi.A00) || !0qQ.A0K(this.A01, gsi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public GSI(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }
}
