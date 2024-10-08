package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Hsi  reason: case insensitive filesystem */
public final class C56095Hsi {
    public final FoaUserSession A00;
    public final C56568I1x A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56095Hsi) {
                C56095Hsi hsi = (C56095Hsi) obj;
                if (!0qQ.A0K(this.A00, hsi.A00) || !0qQ.A0K(this.A01, hsi.A01)) {
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

    public C56095Hsi(FoaUserSession foaUserSession, C56568I1x i1x) {
        this.A00 = foaUserSession;
        this.A01 = i1x;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIArgs(foaUserSession=");
        A1A.append(this.A00);
        A1A.append(", params=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
