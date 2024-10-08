package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9ct  reason: invalid class name and case insensitive filesystem */
public final class C381979ct extends AnonymousClass0T0 implements B3Z {
    public final AnonymousClass8JL A00;
    public final ImageUrl A01;
    public final MusicAttributionConfig A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381979ct) {
                C381979ct r5 = (C381979ct) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final MusicAttributionConfig BUm() {
        return this.A02;
    }

    public final AnonymousClass8JL C2k() {
        return this.A00;
    }

    public final ImageUrl C73() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A02)));
    }

    public C381979ct(AnonymousClass8JL r1, ImageUrl imageUrl, MusicAttributionConfig musicAttributionConfig) {
        this.A02 = musicAttributionConfig;
        this.A00 = r1;
        this.A01 = imageUrl;
    }
}
