package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9cw  reason: invalid class name and case insensitive filesystem */
public final class C382009cw extends AnonymousClass0T0 implements B3b {
    public final C382019cx A00;
    public final AnonymousClass8JL A01;
    public final ImageUrl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C382009cw) {
                C382009cw r5 = (C382009cw) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass8JL C2k() {
        return this.A01;
    }

    public final ImageUrl C73() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public C382009cw(AnonymousClass8JL r1, ImageUrl imageUrl, C382019cx r3) {
        AnonymousClass7TG.A1Q(r1, imageUrl);
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = imageUrl;
    }
}
