package X;

import com.instagram.api.schemas.LinkStickerType;

public final class UNC extends AnonymousClass0T0 implements X9w {
    public final LinkStickerType A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNC) {
                UNC unc = (UNC) obj;
                if (this.A00 != unc.A00 || !0qQ.A0K(this.A01, unc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public UNC(LinkStickerType linkStickerType, String str) {
        AnonymousClass7TG.A1O(linkStickerType, str);
        this.A00 = linkStickerType;
        this.A01 = str;
    }
}
