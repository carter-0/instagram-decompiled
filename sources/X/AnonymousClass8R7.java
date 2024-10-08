package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8R7  reason: invalid class name */
public final class AnonymousClass8R7 {
    public final AnonymousClass0eM A00;
    public final UserSession A01;
    public final AnonymousClass80U A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(AnonymousClass8R8.A00);

    public final B3I A00() {
        AnonymousClass0eM r0;
        if (!2CC.A00(AnonymousClass05K.A04) || ((AnonymousClass80T) this.A02).A00.A00.ordinal() != 0) {
            r0 = this.A00;
        } else {
            r0 = this.A03;
        }
        return (B3I) r0.getValue();
    }

    public AnonymousClass8R7(UserSession userSession, AnonymousClass80U r4, C62320sa r5) {
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = AnonymousClass0eN.A01(new AnonymousClass9LC(r5, 23));
    }
}
