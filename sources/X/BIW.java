package X;

import com.instagram.common.typedurl.ImageUrl;

public final class BIW extends AnonymousClass0T0 implements C46221DRc {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIW) {
                BIW biw = (BIW) obj;
                if (!0qQ.A0K(this.A01, biw.A01) || !0qQ.A0K(this.A02, biw.A02) || !0qQ.A0K(this.A00, biw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BIW(ImageUrl imageUrl, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
    }
}
