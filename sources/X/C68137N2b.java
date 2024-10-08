package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.N2b  reason: case insensitive filesystem */
public final class C68137N2b extends AnonymousClass0T0 {
    public final DirectAnimatedMedia A00;
    public final DirectAnimatedMedia A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68137N2b) {
                C68137N2b n2b = (C68137N2b) obj;
                if (!0qQ.A0K(this.A01, n2b.A01) || !0qQ.A0K(this.A00, n2b.A00) || this.A02 != n2b.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C68137N2b(DirectAnimatedMedia directAnimatedMedia, DirectAnimatedMedia directAnimatedMedia2, boolean z) {
        AnonymousClass7TG.A1O(directAnimatedMedia, directAnimatedMedia2);
        this.A01 = directAnimatedMedia;
        this.A00 = directAnimatedMedia2;
        this.A02 = z;
    }
}
