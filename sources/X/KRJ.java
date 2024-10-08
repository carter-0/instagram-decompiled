package X;

import com.instagram.common.gallery.Medium;

public final class KRJ extends C62812Kmo {
    public final Medium A00;
    public final AnonymousClass3Q2 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KRJ) {
                KRJ krj = (KRJ) obj;
                if (!0qQ.A0K(this.A00, krj.A00) || !0qQ.A0K(this.A01, krj.A01)) {
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

    public KRJ(Medium medium, AnonymousClass3Q2 r2) {
        this.A00 = medium;
        this.A01 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GalleryPhoto(medium=");
        A1A.append(this.A00);
        A1A.append(", pendingMedia=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
