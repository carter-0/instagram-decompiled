package X;

import com.instagram.api.schemas.MusicInfoImpl;

public final class B5X extends AnonymousClass0T0 implements DRH {
    public final MusicInfoImpl A00;
    public final String A01;

    public B5X(MusicInfoImpl musicInfoImpl, String str) {
        0qQ.A0B(musicInfoImpl, 2);
        this.A01 = str;
        this.A00 = musicInfoImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B5X) {
                B5X b5x = (B5X) obj;
                if (!0qQ.A0K(this.A01, b5x.A01) || !0qQ.A0K(this.A00, b5x.A00)) {
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
