package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9cq  reason: invalid class name and case insensitive filesystem */
public final class C381949cq extends AnonymousClass0T0 implements AnonymousClass8IC {
    public final ImageUrl A00;
    public final MusicAttributionConfig A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381949cq) {
                C381949cq r5 = (C381949cq) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
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

    public C381949cq(ImageUrl imageUrl, MusicAttributionConfig musicAttributionConfig) {
        this.A00 = imageUrl;
        this.A01 = musicAttributionConfig;
    }
}
