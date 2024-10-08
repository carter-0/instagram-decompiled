package X;

import com.instagram.api.schemas.MediaKitVisibility;

/* renamed from: X.JxK  reason: case insensitive filesystem */
public final class C61108JxK extends AnonymousClass0T0 implements MWJ {
    public final MediaKitVisibility A00;
    public final String A01;

    public C61108JxK(MediaKitVisibility mediaKitVisibility, String str) {
        0qQ.A0B(mediaKitVisibility, 2);
        this.A01 = str;
        this.A00 = mediaKitVisibility;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61108JxK) {
                C61108JxK jxK = (C61108JxK) obj;
                if (!0qQ.A0K(this.A01, jxK.A01) || this.A00 != jxK.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
