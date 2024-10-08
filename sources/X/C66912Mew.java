package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Mew  reason: case insensitive filesystem */
public final class C66912Mew {
    public final AnonymousClass0eK A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C73913Plo.A00(this, 39));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C73913Plo.A00(this, 40));
    public final UserSession A04;

    public C66912Mew(UserSession userSession, AnonymousClass0eK r3, AnonymousClass0eK r4) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final AnonymousClass7Z7 A00(DirectShareTarget directShareTarget) {
        AnonymousClass0eM r0;
        0qQ.A0B(directShareTarget, 0);
        boolean A08 = AnonymousClass6W3.A08(DbS.A0c(directShareTarget));
        boolean z = DbS.A0c(directShareTarget) instanceof AnonymousClass9HR;
        if (A08) {
            r0 = this.A02;
        } else if (z) {
            r0 = this.A03;
        } else {
            throw AnonymousClass7TE.A0z("Expected Direct or Msys derived DirectShareTarget");
        }
        return (AnonymousClass7Z7) AnonymousClass7TE.A14(r0);
    }
}
